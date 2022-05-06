/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanffe.dto.apisanffe;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.math.BigDecimal;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;

public class ModelAttRichRimborsoPraticaRicevuta   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String stampa = null;
  private BigDecimal modalitaRimborso = null;
  private BigDecimal inviatoDaAsr = null;

  /**
   * base64 della stampa
   **/
  

  @JsonProperty("stampa") 
 
  public String getStampa() {
    return stampa;
  }
  public void setStampa(String stampa) {
    this.stampa = stampa;
  }

  /**
   **/
  

  @JsonProperty("modalita_rimborso") 
 
  public BigDecimal getModalitaRimborso() {
    return modalitaRimborso;
  }
  public void setModalitaRimborso(BigDecimal modalitaRimborso) {
    this.modalitaRimborso = modalitaRimborso;
  }

  /**
   **/
  

  @JsonProperty("inviato_da_asr") 
 
  public BigDecimal getInviatoDaAsr() {
    return inviatoDaAsr;
  }
  public void setInviatoDaAsr(BigDecimal inviatoDaAsr) {
    this.inviatoDaAsr = inviatoDaAsr;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelAttRichRimborsoPraticaRicevuta modelAttRichRimborsoPraticaRicevuta = (ModelAttRichRimborsoPraticaRicevuta) o;
    return Objects.equals(stampa, modelAttRichRimborsoPraticaRicevuta.stampa) &&
        Objects.equals(modalitaRimborso, modelAttRichRimborsoPraticaRicevuta.modalitaRimborso) &&
        Objects.equals(inviatoDaAsr, modelAttRichRimborsoPraticaRicevuta.inviatoDaAsr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stampa, modalitaRimborso, inviatoDaAsr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelAttRichRimborsoPraticaRicevuta {\n");
    
    sb.append("    stampa: ").append(toIndentedString(stampa)).append("\n");
    sb.append("    modalitaRimborso: ").append(toIndentedString(modalitaRimborso)).append("\n");
    sb.append("    inviatoDaAsr: ").append(toIndentedString(inviatoDaAsr)).append("\n");
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

