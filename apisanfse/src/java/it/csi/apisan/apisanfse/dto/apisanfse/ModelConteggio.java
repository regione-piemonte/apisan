/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelEtichettaNumeroDocumenti;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelConteggio   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private Integer numeroDocumentiTotali = null;
  private List<ModelEtichettaNumeroDocumenti> etichetteNumeroDocumenti = new ArrayList<ModelEtichettaNumeroDocumenti>();
  private Integer numeroDocumentiSenzaEtichette = null;
  private Integer numeroEpisodi = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("numero_documenti_totali") 
 
  public Integer getNumeroDocumentiTotali() {
    return numeroDocumentiTotali;
  }
  public void setNumeroDocumentiTotali(Integer numeroDocumentiTotali) {
    this.numeroDocumentiTotali = numeroDocumentiTotali;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("etichette_numero_documenti") 
 
  public List<ModelEtichettaNumeroDocumenti> getEtichetteNumeroDocumenti() {
    return etichetteNumeroDocumenti;
  }
  public void setEtichetteNumeroDocumenti(List<ModelEtichettaNumeroDocumenti> etichetteNumeroDocumenti) {
    this.etichetteNumeroDocumenti = etichetteNumeroDocumenti;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("numero_documenti_senza_etichette") 
 
  public Integer getNumeroDocumentiSenzaEtichette() {
    return numeroDocumentiSenzaEtichette;
  }
  public void setNumeroDocumentiSenzaEtichette(Integer numeroDocumentiSenzaEtichette) {
    this.numeroDocumentiSenzaEtichette = numeroDocumentiSenzaEtichette;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("numero_episodi") 
 
  public Integer getNumeroEpisodi() {
    return numeroEpisodi;
  }
  public void setNumeroEpisodi(Integer numeroEpisodi) {
    this.numeroEpisodi = numeroEpisodi;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelConteggio modelConteggio = (ModelConteggio) o;
    return Objects.equals(numeroDocumentiTotali, modelConteggio.numeroDocumentiTotali) &&
        Objects.equals(etichetteNumeroDocumenti, modelConteggio.etichetteNumeroDocumenti) &&
        Objects.equals(numeroDocumentiSenzaEtichette, modelConteggio.numeroDocumentiSenzaEtichette) &&
        Objects.equals(numeroEpisodi, modelConteggio.numeroEpisodi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numeroDocumentiTotali, etichetteNumeroDocumenti, numeroDocumentiSenzaEtichette, numeroEpisodi);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelConteggio {\n");
    
    sb.append("    numeroDocumentiTotali: ").append(toIndentedString(numeroDocumentiTotali)).append("\n");
    sb.append("    etichetteNumeroDocumenti: ").append(toIndentedString(etichetteNumeroDocumenti)).append("\n");
    sb.append("    numeroDocumentiSenzaEtichette: ").append(toIndentedString(numeroDocumentiSenzaEtichette)).append("\n");
    sb.append("    numeroEpisodi: ").append(toIndentedString(numeroEpisodi)).append("\n");
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

