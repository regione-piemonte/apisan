/*******************************************************************************

* Copyright Regione Piemonte - 2023

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancod.dto.apisancod;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import io.swagger.annotations.ApiModel;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;
import javax.validation.constraints.*;

public class ModelAutore   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String codiceFiscale = null;

  /**
   * Indica il tipo di autore
   */
  public enum TipoEnum {
    ASSISTITO("assistito"),

        DELEGATO("delegato"),

        MEDICO("medico");
    private String value;

    TipoEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private TipoEnum tipo = null;

  /**
   * Il codice fiscale dell&#39;autore
   **/
  

  @JsonProperty("codice_fiscale") 
 
  public String getCodiceFiscale() {
    return codiceFiscale;
  }
  public void setCodiceFiscale(String codiceFiscale) {
    this.codiceFiscale = codiceFiscale;
  }

  /**
   * Indica il tipo di autore
   **/
  

  @JsonProperty("tipo") 
 
  public TipoEnum getTipo() {
    return tipo;
  }
  public void setTipo(TipoEnum tipo) {
    this.tipo = tipo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelAutore modelAutore = (ModelAutore) o;
    return Objects.equals(codiceFiscale, modelAutore.codiceFiscale) &&
        Objects.equals(tipo, modelAutore.tipo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codiceFiscale, tipo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelAutore {\n");
    
    sb.append("    codiceFiscale: ").append(toIndentedString(codiceFiscale)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
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

