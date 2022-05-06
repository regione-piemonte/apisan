/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanceliachia.dto.apisanceliachia;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;

public class ModelAutorizzazione   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String codice = null;
  private Date dataValiditaInizio = null;
  private Date dataValiditaFine = null;

  /**
   * Il codice dell&#39;autorizzazione
   **/
  

  @JsonProperty("codice") 
 
  public String getCodice() {
    return codice;
  }
  public void setCodice(String codice) {
    this.codice = codice;
  }

  /**
   * La data di inizio validità dell&#39;autorizzazione
   **/
  

  @JsonProperty("data_validita_inizio") 
 
  public Date getDataValiditaInizio() {
    return dataValiditaInizio;
  }
  public void setDataValiditaInizio(Date dataValiditaInizio) {
    this.dataValiditaInizio = dataValiditaInizio;
  }

  /**
   * La data di fine validità dell&#39;autorizzazione
   **/
  

  @JsonProperty("data_validita_fine") 
 
  public Date getDataValiditaFine() {
    return dataValiditaFine;
  }
  public void setDataValiditaFine(Date dataValiditaFine) {
    this.dataValiditaFine = dataValiditaFine;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelAutorizzazione modelAutorizzazione = (ModelAutorizzazione) o;
    return Objects.equals(codice, modelAutorizzazione.codice) &&
        Objects.equals(dataValiditaInizio, modelAutorizzazione.dataValiditaInizio) &&
        Objects.equals(dataValiditaFine, modelAutorizzazione.dataValiditaFine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codice, dataValiditaInizio, dataValiditaFine);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelAutorizzazione {\n");
    
    sb.append("    codice: ").append(toIndentedString(codice)).append("\n");
    sb.append("    dataValiditaInizio: ").append(toIndentedString(dataValiditaInizio)).append("\n");
    sb.append("    dataValiditaFine: ").append(toIndentedString(dataValiditaFine)).append("\n");
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

