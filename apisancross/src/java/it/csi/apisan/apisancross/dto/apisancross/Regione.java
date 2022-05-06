/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancross.dto.apisancross;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisancross.dto.apisancross.Nazione;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class Regione   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String codiceIstat = null;
  private String desc = null;
  private Nazione nazione = null;

  /**
   * codice della regione
   **/
  
  @ApiModelProperty(value = "codice della regione")
  @JsonProperty("codice_istat") 
 
  public String getCodiceIstat() {
    return codiceIstat;
  }
  public void setCodiceIstat(String codiceIstat) {
    this.codiceIstat = codiceIstat;
  }

  /**
   * descrizione della regione
   **/
  
  @ApiModelProperty(value = "descrizione della regione")
  @JsonProperty("desc") 
 
  public String getDesc() {
    return desc;
  }
  public void setDesc(String desc) {
    this.desc = desc;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("nazione") 
 
  public Nazione getNazione() {
    return nazione;
  }
  public void setNazione(Nazione nazione) {
    this.nazione = nazione;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Regione regione = (Regione) o;
    return Objects.equals(codiceIstat, regione.codiceIstat) &&
        Objects.equals(desc, regione.desc) &&
        Objects.equals(nazione, regione.nazione);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codiceIstat, desc, nazione);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Regione {\n");
    
    sb.append("    codiceIstat: ").append(toIndentedString(codiceIstat)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    nazione: ").append(toIndentedString(nazione)).append("\n");
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

