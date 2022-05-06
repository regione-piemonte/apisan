/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.dto.scerev;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanscerev.dto.scerev.ModelAsl;
import it.csi.apisan.apisanscerev.dto.scerev.ModelCambioMedicoRichiesta;
import it.csi.apisan.apisanscerev.dto.scerev.ModelCittadinanza;
import it.csi.apisan.apisanscerev.dto.scerev.ModelCittadinoDomicilio;
import it.csi.apisan.apisanscerev.dto.scerev.ModelCittadinoInfoMedico;
import it.csi.apisan.apisanscerev.dto.scerev.ModelCittadinoRecapiti;
import it.csi.apisan.apisanscerev.dto.scerev.ModelCittadinoResidenza;
import java.math.BigDecimal;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelCittadinoInfo   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private BigDecimal idAura = null;
  private String codiceFiscale = null;
  private String nome = null;
  private String cognome = null;
  private Date dataNascita = null;
  private String sesso = null;
  private Date dataInizioAssistenza = null;
  private Date dataFineAssistenza = null;
  private Date dataInizioAssistenzaMedico = null;
  private String comuneNascita = null;
  private Boolean medicoAltraRegione = null;
  private Date dataRevocaMedico = null;
  private Date dataRevocaAssistenza = null;
  private String statoAssistenza = null;
  private ModelAsl aslAssistenza = null;
  private ModelCittadinanza cittadinanza = null;
  private ModelCittadinoDomicilio domicilio = null;
  private ModelCittadinoResidenza residenza = null;
  private ModelCittadinoRecapiti recapiti = null;
  private ModelCittadinoInfoMedico medico = null;
  private ModelCambioMedicoRichiesta richiestaCambio = null;

  /**
   * L&#39;id dell&#39;assistito su AURA se presente, altrimenti null 
   **/
  
  @ApiModelProperty(value = "L'id dell'assistito su AURA se presente, altrimenti null ")
  @JsonProperty("idAura") 
 
  public BigDecimal getIdAura() {
    return idAura;
  }
  public void setIdAura(BigDecimal idAura) {
    this.idAura = idAura;
  }

  /**
   * Il codice fiscale del cittadino
   **/
  
  @ApiModelProperty(example = "NPLLSN90M14I804E", value = "Il codice fiscale del cittadino")
  @JsonProperty("codiceFiscale") 
 
  public String getCodiceFiscale() {
    return codiceFiscale;
  }
  public void setCodiceFiscale(String codiceFiscale) {
    this.codiceFiscale = codiceFiscale;
  }

  /**
   * Nome del cittadino
   **/
  
  @ApiModelProperty(example = "Alessandro", value = "Nome del cittadino")
  @JsonProperty("nome") 
 
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  /**
   * Cognome del cittadino
   **/
  
  @ApiModelProperty(example = "Napoli", value = "Cognome del cittadino")
  @JsonProperty("cognome") 
 
  public String getCognome() {
    return cognome;
  }
  public void setCognome(String cognome) {
    this.cognome = cognome;
  }

  /**
   * La data di nascita del cittadino
   **/
  
  @ApiModelProperty(example = "1990-08-14", value = "La data di nascita del cittadino")
  @JsonProperty("dataNascita") 
 
  public Date getDataNascita() {
    return dataNascita;
  }
  public void setDataNascita(Date dataNascita) {
    this.dataNascita = dataNascita;
  }

  /**
   * Il sesso del cittadino
   **/
  
  @ApiModelProperty(example = "M", value = "Il sesso del cittadino")
  @JsonProperty("sesso") 
 
  public String getSesso() {
    return sesso;
  }
  public void setSesso(String sesso) {
    this.sesso = sesso;
  }

  /**
   * La data di inizio dell&#39;assistenza
   **/
  
  @ApiModelProperty(example = "2020-01-01", value = "La data di inizio dell'assistenza")
  @JsonProperty("dataInizioAssistenza") 
 
  public Date getDataInizioAssistenza() {
    return dataInizioAssistenza;
  }
  public void setDataInizioAssistenza(Date dataInizioAssistenza) {
    this.dataInizioAssistenza = dataInizioAssistenza;
  }

  /**
   * La data di fine assistenza o null se l&#39;assistenza è illimitata. Se la data_fine_assistenza è impostata allora si tratta di assistenza temporanea.
   **/
  
  @ApiModelProperty(example = "2020-06-01", value = "La data di fine assistenza o null se l'assistenza è illimitata. Se la data_fine_assistenza è impostata allora si tratta di assistenza temporanea.")
  @JsonProperty("dataFineAssistenza") 
 
  public Date getDataFineAssistenza() {
    return dataFineAssistenza;
  }
  public void setDataFineAssistenza(Date dataFineAssistenza) {
    this.dataFineAssistenza = dataFineAssistenza;
  }

  /**
   * La data di inizio assistenza con il medico attuale
   **/
  
  @ApiModelProperty(example = "2020-01-01", value = "La data di inizio assistenza con il medico attuale")
  @JsonProperty("dataInizioAssistenzaMedico") 
 
  public Date getDataInizioAssistenzaMedico() {
    return dataInizioAssistenzaMedico;
  }
  public void setDataInizioAssistenzaMedico(Date dataInizioAssistenzaMedico) {
    this.dataInizioAssistenzaMedico = dataInizioAssistenzaMedico;
  }

  /**
   * Il comune di nascita
   **/
  
  @ApiModelProperty(example = "Roma", value = "Il comune di nascita")
  @JsonProperty("comuneNascita") 
 
  public String getComuneNascita() {
    return comuneNascita;
  }
  public void setComuneNascita(String comuneNascita) {
    this.comuneNascita = comuneNascita;
  }

  /**
   * true se il cittadino ha un medico in un&#39;altra regione, false altrimenti
   **/
  
  @ApiModelProperty(example = "false", value = "true se il cittadino ha un medico in un'altra regione, false altrimenti")
  @JsonProperty("medicoAltraRegione") 
 
  public Boolean isMedicoAltraRegione() {
    return medicoAltraRegione;
  }
  public void setMedicoAltraRegione(Boolean medicoAltraRegione) {
    this.medicoAltraRegione = medicoAltraRegione;
  }

  /**
   * La data di reovoca del medico
   **/
  
  @ApiModelProperty(value = "La data di reovoca del medico")
  @JsonProperty("dataRevocaMedico") 
 
  public Date getDataRevocaMedico() {
    return dataRevocaMedico;
  }
  public void setDataRevocaMedico(Date dataRevocaMedico) {
    this.dataRevocaMedico = dataRevocaMedico;
  }

  /**
   * La data di reovoca assistenza. Se valorizzato vuol dire che l&#39;assistenza è nello stato \&quot;Revocata\&quot;
   **/
  
  @ApiModelProperty(value = "La data di reovoca assistenza. Se valorizzato vuol dire che l'assistenza è nello stato \"Revocata\"")
  @JsonProperty("dataRevocaAssistenza") 
 
  public Date getDataRevocaAssistenza() {
    return dataRevocaAssistenza;
  }
  public void setDataRevocaAssistenza(Date dataRevocaAssistenza) {
    this.dataRevocaAssistenza = dataRevocaAssistenza;
  }

  /**
   * Lo stato dell&#39;assitenza
   **/
  
  @ApiModelProperty(example = "ATTIVA", value = "Lo stato dell'assitenza")
  @JsonProperty("statoAssistenza") 
 
  public String getStatoAssistenza() {
    return statoAssistenza;
  }
  public void setStatoAssistenza(String statoAssistenza) {
    this.statoAssistenza = statoAssistenza;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("aslAssistenza") 
 
  public ModelAsl getAslAssistenza() {
    return aslAssistenza;
  }
  public void setAslAssistenza(ModelAsl aslAssistenza) {
    this.aslAssistenza = aslAssistenza;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cittadinanza") 
 
  public ModelCittadinanza getCittadinanza() {
    return cittadinanza;
  }
  public void setCittadinanza(ModelCittadinanza cittadinanza) {
    this.cittadinanza = cittadinanza;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("domicilio") 
 
  public ModelCittadinoDomicilio getDomicilio() {
    return domicilio;
  }
  public void setDomicilio(ModelCittadinoDomicilio domicilio) {
    this.domicilio = domicilio;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("residenza") 
 
  public ModelCittadinoResidenza getResidenza() {
    return residenza;
  }
  public void setResidenza(ModelCittadinoResidenza residenza) {
    this.residenza = residenza;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("recapiti") 
 
  public ModelCittadinoRecapiti getRecapiti() {
    return recapiti;
  }
  public void setRecapiti(ModelCittadinoRecapiti recapiti) {
    this.recapiti = recapiti;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("medico") 
 
  public ModelCittadinoInfoMedico getMedico() {
    return medico;
  }
  public void setMedico(ModelCittadinoInfoMedico medico) {
    this.medico = medico;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("richiestaCambio") 
 
  public ModelCambioMedicoRichiesta getRichiestaCambio() {
    return richiestaCambio;
  }
  public void setRichiestaCambio(ModelCambioMedicoRichiesta richiestaCambio) {
    this.richiestaCambio = richiestaCambio;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelCittadinoInfo modelCittadinoInfo = (ModelCittadinoInfo) o;
    return Objects.equals(idAura, modelCittadinoInfo.idAura) &&
        Objects.equals(codiceFiscale, modelCittadinoInfo.codiceFiscale) &&
        Objects.equals(nome, modelCittadinoInfo.nome) &&
        Objects.equals(cognome, modelCittadinoInfo.cognome) &&
        Objects.equals(dataNascita, modelCittadinoInfo.dataNascita) &&
        Objects.equals(sesso, modelCittadinoInfo.sesso) &&
        Objects.equals(dataInizioAssistenza, modelCittadinoInfo.dataInizioAssistenza) &&
        Objects.equals(dataFineAssistenza, modelCittadinoInfo.dataFineAssistenza) &&
        Objects.equals(dataInizioAssistenzaMedico, modelCittadinoInfo.dataInizioAssistenzaMedico) &&
        Objects.equals(comuneNascita, modelCittadinoInfo.comuneNascita) &&
        Objects.equals(medicoAltraRegione, modelCittadinoInfo.medicoAltraRegione) &&
        Objects.equals(dataRevocaMedico, modelCittadinoInfo.dataRevocaMedico) &&
        Objects.equals(dataRevocaAssistenza, modelCittadinoInfo.dataRevocaAssistenza) &&
        Objects.equals(statoAssistenza, modelCittadinoInfo.statoAssistenza) &&
        Objects.equals(aslAssistenza, modelCittadinoInfo.aslAssistenza) &&
        Objects.equals(cittadinanza, modelCittadinoInfo.cittadinanza) &&
        Objects.equals(domicilio, modelCittadinoInfo.domicilio) &&
        Objects.equals(residenza, modelCittadinoInfo.residenza) &&
        Objects.equals(recapiti, modelCittadinoInfo.recapiti) &&
        Objects.equals(medico, modelCittadinoInfo.medico) &&
        Objects.equals(richiestaCambio, modelCittadinoInfo.richiestaCambio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idAura, codiceFiscale, nome, cognome, dataNascita, sesso, dataInizioAssistenza, dataFineAssistenza, dataInizioAssistenzaMedico, comuneNascita, medicoAltraRegione, dataRevocaMedico, dataRevocaAssistenza, statoAssistenza, aslAssistenza, cittadinanza, domicilio, residenza, recapiti, medico, richiestaCambio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelCittadinoInfo {\n");
    
    sb.append("    idAura: ").append(toIndentedString(idAura)).append("\n");
    sb.append("    codiceFiscale: ").append(toIndentedString(codiceFiscale)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    cognome: ").append(toIndentedString(cognome)).append("\n");
    sb.append("    dataNascita: ").append(toIndentedString(dataNascita)).append("\n");
    sb.append("    sesso: ").append(toIndentedString(sesso)).append("\n");
    sb.append("    dataInizioAssistenza: ").append(toIndentedString(dataInizioAssistenza)).append("\n");
    sb.append("    dataFineAssistenza: ").append(toIndentedString(dataFineAssistenza)).append("\n");
    sb.append("    dataInizioAssistenzaMedico: ").append(toIndentedString(dataInizioAssistenzaMedico)).append("\n");
    sb.append("    comuneNascita: ").append(toIndentedString(comuneNascita)).append("\n");
    sb.append("    medicoAltraRegione: ").append(toIndentedString(medicoAltraRegione)).append("\n");
    sb.append("    dataRevocaMedico: ").append(toIndentedString(dataRevocaMedico)).append("\n");
    sb.append("    dataRevocaAssistenza: ").append(toIndentedString(dataRevocaAssistenza)).append("\n");
    sb.append("    statoAssistenza: ").append(toIndentedString(statoAssistenza)).append("\n");
    sb.append("    aslAssistenza: ").append(toIndentedString(aslAssistenza)).append("\n");
    sb.append("    cittadinanza: ").append(toIndentedString(cittadinanza)).append("\n");
    sb.append("    domicilio: ").append(toIndentedString(domicilio)).append("\n");
    sb.append("    residenza: ").append(toIndentedString(residenza)).append("\n");
    sb.append("    recapiti: ").append(toIndentedString(recapiti)).append("\n");
    sb.append("    medico: ").append(toIndentedString(medico)).append("\n");
    sb.append("    richiestaCambio: ").append(toIndentedString(richiestaCambio)).append("\n");
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

