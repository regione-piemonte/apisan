/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanffe.dto.apisanffe;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.math.BigDecimal;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;

public class ModelTicketPagatoRimborsoUtilizzato   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String id = null;
  private BigDecimal importo = null;
  private String numeroPraticaRimborsata = null;

  /**
   * Id univoco
   **/
  

  @JsonProperty("id") 
 
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * L&#39;importo del rimborso utilizzato
   **/
  

  @JsonProperty("importo") 
 
  public BigDecimal getImporto() {
    return importo;
  }
  public void setImporto(BigDecimal importo) {
    this.importo = importo;
  }

  /**
   * numero della pratica rimborsata
   **/
  

  @JsonProperty("numero_pratica_rimborsata") 
 
  public String getNumeroPraticaRimborsata() {
    return numeroPraticaRimborsata;
  }
  public void setNumeroPraticaRimborsata(String numeroPraticaRimborsata) {
    this.numeroPraticaRimborsata = numeroPraticaRimborsata;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelTicketPagatoRimborsoUtilizzato modelTicketPagatoRimborsoUtilizzato = (ModelTicketPagatoRimborsoUtilizzato) o;
    return Objects.equals(id, modelTicketPagatoRimborsoUtilizzato.id) &&
        Objects.equals(importo, modelTicketPagatoRimborsoUtilizzato.importo) &&
        Objects.equals(numeroPraticaRimborsata, modelTicketPagatoRimborsoUtilizzato.numeroPraticaRimborsata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, importo, numeroPraticaRimborsata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelTicketPagatoRimborsoUtilizzato {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    importo: ").append(toIndentedString(importo)).append("\n");
    sb.append("    numeroPraticaRimborsata: ").append(toIndentedString(numeroPraticaRimborsata)).append("\n");
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

