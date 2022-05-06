/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesen.dto.apisanesen;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanesen.dto.apisanesen.Cittadino;
import it.csi.apisan.apisanesen.dto.apisanesen.CodiceEsenzione;
import it.csi.apisan.apisanesen.dto.apisanesen.RapportoFamiliare;
import it.csi.apisan.apisanesen.dto.apisanesen.StatoEsenzione;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class Esenzione   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private Integer id = null;
  private Integer protocollo = null;
  private Date dataRichiesta = null;
  private Date dataInizioValidita = null;
  private Date dataScadenza = null;
  private Date dataRevoca = null;
  private String motivazioneRevoca = null;
  private Boolean revocabile = null;
  private Boolean stampabile = null;
  private StatoEsenzione stato = null;
  private CodiceEsenzione codiceEsenzione = null;
  private Cittadino creatoDa = null;
  private Cittadino creatoPer = null;
  private Cittadino titolare = null;
  private RapportoFamiliare rapportoFamiliare = null;

  /**
   * Identificativo univoco
   **/
  
  @ApiModelProperty(example = "123", value = "Identificativo univoco")
  @JsonProperty("id") 
 
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * numero di protocollo Sogei  (valorizzato solo nella risposta) 
   **/
  
  @ApiModelProperty(example = "321654987", value = "numero di protocollo Sogei  (valorizzato solo nella risposta) ")
  @JsonProperty("protocollo") 
 
  public Integer getProtocollo() {
    return protocollo;
  }
  public void setProtocollo(Integer protocollo) {
    this.protocollo = protocollo;
  }

  /**
   * Quando è stata richiesta l&#39;esenzione?
   **/
  
  @ApiModelProperty(example = "2018-07-22T15:25:00+02:00", value = "Quando è stata richiesta l'esenzione?")
  @JsonProperty("data_richiesta") 
 
  public Date getDataRichiesta() {
    return dataRichiesta;
  }
  public void setDataRichiesta(Date dataRichiesta) {
    this.dataRichiesta = dataRichiesta;
  }

  /**
   * Da quando è valida l&#39;esenzione?
   **/
  
  @ApiModelProperty(example = "2018-07-23T15:25:00+02:00", value = "Da quando è valida l'esenzione?")
  @JsonProperty("data_inizio_validita") 
 
  public Date getDataInizioValidita() {
    return dataInizioValidita;
  }
  public void setDataInizioValidita(Date dataInizioValidita) {
    this.dataInizioValidita = dataInizioValidita;
  }

  /**
   * Quando scade questa esenzione?
   **/
  
  @ApiModelProperty(example = "2019-07-23T15:25:00+02:00", value = "Quando scade questa esenzione?")
  @JsonProperty("data_scadenza") 
 
  public Date getDataScadenza() {
    return dataScadenza;
  }
  public void setDataScadenza(Date dataScadenza) {
    this.dataScadenza = dataScadenza;
  }

  /**
   * Quando è stata revocata questa esenzione?
   **/
  
  @ApiModelProperty(example = "2018-12-06T10:55:00+02:00", value = "Quando è stata revocata questa esenzione?")
  @JsonProperty("data_revoca") 
 
  public Date getDataRevoca() {
    return dataRevoca;
  }
  public void setDataRevoca(Date dataRevoca) {
    this.dataRevoca = dataRevoca;
  }

  /**
   * fornita dal cittadino, viene riportata nelle varie richieste se preesente
   **/
  
  @ApiModelProperty(example = "questa è la motivazione della revoca inserita dal cittadino", value = "fornita dal cittadino, viene riportata nelle varie richieste se preesente")
  @JsonProperty("motivazione_revoca") 
 
  public String getMotivazioneRevoca() {
    return motivazioneRevoca;
  }
  public void setMotivazioneRevoca(String motivazioneRevoca) {
    this.motivazioneRevoca = motivazioneRevoca;
  }

  /**
   * È possibile revocare questa esenzione? (Valorizzato solo nella risposta) 
   **/
  
  @ApiModelProperty(example = "true", value = "È possibile revocare questa esenzione? (Valorizzato solo nella risposta) ")
  @JsonProperty("revocabile") 
 
  public Boolean isRevocabile() {
    return revocabile;
  }
  public void setRevocabile(Boolean revocabile) {
    this.revocabile = revocabile;
  }

  /**
   * È una esenzione stampabile? (Valorizzato solo nella risposta) 
   **/
  
  @ApiModelProperty(example = "true", value = "È una esenzione stampabile? (Valorizzato solo nella risposta) ")
  @JsonProperty("stampabile") 
 
  public Boolean isStampabile() {
    return stampabile;
  }
  public void setStampabile(Boolean stampabile) {
    this.stampabile = stampabile;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("stato") 
 
  public StatoEsenzione getStato() {
    return stato;
  }
  public void setStato(StatoEsenzione stato) {
    this.stato = stato;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("codice_esenzione") 
 
  public CodiceEsenzione getCodiceEsenzione() {
    return codiceEsenzione;
  }
  public void setCodiceEsenzione(CodiceEsenzione codiceEsenzione) {
    this.codiceEsenzione = codiceEsenzione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("creato_da") 
 
  public Cittadino getCreatoDa() {
    return creatoDa;
  }
  public void setCreatoDa(Cittadino creatoDa) {
    this.creatoDa = creatoDa;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("creato_per") 
 
  public Cittadino getCreatoPer() {
    return creatoPer;
  }
  public void setCreatoPer(Cittadino creatoPer) {
    this.creatoPer = creatoPer;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("titolare") 
 
  public Cittadino getTitolare() {
    return titolare;
  }
  public void setTitolare(Cittadino titolare) {
    this.titolare = titolare;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("rapporto_familiare") 
 
  public RapportoFamiliare getRapportoFamiliare() {
    return rapportoFamiliare;
  }
  public void setRapportoFamiliare(RapportoFamiliare rapportoFamiliare) {
    this.rapportoFamiliare = rapportoFamiliare;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Esenzione esenzione = (Esenzione) o;
    return Objects.equals(id, esenzione.id) &&
        Objects.equals(protocollo, esenzione.protocollo) &&
        Objects.equals(dataRichiesta, esenzione.dataRichiesta) &&
        Objects.equals(dataInizioValidita, esenzione.dataInizioValidita) &&
        Objects.equals(dataScadenza, esenzione.dataScadenza) &&
        Objects.equals(dataRevoca, esenzione.dataRevoca) &&
        Objects.equals(motivazioneRevoca, esenzione.motivazioneRevoca) &&
        Objects.equals(revocabile, esenzione.revocabile) &&
        Objects.equals(stampabile, esenzione.stampabile) &&
        Objects.equals(stato, esenzione.stato) &&
        Objects.equals(codiceEsenzione, esenzione.codiceEsenzione) &&
        Objects.equals(creatoDa, esenzione.creatoDa) &&
        Objects.equals(creatoPer, esenzione.creatoPer) &&
        Objects.equals(titolare, esenzione.titolare) &&
        Objects.equals(rapportoFamiliare, esenzione.rapportoFamiliare);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, protocollo, dataRichiesta, dataInizioValidita, dataScadenza, dataRevoca, motivazioneRevoca, revocabile, stampabile, stato, codiceEsenzione, creatoDa, creatoPer, titolare, rapportoFamiliare);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Esenzione {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    protocollo: ").append(toIndentedString(protocollo)).append("\n");
    sb.append("    dataRichiesta: ").append(toIndentedString(dataRichiesta)).append("\n");
    sb.append("    dataInizioValidita: ").append(toIndentedString(dataInizioValidita)).append("\n");
    sb.append("    dataScadenza: ").append(toIndentedString(dataScadenza)).append("\n");
    sb.append("    dataRevoca: ").append(toIndentedString(dataRevoca)).append("\n");
    sb.append("    motivazioneRevoca: ").append(toIndentedString(motivazioneRevoca)).append("\n");
    sb.append("    revocabile: ").append(toIndentedString(revocabile)).append("\n");
    sb.append("    stampabile: ").append(toIndentedString(stampabile)).append("\n");
    sb.append("    stato: ").append(toIndentedString(stato)).append("\n");
    sb.append("    codiceEsenzione: ").append(toIndentedString(codiceEsenzione)).append("\n");
    sb.append("    creatoDa: ").append(toIndentedString(creatoDa)).append("\n");
    sb.append("    creatoPer: ").append(toIndentedString(creatoPer)).append("\n");
    sb.append("    titolare: ").append(toIndentedString(titolare)).append("\n");
    sb.append("    rapportoFamiliare: ").append(toIndentedString(rapportoFamiliare)).append("\n");
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

