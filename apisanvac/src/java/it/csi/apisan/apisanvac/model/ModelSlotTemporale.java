/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Rappresenta uno slot temporale")

public class ModelSlotTemporale   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String dataAppuntamento = null;
  private String codiceAmbulatorio = null;
  private String descrizione = null;

  /**
   * Data dell&#39;appuntamento
   **/
  
  @ApiModelProperty(example = "2019-09-23T09:00:00", required = true, value = "Data dell'appuntamento")
  @JsonProperty("data_appuntamento") 
 
  @NotNull
  public String getDataAppuntamento() {
    return dataAppuntamento;
  }
  public void setDataAppuntamento(String dataAppuntamento) {
    this.dataAppuntamento = dataAppuntamento;
  }

  /**
   * il codice dell&#39;ambulatorio
   **/
  
  @ApiModelProperty(required = true, value = "il codice dell'ambulatorio")
  @JsonProperty("codice_ambulatorio") 
 
  @NotNull
  public String getCodiceAmbulatorio() {
    return codiceAmbulatorio;
  }
  public void setCodiceAmbulatorio(String codiceAmbulatorio) {
    this.codiceAmbulatorio = codiceAmbulatorio;
  }

  /**
   * descrizione
   **/
  
  @ApiModelProperty(value = "descrizione")
  @JsonProperty("descrizione") 
 
  public String getDescrizione() {
    return descrizione;
  }
  public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelSlotTemporale modelSlotTemporale = (ModelSlotTemporale) o;
    return Objects.equals(dataAppuntamento, modelSlotTemporale.dataAppuntamento) &&
        Objects.equals(codiceAmbulatorio, modelSlotTemporale.codiceAmbulatorio) &&
        Objects.equals(descrizione, modelSlotTemporale.descrizione);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataAppuntamento, codiceAmbulatorio, descrizione);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelSlotTemporale {\n");
    
    sb.append("    dataAppuntamento: ").append(toIndentedString(dataAppuntamento)).append("\n");
    sb.append("    codiceAmbulatorio: ").append(toIndentedString(codiceAmbulatorio)).append("\n");
    sb.append("    descrizione: ").append(toIndentedString(descrizione)).append("\n");
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

