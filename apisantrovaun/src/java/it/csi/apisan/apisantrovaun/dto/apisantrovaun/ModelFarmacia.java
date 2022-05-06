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
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelFarmacia   {
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
  private String tipoCodice = null;
  private String disponibiliAlimentiCeliaci = null;
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
   * Il codice della tipologia
   **/
  
  @ApiModelProperty(value = "Il codice della tipologia")
  @JsonProperty("tipo_codice") 
 
  public String getTipoCodice() {
    return tipoCodice;
  }
  public void setTipoCodice(String tipoCodice) {
    this.tipoCodice = tipoCodice;
  }

  /**
   * indica se in tale farmacia sono disponibili o meno alimenti per celiaci possibili valori S (true), N (false), U (unknown).
   **/
  
  @ApiModelProperty(value = "indica se in tale farmacia sono disponibili o meno alimenti per celiaci possibili valori S (true), N (false), U (unknown).")
  @JsonProperty("disponibili_alimenti_celiaci") 
 
  public String getDisponibiliAlimentiCeliaci() {
    return disponibiliAlimentiCeliaci;
  }
  public void setDisponibiliAlimentiCeliaci(String disponibiliAlimentiCeliaci) {
    this.disponibiliAlimentiCeliaci = disponibiliAlimentiCeliaci;
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
    ModelFarmacia modelFarmacia = (ModelFarmacia) o;
    return Objects.equals(codice, modelFarmacia.codice) &&
        Objects.equals(descrizione, modelFarmacia.descrizione) &&
        Objects.equals(provincia, modelFarmacia.provincia) &&
        Objects.equals(comune, modelFarmacia.comune) &&
        Objects.equals(cap, modelFarmacia.cap) &&
        Objects.equals(indirizzo, modelFarmacia.indirizzo) &&
        Objects.equals(telefono, modelFarmacia.telefono) &&
        Objects.equals(email, modelFarmacia.email) &&
        Objects.equals(sitoWeb, modelFarmacia.sitoWeb) &&
        Objects.equals(tipoCodice, modelFarmacia.tipoCodice) &&
        Objects.equals(disponibiliAlimentiCeliaci, modelFarmacia.disponibiliAlimentiCeliaci) &&
        Objects.equals(geo, modelFarmacia.geo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codice, descrizione, provincia, comune, cap, indirizzo, telefono, email, sitoWeb, tipoCodice, disponibiliAlimentiCeliaci, geo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelFarmacia {\n");
    
    sb.append("    codice: ").append(toIndentedString(codice)).append("\n");
    sb.append("    descrizione: ").append(toIndentedString(descrizione)).append("\n");
    sb.append("    provincia: ").append(toIndentedString(provincia)).append("\n");
    sb.append("    comune: ").append(toIndentedString(comune)).append("\n");
    sb.append("    cap: ").append(toIndentedString(cap)).append("\n");
    sb.append("    indirizzo: ").append(toIndentedString(indirizzo)).append("\n");
    sb.append("    telefono: ").append(toIndentedString(telefono)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    sitoWeb: ").append(toIndentedString(sitoWeb)).append("\n");
    sb.append("    tipoCodice: ").append(toIndentedString(tipoCodice)).append("\n");
    sb.append("    disponibiliAlimentiCeliaci: ").append(toIndentedString(disponibiliAlimentiCeliaci)).append("\n");
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

