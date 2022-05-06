/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelCategoriaTipologia;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelEtichetta;
import java.util.Date;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelFiltroDocs   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private List<ModelCategoriaTipologia> categoriaTipologia = new ArrayList<ModelCategoriaTipologia>();
  private String tipoEpisodio = null;
  private Date dataInizio = null;
  private Date dataFine = null;
  private List<ModelEtichetta> etichettaAnatomica = new ArrayList<ModelEtichetta>();
  private List<ModelEtichetta> etichettePersonali = new ArrayList<ModelEtichetta>();

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
  @JsonProperty("tipo_episodio") 
 
  public String getTipoEpisodio() {
    return tipoEpisodio;
  }
  public void setTipoEpisodio(String tipoEpisodio) {
    this.tipoEpisodio = tipoEpisodio;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_inizio") 
 
  public Date getDataInizio() {
    return dataInizio;
  }
  public void setDataInizio(Date dataInizio) {
    this.dataInizio = dataInizio;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_fine") 
 
  public Date getDataFine() {
    return dataFine;
  }
  public void setDataFine(Date dataFine) {
    this.dataFine = dataFine;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("etichetta_anatomica") 
 
  public List<ModelEtichetta> getEtichettaAnatomica() {
    return etichettaAnatomica;
  }
  public void setEtichettaAnatomica(List<ModelEtichetta> etichettaAnatomica) {
    this.etichettaAnatomica = etichettaAnatomica;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("etichette_personali") 
 
  public List<ModelEtichetta> getEtichettePersonali() {
    return etichettePersonali;
  }
  public void setEtichettePersonali(List<ModelEtichetta> etichettePersonali) {
    this.etichettePersonali = etichettePersonali;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelFiltroDocs modelFiltroDocs = (ModelFiltroDocs) o;
    return Objects.equals(categoriaTipologia, modelFiltroDocs.categoriaTipologia) &&
        Objects.equals(tipoEpisodio, modelFiltroDocs.tipoEpisodio) &&
        Objects.equals(dataInizio, modelFiltroDocs.dataInizio) &&
        Objects.equals(dataFine, modelFiltroDocs.dataFine) &&
        Objects.equals(etichettaAnatomica, modelFiltroDocs.etichettaAnatomica) &&
        Objects.equals(etichettePersonali, modelFiltroDocs.etichettePersonali);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoriaTipologia, tipoEpisodio, dataInizio, dataFine, etichettaAnatomica, etichettePersonali);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelFiltroDocs {\n");
    
    sb.append("    categoriaTipologia: ").append(toIndentedString(categoriaTipologia)).append("\n");
    sb.append("    tipoEpisodio: ").append(toIndentedString(tipoEpisodio)).append("\n");
    sb.append("    dataInizio: ").append(toIndentedString(dataInizio)).append("\n");
    sb.append("    dataFine: ").append(toIndentedString(dataFine)).append("\n");
    sb.append("    etichettaAnatomica: ").append(toIndentedString(etichettaAnatomica)).append("\n");
    sb.append("    etichettePersonali: ").append(toIndentedString(etichettePersonali)).append("\n");
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

