/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelLinkImmagine;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelLinkImmagineRefertante;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelDocumentoDma   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String accessionNumber = null;
  private String codiceEpisodioDipartimentale = null;
  private String codicePazienteDipartimentale = null;
  private byte[] documento = null;
  private Boolean firmatoDigitalmente = null;
  private String idDipartimentale = null;
  private String idDocumento = null;
  private String idEpisodio = null;
  private List<ModelLinkImmagine> linkImmagini = new ArrayList<ModelLinkImmagine>();
  private List<ModelLinkImmagineRefertante> linkImmaginiStazioniRefertanti = new ArrayList<ModelLinkImmagineRefertante>();
  private List<String> listaNre = new ArrayList<String>();
  private String oscurato = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("accession_number") 
 
  public String getAccessionNumber() {
    return accessionNumber;
  }
  public void setAccessionNumber(String accessionNumber) {
    this.accessionNumber = accessionNumber;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("codice_episodio_dipartimentale") 
 
  public String getCodiceEpisodioDipartimentale() {
    return codiceEpisodioDipartimentale;
  }
  public void setCodiceEpisodioDipartimentale(String codiceEpisodioDipartimentale) {
    this.codiceEpisodioDipartimentale = codiceEpisodioDipartimentale;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("codice_paziente_dipartimentale") 
 
  public String getCodicePazienteDipartimentale() {
    return codicePazienteDipartimentale;
  }
  public void setCodicePazienteDipartimentale(String codicePazienteDipartimentale) {
    this.codicePazienteDipartimentale = codicePazienteDipartimentale;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("documento") 
 
  public byte[] getDocumento() {
    return documento;
  }
  public void setDocumento(byte[] documento) {
    this.documento = documento;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("firmato_digitalmente") 
 
  public Boolean isFirmatoDigitalmente() {
    return firmatoDigitalmente;
  }
  public void setFirmatoDigitalmente(Boolean firmatoDigitalmente) {
    this.firmatoDigitalmente = firmatoDigitalmente;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id_dipartimentale") 
 
  public String getIdDipartimentale() {
    return idDipartimentale;
  }
  public void setIdDipartimentale(String idDipartimentale) {
    this.idDipartimentale = idDipartimentale;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id_documento") 
 
  public String getIdDocumento() {
    return idDocumento;
  }
  public void setIdDocumento(String idDocumento) {
    this.idDocumento = idDocumento;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id_episodio") 
 
  public String getIdEpisodio() {
    return idEpisodio;
  }
  public void setIdEpisodio(String idEpisodio) {
    this.idEpisodio = idEpisodio;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("link_immagini") 
 
  public List<ModelLinkImmagine> getLinkImmagini() {
    return linkImmagini;
  }
  public void setLinkImmagini(List<ModelLinkImmagine> linkImmagini) {
    this.linkImmagini = linkImmagini;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("link_immagini_stazioni_refertanti") 
 
  public List<ModelLinkImmagineRefertante> getLinkImmaginiStazioniRefertanti() {
    return linkImmaginiStazioniRefertanti;
  }
  public void setLinkImmaginiStazioniRefertanti(List<ModelLinkImmagineRefertante> linkImmaginiStazioniRefertanti) {
    this.linkImmaginiStazioniRefertanti = linkImmaginiStazioniRefertanti;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lista_nre") 
 
  public List<String> getListaNre() {
    return listaNre;
  }
  public void setListaNre(List<String> listaNre) {
    this.listaNre = listaNre;
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
    ModelDocumentoDma modelDocumentoDma = (ModelDocumentoDma) o;
    return Objects.equals(accessionNumber, modelDocumentoDma.accessionNumber) &&
        Objects.equals(codiceEpisodioDipartimentale, modelDocumentoDma.codiceEpisodioDipartimentale) &&
        Objects.equals(codicePazienteDipartimentale, modelDocumentoDma.codicePazienteDipartimentale) &&
        Objects.equals(documento, modelDocumentoDma.documento) &&
        Objects.equals(firmatoDigitalmente, modelDocumentoDma.firmatoDigitalmente) &&
        Objects.equals(idDipartimentale, modelDocumentoDma.idDipartimentale) &&
        Objects.equals(idDocumento, modelDocumentoDma.idDocumento) &&
        Objects.equals(idEpisodio, modelDocumentoDma.idEpisodio) &&
        Objects.equals(linkImmagini, modelDocumentoDma.linkImmagini) &&
        Objects.equals(linkImmaginiStazioniRefertanti, modelDocumentoDma.linkImmaginiStazioniRefertanti) &&
        Objects.equals(listaNre, modelDocumentoDma.listaNre) &&
        Objects.equals(oscurato, modelDocumentoDma.oscurato);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessionNumber, codiceEpisodioDipartimentale, codicePazienteDipartimentale, documento, firmatoDigitalmente, idDipartimentale, idDocumento, idEpisodio, linkImmagini, linkImmaginiStazioniRefertanti, listaNre, oscurato);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelDocumentoDma {\n");
    
    sb.append("    accessionNumber: ").append(toIndentedString(accessionNumber)).append("\n");
    sb.append("    codiceEpisodioDipartimentale: ").append(toIndentedString(codiceEpisodioDipartimentale)).append("\n");
    sb.append("    codicePazienteDipartimentale: ").append(toIndentedString(codicePazienteDipartimentale)).append("\n");
    sb.append("    documento: ").append(toIndentedString(documento)).append("\n");
    sb.append("    firmatoDigitalmente: ").append(toIndentedString(firmatoDigitalmente)).append("\n");
    sb.append("    idDipartimentale: ").append(toIndentedString(idDipartimentale)).append("\n");
    sb.append("    idDocumento: ").append(toIndentedString(idDocumento)).append("\n");
    sb.append("    idEpisodio: ").append(toIndentedString(idEpisodio)).append("\n");
    sb.append("    linkImmagini: ").append(toIndentedString(linkImmagini)).append("\n");
    sb.append("    linkImmaginiStazioniRefertanti: ").append(toIndentedString(linkImmaginiStazioniRefertanti)).append("\n");
    sb.append("    listaNre: ").append(toIndentedString(listaNre)).append("\n");
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

