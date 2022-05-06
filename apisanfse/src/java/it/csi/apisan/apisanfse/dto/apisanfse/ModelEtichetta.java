/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelEtichetta   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private Long id = null;
  private String testo = null;

  /**
   * Codice della tipologia di etichetta
   */
  public enum TipologiaEtichettaEnum {
    ANATOMICA("ANATOMICA"),

        PERSONALE("PERSONALE");
    private String value;

    TipologiaEtichettaEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private TipologiaEtichettaEnum tipologiaEtichetta = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id") 
 
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * descrizione da mostrare sulla UI
   **/
  
  @ApiModelProperty(example = "occhi", value = "descrizione da mostrare sulla UI")
  @JsonProperty("testo") 
 
  public String getTesto() {
    return testo;
  }
  public void setTesto(String testo) {
    this.testo = testo;
  }

  /**
   * Codice della tipologia di etichetta
   **/
  
  @ApiModelProperty(value = "Codice della tipologia di etichetta")
  @JsonProperty("tipologia_etichetta") 
 
  public TipologiaEtichettaEnum getTipologiaEtichetta() {
    return tipologiaEtichetta;
  }
  public void setTipologiaEtichetta(TipologiaEtichettaEnum tipologiaEtichetta) {
    this.tipologiaEtichetta = tipologiaEtichetta;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelEtichetta modelEtichetta = (ModelEtichetta) o;
    return Objects.equals(id, modelEtichetta.id) &&
        Objects.equals(testo, modelEtichetta.testo) &&
        Objects.equals(tipologiaEtichetta, modelEtichetta.tipologiaEtichetta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, testo, tipologiaEtichetta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelEtichetta {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    testo: ").append(toIndentedString(testo)).append("\n");
    sb.append("    tipologiaEtichetta: ").append(toIndentedString(tipologiaEtichetta)).append("\n");
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

