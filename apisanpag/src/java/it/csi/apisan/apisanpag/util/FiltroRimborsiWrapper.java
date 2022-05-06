/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.util;

import it.csi.apisan.apisanpag.dto.apisanpag.DateCrit;
import it.csi.apisan.apisanpag.dto.apisanpag.IntegerCrit;
import it.csi.apisan.apisanpag.dto.apisanpag.NumberCrit;
import it.csi.apisan.apisanpag.dto.apisanpag.StringCrit;

public class FiltroRimborsiWrapper {
	
	  private String idAsr = null;
	  private String statoTicket = null;
	  private String inErogazione = null;
	  private String motivoPagamento = null;
	  private String codiceVersamento = null;
	  private String codiceServizio = null;
	  private String modalitaRimborso = null;
	  private String dataDal = null;
	  private String dataAl = null;
	  
	  
	  
	public String getIdAsr() {
		return idAsr;
	}
	public void setIdAsr(String idAsr) {
		this.idAsr = idAsr;
	}
	public String getStatoTicket() {
		return statoTicket;
	}
	public void setStatoTicket(String statoTicket) {
		this.statoTicket = statoTicket;
	}
	public String getInErogazione() {
		return inErogazione;
	}
	public void setInErogazione(String inErogazione) {
		this.inErogazione = inErogazione;
	}
	public String getMotivoPagamento() {
		return motivoPagamento;
	}
	public void setMotivoPagamento(String motivoPagamento) {
		this.motivoPagamento = motivoPagamento;
	}
	public String getCodiceVersamento() {
		return codiceVersamento;
	}
	public void setCodiceVersamento(String codiceVersamento) {
		this.codiceVersamento = codiceVersamento;
	}
	public String getCodiceServizio() {
		return codiceServizio;
	}
	public void setCodiceServizio(String codiceServizio) {
		this.codiceServizio = codiceServizio;
	}
	public String getModalitaRimborso() {
		return modalitaRimborso;
	}
	public void setModalitaRimborso(String modalitaRimborso) {
		this.modalitaRimborso = modalitaRimborso;
	}
	public String getDataDal() {
		return dataDal;
	}
	public void setDataDal(String dataDal) {
		this.dataDal = dataDal;
	}
	public String getDataAl() {
		return dataAl;
	}
	public void setDataAl(String dataAl) {
		this.dataAl = dataAl;
	}
	  
	  
	  
	
}
