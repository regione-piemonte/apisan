/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanaut.dto.apisanaut;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanaut.dto.apisanaut.DocumentoFile;
import it.csi.apisan.apisanaut.dto.apisanaut.DocumentoTipo;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class Documento   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private Integer id = null;
  private String desc = null;
  private Date dataScadenzaDoc = null;
  private Date dataRilascio = null;
  private Integer docTipoId = null;
  private String docDesc = null;
  private String numeroDocumento = null;
  private String autorita = null;
  private DocumentoTipo tipo = null;
  private DocumentoFile file = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id") 
 
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("desc") 
 
  public String getDesc() {
    return desc;
  }
  public void setDesc(String desc) {
    this.desc = desc;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_scadenza_doc") 
 
  public Date getDataScadenzaDoc() {
    return dataScadenzaDoc;
  }
  public void setDataScadenzaDoc(Date dataScadenzaDoc) {
    this.dataScadenzaDoc = dataScadenzaDoc;
  }

  /**
   * data rilascio del documento
   **/
  
  @ApiModelProperty(value = "data rilascio del documento")
  @JsonProperty("data_rilascio") 
 
  public Date getDataRilascio() {
    return dataRilascio;
  }
  public void setDataRilascio(Date dataRilascio) {
    this.dataRilascio = dataRilascio;
  }

  /**
   * tipo del documento 1 carta d\\&#39;identita 2 patente
   **/
  
  @ApiModelProperty(example = "1", value = "tipo del documento 1 carta d\\'identita 2 patente")
  @JsonProperty("doc_tipo_id") 
 
  public Integer getDocTipoId() {
    return docTipoId;
  }
  public void setDocTipoId(Integer docTipoId) {
    this.docTipoId = docTipoId;
  }

  /**
   * descrizione del documento
   **/
  
  @ApiModelProperty(example = "carta d\\'identita", value = "descrizione del documento")
  @JsonProperty("doc_desc") 
 
  public String getDocDesc() {
    return docDesc;
  }
  public void setDocDesc(String docDesc) {
    this.docDesc = docDesc;
  }

  /**
   * numero del documento
   **/
  
  @ApiModelProperty(value = "numero del documento")
  @JsonProperty("numero_documento") 
 
  public String getNumeroDocumento() {
    return numeroDocumento;
  }
  public void setNumeroDocumento(String numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
  }

  /**
   * autorita che ha emesso il documento
   **/
  
  @ApiModelProperty(value = "autorita che ha emesso il documento")
  @JsonProperty("autorita") 
 
  public String getAutorita() {
    return autorita;
  }
  public void setAutorita(String autorita) {
    this.autorita = autorita;
  }

  /**
   * tipo del documento codice TIPO_1 carta identita TIPO_2 patente
   **/
  
  @ApiModelProperty(value = "tipo del documento codice TIPO_1 carta identita TIPO_2 patente")
  @JsonProperty("tipo") 
 
  public DocumentoTipo getTipo() {
    return tipo;
  }
  public void setTipo(DocumentoTipo tipo) {
    this.tipo = tipo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("file") 
 
  public DocumentoFile getFile() {
    return file;
  }
  public void setFile(DocumentoFile file) {
    this.file = file;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Documento documento = (Documento) o;
    return Objects.equals(id, documento.id) &&
        Objects.equals(desc, documento.desc) &&
        Objects.equals(dataScadenzaDoc, documento.dataScadenzaDoc) &&
        Objects.equals(dataRilascio, documento.dataRilascio) &&
        Objects.equals(docTipoId, documento.docTipoId) &&
        Objects.equals(docDesc, documento.docDesc) &&
        Objects.equals(numeroDocumento, documento.numeroDocumento) &&
        Objects.equals(autorita, documento.autorita) &&
        Objects.equals(tipo, documento.tipo) &&
        Objects.equals(file, documento.file);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, desc, dataScadenzaDoc, dataRilascio, docTipoId, docDesc, numeroDocumento, autorita, tipo, file);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Documento {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    dataScadenzaDoc: ").append(toIndentedString(dataScadenzaDoc)).append("\n");
    sb.append("    dataRilascio: ").append(toIndentedString(dataRilascio)).append("\n");
    sb.append("    docTipoId: ").append(toIndentedString(docTipoId)).append("\n");
    sb.append("    docDesc: ").append(toIndentedString(docDesc)).append("\n");
    sb.append("    numeroDocumento: ").append(toIndentedString(numeroDocumento)).append("\n");
    sb.append("    autorita: ").append(toIndentedString(autorita)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
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

