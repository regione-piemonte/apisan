/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfarm.dto.apisanfarm;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;

public class PayloadFarmaciaOccasionaleAutorizzazione   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String uuid = null;

  /**
   * Id univoco che rappresenta il device. In formato UUID v4 
   **/
  

  @JsonProperty("uuid") 
 
  @NotNull
  public String getUuid() {
    return uuid;
  }
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayloadFarmaciaOccasionaleAutorizzazione payloadFarmaciaOccasionaleAutorizzazione = (PayloadFarmaciaOccasionaleAutorizzazione) o;
    return Objects.equals(uuid, payloadFarmaciaOccasionaleAutorizzazione.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadFarmaciaOccasionaleAutorizzazione {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

