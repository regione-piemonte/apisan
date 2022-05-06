/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesen.dto.apisanesen;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Una risorsa che ci permette di avere dati aggiuntivi sulla configurazione che un cittadino ha su questo servizio")

public class Info   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private Date scadenza = null;
  private Boolean bloccato = null;
  private Date dataSblocco = null;

  /**
   * indica la data di scadenza delle esenzioni, che è una *costante* costruita a partire dal valore della tabella ESENRED_C_PARAMETRI con CODICE &#x3D; DATA_SCADENZA_PARAMETRIZZATA
   **/
  
  @ApiModelProperty(example = "2019-03-31", required = true, value = "indica la data di scadenza delle esenzioni, che è una *costante* costruita a partire dal valore della tabella ESENRED_C_PARAMETRI con CODICE = DATA_SCADENZA_PARAMETRIZZATA")
  @JsonProperty("scadenza") 
 
  @NotNull
  public Date getScadenza() {
    return scadenza;
  }
  public void setScadenza(Date scadenza) {
    this.scadenza = scadenza;
  }

  /**
   * indica se l&#39;utente può creare una nuova esenzione o meno
   **/
  
  @ApiModelProperty(example = "false", required = true, value = "indica se l'utente può creare una nuova esenzione o meno")
  @JsonProperty("bloccato") 
 
  @NotNull
  public Boolean isBloccato() {
    return bloccato;
  }
  public void setBloccato(Boolean bloccato) {
    this.bloccato = bloccato;
  }

  /**
   * Permette di mostrare all&#39;utente quando potrà tornare a creare esenzioni
   **/
  
  @ApiModelProperty(example = "2018-08-22T15:25:00+02:00", value = "Permette di mostrare all'utente quando potrà tornare a creare esenzioni")
  @JsonProperty("data_sblocco") 
 
  public Date getDataSblocco() {
    return dataSblocco;
  }
  public void setDataSblocco(Date dataSblocco) {
    this.dataSblocco = dataSblocco;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Info info = (Info) o;
    return Objects.equals(scadenza, info.scadenza) &&
        Objects.equals(bloccato, info.bloccato) &&
        Objects.equals(dataSblocco, info.dataSblocco);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scadenza, bloccato, dataSblocco);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Info {\n");
    
    sb.append("    scadenza: ").append(toIndentedString(scadenza)).append("\n");
    sb.append("    bloccato: ").append(toIndentedString(bloccato)).append("\n");
    sb.append("    dataSblocco: ").append(toIndentedString(dataSblocco)).append("\n");
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

