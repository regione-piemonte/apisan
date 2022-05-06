/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelDocumento;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelDocumentoAreaRossa;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelRispostaDettaglioDocumento   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private ModelDocumento documento = null;
  private ModelDocumentoAreaRossa documentoAreaRossa = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("documento") 
 
  public ModelDocumento getDocumento() {
    return documento;
  }
  public void setDocumento(ModelDocumento documento) {
    this.documento = documento;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("documento_area_rossa") 
 
  public ModelDocumentoAreaRossa getDocumentoAreaRossa() {
    return documentoAreaRossa;
  }
  public void setDocumentoAreaRossa(ModelDocumentoAreaRossa documentoAreaRossa) {
    this.documentoAreaRossa = documentoAreaRossa;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelRispostaDettaglioDocumento modelRispostaDettaglioDocumento = (ModelRispostaDettaglioDocumento) o;
    return Objects.equals(documento, modelRispostaDettaglioDocumento.documento) &&
        Objects.equals(documentoAreaRossa, modelRispostaDettaglioDocumento.documentoAreaRossa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documento, documentoAreaRossa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelRispostaDettaglioDocumento {\n");
    
    sb.append("    documento: ").append(toIndentedString(documento)).append("\n");
    sb.append("    documentoAreaRossa: ").append(toIndentedString(documentoAreaRossa)).append("\n");
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

