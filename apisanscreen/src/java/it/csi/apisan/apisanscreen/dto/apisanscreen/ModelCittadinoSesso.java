/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.dto.apisanscreen;

import java.util.Objects;
import java.util.ArrayList;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelCittadinoSesso   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private Integer codiceInterno = null;

  /**
   * Un prefisso che si abbina al codice interno. * S &#x3D; &#39;screening&#39; * E &#x3D; &#39;extra screening&#39; * V &#x3D; &#39;Valle d&#39;Aosta&#39; 
   */
  public enum CodiceInternoPrefissoEnum {
    S("S"),

        E("E"),

        V("V");
    private String value;

    CodiceInternoPrefissoEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private CodiceInternoPrefissoEnum codiceInternoPrefisso = null;

  /**
   * Un codice che descrive il sesso del cittadino. * M * F 
   */
  public enum SessoEnum {
    M("M"),

        F("F");
    private String value;

    SessoEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private SessoEnum sesso = null;

  /**
   * Un codice che identifica univocamente l’assistita all’interno del sistema regionale di screening 
   **/
  
  @ApiModelProperty(value = "Un codice che identifica univocamente l’assistita all’interno del sistema regionale di screening ")
  @JsonProperty("codice_interno") 
 
  public Integer getCodiceInterno() {
    return codiceInterno;
  }
  public void setCodiceInterno(Integer codiceInterno) {
    this.codiceInterno = codiceInterno;
  }

  /**
   * Un prefisso che si abbina al codice interno. * S &#x3D; &#39;screening&#39; * E &#x3D; &#39;extra screening&#39; * V &#x3D; &#39;Valle d&#39;Aosta&#39; 
   **/
  
  @ApiModelProperty(value = "Un prefisso che si abbina al codice interno. * S = 'screening' * E = 'extra screening' * V = 'Valle d'Aosta' ")
  @JsonProperty("codice_interno_prefisso") 
 
  public CodiceInternoPrefissoEnum getCodiceInternoPrefisso() {
    return codiceInternoPrefisso;
  }
  public void setCodiceInternoPrefisso(CodiceInternoPrefissoEnum codiceInternoPrefisso) {
    this.codiceInternoPrefisso = codiceInternoPrefisso;
  }

  /**
   * Un codice che descrive il sesso del cittadino. * M * F 
   **/
  
  @ApiModelProperty(value = "Un codice che descrive il sesso del cittadino. * M * F ")
  @JsonProperty("sesso") 
 
  public SessoEnum getSesso() {
    return sesso;
  }
  public void setSesso(SessoEnum sesso) {
    this.sesso = sesso;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelCittadinoSesso modelCittadinoSesso = (ModelCittadinoSesso) o;
    return Objects.equals(codiceInterno, modelCittadinoSesso.codiceInterno) &&
        Objects.equals(codiceInternoPrefisso, modelCittadinoSesso.codiceInternoPrefisso) &&
        Objects.equals(sesso, modelCittadinoSesso.sesso);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codiceInterno, codiceInternoPrefisso, sesso);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelCittadinoSesso {\n");
    
    sb.append("    codiceInterno: ").append(toIndentedString(codiceInterno)).append("\n");
    sb.append("    codiceInternoPrefisso: ").append(toIndentedString(codiceInternoPrefisso)).append("\n");
    sb.append("    sesso: ").append(toIndentedString(sesso)).append("\n");
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

