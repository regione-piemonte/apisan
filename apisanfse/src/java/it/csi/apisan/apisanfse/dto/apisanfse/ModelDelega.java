/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelDelega   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String codiceServizio = null;
  private Date dataFineDelega = null;
  private Date dataInizioDelega = null;
  private String gradoDelega = null;
  private String statoDelega = null;
  private String tipoDelega = null;

  /**
   * codice del servizio della delega
   **/
  
  @ApiModelProperty(value = "codice del servizio della delega")
  @JsonProperty("codice_servizio") 
 
  public String getCodiceServizio() {
    return codiceServizio;
  }
  public void setCodiceServizio(String codiceServizio) {
    this.codiceServizio = codiceServizio;
  }

  /**
   * data fine delega
   **/
  
  @ApiModelProperty(value = "data fine delega")
  @JsonProperty("data_fine_delega") 
 
  public Date getDataFineDelega() {
    return dataFineDelega;
  }
  public void setDataFineDelega(Date dataFineDelega) {
    this.dataFineDelega = dataFineDelega;
  }

  /**
   * data fine della delega
   **/
  
  @ApiModelProperty(value = "data fine della delega")
  @JsonProperty("data_inizio_delega") 
 
  public Date getDataInizioDelega() {
    return dataInizioDelega;
  }
  public void setDataInizioDelega(Date dataInizioDelega) {
    this.dataInizioDelega = dataInizioDelega;
  }

  /**
   * grado della delega
   **/
  
  @ApiModelProperty(value = "grado della delega")
  @JsonProperty("grado_delega") 
 
  public String getGradoDelega() {
    return gradoDelega;
  }
  public void setGradoDelega(String gradoDelega) {
    this.gradoDelega = gradoDelega;
  }

  /**
   * stato della delega
   **/
  
  @ApiModelProperty(value = "stato della delega")
  @JsonProperty("stato_delega") 
 
  public String getStatoDelega() {
    return statoDelega;
  }
  public void setStatoDelega(String statoDelega) {
    this.statoDelega = statoDelega;
  }

  /**
   * tipo della delega
   **/
  
  @ApiModelProperty(value = "tipo della delega")
  @JsonProperty("tipo_delega") 
 
  public String getTipoDelega() {
    return tipoDelega;
  }
  public void setTipoDelega(String tipoDelega) {
    this.tipoDelega = tipoDelega;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelDelega modelDelega = (ModelDelega) o;
    return Objects.equals(codiceServizio, modelDelega.codiceServizio) &&
        Objects.equals(dataFineDelega, modelDelega.dataFineDelega) &&
        Objects.equals(dataInizioDelega, modelDelega.dataInizioDelega) &&
        Objects.equals(gradoDelega, modelDelega.gradoDelega) &&
        Objects.equals(statoDelega, modelDelega.statoDelega) &&
        Objects.equals(tipoDelega, modelDelega.tipoDelega);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codiceServizio, dataFineDelega, dataInizioDelega, gradoDelega, statoDelega, tipoDelega);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelDelega {\n");
    
    sb.append("    codiceServizio: ").append(toIndentedString(codiceServizio)).append("\n");
    sb.append("    dataFineDelega: ").append(toIndentedString(dataFineDelega)).append("\n");
    sb.append("    dataInizioDelega: ").append(toIndentedString(dataInizioDelega)).append("\n");
    sb.append("    gradoDelega: ").append(toIndentedString(gradoDelega)).append("\n");
    sb.append("    statoDelega: ").append(toIndentedString(statoDelega)).append("\n");
    sb.append("    tipoDelega: ").append(toIndentedString(tipoDelega)).append("\n");
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

