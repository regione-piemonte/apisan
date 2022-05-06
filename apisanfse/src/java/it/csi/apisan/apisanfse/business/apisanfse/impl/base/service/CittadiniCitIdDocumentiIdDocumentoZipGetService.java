/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.apisanfse.impl.base.service;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanfse.business.apisanfse.impl.base.FseDelegheRESTBaseService;
import it.csi.apisan.apisanfse.util.ConstantsFse;
import it.csi.apisan.apisanfse.util.CostantiConsenso;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdDocumentiIdDocumentoZipGetService extends FseDelegheRESTBaseService {
	private String citId; 
	private String idDocumento; 
	private String codiceCl;
	private String archivioDocumentoIlec;
	
	@Value("${scaricoStudiNuovoUrl}")
	private String scaricoStudiUrl;	

	public CittadiniCitIdDocumentiIdDocumentoZipGetService(String citId, String idDocumento, String codiceCl, 
			String archivioDocumentoIlec, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.citId = citId; 
		this.idDocumento = idDocumento; 
		this.codiceCl = codiceCl;
		this.archivioDocumentoIlec = archivioDocumentoIlec;
	}



	@Override
	protected Response execute() {
		checkNotBlank(shibIdentitaCodiceFiscale, "Identita non valorizzata");
		checkNotBlank(citId, "Codice fiscale non valorizzato");
		checkCodiceFiscaleValido(citId);
		checkUtenteAutorizzatoOrDelegato(citId);
		checkNotBlank(idDocumento, "Identificativo del documento mancante");
		checkNotBlank(codiceCl, "Codice componente locale mancante");
		checkNotBlank(archivioDocumentoIlec, "Archivio documento Ilec mancante");
		
		String url = String.format(scaricoStudiUrl+"?cfRichiedente=%s&cfAssistito=%s&idDocumentoIlec=%s&codCL=%s&archivioDocumentoIlec=%s&codApplicazione=%s&codVerticale=%s&codRuolo=%s&pin=%s", 
				shibIdentitaCodiceFiscale, citId, idDocumento, codiceCl, archivioDocumentoIlec, ConstantsFse.WEBAPP_DMA, ConstantsFse.WEBAPP_DMA, CostantiConsenso.CODICE_REGIME, 
				ConstantsFse.PIN_CODE);
		
		log.info("execute", "Returning SEE_OTHER with scaricoStudi url:", url);

		return Response.status(Status.SEE_OTHER).header("Location", url).build();
	}

}
