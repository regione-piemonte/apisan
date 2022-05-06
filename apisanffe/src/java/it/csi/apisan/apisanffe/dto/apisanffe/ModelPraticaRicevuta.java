/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanffe.dto.apisanffe;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import it.csi.apisan.apisanffe.dto.apisanffe.ModelAttRichRimborsoPraticaRicevuta;
import it.csi.apisan.apisanffe.dto.apisanffe.ModelDettEsitiPagPraticaRicevuta;
import it.csi.apisan.apisanffe.dto.apisanffe.ModelDettPraticaRicevuta;
import it.csi.apisan.apisanffe.dto.apisanffe.ModelDettRichTelPraticaRicevuta;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;

public class ModelPraticaRicevuta   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String codiceFiscale = null;
  private String numeroPratica = null;
  private String idAsrCup = null;
  private ModelDettPraticaRicevuta elencoRicevuteStampaAsr = null;
  private ModelDettPraticaRicevuta elencoRicevuteCortesia = null;
  private ModelDettPraticaRicevuta elencoRicevuteStampaRegionale = null;
  private ModelDettRichTelPraticaRicevuta elencoRicevuteTelematiche = null;
  private ModelDettEsitiPagPraticaRicevuta elencoEsitiPagamento = null;
  private ModelAttRichRimborsoPraticaRicevuta attestatoRichiestaRimborso = null;

  /**
   * codice fiscale
   **/
  

  @JsonProperty("codice_fiscale") 
 
  public String getCodiceFiscale() {
    return codiceFiscale;
  }
  public void setCodiceFiscale(String codiceFiscale) {
    this.codiceFiscale = codiceFiscale;
  }

  /**
   * numero della pratica
   **/
  

  @JsonProperty("numero_pratica") 
 
  public String getNumeroPratica() {
    return numeroPratica;
  }
  public void setNumeroPratica(String numeroPratica) {
    this.numeroPratica = numeroPratica;
  }

  /**
   * id asr
   **/
  

  @JsonProperty("id_asr_cup") 
 
  public String getIdAsrCup() {
    return idAsrCup;
  }
  public void setIdAsrCup(String idAsrCup) {
    this.idAsrCup = idAsrCup;
  }

  /**
   **/
  

  @JsonProperty("elenco_ricevute_stampa_asr") 
 
  public ModelDettPraticaRicevuta getElencoRicevuteStampaAsr() {
    return elencoRicevuteStampaAsr;
  }
  public void setElencoRicevuteStampaAsr(ModelDettPraticaRicevuta elencoRicevuteStampaAsr) {
    this.elencoRicevuteStampaAsr = elencoRicevuteStampaAsr;
  }

  /**
   **/
  

  @JsonProperty("elenco_ricevute_cortesia") 
 
  public ModelDettPraticaRicevuta getElencoRicevuteCortesia() {
    return elencoRicevuteCortesia;
  }
  public void setElencoRicevuteCortesia(ModelDettPraticaRicevuta elencoRicevuteCortesia) {
    this.elencoRicevuteCortesia = elencoRicevuteCortesia;
  }

  /**
   **/
  

  @JsonProperty("elenco_ricevute_stampa_regionale") 
 
  public ModelDettPraticaRicevuta getElencoRicevuteStampaRegionale() {
    return elencoRicevuteStampaRegionale;
  }
  public void setElencoRicevuteStampaRegionale(ModelDettPraticaRicevuta elencoRicevuteStampaRegionale) {
    this.elencoRicevuteStampaRegionale = elencoRicevuteStampaRegionale;
  }

  /**
   **/
  

  @JsonProperty("elenco_ricevute_telematiche") 
 
  public ModelDettRichTelPraticaRicevuta getElencoRicevuteTelematiche() {
    return elencoRicevuteTelematiche;
  }
  public void setElencoRicevuteTelematiche(ModelDettRichTelPraticaRicevuta elencoRicevuteTelematiche) {
    this.elencoRicevuteTelematiche = elencoRicevuteTelematiche;
  }

  /**
   **/
  

  @JsonProperty("elenco_esiti_pagamento") 
 
  public ModelDettEsitiPagPraticaRicevuta getElencoEsitiPagamento() {
    return elencoEsitiPagamento;
  }
  public void setElencoEsitiPagamento(ModelDettEsitiPagPraticaRicevuta elencoEsitiPagamento) {
    this.elencoEsitiPagamento = elencoEsitiPagamento;
  }

  /**
   **/
  

  @JsonProperty("attestato_richiesta_rimborso") 
 
  public ModelAttRichRimborsoPraticaRicevuta getAttestatoRichiestaRimborso() {
    return attestatoRichiestaRimborso;
  }
  public void setAttestatoRichiestaRimborso(ModelAttRichRimborsoPraticaRicevuta attestatoRichiestaRimborso) {
    this.attestatoRichiestaRimborso = attestatoRichiestaRimborso;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelPraticaRicevuta modelPraticaRicevuta = (ModelPraticaRicevuta) o;
    return Objects.equals(codiceFiscale, modelPraticaRicevuta.codiceFiscale) &&
        Objects.equals(numeroPratica, modelPraticaRicevuta.numeroPratica) &&
        Objects.equals(idAsrCup, modelPraticaRicevuta.idAsrCup) &&
        Objects.equals(elencoRicevuteStampaAsr, modelPraticaRicevuta.elencoRicevuteStampaAsr) &&
        Objects.equals(elencoRicevuteCortesia, modelPraticaRicevuta.elencoRicevuteCortesia) &&
        Objects.equals(elencoRicevuteStampaRegionale, modelPraticaRicevuta.elencoRicevuteStampaRegionale) &&
        Objects.equals(elencoRicevuteTelematiche, modelPraticaRicevuta.elencoRicevuteTelematiche) &&
        Objects.equals(elencoEsitiPagamento, modelPraticaRicevuta.elencoEsitiPagamento) &&
        Objects.equals(attestatoRichiestaRimborso, modelPraticaRicevuta.attestatoRichiestaRimborso);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codiceFiscale, numeroPratica, idAsrCup, elencoRicevuteStampaAsr, elencoRicevuteCortesia, elencoRicevuteStampaRegionale, elencoRicevuteTelematiche, elencoEsitiPagamento, attestatoRichiestaRimborso);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelPraticaRicevuta {\n");
    
    sb.append("    codiceFiscale: ").append(toIndentedString(codiceFiscale)).append("\n");
    sb.append("    numeroPratica: ").append(toIndentedString(numeroPratica)).append("\n");
    sb.append("    idAsrCup: ").append(toIndentedString(idAsrCup)).append("\n");
    sb.append("    elencoRicevuteStampaAsr: ").append(toIndentedString(elencoRicevuteStampaAsr)).append("\n");
    sb.append("    elencoRicevuteCortesia: ").append(toIndentedString(elencoRicevuteCortesia)).append("\n");
    sb.append("    elencoRicevuteStampaRegionale: ").append(toIndentedString(elencoRicevuteStampaRegionale)).append("\n");
    sb.append("    elencoRicevuteTelematiche: ").append(toIndentedString(elencoRicevuteTelematiche)).append("\n");
    sb.append("    elencoEsitiPagamento: ").append(toIndentedString(elencoEsitiPagamento)).append("\n");
    sb.append("    attestatoRichiestaRimborso: ").append(toIndentedString(attestatoRichiestaRimborso)).append("\n");
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

