/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancons.exception;

import java.util.ArrayList;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import it.csi.apisan.apisancons.dto.apisancons.Consenso;
import it.csi.apisan.apisancons.dto.apisancons.Dettaglio;
import it.csi.apisan.apisancons.dto.apisancons.ErroreConsenso;
import it.csi.apisan.apisancons.util.ApisanConsStatus;

public class ErroreConsensoBuilder {
	private ErroreConsenso erroreConsenso;
	
	
	
	public static ErroreConsensoBuilder from(ApisanConsStatus aas, Consenso cons, Object... args) {
		return new ErroreConsensoBuilder()
				.status(aas.getStatusCode())
				.code(aas.name())
				.consenso(cons)
				.title(aas.getMessage(args));
	}	

	public static ErroreConsensoBuilder from(Status s, Consenso cons) {
		return new ErroreConsensoBuilder()
				.status(s.getStatusCode())
				.code(s.name())
				.consenso(cons);
	}
	
	public static ErroreConsensoBuilder from(int status, String code, Consenso cons) {
		return new ErroreConsensoBuilder()
				.status(status)
				.code(code)
				.consenso(cons);
	}
	
	private ErroreConsensoBuilder() {
		this.erroreConsenso = new ErroreConsenso();
	}
	
	
	public ErroreConsensoBuilder status(int status) {
		erroreConsenso.setStatus(status);
		return this;
	}
	
	public ErroreConsensoBuilder code(String code) {
		erroreConsenso.setCode(code);
		return this;
	}
	
	public ErroreConsensoBuilder title(String title) {
		erroreConsenso.setTitle(title);
		return this;
	}
	
	public ErroreConsensoBuilder consenso(Consenso cons) {
		erroreConsenso.setConsenso(cons);
		return this;
	}
	
	public ErroreConsensoBuilder dettaglio(String chiave, String valore) {
		Dettaglio dettaglio = new Dettaglio();
		dettaglio.setChiave(chiave);
		//dettaglio.setValore(getValoreEncoding( valore));
		dettaglio.setValore(valore);
		return dettaglio(dettaglio);
	}
	
	private ErroreConsensoBuilder dettaglio(Dettaglio dettaglio) {
		if(erroreConsenso.getDetail()==null) {
			erroreConsenso.setDetail(new ArrayList<>());
		}
		erroreConsenso.getDetail().add(dettaglio);
		return this;
	}
	
	public ErroreConsensoRESTException exception() {
		return new ErroreConsensoRESTException(this.erroreConsenso);
	}
	
	public ErroreConsensoRESTException exception(String message) {
		return new ErroreConsensoRESTException(this.erroreConsenso, message);
	}
	
	public Response response() {
		return this.exception().getResponse();
	}
}
