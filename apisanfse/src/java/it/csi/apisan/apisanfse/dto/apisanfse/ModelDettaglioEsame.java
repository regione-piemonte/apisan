/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanfse.dto.apisanfse.Codifica;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelGiudizioDiagnostico;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelIndicazioneFinale;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelInterventoErogato;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelRefertoClismaOpaco;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelRefertoColonscopia;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelDettaglioEsame   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private List<Codifica> prestazioni = new ArrayList<Codifica>();
  private List<ModelGiudizioDiagnostico> giudiziDiagnostici = new ArrayList<ModelGiudizioDiagnostico>();
  private ModelIndicazioneFinale indicazioneFinale = null;
  private ModelInterventoErogato interventoErogato = null;
  private ModelRefertoColonscopia refertoColonscopia = null;
  private ModelRefertoClismaOpaco refertoClismaOpaco = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("prestazioni") 
 
  public List<Codifica> getPrestazioni() {
    return prestazioni;
  }
  public void setPrestazioni(List<Codifica> prestazioni) {
    this.prestazioni = prestazioni;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("giudizi_diagnostici") 
 
  public List<ModelGiudizioDiagnostico> getGiudiziDiagnostici() {
    return giudiziDiagnostici;
  }
  public void setGiudiziDiagnostici(List<ModelGiudizioDiagnostico> giudiziDiagnostici) {
    this.giudiziDiagnostici = giudiziDiagnostici;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("indicazione_finale") 
 
  public ModelIndicazioneFinale getIndicazioneFinale() {
    return indicazioneFinale;
  }
  public void setIndicazioneFinale(ModelIndicazioneFinale indicazioneFinale) {
    this.indicazioneFinale = indicazioneFinale;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("intervento_erogato") 
 
  public ModelInterventoErogato getInterventoErogato() {
    return interventoErogato;
  }
  public void setInterventoErogato(ModelInterventoErogato interventoErogato) {
    this.interventoErogato = interventoErogato;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("referto_colonscopia") 
 
  public ModelRefertoColonscopia getRefertoColonscopia() {
    return refertoColonscopia;
  }
  public void setRefertoColonscopia(ModelRefertoColonscopia refertoColonscopia) {
    this.refertoColonscopia = refertoColonscopia;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("referto_clisma_opaco") 
 
  public ModelRefertoClismaOpaco getRefertoClismaOpaco() {
    return refertoClismaOpaco;
  }
  public void setRefertoClismaOpaco(ModelRefertoClismaOpaco refertoClismaOpaco) {
    this.refertoClismaOpaco = refertoClismaOpaco;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelDettaglioEsame modelDettaglioEsame = (ModelDettaglioEsame) o;
    return Objects.equals(prestazioni, modelDettaglioEsame.prestazioni) &&
        Objects.equals(giudiziDiagnostici, modelDettaglioEsame.giudiziDiagnostici) &&
        Objects.equals(indicazioneFinale, modelDettaglioEsame.indicazioneFinale) &&
        Objects.equals(interventoErogato, modelDettaglioEsame.interventoErogato) &&
        Objects.equals(refertoColonscopia, modelDettaglioEsame.refertoColonscopia) &&
        Objects.equals(refertoClismaOpaco, modelDettaglioEsame.refertoClismaOpaco);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prestazioni, giudiziDiagnostici, indicazioneFinale, interventoErogato, refertoColonscopia, refertoClismaOpaco);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelDettaglioEsame {\n");
    
    sb.append("    prestazioni: ").append(toIndentedString(prestazioni)).append("\n");
    sb.append("    giudiziDiagnostici: ").append(toIndentedString(giudiziDiagnostici)).append("\n");
    sb.append("    indicazioneFinale: ").append(toIndentedString(indicazioneFinale)).append("\n");
    sb.append("    interventoErogato: ").append(toIndentedString(interventoErogato)).append("\n");
    sb.append("    refertoColonscopia: ").append(toIndentedString(refertoColonscopia)).append("\n");
    sb.append("    refertoClismaOpaco: ").append(toIndentedString(refertoClismaOpaco)).append("\n");
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

