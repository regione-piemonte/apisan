/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelParametroAudit;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class PayloadSetAudit   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String codiceVerticale = null;
  private String codiceAudit = null;
  private List<ModelParametroAudit> parametri = new ArrayList<ModelParametroAudit>();

  /**
   * codice dell&#39;app verticale sul quale è stato eseguito l&#39;accesso
   **/
  
  @ApiModelProperty(value = "codice dell'app verticale sul quale è stato eseguito l'accesso")
  @JsonProperty("codice_verticale") 
 
  public String getCodiceVerticale() {
    return codiceVerticale;
  }
  public void setCodiceVerticale(String codiceVerticale) {
    this.codiceVerticale = codiceVerticale;
  }

  /**
   * codice del parametro di audit per audit diversi da accesso
   **/
  
  @ApiModelProperty(value = "codice del parametro di audit per audit diversi da accesso")
  @JsonProperty("codice_audit") 
 
  public String getCodiceAudit() {
    return codiceAudit;
  }
  public void setCodiceAudit(String codiceAudit) {
    this.codiceAudit = codiceAudit;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("parametri") 
 
  public List<ModelParametroAudit> getParametri() {
    return parametri;
  }
  public void setParametri(List<ModelParametroAudit> parametri) {
    this.parametri = parametri;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayloadSetAudit payloadSetAudit = (PayloadSetAudit) o;
    return Objects.equals(codiceVerticale, payloadSetAudit.codiceVerticale) &&
        Objects.equals(codiceAudit, payloadSetAudit.codiceAudit) &&
        Objects.equals(parametri, payloadSetAudit.parametri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codiceVerticale, codiceAudit, parametri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadSetAudit {\n");
    
    sb.append("    codiceVerticale: ").append(toIndentedString(codiceVerticale)).append("\n");
    sb.append("    codiceAudit: ").append(toIndentedString(codiceAudit)).append("\n");
    sb.append("    parametri: ").append(toIndentedString(parametri)).append("\n");
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

