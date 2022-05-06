/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelVerificaStatoRichiesta2   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String statoRichiesta = null;
  private String zipName = null;
  private String directory = null;
  private String checksum = null;
  private String idDocumentoIlec = null;

  /**
   * stato della richiesta
   **/
  
  @ApiModelProperty(value = "stato della richiesta")
  @JsonProperty("stato_richiesta") 
 
  public String getStatoRichiesta() {
    return statoRichiesta;
  }
  public void setStatoRichiesta(String statoRichiesta) {
    this.statoRichiesta = statoRichiesta;
  }

  /**
   * nome del file zip
   **/
  
  @ApiModelProperty(value = "nome del file zip")
  @JsonProperty("zip_name") 
 
  public String getZipName() {
    return zipName;
  }
  public void setZipName(String zipName) {
    this.zipName = zipName;
  }

  /**
   * directory del file zip
   **/
  
  @ApiModelProperty(value = "directory del file zip")
  @JsonProperty("directory") 
 
  public String getDirectory() {
    return directory;
  }
  public void setDirectory(String directory) {
    this.directory = directory;
  }

  /**
   * checksum del file zip
   **/
  
  @ApiModelProperty(value = "checksum del file zip")
  @JsonProperty("checksum") 
 
  public String getChecksum() {
    return checksum;
  }
  public void setChecksum(String checksum) {
    this.checksum = checksum;
  }

  /**
   * id_documento_ilec
   **/
  
  @ApiModelProperty(value = "id_documento_ilec")
  @JsonProperty("id_documento_ilec") 
 
  public String getIdDocumentoIlec() {
    return idDocumentoIlec;
  }
  public void setIdDocumentoIlec(String idDocumentoIlec) {
    this.idDocumentoIlec = idDocumentoIlec;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelVerificaStatoRichiesta2 modelVerificaStatoRichiesta2 = (ModelVerificaStatoRichiesta2) o;
    return Objects.equals(statoRichiesta, modelVerificaStatoRichiesta2.statoRichiesta) &&
        Objects.equals(zipName, modelVerificaStatoRichiesta2.zipName) &&
        Objects.equals(directory, modelVerificaStatoRichiesta2.directory) &&
        Objects.equals(checksum, modelVerificaStatoRichiesta2.checksum) &&
        Objects.equals(idDocumentoIlec, modelVerificaStatoRichiesta2.idDocumentoIlec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statoRichiesta, zipName, directory, checksum, idDocumentoIlec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelVerificaStatoRichiesta2 {\n");
    
    sb.append("    statoRichiesta: ").append(toIndentedString(statoRichiesta)).append("\n");
    sb.append("    zipName: ").append(toIndentedString(zipName)).append("\n");
    sb.append("    directory: ").append(toIndentedString(directory)).append("\n");
    sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
    sb.append("    idDocumentoIlec: ").append(toIndentedString(idDocumentoIlec)).append("\n");
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

