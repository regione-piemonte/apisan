/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanfse.dto.apisanfse.Giudizio;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelMedicoScreening;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelIndicazioneFinale   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private Giudizio giudizio = null;
  private List<ModelMedicoScreening> medici = new ArrayList<ModelMedicoScreening>();

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("giudizio") 
 
  public Giudizio getGiudizio() {
    return giudizio;
  }
  public void setGiudizio(Giudizio giudizio) {
    this.giudizio = giudizio;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("medici") 
 
  public List<ModelMedicoScreening> getMedici() {
    return medici;
  }
  public void setMedici(List<ModelMedicoScreening> medici) {
    this.medici = medici;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelIndicazioneFinale modelIndicazioneFinale = (ModelIndicazioneFinale) o;
    return Objects.equals(giudizio, modelIndicazioneFinale.giudizio) &&
        Objects.equals(medici, modelIndicazioneFinale.medici);
  }

  @Override
  public int hashCode() {
    return Objects.hash(giudizio, medici);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelIndicazioneFinale {\n");
    
    sb.append("    giudizio: ").append(toIndentedString(giudizio)).append("\n");
    sb.append("    medici: ").append(toIndentedString(medici)).append("\n");
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

