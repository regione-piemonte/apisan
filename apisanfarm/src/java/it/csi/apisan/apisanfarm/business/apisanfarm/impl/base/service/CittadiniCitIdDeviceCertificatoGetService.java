/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfarm.business.apisanfarm.impl.base.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.core.Response.Status;
import javax.xml.ws.Holder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanfarm.business.apisanfarm.impl.base.FarmRESTBaseService;
import it.csi.apisan.apisanfarm.business.apisanfarm.mapper.ModelDeviceCertificatoCertificazioneTypeDeviceMapper;
import it.csi.apisan.apisanfarm.business.integration.dao.ApisanFarmDErroreDao;
import it.csi.apisan.apisanfarm.dto.apisanfarm.ErroreDettaglio;
import it.csi.apisan.apisanfarm.dto.apisanfarm.ModelDeviceCertificato;
import it.csi.apisan.apisanfarm.exception.ErroreBuilder;
import it.csi.apisan.apisanfarm.exception.ErroreRESTException;
import it.csi.apisan.apisanfarm.util.ConstantsFarm;
import it.csi.dma.farmab.interfacews.msg.getdevicecertificato.CertificazioneType;
import it.csi.dma.farmab.interfacews.msg.getdevicecertificato.ElencoErroriType;
import it.csi.dma.farmab.interfacews.msg.getdevicecertificato.Errore;
import it.csi.dma.farmab.interfacews.msg.getdevicecertificato.GetDeviceCertificatoService;
import it.csi.dma.farmab.interfacews.msg.getdevicecertificato.Richiedente;
import it.csi.dma.farmab.interfacews.msg.getdevicecertificato.TipoCodice;
import it.csi.dma.farmab.interfacews.msg.getelencofarmacieabituali.ElencoFarmacieType;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdDeviceCertificatoGetService extends FarmRESTBaseService {
	private String citId;
	private String codiceVerticaleDelega;
	
	@Autowired
	GetDeviceCertificatoService service;
	
	@Autowired
	ApisanFarmDErroreDao erroreDao;
	
	public CittadiniCitIdDeviceCertificatoGetService(String citId, String codiceVerticaleDelega, SecurityContext securityContext,
			HttpHeaders httpHeaders, HttpServletRequest httpRequest) {
		super(securityContext, httpHeaders, httpRequest);
		this.citId = citId;
		this.codiceVerticaleDelega = codiceVerticaleDelega; 
	}

	@Override
	protected Response execute() {
		checkNotBlank(xCodiceServizio, "Impostare il codice del servizio");
		checkNotBlank(shibIdentitaCodiceFiscale, "Impostare identita");
		checkNotBlank(xRequestID, "Impostare xrequest id");
		checkNotBlank(xForwardedFor, "Impostare forwarded for");
		checkNotBlank(citId, "Impostare citId");
		
		Holder<String> esito = new Holder<String>();
		Holder<ElencoErroriType> elencoErrori = new Holder<ElencoErroriType>();
		Holder<ElencoFarmacieType> farmacieAbituali = new Holder<ElencoFarmacieType>();		
		Holder<java.lang.String> statoCertificazione = new Holder<String>();
	    Holder<CertificazioneType> datiCertificazione = new Holder<CertificazioneType>();		
		
		service.getDeviceCertificato(createnewRichiedente(), citId, esito, elencoErrori, statoCertificazione, datiCertificazione);
		
		checkSuccesso(esito, elencoErrori, CittadiniCitIdDeviceCertificatoGetService.class);
		
		if(statoCertificazione != null && ConstantsFarm.NON_CERT.equalsIgnoreCase(statoCertificazione.value)) {
			throw ErroreBuilder.from(Status.NOT_FOUND).title("DEVICE NON TROVATO").exception();
		}
		
		ModelDeviceCertificato res = new ModelDeviceCertificatoCertificazioneTypeDeviceMapper().from(datiCertificazione.value);
		
		
		return Response.ok().entity(res).build();
	}
	
	
	
	private Richiedente createnewRichiedente() {
		Richiedente rich = new Richiedente();
		TipoCodice appVerticale = new TipoCodice();
		appVerticale.setCodice(codiceVerticaleDelega);
		rich.setApplicativoVerticale(appVerticale);
		
		TipoCodice applicazione = new TipoCodice();
		applicazione.setCodice(xCodiceServizio);
		rich.setApplicazione(applicazione);
		
		rich.setCodiceFiscale(shibIdentitaCodiceFiscale);
		rich.setIp(xForwardedFor);
		rich.setNumeroTransazione(xRequestID);
		TipoCodice ruolo = new TipoCodice();		
		ruolo.setCodice(ConstantsFarm.RUOLO);
		rich.setRuolo(ruolo);
		
		return rich;
	}
	
	protected void checkSuccesso(Holder<String> esito, Holder<ElencoErroriType> errori, Class<?> methodName) {
		
		if (!ConstantsFarm.SUCCESSO.equals(esito.value) ) {
			ElencoErroriType elencoErrori = errori.value;
			if (elencoErrori != null && elencoErrori.getErrore() != null && elencoErrori.getErrore().size() > 0) {
				log.error(methodName.getName(), "Risposta dal servizio %s andata in errore con codice $s. Errore: %s",
						methodName);
				List<ErroreDettaglio> listaDettagli = elencoErrori.getErrore().stream().map( err -> {
					ErroreDettaglio d = new ErroreDettaglio();
					d.setChiave(err.getCodice());
					d.setValore(err.getDescrizione());
					return d;
				}).collect(Collectors.toList()) ;
				
				 it.csi.apisan.apisanfarm.dto.apisanfarm.Errore errorePres =  erroreDao.getMappingErrore(listaDettagli);
				 throw new ErroreRESTException(errorePres);
			}else {
				throw ErroreBuilder.from(502, methodName.getName()).exception();
			}
		}
	}
	
	protected ErroreRESTException toErroreRESTException(ElencoErroriType elencoErrori) {
		String title = "Errore esecuzione servizio " + this.getClass().getSimpleName();
		List<Errore> errori = elencoErrori.getErrore();
		
		
		return ErroreBuilder.from(502, errori.get(0).getCodice()).title(title).dettagli(errori, elEr -> {
			ErroreDettaglio d = new ErroreDettaglio();
			d.setChiave(elEr.getCodice());
			d.setValore(elEr.getDescrizione());
			return d;
		}).exception(errori.get(0).getDescrizione());
		

		
	}

}
