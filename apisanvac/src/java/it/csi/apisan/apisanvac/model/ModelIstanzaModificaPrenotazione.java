/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import it.csi.apisan.apisanvac.model.ModelVaccinoNoDose;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Rappresenta l istanza di modifica appuntamento attiva ")

public class ModelIstanzaModificaPrenotazione   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String idIstanza = null;
  private String motivazione = null;
  private String idAppuntamento = null;
  private String idStato = null;
  private String descrizioneStato = null;
  private String noteRichiesta = null;
  private String tipologiaIstanza = null;
  private String centroVaccinaleCodice = null;
  private String centroVaccinaleDescrizione = null;
  private String centroVaccinaleIstanzaCodice = null;
  private String centroVaccinaleIstanzaDescrizione = null;
  private String dataPresentazioneIstanza = null;
  private List<ModelVaccinoNoDose> vaccini = new ArrayList<ModelVaccinoNoDose>();

  /**
   * L id dell istanza
   **/
  
  @ApiModelProperty(required = true, value = "L id dell istanza")
  @JsonProperty("id_istanza") 
 
  @NotNull
  public String getIdIstanza() {
    return idIstanza;
  }
  public void setIdIstanza(String idIstanza) {
    this.idIstanza = idIstanza;
  }

  /**
   * Descrizione estesa della motivazione
   **/
  
  @ApiModelProperty(value = "Descrizione estesa della motivazione")
  @JsonProperty("motivazione") 
 
  public String getMotivazione() {
    return motivazione;
  }
  public void setMotivazione(String motivazione) {
    this.motivazione = motivazione;
  }

  /**
   * L id dell appuntamento relativo all istanza ( NON fornito dal giallo)
   **/
  
  @ApiModelProperty(required = true, value = "L id dell appuntamento relativo all istanza ( NON fornito dal giallo)")
  @JsonProperty("id_appuntamento") 
 
  @NotNull
  public String getIdAppuntamento() {
    return idAppuntamento;
  }
  public void setIdAppuntamento(String idAppuntamento) {
    this.idAppuntamento = idAppuntamento;
  }

  /**
   * L id dello stato dell istanza
   **/
  
  @ApiModelProperty(required = true, value = "L id dello stato dell istanza")
  @JsonProperty("id_stato") 
 
  @NotNull
  public String getIdStato() {
    return idStato;
  }
  public void setIdStato(String idStato) {
    this.idStato = idStato;
  }

  /**
   * Descrizione dello stato
   **/
  
  @ApiModelProperty(required = true, value = "Descrizione dello stato")
  @JsonProperty("descrizione_stato") 
 
  @NotNull
  public String getDescrizioneStato() {
    return descrizioneStato;
  }
  public void setDescrizioneStato(String descrizioneStato) {
    this.descrizioneStato = descrizioneStato;
  }

  /**
   * Note inserite da utente alla richiesta
   **/
  
  @ApiModelProperty(value = "Note inserite da utente alla richiesta")
  @JsonProperty("note_richiesta") 
 
  public String getNoteRichiesta() {
    return noteRichiesta;
  }
  public void setNoteRichiesta(String noteRichiesta) {
    this.noteRichiesta = noteRichiesta;
  }

  /**
   * Tipologia dell&#39;istanza
   **/
  
  @ApiModelProperty(value = "Tipologia dell'istanza")
  @JsonProperty("tipologia_istanza") 
 
  public String getTipologiaIstanza() {
    return tipologiaIstanza;
  }
  public void setTipologiaIstanza(String tipologiaIstanza) {
    this.tipologiaIstanza = tipologiaIstanza;
  }

  /**
   * Il codice del centro vaccinale
   **/
  
  @ApiModelProperty(value = "Il codice del centro vaccinale")
  @JsonProperty("centro_vaccinale_codice") 
 
  public String getCentroVaccinaleCodice() {
    return centroVaccinaleCodice;
  }
  public void setCentroVaccinaleCodice(String centroVaccinaleCodice) {
    this.centroVaccinaleCodice = centroVaccinaleCodice;
  }

  /**
   * La descrizione del centro vaccinale
   **/
  
  @ApiModelProperty(value = "La descrizione del centro vaccinale")
  @JsonProperty("centro_vaccinale_descrizione") 
 
  public String getCentroVaccinaleDescrizione() {
    return centroVaccinaleDescrizione;
  }
  public void setCentroVaccinaleDescrizione(String centroVaccinaleDescrizione) {
    this.centroVaccinaleDescrizione = centroVaccinaleDescrizione;
  }

  /**
   * Il codice del centro vaccinale selezionato per l&#39;istanza
   **/
  
  @ApiModelProperty(value = "Il codice del centro vaccinale selezionato per l'istanza")
  @JsonProperty("centro_vaccinale_istanza_codice") 
 
  public String getCentroVaccinaleIstanzaCodice() {
    return centroVaccinaleIstanzaCodice;
  }
  public void setCentroVaccinaleIstanzaCodice(String centroVaccinaleIstanzaCodice) {
    this.centroVaccinaleIstanzaCodice = centroVaccinaleIstanzaCodice;
  }

  /**
   * La descrizione del centro vaccinale selezionato per l&#39;istanza
   **/
  
  @ApiModelProperty(value = "La descrizione del centro vaccinale selezionato per l'istanza")
  @JsonProperty("centro_vaccinale_istanza_descrizione") 
 
  public String getCentroVaccinaleIstanzaDescrizione() {
    return centroVaccinaleIstanzaDescrizione;
  }
  public void setCentroVaccinaleIstanzaDescrizione(String centroVaccinaleIstanzaDescrizione) {
    this.centroVaccinaleIstanzaDescrizione = centroVaccinaleIstanzaDescrizione;
  }

  /**
   * La descrizione del centro vaccinale selezionato per l&#39;istanza
   **/
  
  @ApiModelProperty(value = "La descrizione del centro vaccinale selezionato per l'istanza")
  @JsonProperty("data_presentazione_istanza") 
 
  public String getDataPresentazioneIstanza() {
    return dataPresentazioneIstanza;
  }
  public void setDataPresentazioneIstanza(String dataPresentazioneIstanza) {
    this.dataPresentazioneIstanza = dataPresentazioneIstanza;
  }

  /**
   * vaccini relativi
   **/
  
  @ApiModelProperty(value = "vaccini relativi")
  @JsonProperty("vaccini") 
 
  public List<ModelVaccinoNoDose> getVaccini() {
    return vaccini;
  }
  public void setVaccini(List<ModelVaccinoNoDose> vaccini) {
    this.vaccini = vaccini;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelIstanzaModificaPrenotazione modelIstanzaModificaPrenotazione = (ModelIstanzaModificaPrenotazione) o;
    return Objects.equals(idIstanza, modelIstanzaModificaPrenotazione.idIstanza) &&
        Objects.equals(motivazione, modelIstanzaModificaPrenotazione.motivazione) &&
        Objects.equals(idAppuntamento, modelIstanzaModificaPrenotazione.idAppuntamento) &&
        Objects.equals(idStato, modelIstanzaModificaPrenotazione.idStato) &&
        Objects.equals(descrizioneStato, modelIstanzaModificaPrenotazione.descrizioneStato) &&
        Objects.equals(noteRichiesta, modelIstanzaModificaPrenotazione.noteRichiesta) &&
        Objects.equals(tipologiaIstanza, modelIstanzaModificaPrenotazione.tipologiaIstanza) &&
        Objects.equals(centroVaccinaleCodice, modelIstanzaModificaPrenotazione.centroVaccinaleCodice) &&
        Objects.equals(centroVaccinaleDescrizione, modelIstanzaModificaPrenotazione.centroVaccinaleDescrizione) &&
        Objects.equals(centroVaccinaleIstanzaCodice, modelIstanzaModificaPrenotazione.centroVaccinaleIstanzaCodice) &&
        Objects.equals(centroVaccinaleIstanzaDescrizione, modelIstanzaModificaPrenotazione.centroVaccinaleIstanzaDescrizione) &&
        Objects.equals(dataPresentazioneIstanza, modelIstanzaModificaPrenotazione.dataPresentazioneIstanza) &&
        Objects.equals(vaccini, modelIstanzaModificaPrenotazione.vaccini);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idIstanza, motivazione, idAppuntamento, idStato, descrizioneStato, noteRichiesta, tipologiaIstanza, centroVaccinaleCodice, centroVaccinaleDescrizione, centroVaccinaleIstanzaCodice, centroVaccinaleIstanzaDescrizione, dataPresentazioneIstanza, vaccini);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelIstanzaModificaPrenotazione {\n");
    
    sb.append("    idIstanza: ").append(toIndentedString(idIstanza)).append("\n");
    sb.append("    motivazione: ").append(toIndentedString(motivazione)).append("\n");
    sb.append("    idAppuntamento: ").append(toIndentedString(idAppuntamento)).append("\n");
    sb.append("    idStato: ").append(toIndentedString(idStato)).append("\n");
    sb.append("    descrizioneStato: ").append(toIndentedString(descrizioneStato)).append("\n");
    sb.append("    noteRichiesta: ").append(toIndentedString(noteRichiesta)).append("\n");
    sb.append("    tipologiaIstanza: ").append(toIndentedString(tipologiaIstanza)).append("\n");
    sb.append("    centroVaccinaleCodice: ").append(toIndentedString(centroVaccinaleCodice)).append("\n");
    sb.append("    centroVaccinaleDescrizione: ").append(toIndentedString(centroVaccinaleDescrizione)).append("\n");
    sb.append("    centroVaccinaleIstanzaCodice: ").append(toIndentedString(centroVaccinaleIstanzaCodice)).append("\n");
    sb.append("    centroVaccinaleIstanzaDescrizione: ").append(toIndentedString(centroVaccinaleIstanzaDescrizione)).append("\n");
    sb.append("    dataPresentazioneIstanza: ").append(toIndentedString(dataPresentazioneIstanza)).append("\n");
    sb.append("    vaccini: ").append(toIndentedString(vaccini)).append("\n");
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

