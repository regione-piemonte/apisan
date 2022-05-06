/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelDocumento;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelDocumentoAreaRossa;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelRispostaTuttiDocs   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private List<ModelDocumento> documenti = new ArrayList<ModelDocumento>();
  private Integer numeroDocumenti = null;
  private List<ModelDocumentoAreaRossa> documentoAreaRossa = new ArrayList<ModelDocumentoAreaRossa>();

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("documenti") 
 
  public List<ModelDocumento> getDocumenti() {
    return documenti;
  }
  public void setDocumenti(List<ModelDocumento> documenti) {
    this.documenti = documenti;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("numero_documenti") 
 
  public Integer getNumeroDocumenti() {
    return numeroDocumenti;
  }
  public void setNumeroDocumenti(Integer numeroDocumenti) {
    this.numeroDocumenti = numeroDocumenti;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("documento_area_rossa") 
 
  public List<ModelDocumentoAreaRossa> getDocumentoAreaRossa() {
    return documentoAreaRossa;
  }
  public void setDocumentoAreaRossa(List<ModelDocumentoAreaRossa> documentoAreaRossa) {
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
    ModelRispostaTuttiDocs modelRispostaTuttiDocs = (ModelRispostaTuttiDocs) o;
    return Objects.equals(documenti, modelRispostaTuttiDocs.documenti) &&
        Objects.equals(numeroDocumenti, modelRispostaTuttiDocs.numeroDocumenti) &&
        Objects.equals(documentoAreaRossa, modelRispostaTuttiDocs.documentoAreaRossa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documenti, numeroDocumenti, documentoAreaRossa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelRispostaTuttiDocs {\n");
    
    sb.append("    documenti: ").append(toIndentedString(documenti)).append("\n");
    sb.append("    numeroDocumenti: ").append(toIndentedString(numeroDocumenti)).append("\n");
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

