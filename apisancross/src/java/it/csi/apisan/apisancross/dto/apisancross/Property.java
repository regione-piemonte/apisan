/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancross.dto.apisancross;

import java.util.Objects;
import java.util.ArrayList;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class Property   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String localita = null;
  private String comune = null;
  private String loccsiLabel = null;
  private Integer civicoNum = null;
  private String nomeVia = null;
  private String civicoSub = null;
  private String tipoVia = null;

  /**
   **/
  
  @ApiModelProperty(example = "ROCCAVIONE", value = "")
  @JsonProperty("localita") 
 
  public String getLocalita() {
    return localita;
  }
  public void setLocalita(String localita) {
    this.localita = localita;
  }

  /**
   **/
  
  @ApiModelProperty(example = "ROCCAVIONE", value = "")
  @JsonProperty("comune") 
 
  public String getComune() {
    return comune;
  }
  public void setComune(String comune) {
    this.comune = comune;
  }

  /**
   **/
  
  @ApiModelProperty(example = "VIA PROVINCIALE ROASCHIA 1 , ROCCAVIONE", value = "")
  @JsonProperty("loccsi_label") 
 
  public String getLoccsiLabel() {
    return loccsiLabel;
  }
  public void setLoccsiLabel(String loccsiLabel) {
    this.loccsiLabel = loccsiLabel;
  }

  /**
   **/
  
  @ApiModelProperty(example = "1", value = "")
  @JsonProperty("civico_num") 
 
  public Integer getCivicoNum() {
    return civicoNum;
  }
  public void setCivicoNum(Integer civicoNum) {
    this.civicoNum = civicoNum;
  }

  /**
   **/
  
  @ApiModelProperty(example = "ROASCHIA", value = "")
  @JsonProperty("nome_via") 
 
  public String getNomeVia() {
    return nomeVia;
  }
  public void setNomeVia(String nomeVia) {
    this.nomeVia = nomeVia;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("civico_sub") 
 
  public String getCivicoSub() {
    return civicoSub;
  }
  public void setCivicoSub(String civicoSub) {
    this.civicoSub = civicoSub;
  }

  /**
   **/
  
  @ApiModelProperty(example = "VIA PROVINCIALE", value = "")
  @JsonProperty("tipo_via") 
 
  public String getTipoVia() {
    return tipoVia;
  }
  public void setTipoVia(String tipoVia) {
    this.tipoVia = tipoVia;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Property property = (Property) o;
    return Objects.equals(localita, property.localita) &&
        Objects.equals(comune, property.comune) &&
        Objects.equals(loccsiLabel, property.loccsiLabel) &&
        Objects.equals(civicoNum, property.civicoNum) &&
        Objects.equals(nomeVia, property.nomeVia) &&
        Objects.equals(civicoSub, property.civicoSub) &&
        Objects.equals(tipoVia, property.tipoVia);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localita, comune, loccsiLabel, civicoNum, nomeVia, civicoSub, tipoVia);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Property {\n");
    
    sb.append("    localita: ").append(toIndentedString(localita)).append("\n");
    sb.append("    comune: ").append(toIndentedString(comune)).append("\n");
    sb.append("    loccsiLabel: ").append(toIndentedString(loccsiLabel)).append("\n");
    sb.append("    civicoNum: ").append(toIndentedString(civicoNum)).append("\n");
    sb.append("    nomeVia: ").append(toIndentedString(nomeVia)).append("\n");
    sb.append("    civicoSub: ").append(toIndentedString(civicoSub)).append("\n");
    sb.append("    tipoVia: ").append(toIndentedString(tipoVia)).append("\n");
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

