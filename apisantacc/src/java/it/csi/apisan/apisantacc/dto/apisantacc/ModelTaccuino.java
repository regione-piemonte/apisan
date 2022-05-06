/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.dto.apisantacc;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisantacc.dto.apisantacc.ModelNoteGenerali;
import it.csi.apisan.apisantacc.dto.apisantacc.ModelPreferenza;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelTaccuino   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private Long id = null;
  private Boolean oscurato = null;
  private ModelNoteGenerali noteGenerali = null;
  private List<ModelPreferenza> preferenze = new ArrayList<ModelPreferenza>();

  /**
   * Identificativo univoco
   **/
  
  @ApiModelProperty(value = "Identificativo univoco")
  @JsonProperty("id") 
 
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Indica se il taccuino è oscurato o meno nei confronti di terzi. Es. Operatori sanitari e deleganti con delega debole 
   **/
  
  @ApiModelProperty(value = "Indica se il taccuino è oscurato o meno nei confronti di terzi. Es. Operatori sanitari e deleganti con delega debole ")
  @JsonProperty("oscurato") 
 
  public Boolean isOscurato() {
    return oscurato;
  }
  public void setOscurato(Boolean oscurato) {
    this.oscurato = oscurato;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("note_generali") 
 
  public ModelNoteGenerali getNoteGenerali() {
    return noteGenerali;
  }
  public void setNoteGenerali(ModelNoteGenerali noteGenerali) {
    this.noteGenerali = noteGenerali;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("preferenze") 
 
  public List<ModelPreferenza> getPreferenze() {
    return preferenze;
  }
  public void setPreferenze(List<ModelPreferenza> preferenze) {
    this.preferenze = preferenze;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelTaccuino modelTaccuino = (ModelTaccuino) o;
    return Objects.equals(id, modelTaccuino.id) &&
        Objects.equals(oscurato, modelTaccuino.oscurato) &&
        Objects.equals(noteGenerali, modelTaccuino.noteGenerali) &&
        Objects.equals(preferenze, modelTaccuino.preferenze);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, oscurato, noteGenerali, preferenze);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelTaccuino {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    oscurato: ").append(toIndentedString(oscurato)).append("\n");
    sb.append("    noteGenerali: ").append(toIndentedString(noteGenerali)).append("\n");
    sb.append("    preferenze: ").append(toIndentedString(preferenze)).append("\n");
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

