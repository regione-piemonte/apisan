/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.apisanfse.impl;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.security.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import it.csi.apisan.apisanfse.business.apisanfse.StampeApi;
import it.csi.apisan.apisanfse.business.apisanfse.impl.base.ServiceExecutor;
import it.csi.apisan.apisanfse.business.apisanfse.impl.base.service.StampeAccessiPostService;
import it.csi.apisan.apisanfse.dto.apisanfse.PayloadStampaAccessi;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class StampeApiServiceImpl implements StampeApi {

	public StampeApiServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	
	
	@Override
	public Response stampeAccessiPost(String xRequestId, String xForwardedFor, String xCodiceServizio,
			List<PayloadStampaAccessi> payloadStampaAccessi, SecurityContext securityContext, HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute(StampeAccessiPostService.class, payloadStampaAccessi, securityContext, httpHeaders);
	}

}
