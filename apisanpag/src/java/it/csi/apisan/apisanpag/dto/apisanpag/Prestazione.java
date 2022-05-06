/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.dto.apisanpag;

import java.util.Objects;
import java.util.ArrayList;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class Prestazione   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String codice = null;
  private String descrizione = null;
  private Date dataAppuntamento = null;
  private String luogoApputamento = null;

  /**
   * codice regionale della prestazione sanitaria
   **/
  
  @ApiModelProperty(value = "codice regionale della prestazione sanitaria")
  @JsonProperty("codice") 
 
  public String getCodice() {
    return codice;
  }
  public void setCodice(String codice) {
    this.codice = codice;
  }

  /**
   * descrizione regionale della prestazione sanitaria
   **/
  
  @ApiModelProperty(value = "descrizione regionale della prestazione sanitaria")
  @JsonProperty("descrizione") 
 
  public String getDescrizione() {
    return descrizione;
  }
  public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_appuntamento") 
 
  public Date getDataAppuntamento() {
    return dataAppuntamento;
  }
  public void setDataAppuntamento(Date dataAppuntamento) {
    this.dataAppuntamento = dataAppuntamento;
  }

  /**
   * comune, indirizzo dove sara erogata la prestazione sanitaria
   **/
  
  @ApiModelProperty(value = "comune, indirizzo dove sara erogata la prestazione sanitaria")
  @JsonProperty("luogo_apputamento") 
 
  public String getLuogoApputamento() {
    return luogoApputamento;
  }
  public void setLuogoApputamento(String luogoApputamento) {
    this.luogoApputamento = luogoApputamento;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Prestazione prestazione = (Prestazione) o;
    return Objects.equals(codice, prestazione.codice) &&
        Objects.equals(descrizione, prestazione.descrizione) &&
        Objects.equals(dataAppuntamento, prestazione.dataAppuntamento) &&
        Objects.equals(luogoApputamento, prestazione.luogoApputamento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codice, descrizione, dataAppuntamento, luogoApputamento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Prestazione {\n");
    
    sb.append("    codice: ").append(toIndentedString(codice)).append("\n");
    sb.append("    descrizione: ").append(toIndentedString(descrizione)).append("\n");
    sb.append("    dataAppuntamento: ").append(toIndentedString(dataAppuntamento)).append("\n");
    sb.append("    luogoApputamento: ").append(toIndentedString(luogoApputamento)).append("\n");
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

