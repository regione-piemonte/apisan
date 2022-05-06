/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.dto.apisanscerev;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelCambioMedicoMedicoAltraRegione;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelCambioMedicoRichiestaDatiAggiuntivi;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelCittadinanza;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelCittadinoDomicilio;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelCittadinoRecapiti;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelCittadinoResidenza;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelGeneralitaAssistito;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class PayloadDelegante   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String codiceFiscaleMedico = null;
  private ModelCittadinanza cittadinanza = null;
  private ModelCittadinoDomicilio domicilio = null;
  private ModelCittadinoResidenza residenza = null;
  private ModelCittadinoRecapiti recapiti = null;
  private ModelCambioMedicoMedicoAltraRegione medicoAltraRegione = null;
  private ModelCambioMedicoRichiestaDatiAggiuntivi datiAggiuntivi = null;
  private ModelGeneralitaAssistito generalitaAssistito = null;

  /**
   * codice fiscale del medico
   **/
  
  @ApiModelProperty(value = "codice fiscale del medico")
  @JsonProperty("codice_fiscale_medico") 
 
  public String getCodiceFiscaleMedico() {
    return codiceFiscaleMedico;
  }
  public void setCodiceFiscaleMedico(String codiceFiscaleMedico) {
    this.codiceFiscaleMedico = codiceFiscaleMedico;
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("medico_altra_regione") 
 
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
  @JsonProperty("generalita_assistito") 
 
  public ModelGeneralitaAssistito getGeneralitaAssistito() {
    return generalitaAssistito;
  }
  public void setGeneralitaAssistito(ModelGeneralitaAssistito generalitaAssistito) {
    this.generalitaAssistito = generalitaAssistito;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayloadDelegante payloadDelegante = (PayloadDelegante) o;
    return Objects.equals(codiceFiscaleMedico, payloadDelegante.codiceFiscaleMedico) &&
        Objects.equals(cittadinanza, payloadDelegante.cittadinanza) &&
        Objects.equals(domicilio, payloadDelegante.domicilio) &&
        Objects.equals(residenza, payloadDelegante.residenza) &&
        Objects.equals(recapiti, payloadDelegante.recapiti) &&
        Objects.equals(medicoAltraRegione, payloadDelegante.medicoAltraRegione) &&
        Objects.equals(datiAggiuntivi, payloadDelegante.datiAggiuntivi) &&
        Objects.equals(generalitaAssistito, payloadDelegante.generalitaAssistito);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codiceFiscaleMedico, cittadinanza, domicilio, residenza, recapiti, medicoAltraRegione, datiAggiuntivi, generalitaAssistito);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadDelegante {\n");
    
    sb.append("    codiceFiscaleMedico: ").append(toIndentedString(codiceFiscaleMedico)).append("\n");
    sb.append("    cittadinanza: ").append(toIndentedString(cittadinanza)).append("\n");
    sb.append("    domicilio: ").append(toIndentedString(domicilio)).append("\n");
    sb.append("    residenza: ").append(toIndentedString(residenza)).append("\n");
    sb.append("    recapiti: ").append(toIndentedString(recapiti)).append("\n");
    sb.append("    medicoAltraRegione: ").append(toIndentedString(medicoAltraRegione)).append("\n");
    sb.append("    datiAggiuntivi: ").append(toIndentedString(datiAggiuntivi)).append("\n");
    sb.append("    generalitaAssistito: ").append(toIndentedString(generalitaAssistito)).append("\n");
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

