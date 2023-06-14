/*******************************************************************************

* Copyright Regione Piemonte - 2023

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancod.dto.apisancod;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import it.csi.apisan.apisancod.dto.apisancod.ModelCodifica;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;

public class ModelDocumento   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String idDocumentoIlec = null;
  private String codiceCl = null;
  private ModelCodifica azienda = null;
  private String descrizioneStruttura = null;
  private Date dataValidazione = null;
  private ModelCodifica tipoDocumento = null;
  private String tipoContributo = null;
  private BigDecimal idEpisodio = null;
  private String codiceDocumentoDipartimentale = null;
  private String idRepositoryCl = null;
  private String categoriaTipologia = null;
  private List<String> accessionNumbers = new ArrayList<String>();

  /**
   * id del documento
   **/
  

  @JsonProperty("id_documento_ilec") 
 
  public String getIdDocumentoIlec() {
    return idDocumentoIlec;
  }
  public void setIdDocumentoIlec(String idDocumentoIlec) {
    this.idDocumentoIlec = idDocumentoIlec;
  }

  /**
   * codice della componente locale
   **/
  

  @JsonProperty("codice_cl") 
 
  public String getCodiceCl() {
    return codiceCl;
  }
  public void setCodiceCl(String codiceCl) {
    this.codiceCl = codiceCl;
  }

  /**
   **/
  

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
  

  @JsonProperty("descrizione_struttura") 
 
  public String getDescrizioneStruttura() {
    return descrizioneStruttura;
  }
  public void setDescrizioneStruttura(String descrizioneStruttura) {
    this.descrizioneStruttura = descrizioneStruttura;
  }

  /**
   **/
  

  @JsonProperty("data_validazione") 
 
  public Date getDataValidazione() {
    return dataValidazione;
  }
  public void setDataValidazione(Date dataValidazione) {
    this.dataValidazione = dataValidazione;
  }

  /**
   **/
  

  @JsonProperty("tipo_documento") 
 
  public ModelCodifica getTipoDocumento() {
    return tipoDocumento;
  }
  public void setTipoDocumento(ModelCodifica tipoDocumento) {
    this.tipoDocumento = tipoDocumento;
  }

  /**
   * Se il documento è autocontribuito può valere TRASCRIZIONE o ALLEGATO (nel primo caso bisogna far vedere il testo nel secodo trattasi di un pdf), altrimenti viene restituito null
   **/
  

  @JsonProperty("tipo_contributo") 
 
  public String getTipoContributo() {
    return tipoContributo;
  }
  public void setTipoContributo(String tipoContributo) {
    this.tipoContributo = tipoContributo;
  }

  /**
   **/
  

  @JsonProperty("id_episodio") 
 
  public BigDecimal getIdEpisodio() {
    return idEpisodio;
  }
  public void setIdEpisodio(BigDecimal idEpisodio) {
    this.idEpisodio = idEpisodio;
  }

  /**
   * Codice che identifica il documento all&#39;interno dell&#39;ASR.
   **/
  

  @JsonProperty("codice_documento_dipartimentale") 
 
  public String getCodiceDocumentoDipartimentale() {
    return codiceDocumentoDipartimentale;
  }
  public void setCodiceDocumentoDipartimentale(String codiceDocumentoDipartimentale) {
    this.codiceDocumentoDipartimentale = codiceDocumentoDipartimentale;
  }

  /**
   **/
  

  @JsonProperty("id_repository_cl") 
 
  public String getIdRepositoryCl() {
    return idRepositoryCl;
  }
  public void setIdRepositoryCl(String idRepositoryCl) {
    this.idRepositoryCl = idRepositoryCl;
  }

  /**
   * categoria del documento. Possibili valori * FSE * PERSONALE 
   **/
  

  @JsonProperty("categoria_tipologia") 
 
  public String getCategoriaTipologia() {
    return categoriaTipologia;
  }
  public void setCategoriaTipologia(String categoriaTipologia) {
    this.categoriaTipologia = categoriaTipologia;
  }

  /**
   **/
  

  @JsonProperty("accession_numbers") 
 
  public List<String> getAccessionNumbers() {
    return accessionNumbers;
  }
  public void setAccessionNumbers(List<String> accessionNumbers) {
    this.accessionNumbers = accessionNumbers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelDocumento modelDocumento = (ModelDocumento) o;
    return Objects.equals(idDocumentoIlec, modelDocumento.idDocumentoIlec) &&
        Objects.equals(codiceCl, modelDocumento.codiceCl) &&
        Objects.equals(azienda, modelDocumento.azienda) &&
        Objects.equals(descrizioneStruttura, modelDocumento.descrizioneStruttura) &&
        Objects.equals(dataValidazione, modelDocumento.dataValidazione) &&
        Objects.equals(tipoDocumento, modelDocumento.tipoDocumento) &&
        Objects.equals(tipoContributo, modelDocumento.tipoContributo) &&
        Objects.equals(idEpisodio, modelDocumento.idEpisodio) &&
        Objects.equals(codiceDocumentoDipartimentale, modelDocumento.codiceDocumentoDipartimentale) &&
        Objects.equals(idRepositoryCl, modelDocumento.idRepositoryCl) &&
        Objects.equals(categoriaTipologia, modelDocumento.categoriaTipologia) &&
        Objects.equals(accessionNumbers, modelDocumento.accessionNumbers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idDocumentoIlec, codiceCl, azienda, descrizioneStruttura, dataValidazione, tipoDocumento, tipoContributo, idEpisodio, codiceDocumentoDipartimentale, idRepositoryCl, categoriaTipologia, accessionNumbers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelDocumento {\n");
    
    sb.append("    idDocumentoIlec: ").append(toIndentedString(idDocumentoIlec)).append("\n");
    sb.append("    codiceCl: ").append(toIndentedString(codiceCl)).append("\n");
    sb.append("    azienda: ").append(toIndentedString(azienda)).append("\n");
    sb.append("    descrizioneStruttura: ").append(toIndentedString(descrizioneStruttura)).append("\n");
    sb.append("    dataValidazione: ").append(toIndentedString(dataValidazione)).append("\n");
    sb.append("    tipoDocumento: ").append(toIndentedString(tipoDocumento)).append("\n");
    sb.append("    tipoContributo: ").append(toIndentedString(tipoContributo)).append("\n");
    sb.append("    idEpisodio: ").append(toIndentedString(idEpisodio)).append("\n");
    sb.append("    codiceDocumentoDipartimentale: ").append(toIndentedString(codiceDocumentoDipartimentale)).append("\n");
    sb.append("    idRepositoryCl: ").append(toIndentedString(idRepositoryCl)).append("\n");
    sb.append("    categoriaTipologia: ").append(toIndentedString(categoriaTipologia)).append("\n");
    sb.append("    accessionNumbers: ").append(toIndentedString(accessionNumbers)).append("\n");
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

