/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelDocumentoPersonale   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private byte[] allegato = null;
  private String tipoAllegato = null;
  private String trascrizione = null;
  private Date dataOraAggiornamento = null;

  /**
   * file in formato binary base64
   **/
  
  @ApiModelProperty(value = "file in formato binary base64")
  @JsonProperty("allegato") 
 
  public byte[] getAllegato() {
    return allegato;
  }
  public void setAllegato(byte[] allegato) {
    this.allegato = allegato;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tipo_allegato") 
 
  public String getTipoAllegato() {
    return tipoAllegato;
  }
  public void setTipoAllegato(String tipoAllegato) {
    this.tipoAllegato = tipoAllegato;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("trascrizione") 
 
  public String getTrascrizione() {
    return trascrizione;
  }
  public void setTrascrizione(String trascrizione) {
    this.trascrizione = trascrizione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_ora_aggiornamento") 
 
  public Date getDataOraAggiornamento() {
    return dataOraAggiornamento;
  }
  public void setDataOraAggiornamento(Date dataOraAggiornamento) {
    this.dataOraAggiornamento = dataOraAggiornamento;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelDocumentoPersonale modelDocumentoPersonale = (ModelDocumentoPersonale) o;
    return Objects.equals(allegato, modelDocumentoPersonale.allegato) &&
        Objects.equals(tipoAllegato, modelDocumentoPersonale.tipoAllegato) &&
        Objects.equals(trascrizione, modelDocumentoPersonale.trascrizione) &&
        Objects.equals(dataOraAggiornamento, modelDocumentoPersonale.dataOraAggiornamento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allegato, tipoAllegato, trascrizione, dataOraAggiornamento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelDocumentoPersonale {\n");
    
    sb.append("    allegato: ").append(toIndentedString(allegato)).append("\n");
    sb.append("    tipoAllegato: ").append(toIndentedString(tipoAllegato)).append("\n");
    sb.append("    trascrizione: ").append(toIndentedString(trascrizione)).append("\n");
    sb.append("    dataOraAggiornamento: ").append(toIndentedString(dataOraAggiornamento)).append("\n");
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

