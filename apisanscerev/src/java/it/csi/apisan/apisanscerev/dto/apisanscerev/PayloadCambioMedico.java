/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.dto.apisanscerev;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelAllegati;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelCambioMedicoMedicoAltraRegione;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelCambioMedicoRichiestaDatiAggiuntivi;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelCittadinanza;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelCittadinoDomicilio;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelCittadinoRecapiti;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelCittadinoResidenza;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelControlloCombinazione;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class PayloadCambioMedico   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private Boolean bozza = null;
  private Boolean rinnovoAssistenza = null;
  private ModelControlloCombinazione controlloCombinazione = null;
  private ModelCittadinanza cittadinanza = null;
  private ModelCittadinoDomicilio domicilio = null;
  private ModelCittadinoResidenza residenza = null;
  private ModelCittadinoRecapiti recapiti = null;
  private ModelCambioMedicoMedicoAltraRegione medicoAltraRegione = null;
  private ModelCambioMedicoRichiestaDatiAggiuntivi datiAggiuntivi = null;
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
  @JsonProperty("rinnovo_assistenza") 
 
  public Boolean isRinnovoAssistenza() {
    return rinnovoAssistenza;
  }
  public void setRinnovoAssistenza(Boolean rinnovoAssistenza) {
    this.rinnovoAssistenza = rinnovoAssistenza;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("controllo_combinazione") 
 
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
  @JsonProperty("medico_altra_regione") 
 
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
  @JsonProperty("dati_aggiuntivi") 
 
  public ModelCambioMedicoRichiestaDatiAggiuntivi getDatiAggiuntivi() {
    return datiAggiuntivi;
  }
  public void setDatiAggiuntivi(ModelCambioMedicoRichiestaDatiAggiuntivi datiAggiuntivi) {
    this.datiAggiuntivi = datiAggiuntivi;
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
    PayloadCambioMedico payloadCambioMedico = (PayloadCambioMedico) o;
    return Objects.equals(bozza, payloadCambioMedico.bozza) &&
        Objects.equals(rinnovoAssistenza, payloadCambioMedico.rinnovoAssistenza) &&
        Objects.equals(controlloCombinazione, payloadCambioMedico.controlloCombinazione) &&
        Objects.equals(cittadinanza, payloadCambioMedico.cittadinanza) &&
        Objects.equals(domicilio, payloadCambioMedico.domicilio) &&
        Objects.equals(residenza, payloadCambioMedico.residenza) &&
        Objects.equals(recapiti, payloadCambioMedico.recapiti) &&
        Objects.equals(medicoAltraRegione, payloadCambioMedico.medicoAltraRegione) &&
        Objects.equals(datiAggiuntivi, payloadCambioMedico.datiAggiuntivi) &&
        Objects.equals(allegati, payloadCambioMedico.allegati);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bozza, rinnovoAssistenza, controlloCombinazione, cittadinanza, domicilio, residenza, recapiti, medicoAltraRegione, datiAggiuntivi, allegati);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadCambioMedico {\n");
    
    sb.append("    bozza: ").append(toIndentedString(bozza)).append("\n");
    sb.append("    rinnovoAssistenza: ").append(toIndentedString(rinnovoAssistenza)).append("\n");
    sb.append("    controlloCombinazione: ").append(toIndentedString(controlloCombinazione)).append("\n");
    sb.append("    cittadinanza: ").append(toIndentedString(cittadinanza)).append("\n");
    sb.append("    domicilio: ").append(toIndentedString(domicilio)).append("\n");
    sb.append("    residenza: ").append(toIndentedString(residenza)).append("\n");
    sb.append("    recapiti: ").append(toIndentedString(recapiti)).append("\n");
    sb.append("    medicoAltraRegione: ").append(toIndentedString(medicoAltraRegione)).append("\n");
    sb.append("    datiAggiuntivi: ").append(toIndentedString(datiAggiuntivi)).append("\n");
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

