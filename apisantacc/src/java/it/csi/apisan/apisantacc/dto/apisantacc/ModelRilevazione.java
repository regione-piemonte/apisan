/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.dto.apisantacc;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisantacc.dto.apisantacc.ModelRilevazioneDescrittore;
import it.csi.apisan.apisantacc.dto.apisantacc.ModelRilevazioneGruppo;
import it.csi.apisan.apisantacc.dto.apisantacc.ModelRilevazioneModalita;
import it.csi.apisan.apisantacc.dto.apisantacc.ModelRilevazioneUnitaMisura;
import java.math.BigDecimal;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelRilevazione   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private Long id = null;
  private BigDecimal valoreNumerico = null;
  private String valoreTestuale = null;
  private Date data = null;
  private Date dataCreazione = null;
  private Date dataAggiornamento = null;
  private String unitaMisuraCodice = null;
  private String gruppoCodice = null;
  private String descrittoreCodice = null;
  private String modalitaCodice = null;
  private ModelRilevazioneUnitaMisura unitaMisura = null;
  private ModelRilevazioneGruppo gruppo = null;
  private ModelRilevazioneDescrittore descrittore = null;
  private ModelRilevazioneModalita modalita = null;

  /**
   * Identificativo univoco
   **/
  
  @ApiModelProperty(value = "Identificativo univoco")
  @JsonProperty("id") 
 
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Il valore della numerazione
   **/
  
  @ApiModelProperty(value = "Il valore della numerazione")
  @JsonProperty("valore_numerico") 
 
  public BigDecimal getValoreNumerico() {
    return valoreNumerico;
  }
  public void setValoreNumerico(BigDecimal valoreNumerico) {
    this.valoreNumerico = valoreNumerico;
  }

  /**
   * Il valore testuale della rilevazione
   **/
  
  @ApiModelProperty(value = "Il valore testuale della rilevazione")
  @JsonProperty("valore_testuale") 
 
  public String getValoreTestuale() {
    return valoreTestuale;
  }
  public void setValoreTestuale(String valoreTestuale) {
    this.valoreTestuale = valoreTestuale;
  }

  /**
   * la data della rilevazione presa dall&#39;utente
   **/
  
  @ApiModelProperty(value = "la data della rilevazione presa dall'utente")
  @JsonProperty("data") 
 
  public Date getData() {
    return data;
  }
  public void setData(Date data) {
    this.data = data;
  }

  /**
   * la data di creazione
   **/
  
  @ApiModelProperty(value = "la data di creazione")
  @JsonProperty("data_creazione") 
 
  public Date getDataCreazione() {
    return dataCreazione;
  }
  public void setDataCreazione(Date dataCreazione) {
    this.dataCreazione = dataCreazione;
  }

  /**
   * la data di aggiornamento
   **/
  
  @ApiModelProperty(value = "la data di aggiornamento")
  @JsonProperty("data_aggiornamento") 
 
  public Date getDataAggiornamento() {
    return dataAggiornamento;
  }
  public void setDataAggiornamento(Date dataAggiornamento) {
    this.dataAggiornamento = dataAggiornamento;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("unita_misura_codice") 
 
  public String getUnitaMisuraCodice() {
    return unitaMisuraCodice;
  }
  public void setUnitaMisuraCodice(String unitaMisuraCodice) {
    this.unitaMisuraCodice = unitaMisuraCodice;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("gruppo_codice") 
 
  public String getGruppoCodice() {
    return gruppoCodice;
  }
  public void setGruppoCodice(String gruppoCodice) {
    this.gruppoCodice = gruppoCodice;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("descrittore_codice") 
 
  public String getDescrittoreCodice() {
    return descrittoreCodice;
  }
  public void setDescrittoreCodice(String descrittoreCodice) {
    this.descrittoreCodice = descrittoreCodice;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("modalita_codice") 
 
  public String getModalitaCodice() {
    return modalitaCodice;
  }
  public void setModalitaCodice(String modalitaCodice) {
    this.modalitaCodice = modalitaCodice;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("unita_misura") 
 
  public ModelRilevazioneUnitaMisura getUnitaMisura() {
    return unitaMisura;
  }
  public void setUnitaMisura(ModelRilevazioneUnitaMisura unitaMisura) {
    this.unitaMisura = unitaMisura;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("gruppo") 
 
  public ModelRilevazioneGruppo getGruppo() {
    return gruppo;
  }
  public void setGruppo(ModelRilevazioneGruppo gruppo) {
    this.gruppo = gruppo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("descrittore") 
 
  public ModelRilevazioneDescrittore getDescrittore() {
    return descrittore;
  }
  public void setDescrittore(ModelRilevazioneDescrittore descrittore) {
    this.descrittore = descrittore;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("modalita") 
 
  public ModelRilevazioneModalita getModalita() {
    return modalita;
  }
  public void setModalita(ModelRilevazioneModalita modalita) {
    this.modalita = modalita;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelRilevazione modelRilevazione = (ModelRilevazione) o;
    return Objects.equals(id, modelRilevazione.id) &&
        Objects.equals(valoreNumerico, modelRilevazione.valoreNumerico) &&
        Objects.equals(valoreTestuale, modelRilevazione.valoreTestuale) &&
        Objects.equals(data, modelRilevazione.data) &&
        Objects.equals(dataCreazione, modelRilevazione.dataCreazione) &&
        Objects.equals(dataAggiornamento, modelRilevazione.dataAggiornamento) &&
        Objects.equals(unitaMisuraCodice, modelRilevazione.unitaMisuraCodice) &&
        Objects.equals(gruppoCodice, modelRilevazione.gruppoCodice) &&
        Objects.equals(descrittoreCodice, modelRilevazione.descrittoreCodice) &&
        Objects.equals(modalitaCodice, modelRilevazione.modalitaCodice) &&
        Objects.equals(unitaMisura, modelRilevazione.unitaMisura) &&
        Objects.equals(gruppo, modelRilevazione.gruppo) &&
        Objects.equals(descrittore, modelRilevazione.descrittore) &&
        Objects.equals(modalita, modelRilevazione.modalita);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, valoreNumerico, valoreTestuale, data, dataCreazione, dataAggiornamento, unitaMisuraCodice, gruppoCodice, descrittoreCodice, modalitaCodice, unitaMisura, gruppo, descrittore, modalita);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelRilevazione {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    valoreNumerico: ").append(toIndentedString(valoreNumerico)).append("\n");
    sb.append("    valoreTestuale: ").append(toIndentedString(valoreTestuale)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    dataCreazione: ").append(toIndentedString(dataCreazione)).append("\n");
    sb.append("    dataAggiornamento: ").append(toIndentedString(dataAggiornamento)).append("\n");
    sb.append("    unitaMisuraCodice: ").append(toIndentedString(unitaMisuraCodice)).append("\n");
    sb.append("    gruppoCodice: ").append(toIndentedString(gruppoCodice)).append("\n");
    sb.append("    descrittoreCodice: ").append(toIndentedString(descrittoreCodice)).append("\n");
    sb.append("    modalitaCodice: ").append(toIndentedString(modalitaCodice)).append("\n");
    sb.append("    unitaMisura: ").append(toIndentedString(unitaMisura)).append("\n");
    sb.append("    gruppo: ").append(toIndentedString(gruppo)).append("\n");
    sb.append("    descrittore: ").append(toIndentedString(descrittore)).append("\n");
    sb.append("    modalita: ").append(toIndentedString(modalita)).append("\n");
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

