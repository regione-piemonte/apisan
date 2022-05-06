/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanprof.dto.apisanprof;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanprof.dto.apisanprof.DatiPrimari;
import it.csi.apisan.apisanprof.dto.apisanprof.DatiSecondari;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class InfoAnagrafiche   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private DatiPrimari datiPrimari = null;
  private DatiSecondari domicilio = null;
  private DatiSecondari residenza = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dati_primari") 
 
  public DatiPrimari getDatiPrimari() {
    return datiPrimari;
  }
  public void setDatiPrimari(DatiPrimari datiPrimari) {
    this.datiPrimari = datiPrimari;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("domicilio") 
 
  public DatiSecondari getDomicilio() {
    return domicilio;
  }
  public void setDomicilio(DatiSecondari domicilio) {
    this.domicilio = domicilio;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("residenza") 
 
  public DatiSecondari getResidenza() {
    return residenza;
  }
  public void setResidenza(DatiSecondari residenza) {
    this.residenza = residenza;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfoAnagrafiche infoAnagrafiche = (InfoAnagrafiche) o;
    return Objects.equals(datiPrimari, infoAnagrafiche.datiPrimari) &&
        Objects.equals(domicilio, infoAnagrafiche.domicilio) &&
        Objects.equals(residenza, infoAnagrafiche.residenza);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datiPrimari, domicilio, residenza);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfoAnagrafiche {\n");
    
    sb.append("    datiPrimari: ").append(toIndentedString(datiPrimari)).append("\n");
    sb.append("    domicilio: ").append(toIndentedString(domicilio)).append("\n");
    sb.append("    residenza: ").append(toIndentedString(residenza)).append("\n");
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

