/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelCategoriaTipologia;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class PayloadSearchConteggi   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private List<ModelCategoriaTipologia> categoriaTipologia = new ArrayList<ModelCategoriaTipologia>();
  private List<String> tipoConteggio = new ArrayList<String>();

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("categoria_tipologia") 
 
  public List<ModelCategoriaTipologia> getCategoriaTipologia() {
    return categoriaTipologia;
  }
  public void setCategoriaTipologia(List<ModelCategoriaTipologia> categoriaTipologia) {
    this.categoriaTipologia = categoriaTipologia;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tipo_conteggio") 
 
  public List<String> getTipoConteggio() {
    return tipoConteggio;
  }
  public void setTipoConteggio(List<String> tipoConteggio) {
    this.tipoConteggio = tipoConteggio;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayloadSearchConteggi payloadSearchConteggi = (PayloadSearchConteggi) o;
    return Objects.equals(categoriaTipologia, payloadSearchConteggi.categoriaTipologia) &&
        Objects.equals(tipoConteggio, payloadSearchConteggi.tipoConteggio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoriaTipologia, tipoConteggio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadSearchConteggi {\n");
    
    sb.append("    categoriaTipologia: ").append(toIndentedString(categoriaTipologia)).append("\n");
    sb.append("    tipoConteggio: ").append(toIndentedString(tipoConteggio)).append("\n");
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

