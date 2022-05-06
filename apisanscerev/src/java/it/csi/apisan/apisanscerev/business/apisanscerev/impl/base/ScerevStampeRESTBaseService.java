/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.impl.base;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.apache.commons.lang3.StringUtils;

public abstract class ScerevStampeRESTBaseService extends ScerevDelegheRESTBaseService {
	protected String contentDisposition; 
	protected String fileName;
	
	public static final String X_CONTENT_DISPOSITION = "Content-Disposition";
	
	public ScerevStampeRESTBaseService(SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		
	}

	@Override
	public Response executeService() {
				
		super.executeService();
		//costruisco il contentDisposition
		StringBuffer strContentDisposition = new StringBuffer();
		if(!StringUtils.isEmpty(contentDisposition) && !StringUtils.isBlank(contentDisposition)) {
			strContentDisposition.append(contentDisposition);
		}else {
			strContentDisposition.append("attachment; ");
		}
		strContentDisposition.append("filename=");
		if(!StringUtils.isEmpty(fileName) && !StringUtils.isBlank(fileName)) {
			strContentDisposition.append(fileName);
		}else {
			strContentDisposition.append("response.pdf");
		}

		res.getMetadata().add(X_CONTENT_DISPOSITION, strContentDisposition.toString());
		return res;
	}

}
