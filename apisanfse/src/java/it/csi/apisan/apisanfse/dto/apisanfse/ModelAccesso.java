/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelCodifica;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelAccesso   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String applicazioneVerticale = null;
  private String codiceFiscaleOperatore = null;
  private String cognomeOperatore = null;
  private String collocazione = null;
  private Date dataAccesso = null;
  private String descrizione = null;
  private String idAccesso = null;
  private String nomeOperatore = null;
  private ModelCodifica regime = null;
  private ModelCodifica ruolo = null;
  private ModelCodifica aziendaSanitaria = null;
  private ModelCodifica tipoAccesso = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("applicazione_verticale") 
 
  public String getApplicazioneVerticale() {
    return applicazioneVerticale;
  }
  public void setApplicazioneVerticale(String applicazioneVerticale) {
    this.applicazioneVerticale = applicazioneVerticale;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("codice_fiscale_operatore") 
 
  public String getCodiceFiscaleOperatore() {
    return codiceFiscaleOperatore;
  }
  public void setCodiceFiscaleOperatore(String codiceFiscaleOperatore) {
    this.codiceFiscaleOperatore = codiceFiscaleOperatore;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cognome_operatore") 
 
  public String getCognomeOperatore() {
    return cognomeOperatore;
  }
  public void setCognomeOperatore(String cognomeOperatore) {
    this.cognomeOperatore = cognomeOperatore;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("collocazione") 
 
  public String getCollocazione() {
    return collocazione;
  }
  public void setCollocazione(String collocazione) {
    this.collocazione = collocazione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_accesso") 
 
  public Date getDataAccesso() {
    return dataAccesso;
  }
  public void setDataAccesso(Date dataAccesso) {
    this.dataAccesso = dataAccesso;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("descrizione") 
 
  public String getDescrizione() {
    return descrizione;
  }
  public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id_accesso") 
 
  public String getIdAccesso() {
    return idAccesso;
  }
  public void setIdAccesso(String idAccesso) {
    this.idAccesso = idAccesso;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("nome_operatore") 
 
  public String getNomeOperatore() {
    return nomeOperatore;
  }
  public void setNomeOperatore(String nomeOperatore) {
    this.nomeOperatore = nomeOperatore;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("regime") 
 
  public ModelCodifica getRegime() {
    return regime;
  }
  public void setRegime(ModelCodifica regime) {
    this.regime = regime;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ruolo") 
 
  public ModelCodifica getRuolo() {
    return ruolo;
  }
  public void setRuolo(ModelCodifica ruolo) {
    this.ruolo = ruolo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("azienda_sanitaria") 
 
  public ModelCodifica getAziendaSanitaria() {
    return aziendaSanitaria;
  }
  public void setAziendaSanitaria(ModelCodifica aziendaSanitaria) {
    this.aziendaSanitaria = aziendaSanitaria;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tipo_accesso") 
 
  public ModelCodifica getTipoAccesso() {
    return tipoAccesso;
  }
  public void setTipoAccesso(ModelCodifica tipoAccesso) {
    this.tipoAccesso = tipoAccesso;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelAccesso modelAccesso = (ModelAccesso) o;
    return Objects.equals(applicazioneVerticale, modelAccesso.applicazioneVerticale) &&
        Objects.equals(codiceFiscaleOperatore, modelAccesso.codiceFiscaleOperatore) &&
        Objects.equals(cognomeOperatore, modelAccesso.cognomeOperatore) &&
        Objects.equals(collocazione, modelAccesso.collocazione) &&
        Objects.equals(dataAccesso, modelAccesso.dataAccesso) &&
        Objects.equals(descrizione, modelAccesso.descrizione) &&
        Objects.equals(idAccesso, modelAccesso.idAccesso) &&
        Objects.equals(nomeOperatore, modelAccesso.nomeOperatore) &&
        Objects.equals(regime, modelAccesso.regime) &&
        Objects.equals(ruolo, modelAccesso.ruolo) &&
        Objects.equals(aziendaSanitaria, modelAccesso.aziendaSanitaria) &&
        Objects.equals(tipoAccesso, modelAccesso.tipoAccesso);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicazioneVerticale, codiceFiscaleOperatore, cognomeOperatore, collocazione, dataAccesso, descrizione, idAccesso, nomeOperatore, regime, ruolo, aziendaSanitaria, tipoAccesso);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelAccesso {\n");
    
    sb.append("    applicazioneVerticale: ").append(toIndentedString(applicazioneVerticale)).append("\n");
    sb.append("    codiceFiscaleOperatore: ").append(toIndentedString(codiceFiscaleOperatore)).append("\n");
    sb.append("    cognomeOperatore: ").append(toIndentedString(cognomeOperatore)).append("\n");
    sb.append("    collocazione: ").append(toIndentedString(collocazione)).append("\n");
    sb.append("    dataAccesso: ").append(toIndentedString(dataAccesso)).append("\n");
    sb.append("    descrizione: ").append(toIndentedString(descrizione)).append("\n");
    sb.append("    idAccesso: ").append(toIndentedString(idAccesso)).append("\n");
    sb.append("    nomeOperatore: ").append(toIndentedString(nomeOperatore)).append("\n");
    sb.append("    regime: ").append(toIndentedString(regime)).append("\n");
    sb.append("    ruolo: ").append(toIndentedString(ruolo)).append("\n");
    sb.append("    aziendaSanitaria: ").append(toIndentedString(aziendaSanitaria)).append("\n");
    sb.append("    tipoAccesso: ").append(toIndentedString(tipoAccesso)).append("\n");
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

