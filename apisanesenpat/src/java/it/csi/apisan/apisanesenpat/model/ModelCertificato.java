/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesenpat.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import it.csi.apisan.apisanesenpat.model.ModelCittadino;
import it.csi.apisan.apisanesenpat.model.ModelEsenzioneMalattia;
import it.csi.apisan.apisanesenpat.model.ModelEsenzioneTipologia;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Rappresenta il certificato di malattia ")

public class ModelCertificato   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String id = null;
  private Boolean utilizzabile = null;
  private String dataInserimento = null;
  private String dataAggiornamento = null;
  private String dataScadenza = null;
  private String esenzioneId = null;
  private ModelEsenzioneTipologia tipologiaEsenzione = null;
  private ModelEsenzioneMalattia malattia = null;
  private ModelCittadino inseritoDa = null;

  /**
   * Un identificativo univoco per il certificato
   **/
  
  @ApiModelProperty(required = true, value = "Un identificativo univoco per il certificato")
  @JsonProperty("id") 
 
  @NotNull
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Descrive se è possibile o meno usare il certificato per creare un&#39;esenzione 
   **/
  
  @ApiModelProperty(required = true, value = "Descrive se è possibile o meno usare il certificato per creare un'esenzione ")
  @JsonProperty("utilizzabile") 
 
  @NotNull
  public Boolean isUtilizzabile() {
    return utilizzabile;
  }
  public void setUtilizzabile(Boolean utilizzabile) {
    this.utilizzabile = utilizzabile;
  }

  /**
   * Quando è stato inserito
   **/
  
  @ApiModelProperty(required = true, value = "Quando è stato inserito")
  @JsonProperty("data_inserimento") 
 
  @NotNull
  public String getDataInserimento() {
    return dataInserimento;
  }
  public void setDataInserimento(String dataInserimento) {
    this.dataInserimento = dataInserimento;
  }

  /**
   * Quando è stato modificato l&#39;ultima volta
   **/
  
  @ApiModelProperty(required = true, value = "Quando è stato modificato l'ultima volta")
  @JsonProperty("data_aggiornamento") 
 
  @NotNull
  public String getDataAggiornamento() {
    return dataAggiornamento;
  }
  public void setDataAggiornamento(String dataAggiornamento) {
    this.dataAggiornamento = dataAggiornamento;
  }

  /**
   * Quando dovrebbe scadere il certificato
   **/
  
  @ApiModelProperty(required = true, value = "Quando dovrebbe scadere il certificato")
  @JsonProperty("data_scadenza") 
 
  @NotNull
  public String getDataScadenza() {
    return dataScadenza;
  }
  public void setDataScadenza(String dataScadenza) {
    this.dataScadenza = dataScadenza;
  }

  /**
   * L&#39;id dell&#39;esenzione creata a partire da questo certificato 
   **/
  
  @ApiModelProperty(value = "L'id dell'esenzione creata a partire da questo certificato ")
  @JsonProperty("esenzione_id") 
 
  public String getEsenzioneId() {
    return esenzioneId;
  }
  public void setEsenzioneId(String esenzioneId) {
    this.esenzioneId = esenzioneId;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("tipologia_esenzione") 
 
  @NotNull
  public ModelEsenzioneTipologia getTipologiaEsenzione() {
    return tipologiaEsenzione;
  }
  public void setTipologiaEsenzione(ModelEsenzioneTipologia tipologiaEsenzione) {
    this.tipologiaEsenzione = tipologiaEsenzione;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("malattia") 
 
  @NotNull
  public ModelEsenzioneMalattia getMalattia() {
    return malattia;
  }
  public void setMalattia(ModelEsenzioneMalattia malattia) {
    this.malattia = malattia;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("inserito_da") 
 
  @NotNull
  public ModelCittadino getInseritoDa() {
    return inseritoDa;
  }
  public void setInseritoDa(ModelCittadino inseritoDa) {
    this.inseritoDa = inseritoDa;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelCertificato modelCertificato = (ModelCertificato) o;
    return Objects.equals(id, modelCertificato.id) &&
        Objects.equals(utilizzabile, modelCertificato.utilizzabile) &&
        Objects.equals(dataInserimento, modelCertificato.dataInserimento) &&
        Objects.equals(dataAggiornamento, modelCertificato.dataAggiornamento) &&
        Objects.equals(dataScadenza, modelCertificato.dataScadenza) &&
        Objects.equals(esenzioneId, modelCertificato.esenzioneId) &&
        Objects.equals(tipologiaEsenzione, modelCertificato.tipologiaEsenzione) &&
        Objects.equals(malattia, modelCertificato.malattia) &&
        Objects.equals(inseritoDa, modelCertificato.inseritoDa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, utilizzabile, dataInserimento, dataAggiornamento, dataScadenza, esenzioneId, tipologiaEsenzione, malattia, inseritoDa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelCertificato {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    utilizzabile: ").append(toIndentedString(utilizzabile)).append("\n");
    sb.append("    dataInserimento: ").append(toIndentedString(dataInserimento)).append("\n");
    sb.append("    dataAggiornamento: ").append(toIndentedString(dataAggiornamento)).append("\n");
    sb.append("    dataScadenza: ").append(toIndentedString(dataScadenza)).append("\n");
    sb.append("    esenzioneId: ").append(toIndentedString(esenzioneId)).append("\n");
    sb.append("    tipologiaEsenzione: ").append(toIndentedString(tipologiaEsenzione)).append("\n");
    sb.append("    malattia: ").append(toIndentedString(malattia)).append("\n");
    sb.append("    inseritoDa: ").append(toIndentedString(inseritoDa)).append("\n");
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

