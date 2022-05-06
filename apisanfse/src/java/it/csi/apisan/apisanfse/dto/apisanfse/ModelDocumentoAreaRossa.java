/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanfse.dto.apisanfse.AziendaSanitaria;
import it.csi.apisan.apisanfse.dto.apisanfse.Importo;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelAccessionNumber;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelCodifica;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelStatoRichiesta;
import java.util.Date;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelDocumentoAreaRossa   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String idDocumentoIlec = null;
  private String codiceCl = null;
  private Date dataInserimento = null;
  private Date dataEmisione = null;
  private Date dataScadenza = null;
  private ModelCodifica tipoDocumento = null;
  private String descrizioneStruttura = null;
  private AziendaSanitaria azienda = null;
  private Importo importoPagato = null;
  private Importo importoDaPagare = null;
  private String pagatoTicket = null;
  private String ggDownload = null;
  private String rol = null;
  private List<ModelAccessionNumber> accessionNumbers = new ArrayList<ModelAccessionNumber>();
  private String idPacchetto = null;
  private ModelStatoRichiesta statoRichiesta = null;
  private Long idEpisodio = null;
  private String statoGenerazionePacchetto = null;
  private String codiceDocumentoDipartimentale = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id_documento_ilec") 
 
  public String getIdDocumentoIlec() {
    return idDocumentoIlec;
  }
  public void setIdDocumentoIlec(String idDocumentoIlec) {
    this.idDocumentoIlec = idDocumentoIlec;
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

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_inserimento") 
 
  public Date getDataInserimento() {
    return dataInserimento;
  }
  public void setDataInserimento(Date dataInserimento) {
    this.dataInserimento = dataInserimento;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_emisione") 
 
  public Date getDataEmisione() {
    return dataEmisione;
  }
  public void setDataEmisione(Date dataEmisione) {
    this.dataEmisione = dataEmisione;
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
  @JsonProperty("descrizione_struttura") 
 
  public String getDescrizioneStruttura() {
    return descrizioneStruttura;
  }
  public void setDescrizioneStruttura(String descrizioneStruttura) {
    this.descrizioneStruttura = descrizioneStruttura;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("azienda") 
 
  public AziendaSanitaria getAzienda() {
    return azienda;
  }
  public void setAzienda(AziendaSanitaria azienda) {
    this.azienda = azienda;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("importo_pagato") 
 
  public Importo getImportoPagato() {
    return importoPagato;
  }
  public void setImportoPagato(Importo importoPagato) {
    this.importoPagato = importoPagato;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("importo_da_pagare") 
 
  public Importo getImportoDaPagare() {
    return importoDaPagare;
  }
  public void setImportoDaPagare(Importo importoDaPagare) {
    this.importoDaPagare = importoDaPagare;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
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
  @JsonProperty("gg_download") 
 
  public String getGgDownload() {
    return ggDownload;
  }
  public void setGgDownload(String ggDownload) {
    this.ggDownload = ggDownload;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("rol") 
 
  public String getRol() {
    return rol;
  }
  public void setRol(String rol) {
    this.rol = rol;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("accession_numbers") 
 
  public List<ModelAccessionNumber> getAccessionNumbers() {
    return accessionNumbers;
  }
  public void setAccessionNumbers(List<ModelAccessionNumber> accessionNumbers) {
    this.accessionNumbers = accessionNumbers;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id_pacchetto") 
 
  public String getIdPacchetto() {
    return idPacchetto;
  }
  public void setIdPacchetto(String idPacchetto) {
    this.idPacchetto = idPacchetto;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("stato_richiesta") 
 
  public ModelStatoRichiesta getStatoRichiesta() {
    return statoRichiesta;
  }
  public void setStatoRichiesta(ModelStatoRichiesta statoRichiesta) {
    this.statoRichiesta = statoRichiesta;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id_episodio") 
 
  public Long getIdEpisodio() {
    return idEpisodio;
  }
  public void setIdEpisodio(Long idEpisodio) {
    this.idEpisodio = idEpisodio;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("stato_generazione_pacchetto") 
 
  public String getStatoGenerazionePacchetto() {
    return statoGenerazionePacchetto;
  }
  public void setStatoGenerazionePacchetto(String statoGenerazionePacchetto) {
    this.statoGenerazionePacchetto = statoGenerazionePacchetto;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("codice_documento_dipartimentale") 
 
  public String getCodiceDocumentoDipartimentale() {
    return codiceDocumentoDipartimentale;
  }
  public void setCodiceDocumentoDipartimentale(String codiceDocumentoDipartimentale) {
    this.codiceDocumentoDipartimentale = codiceDocumentoDipartimentale;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelDocumentoAreaRossa modelDocumentoAreaRossa = (ModelDocumentoAreaRossa) o;
    return Objects.equals(idDocumentoIlec, modelDocumentoAreaRossa.idDocumentoIlec) &&
        Objects.equals(codiceCl, modelDocumentoAreaRossa.codiceCl) &&
        Objects.equals(dataInserimento, modelDocumentoAreaRossa.dataInserimento) &&
        Objects.equals(dataEmisione, modelDocumentoAreaRossa.dataEmisione) &&
        Objects.equals(dataScadenza, modelDocumentoAreaRossa.dataScadenza) &&
        Objects.equals(tipoDocumento, modelDocumentoAreaRossa.tipoDocumento) &&
        Objects.equals(descrizioneStruttura, modelDocumentoAreaRossa.descrizioneStruttura) &&
        Objects.equals(azienda, modelDocumentoAreaRossa.azienda) &&
        Objects.equals(importoPagato, modelDocumentoAreaRossa.importoPagato) &&
        Objects.equals(importoDaPagare, modelDocumentoAreaRossa.importoDaPagare) &&
        Objects.equals(pagatoTicket, modelDocumentoAreaRossa.pagatoTicket) &&
        Objects.equals(ggDownload, modelDocumentoAreaRossa.ggDownload) &&
        Objects.equals(rol, modelDocumentoAreaRossa.rol) &&
        Objects.equals(accessionNumbers, modelDocumentoAreaRossa.accessionNumbers) &&
        Objects.equals(idPacchetto, modelDocumentoAreaRossa.idPacchetto) &&
        Objects.equals(statoRichiesta, modelDocumentoAreaRossa.statoRichiesta) &&
        Objects.equals(idEpisodio, modelDocumentoAreaRossa.idEpisodio) &&
        Objects.equals(statoGenerazionePacchetto, modelDocumentoAreaRossa.statoGenerazionePacchetto) &&
        Objects.equals(codiceDocumentoDipartimentale, modelDocumentoAreaRossa.codiceDocumentoDipartimentale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idDocumentoIlec, codiceCl, dataInserimento, dataEmisione, dataScadenza, tipoDocumento, descrizioneStruttura, azienda, importoPagato, importoDaPagare, pagatoTicket, ggDownload, rol, accessionNumbers, idPacchetto, statoRichiesta, idEpisodio, statoGenerazionePacchetto, codiceDocumentoDipartimentale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelDocumentoAreaRossa {\n");
    
    sb.append("    idDocumentoIlec: ").append(toIndentedString(idDocumentoIlec)).append("\n");
    sb.append("    codiceCl: ").append(toIndentedString(codiceCl)).append("\n");
    sb.append("    dataInserimento: ").append(toIndentedString(dataInserimento)).append("\n");
    sb.append("    dataEmisione: ").append(toIndentedString(dataEmisione)).append("\n");
    sb.append("    dataScadenza: ").append(toIndentedString(dataScadenza)).append("\n");
    sb.append("    tipoDocumento: ").append(toIndentedString(tipoDocumento)).append("\n");
    sb.append("    descrizioneStruttura: ").append(toIndentedString(descrizioneStruttura)).append("\n");
    sb.append("    azienda: ").append(toIndentedString(azienda)).append("\n");
    sb.append("    importoPagato: ").append(toIndentedString(importoPagato)).append("\n");
    sb.append("    importoDaPagare: ").append(toIndentedString(importoDaPagare)).append("\n");
    sb.append("    pagatoTicket: ").append(toIndentedString(pagatoTicket)).append("\n");
    sb.append("    ggDownload: ").append(toIndentedString(ggDownload)).append("\n");
    sb.append("    rol: ").append(toIndentedString(rol)).append("\n");
    sb.append("    accessionNumbers: ").append(toIndentedString(accessionNumbers)).append("\n");
    sb.append("    idPacchetto: ").append(toIndentedString(idPacchetto)).append("\n");
    sb.append("    statoRichiesta: ").append(toIndentedString(statoRichiesta)).append("\n");
    sb.append("    idEpisodio: ").append(toIndentedString(idEpisodio)).append("\n");
    sb.append("    statoGenerazionePacchetto: ").append(toIndentedString(statoGenerazionePacchetto)).append("\n");
    sb.append("    codiceDocumentoDipartimentale: ").append(toIndentedString(codiceDocumentoDipartimentale)).append("\n");
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

