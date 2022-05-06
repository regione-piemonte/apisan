/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantrovaun.dto.apisantrovaun;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisantrovaun.dto.apisantrovaun.GeoJsonPunto;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelStrutturaSanitaria   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String codice = null;
  private String descrizione = null;
  private String provincia = null;
  private String comune = null;
  private String cap = null;
  private String indirizzo = null;
  private String telefono = null;
  private String email = null;
  private String sitoWeb = null;
  private String tipoAssistenzaCodice = null;
  private String tipoAssistenzaDescrizione = null;
  private String tipoCodice = null;
  private String tipoDescrizione = null;
  private String aslCodice = null;
  private String aslDescription = null;

  /**
   * La natura della struttura
   */
  public enum NaturaEnum {
    PUBBLICO("Pubblico"),

        PRIVATO("Privato"),

        EQUIPARATO("Equiparato");
    private String value;

    NaturaEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private NaturaEnum natura = null;
  private GeoJsonPunto geo = null;

  /**
   * Un codice univoco
   **/
  
  @ApiModelProperty(value = "Un codice univoco")
  @JsonProperty("codice") 
 
  public String getCodice() {
    return codice;
  }
  public void setCodice(String codice) {
    this.codice = codice;
  }

  /**
   * Il nome della struttura
   **/
  
  @ApiModelProperty(value = "Il nome della struttura")
  @JsonProperty("descrizione") 
 
  public String getDescrizione() {
    return descrizione;
  }
  public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
  }

  /**
   * La provincia di appartenenza
   **/
  
  @ApiModelProperty(example = "Torino", value = "La provincia di appartenenza")
  @JsonProperty("provincia") 
 
  public String getProvincia() {
    return provincia;
  }
  public void setProvincia(String provincia) {
    this.provincia = provincia;
  }

  /**
   * Il comune di appartenenza
   **/
  
  @ApiModelProperty(value = "Il comune di appartenenza")
  @JsonProperty("comune") 
 
  public String getComune() {
    return comune;
  }
  public void setComune(String comune) {
    this.comune = comune;
  }

  /**
   * Il CAP di appartenenza
   **/
  
  @ApiModelProperty(value = "Il CAP di appartenenza")
  @JsonProperty("cap") 
 
  public String getCap() {
    return cap;
  }
  public void setCap(String cap) {
    this.cap = cap;
  }

  /**
   * L&#39;indirizzo della struttura
   **/
  
  @ApiModelProperty(value = "L'indirizzo della struttura")
  @JsonProperty("indirizzo") 
 
  public String getIndirizzo() {
    return indirizzo;
  }
  public void setIndirizzo(String indirizzo) {
    this.indirizzo = indirizzo;
  }

  /**
   * Il numero di telefono della struttura
   **/
  
  @ApiModelProperty(value = "Il numero di telefono della struttura")
  @JsonProperty("telefono") 
 
  public String getTelefono() {
    return telefono;
  }
  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  /**
   * L&#39;indirizzo email della struttura
   **/
  
  @ApiModelProperty(value = "L'indirizzo email della struttura")
  @JsonProperty("email") 
 
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * La URL del sito web della struttura
   **/
  
  @ApiModelProperty(value = "La URL del sito web della struttura")
  @JsonProperty("sito_web") 
 
  public String getSitoWeb() {
    return sitoWeb;
  }
  public void setSitoWeb(String sitoWeb) {
    this.sitoWeb = sitoWeb;
  }

  /**
   * Il codice della tipologia di assistenza
   **/
  
  @ApiModelProperty(value = "Il codice della tipologia di assistenza")
  @JsonProperty("tipo_assistenza_codice") 
 
  public String getTipoAssistenzaCodice() {
    return tipoAssistenzaCodice;
  }
  public void setTipoAssistenzaCodice(String tipoAssistenzaCodice) {
    this.tipoAssistenzaCodice = tipoAssistenzaCodice;
  }

  /**
   * La descrizione della tipologia di assistenza
   **/
  
  @ApiModelProperty(value = "La descrizione della tipologia di assistenza")
  @JsonProperty("tipo_assistenza_descrizione") 
 
  public String getTipoAssistenzaDescrizione() {
    return tipoAssistenzaDescrizione;
  }
  public void setTipoAssistenzaDescrizione(String tipoAssistenzaDescrizione) {
    this.tipoAssistenzaDescrizione = tipoAssistenzaDescrizione;
  }

  /**
   * Il codice della tipoliga di struttura
   **/
  
  @ApiModelProperty(value = "Il codice della tipoliga di struttura")
  @JsonProperty("tipo_codice") 
 
  public String getTipoCodice() {
    return tipoCodice;
  }
  public void setTipoCodice(String tipoCodice) {
    this.tipoCodice = tipoCodice;
  }

  /**
   * La descrizione del tipo di struttura
   **/
  
  @ApiModelProperty(value = "La descrizione del tipo di struttura")
  @JsonProperty("tipo_descrizione") 
 
  public String getTipoDescrizione() {
    return tipoDescrizione;
  }
  public void setTipoDescrizione(String tipoDescrizione) {
    this.tipoDescrizione = tipoDescrizione;
  }

  /**
   * Il codice dell&#39;ASL di appartenenza
   **/
  
  @ApiModelProperty(value = "Il codice dell'ASL di appartenenza")
  @JsonProperty("asl_codice") 
 
  public String getAslCodice() {
    return aslCodice;
  }
  public void setAslCodice(String aslCodice) {
    this.aslCodice = aslCodice;
  }

  /**
   * La descrizione dell&#39;ASL di appartenenza
   **/
  
  @ApiModelProperty(value = "La descrizione dell'ASL di appartenenza")
  @JsonProperty("asl_description") 
 
  public String getAslDescription() {
    return aslDescription;
  }
  public void setAslDescription(String aslDescription) {
    this.aslDescription = aslDescription;
  }

  /**
   * La natura della struttura
   **/
  
  @ApiModelProperty(value = "La natura della struttura")
  @JsonProperty("natura") 
 
  public NaturaEnum getNatura() {
    return natura;
  }
  public void setNatura(NaturaEnum natura) {
    this.natura = natura;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("geo") 
 
  public GeoJsonPunto getGeo() {
    return geo;
  }
  public void setGeo(GeoJsonPunto geo) {
    this.geo = geo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelStrutturaSanitaria modelStrutturaSanitaria = (ModelStrutturaSanitaria) o;
    return Objects.equals(codice, modelStrutturaSanitaria.codice) &&
        Objects.equals(descrizione, modelStrutturaSanitaria.descrizione) &&
        Objects.equals(provincia, modelStrutturaSanitaria.provincia) &&
        Objects.equals(comune, modelStrutturaSanitaria.comune) &&
        Objects.equals(cap, modelStrutturaSanitaria.cap) &&
        Objects.equals(indirizzo, modelStrutturaSanitaria.indirizzo) &&
        Objects.equals(telefono, modelStrutturaSanitaria.telefono) &&
        Objects.equals(email, modelStrutturaSanitaria.email) &&
        Objects.equals(sitoWeb, modelStrutturaSanitaria.sitoWeb) &&
        Objects.equals(tipoAssistenzaCodice, modelStrutturaSanitaria.tipoAssistenzaCodice) &&
        Objects.equals(tipoAssistenzaDescrizione, modelStrutturaSanitaria.tipoAssistenzaDescrizione) &&
        Objects.equals(tipoCodice, modelStrutturaSanitaria.tipoCodice) &&
        Objects.equals(tipoDescrizione, modelStrutturaSanitaria.tipoDescrizione) &&
        Objects.equals(aslCodice, modelStrutturaSanitaria.aslCodice) &&
        Objects.equals(aslDescription, modelStrutturaSanitaria.aslDescription) &&
        Objects.equals(natura, modelStrutturaSanitaria.natura) &&
        Objects.equals(geo, modelStrutturaSanitaria.geo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codice, descrizione, provincia, comune, cap, indirizzo, telefono, email, sitoWeb, tipoAssistenzaCodice, tipoAssistenzaDescrizione, tipoCodice, tipoDescrizione, aslCodice, aslDescription, natura, geo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelStrutturaSanitaria {\n");
    
    sb.append("    codice: ").append(toIndentedString(codice)).append("\n");
    sb.append("    descrizione: ").append(toIndentedString(descrizione)).append("\n");
    sb.append("    provincia: ").append(toIndentedString(provincia)).append("\n");
    sb.append("    comune: ").append(toIndentedString(comune)).append("\n");
    sb.append("    cap: ").append(toIndentedString(cap)).append("\n");
    sb.append("    indirizzo: ").append(toIndentedString(indirizzo)).append("\n");
    sb.append("    telefono: ").append(toIndentedString(telefono)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    sitoWeb: ").append(toIndentedString(sitoWeb)).append("\n");
    sb.append("    tipoAssistenzaCodice: ").append(toIndentedString(tipoAssistenzaCodice)).append("\n");
    sb.append("    tipoAssistenzaDescrizione: ").append(toIndentedString(tipoAssistenzaDescrizione)).append("\n");
    sb.append("    tipoCodice: ").append(toIndentedString(tipoCodice)).append("\n");
    sb.append("    tipoDescrizione: ").append(toIndentedString(tipoDescrizione)).append("\n");
    sb.append("    aslCodice: ").append(toIndentedString(aslCodice)).append("\n");
    sb.append("    aslDescription: ").append(toIndentedString(aslDescription)).append("\n");
    sb.append("    natura: ").append(toIndentedString(natura)).append("\n");
    sb.append("    geo: ").append(toIndentedString(geo)).append("\n");
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

