/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanprof.business.apisanprof.impl.base.service;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanprof.business.apisanprof.impl.base.ProfRESTBaseService;
import it.csi.apisan.apisanprof.business.mapper.ProfiloMapper;
import it.csi.apisan.apisanprof.business.mapper.StudioMedicoMapper;
import it.csi.apisan.apisanprof.dto.apisanprof.Profilo;
import it.csi.apisan.apisanprof.dto.apisanprof.StudioMedico;
import it.csi.apisan.apisanprof.util.Constants;
import it.csi.aura.auraws.services.central.anagrafefind.AnagrafeFindSoap;
import it.csi.aura.auraws.services.central.anagrafefind.DatiAnagrafici;
import it.csi.aura.auraws.services.central.anagrafefind.DatiAnagraficiMsg;
import it.csi.aura.auraws.services.central.anagrafefind.FindProfiliAnagraficiRequest;
import it.csi.aura.auraws.services.central.anagrafefind.Message;
import it.csi.aura.auraws.services.central.anagrafesanitaria.AnagrafeSanitariaSoap;
import it.csi.aura.auraws.services.central.anagrafesanitaria.SoggettoAuraMsg;
import it.csi.def.opessanws.opessan.GetElencoStudi.Arg0;
import it.csi.def.opessanws.opessan.GetElencoStudiResponse.Return;
import it.csi.def.opessanws.opessan.IdentificativoProfilo;
import it.csi.def.opessanws.opessan.StudiMedici;


@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCfMedicoStudiMediciGet extends ProfRESTBaseService {
	@Autowired
	private AnagrafeFindSoap anagrafeFind;
	@Autowired
	private AnagrafeSanitariaSoap profiloSanitario;
	@Autowired
	private it.csi.services.opessanws.opessan.StudiMedici studiMedici;
	
	private String cf;
	
	
	public CittadiniCfMedicoStudiMediciGet(String shibIdentitaCodiceFiscale, String xRequestID, String xCodiceServizio,
			String cf, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(shibIdentitaCodiceFiscale, xRequestID, xCodiceServizio, securityContext, httpHeaders);
		// TODO Auto-generated constructor stub
		this.cf = cf;

	}
	@Override
	protected Response execute() {
		//checkCodiceFiscaleValido(cf);
		//checkUtenteAutorizzato(cf);
		FindProfiliAnagraficiRequest request = new FindProfiliAnagraficiRequest();
		request.setCodiceFiscale(cf);
		request.setFlagDecesso("0");
		request.setIdEnte(Constants.ID_ENTE);
		DatiAnagraficiMsg soap = anagrafeFind.findProfiliAnagrafici(request);
		
		if("0".equals(soap.getHeader().getCodiceRitorno())) {
			Stream<Message> str = soap.getFooter().getMessages().getMessage().stream();
			str.forEach( c -> System.out.println("Descrizione: " + c.getCodice() + " - " + c.getDescrizione()));
			throw toRestAuraAnagrafeFindException(soap.getFooter().getMessages().getMessage());
		}
		
		BigDecimal idAuraMedico = soap.getBody().getElencoProfili().getDatianagrafici().get(0).getIdProfiloAnagrafico();
		
		//seconda chiamata
		//SoggettoAuraNewMsg soggetto = profiloSanitario.getProfiloSanitarioNew(idAura.toString());
		for (Iterator<DatiAnagrafici> i = soap.getBody().getElencoProfili().getDatianagrafici().iterator(); i.hasNext();) {
			DatiAnagrafici dati = i.next();
			SoggettoAuraMsg soggetto = profiloSanitario.getProfiloSanitario("" + dati.getIdProfiloAnagrafico());
			if(soggetto.getBody().getInfoAnag().getDatiPrimari().getStatoProfiloAnagrafico().equalsIgnoreCase("1")) {
				//devo mappare
				idAuraMedico = soggetto.getBody().getInfoSan().getIdMedico();
				break;
			}
		}
		
		Arg0 requestOpessan = new Arg0();
		
		IdentificativoProfilo req = new IdentificativoProfilo();
		req.setIdAura(idAuraMedico);
		requestOpessan.setBody(req);
		
		Return ret = studiMedici.getElencoStudi(requestOpessan);
		
		//ATTENZIONE IL CODICE DI RITORNO DI OPESSAN DA SEMPRE 0 ANCHE QUANDO IL SERVIZIO RISPONDE CORRETTAMENTE
		/*if(ret.getHeader().getCodiceRitorno() == 0) {
			//scrivere il metodo sulla superclasse
			throw toRestOpessanStudiMediciException(ret.getFooter().getMessages().getMessage());
		}
		*/
		List<StudioMedico> studi = new StudioMedicoMapper().fromList(ret.getBody().getElencoStudiMedici());
		
		return Response.ok(studi).build();

	}


}
