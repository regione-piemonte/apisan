/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanffe.dto.apisanffe;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import it.csi.apisan.apisanffe.dto.apisanffe.ModelListaTicketPaziente;
import it.csi.apisan.apisanffe.dto.apisanffe.ModelPratica;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;

public class ModelListaTicket   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private ModelListaTicketPaziente paziente = null;
  private List<ModelPratica> listaPrenotazione = new ArrayList<ModelPratica>();

  /**
   **/
  

  @JsonProperty("paziente") 
 
  public ModelListaTicketPaziente getPaziente() {
    return paziente;
  }
  public void setPaziente(ModelListaTicketPaziente paziente) {
    this.paziente = paziente;
  }

  /**
   **/
  

  @JsonProperty("lista_prenotazione") 
 
  public List<ModelPratica> getListaPrenotazione() {
    return listaPrenotazione;
  }
  public void setListaPrenotazione(List<ModelPratica> listaPrenotazione) {
    this.listaPrenotazione = listaPrenotazione;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelListaTicket modelListaTicket = (ModelListaTicket) o;
    return Objects.equals(paziente, modelListaTicket.paziente) &&
        Objects.equals(listaPrenotazione, modelListaTicket.listaPrenotazione);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paziente, listaPrenotazione);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelListaTicket {\n");
    
    sb.append("    paziente: ").append(toIndentedString(paziente)).append("\n");
    sb.append("    listaPrenotazione: ").append(toIndentedString(listaPrenotazione)).append("\n");
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

