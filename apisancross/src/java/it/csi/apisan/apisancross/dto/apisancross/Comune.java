/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancross.dto.apisancross;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisancross.dto.apisancross.Provincia;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class Comune   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String codiceIstat = null;
  private String desc = null;
  private String codiceCatasto = null;
  private String codiceCap = null;
  private Date dataInizioValidita = null;
  private Date dataFineValidita = null;
  private Provincia provincia = null;

  /**
   * codice istat del comune
   **/
  
  @ApiModelProperty(value = "codice istat del comune")
  @JsonProperty("codice_istat") 
 
  public String getCodiceIstat() {
    return codiceIstat;
  }
  public void setCodiceIstat(String codiceIstat) {
    this.codiceIstat = codiceIstat;
  }

  /**
   * denominazione del comune
   **/
  
  @ApiModelProperty(value = "denominazione del comune")
  @JsonProperty("desc") 
 
  public String getDesc() {
    return desc;
  }
  public void setDesc(String desc) {
    this.desc = desc;
  }

  /**
   * codice catastale del comune
   **/
  
  @ApiModelProperty(value = "codice catastale del comune")
  @JsonProperty("codice_catasto") 
 
  public String getCodiceCatasto() {
    return codiceCatasto;
  }
  public void setCodiceCatasto(String codiceCatasto) {
    this.codiceCatasto = codiceCatasto;
  }

  /**
   * cap del comune
   **/
  
  @ApiModelProperty(value = "cap del comune")
  @JsonProperty("codice_cap") 
 
  public String getCodiceCap() {
    return codiceCap;
  }
  public void setCodiceCap(String codiceCap) {
    this.codiceCap = codiceCap;
  }

  /**
   * data inizio validita
   **/
  
  @ApiModelProperty(value = "data inizio validita")
  @JsonProperty("data_inizio_validita") 
 
  public Date getDataInizioValidita() {
    return dataInizioValidita;
  }
  public void setDataInizioValidita(Date dataInizioValidita) {
    this.dataInizioValidita = dataInizioValidita;
  }

  /**
   * data fine validita
   **/
  
  @ApiModelProperty(value = "data fine validita")
  @JsonProperty("data_fine_validita") 
 
  public Date getDataFineValidita() {
    return dataFineValidita;
  }
  public void setDataFineValidita(Date dataFineValidita) {
    this.dataFineValidita = dataFineValidita;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("provincia") 
 
  public Provincia getProvincia() {
    return provincia;
  }
  public void setProvincia(Provincia provincia) {
    this.provincia = provincia;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Comune comune = (Comune) o;
    return Objects.equals(codiceIstat, comune.codiceIstat) &&
        Objects.equals(desc, comune.desc) &&
        Objects.equals(codiceCatasto, comune.codiceCatasto) &&
        Objects.equals(codiceCap, comune.codiceCap) &&
        Objects.equals(dataInizioValidita, comune.dataInizioValidita) &&
        Objects.equals(dataFineValidita, comune.dataFineValidita) &&
        Objects.equals(provincia, comune.provincia);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codiceIstat, desc, codiceCatasto, codiceCap, dataInizioValidita, dataFineValidita, provincia);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Comune {\n");
    
    sb.append("    codiceIstat: ").append(toIndentedString(codiceIstat)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    codiceCatasto: ").append(toIndentedString(codiceCatasto)).append("\n");
    sb.append("    codiceCap: ").append(toIndentedString(codiceCap)).append("\n");
    sb.append("    dataInizioValidita: ").append(toIndentedString(dataInizioValidita)).append("\n");
    sb.append("    dataFineValidita: ").append(toIndentedString(dataFineValidita)).append("\n");
    sb.append("    provincia: ").append(toIndentedString(provincia)).append("\n");
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

