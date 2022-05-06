/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanaut.business.apisanaut.impl.base.service;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanaut.business.apisanaut.impl.base.AuraAutRESTBaseService;
import it.csi.apisan.apisanaut.business.mapper.DichiarazioneMapper;
import it.csi.apisan.apisanaut.dto.apisanaut.Cittadino;
import it.csi.apisan.apisanaut.dto.apisanaut.Dichiarazione;
import it.csi.apisan.apisanaut.exception.ErroreBuilder;
import it.csi.apisan.apisanaut.util.ApisanAutStatus;
import it.csi.deleghe.deleghebe.ws.DelegheCittadiniService;
import it.csi.deleghe.deleghebe.ws.msg.InserisciDichiarazione;
import it.csi.deleghe.deleghebe.ws.msg.InserisciDichiarazioneResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCfDichiarazioniPostService extends AuraAutRESTBaseService {
	
	@Autowired
	private DelegheCittadiniService delegheCittadiniService;
	
	private String cf;
	private Dichiarazione dichiarazione;
	

	public CittadiniCfDichiarazioniPostService(String shibIdentitaCodiceFiscale, String xRequestID,
			String xCodiceServizio, String cf, Dichiarazione dichiarazione, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		super(shibIdentitaCodiceFiscale, xRequestID, xCodiceServizio, securityContext, httpHeaders);
		this.cf = cf;
		this.dichiarazione = dichiarazione;
		
	}

	@Override
	protected Response execute() {
		checkUtenteAutorizzato(cf);
		checkCodiceFiscaleValido(cf);
		checkNotNull(dichiarazione, ErroreBuilder.from(ApisanAutStatus.PARAMETRO_NON_VALIDO, "dichiarazione").exception("dichiarazione is null"));
		checkNotNull(dichiarazione.getDettagli(), ErroreBuilder.from(ApisanAutStatus.PARAMETRO_NON_VALIDO, "dettagli dichiarazione").exception("dettagli dichiarazione is null"));
		//precedente vincolo da togliere
		//checkCondition(dichiarazione.getDettagli().size()>=2, ErroreBuilder.from(ApisanAutStatus.PARAMETRO_NON_VALIDO, "dettagli dichiarazione").exception("dettagli dichiarazione size must be >=2"));
		
		//devo inserire il doc
		Cittadino cittadino = findCittadino(cf);
		if(dichiarazione.getCittadino() != null ) {
			if(dichiarazione.getCittadino().getDocumento() != null) {
				cittadino.setDocumento(dichiarazione.getCittadino().getDocumento());
			}
			
		}
		dichiarazione.setCittadino(cittadino);
		
		dichiarazione.getDettagli().forEach(d -> {
			Cittadino genitoreCuratore = null;
			if(d.getGenitoreTutoreCuratore()!=null && cf.equals(d.getGenitoreTutoreCuratore().getCodiceFiscale())) {
				genitoreCuratore = new Cittadino();
				BeanUtils.copyProperties(cittadino, genitoreCuratore); 								
			} else {
				genitoreCuratore = findCittadino(d.getGenitoreTutoreCuratore().getCodiceFiscale());
			}
			genitoreCuratore.setDocumento(d.getGenitoreTutoreCuratore().getDocumento());
			d.setGenitoreTutoreCuratore(genitoreCuratore);

			Cittadino figlioTutelatoCurato = findCittadino(d.getFiglioTutelatoCurato().getCodiceFiscale());
			figlioTutelatoCurato.setDocumento(d.getFiglioTutelatoCurato().getDocumento());
			d.setFiglioTutelatoCurato(figlioTutelatoCurato);
		});

		
		InserisciDichiarazione req = new InserisciDichiarazione();
		req.setRichiedente(newRichiedente());
		
		req.setDichiarazione(new DichiarazioneMapper().to(dichiarazione));
		InserisciDichiarazioneResponse response = delegheCittadiniService.inserisciDichiarazioneService(req);
		checkSuccesso(response);
		
		return Response.ok().entity(new DichiarazioneMapper().from(response.getDichiarazione())).build();
	}

}
