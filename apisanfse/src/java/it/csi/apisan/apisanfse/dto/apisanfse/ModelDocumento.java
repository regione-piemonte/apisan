/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelAccessionNumber;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelEpisodio;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelEtichetta;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelMedico;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelMetadatiDocumento;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelStatoRichiesta;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelDocumento   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String idDocumentoIlec = null;
  private String codiceCl = null;
  private String categoria = null;
  private ModelMetadatiDocumento metadati = null;
  private List<ModelMedico> medici = new ArrayList<ModelMedico>();
  private ModelEpisodio episodio = null;
  private String oscurato = null;
  private List<ModelAccessionNumber> accessionNumbers = new ArrayList<ModelAccessionNumber>();
  private String idPacchetto = null;
  private ModelStatoRichiesta statoRichiesta = null;
  private ModelEtichetta etichettaAnatomica = null;
  private List<ModelEtichetta> etichettePersonali = new ArrayList<ModelEtichetta>();
  private List<String> nre = new ArrayList<String>();
  private String statoGenerazionePacchetto = null;

  /**
   * id del documento
   **/
  
  @ApiModelProperty(value = "id del documento")
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
  
  @ApiModelProperty(value = "codice della componente locale")
  @JsonProperty("codice_cl") 
 
  public String getCodiceCl() {
    return codiceCl;
  }
  public void setCodiceCl(String codiceCl) {
    this.codiceCl = codiceCl;
  }

  /**
   * categoria del documento
   **/
  
  @ApiModelProperty(value = "categoria del documento")
  @JsonProperty("categoria") 
 
  public String getCategoria() {
    return categoria;
  }
  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("metadati") 
 
  public ModelMetadatiDocumento getMetadati() {
    return metadati;
  }
  public void setMetadati(ModelMetadatiDocumento metadati) {
    this.metadati = metadati;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("medici") 
 
  public List<ModelMedico> getMedici() {
    return medici;
  }
  public void setMedici(List<ModelMedico> medici) {
    this.medici = medici;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("episodio") 
 
  public ModelEpisodio getEpisodio() {
    return episodio;
  }
  public void setEpisodio(ModelEpisodio episodio) {
    this.episodio = episodio;
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
  @JsonProperty("etichetta_anatomica") 
 
  public ModelEtichetta getEtichettaAnatomica() {
    return etichettaAnatomica;
  }
  public void setEtichettaAnatomica(ModelEtichetta etichettaAnatomica) {
    this.etichettaAnatomica = etichettaAnatomica;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("etichette_personali") 
 
  public List<ModelEtichetta> getEtichettePersonali() {
    return etichettePersonali;
  }
  public void setEtichettePersonali(List<ModelEtichetta> etichettePersonali) {
    this.etichettePersonali = etichettePersonali;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("nre") 
 
  public List<String> getNre() {
    return nre;
  }
  public void setNre(List<String> nre) {
    this.nre = nre;
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
        Objects.equals(categoria, modelDocumento.categoria) &&
        Objects.equals(metadati, modelDocumento.metadati) &&
        Objects.equals(medici, modelDocumento.medici) &&
        Objects.equals(episodio, modelDocumento.episodio) &&
        Objects.equals(oscurato, modelDocumento.oscurato) &&
        Objects.equals(accessionNumbers, modelDocumento.accessionNumbers) &&
        Objects.equals(idPacchetto, modelDocumento.idPacchetto) &&
        Objects.equals(statoRichiesta, modelDocumento.statoRichiesta) &&
        Objects.equals(etichettaAnatomica, modelDocumento.etichettaAnatomica) &&
        Objects.equals(etichettePersonali, modelDocumento.etichettePersonali) &&
        Objects.equals(nre, modelDocumento.nre) &&
        Objects.equals(statoGenerazionePacchetto, modelDocumento.statoGenerazionePacchetto);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idDocumentoIlec, codiceCl, categoria, metadati, medici, episodio, oscurato, accessionNumbers, idPacchetto, statoRichiesta, etichettaAnatomica, etichettePersonali, nre, statoGenerazionePacchetto);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelDocumento {\n");
    
    sb.append("    idDocumentoIlec: ").append(toIndentedString(idDocumentoIlec)).append("\n");
    sb.append("    codiceCl: ").append(toIndentedString(codiceCl)).append("\n");
    sb.append("    categoria: ").append(toIndentedString(categoria)).append("\n");
    sb.append("    metadati: ").append(toIndentedString(metadati)).append("\n");
    sb.append("    medici: ").append(toIndentedString(medici)).append("\n");
    sb.append("    episodio: ").append(toIndentedString(episodio)).append("\n");
    sb.append("    oscurato: ").append(toIndentedString(oscurato)).append("\n");
    sb.append("    accessionNumbers: ").append(toIndentedString(accessionNumbers)).append("\n");
    sb.append("    idPacchetto: ").append(toIndentedString(idPacchetto)).append("\n");
    sb.append("    statoRichiesta: ").append(toIndentedString(statoRichiesta)).append("\n");
    sb.append("    etichettaAnatomica: ").append(toIndentedString(etichettaAnatomica)).append("\n");
    sb.append("    etichettePersonali: ").append(toIndentedString(etichettePersonali)).append("\n");
    sb.append("    nre: ").append(toIndentedString(nre)).append("\n");
    sb.append("    statoGenerazionePacchetto: ").append(toIndentedString(statoGenerazionePacchetto)).append("\n");
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

