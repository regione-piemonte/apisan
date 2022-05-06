/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanassistenza.dto.apisanassistenza;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.codehaus.jackson.annotate.JsonProperty;

public class ModelConfigurazione   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private Integer documentoDimensioneMassima = null;
  private Integer testoNumeroMassimoCaratteri = null;
  private List<String> documentoFormatiSupportati = new ArrayList<String>();

  /**
   * La dimensione massima del documento da aggiungere in allegato. Questa dimensione deve essere espressa in byte 
   **/
  

  @JsonProperty("documento_dimensione_massima") 
 
  public Integer getDocumentoDimensioneMassima() {
    return documentoDimensioneMassima;
  }
  public void setDocumentoDimensioneMassima(Integer documentoDimensioneMassima) {
    this.documentoDimensioneMassima = documentoDimensioneMassima;
  }

  /**
   * Il numero massimo di cartteri che il cittadino può inserire nel testo del mesaggio 
   **/
  

  @JsonProperty("testo_numero_massimo_caratteri") 
 
  public Integer getTestoNumeroMassimoCaratteri() {
    return testoNumeroMassimoCaratteri;
  }
  public void setTestoNumeroMassimoCaratteri(Integer testoNumeroMassimoCaratteri) {
    this.testoNumeroMassimoCaratteri = testoNumeroMassimoCaratteri;
  }

  /**
   **/
  

  @JsonProperty("documento_formati_supportati") 
 
  public List<String> getDocumentoFormatiSupportati() {
    return documentoFormatiSupportati;
  }
  public void setDocumentoFormatiSupportati(List<String> documentoFormatiSupportati) {
    this.documentoFormatiSupportati = documentoFormatiSupportati;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelConfigurazione modelConfigurazione = (ModelConfigurazione) o;
    return Objects.equals(documentoDimensioneMassima, modelConfigurazione.documentoDimensioneMassima) &&
        Objects.equals(testoNumeroMassimoCaratteri, modelConfigurazione.testoNumeroMassimoCaratteri) &&
        Objects.equals(documentoFormatiSupportati, modelConfigurazione.documentoFormatiSupportati);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentoDimensioneMassima, testoNumeroMassimoCaratteri, documentoFormatiSupportati);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelConfigurazione {\n");
    
    sb.append("    documentoDimensioneMassima: ").append(toIndentedString(documentoDimensioneMassima)).append("\n");
    sb.append("    testoNumeroMassimoCaratteri: ").append(toIndentedString(testoNumeroMassimoCaratteri)).append("\n");
    sb.append("    documentoFormatiSupportati: ").append(toIndentedString(documentoFormatiSupportati)).append("\n");
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

