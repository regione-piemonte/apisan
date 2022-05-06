/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelDocumentoPersonale;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelMetadatiDocumentoPersonale;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class PayloadDocumentoPersonale   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private ModelDocumentoPersonale documento = null;
  private ModelMetadatiDocumentoPersonale metadatiDocumento = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("documento") 
 
  public ModelDocumentoPersonale getDocumento() {
    return documento;
  }
  public void setDocumento(ModelDocumentoPersonale documento) {
    this.documento = documento;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("metadati_documento") 
 
  public ModelMetadatiDocumentoPersonale getMetadatiDocumento() {
    return metadatiDocumento;
  }
  public void setMetadatiDocumento(ModelMetadatiDocumentoPersonale metadatiDocumento) {
    this.metadatiDocumento = metadatiDocumento;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayloadDocumentoPersonale payloadDocumentoPersonale = (PayloadDocumentoPersonale) o;
    return Objects.equals(documento, payloadDocumentoPersonale.documento) &&
        Objects.equals(metadatiDocumento, payloadDocumentoPersonale.metadatiDocumento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documento, metadatiDocumento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadDocumentoPersonale {\n");
    
    sb.append("    documento: ").append(toIndentedString(documento)).append("\n");
    sb.append("    metadatiDocumento: ").append(toIndentedString(metadatiDocumento)).append("\n");
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

