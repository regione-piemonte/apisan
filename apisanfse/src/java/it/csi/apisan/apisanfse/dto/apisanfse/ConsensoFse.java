/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ConsensoFse   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String identificativoInformativa = null;
  private Boolean consensoAlimentazione = null;
  private Boolean consensoConsultazione = null;
  private Boolean consensoPregresso = null;
  private String codiceTesseraTeam = null;

  /**
   * id dell&#39;informativa corrente
   **/
  
  @ApiModelProperty(value = "id dell'informativa corrente")
  @JsonProperty("identificativo_informativa") 
 
  public String getIdentificativoInformativa() {
    return identificativoInformativa;
  }
  public void setIdentificativoInformativa(String identificativoInformativa) {
    this.identificativoInformativa = identificativoInformativa;
  }

  /**
   * Acconsento ad alimentare il fascicolo con i miei dati clinici
   **/
  
  @ApiModelProperty(value = "Acconsento ad alimentare il fascicolo con i miei dati clinici")
  @JsonProperty("consenso_alimentazione") 
 
  public Boolean isConsensoAlimentazione() {
    return consensoAlimentazione;
  }
  public void setConsensoAlimentazione(Boolean consensoAlimentazione) {
    this.consensoAlimentazione = consensoAlimentazione;
  }

  /**
   * Acconsento alla consultazione del fascicolo da parte degli operatori sanitari e socio-sanitari 
   **/
  
  @ApiModelProperty(value = "Acconsento alla consultazione del fascicolo da parte degli operatori sanitari e socio-sanitari ")
  @JsonProperty("consenso_consultazione") 
 
  public Boolean isConsensoConsultazione() {
    return consensoConsultazione;
  }
  public void setConsensoConsultazione(Boolean consensoConsultazione) {
    this.consensoConsultazione = consensoConsultazione;
  }

  /**
   * Acconsento alla consultazione del pregresso
   **/
  
  @ApiModelProperty(value = "Acconsento alla consultazione del pregresso")
  @JsonProperty("consenso_pregresso") 
 
  public Boolean isConsensoPregresso() {
    return consensoPregresso;
  }
  public void setConsensoPregresso(Boolean consensoPregresso) {
    this.consensoPregresso = consensoPregresso;
  }

  /**
   * numero della tessera team
   **/
  
  @ApiModelProperty(value = "numero della tessera team")
  @JsonProperty("codice_tessera_team") 
 
  public String getCodiceTesseraTeam() {
    return codiceTesseraTeam;
  }
  public void setCodiceTesseraTeam(String codiceTesseraTeam) {
    this.codiceTesseraTeam = codiceTesseraTeam;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsensoFse consensoFse = (ConsensoFse) o;
    return Objects.equals(identificativoInformativa, consensoFse.identificativoInformativa) &&
        Objects.equals(consensoAlimentazione, consensoFse.consensoAlimentazione) &&
        Objects.equals(consensoConsultazione, consensoFse.consensoConsultazione) &&
        Objects.equals(consensoPregresso, consensoFse.consensoPregresso) &&
        Objects.equals(codiceTesseraTeam, consensoFse.codiceTesseraTeam);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identificativoInformativa, consensoAlimentazione, consensoConsultazione, consensoPregresso, codiceTesseraTeam);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsensoFse {\n");
    
    sb.append("    identificativoInformativa: ").append(toIndentedString(identificativoInformativa)).append("\n");
    sb.append("    consensoAlimentazione: ").append(toIndentedString(consensoAlimentazione)).append("\n");
    sb.append("    consensoConsultazione: ").append(toIndentedString(consensoConsultazione)).append("\n");
    sb.append("    consensoPregresso: ").append(toIndentedString(consensoPregresso)).append("\n");
    sb.append("    codiceTesseraTeam: ").append(toIndentedString(codiceTesseraTeam)).append("\n");
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

