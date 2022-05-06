/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.dto.apisanpag;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanpag.dto.apisanpag.Cittadino;
import it.csi.apisan.apisanpag.dto.apisanpag.ErrorePrenotazione;
import it.csi.apisan.apisanpag.dto.apisanpag.Pratica;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class Ticket   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private Cittadino paziente = null;
  private List<Pratica> listaPrenotazione = new ArrayList<Pratica>();
  private ErrorePrenotazione errore = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("paziente") 
 
  public Cittadino getPaziente() {
    return paziente;
  }
  public void setPaziente(Cittadino paziente) {
    this.paziente = paziente;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lista_prenotazione") 
 
  public List<Pratica> getListaPrenotazione() {
    return listaPrenotazione;
  }
  public void setListaPrenotazione(List<Pratica> listaPrenotazione) {
    this.listaPrenotazione = listaPrenotazione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("errore") 
 
  public ErrorePrenotazione getErrore() {
    return errore;
  }
  public void setErrore(ErrorePrenotazione errore) {
    this.errore = errore;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ticket ticket = (Ticket) o;
    return Objects.equals(paziente, ticket.paziente) &&
        Objects.equals(listaPrenotazione, ticket.listaPrenotazione) &&
        Objects.equals(errore, ticket.errore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paziente, listaPrenotazione, errore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ticket {\n");
    
    sb.append("    paziente: ").append(toIndentedString(paziente)).append("\n");
    sb.append("    listaPrenotazione: ").append(toIndentedString(listaPrenotazione)).append("\n");
    sb.append("    errore: ").append(toIndentedString(errore)).append("\n");
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

