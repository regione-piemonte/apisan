/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.dto.ptw;

import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;



public class Body1   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [implicit-snake-case] 
  
  private String numeroRicevuta = null;

  /**
   * numero della ricevuta emessa dal circuito di pagamento
   **/
  
  @ApiModelProperty(value = "numero della ricevuta emessa dal circuito di pagamento")

  // nome originario nello yaml: numero_ricevuta 
  public String getNumeroRicevuta() {
    return numeroRicevuta;
  }
  public void setNumeroRicevuta(String numeroRicevuta) {
    this.numeroRicevuta = numeroRicevuta;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body1 body1 = (Body1) o;
    return Objects.equals(numeroRicevuta, body1.numeroRicevuta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numeroRicevuta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body1 {\n");
    
    sb.append("    numeroRicevuta: ").append(toIndentedString(numeroRicevuta)).append("\n");
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

