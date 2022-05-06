/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.dto.apisanscreen;

import java.util.Objects;
import java.util.ArrayList;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelDocumentoLista   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private Integer id = null;
  private String codice = null;
  private String fileNome = null;
  private String modelloCodice = null;
  private String modelloDescrizione = null;
  private Integer categoriaCodice = null;
  private String tipologiaScreeningCodice = null;
  private String tipologiaScreeningDescrizione = null;
  private Date dataGenerazione = null;
  private Boolean letto = null;

  /**
   * Identificativo univoco del documento
   **/
  
  @ApiModelProperty(value = "Identificativo univoco del documento")
  @JsonProperty("id") 
 
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * Il codice del documento
   **/
  
  @ApiModelProperty(value = "Il codice del documento")
  @JsonProperty("codice") 
 
  public String getCodice() {
    return codice;
  }
  public void setCodice(String codice) {
    this.codice = codice;
  }

  /**
   * Il nome del file
   **/
  
  @ApiModelProperty(value = "Il nome del file")
  @JsonProperty("file_nome") 
 
  public String getFileNome() {
    return fileNome;
  }
  public void setFileNome(String fileNome) {
    this.fileNome = fileNome;
  }

  /**
   * Il codice del modello di documento
   **/
  
  @ApiModelProperty(value = "Il codice del modello di documento")
  @JsonProperty("modello_codice") 
 
  public String getModelloCodice() {
    return modelloCodice;
  }
  public void setModelloCodice(String modelloCodice) {
    this.modelloCodice = modelloCodice;
  }

  /**
   * La descrizione del modello di documento
   **/
  
  @ApiModelProperty(value = "La descrizione del modello di documento")
  @JsonProperty("modello_descrizione") 
 
  public String getModelloDescrizione() {
    return modelloDescrizione;
  }
  public void setModelloDescrizione(String modelloDescrizione) {
    this.modelloDescrizione = modelloDescrizione;
  }

  /**
   * Il codice della categoria del documento
   **/
  
  @ApiModelProperty(value = "Il codice della categoria del documento")
  @JsonProperty("categoria_codice") 
 
  public Integer getCategoriaCodice() {
    return categoriaCodice;
  }
  public void setCategoriaCodice(Integer categoriaCodice) {
    this.categoriaCodice = categoriaCodice;
  }

  /**
   * Il codice della tipologia di screening
   **/
  
  @ApiModelProperty(value = "Il codice della tipologia di screening")
  @JsonProperty("tipologia_screening_codice") 
 
  public String getTipologiaScreeningCodice() {
    return tipologiaScreeningCodice;
  }
  public void setTipologiaScreeningCodice(String tipologiaScreeningCodice) {
    this.tipologiaScreeningCodice = tipologiaScreeningCodice;
  }

  /**
   * La descrizione della tipologia di screening
   **/
  
  @ApiModelProperty(value = "La descrizione della tipologia di screening")
  @JsonProperty("tipologia_screening_descrizione") 
 
  public String getTipologiaScreeningDescrizione() {
    return tipologiaScreeningDescrizione;
  }
  public void setTipologiaScreeningDescrizione(String tipologiaScreeningDescrizione) {
    this.tipologiaScreeningDescrizione = tipologiaScreeningDescrizione;
  }

  /**
   * La data in cui è stato generato il file
   **/
  
  @ApiModelProperty(value = "La data in cui è stato generato il file")
  @JsonProperty("data_generazione") 
 
  public Date getDataGenerazione() {
    return dataGenerazione;
  }
  public void setDataGenerazione(Date dataGenerazione) {
    this.dataGenerazione = dataGenerazione;
  }

  /**
   * Indica se il documento è stato aperto o meno
   **/
  
  @ApiModelProperty(value = "Indica se il documento è stato aperto o meno")
  @JsonProperty("letto") 
 
  public Boolean isLetto() {
    return letto;
  }
  public void setLetto(Boolean letto) {
    this.letto = letto;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelDocumentoLista modelDocumentoLista = (ModelDocumentoLista) o;
    return Objects.equals(id, modelDocumentoLista.id) &&
        Objects.equals(codice, modelDocumentoLista.codice) &&
        Objects.equals(fileNome, modelDocumentoLista.fileNome) &&
        Objects.equals(modelloCodice, modelDocumentoLista.modelloCodice) &&
        Objects.equals(modelloDescrizione, modelDocumentoLista.modelloDescrizione) &&
        Objects.equals(categoriaCodice, modelDocumentoLista.categoriaCodice) &&
        Objects.equals(tipologiaScreeningCodice, modelDocumentoLista.tipologiaScreeningCodice) &&
        Objects.equals(tipologiaScreeningDescrizione, modelDocumentoLista.tipologiaScreeningDescrizione) &&
        Objects.equals(dataGenerazione, modelDocumentoLista.dataGenerazione) &&
        Objects.equals(letto, modelDocumentoLista.letto);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, codice, fileNome, modelloCodice, modelloDescrizione, categoriaCodice, tipologiaScreeningCodice, tipologiaScreeningDescrizione, dataGenerazione, letto);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelDocumentoLista {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    codice: ").append(toIndentedString(codice)).append("\n");
    sb.append("    fileNome: ").append(toIndentedString(fileNome)).append("\n");
    sb.append("    modelloCodice: ").append(toIndentedString(modelloCodice)).append("\n");
    sb.append("    modelloDescrizione: ").append(toIndentedString(modelloDescrizione)).append("\n");
    sb.append("    categoriaCodice: ").append(toIndentedString(categoriaCodice)).append("\n");
    sb.append("    tipologiaScreeningCodice: ").append(toIndentedString(tipologiaScreeningCodice)).append("\n");
    sb.append("    tipologiaScreeningDescrizione: ").append(toIndentedString(tipologiaScreeningDescrizione)).append("\n");
    sb.append("    dataGenerazione: ").append(toIndentedString(dataGenerazione)).append("\n");
    sb.append("    letto: ").append(toIndentedString(letto)).append("\n");
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

