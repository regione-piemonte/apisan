/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanfse.dto.apisanfse.Delega;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class CittadinoArruolabile   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String codiceRisposta = null;
  private Boolean risposta = null;
  private String dettaglioRisposta = null;
  private Delega delega = null;

  /**
   * possibili codici di ritorno  -001 se l&#39;assistito NON è piemontese  -003 e l&#39;assistito è piemontese e ha un consenso all&#39;alimentazione a SI, - 000 se l&#39;assistito è piemontese e ha un consenso all&#39;alimentazione a NO e nella tabella \&quot;non chidermelo più\&quot; c&#39;è il record, - 005 e l&#39;assistito è piemontese e ha un consenso all&#39;alimentazione a NO e nella tabella non chiedermelo più\&quot; NON c&#39;è il record,  - 004 il cittadino è piemontese e  ha un fse
   **/
  
  @ApiModelProperty(value = "possibili codici di ritorno  -001 se l'assistito NON è piemontese  -003 e l'assistito è piemontese e ha un consenso all'alimentazione a SI, - 000 se l'assistito è piemontese e ha un consenso all'alimentazione a NO e nella tabella \"non chidermelo più\" c'è il record, - 005 e l'assistito è piemontese e ha un consenso all'alimentazione a NO e nella tabella non chiedermelo più\" NON c'è il record,  - 004 il cittadino è piemontese e  ha un fse")
  @JsonProperty("codice_risposta") 
 
  public String getCodiceRisposta() {
    return codiceRisposta;
  }
  public void setCodiceRisposta(String codiceRisposta) {
    this.codiceRisposta = codiceRisposta;
  }

  /**
   * boolean che dice se il cittadino è arruolabile o meno
   **/
  
  @ApiModelProperty(value = "boolean che dice se il cittadino è arruolabile o meno")
  @JsonProperty("risposta") 
 
  public Boolean isRisposta() {
    return risposta;
  }
  public void setRisposta(Boolean risposta) {
    this.risposta = risposta;
  }

  /**
   * descrizione del codice
   **/
  
  @ApiModelProperty(value = "descrizione del codice")
  @JsonProperty("dettaglio_risposta") 
 
  public String getDettaglioRisposta() {
    return dettaglioRisposta;
  }
  public void setDettaglioRisposta(String dettaglioRisposta) {
    this.dettaglioRisposta = dettaglioRisposta;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("delega") 
 
  public Delega getDelega() {
    return delega;
  }
  public void setDelega(Delega delega) {
    this.delega = delega;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CittadinoArruolabile cittadinoArruolabile = (CittadinoArruolabile) o;
    return Objects.equals(codiceRisposta, cittadinoArruolabile.codiceRisposta) &&
        Objects.equals(risposta, cittadinoArruolabile.risposta) &&
        Objects.equals(dettaglioRisposta, cittadinoArruolabile.dettaglioRisposta) &&
        Objects.equals(delega, cittadinoArruolabile.delega);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codiceRisposta, risposta, dettaglioRisposta, delega);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CittadinoArruolabile {\n");
    
    sb.append("    codiceRisposta: ").append(toIndentedString(codiceRisposta)).append("\n");
    sb.append("    risposta: ").append(toIndentedString(risposta)).append("\n");
    sb.append("    dettaglioRisposta: ").append(toIndentedString(dettaglioRisposta)).append("\n");
    sb.append("    delega: ").append(toIndentedString(delega)).append("\n");
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

