/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.dto.apisanscerev;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelDocumentoLettura;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelCambioMedicoRichiestaAllegati   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private ModelDocumentoLettura identitaFronte = null;
  private ModelDocumentoLettura identitaRetro = null;
  private ModelDocumentoLettura consensoMedico = null;
  private ModelDocumentoLettura certificatoMedico = null;
  private ModelDocumentoLettura soggiorno = null;
  private ModelDocumentoLettura delegante = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("identita_fronte") 
 
  public ModelDocumentoLettura getIdentitaFronte() {
    return identitaFronte;
  }
  public void setIdentitaFronte(ModelDocumentoLettura identitaFronte) {
    this.identitaFronte = identitaFronte;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("identita_retro") 
 
  public ModelDocumentoLettura getIdentitaRetro() {
    return identitaRetro;
  }
  public void setIdentitaRetro(ModelDocumentoLettura identitaRetro) {
    this.identitaRetro = identitaRetro;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("consenso_medico") 
 
  public ModelDocumentoLettura getConsensoMedico() {
    return consensoMedico;
  }
  public void setConsensoMedico(ModelDocumentoLettura consensoMedico) {
    this.consensoMedico = consensoMedico;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("certificato_medico") 
 
  public ModelDocumentoLettura getCertificatoMedico() {
    return certificatoMedico;
  }
  public void setCertificatoMedico(ModelDocumentoLettura certificatoMedico) {
    this.certificatoMedico = certificatoMedico;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("soggiorno") 
 
  public ModelDocumentoLettura getSoggiorno() {
    return soggiorno;
  }
  public void setSoggiorno(ModelDocumentoLettura soggiorno) {
    this.soggiorno = soggiorno;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("delegante") 
 
  public ModelDocumentoLettura getDelegante() {
    return delegante;
  }
  public void setDelegante(ModelDocumentoLettura delegante) {
    this.delegante = delegante;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelCambioMedicoRichiestaAllegati modelCambioMedicoRichiestaAllegati = (ModelCambioMedicoRichiestaAllegati) o;
    return Objects.equals(identitaFronte, modelCambioMedicoRichiestaAllegati.identitaFronte) &&
        Objects.equals(identitaRetro, modelCambioMedicoRichiestaAllegati.identitaRetro) &&
        Objects.equals(consensoMedico, modelCambioMedicoRichiestaAllegati.consensoMedico) &&
        Objects.equals(certificatoMedico, modelCambioMedicoRichiestaAllegati.certificatoMedico) &&
        Objects.equals(soggiorno, modelCambioMedicoRichiestaAllegati.soggiorno) &&
        Objects.equals(delegante, modelCambioMedicoRichiestaAllegati.delegante);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identitaFronte, identitaRetro, consensoMedico, certificatoMedico, soggiorno, delegante);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelCambioMedicoRichiestaAllegati {\n");
    
    sb.append("    identitaFronte: ").append(toIndentedString(identitaFronte)).append("\n");
    sb.append("    identitaRetro: ").append(toIndentedString(identitaRetro)).append("\n");
    sb.append("    consensoMedico: ").append(toIndentedString(consensoMedico)).append("\n");
    sb.append("    certificatoMedico: ").append(toIndentedString(certificatoMedico)).append("\n");
    sb.append("    soggiorno: ").append(toIndentedString(soggiorno)).append("\n");
    sb.append("    delegante: ").append(toIndentedString(delegante)).append("\n");
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

