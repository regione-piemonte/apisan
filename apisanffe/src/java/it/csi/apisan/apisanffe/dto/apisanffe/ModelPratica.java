/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanffe.dto.apisanffe;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import it.csi.apisan.apisanffe.dto.apisanffe.ModelPrenotazione;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;

public class ModelPratica   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String importoPratica = null;
  private String importoMarcaBollo = null;
  private String importoIva = null;
  private Integer percentualeIva = null;
  private String prestazioneErogata = null;
  private String codiceVersamento = null;
  private ModelPrenotazione prenotazione = null;

  /**
   * L&#39;importo della pratica
   **/
  

  @JsonProperty("importo_pratica") 
 
  public String getImportoPratica() {
    return importoPratica;
  }
  public void setImportoPratica(String importoPratica) {
    this.importoPratica = importoPratica;
  }

  /**
   * L&#39;importo della marca da bollo
   **/
  

  @JsonProperty("importo_marca_bollo") 
 
  public String getImportoMarcaBollo() {
    return importoMarcaBollo;
  }
  public void setImportoMarcaBollo(String importoMarcaBollo) {
    this.importoMarcaBollo = importoMarcaBollo;
  }

  /**
   * L&#39;importo dell&#39;IVA
   **/
  

  @JsonProperty("importo_iva") 
 
  public String getImportoIva() {
    return importoIva;
  }
  public void setImportoIva(String importoIva) {
    this.importoIva = importoIva;
  }

  /**
   * La percentuale dell&#39;IVA applicata
   **/
  

  @JsonProperty("percentuale_iva") 
 
  public Integer getPercentualeIva() {
    return percentualeIva;
  }
  public void setPercentualeIva(Integer percentualeIva) {
    this.percentualeIva = percentualeIva;
  }

  /**
   **/
  

  @JsonProperty("prestazione_erogata") 
 
  public String getPrestazioneErogata() {
    return prestazioneErogata;
  }
  public void setPrestazioneErogata(String prestazioneErogata) {
    this.prestazioneErogata = prestazioneErogata;
  }

  /**
   * Il codice del versamento
   **/
  

  @JsonProperty("codice_versamento") 
 
  public String getCodiceVersamento() {
    return codiceVersamento;
  }
  public void setCodiceVersamento(String codiceVersamento) {
    this.codiceVersamento = codiceVersamento;
  }

  /**
   **/
  

  @JsonProperty("prenotazione") 
 
  @NotNull
  public ModelPrenotazione getPrenotazione() {
    return prenotazione;
  }
  public void setPrenotazione(ModelPrenotazione prenotazione) {
    this.prenotazione = prenotazione;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelPratica modelPratica = (ModelPratica) o;
    return Objects.equals(importoPratica, modelPratica.importoPratica) &&
        Objects.equals(importoMarcaBollo, modelPratica.importoMarcaBollo) &&
        Objects.equals(importoIva, modelPratica.importoIva) &&
        Objects.equals(percentualeIva, modelPratica.percentualeIva) &&
        Objects.equals(prestazioneErogata, modelPratica.prestazioneErogata) &&
        Objects.equals(codiceVersamento, modelPratica.codiceVersamento) &&
        Objects.equals(prenotazione, modelPratica.prenotazione);
  }

  @Override
  public int hashCode() {
    return Objects.hash(importoPratica, importoMarcaBollo, importoIva, percentualeIva, prestazioneErogata, codiceVersamento, prenotazione);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelPratica {\n");
    
    sb.append("    importoPratica: ").append(toIndentedString(importoPratica)).append("\n");
    sb.append("    importoMarcaBollo: ").append(toIndentedString(importoMarcaBollo)).append("\n");
    sb.append("    importoIva: ").append(toIndentedString(importoIva)).append("\n");
    sb.append("    percentualeIva: ").append(toIndentedString(percentualeIva)).append("\n");
    sb.append("    prestazioneErogata: ").append(toIndentedString(prestazioneErogata)).append("\n");
    sb.append("    codiceVersamento: ").append(toIndentedString(codiceVersamento)).append("\n");
    sb.append("    prenotazione: ").append(toIndentedString(prenotazione)).append("\n");
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

