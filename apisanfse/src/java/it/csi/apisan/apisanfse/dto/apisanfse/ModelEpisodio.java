/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelCodifica;
import java.math.BigDecimal;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelEpisodio   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private BigDecimal idEpisodio = null;
  private Date dataInizio = null;
  private Date dataFine = null;
  private ModelCodifica aziendaAccettazione = null;
  private ModelCodifica aziendaDimissione = null;
  private String descrizioneStrutturaAccettazione = null;
  private String descrizioneStrutturaDimissione = null;
  private String descrizioneUnitaOperativaAccettazione = null;
  private String descrizioneUnitaOperativaDimissione = null;
  private String matricolaAccettazione = null;
  private String matricolaDimissione = null;
  private String numeroPassaggio = null;
  private String numeroNosologico = null;
  private ModelCodifica tipoEpisodio = null;
  private String codiceCl = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id_episodio") 
 
  public BigDecimal getIdEpisodio() {
    return idEpisodio;
  }
  public void setIdEpisodio(BigDecimal idEpisodio) {
    this.idEpisodio = idEpisodio;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_inizio") 
 
  public Date getDataInizio() {
    return dataInizio;
  }
  public void setDataInizio(Date dataInizio) {
    this.dataInizio = dataInizio;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_fine") 
 
  public Date getDataFine() {
    return dataFine;
  }
  public void setDataFine(Date dataFine) {
    this.dataFine = dataFine;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("azienda_accettazione") 
 
  public ModelCodifica getAziendaAccettazione() {
    return aziendaAccettazione;
  }
  public void setAziendaAccettazione(ModelCodifica aziendaAccettazione) {
    this.aziendaAccettazione = aziendaAccettazione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("azienda_dimissione") 
 
  public ModelCodifica getAziendaDimissione() {
    return aziendaDimissione;
  }
  public void setAziendaDimissione(ModelCodifica aziendaDimissione) {
    this.aziendaDimissione = aziendaDimissione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("descrizione_struttura_accettazione") 
 
  public String getDescrizioneStrutturaAccettazione() {
    return descrizioneStrutturaAccettazione;
  }
  public void setDescrizioneStrutturaAccettazione(String descrizioneStrutturaAccettazione) {
    this.descrizioneStrutturaAccettazione = descrizioneStrutturaAccettazione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("descrizione_struttura_dimissione") 
 
  public String getDescrizioneStrutturaDimissione() {
    return descrizioneStrutturaDimissione;
  }
  public void setDescrizioneStrutturaDimissione(String descrizioneStrutturaDimissione) {
    this.descrizioneStrutturaDimissione = descrizioneStrutturaDimissione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("descrizione_unita_operativa_accettazione") 
 
  public String getDescrizioneUnitaOperativaAccettazione() {
    return descrizioneUnitaOperativaAccettazione;
  }
  public void setDescrizioneUnitaOperativaAccettazione(String descrizioneUnitaOperativaAccettazione) {
    this.descrizioneUnitaOperativaAccettazione = descrizioneUnitaOperativaAccettazione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("descrizione_unita_operativa_dimissione") 
 
  public String getDescrizioneUnitaOperativaDimissione() {
    return descrizioneUnitaOperativaDimissione;
  }
  public void setDescrizioneUnitaOperativaDimissione(String descrizioneUnitaOperativaDimissione) {
    this.descrizioneUnitaOperativaDimissione = descrizioneUnitaOperativaDimissione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("matricola_accettazione") 
 
  public String getMatricolaAccettazione() {
    return matricolaAccettazione;
  }
  public void setMatricolaAccettazione(String matricolaAccettazione) {
    this.matricolaAccettazione = matricolaAccettazione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("matricola_dimissione") 
 
  public String getMatricolaDimissione() {
    return matricolaDimissione;
  }
  public void setMatricolaDimissione(String matricolaDimissione) {
    this.matricolaDimissione = matricolaDimissione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("numero_passaggio") 
 
  public String getNumeroPassaggio() {
    return numeroPassaggio;
  }
  public void setNumeroPassaggio(String numeroPassaggio) {
    this.numeroPassaggio = numeroPassaggio;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("numero_nosologico") 
 
  public String getNumeroNosologico() {
    return numeroNosologico;
  }
  public void setNumeroNosologico(String numeroNosologico) {
    this.numeroNosologico = numeroNosologico;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tipo_episodio") 
 
  public ModelCodifica getTipoEpisodio() {
    return tipoEpisodio;
  }
  public void setTipoEpisodio(ModelCodifica tipoEpisodio) {
    this.tipoEpisodio = tipoEpisodio;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("codice_cl") 
 
  public String getCodiceCl() {
    return codiceCl;
  }
  public void setCodiceCl(String codiceCl) {
    this.codiceCl = codiceCl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelEpisodio modelEpisodio = (ModelEpisodio) o;
    return Objects.equals(idEpisodio, modelEpisodio.idEpisodio) &&
        Objects.equals(dataInizio, modelEpisodio.dataInizio) &&
        Objects.equals(dataFine, modelEpisodio.dataFine) &&
        Objects.equals(aziendaAccettazione, modelEpisodio.aziendaAccettazione) &&
        Objects.equals(aziendaDimissione, modelEpisodio.aziendaDimissione) &&
        Objects.equals(descrizioneStrutturaAccettazione, modelEpisodio.descrizioneStrutturaAccettazione) &&
        Objects.equals(descrizioneStrutturaDimissione, modelEpisodio.descrizioneStrutturaDimissione) &&
        Objects.equals(descrizioneUnitaOperativaAccettazione, modelEpisodio.descrizioneUnitaOperativaAccettazione) &&
        Objects.equals(descrizioneUnitaOperativaDimissione, modelEpisodio.descrizioneUnitaOperativaDimissione) &&
        Objects.equals(matricolaAccettazione, modelEpisodio.matricolaAccettazione) &&
        Objects.equals(matricolaDimissione, modelEpisodio.matricolaDimissione) &&
        Objects.equals(numeroPassaggio, modelEpisodio.numeroPassaggio) &&
        Objects.equals(numeroNosologico, modelEpisodio.numeroNosologico) &&
        Objects.equals(tipoEpisodio, modelEpisodio.tipoEpisodio) &&
        Objects.equals(codiceCl, modelEpisodio.codiceCl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idEpisodio, dataInizio, dataFine, aziendaAccettazione, aziendaDimissione, descrizioneStrutturaAccettazione, descrizioneStrutturaDimissione, descrizioneUnitaOperativaAccettazione, descrizioneUnitaOperativaDimissione, matricolaAccettazione, matricolaDimissione, numeroPassaggio, numeroNosologico, tipoEpisodio, codiceCl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelEpisodio {\n");
    
    sb.append("    idEpisodio: ").append(toIndentedString(idEpisodio)).append("\n");
    sb.append("    dataInizio: ").append(toIndentedString(dataInizio)).append("\n");
    sb.append("    dataFine: ").append(toIndentedString(dataFine)).append("\n");
    sb.append("    aziendaAccettazione: ").append(toIndentedString(aziendaAccettazione)).append("\n");
    sb.append("    aziendaDimissione: ").append(toIndentedString(aziendaDimissione)).append("\n");
    sb.append("    descrizioneStrutturaAccettazione: ").append(toIndentedString(descrizioneStrutturaAccettazione)).append("\n");
    sb.append("    descrizioneStrutturaDimissione: ").append(toIndentedString(descrizioneStrutturaDimissione)).append("\n");
    sb.append("    descrizioneUnitaOperativaAccettazione: ").append(toIndentedString(descrizioneUnitaOperativaAccettazione)).append("\n");
    sb.append("    descrizioneUnitaOperativaDimissione: ").append(toIndentedString(descrizioneUnitaOperativaDimissione)).append("\n");
    sb.append("    matricolaAccettazione: ").append(toIndentedString(matricolaAccettazione)).append("\n");
    sb.append("    matricolaDimissione: ").append(toIndentedString(matricolaDimissione)).append("\n");
    sb.append("    numeroPassaggio: ").append(toIndentedString(numeroPassaggio)).append("\n");
    sb.append("    numeroNosologico: ").append(toIndentedString(numeroNosologico)).append("\n");
    sb.append("    tipoEpisodio: ").append(toIndentedString(tipoEpisodio)).append("\n");
    sb.append("    codiceCl: ").append(toIndentedString(codiceCl)).append("\n");
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

