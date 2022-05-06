/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import it.csi.apisan.apisanvac.model.ModelAsl;
import it.csi.apisan.apisanvac.model.ModelCittadinoContatti;
import it.csi.apisan.apisanvac.model.ModelCittadinoIndirizzo;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Rappresenta il cittadino <span style=\"text-decoration: underline;\">   Per popolare tutti i campi é necessario effettuare 2 chiamate allo strato giallo </span> ")

public class ModelCittadino   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String codiceFiscale = null;
  private String codicePaziente = null;
  private String nome = null;
  private String cognome = null;
  private Date dataNascita = null;
  private String comuneNascita = null;
  private String sesso = null;
  private String centroVaccinale = null;
  private ModelAsl asl = null;
  private ModelCittadinoIndirizzo domicilioVaccinazioni = null;
  private ModelCittadinoContatti contattiVaccinazioni = null;
  private String categoriaRischioCodice = null;
  private String categoriaRischioDescrizione = null;

  /**
   * codice fiscale
   **/
  
  @ApiModelProperty(required = true, value = "codice fiscale")
  @JsonProperty("codice_fiscale") 
 
  @NotNull
  public String getCodiceFiscale() {
    return codiceFiscale;
  }
  public void setCodiceFiscale(String codiceFiscale) {
    this.codiceFiscale = codiceFiscale;
  }

  /**
   * codice paziente
   **/
  
  @ApiModelProperty(value = "codice paziente")
  @JsonProperty("codice_paziente") 
 
  public String getCodicePaziente() {
    return codicePaziente;
  }
  public void setCodicePaziente(String codicePaziente) {
    this.codicePaziente = codicePaziente;
  }

  /**
   * nome
   **/
  
  @ApiModelProperty(required = true, value = "nome")
  @JsonProperty("nome") 
 
  @NotNull
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  /**
   * cognome
   **/
  
  @ApiModelProperty(required = true, value = "cognome")
  @JsonProperty("cognome") 
 
  @NotNull
  public String getCognome() {
    return cognome;
  }
  public void setCognome(String cognome) {
    this.cognome = cognome;
  }

  /**
   * data di nascita
   **/
  
  @ApiModelProperty(required = true, value = "data di nascita")
  @JsonProperty("data_nascita") 
 
  @NotNull
  public Date getDataNascita() {
    return dataNascita;
  }
  public void setDataNascita(Date dataNascita) {
    this.dataNascita = dataNascita;
  }

  /**
   * comune di nascita
   **/
  
  @ApiModelProperty(value = "comune di nascita")
  @JsonProperty("comune_nascita") 
 
  public String getComuneNascita() {
    return comuneNascita;
  }
  public void setComuneNascita(String comuneNascita) {
    this.comuneNascita = comuneNascita;
  }

  /**
   * sesso
   **/
  
  @ApiModelProperty(value = "sesso")
  @JsonProperty("sesso") 
 
  public String getSesso() {
    return sesso;
  }
  public void setSesso(String sesso) {
    this.sesso = sesso;
  }

  /**
   * L&#39;id del centro vaccinale di riferimento del cittadino. &lt;span style&#x3D;\&quot;text-decoration: underline;\&quot;&gt; Non è fornito dallo strato giallo &lt;/span&gt; 
   **/
  
  @ApiModelProperty(required = true, value = "L'id del centro vaccinale di riferimento del cittadino. <span style=\"text-decoration: underline;\"> Non è fornito dallo strato giallo </span> ")
  @JsonProperty("centro_vaccinale") 
 
  @NotNull
  public String getCentroVaccinale() {
    return centroVaccinale;
  }
  public void setCentroVaccinale(String centroVaccinale) {
    this.centroVaccinale = centroVaccinale;
  }

  /**
   * L&#39;ASL di riferimento del cittadino 
   **/
  
  @ApiModelProperty(required = true, value = "L'ASL di riferimento del cittadino ")
  @JsonProperty("asl") 
 
  @NotNull
  public ModelAsl getAsl() {
    return asl;
  }
  public void setAsl(ModelAsl asl) {
    this.asl = asl;
  }

  /**
   * Il domicilio presso cui ricevere le lettere di vaccinazione 
   **/
  
  @ApiModelProperty(required = true, value = "Il domicilio presso cui ricevere le lettere di vaccinazione ")
  @JsonProperty("domicilio_vaccinazioni") 
 
  @NotNull
  public ModelCittadinoIndirizzo getDomicilioVaccinazioni() {
    return domicilioVaccinazioni;
  }
  public void setDomicilioVaccinazioni(ModelCittadinoIndirizzo domicilioVaccinazioni) {
    this.domicilioVaccinazioni = domicilioVaccinazioni;
  }

  /**
   * I contatti di riferimento del cittadino. &lt;span style&#x3D;\&quot;text-decoration: underline;\&quot;&gt; Sulle API gialle corrisponde ad un altro endpoint &lt;/span&gt; 
   **/
  
  @ApiModelProperty(required = true, value = "I contatti di riferimento del cittadino. <span style=\"text-decoration: underline;\"> Sulle API gialle corrisponde ad un altro endpoint </span> ")
  @JsonProperty("contatti_vaccinazioni") 
 
  @NotNull
  public ModelCittadinoContatti getContattiVaccinazioni() {
    return contattiVaccinazioni;
  }
  public void setContattiVaccinazioni(ModelCittadinoContatti contattiVaccinazioni) {
    this.contattiVaccinazioni = contattiVaccinazioni;
  }

  /**
   * codice categoria di rischio
   **/
  
  @ApiModelProperty(value = "codice categoria di rischio")
  @JsonProperty("categoria_rischio_codice") 
 
  public String getCategoriaRischioCodice() {
    return categoriaRischioCodice;
  }
  public void setCategoriaRischioCodice(String categoriaRischioCodice) {
    this.categoriaRischioCodice = categoriaRischioCodice;
  }

  /**
   * descrizione categoria di rischio
   **/
  
  @ApiModelProperty(value = "descrizione categoria di rischio")
  @JsonProperty("categoria_rischio_descrizione") 
 
  public String getCategoriaRischioDescrizione() {
    return categoriaRischioDescrizione;
  }
  public void setCategoriaRischioDescrizione(String categoriaRischioDescrizione) {
    this.categoriaRischioDescrizione = categoriaRischioDescrizione;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelCittadino modelCittadino = (ModelCittadino) o;
    return Objects.equals(codiceFiscale, modelCittadino.codiceFiscale) &&
        Objects.equals(codicePaziente, modelCittadino.codicePaziente) &&
        Objects.equals(nome, modelCittadino.nome) &&
        Objects.equals(cognome, modelCittadino.cognome) &&
        Objects.equals(dataNascita, modelCittadino.dataNascita) &&
        Objects.equals(comuneNascita, modelCittadino.comuneNascita) &&
        Objects.equals(sesso, modelCittadino.sesso) &&
        Objects.equals(centroVaccinale, modelCittadino.centroVaccinale) &&
        Objects.equals(asl, modelCittadino.asl) &&
        Objects.equals(domicilioVaccinazioni, modelCittadino.domicilioVaccinazioni) &&
        Objects.equals(contattiVaccinazioni, modelCittadino.contattiVaccinazioni) &&
        Objects.equals(categoriaRischioCodice, modelCittadino.categoriaRischioCodice) &&
        Objects.equals(categoriaRischioDescrizione, modelCittadino.categoriaRischioDescrizione);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codiceFiscale, codicePaziente, nome, cognome, dataNascita, comuneNascita, sesso, centroVaccinale, asl, domicilioVaccinazioni, contattiVaccinazioni, categoriaRischioCodice, categoriaRischioDescrizione);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelCittadino {\n");
    
    sb.append("    codiceFiscale: ").append(toIndentedString(codiceFiscale)).append("\n");
    sb.append("    codicePaziente: ").append(toIndentedString(codicePaziente)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    cognome: ").append(toIndentedString(cognome)).append("\n");
    sb.append("    dataNascita: ").append(toIndentedString(dataNascita)).append("\n");
    sb.append("    comuneNascita: ").append(toIndentedString(comuneNascita)).append("\n");
    sb.append("    sesso: ").append(toIndentedString(sesso)).append("\n");
    sb.append("    centroVaccinale: ").append(toIndentedString(centroVaccinale)).append("\n");
    sb.append("    asl: ").append(toIndentedString(asl)).append("\n");
    sb.append("    domicilioVaccinazioni: ").append(toIndentedString(domicilioVaccinazioni)).append("\n");
    sb.append("    contattiVaccinazioni: ").append(toIndentedString(contattiVaccinazioni)).append("\n");
    sb.append("    categoriaRischioCodice: ").append(toIndentedString(categoriaRischioCodice)).append("\n");
    sb.append("    categoriaRischioDescrizione: ").append(toIndentedString(categoriaRischioDescrizione)).append("\n");
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

