/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanfse.dto.apisanfse.Importo;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelCodifica;
import it.csi.apisan.apisanfse.dto.apisanfse.Prestazione;
import java.util.Date;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelMetadatiDocumento   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String codiceDocumentoDipartimentale = null;
  private ModelCodifica azienda = null;
  private String descrizioneStruttura = null;
  private String descrizioneUnitaOperativa = null;
  private String matricolaUpDipartimentale = null;
  private Date dataValidazione = null;
  private ModelCodifica tipoDocumento = null;
  private String tipoFile = null;
  private String codiceDipartimentale = null;
  private String codiceTipoDocumentoAlto = null;
  private ModelCodifica assettoOrganizzativo = null;
  private String idRepositoryCl = null;
  private ModelCodifica tipoFirma = null;
  private Importo ticketPagato = null;
  private Importo ticketDaPagare = null;
  private String pagatoTicket = null;
  private String coccarda = null;
  private Boolean flagEpisodiCollegati = null;
  private Boolean flagAssociazioniNre = null;
  private Boolean flagAssociazioniAppend = null;
  private Date dataPrimoScarico = null;
  private Date dataRitiroDeVisu = null;
  private String recuperoPregresso = null;
  private String descrizioneTipoFile = null;
  private List<Prestazione> prestazioni = new ArrayList<Prestazione>();
  private String tipoContributo = null;

  /**
   * Codice che identifica il documento all&#39;interno dell&#39;ASR.
   **/
  
  @ApiModelProperty(value = "Codice che identifica il documento all'interno dell'ASR.")
  @JsonProperty("codice_documento_dipartimentale") 
 
  public String getCodiceDocumentoDipartimentale() {
    return codiceDocumentoDipartimentale;
  }
  public void setCodiceDocumentoDipartimentale(String codiceDocumentoDipartimentale) {
    this.codiceDocumentoDipartimentale = codiceDocumentoDipartimentale;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("azienda") 
 
  public ModelCodifica getAzienda() {
    return azienda;
  }
  public void setAzienda(ModelCodifica azienda) {
    this.azienda = azienda;
  }

  /**
   * descrizione della struttura
   **/
  
  @ApiModelProperty(value = "descrizione della struttura")
  @JsonProperty("descrizione_struttura") 
 
  public String getDescrizioneStruttura() {
    return descrizioneStruttura;
  }
  public void setDescrizioneStruttura(String descrizioneStruttura) {
    this.descrizioneStruttura = descrizioneStruttura;
  }

  /**
   * descrizione dell&#39;unita operativa
   **/
  
  @ApiModelProperty(value = "descrizione dell'unita operativa")
  @JsonProperty("descrizione_unita_operativa") 
 
  public String getDescrizioneUnitaOperativa() {
    return descrizioneUnitaOperativa;
  }
  public void setDescrizioneUnitaOperativa(String descrizioneUnitaOperativa) {
    this.descrizioneUnitaOperativa = descrizioneUnitaOperativa;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("matricola_up_dipartimentale") 
 
  public String getMatricolaUpDipartimentale() {
    return matricolaUpDipartimentale;
  }
  public void setMatricolaUpDipartimentale(String matricolaUpDipartimentale) {
    this.matricolaUpDipartimentale = matricolaUpDipartimentale;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
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
  @JsonProperty("tipo_file") 
 
  public String getTipoFile() {
    return tipoFile;
  }
  public void setTipoFile(String tipoFile) {
    this.tipoFile = tipoFile;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("codice_dipartimentale") 
 
  public String getCodiceDipartimentale() {
    return codiceDipartimentale;
  }
  public void setCodiceDipartimentale(String codiceDipartimentale) {
    this.codiceDipartimentale = codiceDipartimentale;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("codice_tipo_documento_alto") 
 
  public String getCodiceTipoDocumentoAlto() {
    return codiceTipoDocumentoAlto;
  }
  public void setCodiceTipoDocumentoAlto(String codiceTipoDocumentoAlto) {
    this.codiceTipoDocumentoAlto = codiceTipoDocumentoAlto;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("assetto_organizzativo") 
 
  public ModelCodifica getAssettoOrganizzativo() {
    return assettoOrganizzativo;
  }
  public void setAssettoOrganizzativo(ModelCodifica assettoOrganizzativo) {
    this.assettoOrganizzativo = assettoOrganizzativo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id_repository_cl") 
 
  public String getIdRepositoryCl() {
    return idRepositoryCl;
  }
  public void setIdRepositoryCl(String idRepositoryCl) {
    this.idRepositoryCl = idRepositoryCl;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tipo_firma") 
 
  public ModelCodifica getTipoFirma() {
    return tipoFirma;
  }
  public void setTipoFirma(ModelCodifica tipoFirma) {
    this.tipoFirma = tipoFirma;
  }

  /**
   * da verificare il tipo
   **/
  
  @ApiModelProperty(value = "da verificare il tipo")
  @JsonProperty("ticket_pagato") 
 
  public Importo getTicketPagato() {
    return ticketPagato;
  }
  public void setTicketPagato(Importo ticketPagato) {
    this.ticketPagato = ticketPagato;
  }

  /**
   * da verificare il tipo
   **/
  
  @ApiModelProperty(value = "da verificare il tipo")
  @JsonProperty("ticket_da_pagare") 
 
  public Importo getTicketDaPagare() {
    return ticketDaPagare;
  }
  public void setTicketDaPagare(Importo ticketDaPagare) {
    this.ticketDaPagare = ticketDaPagare;
  }

  /**
   * Possibili valori * S-&gt;pagato * N-&gt;non pagato * R-&gt;rimborso * P-&gt; pagato parziale * E-&gt;esente * U-&gt;non noto * F-&gt;non è previsto ticket 
   **/
  
  @ApiModelProperty(value = "Possibili valori * S->pagato * N->non pagato * R->rimborso * P-> pagato parziale * E->esente * U->non noto * F->non è previsto ticket ")
  @JsonProperty("pagato_ticket") 
 
  public String getPagatoTicket() {
    return pagatoTicket;
  }
  public void setPagatoTicket(String pagatoTicket) {
    this.pagatoTicket = pagatoTicket;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("coccarda") 
 
  public String getCoccarda() {
    return coccarda;
  }
  public void setCoccarda(String coccarda) {
    this.coccarda = coccarda;
  }

  /**
   * verificare il tipo
   **/
  
  @ApiModelProperty(value = "verificare il tipo")
  @JsonProperty("flag_episodi_collegati") 
 
  public Boolean isFlagEpisodiCollegati() {
    return flagEpisodiCollegati;
  }
  public void setFlagEpisodiCollegati(Boolean flagEpisodiCollegati) {
    this.flagEpisodiCollegati = flagEpisodiCollegati;
  }

  /**
   * verificare il tipo
   **/
  
  @ApiModelProperty(value = "verificare il tipo")
  @JsonProperty("flag_associazioni_nre") 
 
  public Boolean isFlagAssociazioniNre() {
    return flagAssociazioniNre;
  }
  public void setFlagAssociazioniNre(Boolean flagAssociazioniNre) {
    this.flagAssociazioniNre = flagAssociazioniNre;
  }

  /**
   * verificare il tipo
   **/
  
  @ApiModelProperty(value = "verificare il tipo")
  @JsonProperty("flag_associazioni_append") 
 
  public Boolean isFlagAssociazioniAppend() {
    return flagAssociazioniAppend;
  }
  public void setFlagAssociazioniAppend(Boolean flagAssociazioniAppend) {
    this.flagAssociazioniAppend = flagAssociazioniAppend;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_primo_scarico") 
 
  public Date getDataPrimoScarico() {
    return dataPrimoScarico;
  }
  public void setDataPrimoScarico(Date dataPrimoScarico) {
    this.dataPrimoScarico = dataPrimoScarico;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_ritiro_de_visu") 
 
  public Date getDataRitiroDeVisu() {
    return dataRitiroDeVisu;
  }
  public void setDataRitiroDeVisu(Date dataRitiroDeVisu) {
    this.dataRitiroDeVisu = dataRitiroDeVisu;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("recupero_pregresso") 
 
  public String getRecuperoPregresso() {
    return recuperoPregresso;
  }
  public void setRecuperoPregresso(String recuperoPregresso) {
    this.recuperoPregresso = recuperoPregresso;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("descrizione_tipo_file") 
 
  public String getDescrizioneTipoFile() {
    return descrizioneTipoFile;
  }
  public void setDescrizioneTipoFile(String descrizioneTipoFile) {
    this.descrizioneTipoFile = descrizioneTipoFile;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("prestazioni") 
 
  public List<Prestazione> getPrestazioni() {
    return prestazioni;
  }
  public void setPrestazioni(List<Prestazione> prestazioni) {
    this.prestazioni = prestazioni;
  }

  /**
   * può valere string o allegato nel primo caso bisogna far vedere il testo nel secodo trattasi di un pdf
   **/
  
  @ApiModelProperty(value = "può valere string o allegato nel primo caso bisogna far vedere il testo nel secodo trattasi di un pdf")
  @JsonProperty("tipo_contributo") 
 
  public String getTipoContributo() {
    return tipoContributo;
  }
  public void setTipoContributo(String tipoContributo) {
    this.tipoContributo = tipoContributo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelMetadatiDocumento modelMetadatiDocumento = (ModelMetadatiDocumento) o;
    return Objects.equals(codiceDocumentoDipartimentale, modelMetadatiDocumento.codiceDocumentoDipartimentale) &&
        Objects.equals(azienda, modelMetadatiDocumento.azienda) &&
        Objects.equals(descrizioneStruttura, modelMetadatiDocumento.descrizioneStruttura) &&
        Objects.equals(descrizioneUnitaOperativa, modelMetadatiDocumento.descrizioneUnitaOperativa) &&
        Objects.equals(matricolaUpDipartimentale, modelMetadatiDocumento.matricolaUpDipartimentale) &&
        Objects.equals(dataValidazione, modelMetadatiDocumento.dataValidazione) &&
        Objects.equals(tipoDocumento, modelMetadatiDocumento.tipoDocumento) &&
        Objects.equals(tipoFile, modelMetadatiDocumento.tipoFile) &&
        Objects.equals(codiceDipartimentale, modelMetadatiDocumento.codiceDipartimentale) &&
        Objects.equals(codiceTipoDocumentoAlto, modelMetadatiDocumento.codiceTipoDocumentoAlto) &&
        Objects.equals(assettoOrganizzativo, modelMetadatiDocumento.assettoOrganizzativo) &&
        Objects.equals(idRepositoryCl, modelMetadatiDocumento.idRepositoryCl) &&
        Objects.equals(tipoFirma, modelMetadatiDocumento.tipoFirma) &&
        Objects.equals(ticketPagato, modelMetadatiDocumento.ticketPagato) &&
        Objects.equals(ticketDaPagare, modelMetadatiDocumento.ticketDaPagare) &&
        Objects.equals(pagatoTicket, modelMetadatiDocumento.pagatoTicket) &&
        Objects.equals(coccarda, modelMetadatiDocumento.coccarda) &&
        Objects.equals(flagEpisodiCollegati, modelMetadatiDocumento.flagEpisodiCollegati) &&
        Objects.equals(flagAssociazioniNre, modelMetadatiDocumento.flagAssociazioniNre) &&
        Objects.equals(flagAssociazioniAppend, modelMetadatiDocumento.flagAssociazioniAppend) &&
        Objects.equals(dataPrimoScarico, modelMetadatiDocumento.dataPrimoScarico) &&
        Objects.equals(dataRitiroDeVisu, modelMetadatiDocumento.dataRitiroDeVisu) &&
        Objects.equals(recuperoPregresso, modelMetadatiDocumento.recuperoPregresso) &&
        Objects.equals(descrizioneTipoFile, modelMetadatiDocumento.descrizioneTipoFile) &&
        Objects.equals(prestazioni, modelMetadatiDocumento.prestazioni) &&
        Objects.equals(tipoContributo, modelMetadatiDocumento.tipoContributo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codiceDocumentoDipartimentale, azienda, descrizioneStruttura, descrizioneUnitaOperativa, matricolaUpDipartimentale, dataValidazione, tipoDocumento, tipoFile, codiceDipartimentale, codiceTipoDocumentoAlto, assettoOrganizzativo, idRepositoryCl, tipoFirma, ticketPagato, ticketDaPagare, pagatoTicket, coccarda, flagEpisodiCollegati, flagAssociazioniNre, flagAssociazioniAppend, dataPrimoScarico, dataRitiroDeVisu, recuperoPregresso, descrizioneTipoFile, prestazioni, tipoContributo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelMetadatiDocumento {\n");
    
    sb.append("    codiceDocumentoDipartimentale: ").append(toIndentedString(codiceDocumentoDipartimentale)).append("\n");
    sb.append("    azienda: ").append(toIndentedString(azienda)).append("\n");
    sb.append("    descrizioneStruttura: ").append(toIndentedString(descrizioneStruttura)).append("\n");
    sb.append("    descrizioneUnitaOperativa: ").append(toIndentedString(descrizioneUnitaOperativa)).append("\n");
    sb.append("    matricolaUpDipartimentale: ").append(toIndentedString(matricolaUpDipartimentale)).append("\n");
    sb.append("    dataValidazione: ").append(toIndentedString(dataValidazione)).append("\n");
    sb.append("    tipoDocumento: ").append(toIndentedString(tipoDocumento)).append("\n");
    sb.append("    tipoFile: ").append(toIndentedString(tipoFile)).append("\n");
    sb.append("    codiceDipartimentale: ").append(toIndentedString(codiceDipartimentale)).append("\n");
    sb.append("    codiceTipoDocumentoAlto: ").append(toIndentedString(codiceTipoDocumentoAlto)).append("\n");
    sb.append("    assettoOrganizzativo: ").append(toIndentedString(assettoOrganizzativo)).append("\n");
    sb.append("    idRepositoryCl: ").append(toIndentedString(idRepositoryCl)).append("\n");
    sb.append("    tipoFirma: ").append(toIndentedString(tipoFirma)).append("\n");
    sb.append("    ticketPagato: ").append(toIndentedString(ticketPagato)).append("\n");
    sb.append("    ticketDaPagare: ").append(toIndentedString(ticketDaPagare)).append("\n");
    sb.append("    pagatoTicket: ").append(toIndentedString(pagatoTicket)).append("\n");
    sb.append("    coccarda: ").append(toIndentedString(coccarda)).append("\n");
    sb.append("    flagEpisodiCollegati: ").append(toIndentedString(flagEpisodiCollegati)).append("\n");
    sb.append("    flagAssociazioniNre: ").append(toIndentedString(flagAssociazioniNre)).append("\n");
    sb.append("    flagAssociazioniAppend: ").append(toIndentedString(flagAssociazioniAppend)).append("\n");
    sb.append("    dataPrimoScarico: ").append(toIndentedString(dataPrimoScarico)).append("\n");
    sb.append("    dataRitiroDeVisu: ").append(toIndentedString(dataRitiroDeVisu)).append("\n");
    sb.append("    recuperoPregresso: ").append(toIndentedString(recuperoPregresso)).append("\n");
    sb.append("    descrizioneTipoFile: ").append(toIndentedString(descrizioneTipoFile)).append("\n");
    sb.append("    prestazioni: ").append(toIndentedString(prestazioni)).append("\n");
    sb.append("    tipoContributo: ").append(toIndentedString(tipoContributo)).append("\n");
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

