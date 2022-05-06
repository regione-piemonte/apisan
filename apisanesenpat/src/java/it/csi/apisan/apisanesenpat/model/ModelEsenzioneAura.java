/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesenpat.model;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.codehaus.jackson.annotate.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="Rappresenta un'esenzione di Aura indistintamente dalla tipologia ")

public class ModelEsenzioneAura   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String dataEmissione = null;
  private String dataScadenza = null;
  private Boolean revocabile = null;
  private ModelEsenzioneCodice codice = null;
  private ModelEsenzioneStato stato = null;
  private ModelEsenzioneTipologia tipologia = null;
  private ModelTipologiaInvaliditaV3 tipologiaInvalidita = null;
  private ModelEsenzioneMalattiaVAura malattia = null;

  /**
   * Inizio validità dell&#39;esenzione
   **/
  
  @ApiModelProperty(required = true, value = "Inizio validità dell'esenzione")
  @JsonProperty("data_emissione") 
 
  @NotNull
  public String getDataEmissione() {
    return dataEmissione;
  }
  public void setDataEmissione(String dataEmissione) {
    this.dataEmissione = dataEmissione;
  }

  /**
   * Quando scadrà l&#39;esenzione
   **/
  
  @ApiModelProperty(required = true, value = "Quando scadrà l'esenzione")
  @JsonProperty("data_scadenza") 
 
  @NotNull
  public String getDataScadenza() {
    return dataScadenza;
  }
  public void setDataScadenza(String dataScadenza) {
    this.dataScadenza = dataScadenza;
  }

  /**
   * Indica se l&#39;esenzione è revocabile o meno 
   **/
  
  @ApiModelProperty(required = true, value = "Indica se l'esenzione è revocabile o meno ")
  @JsonProperty("revocabile") 
 
  @NotNull
  public Boolean isRevocabile() {
    return revocabile;
  }
  public void setRevocabile(Boolean revocabile) {
    this.revocabile = revocabile;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("codice") 
 
  @NotNull
  public ModelEsenzioneCodice getCodice() {
    return codice;
  }
  public void setCodice(ModelEsenzioneCodice codice) {
    this.codice = codice;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("stato") 
 
  @NotNull
  public ModelEsenzioneStato getStato() {
    return stato;
  }
  public void setStato(ModelEsenzioneStato stato) {
    this.stato = stato;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("tipologia") 
 
  @NotNull
  public ModelEsenzioneTipologia getTipologia() {
    return tipologia;
  }
  public void setTipologia(ModelEsenzioneTipologia tipologia) {
    this.tipologia = tipologia;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tipologia_invalidita") 
 
  public ModelTipologiaInvaliditaV3 getTipologiaInvalidita() {
    return tipologiaInvalidita;
  }
  public void setTipologiaInvalidita(ModelTipologiaInvaliditaV3 tipologiaInvalidita) {
    this.tipologiaInvalidita = tipologiaInvalidita;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("malattia") 
 
  @NotNull
  public ModelEsenzioneMalattiaVAura getMalattia() {
    return malattia;
  }
  public void setMalattia(ModelEsenzioneMalattiaVAura malattia) {
    this.malattia = malattia;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelEsenzioneAura modelEsenzioneAura = (ModelEsenzioneAura) o;
    return Objects.equals(dataEmissione, modelEsenzioneAura.dataEmissione) &&
        Objects.equals(dataScadenza, modelEsenzioneAura.dataScadenza) &&
        Objects.equals(revocabile, modelEsenzioneAura.revocabile) &&
        Objects.equals(codice, modelEsenzioneAura.codice) &&
        Objects.equals(stato, modelEsenzioneAura.stato) &&
        Objects.equals(tipologia, modelEsenzioneAura.tipologia) &&
        Objects.equals(tipologiaInvalidita, modelEsenzioneAura.tipologiaInvalidita) &&
        Objects.equals(malattia, modelEsenzioneAura.malattia);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataEmissione, dataScadenza, revocabile, codice, stato, tipologia, tipologiaInvalidita, malattia);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelEsenzioneAura {\n");
    
    sb.append("    dataEmissione: ").append(toIndentedString(dataEmissione)).append("\n");
    sb.append("    dataScadenza: ").append(toIndentedString(dataScadenza)).append("\n");
    sb.append("    revocabile: ").append(toIndentedString(revocabile)).append("\n");
    sb.append("    codice: ").append(toIndentedString(codice)).append("\n");
    sb.append("    stato: ").append(toIndentedString(stato)).append("\n");
    sb.append("    tipologia: ").append(toIndentedString(tipologia)).append("\n");
    sb.append("    tipologiaInvalidita: ").append(toIndentedString(tipologiaInvalidita)).append("\n");
    sb.append("    malattia: ").append(toIndentedString(malattia)).append("\n");
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

