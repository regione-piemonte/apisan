/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanprof.exception;

import java.util.List;

import it.csi.apisan.apisanprof.dto.apisanprof.Dettaglio;
import it.csi.apisan.apisanprof.dto.apisanprof.Errore;
import it.csi.apisan.apisanprof.util.ApisanProfStatus;

public class ErroreBuilder {
	Errore err;
	
	public ErroreBuilder (int status, String code) {
		err = new Errore();
		err.setStatus(status);
		err.setCode(code);
	}
	
	private ErroreBuilder() {
		this.err = new Errore();
	}
	
	public Errore getErrore() {
		
		return err;
	}
	
	public Errore getErrore( String title) {
		err.setTitle(title);
		return err;
	}	
	
	public Errore getErrore(String title, List<Dettaglio> dettagli) {
		err.setTitle(title);
		err.setDetail(dettagli);
		return err;
	}	
	
	public ErroreBuilder status(int status) {
		err.setStatus(status);
		return this;
	}
	
	public ErroreBuilder code(String code) {
		err.setCode(code);
		return this;
	}
	

		
	
}
