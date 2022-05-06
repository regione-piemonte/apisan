/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.dto.ptw;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.codehaus.jackson.annotate.JsonProperty;

import io.swagger.annotations.ApiModelProperty;




public class Ticket {
	
	  private Cittadino paziente = null;
	  private ListaPrenotazione listaPrenotazione;
	  private ErrorePrenotazione errore = null;
	  
	  
	  
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
	  @JsonProperty("lista_Prenotazione")
	  
	  public ListaPrenotazione getListaprenotazione() {
			return listaPrenotazione;
		}
		public void setListaprenotazione(ListaPrenotazione listaprenotazione) {
			this.listaPrenotazione = listaprenotazione;
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
