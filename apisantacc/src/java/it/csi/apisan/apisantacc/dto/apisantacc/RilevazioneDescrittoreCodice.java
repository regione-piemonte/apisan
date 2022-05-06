/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.dto.apisantacc;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Codice univoco del gruppo del descrittore - \"PRES_DIA\" - \"PRES_SIST\" - \"FREQ_CARD\" - \"OSS\" - \"GLIC\" - \"INS\" - \"INS_FARM\" - \"TEMP\" - \"PESO\" - \"FREQ_RESP\" - \"CIRC_VITA\" - \"ALT\" - \"COL_HDL\" - \"COL_LDL\" - \"COL_TOT\" - \"TRIGL\" - \"EMO_GLIC\"")

public class RilevazioneDescrittoreCodice   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RilevazioneDescrittoreCodice rilevazioneDescrittoreCodice = (RilevazioneDescrittoreCodice) o;
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RilevazioneDescrittoreCodice {\n");
    
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

