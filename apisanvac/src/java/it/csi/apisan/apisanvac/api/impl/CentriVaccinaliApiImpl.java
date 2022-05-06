/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.api.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanvac.api.CentriVaccinaliApi;
import it.csi.apisan.apisanvac.common.ServiceExecutor;
import it.csi.apisan.apisanvac.service.CentriVaccinaliCentroVaccinaleIdGetService;
import it.csi.apisan.apisanvac.service.CentriVaccinaliCentroVaccinaleIdPeriodiLiberiGetService;
import it.csi.apisan.apisanvac.service.centriVaccinaliGetService;

@Service
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class CentriVaccinaliApiImpl implements CentriVaccinaliApi {
	@Override
	public Response centriVaccinaliCentroVaccinaleIdGet(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String centroVaccinaleId, SecurityContext securityContext,
			HttpHeaders httpHeaders, HttpServletRequest request, HttpServletResponse response) {
		return ServiceExecutor.execute(CentriVaccinaliCentroVaccinaleIdGetService.class, shibIdentitaCodiceFiscale,
				xRequestId, xForwardedFor, xCodiceServizio, centroVaccinaleId, securityContext, httpHeaders, request,
				response);
	}

	@Override
	public Response centriVaccinaliGet(String shibIdentitaCodiceFiscale, String xRequestId, String xForwardedFor,
			String xCodiceServizio, String filter, SecurityContext securityContext, HttpHeaders httpHeaders,
			HttpServletRequest request, HttpServletResponse response) {
		return ServiceExecutor.execute(centriVaccinaliGetService.class, shibIdentitaCodiceFiscale, xRequestId, xForwardedFor,
				xCodiceServizio, filter, securityContext, httpHeaders,
				request, response);
	}

	@Override
	public Response centriVaccinaliCentroVaccinaleIdPeriodiLiberiGet(String shibIdentitaCodiceFiscale,
			String xRequestId, String xForwardedFor, String xCodiceServizio, String centroVaccinaleId, String filter,
			SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request,
			HttpServletResponse response) {
		return ServiceExecutor.execute(CentriVaccinaliCentroVaccinaleIdPeriodiLiberiGetService.class ,shibIdentitaCodiceFiscale,
				xRequestId, xForwardedFor, xCodiceServizio, centroVaccinaleId, filter,
				securityContext, httpHeaders, request,
				response);
	}

}
