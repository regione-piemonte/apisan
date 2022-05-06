/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.dto.scerev;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanscerev.dto.scerev.ModelAllegati;
import it.csi.apisan.apisanscerev.dto.scerev.ModelAmbulatorioLoccsiMedico;
import it.csi.apisan.apisanscerev.dto.scerev.ModelCambioMedicoMedicoAltraRegione;
import it.csi.apisan.apisanscerev.dto.scerev.ModelCambioMedicoRichiestaDatiAggiuntivi;
import it.csi.apisan.apisanscerev.dto.scerev.ModelCittadinanza;
import it.csi.apisan.apisanscerev.dto.scerev.ModelCittadinoDomicilio;
import it.csi.apisan.apisanscerev.dto.scerev.ModelCittadinoRecapiti;
import it.csi.apisan.apisanscerev.dto.scerev.ModelCittadinoResidenza;
import it.csi.apisan.apisanscerev.dto.scerev.ModelControlloCombinazione;
import it.csi.apisan.apisanscerev.dto.scerev.ModelDelegato;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class Payload1   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private Boolean bozza = null;
  private Boolean rinnovoAssistenza = null;
  private ModelControlloCombinazione controlloCombinazione = null;
  private ModelAmbulatorioLoccsiMedico medico = null;
  private ModelCittadinanza cittadinanza = null;
  private ModelCittadinoDomicilio domicilio = null;
  private ModelCittadinoResidenza residenza = null;
  private ModelCittadinoRecapiti recapiti = null;
  private ModelCambioMedicoMedicoAltraRegione medicoAltraRegione = null;
  private ModelCambioMedicoRichiestaDatiAggiuntivi datiAggiuntivi = null;
  private ModelDelegato delegato = null;
  private ModelAllegati allegati = null;

  /**
   * true se si tratta di una bozza, false altrimenti
   **/
  
  @ApiModelProperty(required = true, value = "true se si tratta di una bozza, false altrimenti")
  @JsonProperty("bozza") 
 
  @NotNull
  public Boolean isBozza() {
    return bozza;
  }
  public void setBozza(Boolean bozza) {
    this.bozza = bozza;
  }

  /**
   * indica se si tratta o meno di un rinnovo dell&#39;assistenza
   **/
  
  @ApiModelProperty(value = "indica se si tratta o meno di un rinnovo dell'assistenza")
  @JsonProperty("rinnovoAssistenza") 
 
  public Boolean isRinnovoAssistenza() {
    return rinnovoAssistenza;
  }
  public void setRinnovoAssistenza(Boolean rinnovoAssistenza) {
    this.rinnovoAssistenza = rinnovoAssistenza;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("controlloCombinazione") 
 
  @NotNull
  public ModelControlloCombinazione getControlloCombinazione() {
    return controlloCombinazione;
  }
  public void setControlloCombinazione(ModelControlloCombinazione controlloCombinazione) {
    this.controlloCombinazione = controlloCombinazione;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("medico") 
 
  @NotNull
  public ModelAmbulatorioLoccsiMedico getMedico() {
    return medico;
  }
  public void setMedico(ModelAmbulatorioLoccsiMedico medico) {
    this.medico = medico;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("cittadinanza") 
 
  @NotNull
  public ModelCittadinanza getCittadinanza() {
    return cittadinanza;
  }
  public void setCittadinanza(ModelCittadinanza cittadinanza) {
    this.cittadinanza = cittadinanza;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("domicilio") 
 
  @NotNull
  public ModelCittadinoDomicilio getDomicilio() {
    return domicilio;
  }
  public void setDomicilio(ModelCittadinoDomicilio domicilio) {
    this.domicilio = domicilio;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("residenza") 
 
  @NotNull
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
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("medicoAltraRegione") 
 
  @NotNull
  public ModelCambioMedicoMedicoAltraRegione getMedicoAltraRegione() {
    return medicoAltraRegione;
  }
  public void setMedicoAltraRegione(ModelCambioMedicoMedicoAltraRegione medicoAltraRegione) {
    this.medicoAltraRegione = medicoAltraRegione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("datiAggiuntivi") 
 
  public ModelCambioMedicoRichiestaDatiAggiuntivi getDatiAggiuntivi() {
    return datiAggiuntivi;
  }
  public void setDatiAggiuntivi(ModelCambioMedicoRichiestaDatiAggiuntivi datiAggiuntivi) {
    this.datiAggiuntivi = datiAggiuntivi;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("delegato") 
 
  public ModelDelegato getDelegato() {
    return delegato;
  }
  public void setDelegato(ModelDelegato delegato) {
    this.delegato = delegato;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("allegati") 
 
  public ModelAllegati getAllegati() {
    return allegati;
  }
  public void setAllegati(ModelAllegati allegati) {
    this.allegati = allegati;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Payload1 payload1 = (Payload1) o;
    return Objects.equals(bozza, payload1.bozza) &&
        Objects.equals(rinnovoAssistenza, payload1.rinnovoAssistenza) &&
        Objects.equals(controlloCombinazione, payload1.controlloCombinazione) &&
        Objects.equals(medico, payload1.medico) &&
        Objects.equals(cittadinanza, payload1.cittadinanza) &&
        Objects.equals(domicilio, payload1.domicilio) &&
        Objects.equals(residenza, payload1.residenza) &&
        Objects.equals(recapiti, payload1.recapiti) &&
        Objects.equals(medicoAltraRegione, payload1.medicoAltraRegione) &&
        Objects.equals(datiAggiuntivi, payload1.datiAggiuntivi) &&
        Objects.equals(delegato, payload1.delegato) &&
        Objects.equals(allegati, payload1.allegati);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bozza, rinnovoAssistenza, controlloCombinazione, medico, cittadinanza, domicilio, residenza, recapiti, medicoAltraRegione, datiAggiuntivi, delegato, allegati);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payload1 {\n");
    
    sb.append("    bozza: ").append(toIndentedString(bozza)).append("\n");
    sb.append("    rinnovoAssistenza: ").append(toIndentedString(rinnovoAssistenza)).append("\n");
    sb.append("    controlloCombinazione: ").append(toIndentedString(controlloCombinazione)).append("\n");
    sb.append("    medico: ").append(toIndentedString(medico)).append("\n");
    sb.append("    cittadinanza: ").append(toIndentedString(cittadinanza)).append("\n");
    sb.append("    domicilio: ").append(toIndentedString(domicilio)).append("\n");
    sb.append("    residenza: ").append(toIndentedString(residenza)).append("\n");
    sb.append("    recapiti: ").append(toIndentedString(recapiti)).append("\n");
    sb.append("    medicoAltraRegione: ").append(toIndentedString(medicoAltraRegione)).append("\n");
    sb.append("    datiAggiuntivi: ").append(toIndentedString(datiAggiuntivi)).append("\n");
    sb.append("    delegato: ").append(toIndentedString(delegato)).append("\n");
    sb.append("    allegati: ").append(toIndentedString(allegati)).append("\n");
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

