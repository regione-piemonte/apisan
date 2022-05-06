/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanfse.dto.apisanfse.Codifica;
import it.csi.apisan.apisanfse.dto.apisanfse.StrutturaSanitaria;
import java.util.Date;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelInterventoErogato   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private Date data = null;
  private List<Codifica> trattamenti = new ArrayList<Codifica>();
  private StrutturaSanitaria strutturaSanitaria = null;
  private String esito = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data") 
 
  public Date getData() {
    return data;
  }
  public void setData(Date data) {
    this.data = data;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("trattamenti") 
 
  public List<Codifica> getTrattamenti() {
    return trattamenti;
  }
  public void setTrattamenti(List<Codifica> trattamenti) {
    this.trattamenti = trattamenti;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("struttura_sanitaria") 
 
  public StrutturaSanitaria getStrutturaSanitaria() {
    return strutturaSanitaria;
  }
  public void setStrutturaSanitaria(StrutturaSanitaria strutturaSanitaria) {
    this.strutturaSanitaria = strutturaSanitaria;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("esito") 
 
  public String getEsito() {
    return esito;
  }
  public void setEsito(String esito) {
    this.esito = esito;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelInterventoErogato modelInterventoErogato = (ModelInterventoErogato) o;
    return Objects.equals(data, modelInterventoErogato.data) &&
        Objects.equals(trattamenti, modelInterventoErogato.trattamenti) &&
        Objects.equals(strutturaSanitaria, modelInterventoErogato.strutturaSanitaria) &&
        Objects.equals(esito, modelInterventoErogato.esito);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, trattamenti, strutturaSanitaria, esito);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelInterventoErogato {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    trattamenti: ").append(toIndentedString(trattamenti)).append("\n");
    sb.append("    strutturaSanitaria: ").append(toIndentedString(strutturaSanitaria)).append("\n");
    sb.append("    esito: ").append(toIndentedString(esito)).append("\n");
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

