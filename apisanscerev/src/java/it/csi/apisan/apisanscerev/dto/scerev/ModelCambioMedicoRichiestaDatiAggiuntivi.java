/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.dto.scerev;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanscerev.dto.scerev.ModelMotivazioneDomicilio;
import it.csi.apisan.apisanscerev.dto.scerev.ModelMotivazioneSoggiorno;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelCambioMedicoRichiestaDatiAggiuntivi   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private ModelMotivazioneSoggiorno motivazioneSoggiorno = null;
  private ModelMotivazioneDomicilio motivazioneDomicilio = null;
  private Date assitenzaTemporaneaDataFineValidita = null;
  private String motivazioneDomanda = null;
  private String note = null;

  /**
   * un codice che identifica la tipologia di lavoro selezionato dall&#39;utente
   */
  public enum LavoroTipologiaEnum {
    AUTONOMO("AUTONOMO"),

        SUBORDINATO("SUBORDINATO");
    private String value;

    LavoroTipologiaEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private LavoroTipologiaEnum lavoroTipologia = null;
  private String lavoroProfessione = null;
  private String lavoroPartitaIva = null;
  private String lavoroNumeroIscrizione = null;
  private String lavoroAzienda = null;
  private String lavoroAziendaTelefono = null;
  private String lavoroAziendaProvincia = null;
  private String lavoroAziendaComune = null;
  private String lavoroAziendaIndirizzo = null;
  private String lavoroAziendaCivico = null;
  private Date lavoroDataFineValiditaContratto = null;
  private String studioNomeIstituto = null;
  private String studioIstitutoProvincia = null;
  private String studioIstitutoComune = null;
  private String studioIstitutoIndirizzo = null;
  private String studioIstitutoCivico = null;
  private Date studioDataTermineIscrizione = null;
  private String ricongiungimentoNome = null;
  private String ricongiungimentoCognome = null;
  private String ricongiungimentoCodiceFiscale = null;
  private String ricongiungimentoParentela = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("motivazioneSoggiorno") 
 
  public ModelMotivazioneSoggiorno getMotivazioneSoggiorno() {
    return motivazioneSoggiorno;
  }
  public void setMotivazioneSoggiorno(ModelMotivazioneSoggiorno motivazioneSoggiorno) {
    this.motivazioneSoggiorno = motivazioneSoggiorno;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("motivazioneDomicilio") 
 
  public ModelMotivazioneDomicilio getMotivazioneDomicilio() {
    return motivazioneDomicilio;
  }
  public void setMotivazioneDomicilio(ModelMotivazioneDomicilio motivazioneDomicilio) {
    this.motivazioneDomicilio = motivazioneDomicilio;
  }

  /**
   * La nuova data di scadenza dell&#39;assistenza temporanea. Nel caso in cui il front-end capisce che il cittadino sta operando in assistenza temporanea gli chiederà se intende rinnovare tale assistenza. Il cittadino, se decide di rinnovare, potrà impostare la nuova data di scadenza. 
   **/
  
  @ApiModelProperty(example = "2020-12-31", value = "La nuova data di scadenza dell'assistenza temporanea. Nel caso in cui il front-end capisce che il cittadino sta operando in assistenza temporanea gli chiederà se intende rinnovare tale assistenza. Il cittadino, se decide di rinnovare, potrà impostare la nuova data di scadenza. ")
  @JsonProperty("assitenzaTemporaneaDataFineValidita") 
 
  public Date getAssitenzaTemporaneaDataFineValidita() {
    return assitenzaTemporaneaDataFineValidita;
  }
  public void setAssitenzaTemporaneaDataFineValidita(Date assitenzaTemporaneaDataFineValidita) {
    this.assitenzaTemporaneaDataFineValidita = assitenzaTemporaneaDataFineValidita;
  }

  /**
   * motivazione per le domande in deroga di ambito
   **/
  
  @ApiModelProperty(value = "motivazione per le domande in deroga di ambito")
  @JsonProperty("motivazioneDomanda") 
 
  public String getMotivazioneDomanda() {
    return motivazioneDomanda;
  }
  public void setMotivazioneDomanda(String motivazioneDomanda) {
    this.motivazioneDomanda = motivazioneDomanda;
  }

  /**
   * Note inserite dall&#39;utente e destinate all&#39;operatore
   **/
  
  @ApiModelProperty(example = "Ho allegato carta d'identità e consenso medico", value = "Note inserite dall'utente e destinate all'operatore")
  @JsonProperty("note") 
 
  public String getNote() {
    return note;
  }
  public void setNote(String note) {
    this.note = note;
  }

  /**
   * un codice che identifica la tipologia di lavoro selezionato dall&#39;utente
   **/
  
  @ApiModelProperty(example = "SUBORDINATO", value = "un codice che identifica la tipologia di lavoro selezionato dall'utente")
  @JsonProperty("lavoroTipologia") 
 
  public LavoroTipologiaEnum getLavoroTipologia() {
    return lavoroTipologia;
  }
  public void setLavoroTipologia(LavoroTipologiaEnum lavoroTipologia) {
    this.lavoroTipologia = lavoroTipologia;
  }

  /**
   * La professione dichiarata
   **/
  
  @ApiModelProperty(example = "Web Developer", value = "La professione dichiarata")
  @JsonProperty("lavoroProfessione") 
 
  public String getLavoroProfessione() {
    return lavoroProfessione;
  }
  public void setLavoroProfessione(String lavoroProfessione) {
    this.lavoroProfessione = lavoroProfessione;
  }

  /**
   * La partita iva del cittadino
   **/
  
  @ApiModelProperty(example = "1234567891234", value = "La partita iva del cittadino")
  @JsonProperty("lavoroPartitaIva") 
 
  public String getLavoroPartitaIva() {
    return lavoroPartitaIva;
  }
  public void setLavoroPartitaIva(String lavoroPartitaIva) {
    this.lavoroPartitaIva = lavoroPartitaIva;
  }

  /**
   * Il numero dell&#39;iscrizione all&#39;ordine professionale / collegio / camera di commercio
   **/
  
  @ApiModelProperty(example = "956568486", value = "Il numero dell'iscrizione all'ordine professionale / collegio / camera di commercio")
  @JsonProperty("lavoroNumeroIscrizione") 
 
  public String getLavoroNumeroIscrizione() {
    return lavoroNumeroIscrizione;
  }
  public void setLavoroNumeroIscrizione(String lavoroNumeroIscrizione) {
    this.lavoroNumeroIscrizione = lavoroNumeroIscrizione;
  }

  /**
   * L&#39;azienda presso cui lavora l&#39;assistito o il suo datore di lavoro
   **/
  
  @ApiModelProperty(example = "CSI Piemonte", value = "L'azienda presso cui lavora l'assistito o il suo datore di lavoro")
  @JsonProperty("lavoroAzienda") 
 
  public String getLavoroAzienda() {
    return lavoroAzienda;
  }
  public void setLavoroAzienda(String lavoroAzienda) {
    this.lavoroAzienda = lavoroAzienda;
  }

  /**
   * Il numero del datore di lavoro
   **/
  
  @ApiModelProperty(value = "Il numero del datore di lavoro")
  @JsonProperty("lavoroAziendaTelefono") 
 
  public String getLavoroAziendaTelefono() {
    return lavoroAziendaTelefono;
  }
  public void setLavoroAziendaTelefono(String lavoroAziendaTelefono) {
    this.lavoroAziendaTelefono = lavoroAziendaTelefono;
  }

  /**
   * La provincia dell&#39;azienda
   **/
  
  @ApiModelProperty(example = "Torino", value = "La provincia dell'azienda")
  @JsonProperty("lavoroAziendaProvincia") 
 
  public String getLavoroAziendaProvincia() {
    return lavoroAziendaProvincia;
  }
  public void setLavoroAziendaProvincia(String lavoroAziendaProvincia) {
    this.lavoroAziendaProvincia = lavoroAziendaProvincia;
  }

  /**
   * Il comune dell&#39;azienda
   **/
  
  @ApiModelProperty(example = "Torino", value = "Il comune dell'azienda")
  @JsonProperty("lavoroAziendaComune") 
 
  public String getLavoroAziendaComune() {
    return lavoroAziendaComune;
  }
  public void setLavoroAziendaComune(String lavoroAziendaComune) {
    this.lavoroAziendaComune = lavoroAziendaComune;
  }

  /**
   * L&#39;indirizzo dell&#39;azienda
   **/
  
  @ApiModelProperty(example = "Corso Unione Sovietica", value = "L'indirizzo dell'azienda")
  @JsonProperty("lavoroAziendaIndirizzo") 
 
  public String getLavoroAziendaIndirizzo() {
    return lavoroAziendaIndirizzo;
  }
  public void setLavoroAziendaIndirizzo(String lavoroAziendaIndirizzo) {
    this.lavoroAziendaIndirizzo = lavoroAziendaIndirizzo;
  }

  /**
   * Il civico dell&#39;azienda
   **/
  
  @ApiModelProperty(example = "13", value = "Il civico dell'azienda")
  @JsonProperty("lavoroAziendaCivico") 
 
  public String getLavoroAziendaCivico() {
    return lavoroAziendaCivico;
  }
  public void setLavoroAziendaCivico(String lavoroAziendaCivico) {
    this.lavoroAziendaCivico = lavoroAziendaCivico;
  }

  /**
   * La data del termine del contratto
   **/
  
  @ApiModelProperty(example = "2020-12-31", value = "La data del termine del contratto")
  @JsonProperty("lavoroDataFineValiditaContratto") 
 
  public Date getLavoroDataFineValiditaContratto() {
    return lavoroDataFineValiditaContratto;
  }
  public void setLavoroDataFineValiditaContratto(Date lavoroDataFineValiditaContratto) {
    this.lavoroDataFineValiditaContratto = lavoroDataFineValiditaContratto;
  }

  /**
   * Il nome dell&#39;istituto presso cui dichiara di studiare il cittadino
   **/
  
  @ApiModelProperty(example = "Politecnico di Torino", value = "Il nome dell'istituto presso cui dichiara di studiare il cittadino")
  @JsonProperty("studioNomeIstituto") 
 
  public String getStudioNomeIstituto() {
    return studioNomeIstituto;
  }
  public void setStudioNomeIstituto(String studioNomeIstituto) {
    this.studioNomeIstituto = studioNomeIstituto;
  }

  /**
   * La provincia dell&#39;azienda
   **/
  
  @ApiModelProperty(example = "Torino", value = "La provincia dell'azienda")
  @JsonProperty("studioIstitutoProvincia") 
 
  public String getStudioIstitutoProvincia() {
    return studioIstitutoProvincia;
  }
  public void setStudioIstitutoProvincia(String studioIstitutoProvincia) {
    this.studioIstitutoProvincia = studioIstitutoProvincia;
  }

  /**
   * Il comune dell&#39;azienda
   **/
  
  @ApiModelProperty(example = "Torino", value = "Il comune dell'azienda")
  @JsonProperty("studioIstitutoComune") 
 
  public String getStudioIstitutoComune() {
    return studioIstitutoComune;
  }
  public void setStudioIstitutoComune(String studioIstitutoComune) {
    this.studioIstitutoComune = studioIstitutoComune;
  }

  /**
   * L&#39;indirizzo dell&#39;azienda
   **/
  
  @ApiModelProperty(example = "Corso Unione Sovietica", value = "L'indirizzo dell'azienda")
  @JsonProperty("studioIstitutoIndirizzo") 
 
  public String getStudioIstitutoIndirizzo() {
    return studioIstitutoIndirizzo;
  }
  public void setStudioIstitutoIndirizzo(String studioIstitutoIndirizzo) {
    this.studioIstitutoIndirizzo = studioIstitutoIndirizzo;
  }

  /**
   * Il civico dell&#39;azienda
   **/
  
  @ApiModelProperty(example = "13", value = "Il civico dell'azienda")
  @JsonProperty("studioIstitutoCivico") 
 
  public String getStudioIstitutoCivico() {
    return studioIstitutoCivico;
  }
  public void setStudioIstitutoCivico(String studioIstitutoCivico) {
    this.studioIstitutoCivico = studioIstitutoCivico;
  }

  /**
   * La data della scadenza dell&#39;iscrizione presso l&#39;istutito
   **/
  
  @ApiModelProperty(example = "2020-09-01", value = "La data della scadenza dell'iscrizione presso l'istutito")
  @JsonProperty("studioDataTermineIscrizione") 
 
  public Date getStudioDataTermineIscrizione() {
    return studioDataTermineIscrizione;
  }
  public void setStudioDataTermineIscrizione(Date studioDataTermineIscrizione) {
    this.studioDataTermineIscrizione = studioDataTermineIscrizione;
  }

  /**
   * Il nome del parente
   **/
  
  @ApiModelProperty(example = "Paolo", value = "Il nome del parente")
  @JsonProperty("ricongiungimentoNome") 
 
  public String getRicongiungimentoNome() {
    return ricongiungimentoNome;
  }
  public void setRicongiungimentoNome(String ricongiungimentoNome) {
    this.ricongiungimentoNome = ricongiungimentoNome;
  }

  /**
   * Il cognome del parente
   **/
  
  @ApiModelProperty(example = "Bianchi", value = "Il cognome del parente")
  @JsonProperty("ricongiungimentoCognome") 
 
  public String getRicongiungimentoCognome() {
    return ricongiungimentoCognome;
  }
  public void setRicongiungimentoCognome(String ricongiungimentoCognome) {
    this.ricongiungimentoCognome = ricongiungimentoCognome;
  }

  /**
   * Il nome del parente
   **/
  
  @ApiModelProperty(example = "PLOBNC88M14I987S", value = "Il nome del parente")
  @JsonProperty("ricongiungimentoCodiceFiscale") 
 
  public String getRicongiungimentoCodiceFiscale() {
    return ricongiungimentoCodiceFiscale;
  }
  public void setRicongiungimentoCodiceFiscale(String ricongiungimentoCodiceFiscale) {
    this.ricongiungimentoCodiceFiscale = ricongiungimentoCodiceFiscale;
  }

  /**
   * Il rapporto di parentela con il parente
   **/
  
  @ApiModelProperty(example = "Padre", value = "Il rapporto di parentela con il parente")
  @JsonProperty("ricongiungimentoParentela") 
 
  public String getRicongiungimentoParentela() {
    return ricongiungimentoParentela;
  }
  public void setRicongiungimentoParentela(String ricongiungimentoParentela) {
    this.ricongiungimentoParentela = ricongiungimentoParentela;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelCambioMedicoRichiestaDatiAggiuntivi modelCambioMedicoRichiestaDatiAggiuntivi = (ModelCambioMedicoRichiestaDatiAggiuntivi) o;
    return Objects.equals(motivazioneSoggiorno, modelCambioMedicoRichiestaDatiAggiuntivi.motivazioneSoggiorno) &&
        Objects.equals(motivazioneDomicilio, modelCambioMedicoRichiestaDatiAggiuntivi.motivazioneDomicilio) &&
        Objects.equals(assitenzaTemporaneaDataFineValidita, modelCambioMedicoRichiestaDatiAggiuntivi.assitenzaTemporaneaDataFineValidita) &&
        Objects.equals(motivazioneDomanda, modelCambioMedicoRichiestaDatiAggiuntivi.motivazioneDomanda) &&
        Objects.equals(note, modelCambioMedicoRichiestaDatiAggiuntivi.note) &&
        Objects.equals(lavoroTipologia, modelCambioMedicoRichiestaDatiAggiuntivi.lavoroTipologia) &&
        Objects.equals(lavoroProfessione, modelCambioMedicoRichiestaDatiAggiuntivi.lavoroProfessione) &&
        Objects.equals(lavoroPartitaIva, modelCambioMedicoRichiestaDatiAggiuntivi.lavoroPartitaIva) &&
        Objects.equals(lavoroNumeroIscrizione, modelCambioMedicoRichiestaDatiAggiuntivi.lavoroNumeroIscrizione) &&
        Objects.equals(lavoroAzienda, modelCambioMedicoRichiestaDatiAggiuntivi.lavoroAzienda) &&
        Objects.equals(lavoroAziendaTelefono, modelCambioMedicoRichiestaDatiAggiuntivi.lavoroAziendaTelefono) &&
        Objects.equals(lavoroAziendaProvincia, modelCambioMedicoRichiestaDatiAggiuntivi.lavoroAziendaProvincia) &&
        Objects.equals(lavoroAziendaComune, modelCambioMedicoRichiestaDatiAggiuntivi.lavoroAziendaComune) &&
        Objects.equals(lavoroAziendaIndirizzo, modelCambioMedicoRichiestaDatiAggiuntivi.lavoroAziendaIndirizzo) &&
        Objects.equals(lavoroAziendaCivico, modelCambioMedicoRichiestaDatiAggiuntivi.lavoroAziendaCivico) &&
        Objects.equals(lavoroDataFineValiditaContratto, modelCambioMedicoRichiestaDatiAggiuntivi.lavoroDataFineValiditaContratto) &&
        Objects.equals(studioNomeIstituto, modelCambioMedicoRichiestaDatiAggiuntivi.studioNomeIstituto) &&
        Objects.equals(studioIstitutoProvincia, modelCambioMedicoRichiestaDatiAggiuntivi.studioIstitutoProvincia) &&
        Objects.equals(studioIstitutoComune, modelCambioMedicoRichiestaDatiAggiuntivi.studioIstitutoComune) &&
        Objects.equals(studioIstitutoIndirizzo, modelCambioMedicoRichiestaDatiAggiuntivi.studioIstitutoIndirizzo) &&
        Objects.equals(studioIstitutoCivico, modelCambioMedicoRichiestaDatiAggiuntivi.studioIstitutoCivico) &&
        Objects.equals(studioDataTermineIscrizione, modelCambioMedicoRichiestaDatiAggiuntivi.studioDataTermineIscrizione) &&
        Objects.equals(ricongiungimentoNome, modelCambioMedicoRichiestaDatiAggiuntivi.ricongiungimentoNome) &&
        Objects.equals(ricongiungimentoCognome, modelCambioMedicoRichiestaDatiAggiuntivi.ricongiungimentoCognome) &&
        Objects.equals(ricongiungimentoCodiceFiscale, modelCambioMedicoRichiestaDatiAggiuntivi.ricongiungimentoCodiceFiscale) &&
        Objects.equals(ricongiungimentoParentela, modelCambioMedicoRichiestaDatiAggiuntivi.ricongiungimentoParentela);
  }

  @Override
  public int hashCode() {
    return Objects.hash(motivazioneSoggiorno, motivazioneDomicilio, assitenzaTemporaneaDataFineValidita, motivazioneDomanda, note, lavoroTipologia, lavoroProfessione, lavoroPartitaIva, lavoroNumeroIscrizione, lavoroAzienda, lavoroAziendaTelefono, lavoroAziendaProvincia, lavoroAziendaComune, lavoroAziendaIndirizzo, lavoroAziendaCivico, lavoroDataFineValiditaContratto, studioNomeIstituto, studioIstitutoProvincia, studioIstitutoComune, studioIstitutoIndirizzo, studioIstitutoCivico, studioDataTermineIscrizione, ricongiungimentoNome, ricongiungimentoCognome, ricongiungimentoCodiceFiscale, ricongiungimentoParentela);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelCambioMedicoRichiestaDatiAggiuntivi {\n");
    
    sb.append("    motivazioneSoggiorno: ").append(toIndentedString(motivazioneSoggiorno)).append("\n");
    sb.append("    motivazioneDomicilio: ").append(toIndentedString(motivazioneDomicilio)).append("\n");
    sb.append("    assitenzaTemporaneaDataFineValidita: ").append(toIndentedString(assitenzaTemporaneaDataFineValidita)).append("\n");
    sb.append("    motivazioneDomanda: ").append(toIndentedString(motivazioneDomanda)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    lavoroTipologia: ").append(toIndentedString(lavoroTipologia)).append("\n");
    sb.append("    lavoroProfessione: ").append(toIndentedString(lavoroProfessione)).append("\n");
    sb.append("    lavoroPartitaIva: ").append(toIndentedString(lavoroPartitaIva)).append("\n");
    sb.append("    lavoroNumeroIscrizione: ").append(toIndentedString(lavoroNumeroIscrizione)).append("\n");
    sb.append("    lavoroAzienda: ").append(toIndentedString(lavoroAzienda)).append("\n");
    sb.append("    lavoroAziendaTelefono: ").append(toIndentedString(lavoroAziendaTelefono)).append("\n");
    sb.append("    lavoroAziendaProvincia: ").append(toIndentedString(lavoroAziendaProvincia)).append("\n");
    sb.append("    lavoroAziendaComune: ").append(toIndentedString(lavoroAziendaComune)).append("\n");
    sb.append("    lavoroAziendaIndirizzo: ").append(toIndentedString(lavoroAziendaIndirizzo)).append("\n");
    sb.append("    lavoroAziendaCivico: ").append(toIndentedString(lavoroAziendaCivico)).append("\n");
    sb.append("    lavoroDataFineValiditaContratto: ").append(toIndentedString(lavoroDataFineValiditaContratto)).append("\n");
    sb.append("    studioNomeIstituto: ").append(toIndentedString(studioNomeIstituto)).append("\n");
    sb.append("    studioIstitutoProvincia: ").append(toIndentedString(studioIstitutoProvincia)).append("\n");
    sb.append("    studioIstitutoComune: ").append(toIndentedString(studioIstitutoComune)).append("\n");
    sb.append("    studioIstitutoIndirizzo: ").append(toIndentedString(studioIstitutoIndirizzo)).append("\n");
    sb.append("    studioIstitutoCivico: ").append(toIndentedString(studioIstitutoCivico)).append("\n");
    sb.append("    studioDataTermineIscrizione: ").append(toIndentedString(studioDataTermineIscrizione)).append("\n");
    sb.append("    ricongiungimentoNome: ").append(toIndentedString(ricongiungimentoNome)).append("\n");
    sb.append("    ricongiungimentoCognome: ").append(toIndentedString(ricongiungimentoCognome)).append("\n");
    sb.append("    ricongiungimentoCodiceFiscale: ").append(toIndentedString(ricongiungimentoCodiceFiscale)).append("\n");
    sb.append("    ricongiungimentoParentela: ").append(toIndentedString(ricongiungimentoParentela)).append("\n");
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

