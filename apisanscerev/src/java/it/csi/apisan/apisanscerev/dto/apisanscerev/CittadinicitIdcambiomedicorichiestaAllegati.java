/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.dto.apisanscerev;

import java.util.Objects;

import org.codehaus.jackson.annotate.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class CittadinicitIdcambiomedicorichiestaAllegati   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private ModelDocumento identitaFronte = null;
  private ModelDocumento identitaRetro = null;
  private ModelDocumento consensoMedico = null;
  private ModelDocumento certificatoMedico = null;
  private ModelDocumento soggiorno = null;
  private ModelDocumento delegante = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("identita_fronte") 
 
  public ModelDocumento getIdentitaFronte() {
    return identitaFronte;
  }
  public void setIdentitaFronte(ModelDocumento identitaFronte) {
    this.identitaFronte = identitaFronte;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("identita_retro") 
 
  public ModelDocumento getIdentitaRetro() {
    return identitaRetro;
  }
  public void setIdentitaRetro(ModelDocumento identitaRetro) {
    this.identitaRetro = identitaRetro;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("consenso_medico") 
 
  public ModelDocumento getConsensoMedico() {
    return consensoMedico;
  }
  public void setConsensoMedico(ModelDocumento consensoMedico) {
    this.consensoMedico = consensoMedico;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("certificato_medico") 
 
  public ModelDocumento getCertificatoMedico() {
    return certificatoMedico;
  }
  public void setCertificatoMedico(ModelDocumento certificatoMedico) {
    this.certificatoMedico = certificatoMedico;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("soggiorno") 
 
  public ModelDocumento getSoggiorno() {
    return soggiorno;
  }
  public void setSoggiorno(ModelDocumento soggiorno) {
    this.soggiorno = soggiorno;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("delegante") 
 
  public ModelDocumento getDelegante() {
    return delegante;
  }
  public void setDelegante(ModelDocumento delegante) {
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
    CittadinicitIdcambiomedicorichiestaAllegati cittadinicitIdcambiomedicorichiestaAllegati = (CittadinicitIdcambiomedicorichiestaAllegati) o;
    return Objects.equals(identitaFronte, cittadinicitIdcambiomedicorichiestaAllegati.identitaFronte) &&
        Objects.equals(identitaRetro, cittadinicitIdcambiomedicorichiestaAllegati.identitaRetro) &&
        Objects.equals(consensoMedico, cittadinicitIdcambiomedicorichiestaAllegati.consensoMedico) &&
        Objects.equals(certificatoMedico, cittadinicitIdcambiomedicorichiestaAllegati.certificatoMedico) &&
        Objects.equals(soggiorno, cittadinicitIdcambiomedicorichiestaAllegati.soggiorno) &&
        Objects.equals(delegante, cittadinicitIdcambiomedicorichiestaAllegati.delegante);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identitaFronte, identitaRetro, consensoMedico, certificatoMedico, soggiorno, delegante);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CittadinicitIdcambiomedicorichiestaAllegati {\n");
    
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

