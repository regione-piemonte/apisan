/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.dto.apisantacc;

import java.util.Objects;
import java.util.ArrayList;
import java.math.BigDecimal;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class CittadinicitIdrilevazioniLista   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private BigDecimal valoreNumerico = null;
  private String valoreTestuale = null;
  private String gruppoId = null;
  private String descrittoreId = null;
  private String modalitaId = null;

  /**
   * Il valore della numerazione
   **/
  
  @ApiModelProperty(value = "Il valore della numerazione")
  @JsonProperty("valore_numerico") 
 
  public BigDecimal getValoreNumerico() {
    return valoreNumerico;
  }
  public void setValoreNumerico(BigDecimal valoreNumerico) {
    this.valoreNumerico = valoreNumerico;
  }

  /**
   * Il valore in caso di valori non numerici
   **/
  
  @ApiModelProperty(value = "Il valore in caso di valori non numerici")
  @JsonProperty("valore_testuale") 
 
  public String getValoreTestuale() {
    return valoreTestuale;
  }
  public void setValoreTestuale(String valoreTestuale) {
    this.valoreTestuale = valoreTestuale;
  }

  /**
   * Identificativo del gruppo di appartenenza
   **/
  
  @ApiModelProperty(value = "Identificativo del gruppo di appartenenza")
  @JsonProperty("gruppo_id") 
 
  public String getGruppoId() {
    return gruppoId;
  }
  public void setGruppoId(String gruppoId) {
    this.gruppoId = gruppoId;
  }

  /**
   * Identificativo del descrittore di appartenenza
   **/
  
  @ApiModelProperty(value = "Identificativo del descrittore di appartenenza")
  @JsonProperty("descrittore_id") 
 
  public String getDescrittoreId() {
    return descrittoreId;
  }
  public void setDescrittoreId(String descrittoreId) {
    this.descrittoreId = descrittoreId;
  }

  /**
   * Identificativo della modalità di rilevazione
   **/
  
  @ApiModelProperty(value = "Identificativo della modalità di rilevazione")
  @JsonProperty("modalita_id") 
 
  public String getModalitaId() {
    return modalitaId;
  }
  public void setModalitaId(String modalitaId) {
    this.modalitaId = modalitaId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CittadinicitIdrilevazioniLista cittadinicitIdrilevazioniLista = (CittadinicitIdrilevazioniLista) o;
    return Objects.equals(valoreNumerico, cittadinicitIdrilevazioniLista.valoreNumerico) &&
        Objects.equals(valoreTestuale, cittadinicitIdrilevazioniLista.valoreTestuale) &&
        Objects.equals(gruppoId, cittadinicitIdrilevazioniLista.gruppoId) &&
        Objects.equals(descrittoreId, cittadinicitIdrilevazioniLista.descrittoreId) &&
        Objects.equals(modalitaId, cittadinicitIdrilevazioniLista.modalitaId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valoreNumerico, valoreTestuale, gruppoId, descrittoreId, modalitaId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CittadinicitIdrilevazioniLista {\n");
    
    sb.append("    valoreNumerico: ").append(toIndentedString(valoreNumerico)).append("\n");
    sb.append("    valoreTestuale: ").append(toIndentedString(valoreTestuale)).append("\n");
    sb.append("    gruppoId: ").append(toIndentedString(gruppoId)).append("\n");
    sb.append("    descrittoreId: ").append(toIndentedString(descrittoreId)).append("\n");
    sb.append("    modalitaId: ").append(toIndentedString(modalitaId)).append("\n");
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

