/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.dto.apisanscreen;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanscreen.dto.apisanscreen.GeoJsonPoint;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelUnitaOperativaLoccsi   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String codice = null;
  private String descrizione = null;
  private String indirizzo = null;
  private String civico = null;
  private String cap = null;
  private String aslCodice = null;
  private String aslDescrizione = null;
  private String comuneIstat = null;
  private String comuneDescrizione = null;
  private String provinciaCodice = null;
  private String dipartimentoCodice = null;
  private String agendaCodice = null;
  private GeoJsonPoint geo = null;

  /**
   * Il codice della UO
   **/
  
  @ApiModelProperty(value = "Il codice della UO")
  @JsonProperty("codice") 
 
  public String getCodice() {
    return codice;
  }
  public void setCodice(String codice) {
    this.codice = codice;
  }

  /**
   * La descrizione della UO
   **/
  
  @ApiModelProperty(value = "La descrizione della UO")
  @JsonProperty("descrizione") 
 
  public String getDescrizione() {
    return descrizione;
  }
  public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
  }

  /**
   * L&#39;indirizzo della UO
   **/
  
  @ApiModelProperty(value = "L'indirizzo della UO")
  @JsonProperty("indirizzo") 
 
  public String getIndirizzo() {
    return indirizzo;
  }
  public void setIndirizzo(String indirizzo) {
    this.indirizzo = indirizzo;
  }

  /**
   * Il civico della UO
   **/
  
  @ApiModelProperty(value = "Il civico della UO")
  @JsonProperty("civico") 
 
  public String getCivico() {
    return civico;
  }
  public void setCivico(String civico) {
    this.civico = civico;
  }

  /**
   * il CAP della UO
   **/
  
  @ApiModelProperty(value = "il CAP della UO")
  @JsonProperty("cap") 
 
  public String getCap() {
    return cap;
  }
  public void setCap(String cap) {
    this.cap = cap;
  }

  /**
   * Il codice dell&#39;ASL di riferimento della UO
   **/
  
  @ApiModelProperty(value = "Il codice dell'ASL di riferimento della UO")
  @JsonProperty("asl_codice") 
 
  public String getAslCodice() {
    return aslCodice;
  }
  public void setAslCodice(String aslCodice) {
    this.aslCodice = aslCodice;
  }

  /**
   * Il codice dell&#39;ASL di riferimento della UO
   **/
  
  @ApiModelProperty(value = "Il codice dell'ASL di riferimento della UO")
  @JsonProperty("asl_descrizione") 
 
  public String getAslDescrizione() {
    return aslDescrizione;
  }
  public void setAslDescrizione(String aslDescrizione) {
    this.aslDescrizione = aslDescrizione;
  }

  /**
   * Il codice istat del comune di riferimento della UO
   **/
  
  @ApiModelProperty(value = "Il codice istat del comune di riferimento della UO")
  @JsonProperty("comune_istat") 
 
  public String getComuneIstat() {
    return comuneIstat;
  }
  public void setComuneIstat(String comuneIstat) {
    this.comuneIstat = comuneIstat;
  }

  /**
   * La descrizione del comune di riferimento della UO
   **/
  
  @ApiModelProperty(value = "La descrizione del comune di riferimento della UO")
  @JsonProperty("comune_descrizione") 
 
  public String getComuneDescrizione() {
    return comuneDescrizione;
  }
  public void setComuneDescrizione(String comuneDescrizione) {
    this.comuneDescrizione = comuneDescrizione;
  }

  /**
   * Il codice della provincia di riferimento della UO
   **/
  
  @ApiModelProperty(value = "Il codice della provincia di riferimento della UO")
  @JsonProperty("provincia_codice") 
 
  public String getProvinciaCodice() {
    return provinciaCodice;
  }
  public void setProvinciaCodice(String provinciaCodice) {
    this.provinciaCodice = provinciaCodice;
  }

  /**
   * Il codice del dipartimento di riferimento della UO
   **/
  
  @ApiModelProperty(value = "Il codice del dipartimento di riferimento della UO")
  @JsonProperty("dipartimento_codice") 
 
  public String getDipartimentoCodice() {
    return dipartimentoCodice;
  }
  public void setDipartimentoCodice(String dipartimentoCodice) {
    this.dipartimentoCodice = dipartimentoCodice;
  }

  /**
   * Il codice dell&#39;agenda di riferimento della UO
   **/
  
  @ApiModelProperty(value = "Il codice dell'agenda di riferimento della UO")
  @JsonProperty("agenda_codice") 
 
  public String getAgendaCodice() {
    return agendaCodice;
  }
  public void setAgendaCodice(String agendaCodice) {
    this.agendaCodice = agendaCodice;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("geo") 
 
  public GeoJsonPoint getGeo() {
    return geo;
  }
  public void setGeo(GeoJsonPoint geo) {
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
    ModelUnitaOperativaLoccsi modelUnitaOperativaLoccsi = (ModelUnitaOperativaLoccsi) o;
    return Objects.equals(codice, modelUnitaOperativaLoccsi.codice) &&
        Objects.equals(descrizione, modelUnitaOperativaLoccsi.descrizione) &&
        Objects.equals(indirizzo, modelUnitaOperativaLoccsi.indirizzo) &&
        Objects.equals(civico, modelUnitaOperativaLoccsi.civico) &&
        Objects.equals(cap, modelUnitaOperativaLoccsi.cap) &&
        Objects.equals(aslCodice, modelUnitaOperativaLoccsi.aslCodice) &&
        Objects.equals(aslDescrizione, modelUnitaOperativaLoccsi.aslDescrizione) &&
        Objects.equals(comuneIstat, modelUnitaOperativaLoccsi.comuneIstat) &&
        Objects.equals(comuneDescrizione, modelUnitaOperativaLoccsi.comuneDescrizione) &&
        Objects.equals(provinciaCodice, modelUnitaOperativaLoccsi.provinciaCodice) &&
        Objects.equals(dipartimentoCodice, modelUnitaOperativaLoccsi.dipartimentoCodice) &&
        Objects.equals(agendaCodice, modelUnitaOperativaLoccsi.agendaCodice) &&
        Objects.equals(geo, modelUnitaOperativaLoccsi.geo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codice, descrizione, indirizzo, civico, cap, aslCodice, aslDescrizione, comuneIstat, comuneDescrizione, provinciaCodice, dipartimentoCodice, agendaCodice, geo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelUnitaOperativaLoccsi {\n");
    
    sb.append("    codice: ").append(toIndentedString(codice)).append("\n");
    sb.append("    descrizione: ").append(toIndentedString(descrizione)).append("\n");
    sb.append("    indirizzo: ").append(toIndentedString(indirizzo)).append("\n");
    sb.append("    civico: ").append(toIndentedString(civico)).append("\n");
    sb.append("    cap: ").append(toIndentedString(cap)).append("\n");
    sb.append("    aslCodice: ").append(toIndentedString(aslCodice)).append("\n");
    sb.append("    aslDescrizione: ").append(toIndentedString(aslDescrizione)).append("\n");
    sb.append("    comuneIstat: ").append(toIndentedString(comuneIstat)).append("\n");
    sb.append("    comuneDescrizione: ").append(toIndentedString(comuneDescrizione)).append("\n");
    sb.append("    provinciaCodice: ").append(toIndentedString(provinciaCodice)).append("\n");
    sb.append("    dipartimentoCodice: ").append(toIndentedString(dipartimentoCodice)).append("\n");
    sb.append("    agendaCodice: ").append(toIndentedString(agendaCodice)).append("\n");
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

