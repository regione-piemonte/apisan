/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantrovaun.business.apisantrovaun.impl.base;

import java.math.BigDecimal;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import it.csi.apisan.apisantrovaun.business.apisantrovaun.impl.base.service.rest.LoccsiServiceClient;
import it.csi.apisan.apisantrovaun.exception.ErroreBuilder;
import it.csi.apisan.apisantrovaun.util.ApisanTrovaUnStatus;
import it.csi.apisan.apisantrovaun.util.Page;
import okhttp3.Headers;

public abstract class TrovaUnLoccsiRESTBaseService extends TrovaUnRESTBaseService {
	protected Headers headersResponsePagination;
	protected Integer pageSize = null;
	protected String latitudine;
	protected String longitudine;
	protected BigDecimal distanza;
	
	protected Integer limit;
	protected Integer offset;
	public static final String X_Page = "X-Page";
	public static final String X_Page_Size = "X-Page-Size";
	public static final String X_Total_Pages = "X-Total-Pages";
	public static final String X_Total_Elements = "X-Total-Elements";
	
	@Autowired
	protected LoccsiServiceClient service;
	
	public TrovaUnLoccsiRESTBaseService(String latitudine, String longitudine, BigDecimal distanza, Integer offset, Integer limit, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.latitudine = latitudine;
		this.longitudine = longitudine;
		this.distanza = distanza;
		this.offset = offset == null?Page.DEFAULT_OFFSET.getValue() : offset ;
		this.limit = limit==null? Page.DEFAULT_LIMIT.getValue() : limit;
	}
	
	protected void setHeadersResponse(Headers headersResponse) {
		this.headersResponsePagination = headersResponse;
	}
	
	
	protected void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	
	@Override
	public Response executeService() {
		if(StringUtils.isBlank(xRequestID)) {
			return ErroreBuilder.from(ApisanTrovaUnStatus.PARAMETRO_NON_VALIDO, "X-Request-ID").exception().getResponse();
		}
		
		super.executeService();
		if(headersResponsePagination!=null && res != null && res.getMetadata() != null) {
			//res.getMetadata().add("X-Request-ID", xRequestID);
			//devo aggiungere tutti i metadata 
			res.getMetadata().add(X_Page, headersResponsePagination.get(X_Page));
			if(pageSize != null) {
				res.getMetadata().add(X_Page_Size, pageSize.toString());
			}else {
				res.getMetadata().add(X_Page_Size, headersResponsePagination.get(X_Page_Size));
			}
			
			res.getMetadata().add(X_Total_Pages, headersResponsePagination.get(X_Total_Pages));
			res.getMetadata().add(X_Total_Elements, headersResponsePagination.get(X_Total_Elements));
		}
		
		return res;
	}	

	protected  boolean checkCoordinate() {
		return (!StringUtils.isEmpty(longitudine) && ! StringUtils.isEmpty(latitudine) && distanza != null);
	}

}
