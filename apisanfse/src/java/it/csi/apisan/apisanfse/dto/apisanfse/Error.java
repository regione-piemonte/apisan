/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;

import org.codehaus.jackson.annotate.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class Error   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String code = null;
  private String messaggioCittadino = null;
  private String errorMessage = null;
  private String fields = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("code") 
 
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("messaggioCittadino") 
 
  public String getMessaggioCittadino() {
    return messaggioCittadino;
  }
  public void setMessaggioCittadino(String messaggioCittadino) {
    this.messaggioCittadino = messaggioCittadino;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("errorMessage") 
 
  public String getErrorMessage() {
    return errorMessage;
  }
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("fields") 
 
  public String getFields() {
    return fields;
  }
  public void setFields(String fields) {
    this.fields = fields;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(code, error.code) &&
        Objects.equals(messaggioCittadino, error.messaggioCittadino) &&
        Objects.equals(errorMessage, error.errorMessage) &&
        Objects.equals(fields, error.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, messaggioCittadino, errorMessage, fields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    messaggioCittadino: ").append(toIndentedString(messaggioCittadino)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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

