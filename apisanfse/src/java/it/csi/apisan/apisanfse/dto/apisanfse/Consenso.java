/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;

import org.codehaus.jackson.annotate.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class Consenso   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private Boolean alimentazioneDati = null;
  private Boolean consultazioneSanitaria = null;
  private Boolean consultazioneAmministrativa = null;

  /**
   * Acconsento ad alimentare il fascicolo con i miei dati clinici
   **/
  
  @ApiModelProperty(value = "Acconsento ad alimentare il fascicolo con i miei dati clinici")
  @JsonProperty("alimentazione_dati") 
 
  public Boolean isAlimentazioneDati() {
    return alimentazioneDati;
  }
  public void setAlimentazioneDati(Boolean alimentazioneDati) {
    this.alimentazioneDati = alimentazioneDati;
  }

  /**
   * Acconsento alla consultazione del fascicolo da parte degli operatori sanitari e socio-sanitari 
   **/
  
  @ApiModelProperty(value = "Acconsento alla consultazione del fascicolo da parte degli operatori sanitari e socio-sanitari ")
  @JsonProperty("consultazione_sanitaria") 
 
  public Boolean isConsultazioneSanitaria() {
    return consultazioneSanitaria;
  }
  public void setConsultazioneSanitaria(Boolean consultazioneSanitaria) {
    this.consultazioneSanitaria = consultazioneSanitaria;
  }

  /**
   * Acconsento alla consultazione del fascicolo da parte degli operatori amministrativi      
   **/
  
  @ApiModelProperty(value = "Acconsento alla consultazione del fascicolo da parte degli operatori amministrativi      ")
  @JsonProperty("consultazione_amministrativa") 
 
  public Boolean isConsultazioneAmministrativa() {
    return consultazioneAmministrativa;
  }
  public void setConsultazioneAmministrativa(Boolean consultazioneAmministrativa) {
    this.consultazioneAmministrativa = consultazioneAmministrativa;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Consenso consenso = (Consenso) o;
    return Objects.equals(alimentazioneDati, consenso.alimentazioneDati) &&
        Objects.equals(consultazioneSanitaria, consenso.consultazioneSanitaria) &&
        Objects.equals(consultazioneAmministrativa, consenso.consultazioneAmministrativa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alimentazioneDati, consultazioneSanitaria, consultazioneAmministrativa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Consenso {\n");
    
    sb.append("    alimentazioneDati: ").append(toIndentedString(alimentazioneDati)).append("\n");
    sb.append("    consultazioneSanitaria: ").append(toIndentedString(consultazioneSanitaria)).append("\n");
    sb.append("    consultazioneAmministrativa: ").append(toIndentedString(consultazioneAmministrativa)).append("\n");
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

