/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesenpat.model;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanesenpat.model.ModelEsenzioneMalattia;
import it.csi.apisan.apisanesenpat.model.ModelEsenzioneTipologia;
import it.csi.apisan.apisanesenpat.model.ModelTipologiaDocumento;
import it.csi.apisan.apisanesenpat.model.ModelTipologiaInvaliditaV3;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class Payload1   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String fileBase64 = null;
  private String dataRilascio = null;
  private String dataFineValidita = null;
  private String note = null;
  private ModelEsenzioneTipologia tipologia = null;
  private ModelTipologiaInvaliditaV3 tipologiaInvalidita = null;
  private ModelEsenzioneMalattia malattia = null;
  private ModelTipologiaDocumento tipologiaDocumento = null;

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
  @JsonProperty("tipologia") 
 
  public ModelEsenzioneTipologia getTipologia() {
    return tipologia;
  }
  public void setTipologia(ModelEsenzioneTipologia tipologia) {
    this.tipologia = tipologia;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tipologia_invalidita") 
 
  public ModelTipologiaInvaliditaV3 getTipologiaInvalidita() {
    return tipologiaInvalidita;
  }
  public void setTipologiaInvalidita(ModelTipologiaInvaliditaV3 tipologiaInvalidita) {
    this.tipologiaInvalidita = tipologiaInvalidita;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("malattia") 
 
  public ModelEsenzioneMalattia getMalattia() {
    return malattia;
  }
  public void setMalattia(ModelEsenzioneMalattia malattia) {
    this.malattia = malattia;
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
    Payload1 payload1 = (Payload1) o;
    return Objects.equals(fileBase64, payload1.fileBase64) &&
        Objects.equals(dataRilascio, payload1.dataRilascio) &&
        Objects.equals(dataFineValidita, payload1.dataFineValidita) &&
        Objects.equals(note, payload1.note) &&
        Objects.equals(tipologia, payload1.tipologia) &&
        Objects.equals(tipologiaInvalidita, payload1.tipologiaInvalidita) &&
        Objects.equals(malattia, payload1.malattia) &&
        Objects.equals(tipologiaDocumento, payload1.tipologiaDocumento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileBase64, dataRilascio, dataFineValidita, note, tipologia, tipologiaInvalidita, malattia, tipologiaDocumento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payload1 {\n");
    
    sb.append("    fileBase64: ").append(toIndentedString(fileBase64)).append("\n");
    sb.append("    dataRilascio: ").append(toIndentedString(dataRilascio)).append("\n");
    sb.append("    dataFineValidita: ").append(toIndentedString(dataFineValidita)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    tipologia: ").append(toIndentedString(tipologia)).append("\n");
    sb.append("    tipologiaInvalidita: ").append(toIndentedString(tipologiaInvalidita)).append("\n");
    sb.append("    malattia: ").append(toIndentedString(malattia)).append("\n");
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

