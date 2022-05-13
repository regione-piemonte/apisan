/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.dto.apisanpresc;

import io.swagger.annotations.ApiModelProperty;
import org.codehaus.jackson.annotate.JsonProperty;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;



public class ModelRicetta   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String nre = "";
  private Date dataCompilazione = null;
  private Date dataFineValidita = null;
  private Boolean nascosta = null;
  private Boolean regionale = null;
  private Boolean completa = null;
  private ModelTipologiaRicetta tipologia = null;
  private ModelStatoRicetta stato = null;
  private ModelPrioritaRicetta priorita = null;
  private ModelCittadino assistito = null;
  private ModelMedico medicoPrescrittore = null;
  private ModelEsenzione esenzione = null;
  private List<ModelPrescrizione> prescrizioni = new ArrayList<ModelPrescrizione>();
  private String diagnosi = "";

  /**
   * Identificativo della ricetta all&#39;interno dei sistema (Numero di Ricetta Elettronica) 
   **/
  
  @ApiModelProperty(required = true, value = "Identificativo della ricetta all'interno dei sistema (Numero di Ricetta Elettronica) ")
  @JsonProperty("nre") 
 
  @NotNull
  public String getNre() {
    return nre;
  }
  public void setNre(String nre) {
    this.nre = nre;
  }

  /**
   * Data di compilazione della ricetta 
   **/
  
  @ApiModelProperty(required = true, value = "Data di compilazione della ricetta ")
  @JsonProperty("data_compilazione") 
 
  @NotNull
  public Date getDataCompilazione() {
    return dataCompilazione;
  }
  public void setDataCompilazione(Date dataCompilazione) {
    this.dataCompilazione = dataCompilazione;
  }

  /**
   * La data di fine validità della ricetta
   **/
  
  @ApiModelProperty(required = true, value = "La data di fine validità della ricetta")
  @JsonProperty("data_fine_validita") 
 
  @NotNull
  public Date getDataFineValidita() {
    return dataFineValidita;
  }
  public void setDataFineValidita(Date dataFineValidita) {
    this.dataFineValidita = dataFineValidita;
  }

  /**
   * Flag che indica se la ricetta è stata nascosta dall&#39;utente
   **/
  
  @ApiModelProperty(required = true, value = "Flag che indica se la ricetta è stata nascosta dall'utente")
  @JsonProperty("nascosta") 
 
  @NotNull
  public Boolean isNascosta() {
    return nascosta;
  }
  public void setNascosta(Boolean nascosta) {
    this.nascosta = nascosta;
  }

  /**
   * Flag che indica se la ricetta è regionale o meno 
   **/
  
  @ApiModelProperty(required = true, value = "Flag che indica se la ricetta è regionale o meno ")
  @JsonProperty("regionale") 
 
  @NotNull
  public Boolean isRegionale() {
    return regionale;
  }
  public void setRegionale(Boolean regionale) {
    this.regionale = regionale;
  }

  /**
   * Flag che indica se la ricetta contiene tutti i dati oppure se non è stato possibile e non è possibile ottenere alcuni dati della ricetta. Utile per avvisare l&#39;utente che i dati forniti non sono completi e non è possibile saperne di più 
   **/
  
  @ApiModelProperty(required = true, value = "Flag che indica se la ricetta contiene tutti i dati oppure se non è stato possibile e non è possibile ottenere alcuni dati della ricetta. Utile per avvisare l'utente che i dati forniti non sono completi e non è possibile saperne di più ")
  @JsonProperty("completa") 
 
  @NotNull
  public Boolean isCompleta() {
    return completa;
  }
  public void setCompleta(Boolean completa) {
    this.completa = completa;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("tipologia") 
 
  @NotNull
  public ModelTipologiaRicetta getTipologia() {
    return tipologia;
  }
  public void setTipologia(ModelTipologiaRicetta tipologia) {
    this.tipologia = tipologia;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("stato") 
 
  public ModelStatoRicetta getStato() {
    return stato;
  }
  public void setStato(ModelStatoRicetta stato) {
    this.stato = stato;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("priorita") 
 
  public ModelPrioritaRicetta getPriorita() {
    return priorita;
  }
  public void setPriorita(ModelPrioritaRicetta priorita) {
    this.priorita = priorita;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("assistito") 
 
  @NotNull
  public ModelCittadino getAssistito() {
    return assistito;
  }
  public void setAssistito(ModelCittadino assistito) {
    this.assistito = assistito;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("medico_prescrittore") 
 
  @NotNull
  public ModelMedico getMedicoPrescrittore() {
    return medicoPrescrittore;
  }
  public void setMedicoPrescrittore(ModelMedico medicoPrescrittore) {
    this.medicoPrescrittore = medicoPrescrittore;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("esenzione") 
 
  public ModelEsenzione getEsenzione() {
    return esenzione;
  }
  public void setEsenzione(ModelEsenzione esenzione) {
    this.esenzione = esenzione;
  }

  /**
   * Elenco delle prestazioni e/o dei farmaci prescritti in questa ricetta. 
   **/
  
  @ApiModelProperty(value = "Elenco delle prestazioni e/o dei farmaci prescritti in questa ricetta. ")
  @JsonProperty("prescrizioni") 
 
  public List<ModelPrescrizione> getPrescrizioni() {
    return prescrizioni;
  }
  public void setPrescrizioni(List<ModelPrescrizione> prescrizioni) {
    this.prescrizioni = prescrizioni;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("diagnosi") 
 
  public String getDiagnosi() {
    return diagnosi;
  }
  public void setDiagnosi(String diagnosi) {
    this.diagnosi = diagnosi;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelRicetta modelRicetta = (ModelRicetta) o;
    return Objects.equals(nre, modelRicetta.nre) &&
        Objects.equals(dataCompilazione, modelRicetta.dataCompilazione) &&
        Objects.equals(dataFineValidita, modelRicetta.dataFineValidita) &&
        Objects.equals(nascosta, modelRicetta.nascosta) &&
        Objects.equals(regionale, modelRicetta.regionale) &&
        Objects.equals(completa, modelRicetta.completa) &&
        Objects.equals(tipologia, modelRicetta.tipologia) &&
        Objects.equals(stato, modelRicetta.stato) &&
        Objects.equals(priorita, modelRicetta.priorita) &&
        Objects.equals(assistito, modelRicetta.assistito) &&
        Objects.equals(medicoPrescrittore, modelRicetta.medicoPrescrittore) &&
        Objects.equals(esenzione, modelRicetta.esenzione) &&
        Objects.equals(prescrizioni, modelRicetta.prescrizioni) &&
        Objects.equals(diagnosi, modelRicetta.diagnosi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nre, dataCompilazione, dataFineValidita, nascosta, regionale, completa, tipologia, stato, priorita, assistito, medicoPrescrittore, esenzione, prescrizioni, diagnosi);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelRicetta {\n");
    
    sb.append("    nre: ").append(toIndentedString(nre)).append("\n");
    sb.append("    dataCompilazione: ").append(toIndentedString(dataCompilazione)).append("\n");
    sb.append("    dataFineValidita: ").append(toIndentedString(dataFineValidita)).append("\n");
    sb.append("    nascosta: ").append(toIndentedString(nascosta)).append("\n");
    sb.append("    regionale: ").append(toIndentedString(regionale)).append("\n");
    sb.append("    completa: ").append(toIndentedString(completa)).append("\n");
    sb.append("    tipologia: ").append(toIndentedString(tipologia)).append("\n");
    sb.append("    stato: ").append(toIndentedString(stato)).append("\n");
    sb.append("    priorita: ").append(toIndentedString(priorita)).append("\n");
    sb.append("    assistito: ").append(toIndentedString(assistito)).append("\n");
    sb.append("    medicoPrescrittore: ").append(toIndentedString(medicoPrescrittore)).append("\n");
    sb.append("    esenzione: ").append(toIndentedString(esenzione)).append("\n");
    sb.append("    prescrizioni: ").append(toIndentedString(prescrizioni)).append("\n");
    sb.append("    diagnosi: ").append(toIndentedString(diagnosi)).append("\n");
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

