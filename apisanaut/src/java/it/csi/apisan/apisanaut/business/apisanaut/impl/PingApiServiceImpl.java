/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanaut.business.apisanaut.impl;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import it.csi.apisan.apisanaut.business.apisanaut.PingApi;

public class PingApiServiceImpl implements PingApi {
      public Response pingGet(SecurityContext securityContext, HttpHeaders httpHeaders ) {
      // do some magic!
      return Response.ok().build();
  }
}
