/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.impl;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import it.csi.apisan.apisanscerev.business.apisanscerev.CittadiniApi;
import it.csi.apisan.apisanscerev.business.apisanscerev.impl.base.CittadiniCitIdTesserinoMedicoPdfGetService;
import it.csi.apisan.apisanscerev.business.apisanscerev.impl.base.ServiceExecutor;
import it.csi.apisan.apisanscerev.business.apisanscerev.impl.base.service.CittadiniCitIdAllegatoAllegatoIdGetSerice;
import it.csi.apisan.apisanscerev.business.apisanscerev.impl.base.service.CittadiniCitIdAssistenzaDeleteService;
import it.csi.apisan.apisanscerev.business.apisanscerev.impl.base.service.CittadiniCitIdCambioMedicoMedicoIdRichiestaPostService;
import it.csi.apisan.apisanscerev.business.apisanscerev.impl.base.service.CittadiniCitIdCambioMedicoRichiestaRichiestaIdPdfGetService;
import it.csi.apisan.apisanscerev.business.apisanscerev.impl.base.service.CittadiniCitIdCambioMedicoRichiestaRichiestaIdRettificaPostService;
import it.csi.apisan.apisanscerev.business.apisanscerev.impl.base.service.CittadiniCitIdCertificatoRevocaPdfGetService;
import it.csi.apisan.apisanscerev.business.apisanscerev.impl.base.service.CittadiniCitIdControlloAllegatiPostService;
import it.csi.apisan.apisanscerev.business.apisanscerev.impl.base.service.CittadiniCitIdControlloCombinazionePostService;
import it.csi.apisan.apisanscerev.business.apisanscerev.impl.base.service.CittadiniCitIdInfoGetService;
import it.csi.apisan.apisanscerev.business.apisanscerev.impl.base.service.CittadiniCitIdInfoRichiestaCambioRichiestaIdDeleteService;
import it.csi.apisan.apisanscerev.business.apisanscerev.impl.base.service.CittadiniCitIdMediciMonitoratiGetService;
import it.csi.apisan.apisanscerev.business.apisanscerev.impl.base.service.CittadiniCitIdMediciMonitoratiMedicoIdDeleteService;
import it.csi.apisan.apisanscerev.business.apisanscerev.impl.base.service.CittadiniCitIdMediciMonitoratiPostService;
import it.csi.apisan.apisanscerev.business.apisanscerev.impl.base.service.CittadiniCitIdRevocaMedicoPostService;
import it.csi.apisan.apisanscerev.business.apisanscerev.impl.base.service.CittadiniCitIdModuloDelegantePdfPostService;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelMonitoraMedico;
import it.csi.apisan.apisanscerev.dto.apisanscerev.Payload;
import it.csi.apisan.apisanscerev.dto.apisanscerev.PayloadCambioMedico;
import it.csi.apisan.apisanscerev.dto.apisanscerev.PayloadControlloAllegati;
import it.csi.apisan.apisanscerev.dto.apisanscerev.PayloadDelegante;
import it.csi.apisan.apisanscerev.dto.apisanscerev.PayloadRettificaMedico;
import it.csi.apisan.apisanscerev.dto.apisanscerev.PayloadRevocaMedico;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class CittadiniApiServiceImpl implements CittadiniApi {
	
	@Override
	public Response cittadiniCitIdAssistenzaDelete(String shibIdentitaCodiceFiscale,String xRequestId,String xForwardedFor,String xCodiceServizio,String citId,SecurityContext securityContext, HttpHeaders httpHeaders ) {

		return ServiceExecutor.execute(CittadiniCitIdAssistenzaDeleteService.class, citId,securityContext, httpHeaders);
	}

	@Override
	public Response cittadiniCitIdControlloCombinazionePost(String shibIdentitaCodiceFiscale,String xRequestId,String xForwardedFor,String xCodiceServizio,String citId,Payload payload,SecurityContext securityContext, HttpHeaders httpHeaders ) {
		// do some magic!
		return ServiceExecutor.execute(CittadiniCitIdControlloCombinazionePostService.class, citId, payload,securityContext, httpHeaders);
	}

	@Override
	public Response cittadiniCitIdInfoGet(String shibIdentitaCodiceFiscale,String xRequestId,String xForwardedFor,String xCodiceServizio,String citId,SecurityContext securityContext, HttpHeaders httpHeaders ) {
		// do some magic!
		return ServiceExecutor.execute(CittadiniCitIdInfoGetService.class, citId, securityContext,  httpHeaders);
	}


	@Override
	public Response cittadiniCitIdTesserinoMedicoPdfGet(String shibIdentitaCodiceFiscale,String xRequestId,String xForwardedFor,String xCodiceServizio,String citId,String contentDisposition,SecurityContext securityContext, HttpHeaders httpHeaders ) {
		// do some magic!
		return ServiceExecutor.execute(CittadiniCitIdTesserinoMedicoPdfGetService.class,  citId, contentDisposition, securityContext,  httpHeaders);
	}
	@Override
	public Response cittadiniCitIdCambioMedicoMedicoIdRichiestaPost(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, String medicoId, PayloadCambioMedico payload,
			SecurityContext securityContext, HttpHeaders httpHeaders) {

		return ServiceExecutor.execute(CittadiniCitIdCambioMedicoMedicoIdRichiestaPostService.class, citId, medicoId, payload,
				securityContext, httpHeaders);
	}
	@Override
	public Response cittadiniCitIdInfoRichiestaCambioRichiestaIdDelete(String shibIdentitaCodiceFiscale,
			String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, String richiestaId,
			SecurityContext securityContext, HttpHeaders httpHeaders) {

		return ServiceExecutor.execute(CittadiniCitIdInfoRichiestaCambioRichiestaIdDeleteService.class, citId, richiestaId,
				securityContext, httpHeaders);
	}
	@Override
	public Response cittadiniCitIdCambioMedicoRichiestaRichiestaIdRettificaPost(String shibIdentitaCodiceFiscale,
			String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, String richiestaId,
			PayloadRettificaMedico payloadRettificaMedico, SecurityContext securityContext, HttpHeaders httpHeaders) {

		return ServiceExecutor.execute(CittadiniCitIdCambioMedicoRichiestaRichiestaIdRettificaPostService.class, citId, richiestaId,
				payloadRettificaMedico,  securityContext,  httpHeaders);
	}

	
	public Response cittadiniCitIdCertificatoRevocaPdfGet(String shibIdentitaCodiceFiscale,String xRequestId,String xForwardedFor,String xCodiceServizio,String citId,String contentDisposition,SecurityContext securityContext, HttpHeaders httpHeaders ) {

		return ServiceExecutor.execute(CittadiniCitIdCertificatoRevocaPdfGetService.class, citId,contentDisposition,securityContext, httpHeaders);
	}
 
	@Override
	public Response cittadiniCitIdCambioMedicoRichiestaRichiestaIdPdfGet(String shibIdentitaCodiceFiscale,String xRequestId,String xForwardedFor,String xCodiceServizio,String citId,String richiestaId,String contentDisposition,SecurityContext securityContext, HttpHeaders httpHeaders ) {
		return ServiceExecutor.execute(CittadiniCitIdCambioMedicoRichiestaRichiestaIdPdfGetService.class, citId, richiestaId, contentDisposition,securityContext, httpHeaders);
	}
	
	@Override
	public Response cittadiniCitIdModuloDelegantePdfPost(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, PayloadDelegante payloadDelegante,
			String contentDisposition, SecurityContext securityContext, HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniCitIdModuloDelegantePdfPostService.class, citId,  payloadDelegante,
				 contentDisposition,  securityContext,  httpHeaders);
	}
     
	
	@Override
	public Response cittadiniCitIdControlloAllegatiPost(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId,
			PayloadControlloAllegati payloadControlloAllegati, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute(CittadiniCitIdControlloAllegatiPostService.class, citId,
				payloadControlloAllegati, securityContext,
				httpHeaders);
	}

	@Override
	public Response cittadiniCitIdMediciMonitoratiGet(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute(CittadiniCitIdMediciMonitoratiGetService.class, citId, securityContext, httpHeaders);
	}



	@Override
	public Response cittadiniCitIdMediciMonitoratiPost(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, ModelMonitoraMedico payload,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute(CittadiniCitIdMediciMonitoratiPostService.class, citId, payload,
				securityContext, httpHeaders);
	}

	@Override
	public Response cittadiniCitIdMediciMonitoratiMedicoIdAuraDelete(String shibIdentitaCodiceFiscale,
			String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, String medicoIdAura,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniCitIdMediciMonitoratiMedicoIdDeleteService.class, citId, medicoIdAura,
				securityContext, httpHeaders);
	}

	@Override
	public Response cittadiniCitIdRevocaMedicoPost(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, PayloadRevocaMedico payloadRevocaMedico,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute(CittadiniCitIdRevocaMedicoPostService.class, citId, payloadRevocaMedico, securityContext,  httpHeaders);
	}

	@Override
	public Response cittadiniCitIdAllegatoAllegatoIdGet(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, String allegatoId,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute(CittadiniCitIdAllegatoAllegatoIdGetSerice.class, citId, allegatoId,
				securityContext, httpHeaders);
	}	

	




}
