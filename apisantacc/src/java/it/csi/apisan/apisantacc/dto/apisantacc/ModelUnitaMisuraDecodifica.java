/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.dto.apisantacc;

import java.util.Objects;
import java.util.ArrayList;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelUnitaMisuraDecodifica   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String entitaCodice = null;
  private String gruppoCodice = null;
  private String descrittoreCodice = null;
  private String descrittoreDescrizione = null;
  private String descrittoreDescrizioneEstesa = null;
  private String unitaMisuraCodice = null;
  private String unitaMisuraDescrizione = null;

  /**
   * Descrizione entita
   **/
  
  @ApiModelProperty(value = "Descrizione entita")
  @JsonProperty("entita_codice") 
 
  public String getEntitaCodice() {
    return entitaCodice;
  }
  public void setEntitaCodice(String entitaCodice) {
    this.entitaCodice = entitaCodice;
  }

  /**
   * Descrizione del Gruppo
   **/
  
  @ApiModelProperty(value = "Descrizione del Gruppo")
  @JsonProperty("gruppo_codice") 
 
  public String getGruppoCodice() {
    return gruppoCodice;
  }
  public void setGruppoCodice(String gruppoCodice) {
    this.gruppoCodice = gruppoCodice;
  }

  /**
   * Codice del tipo di misurazione
   **/
  
  @ApiModelProperty(value = "Codice del tipo di misurazione")
  @JsonProperty("descrittore_codice") 
 
  public String getDescrittoreCodice() {
    return descrittoreCodice;
  }
  public void setDescrittoreCodice(String descrittoreCodice) {
    this.descrittoreCodice = descrittoreCodice;
  }

  /**
   * Descrizione del tipo di misurazione
   **/
  
  @ApiModelProperty(value = "Descrizione del tipo di misurazione")
  @JsonProperty("descrittore_descrizione") 
 
  public String getDescrittoreDescrizione() {
    return descrittoreDescrizione;
  }
  public void setDescrittoreDescrizione(String descrittoreDescrizione) {
    this.descrittoreDescrizione = descrittoreDescrizione;
  }

  /**
   * Descrizione del tipo di misurazione estesa
   **/
  
  @ApiModelProperty(value = "Descrizione del tipo di misurazione estesa")
  @JsonProperty("descrittore_descrizione_estesa") 
 
  public String getDescrittoreDescrizioneEstesa() {
    return descrittoreDescrizioneEstesa;
  }
  public void setDescrittoreDescrizioneEstesa(String descrittoreDescrizioneEstesa) {
    this.descrittoreDescrizioneEstesa = descrittoreDescrizioneEstesa;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("unita_misura_codice") 
 
  public String getUnitaMisuraCodice() {
    return unitaMisuraCodice;
  }
  public void setUnitaMisuraCodice(String unitaMisuraCodice) {
    this.unitaMisuraCodice = unitaMisuraCodice;
  }

  /**
   * Descrizione unita di misurazione
   **/
  
  @ApiModelProperty(value = "Descrizione unita di misurazione")
  @JsonProperty("unita_misura_descrizione") 
 
  public String getUnitaMisuraDescrizione() {
    return unitaMisuraDescrizione;
  }
  public void setUnitaMisuraDescrizione(String unitaMisuraDescrizione) {
    this.unitaMisuraDescrizione = unitaMisuraDescrizione;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelUnitaMisuraDecodifica modelUnitaMisuraDecodifica = (ModelUnitaMisuraDecodifica) o;
    return Objects.equals(entitaCodice, modelUnitaMisuraDecodifica.entitaCodice) &&
        Objects.equals(gruppoCodice, modelUnitaMisuraDecodifica.gruppoCodice) &&
        Objects.equals(descrittoreCodice, modelUnitaMisuraDecodifica.descrittoreCodice) &&
        Objects.equals(descrittoreDescrizione, modelUnitaMisuraDecodifica.descrittoreDescrizione) &&
        Objects.equals(descrittoreDescrizioneEstesa, modelUnitaMisuraDecodifica.descrittoreDescrizioneEstesa) &&
        Objects.equals(unitaMisuraCodice, modelUnitaMisuraDecodifica.unitaMisuraCodice) &&
        Objects.equals(unitaMisuraDescrizione, modelUnitaMisuraDecodifica.unitaMisuraDescrizione);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entitaCodice, gruppoCodice, descrittoreCodice, descrittoreDescrizione, descrittoreDescrizioneEstesa, unitaMisuraCodice, unitaMisuraDescrizione);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelUnitaMisuraDecodifica {\n");
    
    sb.append("    entitaCodice: ").append(toIndentedString(entitaCodice)).append("\n");
    sb.append("    gruppoCodice: ").append(toIndentedString(gruppoCodice)).append("\n");
    sb.append("    descrittoreCodice: ").append(toIndentedString(descrittoreCodice)).append("\n");
    sb.append("    descrittoreDescrizione: ").append(toIndentedString(descrittoreDescrizione)).append("\n");
    sb.append("    descrittoreDescrizioneEstesa: ").append(toIndentedString(descrittoreDescrizioneEstesa)).append("\n");
    sb.append("    unitaMisuraCodice: ").append(toIndentedString(unitaMisuraCodice)).append("\n");
    sb.append("    unitaMisuraDescrizione: ").append(toIndentedString(unitaMisuraDescrizione)).append("\n");
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

