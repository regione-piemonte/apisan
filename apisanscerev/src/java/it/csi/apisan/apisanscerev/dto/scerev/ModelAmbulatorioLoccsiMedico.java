/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.dto.scerev;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanscerev.dto.scerev.ModelAsl;
import it.csi.apisan.apisanscerev.dto.scerev.ModelMedicoAmbito;
import it.csi.apisan.apisanscerev.dto.scerev.ModelMedicoDistretto;
import it.csi.apisan.apisanscerev.dto.scerev.ModelMedicoTipologia;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelAmbulatorioLoccsiMedico   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String id = null;
  private String nome = null;
  private String cognome = null;
  private String sesso = null;
  private String dataNascita = null;
  private String codiceFiscale = null;
  private String mail = null;
  private String specializzazioni = null;
  private Boolean autolimitato = null;
  private Integer massimale = null;
  private Integer massimaleDeroga = null;
  private Integer massimaleAssistenzaTemporanea = null;
  private Integer massimaleInfanzia = null;
  private String codiceRegionale = null;
  private ModelMedicoDistretto distretto = null;
  private ModelMedicoAmbito ambito = null;
  private ModelMedicoTipologia tipologia = null;
  private ModelAsl asl = null;

  /**
   * Identificativo univoco
   **/
  
  @ApiModelProperty(example = "6545486", value = "Identificativo univoco")
  @JsonProperty("id") 
 
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Il nome del medico trovato
   **/
  
  @ApiModelProperty(example = "Mario", value = "Il nome del medico trovato")
  @JsonProperty("nome") 
 
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  /**
   * Il cognome del medico trovato
   **/
  
  @ApiModelProperty(example = "Rossi", value = "Il cognome del medico trovato")
  @JsonProperty("cognome") 
 
  public String getCognome() {
    return cognome;
  }
  public void setCognome(String cognome) {
    this.cognome = cognome;
  }

  /**
   * Il sesso del medico
   **/
  
  @ApiModelProperty(example = "M", value = "Il sesso del medico")
  @JsonProperty("sesso") 
 
  public String getSesso() {
    return sesso;
  }
  public void setSesso(String sesso) {
    this.sesso = sesso;
  }

  /**
   * La data di nascita del medico
   **/
  
  @ApiModelProperty(example = "1978-02-07", value = "La data di nascita del medico")
  @JsonProperty("dataNascita") 
 
  public String getDataNascita() {
    return dataNascita;
  }
  public void setDataNascita(String dataNascita) {
    this.dataNascita = dataNascita;
  }

  /**
   * Il codice fiscale del medico
   **/
  
  @ApiModelProperty(example = "MRARSS78M14I235F", value = "Il codice fiscale del medico")
  @JsonProperty("codiceFiscale") 
 
  public String getCodiceFiscale() {
    return codiceFiscale;
  }
  public void setCodiceFiscale(String codiceFiscale) {
    this.codiceFiscale = codiceFiscale;
  }

  /**
   * La mail del medico
   **/
  
  @ApiModelProperty(example = "mario.rossi@biella.asl.it", value = "La mail del medico")
  @JsonProperty("mail") 
 
  public String getMail() {
    return mail;
  }
  public void setMail(String mail) {
    this.mail = mail;
  }

  /**
   * Le specializzazioni del medico
   **/
  
  @ApiModelProperty(value = "Le specializzazioni del medico")
  @JsonProperty("specializzazioni") 
 
  public String getSpecializzazioni() {
    return specializzazioni;
  }
  public void setSpecializzazioni(String specializzazioni) {
    this.specializzazioni = specializzazioni;
  }

  /**
   * true se il medico si è autolimitato, fale altrimenti
   **/
  
  @ApiModelProperty(example = "true", value = "true se il medico si è autolimitato, fale altrimenti")
  @JsonProperty("autolimitato") 
 
  public Boolean isAutolimitato() {
    return autolimitato;
  }
  public void setAutolimitato(Boolean autolimitato) {
    this.autolimitato = autolimitato;
  }

  /**
   * Il massimale del medico
   **/
  
  @ApiModelProperty(example = "1500", value = "Il massimale del medico")
  @JsonProperty("massimale") 
 
  public Integer getMassimale() {
    return massimale;
  }
  public void setMassimale(Integer massimale) {
    this.massimale = massimale;
  }

  /**
   * Il massimale del medico per deroghe
   **/
  
  @ApiModelProperty(example = "1575", value = "Il massimale del medico per deroghe")
  @JsonProperty("massimaleDeroga") 
 
  public Integer getMassimaleDeroga() {
    return massimaleDeroga;
  }
  public void setMassimaleDeroga(Integer massimaleDeroga) {
    this.massimaleDeroga = massimaleDeroga;
  }

  /**
   * Il massimale per le assistenze temporanee
   **/
  
  @ApiModelProperty(example = "0", value = "Il massimale per le assistenze temporanee")
  @JsonProperty("massimaleAssistenzaTemporanea") 
 
  public Integer getMassimaleAssistenzaTemporanea() {
    return massimaleAssistenzaTemporanea;
  }
  public void setMassimaleAssistenzaTemporanea(Integer massimaleAssistenzaTemporanea) {
    this.massimaleAssistenzaTemporanea = massimaleAssistenzaTemporanea;
  }

  /**
   * Il massimale per minorenni in una determinata fascia di età
   **/
  
  @ApiModelProperty(example = "0", value = "Il massimale per minorenni in una determinata fascia di età")
  @JsonProperty("massimaleInfanzia") 
 
  public Integer getMassimaleInfanzia() {
    return massimaleInfanzia;
  }
  public void setMassimaleInfanzia(Integer massimaleInfanzia) {
    this.massimaleInfanzia = massimaleInfanzia;
  }

  /**
   * Un codice univoco del medico a livello regionale
   **/
  
  @ApiModelProperty(example = "018623U", value = "Un codice univoco del medico a livello regionale")
  @JsonProperty("codiceRegionale") 
 
  public String getCodiceRegionale() {
    return codiceRegionale;
  }
  public void setCodiceRegionale(String codiceRegionale) {
    this.codiceRegionale = codiceRegionale;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("distretto") 
 
  public ModelMedicoDistretto getDistretto() {
    return distretto;
  }
  public void setDistretto(ModelMedicoDistretto distretto) {
    this.distretto = distretto;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ambito") 
 
  public ModelMedicoAmbito getAmbito() {
    return ambito;
  }
  public void setAmbito(ModelMedicoAmbito ambito) {
    this.ambito = ambito;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tipologia") 
 
  public ModelMedicoTipologia getTipologia() {
    return tipologia;
  }
  public void setTipologia(ModelMedicoTipologia tipologia) {
    this.tipologia = tipologia;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelAmbulatorioLoccsiMedico modelAmbulatorioLoccsiMedico = (ModelAmbulatorioLoccsiMedico) o;
    return Objects.equals(id, modelAmbulatorioLoccsiMedico.id) &&
        Objects.equals(nome, modelAmbulatorioLoccsiMedico.nome) &&
        Objects.equals(cognome, modelAmbulatorioLoccsiMedico.cognome) &&
        Objects.equals(sesso, modelAmbulatorioLoccsiMedico.sesso) &&
        Objects.equals(dataNascita, modelAmbulatorioLoccsiMedico.dataNascita) &&
        Objects.equals(codiceFiscale, modelAmbulatorioLoccsiMedico.codiceFiscale) &&
        Objects.equals(mail, modelAmbulatorioLoccsiMedico.mail) &&
        Objects.equals(specializzazioni, modelAmbulatorioLoccsiMedico.specializzazioni) &&
        Objects.equals(autolimitato, modelAmbulatorioLoccsiMedico.autolimitato) &&
        Objects.equals(massimale, modelAmbulatorioLoccsiMedico.massimale) &&
        Objects.equals(massimaleDeroga, modelAmbulatorioLoccsiMedico.massimaleDeroga) &&
        Objects.equals(massimaleAssistenzaTemporanea, modelAmbulatorioLoccsiMedico.massimaleAssistenzaTemporanea) &&
        Objects.equals(massimaleInfanzia, modelAmbulatorioLoccsiMedico.massimaleInfanzia) &&
        Objects.equals(codiceRegionale, modelAmbulatorioLoccsiMedico.codiceRegionale) &&
        Objects.equals(distretto, modelAmbulatorioLoccsiMedico.distretto) &&
        Objects.equals(ambito, modelAmbulatorioLoccsiMedico.ambito) &&
        Objects.equals(tipologia, modelAmbulatorioLoccsiMedico.tipologia) &&
        Objects.equals(asl, modelAmbulatorioLoccsiMedico.asl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome, cognome, sesso, dataNascita, codiceFiscale, mail, specializzazioni, autolimitato, massimale, massimaleDeroga, massimaleAssistenzaTemporanea, massimaleInfanzia, codiceRegionale, distretto, ambito, tipologia, asl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelAmbulatorioLoccsiMedico {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    cognome: ").append(toIndentedString(cognome)).append("\n");
    sb.append("    sesso: ").append(toIndentedString(sesso)).append("\n");
    sb.append("    dataNascita: ").append(toIndentedString(dataNascita)).append("\n");
    sb.append("    codiceFiscale: ").append(toIndentedString(codiceFiscale)).append("\n");
    sb.append("    mail: ").append(toIndentedString(mail)).append("\n");
    sb.append("    specializzazioni: ").append(toIndentedString(specializzazioni)).append("\n");
    sb.append("    autolimitato: ").append(toIndentedString(autolimitato)).append("\n");
    sb.append("    massimale: ").append(toIndentedString(massimale)).append("\n");
    sb.append("    massimaleDeroga: ").append(toIndentedString(massimaleDeroga)).append("\n");
    sb.append("    massimaleAssistenzaTemporanea: ").append(toIndentedString(massimaleAssistenzaTemporanea)).append("\n");
    sb.append("    massimaleInfanzia: ").append(toIndentedString(massimaleInfanzia)).append("\n");
    sb.append("    codiceRegionale: ").append(toIndentedString(codiceRegionale)).append("\n");
    sb.append("    distretto: ").append(toIndentedString(distretto)).append("\n");
    sb.append("    ambito: ").append(toIndentedString(ambito)).append("\n");
    sb.append("    tipologia: ").append(toIndentedString(tipologia)).append("\n");
    sb.append("    asl: ").append(toIndentedString(asl)).append("\n");
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

