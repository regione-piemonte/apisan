/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanfse.dto.apisanfse.TipoDocumento;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelCategoria   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String codice = null;
  private String descrizione = null;
  private List<TipoDocumento> tipiDocumento = new ArrayList<TipoDocumento>();

  /**
   * codice della categoria
   **/
  
  @ApiModelProperty(value = "codice della categoria")
  @JsonProperty("codice") 
 
  public String getCodice() {
    return codice;
  }
  public void setCodice(String codice) {
    this.codice = codice;
  }

  /**
   * descrizione della categoria
   **/
  
  @ApiModelProperty(value = "descrizione della categoria")
  @JsonProperty("descrizione") 
 
  public String getDescrizione() {
    return descrizione;
  }
  public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tipi_documento") 
 
  public List<TipoDocumento> getTipiDocumento() {
    return tipiDocumento;
  }
  public void setTipiDocumento(List<TipoDocumento> tipiDocumento) {
    this.tipiDocumento = tipiDocumento;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelCategoria modelCategoria = (ModelCategoria) o;
    return Objects.equals(codice, modelCategoria.codice) &&
        Objects.equals(descrizione, modelCategoria.descrizione) &&
        Objects.equals(tipiDocumento, modelCategoria.tipiDocumento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codice, descrizione, tipiDocumento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelCategoria {\n");
    
    sb.append("    codice: ").append(toIndentedString(codice)).append("\n");
    sb.append("    descrizione: ").append(toIndentedString(descrizione)).append("\n");
    sb.append("    tipiDocumento: ").append(toIndentedString(tipiDocumento)).append("\n");
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

