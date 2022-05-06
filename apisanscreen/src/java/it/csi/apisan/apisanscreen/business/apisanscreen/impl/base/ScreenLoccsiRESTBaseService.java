/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.business.apisanscreen.impl.base;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.apache.commons.lang3.StringUtils;

import it.csi.apisan.apisanscreen.exception.ErroreBuilder;
import it.csi.apisan.apisanscreen.util.ApisanScreenStatus;
import okhttp3.Headers;

public abstract class ScreenLoccsiRESTBaseService extends ScreenRESTBaseService {
	protected Headers headersResponsePagination;
	protected Integer pageSize = null;
	public static final String X_Page = "X-Page";
	public static final String X_Page_Size = "X-Page-Size";
	public static final String X_Total_Pages = "X-Total-Pages";
	public static final String X_Total_Elements = "X-Total-Elements";
	
	
	public ScreenLoccsiRESTBaseService(SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
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
			return ErroreBuilder.from(ApisanScreenStatus.PARAMETRO_NON_VALIDO, "X-Request-ID").exception().getResponse();
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

}
