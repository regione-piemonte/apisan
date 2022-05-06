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



public class PayloadStampaAccessi   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String utente = null;
  private String data = null;
  private String descrizione = null;
  private String servizio = null;
  private String operazione = null;

  /**
   * Il nome e cognome dell&#39;utente che ha eseguito l&#39;accesso
   **/
  
  @ApiModelProperty(value = "Il nome e cognome dell'utente che ha eseguito l'accesso")
  @JsonProperty("utente") 
 
  public String getUtente() {
    return utente;
  }
  public void setUtente(String utente) {
    this.utente = utente;
  }

  /**
   * La data e l&#39;orario di accesso
   **/
  
  @ApiModelProperty(value = "La data e l'orario di accesso")
  @JsonProperty("data") 
 
  public String getData() {
    return data;
  }
  public void setData(String data) {
    this.data = data;
  }

  /**
   * La descrizione del tipo di accesso effettuato
   **/
  
  @ApiModelProperty(value = "La descrizione del tipo di accesso effettuato")
  @JsonProperty("descrizione") 
 
  public String getDescrizione() {
    return descrizione;
  }
  public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
  }

  /**
   * Il nome del servizio su cui l&#39;utente ha fatto accesso
   **/
  
  @ApiModelProperty(value = "Il nome del servizio su cui l'utente ha fatto accesso")
  @JsonProperty("servizio") 
 
  public String getServizio() {
    return servizio;
  }
  public void setServizio(String servizio) {
    this.servizio = servizio;
  }

  /**
   * Il nome dell&#39;operazione effettuata dall&#39;utente
   **/
  
  @ApiModelProperty(value = "Il nome dell'operazione effettuata dall'utente")
  @JsonProperty("operazione") 
 
  public String getOperazione() {
    return operazione;
  }
  public void setOperazione(String operazione) {
    this.operazione = operazione;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayloadStampaAccessi payloadStampaAccessi = (PayloadStampaAccessi) o;
    return Objects.equals(utente, payloadStampaAccessi.utente) &&
        Objects.equals(data, payloadStampaAccessi.data) &&
        Objects.equals(descrizione, payloadStampaAccessi.descrizione) &&
        Objects.equals(servizio, payloadStampaAccessi.servizio) &&
        Objects.equals(operazione, payloadStampaAccessi.operazione);
  }

  @Override
  public int hashCode() {
    return Objects.hash(utente, data, descrizione, servizio, operazione);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadStampaAccessi {\n");
    
    sb.append("    utente: ").append(toIndentedString(utente)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    descrizione: ").append(toIndentedString(descrizione)).append("\n");
    sb.append("    servizio: ").append(toIndentedString(servizio)).append("\n");
    sb.append("    operazione: ").append(toIndentedString(operazione)).append("\n");
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

