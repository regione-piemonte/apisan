/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Rappresenta un documento")

public class ModelDocumento   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String id = null;
  private String descrizione = null;
  private String nomeDocumento = null;
  private String tipologia = null;
  private String soggettoEmittente = null;
  private String statoDocumentoId = null;
  private String statoDocumentoDescrizione = null;
  private String dataArchiviazione = null;

  /**
   * Identificativo univoco
   **/
  
  @ApiModelProperty(value = "Identificativo univoco")
  @JsonProperty("id") 
 
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Descrizione del documento
   **/
  
  @ApiModelProperty(value = "Descrizione del documento")
  @JsonProperty("descrizione") 
 
  public String getDescrizione() {
    return descrizione;
  }
  public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
  }

  /**
   * Il nome del file
   **/
  
  @ApiModelProperty(example = "certificato.crt", value = "Il nome del file")
  @JsonProperty("nome_documento") 
 
  public String getNomeDocumento() {
    return nomeDocumento;
  }
  public void setNomeDocumento(String nomeDocumento) {
    this.nomeDocumento = nomeDocumento;
  }

  /**
   * La tipologia del documento
   **/
  
  @ApiModelProperty(example = "CERTIFICATO", value = "La tipologia del documento")
  @JsonProperty("tipologia") 
 
  public String getTipologia() {
    return tipologia;
  }
  public void setTipologia(String tipologia) {
    this.tipologia = tipologia;
  }

  /**
   * Il soggetto che ha emesso il documento
   **/
  
  @ApiModelProperty(example = "Comune di torino", value = "Il soggetto che ha emesso il documento")
  @JsonProperty("soggetto_emittente") 
 
  public String getSoggettoEmittente() {
    return soggettoEmittente;
  }
  public void setSoggettoEmittente(String soggettoEmittente) {
    this.soggettoEmittente = soggettoEmittente;
  }

  /**
   * Identificativo dello stato del documento
   **/
  
  @ApiModelProperty(value = "Identificativo dello stato del documento")
  @JsonProperty("stato_documento_id") 
 
  public String getStatoDocumentoId() {
    return statoDocumentoId;
  }
  public void setStatoDocumentoId(String statoDocumentoId) {
    this.statoDocumentoId = statoDocumentoId;
  }

  /**
   * Descrizione dello stato attuale
   **/
  
  @ApiModelProperty(value = "Descrizione dello stato attuale")
  @JsonProperty("stato_documento_descrizione") 
 
  public String getStatoDocumentoDescrizione() {
    return statoDocumentoDescrizione;
  }
  public void setStatoDocumentoDescrizione(String statoDocumentoDescrizione) {
    this.statoDocumentoDescrizione = statoDocumentoDescrizione;
  }

  /**
   * La data in cui viene caricato il documento
   **/
  
  @ApiModelProperty(example = "2019-11-08T09:21:38.739Z", value = "La data in cui viene caricato il documento")
  @JsonProperty("data_archiviazione") 
 
  public String getDataArchiviazione() {
    return dataArchiviazione;
  }
  public void setDataArchiviazione(String dataArchiviazione) {
    this.dataArchiviazione = dataArchiviazione;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelDocumento modelDocumento = (ModelDocumento) o;
    return Objects.equals(id, modelDocumento.id) &&
        Objects.equals(descrizione, modelDocumento.descrizione) &&
        Objects.equals(nomeDocumento, modelDocumento.nomeDocumento) &&
        Objects.equals(tipologia, modelDocumento.tipologia) &&
        Objects.equals(soggettoEmittente, modelDocumento.soggettoEmittente) &&
        Objects.equals(statoDocumentoId, modelDocumento.statoDocumentoId) &&
        Objects.equals(statoDocumentoDescrizione, modelDocumento.statoDocumentoDescrizione) &&
        Objects.equals(dataArchiviazione, modelDocumento.dataArchiviazione);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, descrizione, nomeDocumento, tipologia, soggettoEmittente, statoDocumentoId, statoDocumentoDescrizione, dataArchiviazione);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelDocumento {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    descrizione: ").append(toIndentedString(descrizione)).append("\n");
    sb.append("    nomeDocumento: ").append(toIndentedString(nomeDocumento)).append("\n");
    sb.append("    tipologia: ").append(toIndentedString(tipologia)).append("\n");
    sb.append("    soggettoEmittente: ").append(toIndentedString(soggettoEmittente)).append("\n");
    sb.append("    statoDocumentoId: ").append(toIndentedString(statoDocumentoId)).append("\n");
    sb.append("    statoDocumentoDescrizione: ").append(toIndentedString(statoDocumentoDescrizione)).append("\n");
    sb.append("    dataArchiviazione: ").append(toIndentedString(dataArchiviazione)).append("\n");
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

