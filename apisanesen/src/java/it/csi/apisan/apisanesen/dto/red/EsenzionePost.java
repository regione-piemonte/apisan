/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesen.dto.red;

import java.util.Objects;

import org.codehaus.jackson.annotate.JsonProperty;



public class EsenzionePost   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String codiceEsenzione = null;
  private String rapportoFamiliare = null;
  private Boolean disclaimer = null;
  private CittadinoPost creatoPer = null;
  private CittadinoPost titolare = null;

  /**
   * La proprietà &#x60;codice&#x60; del codice dell&#39;esenzione
   **/
  
  @JsonProperty("codice_esenzione") 
 

  public String getCodiceEsenzione() {
    return codiceEsenzione;
  }
  public void setCodiceEsenzione(String codiceEsenzione) {
    this.codiceEsenzione = codiceEsenzione;
  }  

  
  @JsonProperty("rapporto_familiare")
  
  public String getRapportoFamiliare() {
	  return rapportoFamiliare;
  }
  public void setRapportoFamiliare(String rapportoFamiliare) {
	  this.rapportoFamiliare = rapportoFamiliare;
  }
  
/**
   * Presa visione del disclaimer (eventualmente integer con versione?)
   **/
  
 
  @JsonProperty("disclaimer") 
 
  public Boolean isDisclaimer() {
    return disclaimer;
  }
  public void setDisclaimer(Boolean disclaimer) {
    this.disclaimer = disclaimer;
  }

  /**
   **/
  
  
  @JsonProperty("creato_per") 
 
  public CittadinoPost getCreatoPer() {
    return creatoPer;
  }
  public void setCreatoPer(CittadinoPost creatoPer) {
    this.creatoPer = creatoPer;
  }

  /**
   **/
  
  @JsonProperty("titolare") 
 
  public CittadinoPost getTitolare() {
    return titolare;
  }
  public void setTitolare(CittadinoPost titolare) {
    this.titolare = titolare;
  }


  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EsenzionePost esenzionePost = (EsenzionePost) o;
    return Objects.equals(codiceEsenzione, esenzionePost.codiceEsenzione) &&
        Objects.equals(disclaimer, esenzionePost.disclaimer) &&
        Objects.equals(creatoPer, esenzionePost.creatoPer) &&
        Objects.equals(titolare, esenzionePost.titolare);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codiceEsenzione, disclaimer, creatoPer, titolare);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EsenzionePost {\n");
    
    sb.append("    codiceEsenzione: ").append(toIndentedString(codiceEsenzione)).append("\n");
    sb.append("    disclaimer: ").append(toIndentedString(disclaimer)).append("\n");
    sb.append("    creatoPer: ").append(toIndentedString(creatoPer)).append("\n");
    sb.append("    titolare: ").append(toIndentedString(titolare)).append("\n");
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