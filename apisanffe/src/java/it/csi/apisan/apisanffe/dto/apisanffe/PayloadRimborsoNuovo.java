/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanffe.dto.apisanffe;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;

public class PayloadRimborsoNuovo   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private Integer rimborsoModalitaCodice = null;
  private String iban = null;

  /**
   * Il codice della modalità di rimborso impostato/usato per questo pagamento. * 1 - Voucher * 2 - Bonifico * 3 - Borsellino 
   **/
  

  @JsonProperty("rimborso_modalita_codice") 
 
  @NotNull
  public Integer getRimborsoModalitaCodice() {
    return rimborsoModalitaCodice;
  }
  public void setRimborsoModalitaCodice(Integer rimborsoModalitaCodice) {
    this.rimborsoModalitaCodice = rimborsoModalitaCodice;
  }

  /**
   * L&#39;IBAN inserito dal cittadino.  Da valorizzare solo se &#x60;rimborso_modalita_codice&#x60; &#x3D;&#x3D;&#x3D; \&quot;2\&quot; (cioè Bonifico) 
   **/
  

  @JsonProperty("iban") 
 
  public String getIban() {
    return iban;
  }
  public void setIban(String iban) {
    this.iban = iban;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayloadRimborsoNuovo payloadRimborsoNuovo = (PayloadRimborsoNuovo) o;
    return Objects.equals(rimborsoModalitaCodice, payloadRimborsoNuovo.rimborsoModalitaCodice) &&
        Objects.equals(iban, payloadRimborsoNuovo.iban);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rimborsoModalitaCodice, iban);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadRimborsoNuovo {\n");
    
    sb.append("    rimborsoModalitaCodice: ").append(toIndentedString(rimborsoModalitaCodice)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
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

