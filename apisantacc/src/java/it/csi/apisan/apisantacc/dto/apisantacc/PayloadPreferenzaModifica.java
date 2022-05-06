/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.dto.apisantacc;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisantacc.dto.apisantacc.EntitaCodice;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class PayloadPreferenzaModifica   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private Long id = null;
  private Boolean visibile = null;
  private EntitaCodice entitaCodice = null;
  private String gruppoCodice = null;

  /**
   * Id univoco
   **/
  
  @ApiModelProperty(value = "Id univoco")
  @JsonProperty("id") 
 
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Indica se l&#39;utente ha attivato o meno la preferenza
   **/
  
  @ApiModelProperty(value = "Indica se l'utente ha attivato o meno la preferenza")
  @JsonProperty("visibile") 
 
  public Boolean isVisibile() {
    return visibile;
  }
  public void setVisibile(Boolean visibile) {
    this.visibile = visibile;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("entita_codice") 
 
  public EntitaCodice getEntitaCodice() {
    return entitaCodice;
  }
  public void setEntitaCodice(EntitaCodice entitaCodice) {
    this.entitaCodice = entitaCodice;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("gruppo_codice") 
 
  public String getGruppoCodice() {
    return gruppoCodice;
  }
  public void setGruppoCodice(String gruppoCodice) {
    this.gruppoCodice = gruppoCodice;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayloadPreferenzaModifica payloadPreferenzaModifica = (PayloadPreferenzaModifica) o;
    return Objects.equals(id, payloadPreferenzaModifica.id) &&
        Objects.equals(visibile, payloadPreferenzaModifica.visibile) &&
        Objects.equals(entitaCodice, payloadPreferenzaModifica.entitaCodice) &&
        Objects.equals(gruppoCodice, payloadPreferenzaModifica.gruppoCodice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, visibile, entitaCodice, gruppoCodice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadPreferenzaModifica {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    visibile: ").append(toIndentedString(visibile)).append("\n");
    sb.append("    entitaCodice: ").append(toIndentedString(entitaCodice)).append("\n");
    sb.append("    gruppoCodice: ").append(toIndentedString(gruppoCodice)).append("\n");
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

