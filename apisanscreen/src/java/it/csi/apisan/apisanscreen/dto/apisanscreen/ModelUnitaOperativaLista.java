/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.dto.apisanscreen;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanscreen.dto.apisanscreen.ModelIndirizzoGeo;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelUnitaOperativaLista   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String codice = null;
  private String descrizione = null;
  private String indirizzo = null;
  private String aslCodice = null;
  private String comuneIstat = null;
  private String comuneDescrizione = null;
  private String provinciaCodice = null;
  private ModelIndirizzoGeo indirizzoGeo = null;

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
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("indirizzo_geo") 
 
  public ModelIndirizzoGeo getIndirizzoGeo() {
    return indirizzoGeo;
  }
  public void setIndirizzoGeo(ModelIndirizzoGeo indirizzoGeo) {
    this.indirizzoGeo = indirizzoGeo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelUnitaOperativaLista modelUnitaOperativaLista = (ModelUnitaOperativaLista) o;
    return Objects.equals(codice, modelUnitaOperativaLista.codice) &&
        Objects.equals(descrizione, modelUnitaOperativaLista.descrizione) &&
        Objects.equals(indirizzo, modelUnitaOperativaLista.indirizzo) &&
        Objects.equals(aslCodice, modelUnitaOperativaLista.aslCodice) &&
        Objects.equals(comuneIstat, modelUnitaOperativaLista.comuneIstat) &&
        Objects.equals(comuneDescrizione, modelUnitaOperativaLista.comuneDescrizione) &&
        Objects.equals(provinciaCodice, modelUnitaOperativaLista.provinciaCodice) &&
        Objects.equals(indirizzoGeo, modelUnitaOperativaLista.indirizzoGeo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codice, descrizione, indirizzo, aslCodice, comuneIstat, comuneDescrizione, provinciaCodice, indirizzoGeo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelUnitaOperativaLista {\n");
    
    sb.append("    codice: ").append(toIndentedString(codice)).append("\n");
    sb.append("    descrizione: ").append(toIndentedString(descrizione)).append("\n");
    sb.append("    indirizzo: ").append(toIndentedString(indirizzo)).append("\n");
    sb.append("    aslCodice: ").append(toIndentedString(aslCodice)).append("\n");
    sb.append("    comuneIstat: ").append(toIndentedString(comuneIstat)).append("\n");
    sb.append("    comuneDescrizione: ").append(toIndentedString(comuneDescrizione)).append("\n");
    sb.append("    provinciaCodice: ").append(toIndentedString(provinciaCodice)).append("\n");
    sb.append("    indirizzoGeo: ").append(toIndentedString(indirizzoGeo)).append("\n");
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

