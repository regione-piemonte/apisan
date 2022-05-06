/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import it.csi.apisan.apisanfse.dto.apisanfse.AziendaSanitaria;
import it.csi.apisan.apisanfse.dto.apisanfse.StrutturaSanitaria;
import it.csi.apisan.apisanfse.dto.apisanfse.UnitaOperativaSanitaria;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="luogo, azienda-struttura-unità operativa")

public class LuogoAsu   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private AziendaSanitaria azienda = null;
  private StrutturaSanitaria struttura = null;
  private UnitaOperativaSanitaria unitaOperativa = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("azienda") 
 
  public AziendaSanitaria getAzienda() {
    return azienda;
  }
  public void setAzienda(AziendaSanitaria azienda) {
    this.azienda = azienda;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("struttura") 
 
  public StrutturaSanitaria getStruttura() {
    return struttura;
  }
  public void setStruttura(StrutturaSanitaria struttura) {
    this.struttura = struttura;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("unita_operativa") 
 
  public UnitaOperativaSanitaria getUnitaOperativa() {
    return unitaOperativa;
  }
  public void setUnitaOperativa(UnitaOperativaSanitaria unitaOperativa) {
    this.unitaOperativa = unitaOperativa;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LuogoAsu luogoAsu = (LuogoAsu) o;
    return Objects.equals(azienda, luogoAsu.azienda) &&
        Objects.equals(struttura, luogoAsu.struttura) &&
        Objects.equals(unitaOperativa, luogoAsu.unitaOperativa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(azienda, struttura, unitaOperativa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LuogoAsu {\n");
    
    sb.append("    azienda: ").append(toIndentedString(azienda)).append("\n");
    sb.append("    struttura: ").append(toIndentedString(struttura)).append("\n");
    sb.append("    unitaOperativa: ").append(toIndentedString(unitaOperativa)).append("\n");
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

