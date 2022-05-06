/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesenpat.model;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanesenpat.model.ModelTipologiaDocumento;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class Payload2   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String certificatoId = null;
  private String fileBase64 = null;
  private String dataRilascio = null;
  private String dataFineValidita = null;
  private String note = null;
  private ModelTipologiaDocumento tipologiaDocumento = null;

  /**
   * L&#39;id dell&#39;eventuale certificato usato per rinnovare l&#39;esenzione 
   **/
  
  @ApiModelProperty(value = "L'id dell'eventuale certificato usato per rinnovare l'esenzione ")
  @JsonProperty("certificato_id") 
 
  public String getCertificatoId() {
    return certificatoId;
  }
  public void setCertificatoId(String certificatoId) {
    this.certificatoId = certificatoId;
  }

  /**
   * Il base64 del certificato caricato dall&#39;utente 
   **/
  
  @ApiModelProperty(value = "Il base64 del certificato caricato dall'utente ")
  @JsonProperty("file_base64") 
 
  public String getFileBase64() {
    return fileBase64;
  }
  public void setFileBase64(String fileBase64) {
    this.fileBase64 = fileBase64;
  }

  /**
   * Quando è stato rilasciato il certificato 
   **/
  
  @ApiModelProperty(value = "Quando è stato rilasciato il certificato ")
  @JsonProperty("data_rilascio") 
 
  public String getDataRilascio() {
    return dataRilascio;
  }
  public void setDataRilascio(String dataRilascio) {
    this.dataRilascio = dataRilascio;
  }

  /**
   * Quando termina il certificato caricato 
   **/
  
  @ApiModelProperty(value = "Quando termina il certificato caricato ")
  @JsonProperty("data_fine_validita") 
 
  public String getDataFineValidita() {
    return dataFineValidita;
  }
  public void setDataFineValidita(String dataFineValidita) {
    this.dataFineValidita = dataFineValidita;
  }

  /**
   * Le note per l&#39;operatore dell&#39;ASL inserite dall&#39;utente 
   **/
  
  @ApiModelProperty(value = "Le note per l'operatore dell'ASL inserite dall'utente ")
  @JsonProperty("note") 
 
  public String getNote() {
    return note;
  }
  public void setNote(String note) {
    this.note = note;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tipologia_documento") 
 
  public ModelTipologiaDocumento getTipologiaDocumento() {
    return tipologiaDocumento;
  }
  public void setTipologiaDocumento(ModelTipologiaDocumento tipologiaDocumento) {
    this.tipologiaDocumento = tipologiaDocumento;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Payload2 payload2 = (Payload2) o;
    return Objects.equals(certificatoId, payload2.certificatoId) &&
        Objects.equals(fileBase64, payload2.fileBase64) &&
        Objects.equals(dataRilascio, payload2.dataRilascio) &&
        Objects.equals(dataFineValidita, payload2.dataFineValidita) &&
        Objects.equals(note, payload2.note) &&
        Objects.equals(tipologiaDocumento, payload2.tipologiaDocumento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificatoId, fileBase64, dataRilascio, dataFineValidita, note, tipologiaDocumento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payload2 {\n");
    
    sb.append("    certificatoId: ").append(toIndentedString(certificatoId)).append("\n");
    sb.append("    fileBase64: ").append(toIndentedString(fileBase64)).append("\n");
    sb.append("    dataRilascio: ").append(toIndentedString(dataRilascio)).append("\n");
    sb.append("    dataFineValidita: ").append(toIndentedString(dataFineValidita)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    tipologiaDocumento: ").append(toIndentedString(tipologiaDocumento)).append("\n");
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

