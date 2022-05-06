/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanceliachia.exception;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import it.csi.apisan.apisanceliachia.dto.apisanceliachia.Errore;
import it.csi.apisan.apisanceliachia.dto.apisanceliachia.ErroreDettaglio;
import it.csi.apisan.apisanceliachia.util.ApisanCeliachiaStatus;

public class ErroreBuilder {
	private Errore errore;
	

	public static ErroreBuilder from(ApisanCeliachiaStatus aas, Object... args) {
		return new ErroreBuilder()
				.status(aas.getStatusCode())
				.code(aas.name())
				.title(aas.getMessage(args));
	}	

	public static ErroreBuilder from(Status s) {
		return new ErroreBuilder()
				.status(s.getStatusCode())
				.code(s.name());
	}
	
	public static ErroreBuilder from(int status, String code) {
		return new ErroreBuilder()
				.status(status)
				.code(code);
	}
	
	private ErroreBuilder() {
		this.errore = new Errore();
	}
	
	public ErroreBuilder status(int status) {
		errore.setStatus(status);
		return this;
	}
	
	public ErroreBuilder code(String code) {
		errore.setCode(code);
		return this;
	}
	
	public ErroreBuilder title(String title) {
		errore.setTitle(title);
		return this;
	}
	
	public ErroreBuilder dettaglio(String chiave, String valore) {
		ErroreDettaglio dettaglio = new ErroreDettaglio();
		dettaglio.setChiave(chiave);
		dettaglio.setValore(valore);
		return dettaglio(dettaglio);
	}

	private ErroreBuilder dettaglio(ErroreDettaglio dettaglio) {
		if(errore.getDetail()==null) {
			errore.setDetail(new ArrayList<>());
		}
		errore.getDetail().add(dettaglio);
		return this;
	}
	
	public <T> ErroreBuilder dettagli(List<T> list, Function<T, ErroreDettaglio> mapper) {
		if(list!=null) {
			list.stream().map(mapper).forEach(d -> dettaglio(d));
		}
		return this;
	}
	
	public ErroreBuilder link(String link) {
		if(errore.getLinks()==null) {
			errore.setLinks(new ArrayList<>());
		}
		errore.getLinks().add(link);
		return this;
	}
	
	
	public ErroreBuilder throwable(Throwable t) {
		if(t==null) {
			return this;
		}
		this.dettaglio("throwable", t.getMessage());
		addCause(t, 1);
		return this;
	}
	
	private void addCause(Throwable t, int i) {
		if(t.getCause()!=null) {
			this.dettaglio("cause"+i, t.getCause().getMessage());
			i++;
			addCause(t.getCause(), i);
		}
	}
	
	
	public Errore build() {
		return this.errore;
	}
	
	public ErroreRESTException exception() {
		return new ErroreRESTException(this.errore);
	}
	
	public ErroreRESTException exception(String message) {
		return new ErroreRESTException(this.errore, message);
	}
	
	public Response response() {
		return this.exception().getResponse();
	}

	
	
	
}
