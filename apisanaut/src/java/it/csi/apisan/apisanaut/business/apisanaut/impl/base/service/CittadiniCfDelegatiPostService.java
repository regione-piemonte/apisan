/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanaut.business.apisanaut.impl.base.service;

import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanaut.business.apisanaut.impl.base.AuraAutRESTBaseService;
import it.csi.apisan.apisanaut.business.mapper.CittadinoMapper;
import it.csi.apisan.apisanaut.business.mapper.DelegaCittadinoMapper;
import it.csi.apisan.apisanaut.dto.apisanaut.Cittadino;
import it.csi.apisan.apisanaut.dto.apisanaut.DelegaServizio;
import it.csi.apisan.apisanaut.exception.ErroreBuilder;
import it.csi.apisan.apisanaut.util.ApisanAutStatus;
import it.csi.deleghe.deleghebe.ws.DelegheCittadiniService;
import it.csi.deleghe.deleghebe.ws.model.DelegaCittadino;
import it.csi.deleghe.deleghebe.ws.msg.SaveDelegati;
import it.csi.deleghe.deleghebe.ws.msg.SaveDelegatiResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCfDelegatiPostService extends AuraAutRESTBaseService {
	
	@Autowired
	private DelegheCittadiniService delegheCittadiniService;
	
	private String cf;
	private List<it.csi.apisan.apisanaut.dto.apisanaut.DelegaCittadino> delegati;

	public CittadiniCfDelegatiPostService(String shibIdentitaCodiceFiscale, String xRequestID, String xCodiceServizio,
			 String cf, List<it.csi.apisan.apisanaut.dto.apisanaut.DelegaCittadino> delegati, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		super(shibIdentitaCodiceFiscale, xRequestID, xCodiceServizio, securityContext, httpHeaders);
		this.cf = cf;
		this.delegati = delegati;
	}

	@Override
	protected Response execute() {
		checkUtenteAutorizzato(cf);
		checkCodiceFiscaleValido(cf);
		checkTipoDeleghe();
		
		Cittadino cittadino = findCittadino(cf);
		
		SaveDelegati reqSD = new SaveDelegati();
		reqSD.setRichiedente(newRichiedente());
		reqSD.setCittadinoDelegante(new CittadinoMapper().to(cittadino));
		
		

		List<DelegaCittadino> d = new DelegaCittadinoMapper().toList(delegati);
		
		//devo portare il tipo delega a fattor comune
		for(DelegaCittadino delTmp : d) {
			String tipoDelega = delTmp.getDeleghe().get(0).getTipoDelega();
			delTmp.setTipoDelega(tipoDelega);
		}
		
		reqSD.setDelegati(d);

		
		
		SaveDelegatiResponse sdRes = delegheCittadiniService.saveDelegatiService(reqSD);
		checkSuccesso(sdRes);
		
		return Response.status(201).type(MediaType.APPLICATION_JSON).entity(new DelegaCittadinoMapper().fromList(sdRes.getDelegati())).build();
	}

	
	private void checkTipoDeleghe() {
		
		for(it.csi.apisan.apisanaut.dto.apisanaut.DelegaCittadino delegaCittTmp : delegati) {
			String tipodelega = delegaCittTmp.getDeleghe().get(0).getTipoDelega();
			for(DelegaServizio servizioTmp : delegaCittTmp.getDeleghe()) {
				checkCondition( servizioTmp.getTipoDelega().equals(tipodelega), ErroreBuilder.from(ApisanAutStatus.PARAMETRO_NON_VALIDO).dettaglio("TIPO DELEGA", servizioTmp.getTipoDelega()).exception()); 
			}
		}
		
	}
}
