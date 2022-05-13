/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.dto.apisanpresc;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanpresc.dto.apisanpresc.FiltriDate;
import it.csi.apisan.apisanpresc.dto.apisanpresc.FiltroRicettaRegionale;
import it.csi.apisan.apisanpresc.dto.apisanpresc.FiltroRicettaTipologia;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class FiltroRicetta   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private FiltroRicettaTipologia tipologia = null;
  private FiltroRicettaRegionale regionale = null;
  private FiltriDate dataCompilazione = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tipologia") 
 
  public FiltroRicettaTipologia getTipologia() {
    return tipologia;
  }
  public void setTipologia(FiltroRicettaTipologia tipologia) {
    this.tipologia = tipologia;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("regionale") 
 
  public FiltroRicettaRegionale getRegionale() {
    return regionale;
  }
  public void setRegionale(FiltroRicettaRegionale regionale) {
    this.regionale = regionale;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_compilazione") 
 
  public FiltriDate getDataCompilazione() {
    return dataCompilazione;
  }
  public void setDataCompilazione(FiltriDate dataCompilazione) {
    this.dataCompilazione = dataCompilazione;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FiltroRicetta filtroRicetta = (FiltroRicetta) o;
    return Objects.equals(tipologia, filtroRicetta.tipologia) &&
        Objects.equals(regionale, filtroRicetta.regionale) &&
        Objects.equals(dataCompilazione, filtroRicetta.dataCompilazione);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tipologia, regionale, dataCompilazione);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FiltroRicetta {\n");
    
    sb.append("    tipologia: ").append(toIndentedString(tipologia)).append("\n");
    sb.append("    regionale: ").append(toIndentedString(regionale)).append("\n");
    sb.append("    dataCompilazione: ").append(toIndentedString(dataCompilazione)).append("\n");
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

