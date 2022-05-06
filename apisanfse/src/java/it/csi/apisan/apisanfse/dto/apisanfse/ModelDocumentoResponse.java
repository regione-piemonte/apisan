/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelComponenteLocale;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelDocumentoDma;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelDocumentoResponse   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private ModelDocumentoDma documento = null;
  private ModelComponenteLocale componenteLocaleRisposta = null;
  private String urlDocumentoDipartimentale = null;
  private String authDocumentoDipaertimentale = null;
  private String documentoSuDipartimentale = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("documento") 
 
  public ModelDocumentoDma getDocumento() {
    return documento;
  }
  public void setDocumento(ModelDocumentoDma documento) {
    this.documento = documento;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("componente_locale_risposta") 
 
  public ModelComponenteLocale getComponenteLocaleRisposta() {
    return componenteLocaleRisposta;
  }
  public void setComponenteLocaleRisposta(ModelComponenteLocale componenteLocaleRisposta) {
    this.componenteLocaleRisposta = componenteLocaleRisposta;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("url_documento_dipartimentale") 
 
  public String getUrlDocumentoDipartimentale() {
    return urlDocumentoDipartimentale;
  }
  public void setUrlDocumentoDipartimentale(String urlDocumentoDipartimentale) {
    this.urlDocumentoDipartimentale = urlDocumentoDipartimentale;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("auth_documento_dipaertimentale") 
 
  public String getAuthDocumentoDipaertimentale() {
    return authDocumentoDipaertimentale;
  }
  public void setAuthDocumentoDipaertimentale(String authDocumentoDipaertimentale) {
    this.authDocumentoDipaertimentale = authDocumentoDipaertimentale;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("documento_su_dipartimentale") 
 
  public String getDocumentoSuDipartimentale() {
    return documentoSuDipartimentale;
  }
  public void setDocumentoSuDipartimentale(String documentoSuDipartimentale) {
    this.documentoSuDipartimentale = documentoSuDipartimentale;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelDocumentoResponse modelDocumentoResponse = (ModelDocumentoResponse) o;
    return Objects.equals(documento, modelDocumentoResponse.documento) &&
        Objects.equals(componenteLocaleRisposta, modelDocumentoResponse.componenteLocaleRisposta) &&
        Objects.equals(urlDocumentoDipartimentale, modelDocumentoResponse.urlDocumentoDipartimentale) &&
        Objects.equals(authDocumentoDipaertimentale, modelDocumentoResponse.authDocumentoDipaertimentale) &&
        Objects.equals(documentoSuDipartimentale, modelDocumentoResponse.documentoSuDipartimentale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documento, componenteLocaleRisposta, urlDocumentoDipartimentale, authDocumentoDipaertimentale, documentoSuDipartimentale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelDocumentoResponse {\n");
    
    sb.append("    documento: ").append(toIndentedString(documento)).append("\n");
    sb.append("    componenteLocaleRisposta: ").append(toIndentedString(componenteLocaleRisposta)).append("\n");
    sb.append("    urlDocumentoDipartimentale: ").append(toIndentedString(urlDocumentoDipartimentale)).append("\n");
    sb.append("    authDocumentoDipaertimentale: ").append(toIndentedString(authDocumentoDipaertimentale)).append("\n");
    sb.append("    documentoSuDipartimentale: ").append(toIndentedString(documentoSuDipartimentale)).append("\n");
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

