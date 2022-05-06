/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanfse.dto.apisanfse.Codifica;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelEsameScreening;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelPaziente;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelInformazioniSistemiScreening   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private Codifica tipo = null;
  private ModelPaziente paziente = null;
  private List<ModelEsameScreening> esami = new ArrayList<ModelEsameScreening>();

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tipo") 
 
  public Codifica getTipo() {
    return tipo;
  }
  public void setTipo(Codifica tipo) {
    this.tipo = tipo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("paziente") 
 
  public ModelPaziente getPaziente() {
    return paziente;
  }
  public void setPaziente(ModelPaziente paziente) {
    this.paziente = paziente;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("esami") 
 
  public List<ModelEsameScreening> getEsami() {
    return esami;
  }
  public void setEsami(List<ModelEsameScreening> esami) {
    this.esami = esami;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelInformazioniSistemiScreening modelInformazioniSistemiScreening = (ModelInformazioniSistemiScreening) o;
    return Objects.equals(tipo, modelInformazioniSistemiScreening.tipo) &&
        Objects.equals(paziente, modelInformazioniSistemiScreening.paziente) &&
        Objects.equals(esami, modelInformazioniSistemiScreening.esami);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tipo, paziente, esami);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelInformazioniSistemiScreening {\n");
    
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    paziente: ").append(toIndentedString(paziente)).append("\n");
    sb.append("    esami: ").append(toIndentedString(esami)).append("\n");
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

