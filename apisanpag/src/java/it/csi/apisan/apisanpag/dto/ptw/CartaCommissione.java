/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.dto.ptw;

import java.util.Objects;

import org.codehaus.jackson.annotate.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class CartaCommissione   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private Integer id = null;
  private String descrizione = null;
  private String pathLogo = null;

  /**
   * di della carta
   **/
  
  @ApiModelProperty(example = "1", value = "di della carta")
  @JsonProperty("id") 
 
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * nome della carta di credito
   **/
  
  @ApiModelProperty(example = "VISA COMMISSIONE 1%", value = "nome della carta di credito")
  @JsonProperty("descrizione") 
 
  public String getDescrizione() {
    return descrizione;
  }
  public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
  }

  /**
   * url del logo della carta
   **/
  
  @ApiModelProperty(example = "http://www.sistemapiemonte.it/ris/css/pagamentoTicket/im/visa.jpg", value = "url del logo della carta")
  @JsonProperty("path_logo") 
 
  public String getPathLogo() {
    return pathLogo;
  }
  public void setPathLogo(String pathLogo) {
    this.pathLogo = pathLogo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartaCommissione cartaCommissione = (CartaCommissione) o;
    return Objects.equals(id, cartaCommissione.id) &&
        Objects.equals(descrizione, cartaCommissione.descrizione) &&
        Objects.equals(pathLogo, cartaCommissione.pathLogo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, descrizione, pathLogo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartaCommissione {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    descrizione: ").append(toIndentedString(descrizione)).append("\n");
    sb.append("    pathLogo: ").append(toIndentedString(pathLogo)).append("\n");
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

