/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesen.dto.apisanesen;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Testo e versione del disclaimer")

public class Disclaimer   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String testoInformativa = null;
  private String versioneInformativa = null;
  private String testoPrivacy = null;
  private String versionePrivacy = null;

  /**
   * Contiene il testo, anche HTML, dell&#39;informativa che l&#39;utente dovrà accettare 
   **/
  
  @ApiModelProperty(value = "Contiene il testo, anche HTML, dell'informativa che l'utente dovrà accettare ")
  @JsonProperty("testo_informativa") 
 
  public String getTestoInformativa() {
    return testoInformativa;
  }
  public void setTestoInformativa(String testoInformativa) {
    this.testoInformativa = testoInformativa;
  }

  /**
   * Contiene la versione dell&#39;informativa 
   **/
  
  @ApiModelProperty(value = "Contiene la versione dell'informativa ")
  @JsonProperty("versione_informativa") 
 
  public String getVersioneInformativa() {
    return versioneInformativa;
  }
  public void setVersioneInformativa(String versioneInformativa) {
    this.versioneInformativa = versioneInformativa;
  }

  /**
   * Contiene il testo, anche HTML, dell&#39;informativa sulla privacy che l&#39;utente dovrà accettare 
   **/
  
  @ApiModelProperty(value = "Contiene il testo, anche HTML, dell'informativa sulla privacy che l'utente dovrà accettare ")
  @JsonProperty("testo_privacy") 
 
  public String getTestoPrivacy() {
    return testoPrivacy;
  }
  public void setTestoPrivacy(String testoPrivacy) {
    this.testoPrivacy = testoPrivacy;
  }

  /**
   * Contiene la versione dell&#39;informativa sulla privacy 
   **/
  
  @ApiModelProperty(value = "Contiene la versione dell'informativa sulla privacy ")
  @JsonProperty("versione_privacy") 
 
  public String getVersionePrivacy() {
    return versionePrivacy;
  }
  public void setVersionePrivacy(String versionePrivacy) {
    this.versionePrivacy = versionePrivacy;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Disclaimer disclaimer = (Disclaimer) o;
    return Objects.equals(testoInformativa, disclaimer.testoInformativa) &&
        Objects.equals(versioneInformativa, disclaimer.versioneInformativa) &&
        Objects.equals(testoPrivacy, disclaimer.testoPrivacy) &&
        Objects.equals(versionePrivacy, disclaimer.versionePrivacy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(testoInformativa, versioneInformativa, testoPrivacy, versionePrivacy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Disclaimer {\n");
    
    sb.append("    testoInformativa: ").append(toIndentedString(testoInformativa)).append("\n");
    sb.append("    versioneInformativa: ").append(toIndentedString(versioneInformativa)).append("\n");
    sb.append("    testoPrivacy: ").append(toIndentedString(testoPrivacy)).append("\n");
    sb.append("    versionePrivacy: ").append(toIndentedString(versionePrivacy)).append("\n");
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

