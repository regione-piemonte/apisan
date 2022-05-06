/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesen.dto.red;

import java.util.Objects;
import org.codehaus.jackson.annotate.JsonProperty;

public class Revoca   {
	  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
	  
	  private String motivazioneRevoca = null;

	  /**
	   * La motivazione delle revoca inserita probabilmente dal cittadino
	   **/
	  
	  
	  @JsonProperty("motivazione_revoca") 
	 
	  public String getMotivazioneRevoca() {
	    return motivazioneRevoca;
	  }
	  public void setMotivazioneRevoca(String motivazioneRevoca) {
	    this.motivazioneRevoca = motivazioneRevoca;
	  }


	  @Override
	  public boolean equals(Object o) {
	    if (this == o) {
	      return true;
	    }
	    if (o == null || getClass() != o.getClass()) {
	      return false;
	    }
	    Revoca revoca = (Revoca) o;
	    return Objects.equals(motivazioneRevoca, revoca.motivazioneRevoca);
	  }

	  @Override
	  public int hashCode() {
	    return Objects.hash(motivazioneRevoca);
	  }

	  @Override
	  public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("class Revoca {\n");
	    
	    sb.append("    motivazioneRevoca: ").append(toIndentedString(motivazioneRevoca)).append("\n");
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


