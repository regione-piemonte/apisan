/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.dto.apisanpag;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanpag.dto.apisanpag.DateCrit;
import it.csi.apisan.apisanpag.dto.apisanpag.IntegerCrit;
import it.csi.apisan.apisanpag.dto.apisanpag.StringCrit;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class RimborsoFilter   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private IntegerCrit idAsr = null;
  private IntegerCrit statoTicket = null;
  private IntegerCrit inErogazione = null;
  private StringCrit motivoPagamento = null;
  private StringCrit codiceVersamento = null;
  private StringCrit codiceServizio = null;
  private StringCrit modalitaRimborso = null;
  private DateCrit dataDal = null;
  private DateCrit dataAl = null;

  /**
   * Identificativo dell’ASR che ha emesso il pagamento oggetto di rimborso.
   **/
  
  @ApiModelProperty(value = "Identificativo dell’ASR che ha emesso il pagamento oggetto di rimborso.")
  @JsonProperty("id_asr") 
 
  public IntegerCrit getIdAsr() {
    return idAsr;
  }
  public void setIdAsr(IntegerCrit idAsr) {
    this.idAsr = idAsr;
  }

  /**
   * Valori possibili 801 (Rimborsato) o 802 (da rimborsare)
   **/
  
  @ApiModelProperty(value = "Valori possibili 801 (Rimborsato) o 802 (da rimborsare)")
  @JsonProperty("stato_ticket") 
 
  public IntegerCrit getStatoTicket() {
    return statoTicket;
  }
  public void setStatoTicket(IntegerCrit statoTicket) {
    this.statoTicket = statoTicket;
  }

  /**
   * Stato di erogazione del credito di un rimborso.Valori possibili 0 (non erogato), 1 (in erogazione) o 2 (erogato)
   **/
  
  @ApiModelProperty(value = "Stato di erogazione del credito di un rimborso.Valori possibili 0 (non erogato), 1 (in erogazione) o 2 (erogato)")
  @JsonProperty("in_erogazione") 
 
  public IntegerCrit getInErogazione() {
    return inErogazione;
  }
  public void setInErogazione(IntegerCrit inErogazione) {
    this.inErogazione = inErogazione;
  }

  /**
   * Se presente deve essere un alfanumerico lungo 1 carattere
   **/
  
  @ApiModelProperty(value = "Se presente deve essere un alfanumerico lungo 1 carattere")
  @JsonProperty("motivo_pagamento") 
 
  public StringCrit getMotivoPagamento() {
    return motivoPagamento;
  }
  public void setMotivoPagamento(StringCrit motivoPagamento) {
    this.motivoPagamento = motivoPagamento;
  }

  /**
   * Codice versamento del pagamento oggetto di rimborso.
   **/
  
  @ApiModelProperty(value = "Codice versamento del pagamento oggetto di rimborso.")
  @JsonProperty("codice_versamento") 
 
  public StringCrit getCodiceVersamento() {
    return codiceVersamento;
  }
  public void setCodiceVersamento(StringCrit codiceVersamento) {
    this.codiceVersamento = codiceVersamento;
  }

  /**
   * Identificativo del sistema dipartimentale che ha emesso il pagamento oggetto di rimborso.
   **/
  
  @ApiModelProperty(value = "Identificativo del sistema dipartimentale che ha emesso il pagamento oggetto di rimborso.")
  @JsonProperty("codice_servizio") 
 
  public StringCrit getCodiceServizio() {
    return codiceServizio;
  }
  public void setCodiceServizio(StringCrit codiceServizio) {
    this.codiceServizio = codiceServizio;
  }

  /**
   * modalita di  erogazione del rimborso scelta dall’utente. Valori possibili 1(Voucher), 2 (Bonifico), 3 (Borsellino elettronico)
   **/
  
  @ApiModelProperty(value = "modalita di  erogazione del rimborso scelta dall’utente. Valori possibili 1(Voucher), 2 (Bonifico), 3 (Borsellino elettronico)")
  @JsonProperty("modalita_rimborso") 
 
  public StringCrit getModalitaRimborso() {
    return modalitaRimborso;
  }
  public void setModalitaRimborso(StringCrit modalitaRimborso) {
    this.modalitaRimborso = modalitaRimborso;
  }

  /**
   * Data di inizio del periodo entro cui cercare le pratiche di rimborso
   **/
  
  @ApiModelProperty(value = "Data di inizio del periodo entro cui cercare le pratiche di rimborso")
  @JsonProperty("data_dal") 
 
  public DateCrit getDataDal() {
    return dataDal;
  }
  public void setDataDal(DateCrit dataDal) {
    this.dataDal = dataDal;
  }

  /**
   * Data di fine del periodo entro cui cercare le pratiche di rimborso.
   **/
  
  @ApiModelProperty(value = "Data di fine del periodo entro cui cercare le pratiche di rimborso.")
  @JsonProperty("data_al") 
 
  public DateCrit getDataAl() {
    return dataAl;
  }
  public void setDataAl(DateCrit dataAl) {
    this.dataAl = dataAl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RimborsoFilter rimborsoFilter = (RimborsoFilter) o;
    return Objects.equals(idAsr, rimborsoFilter.idAsr) &&
        Objects.equals(statoTicket, rimborsoFilter.statoTicket) &&
        Objects.equals(inErogazione, rimborsoFilter.inErogazione) &&
        Objects.equals(motivoPagamento, rimborsoFilter.motivoPagamento) &&
        Objects.equals(codiceVersamento, rimborsoFilter.codiceVersamento) &&
        Objects.equals(codiceServizio, rimborsoFilter.codiceServizio) &&
        Objects.equals(modalitaRimborso, rimborsoFilter.modalitaRimborso) &&
        Objects.equals(dataDal, rimborsoFilter.dataDal) &&
        Objects.equals(dataAl, rimborsoFilter.dataAl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idAsr, statoTicket, inErogazione, motivoPagamento, codiceVersamento, codiceServizio, modalitaRimborso, dataDal, dataAl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RimborsoFilter {\n");
    
    sb.append("    idAsr: ").append(toIndentedString(idAsr)).append("\n");
    sb.append("    statoTicket: ").append(toIndentedString(statoTicket)).append("\n");
    sb.append("    inErogazione: ").append(toIndentedString(inErogazione)).append("\n");
    sb.append("    motivoPagamento: ").append(toIndentedString(motivoPagamento)).append("\n");
    sb.append("    codiceVersamento: ").append(toIndentedString(codiceVersamento)).append("\n");
    sb.append("    codiceServizio: ").append(toIndentedString(codiceServizio)).append("\n");
    sb.append("    modalitaRimborso: ").append(toIndentedString(modalitaRimborso)).append("\n");
    sb.append("    dataDal: ").append(toIndentedString(dataDal)).append("\n");
    sb.append("    dataAl: ").append(toIndentedString(dataAl)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

