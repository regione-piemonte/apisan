/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanprof.dto.apisanprof;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanprof.dto.apisanprof.GiornoApertura;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class StudioMedico   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String denominazione = null;
  private String qualifica = null;
  private Integer tipo = null;
  private String indicatoreAmbCondiviso = null;
  private String indicatoreAmbPubblico = null;
  private String indirizzo = null;
  private String numCivico = null;
  private String comune = null;
  private String cap = null;
  private String codAsl = null;
  private String asl = null;
  private String email = null;
  private String telPrimario = null;
  private String telSecondario = null;
  private List<GiornoApertura> giorniApertura = new ArrayList<GiornoApertura>();

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("denominazione") 
 
  public String getDenominazione() {
    return denominazione;
  }
  public void setDenominazione(String denominazione) {
    this.denominazione = denominazione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("qualifica") 
 
  public String getQualifica() {
    return qualifica;
  }
  public void setQualifica(String qualifica) {
    this.qualifica = qualifica;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tipo") 
 
  public Integer getTipo() {
    return tipo;
  }
  public void setTipo(Integer tipo) {
    this.tipo = tipo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("indicatore_amb_condiviso") 
 
  public String getIndicatoreAmbCondiviso() {
    return indicatoreAmbCondiviso;
  }
  public void setIndicatoreAmbCondiviso(String indicatoreAmbCondiviso) {
    this.indicatoreAmbCondiviso = indicatoreAmbCondiviso;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("indicatore_amb_pubblico") 
 
  public String getIndicatoreAmbPubblico() {
    return indicatoreAmbPubblico;
  }
  public void setIndicatoreAmbPubblico(String indicatoreAmbPubblico) {
    this.indicatoreAmbPubblico = indicatoreAmbPubblico;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("indirizzo") 
 
  public String getIndirizzo() {
    return indirizzo;
  }
  public void setIndirizzo(String indirizzo) {
    this.indirizzo = indirizzo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("num_civico") 
 
  public String getNumCivico() {
    return numCivico;
  }
  public void setNumCivico(String numCivico) {
    this.numCivico = numCivico;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("comune") 
 
  public String getComune() {
    return comune;
  }
  public void setComune(String comune) {
    this.comune = comune;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cap") 
 
  public String getCap() {
    return cap;
  }
  public void setCap(String cap) {
    this.cap = cap;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cod_asl") 
 
  public String getCodAsl() {
    return codAsl;
  }
  public void setCodAsl(String codAsl) {
    this.codAsl = codAsl;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("asl") 
 
  public String getAsl() {
    return asl;
  }
  public void setAsl(String asl) {
    this.asl = asl;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("email") 
 
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tel_primario") 
 
  public String getTelPrimario() {
    return telPrimario;
  }
  public void setTelPrimario(String telPrimario) {
    this.telPrimario = telPrimario;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tel_secondario") 
 
  public String getTelSecondario() {
    return telSecondario;
  }
  public void setTelSecondario(String telSecondario) {
    this.telSecondario = telSecondario;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("giorni_apertura") 
 
  public List<GiornoApertura> getGiorniApertura() {
    return giorniApertura;
  }
  public void setGiorniApertura(List<GiornoApertura> giorniApertura) {
    this.giorniApertura = giorniApertura;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StudioMedico studioMedico = (StudioMedico) o;
    return Objects.equals(denominazione, studioMedico.denominazione) &&
        Objects.equals(qualifica, studioMedico.qualifica) &&
        Objects.equals(tipo, studioMedico.tipo) &&
        Objects.equals(indicatoreAmbCondiviso, studioMedico.indicatoreAmbCondiviso) &&
        Objects.equals(indicatoreAmbPubblico, studioMedico.indicatoreAmbPubblico) &&
        Objects.equals(indirizzo, studioMedico.indirizzo) &&
        Objects.equals(numCivico, studioMedico.numCivico) &&
        Objects.equals(comune, studioMedico.comune) &&
        Objects.equals(cap, studioMedico.cap) &&
        Objects.equals(codAsl, studioMedico.codAsl) &&
        Objects.equals(asl, studioMedico.asl) &&
        Objects.equals(email, studioMedico.email) &&
        Objects.equals(telPrimario, studioMedico.telPrimario) &&
        Objects.equals(telSecondario, studioMedico.telSecondario) &&
        Objects.equals(giorniApertura, studioMedico.giorniApertura);
  }

  @Override
  public int hashCode() {
    return Objects.hash(denominazione, qualifica, tipo, indicatoreAmbCondiviso, indicatoreAmbPubblico, indirizzo, numCivico, comune, cap, codAsl, asl, email, telPrimario, telSecondario, giorniApertura);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudioMedico {\n");
    
    sb.append("    denominazione: ").append(toIndentedString(denominazione)).append("\n");
    sb.append("    qualifica: ").append(toIndentedString(qualifica)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    indicatoreAmbCondiviso: ").append(toIndentedString(indicatoreAmbCondiviso)).append("\n");
    sb.append("    indicatoreAmbPubblico: ").append(toIndentedString(indicatoreAmbPubblico)).append("\n");
    sb.append("    indirizzo: ").append(toIndentedString(indirizzo)).append("\n");
    sb.append("    numCivico: ").append(toIndentedString(numCivico)).append("\n");
    sb.append("    comune: ").append(toIndentedString(comune)).append("\n");
    sb.append("    cap: ").append(toIndentedString(cap)).append("\n");
    sb.append("    codAsl: ").append(toIndentedString(codAsl)).append("\n");
    sb.append("    asl: ").append(toIndentedString(asl)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    telPrimario: ").append(toIndentedString(telPrimario)).append("\n");
    sb.append("    telSecondario: ").append(toIndentedString(telSecondario)).append("\n");
    sb.append("    giorniApertura: ").append(toIndentedString(giorniApertura)).append("\n");
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

