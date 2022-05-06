/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelCodifica;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelMetadatiDocumentoPersonale   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private ModelCodifica tipoDocumento = null;
  private Date dataEmissione = null;
  private String struttura = null;
  private String unita = null;
  private String medico = null;
  private ModelCodifica tipoContributo = null;
  private Date dataOraAggiornamento = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tipo_documento") 
 
  public ModelCodifica getTipoDocumento() {
    return tipoDocumento;
  }
  public void setTipoDocumento(ModelCodifica tipoDocumento) {
    this.tipoDocumento = tipoDocumento;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_emissione") 
 
  public Date getDataEmissione() {
    return dataEmissione;
  }
  public void setDataEmissione(Date dataEmissione) {
    this.dataEmissione = dataEmissione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("struttura") 
 
  public String getStruttura() {
    return struttura;
  }
  public void setStruttura(String struttura) {
    this.struttura = struttura;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("unita") 
 
  public String getUnita() {
    return unita;
  }
  public void setUnita(String unita) {
    this.unita = unita;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("medico") 
 
  public String getMedico() {
    return medico;
  }
  public void setMedico(String medico) {
    this.medico = medico;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tipo_contributo") 
 
  public ModelCodifica getTipoContributo() {
    return tipoContributo;
  }
  public void setTipoContributo(ModelCodifica tipoContributo) {
    this.tipoContributo = tipoContributo;
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
    ModelMetadatiDocumentoPersonale modelMetadatiDocumentoPersonale = (ModelMetadatiDocumentoPersonale) o;
    return Objects.equals(tipoDocumento, modelMetadatiDocumentoPersonale.tipoDocumento) &&
        Objects.equals(dataEmissione, modelMetadatiDocumentoPersonale.dataEmissione) &&
        Objects.equals(struttura, modelMetadatiDocumentoPersonale.struttura) &&
        Objects.equals(unita, modelMetadatiDocumentoPersonale.unita) &&
        Objects.equals(medico, modelMetadatiDocumentoPersonale.medico) &&
        Objects.equals(tipoContributo, modelMetadatiDocumentoPersonale.tipoContributo) &&
        Objects.equals(dataOraAggiornamento, modelMetadatiDocumentoPersonale.dataOraAggiornamento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tipoDocumento, dataEmissione, struttura, unita, medico, tipoContributo, dataOraAggiornamento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelMetadatiDocumentoPersonale {\n");
    
    sb.append("    tipoDocumento: ").append(toIndentedString(tipoDocumento)).append("\n");
    sb.append("    dataEmissione: ").append(toIndentedString(dataEmissione)).append("\n");
    sb.append("    struttura: ").append(toIndentedString(struttura)).append("\n");
    sb.append("    unita: ").append(toIndentedString(unita)).append("\n");
    sb.append("    medico: ").append(toIndentedString(medico)).append("\n");
    sb.append("    tipoContributo: ").append(toIndentedString(tipoContributo)).append("\n");
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

