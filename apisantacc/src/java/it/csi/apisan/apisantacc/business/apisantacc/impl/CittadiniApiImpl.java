/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.apisantacc.impl;

import java.math.BigDecimal;
import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import it.csi.apisan.apisantacc.business.apisantacc.CittadiniApi;
import it.csi.apisan.apisantacc.business.apisantacc.impl.base.ServiceExecutor;
import it.csi.apisan.apisantacc.business.apisantacc.impl.base.service.CittadiniCitIdTaccuiniTaccuinoIdContattiStruttureGetService;
import it.csi.apisan.apisantacc.business.apisantacc.impl.base.service.CittadiniCitIdTaccuiniTaccuinoIdContattiStrutturePostService;
import it.csi.apisan.apisantacc.business.apisantacc.impl.base.service.CittadiniCitIdTaccuiniTaccuinoIdDieteDietaIdDeleteService;
import it.csi.apisan.apisantacc.business.apisantacc.impl.base.service.CittadiniCitIdTaccuiniTaccuinoIdDieteGetService;
import it.csi.apisan.apisantacc.business.apisantacc.impl.base.service.CittadiniCitIdTaccuiniTaccuinoIdDietePostService;
import it.csi.apisan.apisantacc.business.apisantacc.impl.base.service.CittadiniCitIdTaccuiniTaccuinoIdDoloriBulkDeletePostService;
import it.csi.apisan.apisantacc.business.apisantacc.impl.base.service.CittadiniCitIdTaccuiniTaccuinoIdDoloriGetService;
import it.csi.apisan.apisantacc.business.apisantacc.impl.base.service.CittadiniCitIdTaccuiniTaccuinoIdDoloriPostService;
import it.csi.apisan.apisantacc.business.apisantacc.impl.base.service.CittadiniCitIdTaccuiniTaccuinoIdEventiEventoIdDeleteService;
import it.csi.apisan.apisantacc.business.apisantacc.impl.base.service.CittadiniCitIdTaccuiniTaccuinoIdEventiGetService;
import it.csi.apisan.apisantacc.business.apisantacc.impl.base.service.CittadiniCitIdTaccuiniTaccuinoIdEventiPostService;
import it.csi.apisan.apisantacc.business.apisantacc.impl.base.service.CittadiniCitIdTaccuiniTaccuinoIdFarmaciFarmacoIdDeleteService;
import it.csi.apisan.apisantacc.business.apisantacc.impl.base.service.CittadiniCitIdTaccuiniTaccuinoIdFarmaciGetService;
import it.csi.apisan.apisantacc.business.apisantacc.impl.base.service.CittadiniCitIdTaccuiniTaccuinoIdFarmaciPostService;
import it.csi.apisan.apisantacc.business.apisantacc.impl.base.service.CittadiniCitIdTaccuiniTaccuinoIdNotaGeneralePutService;
import it.csi.apisan.apisantacc.business.apisantacc.impl.base.service.CittadiniCitIdTaccuiniTaccuinoIdOscuramentoPutService;
import it.csi.apisan.apisantacc.business.apisantacc.impl.base.service.CittadiniCitIdTaccuiniTaccuinoIdPreferenzePutService;
import it.csi.apisan.apisantacc.business.apisantacc.impl.base.service.CittadiniCitIdTaccuiniTaccuinoIdSintomiGetService;
import it.csi.apisan.apisantacc.business.apisantacc.impl.base.service.CittadiniCitIdTaccuiniTaccuinoIdSintomiPostService;
import it.csi.apisan.apisantacc.business.apisantacc.impl.base.service.CittadiniCitIdTaccuinoGetService;
import it.csi.apisan.apisantacc.business.apisantacc.impl.base.service.CittadiniCitIdTaccuinoTaccuinoIdContattiStruttureBulkDeletePostService;
import it.csi.apisan.apisantacc.business.apisantacc.impl.base.service.CittadiniCitIdTaccuinoTaccuinoIdRilevazioniBulkDeletePostService;
import it.csi.apisan.apisantacc.business.apisantacc.impl.base.service.CittadiniCitIdTaccuinoTaccuinoIdRilevazioniGetService;
import it.csi.apisan.apisantacc.business.apisantacc.impl.base.service.CittadiniCitIdTaccuinoTaccuinoIdRilevazioniPostService;
import it.csi.apisan.apisantacc.business.apisantacc.impl.base.service.CittadiniCitIdTaccuinoTaccuinoIdSintomiBulkDeletePostService;
import it.csi.apisan.apisantacc.dto.apisantacc.PayloadContattoStrutturaNuovo;
import it.csi.apisan.apisantacc.dto.apisantacc.PayloadDietaNuovo;
import it.csi.apisan.apisantacc.dto.apisantacc.PayloadDoloreNuovo;
import it.csi.apisan.apisantacc.dto.apisantacc.PayloadEventoNuovo;
import it.csi.apisan.apisantacc.dto.apisantacc.PayloadFarmacoNuovo;
import it.csi.apisan.apisantacc.dto.apisantacc.PayloadNoteGeneraliModifica;
import it.csi.apisan.apisantacc.dto.apisantacc.PayloadOscuratoModifica;
import it.csi.apisan.apisantacc.dto.apisantacc.PayloadPreferenzaModifica;
import it.csi.apisan.apisantacc.dto.apisantacc.PayloadRilevazioniNuovo;
import it.csi.apisan.apisantacc.dto.apisantacc.PayloadSintomoNuovo;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class CittadiniApiImpl implements CittadiniApi{

	@Override
	public Response cittadiniCitIdTaccuiniTaccuinoIdContattiStruttureGet(String shibIdentitaCodiceFiscale,
			String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, Long taccuinoId,
			Integer limit, Integer offset, String ordinamento, String da, String a, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniCitIdTaccuiniTaccuinoIdContattiStruttureGetService.class, shibIdentitaCodiceFiscale, xRequestId,
				 xForwardedFor,  xCodiceServizio, citId,  taccuinoId,  limit,
				 offset,  ordinamento,  da,  a,  securityContext,
				 httpHeaders);
	}

	@Override
	public Response cittadiniCitIdTaccuiniTaccuinoIdContattiStrutturePost(String shibIdentitaCodiceFiscale,
			String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, Long taccuinoId,
			PayloadContattoStrutturaNuovo payloadContattoStrutturaNuovo, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniCitIdTaccuiniTaccuinoIdContattiStrutturePostService.class, shibIdentitaCodiceFiscale,
			xRequestId, xForwardedFor, xCodiceServizio, citId, taccuinoId,
			payloadContattoStrutturaNuovo, securityContext,
			httpHeaders);
	}

	@Override
	public Response cittadiniCitIdTaccuiniTaccuinoIdDieteGet(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, Long taccuinoId, Integer limit,
			Integer offset, String ordinamento, String da, String a, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute(CittadiniCitIdTaccuiniTaccuinoIdDieteGetService.class,  citId, taccuinoId, limit,
				offset, ordinamento,  da,  a, securityContext,
				httpHeaders);
	}

	@Override
	public Response cittadiniCitIdTaccuiniTaccuinoIdDietePost(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, Long taccuinoId,
			PayloadDietaNuovo payloadDietaNuovo, SecurityContext securityContext, HttpHeaders httpHeaders) {

		return ServiceExecutor.execute(CittadiniCitIdTaccuiniTaccuinoIdDietePostService.class, shibIdentitaCodiceFiscale, xRequestId,
			xForwardedFor, xCodiceServizio, citId, taccuinoId,
			payloadDietaNuovo, securityContext, httpHeaders);
	}

	@Override
	public Response cittadiniCitIdTaccuiniTaccuinoIdDoloriBulkDeletePost(String shibIdentitaCodiceFiscale,
			String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, Long taccuinoId,
			List<BigDecimal> payloadDoloreEliminaMassiva, SecurityContext securityContext, HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniCitIdTaccuiniTaccuinoIdDoloriBulkDeletePostService.class, shibIdentitaCodiceFiscale,
				xRequestId, xForwardedFor, xCodiceServizio, citId, taccuinoId,
				payloadDoloreEliminaMassiva, securityContext, httpHeaders);		
	}

	@Override
	public Response cittadiniCitIdTaccuiniTaccuinoIdDoloriGet(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, Long taccuinoId, Integer limit,
			Integer offset, String ordinamento, String da, String a, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniCitIdTaccuiniTaccuinoIdDoloriGetService.class,  citId, taccuinoId, limit,
				offset, ordinamento,  da,  a, securityContext,
				httpHeaders);
	}

	@Override
	public Response cittadiniCitIdTaccuiniTaccuinoIdDoloriPost(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, Long taccuinoId,
			PayloadDoloreNuovo payloadDoloreNuovo, SecurityContext securityContext, HttpHeaders httpHeaders) {

		return ServiceExecutor.execute(CittadiniCitIdTaccuiniTaccuinoIdDoloriPostService.class, shibIdentitaCodiceFiscale, xRequestId,
				xForwardedFor, xCodiceServizio, citId, taccuinoId,
				payloadDoloreNuovo, securityContext, httpHeaders);		
	}

	

	@Override
	public Response cittadiniCitIdTaccuiniTaccuinoIdEventiGet(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, Long taccuinoId, Integer limit,
			Integer offset, String ordinamento, String da, String a, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniCitIdTaccuiniTaccuinoIdEventiGetService.class, shibIdentitaCodiceFiscale, xRequestId,
				 xForwardedFor,  xCodiceServizio, citId,  taccuinoId,  limit,
				 offset,  ordinamento,  da,  a,  securityContext,
				 httpHeaders);
	}

	@Override
	public Response cittadiniCitIdTaccuiniTaccuinoIdEventiPost(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, Long taccuinoId,
			PayloadEventoNuovo payloadEventoNuovo, SecurityContext securityContext, HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniCitIdTaccuiniTaccuinoIdEventiPostService.class, shibIdentitaCodiceFiscale, xRequestId,
				xForwardedFor, xCodiceServizio, citId, taccuinoId,
				payloadEventoNuovo, securityContext, httpHeaders);
	}

	

	@Override
	public Response cittadiniCitIdTaccuiniTaccuinoIdFarmaciGet(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, Long taccuinoId, Integer limit,
			Integer offset, String ordinamento, String da, String a, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute(CittadiniCitIdTaccuiniTaccuinoIdFarmaciGetService.class, shibIdentitaCodiceFiscale, xRequestId,
				 xForwardedFor,  xCodiceServizio, citId,  taccuinoId,  limit,
				 offset,  ordinamento,  da,  a,  securityContext,
				 httpHeaders);
	}

	@Override
	public Response cittadiniCitIdTaccuiniTaccuinoIdFarmaciPost(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, Long taccuinoId,
			PayloadFarmacoNuovo payloadFarmacoNuovo, SecurityContext securityContext, HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniCitIdTaccuiniTaccuinoIdFarmaciPostService.class, shibIdentitaCodiceFiscale, xRequestId,
				xForwardedFor, xCodiceServizio, citId, taccuinoId,
				payloadFarmacoNuovo, securityContext, httpHeaders);
	}

	@Override
	public Response cittadiniCitIdTaccuiniTaccuinoIdNoteGeneraliPut(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, Long taccuinoId,
			PayloadNoteGeneraliModifica payloadNoteGeneraliModifica, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniCitIdTaccuiniTaccuinoIdNotaGeneralePutService.class, shibIdentitaCodiceFiscale,
				xRequestId, xForwardedFor, xCodiceServizio, citId, taccuinoId,
				payloadNoteGeneraliModifica, securityContext, httpHeaders);
	}

	

	@Override
	public Response cittadiniCitIdTaccuiniTaccuinoIdSintomiGet(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, Long taccuinoId, Integer limit,
			Integer offset, String ordinamento, String da, String a, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniCitIdTaccuiniTaccuinoIdSintomiGetService.class, shibIdentitaCodiceFiscale, xRequestId,
				xForwardedFor, xCodiceServizio, citId, taccuinoId, limit,
				offset, ordinamento, da, a, securityContext,
				httpHeaders);
	}

	@Override
	public Response cittadiniCitIdTaccuiniTaccuinoIdSintomiPost(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, Long taccuinoId,
			PayloadSintomoNuovo payloadSintomoNuovo, SecurityContext securityContext, HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniCitIdTaccuiniTaccuinoIdSintomiPostService.class, shibIdentitaCodiceFiscale, xRequestId,
			xForwardedFor, xCodiceServizio, citId, taccuinoId,
			payloadSintomoNuovo, securityContext, httpHeaders);
	}

	@Override
	public Response cittadiniCitIdTaccuinoGet(String shibIdentitaCodiceFiscale, String xRequestId, String xForwardedFor,
			String xCodiceServizio, String citId, SecurityContext securityContext, HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniCitIdTaccuinoGetService.class, shibIdentitaCodiceFiscale,  xRequestId, xForwardedFor,
			 xCodiceServizio,  citId,  securityContext, httpHeaders);
	}

	@Override
	public Response cittadiniCitIdTaccuinoTaccuinoIdContattiStruttureBulkDeletePost(String shibIdentitaCodiceFiscale,
			String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, Long taccuinoId,
			List<String> payloadContattoConStrutturaEliminaMassiva, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniCitIdTaccuinoTaccuinoIdContattiStruttureBulkDeletePostService.class, shibIdentitaCodiceFiscale,
			xRequestId, xForwardedFor, xCodiceServizio, citId, taccuinoId, payloadContattoConStrutturaEliminaMassiva, securityContext,
			httpHeaders);
	}

	@Override
	public Response cittadiniCitIdTaccuinoTaccuinoIdRilevazioniBulkDeletePost(String shibIdentitaCodiceFiscale,
			String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, Long taccuinoId,
			List<String> payloadRilevazioniEliminaMassiva, SecurityContext securityContext, HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniCitIdTaccuinoTaccuinoIdRilevazioniBulkDeletePostService.class, shibIdentitaCodiceFiscale,
			xRequestId, xForwardedFor, xCodiceServizio, citId, taccuinoId,
			payloadRilevazioniEliminaMassiva, securityContext, httpHeaders);
	}

	@Override
	public Response cittadiniCitIdTaccuinoTaccuinoIdRilevazioniCsvGet(String shibIdentitaCodiceFiscale,
			String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, Long taccuinoId,
			String gruppo, Integer limit, Integer offset, String ordinamento, String da, String a,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response cittadiniCitIdTaccuinoTaccuinoIdRilevazioniGet(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, Long taccuinoId, String gruppo,String descrittore, Integer limit,
			Integer offset, String ordinamento, String da, String a, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute(CittadiniCitIdTaccuinoTaccuinoIdRilevazioniGetService.class, shibIdentitaCodiceFiscale, xRequestId,
			xForwardedFor, xCodiceServizio, citId, taccuinoId, gruppo, descrittore, limit,
			offset, ordinamento, da, a, securityContext,
			httpHeaders);
		
	}

	@Override
	public Response cittadiniCitIdTaccuinoTaccuinoIdRilevazioniPost(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, Long taccuinoId,
			PayloadRilevazioniNuovo payloadRilevazioniNuovo, SecurityContext securityContext, HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniCitIdTaccuinoTaccuinoIdRilevazioniPostService.class, shibIdentitaCodiceFiscale, xRequestId,
				xForwardedFor, xCodiceServizio, citId, taccuinoId,
				payloadRilevazioniNuovo, securityContext, httpHeaders);
	}

	@Override
	public Response cittadiniCitIdTaccuinoTaccuinoIdSintomiBulkDeletePost(String shibIdentitaCodiceFiscale,
			String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, Long taccuinoId,
			List<String> payloadSintomoEliminaMassiva, SecurityContext securityContext, HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniCitIdTaccuinoTaccuinoIdSintomiBulkDeletePostService.class, shibIdentitaCodiceFiscale,
			xRequestId, xForwardedFor, xCodiceServizio, citId, taccuinoId,
			payloadSintomoEliminaMassiva, securityContext, httpHeaders);
	}

	@Override
	public Response cittadiniCitIdTaccuiniTaccuinoIdOscuratoPut(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, Long taccuinoId,
			PayloadOscuratoModifica payloadOscuratoModifica, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniCitIdTaccuiniTaccuinoIdOscuramentoPutService.class, shibIdentitaCodiceFiscale,
				xRequestId, xForwardedFor, xCodiceServizio, citId, taccuinoId,
				payloadOscuratoModifica, securityContext, httpHeaders);
	}

	@Override
	public Response cittadiniCitIdTaccuiniTaccuinoIdPreferenzePut(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, Long taccuinoId,
			List<PayloadPreferenzaModifica> payloadPreferenzaModifica, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniCitIdTaccuiniTaccuinoIdPreferenzePutService.class, shibIdentitaCodiceFiscale,
				xRequestId, xForwardedFor, xCodiceServizio, citId, taccuinoId,
				payloadPreferenzaModifica, securityContext, httpHeaders);
	}

	@Override
	public Response cittadiniCitIdTaccuiniTaccuinoIdDieteDietaIdDelete(String shibIdentitaCodiceFiscale,
			String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, Long taccuinoId,
			Long dietaId, SecurityContext securityContext, HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute(CittadiniCitIdTaccuiniTaccuinoIdDieteDietaIdDeleteService.class, shibIdentitaCodiceFiscale,
			 xRequestId, xForwardedFor, xCodiceServizio, citId, taccuinoId,
			 dietaId, securityContext, httpHeaders);
	}

	@Override
	public Response cittadiniCitIdTaccuiniTaccuinoIdEventiEventoIdDelete(String shibIdentitaCodiceFiscale,
			String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, Long taccuinoId,
			Long eventoId, SecurityContext securityContext, HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniCitIdTaccuiniTaccuinoIdEventiEventoIdDeleteService.class, shibIdentitaCodiceFiscale,
			xRequestId, xForwardedFor, xCodiceServizio, citId, taccuinoId,
			eventoId, securityContext, httpHeaders);
	}

	@Override
	public Response cittadiniCitIdTaccuiniTaccuinoIdFarmaciFarmacoIdDelete(String shibIdentitaCodiceFiscale,
			String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, Long taccuinoId,
			Long farmacoId, SecurityContext securityContext, HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniCitIdTaccuiniTaccuinoIdFarmaciFarmacoIdDeleteService.class, shibIdentitaCodiceFiscale,
				xRequestId, xForwardedFor, xCodiceServizio, citId, taccuinoId,
				farmacoId, securityContext, httpHeaders);
	}

}
