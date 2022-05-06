/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanfse.dto.apisanfse.ModalitaAlimentazione;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelConsensoMatriceRuoli;
import java.util.Date;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelConsensoScreening   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private Boolean ablConsOpeAmm = null;
  private Boolean alimentaFse = null;
  private Boolean consensoAllaCostituzioneDma = null;
  private List<ModelConsensoMatriceRuoli> consensoMatriceRuoli = new ArrayList<ModelConsensoMatriceRuoli>();
  private Date dataAggiornamento = null;
  private Date dataValidazione = null;
  private Boolean derogaEmergenza = null;
  private ModalitaAlimentazione modalitaAlimentazione = null;
  private Boolean pregresso = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("abl_cons_ope_amm") 
 
  public Boolean isAblConsOpeAmm() {
    return ablConsOpeAmm;
  }
  public void setAblConsOpeAmm(Boolean ablConsOpeAmm) {
    this.ablConsOpeAmm = ablConsOpeAmm;
  }

  /**
   * consenso all&#39;alimentazione dell&#39;fse
   **/
  
  @ApiModelProperty(value = "consenso all'alimentazione dell'fse")
  @JsonProperty("alimenta_fse") 
 
  public Boolean isAlimentaFse() {
    return alimentaFse;
  }
  public void setAlimentaFse(Boolean alimentaFse) {
    this.alimentaFse = alimentaFse;
  }

  /**
   * consenso a DMA
   **/
  
  @ApiModelProperty(value = "consenso a DMA")
  @JsonProperty("consenso_alla_costituzione_dma") 
 
  public Boolean isConsensoAllaCostituzioneDma() {
    return consensoAllaCostituzioneDma;
  }
  public void setConsensoAllaCostituzioneDma(Boolean consensoAllaCostituzioneDma) {
    this.consensoAllaCostituzioneDma = consensoAllaCostituzioneDma;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("consenso_matrice_ruoli") 
 
  public List<ModelConsensoMatriceRuoli> getConsensoMatriceRuoli() {
    return consensoMatriceRuoli;
  }
  public void setConsensoMatriceRuoli(List<ModelConsensoMatriceRuoli> consensoMatriceRuoli) {
    this.consensoMatriceRuoli = consensoMatriceRuoli;
  }

  /**
   * data di aggiornamento
   **/
  
  @ApiModelProperty(value = "data di aggiornamento")
  @JsonProperty("data_aggiornamento") 
 
  public Date getDataAggiornamento() {
    return dataAggiornamento;
  }
  public void setDataAggiornamento(Date dataAggiornamento) {
    this.dataAggiornamento = dataAggiornamento;
  }

  /**
   * data di validazione
   **/
  
  @ApiModelProperty(value = "data di validazione")
  @JsonProperty("data_validazione") 
 
  public Date getDataValidazione() {
    return dataValidazione;
  }
  public void setDataValidazione(Date dataValidazione) {
    this.dataValidazione = dataValidazione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("deroga_emergenza") 
 
  public Boolean isDerogaEmergenza() {
    return derogaEmergenza;
  }
  public void setDerogaEmergenza(Boolean derogaEmergenza) {
    this.derogaEmergenza = derogaEmergenza;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("modalita_alimentazione") 
 
  public ModalitaAlimentazione getModalitaAlimentazione() {
    return modalitaAlimentazione;
  }
  public void setModalitaAlimentazione(ModalitaAlimentazione modalitaAlimentazione) {
    this.modalitaAlimentazione = modalitaAlimentazione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("pregresso") 
 
  public Boolean isPregresso() {
    return pregresso;
  }
  public void setPregresso(Boolean pregresso) {
    this.pregresso = pregresso;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelConsensoScreening modelConsensoScreening = (ModelConsensoScreening) o;
    return Objects.equals(ablConsOpeAmm, modelConsensoScreening.ablConsOpeAmm) &&
        Objects.equals(alimentaFse, modelConsensoScreening.alimentaFse) &&
        Objects.equals(consensoAllaCostituzioneDma, modelConsensoScreening.consensoAllaCostituzioneDma) &&
        Objects.equals(consensoMatriceRuoli, modelConsensoScreening.consensoMatriceRuoli) &&
        Objects.equals(dataAggiornamento, modelConsensoScreening.dataAggiornamento) &&
        Objects.equals(dataValidazione, modelConsensoScreening.dataValidazione) &&
        Objects.equals(derogaEmergenza, modelConsensoScreening.derogaEmergenza) &&
        Objects.equals(modalitaAlimentazione, modelConsensoScreening.modalitaAlimentazione) &&
        Objects.equals(pregresso, modelConsensoScreening.pregresso);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ablConsOpeAmm, alimentaFse, consensoAllaCostituzioneDma, consensoMatriceRuoli, dataAggiornamento, dataValidazione, derogaEmergenza, modalitaAlimentazione, pregresso);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelConsensoScreening {\n");
    
    sb.append("    ablConsOpeAmm: ").append(toIndentedString(ablConsOpeAmm)).append("\n");
    sb.append("    alimentaFse: ").append(toIndentedString(alimentaFse)).append("\n");
    sb.append("    consensoAllaCostituzioneDma: ").append(toIndentedString(consensoAllaCostituzioneDma)).append("\n");
    sb.append("    consensoMatriceRuoli: ").append(toIndentedString(consensoMatriceRuoli)).append("\n");
    sb.append("    dataAggiornamento: ").append(toIndentedString(dataAggiornamento)).append("\n");
    sb.append("    dataValidazione: ").append(toIndentedString(dataValidazione)).append("\n");
    sb.append("    derogaEmergenza: ").append(toIndentedString(derogaEmergenza)).append("\n");
    sb.append("    modalitaAlimentazione: ").append(toIndentedString(modalitaAlimentazione)).append("\n");
    sb.append("    pregresso: ").append(toIndentedString(pregresso)).append("\n");
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

