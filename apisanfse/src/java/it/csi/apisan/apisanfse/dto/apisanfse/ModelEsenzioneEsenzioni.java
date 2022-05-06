/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanfse.dto.apisanfse.Diagnosi;
import it.csi.apisan.apisanfse.dto.apisanfse.EnteEmittente;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelEsenzioneEsenzioni   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String codice = null;
  private String descrizione = null;
  private String riferimento = null;
  private Diagnosi diagnosi = null;
  private EnteEmittente enteEmittente = null;
  private Date dataEmissione = null;
  private Date dataScadenza = null;
  private String codiceAttestato = null;
  private String oscurato = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("codice") 
 
  public String getCodice() {
    return codice;
  }
  public void setCodice(String codice) {
    this.codice = codice;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("descrizione") 
 
  public String getDescrizione() {
    return descrizione;
  }
  public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("riferimento") 
 
  public String getRiferimento() {
    return riferimento;
  }
  public void setRiferimento(String riferimento) {
    this.riferimento = riferimento;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("diagnosi") 
 
  public Diagnosi getDiagnosi() {
    return diagnosi;
  }
  public void setDiagnosi(Diagnosi diagnosi) {
    this.diagnosi = diagnosi;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ente_emittente") 
 
  public EnteEmittente getEnteEmittente() {
    return enteEmittente;
  }
  public void setEnteEmittente(EnteEmittente enteEmittente) {
    this.enteEmittente = enteEmittente;
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
  @JsonProperty("data_scadenza") 
 
  public Date getDataScadenza() {
    return dataScadenza;
  }
  public void setDataScadenza(Date dataScadenza) {
    this.dataScadenza = dataScadenza;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("codice_attestato") 
 
  public String getCodiceAttestato() {
    return codiceAttestato;
  }
  public void setCodiceAttestato(String codiceAttestato) {
    this.codiceAttestato = codiceAttestato;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("oscurato") 
 
  public String getOscurato() {
    return oscurato;
  }
  public void setOscurato(String oscurato) {
    this.oscurato = oscurato;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelEsenzioneEsenzioni modelEsenzioneEsenzioni = (ModelEsenzioneEsenzioni) o;
    return Objects.equals(codice, modelEsenzioneEsenzioni.codice) &&
        Objects.equals(descrizione, modelEsenzioneEsenzioni.descrizione) &&
        Objects.equals(riferimento, modelEsenzioneEsenzioni.riferimento) &&
        Objects.equals(diagnosi, modelEsenzioneEsenzioni.diagnosi) &&
        Objects.equals(enteEmittente, modelEsenzioneEsenzioni.enteEmittente) &&
        Objects.equals(dataEmissione, modelEsenzioneEsenzioni.dataEmissione) &&
        Objects.equals(dataScadenza, modelEsenzioneEsenzioni.dataScadenza) &&
        Objects.equals(codiceAttestato, modelEsenzioneEsenzioni.codiceAttestato) &&
        Objects.equals(oscurato, modelEsenzioneEsenzioni.oscurato);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codice, descrizione, riferimento, diagnosi, enteEmittente, dataEmissione, dataScadenza, codiceAttestato, oscurato);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelEsenzioneEsenzioni {\n");
    
    sb.append("    codice: ").append(toIndentedString(codice)).append("\n");
    sb.append("    descrizione: ").append(toIndentedString(descrizione)).append("\n");
    sb.append("    riferimento: ").append(toIndentedString(riferimento)).append("\n");
    sb.append("    diagnosi: ").append(toIndentedString(diagnosi)).append("\n");
    sb.append("    enteEmittente: ").append(toIndentedString(enteEmittente)).append("\n");
    sb.append("    dataEmissione: ").append(toIndentedString(dataEmissione)).append("\n");
    sb.append("    dataScadenza: ").append(toIndentedString(dataScadenza)).append("\n");
    sb.append("    codiceAttestato: ").append(toIndentedString(codiceAttestato)).append("\n");
    sb.append("    oscurato: ").append(toIndentedString(oscurato)).append("\n");
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

