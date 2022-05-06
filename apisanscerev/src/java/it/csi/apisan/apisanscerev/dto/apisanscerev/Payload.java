/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.dto.apisanscerev;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelCittadinanza;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelCittadinoDomicilio;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelCittadinoResidenza;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class Payload   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String codiceFiscaleMedico = null;
  private Boolean medicoAltraRegione = null;
  private Boolean rinnovoAssistenza = null;
  private ModelCittadinanza cittadinanza = null;
  private ModelCittadinoDomicilio domicilio = null;
  private ModelCittadinoResidenza residenza = null;

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
   * true se il cittadino ha un medico in altra regione, false altrimenti
   **/
  
  @ApiModelProperty(example = "true", required = true, value = "true se il cittadino ha un medico in altra regione, false altrimenti")
  @JsonProperty("medico_altra_regione") 
 
  @NotNull
  public Boolean isMedicoAltraRegione() {
    return medicoAltraRegione;
  }
  public void setMedicoAltraRegione(Boolean medicoAltraRegione) {
    this.medicoAltraRegione = medicoAltraRegione;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Payload payload = (Payload) o;
    return Objects.equals(codiceFiscaleMedico, payload.codiceFiscaleMedico) &&
        Objects.equals(medicoAltraRegione, payload.medicoAltraRegione) &&
        Objects.equals(rinnovoAssistenza, payload.rinnovoAssistenza) &&
        Objects.equals(cittadinanza, payload.cittadinanza) &&
        Objects.equals(domicilio, payload.domicilio) &&
        Objects.equals(residenza, payload.residenza);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codiceFiscaleMedico, medicoAltraRegione, rinnovoAssistenza, cittadinanza, domicilio, residenza);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payload {\n");
    
    sb.append("    codiceFiscaleMedico: ").append(toIndentedString(codiceFiscaleMedico)).append("\n");
    sb.append("    medicoAltraRegione: ").append(toIndentedString(medicoAltraRegione)).append("\n");
    sb.append("    rinnovoAssistenza: ").append(toIndentedString(rinnovoAssistenza)).append("\n");
    sb.append("    cittadinanza: ").append(toIndentedString(cittadinanza)).append("\n");
    sb.append("    domicilio: ").append(toIndentedString(domicilio)).append("\n");
    sb.append("    residenza: ").append(toIndentedString(residenza)).append("\n");
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

