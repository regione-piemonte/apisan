/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelScreeningPolipo;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelRefertoColonscopia   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String colonscopiaInDH = null;
  private String visionePulizia = null;
  private String sedeRaggiunta = null;
  private String colonscopiaNonCompleta = null;
  private String motivo = null;
  private String presenzaPolipi = null;
  private String presenzaLesioneSospettaPerCA = null;
  private String necessitaSupportoFarmacologico = null;
  private String altreAnomalieRilevate = null;
  private String complicanzeImmediate = null;
  private String necessitaAssistenzaOspedaliera = null;
  private List<ModelScreeningPolipo> polipi = new ArrayList<ModelScreeningPolipo>();

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("colonscopia_in_DH") 
 
  public String getColonscopiaInDH() {
    return colonscopiaInDH;
  }
  public void setColonscopiaInDH(String colonscopiaInDH) {
    this.colonscopiaInDH = colonscopiaInDH;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("visione_pulizia") 
 
  public String getVisionePulizia() {
    return visionePulizia;
  }
  public void setVisionePulizia(String visionePulizia) {
    this.visionePulizia = visionePulizia;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sede_raggiunta") 
 
  public String getSedeRaggiunta() {
    return sedeRaggiunta;
  }
  public void setSedeRaggiunta(String sedeRaggiunta) {
    this.sedeRaggiunta = sedeRaggiunta;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("colonscopia_non_completa") 
 
  public String getColonscopiaNonCompleta() {
    return colonscopiaNonCompleta;
  }
  public void setColonscopiaNonCompleta(String colonscopiaNonCompleta) {
    this.colonscopiaNonCompleta = colonscopiaNonCompleta;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("motivo") 
 
  public String getMotivo() {
    return motivo;
  }
  public void setMotivo(String motivo) {
    this.motivo = motivo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("presenza_polipi") 
 
  public String getPresenzaPolipi() {
    return presenzaPolipi;
  }
  public void setPresenzaPolipi(String presenzaPolipi) {
    this.presenzaPolipi = presenzaPolipi;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("presenzaLesione_sospetta_per_CA") 
 
  public String getPresenzaLesioneSospettaPerCA() {
    return presenzaLesioneSospettaPerCA;
  }
  public void setPresenzaLesioneSospettaPerCA(String presenzaLesioneSospettaPerCA) {
    this.presenzaLesioneSospettaPerCA = presenzaLesioneSospettaPerCA;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("necessita_supporto_farmacologico") 
 
  public String getNecessitaSupportoFarmacologico() {
    return necessitaSupportoFarmacologico;
  }
  public void setNecessitaSupportoFarmacologico(String necessitaSupportoFarmacologico) {
    this.necessitaSupportoFarmacologico = necessitaSupportoFarmacologico;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("altre_anomalie_rilevate") 
 
  public String getAltreAnomalieRilevate() {
    return altreAnomalieRilevate;
  }
  public void setAltreAnomalieRilevate(String altreAnomalieRilevate) {
    this.altreAnomalieRilevate = altreAnomalieRilevate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("complicanze_immediate") 
 
  public String getComplicanzeImmediate() {
    return complicanzeImmediate;
  }
  public void setComplicanzeImmediate(String complicanzeImmediate) {
    this.complicanzeImmediate = complicanzeImmediate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("necessita_Assistenza_Ospedaliera") 
 
  public String getNecessitaAssistenzaOspedaliera() {
    return necessitaAssistenzaOspedaliera;
  }
  public void setNecessitaAssistenzaOspedaliera(String necessitaAssistenzaOspedaliera) {
    this.necessitaAssistenzaOspedaliera = necessitaAssistenzaOspedaliera;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("polipi") 
 
  public List<ModelScreeningPolipo> getPolipi() {
    return polipi;
  }
  public void setPolipi(List<ModelScreeningPolipo> polipi) {
    this.polipi = polipi;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelRefertoColonscopia modelRefertoColonscopia = (ModelRefertoColonscopia) o;
    return Objects.equals(colonscopiaInDH, modelRefertoColonscopia.colonscopiaInDH) &&
        Objects.equals(visionePulizia, modelRefertoColonscopia.visionePulizia) &&
        Objects.equals(sedeRaggiunta, modelRefertoColonscopia.sedeRaggiunta) &&
        Objects.equals(colonscopiaNonCompleta, modelRefertoColonscopia.colonscopiaNonCompleta) &&
        Objects.equals(motivo, modelRefertoColonscopia.motivo) &&
        Objects.equals(presenzaPolipi, modelRefertoColonscopia.presenzaPolipi) &&
        Objects.equals(presenzaLesioneSospettaPerCA, modelRefertoColonscopia.presenzaLesioneSospettaPerCA) &&
        Objects.equals(necessitaSupportoFarmacologico, modelRefertoColonscopia.necessitaSupportoFarmacologico) &&
        Objects.equals(altreAnomalieRilevate, modelRefertoColonscopia.altreAnomalieRilevate) &&
        Objects.equals(complicanzeImmediate, modelRefertoColonscopia.complicanzeImmediate) &&
        Objects.equals(necessitaAssistenzaOspedaliera, modelRefertoColonscopia.necessitaAssistenzaOspedaliera) &&
        Objects.equals(polipi, modelRefertoColonscopia.polipi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(colonscopiaInDH, visionePulizia, sedeRaggiunta, colonscopiaNonCompleta, motivo, presenzaPolipi, presenzaLesioneSospettaPerCA, necessitaSupportoFarmacologico, altreAnomalieRilevate, complicanzeImmediate, necessitaAssistenzaOspedaliera, polipi);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelRefertoColonscopia {\n");
    
    sb.append("    colonscopiaInDH: ").append(toIndentedString(colonscopiaInDH)).append("\n");
    sb.append("    visionePulizia: ").append(toIndentedString(visionePulizia)).append("\n");
    sb.append("    sedeRaggiunta: ").append(toIndentedString(sedeRaggiunta)).append("\n");
    sb.append("    colonscopiaNonCompleta: ").append(toIndentedString(colonscopiaNonCompleta)).append("\n");
    sb.append("    motivo: ").append(toIndentedString(motivo)).append("\n");
    sb.append("    presenzaPolipi: ").append(toIndentedString(presenzaPolipi)).append("\n");
    sb.append("    presenzaLesioneSospettaPerCA: ").append(toIndentedString(presenzaLesioneSospettaPerCA)).append("\n");
    sb.append("    necessitaSupportoFarmacologico: ").append(toIndentedString(necessitaSupportoFarmacologico)).append("\n");
    sb.append("    altreAnomalieRilevate: ").append(toIndentedString(altreAnomalieRilevate)).append("\n");
    sb.append("    complicanzeImmediate: ").append(toIndentedString(complicanzeImmediate)).append("\n");
    sb.append("    necessitaAssistenzaOspedaliera: ").append(toIndentedString(necessitaAssistenzaOspedaliera)).append("\n");
    sb.append("    polipi: ").append(toIndentedString(polipi)).append("\n");
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

