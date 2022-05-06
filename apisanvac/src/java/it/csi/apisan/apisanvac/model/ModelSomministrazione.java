/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import it.csi.apisan.apisanvac.model.ModelAsl;
import it.csi.apisan.apisanvac.model.ModelReazioneAvversa;
import it.csi.apisan.apisanvac.model.ModelSomministrazioneAssociazioni;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Rappresenta una vaccinazione già eseguita")

public class ModelSomministrazione   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String id = null;
  private String centroVaccinale = null;
  private String ambulatorio = null;
  private String comuneCentro = null;
  private String telefonoCentro = null;
  private String lotto = null;
  private String nomeCommerciale = null;
  private String vaccinatore = null;
  private String sitoInoculazione = null;
  private String viaSomministrazione = null;
  private Boolean isFittizia = null;
  private String pazienteCodice = null;
  private String pazienteNome = null;
  private String pazienteCognome = null;
  private String pazienteDataNascita = null;
  private String dataAppuntamento = null;
  private String oraAppuntamento = null;
  private ModelReazioneAvversa reazioneAvversa = null;
  private String medicoResponsabile = null;
  private String numeroPraticaRegionale = null;
  private ModelAsl asl = null;
  private List<ModelSomministrazioneAssociazioni> associazioni = new ArrayList<ModelSomministrazioneAssociazioni>();
  private String condizioneSanitariaCodice = null;
  private String condizioneSanitariaDescrizione = null;
  private String condizioneRischioCodice = null;
  private String condizioneRischioDescrizione = null;

  /**
   * Identificativo univoco
   **/
  
  @ApiModelProperty(required = true, value = "Identificativo univoco")
  @JsonProperty("id") 
 
  @NotNull
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * l&#39;id del centro vaccinale
   **/
  
  @ApiModelProperty(required = true, value = "l'id del centro vaccinale")
  @JsonProperty("centro_vaccinale") 
 
  @NotNull
  public String getCentroVaccinale() {
    return centroVaccinale;
  }
  public void setCentroVaccinale(String centroVaccinale) {
    this.centroVaccinale = centroVaccinale;
  }

  /**
   * Il nome dell&#39;ambulatorio (centro vaccinale)
   **/
  
  @ApiModelProperty(value = "Il nome dell'ambulatorio (centro vaccinale)")
  @JsonProperty("ambulatorio") 
 
  public String getAmbulatorio() {
    return ambulatorio;
  }
  public void setAmbulatorio(String ambulatorio) {
    this.ambulatorio = ambulatorio;
  }

  /**
   * Il nome del comune a cui appartiene il centro vaccinale
   **/
  
  @ApiModelProperty(value = "Il nome del comune a cui appartiene il centro vaccinale")
  @JsonProperty("comune_centro") 
 
  public String getComuneCentro() {
    return comuneCentro;
  }
  public void setComuneCentro(String comuneCentro) {
    this.comuneCentro = comuneCentro;
  }

  /**
   * Il telefono del centro vaccinale
   **/
  
  @ApiModelProperty(value = "Il telefono del centro vaccinale")
  @JsonProperty("telefono_centro") 
 
  public String getTelefonoCentro() {
    return telefonoCentro;
  }
  public void setTelefonoCentro(String telefonoCentro) {
    this.telefonoCentro = telefonoCentro;
  }

  /**
   * Il lotto di appartenenza del vaccino
   **/
  
  @ApiModelProperty(value = "Il lotto di appartenenza del vaccino")
  @JsonProperty("lotto") 
 
  public String getLotto() {
    return lotto;
  }
  public void setLotto(String lotto) {
    this.lotto = lotto;
  }

  /**
   * Il nome commerciale del vaccino
   **/
  
  @ApiModelProperty(value = "Il nome commerciale del vaccino")
  @JsonProperty("nome_commerciale") 
 
  public String getNomeCommerciale() {
    return nomeCommerciale;
  }
  public void setNomeCommerciale(String nomeCommerciale) {
    this.nomeCommerciale = nomeCommerciale;
  }

  /**
   * Il nome del medico vaccinatore
   **/
  
  @ApiModelProperty(value = "Il nome del medico vaccinatore")
  @JsonProperty("vaccinatore") 
 
  public String getVaccinatore() {
    return vaccinatore;
  }
  public void setVaccinatore(String vaccinatore) {
    this.vaccinatore = vaccinatore;
  }

  /**
   * Descrive dove è stato iniettato il vaccino
   **/
  
  @ApiModelProperty(value = "Descrive dove è stato iniettato il vaccino")
  @JsonProperty("sito_inoculazione") 
 
  public String getSitoInoculazione() {
    return sitoInoculazione;
  }
  public void setSitoInoculazione(String sitoInoculazione) {
    this.sitoInoculazione = sitoInoculazione;
  }

  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("via_somministrazione") 
 
  public String getViaSomministrazione() {
    return viaSomministrazione;
  }
  public void setViaSomministrazione(String viaSomministrazione) {
    this.viaSomministrazione = viaSomministrazione;
  }

  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("is_fittizia") 
 
  public Boolean isIsFittizia() {
    return isFittizia;
  }
  public void setIsFittizia(Boolean isFittizia) {
    this.isFittizia = isFittizia;
  }

  /**
   * Il codice SIRVA del paziente
   **/
  
  @ApiModelProperty(value = "Il codice SIRVA del paziente")
  @JsonProperty("paziente_codice") 
 
  public String getPazienteCodice() {
    return pazienteCodice;
  }
  public void setPazienteCodice(String pazienteCodice) {
    this.pazienteCodice = pazienteCodice;
  }

  /**
   * Il nome del paziente
   **/
  
  @ApiModelProperty(value = "Il nome del paziente")
  @JsonProperty("paziente_nome") 
 
  public String getPazienteNome() {
    return pazienteNome;
  }
  public void setPazienteNome(String pazienteNome) {
    this.pazienteNome = pazienteNome;
  }

  /**
   * Il cognome del paziente
   **/
  
  @ApiModelProperty(value = "Il cognome del paziente")
  @JsonProperty("paziente_cognome") 
 
  public String getPazienteCognome() {
    return pazienteCognome;
  }
  public void setPazienteCognome(String pazienteCognome) {
    this.pazienteCognome = pazienteCognome;
  }

  /**
   * La data di nascita del paziente
   **/
  
  @ApiModelProperty(example = "2019-11-08T09:21:38.739Z", value = "La data di nascita del paziente")
  @JsonProperty("paziente_data_nascita") 
 
  public String getPazienteDataNascita() {
    return pazienteDataNascita;
  }
  public void setPazienteDataNascita(String pazienteDataNascita) {
    this.pazienteDataNascita = pazienteDataNascita;
  }

  /**
   * la data dell&#39;apputamento
   **/
  
  @ApiModelProperty(example = "2019-11-08T09:21:38.739Z", required = true, value = "la data dell'apputamento")
  @JsonProperty("data_appuntamento") 
 
  @NotNull
  public String getDataAppuntamento() {
    return dataAppuntamento;
  }
  public void setDataAppuntamento(String dataAppuntamento) {
    this.dataAppuntamento = dataAppuntamento;
  }

  /**
   * data + ora appuntamento
   **/
  
  @ApiModelProperty(example = "2019-11-08T09:21:38.739Z", value = "data + ora appuntamento")
  @JsonProperty("ora_appuntamento") 
 
  public String getOraAppuntamento() {
    return oraAppuntamento;
  }
  public void setOraAppuntamento(String oraAppuntamento) {
    this.oraAppuntamento = oraAppuntamento;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("reazione_avversa") 
 
  public ModelReazioneAvversa getReazioneAvversa() {
    return reazioneAvversa;
  }
  public void setReazioneAvversa(ModelReazioneAvversa reazioneAvversa) {
    this.reazioneAvversa = reazioneAvversa;
  }

  /**
   * Il medico responsabile
   **/
  
  @ApiModelProperty(value = "Il medico responsabile")
  @JsonProperty("medico_responsabile") 
 
  public String getMedicoResponsabile() {
    return medicoResponsabile;
  }
  public void setMedicoResponsabile(String medicoResponsabile) {
    this.medicoResponsabile = medicoResponsabile;
  }

  /**
   * Il numero pratica regionale
   **/
  
  @ApiModelProperty(value = "Il numero pratica regionale")
  @JsonProperty("numero_pratica_regionale") 
 
  public String getNumeroPraticaRegionale() {
    return numeroPraticaRegionale;
  }
  public void setNumeroPraticaRegionale(String numeroPraticaRegionale) {
    this.numeroPraticaRegionale = numeroPraticaRegionale;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("asl") 
 
  public ModelAsl getAsl() {
    return asl;
  }
  public void setAsl(ModelAsl asl) {
    this.asl = asl;
  }

  /**
   * TODO - Spiegare cos&#39;è
   **/
  
  @ApiModelProperty(required = true, value = "TODO - Spiegare cos'è")
  @JsonProperty("associazioni") 
 
  @NotNull
  public List<ModelSomministrazioneAssociazioni> getAssociazioni() {
    return associazioni;
  }
  public void setAssociazioni(List<ModelSomministrazioneAssociazioni> associazioni) {
    this.associazioni = associazioni;
  }

  /**
   * codice della condizione sanitaria
   **/
  
  @ApiModelProperty(value = "codice della condizione sanitaria")
  @JsonProperty("condizione_sanitaria_codice") 
 
  public String getCondizioneSanitariaCodice() {
    return condizioneSanitariaCodice;
  }
  public void setCondizioneSanitariaCodice(String condizioneSanitariaCodice) {
    this.condizioneSanitariaCodice = condizioneSanitariaCodice;
  }

  /**
   * descrizione della condizione sanitaria
   **/
  
  @ApiModelProperty(value = "descrizione della condizione sanitaria")
  @JsonProperty("condizione_sanitaria_descrizione") 
 
  public String getCondizioneSanitariaDescrizione() {
    return condizioneSanitariaDescrizione;
  }
  public void setCondizioneSanitariaDescrizione(String condizioneSanitariaDescrizione) {
    this.condizioneSanitariaDescrizione = condizioneSanitariaDescrizione;
  }

  /**
   * codice condizione di rischio
   **/
  
  @ApiModelProperty(value = "codice condizione di rischio")
  @JsonProperty("condizione_rischio_codice") 
 
  public String getCondizioneRischioCodice() {
    return condizioneRischioCodice;
  }
  public void setCondizioneRischioCodice(String condizioneRischioCodice) {
    this.condizioneRischioCodice = condizioneRischioCodice;
  }

  /**
   * descrizione condizione di rischio
   **/
  
  @ApiModelProperty(value = "descrizione condizione di rischio")
  @JsonProperty("condizione_rischio_descrizione") 
 
  public String getCondizioneRischioDescrizione() {
    return condizioneRischioDescrizione;
  }
  public void setCondizioneRischioDescrizione(String condizioneRischioDescrizione) {
    this.condizioneRischioDescrizione = condizioneRischioDescrizione;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelSomministrazione modelSomministrazione = (ModelSomministrazione) o;
    return Objects.equals(id, modelSomministrazione.id) &&
        Objects.equals(centroVaccinale, modelSomministrazione.centroVaccinale) &&
        Objects.equals(ambulatorio, modelSomministrazione.ambulatorio) &&
        Objects.equals(comuneCentro, modelSomministrazione.comuneCentro) &&
        Objects.equals(telefonoCentro, modelSomministrazione.telefonoCentro) &&
        Objects.equals(lotto, modelSomministrazione.lotto) &&
        Objects.equals(nomeCommerciale, modelSomministrazione.nomeCommerciale) &&
        Objects.equals(vaccinatore, modelSomministrazione.vaccinatore) &&
        Objects.equals(sitoInoculazione, modelSomministrazione.sitoInoculazione) &&
        Objects.equals(viaSomministrazione, modelSomministrazione.viaSomministrazione) &&
        Objects.equals(isFittizia, modelSomministrazione.isFittizia) &&
        Objects.equals(pazienteCodice, modelSomministrazione.pazienteCodice) &&
        Objects.equals(pazienteNome, modelSomministrazione.pazienteNome) &&
        Objects.equals(pazienteCognome, modelSomministrazione.pazienteCognome) &&
        Objects.equals(pazienteDataNascita, modelSomministrazione.pazienteDataNascita) &&
        Objects.equals(dataAppuntamento, modelSomministrazione.dataAppuntamento) &&
        Objects.equals(oraAppuntamento, modelSomministrazione.oraAppuntamento) &&
        Objects.equals(reazioneAvversa, modelSomministrazione.reazioneAvversa) &&
        Objects.equals(medicoResponsabile, modelSomministrazione.medicoResponsabile) &&
        Objects.equals(numeroPraticaRegionale, modelSomministrazione.numeroPraticaRegionale) &&
        Objects.equals(asl, modelSomministrazione.asl) &&
        Objects.equals(associazioni, modelSomministrazione.associazioni) &&
        Objects.equals(condizioneSanitariaCodice, modelSomministrazione.condizioneSanitariaCodice) &&
        Objects.equals(condizioneSanitariaDescrizione, modelSomministrazione.condizioneSanitariaDescrizione) &&
        Objects.equals(condizioneRischioCodice, modelSomministrazione.condizioneRischioCodice) &&
        Objects.equals(condizioneRischioDescrizione, modelSomministrazione.condizioneRischioDescrizione);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, centroVaccinale, ambulatorio, comuneCentro, telefonoCentro, lotto, nomeCommerciale, vaccinatore, sitoInoculazione, viaSomministrazione, isFittizia, pazienteCodice, pazienteNome, pazienteCognome, pazienteDataNascita, dataAppuntamento, oraAppuntamento, reazioneAvversa, medicoResponsabile, numeroPraticaRegionale, asl, associazioni, condizioneSanitariaCodice, condizioneSanitariaDescrizione, condizioneRischioCodice, condizioneRischioDescrizione);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelSomministrazione {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    centroVaccinale: ").append(toIndentedString(centroVaccinale)).append("\n");
    sb.append("    ambulatorio: ").append(toIndentedString(ambulatorio)).append("\n");
    sb.append("    comuneCentro: ").append(toIndentedString(comuneCentro)).append("\n");
    sb.append("    telefonoCentro: ").append(toIndentedString(telefonoCentro)).append("\n");
    sb.append("    lotto: ").append(toIndentedString(lotto)).append("\n");
    sb.append("    nomeCommerciale: ").append(toIndentedString(nomeCommerciale)).append("\n");
    sb.append("    vaccinatore: ").append(toIndentedString(vaccinatore)).append("\n");
    sb.append("    sitoInoculazione: ").append(toIndentedString(sitoInoculazione)).append("\n");
    sb.append("    viaSomministrazione: ").append(toIndentedString(viaSomministrazione)).append("\n");
    sb.append("    isFittizia: ").append(toIndentedString(isFittizia)).append("\n");
    sb.append("    pazienteCodice: ").append(toIndentedString(pazienteCodice)).append("\n");
    sb.append("    pazienteNome: ").append(toIndentedString(pazienteNome)).append("\n");
    sb.append("    pazienteCognome: ").append(toIndentedString(pazienteCognome)).append("\n");
    sb.append("    pazienteDataNascita: ").append(toIndentedString(pazienteDataNascita)).append("\n");
    sb.append("    dataAppuntamento: ").append(toIndentedString(dataAppuntamento)).append("\n");
    sb.append("    oraAppuntamento: ").append(toIndentedString(oraAppuntamento)).append("\n");
    sb.append("    reazioneAvversa: ").append(toIndentedString(reazioneAvversa)).append("\n");
    sb.append("    medicoResponsabile: ").append(toIndentedString(medicoResponsabile)).append("\n");
    sb.append("    numeroPraticaRegionale: ").append(toIndentedString(numeroPraticaRegionale)).append("\n");
    sb.append("    asl: ").append(toIndentedString(asl)).append("\n");
    sb.append("    associazioni: ").append(toIndentedString(associazioni)).append("\n");
    sb.append("    condizioneSanitariaCodice: ").append(toIndentedString(condizioneSanitariaCodice)).append("\n");
    sb.append("    condizioneSanitariaDescrizione: ").append(toIndentedString(condizioneSanitariaDescrizione)).append("\n");
    sb.append("    condizioneRischioCodice: ").append(toIndentedString(condizioneRischioCodice)).append("\n");
    sb.append("    condizioneRischioDescrizione: ").append(toIndentedString(condizioneRischioDescrizione)).append("\n");
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

