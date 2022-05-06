/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancross.dto.apisancross;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisancross.dto.apisancross.Regione;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class Provincia   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String codiceIstat = null;
  private String desc = null;
  private String sigla = null;
  private Regione regione = null;

  /**
   * codice della provincia di appartenenza
   **/
  
  @ApiModelProperty(value = "codice della provincia di appartenenza")
  @JsonProperty("codice_istat") 
 
  public String getCodiceIstat() {
    return codiceIstat;
  }
  public void setCodiceIstat(String codiceIstat) {
    this.codiceIstat = codiceIstat;
  }

  /**
   * descrizione della provincia
   **/
  
  @ApiModelProperty(value = "descrizione della provincia")
  @JsonProperty("desc") 
 
  public String getDesc() {
    return desc;
  }
  public void setDesc(String desc) {
    this.desc = desc;
  }

  /**
   * sigla della provincia
   **/
  
  @ApiModelProperty(value = "sigla della provincia")
  @JsonProperty("sigla") 
 
  public String getSigla() {
    return sigla;
  }
  public void setSigla(String sigla) {
    this.sigla = sigla;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("regione") 
 
  public Regione getRegione() {
    return regione;
  }
  public void setRegione(Regione regione) {
    this.regione = regione;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Provincia provincia = (Provincia) o;
    return Objects.equals(codiceIstat, provincia.codiceIstat) &&
        Objects.equals(desc, provincia.desc) &&
        Objects.equals(sigla, provincia.sigla) &&
        Objects.equals(regione, provincia.regione);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codiceIstat, desc, sigla, regione);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Provincia {\n");
    
    sb.append("    codiceIstat: ").append(toIndentedString(codiceIstat)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    sigla: ").append(toIndentedString(sigla)).append("\n");
    sb.append("    regione: ").append(toIndentedString(regione)).append("\n");
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

