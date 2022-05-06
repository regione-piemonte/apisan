/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.dto.apisanpag;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanpag.dto.apisanpag.Importo;
import it.csi.apisan.apisanpag.dto.apisanpag.Prenotazione;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class Pratica   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private Importo importoPratica = null;
  private String prestazioneErogata = null;
  private String codiceVersamento = null;
  private Prenotazione prenotazione = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("importo_pratica") 
 
  public Importo getImportoPratica() {
    return importoPratica;
  }
  public void setImportoPratica(Importo importoPratica) {
    this.importoPratica = importoPratica;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("prestazione_erogata") 
 
  public String getPrestazioneErogata() {
    return prestazioneErogata;
  }
  public void setPrestazioneErogata(String prestazioneErogata) {
    this.prestazioneErogata = prestazioneErogata;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("codice_versamento") 
 
  public String getCodiceVersamento() {
    return codiceVersamento;
  }
  public void setCodiceVersamento(String codiceVersamento) {
    this.codiceVersamento = codiceVersamento;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("prenotazione") 
 
  public Prenotazione getPrenotazione() {
    return prenotazione;
  }
  public void setPrenotazione(Prenotazione prenotazione) {
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
    Pratica pratica = (Pratica) o;
    return Objects.equals(importoPratica, pratica.importoPratica) &&
        Objects.equals(prestazioneErogata, pratica.prestazioneErogata) &&
        Objects.equals(codiceVersamento, pratica.codiceVersamento) &&
        Objects.equals(prenotazione, pratica.prenotazione);
  }

  @Override
  public int hashCode() {
    return Objects.hash(importoPratica, prestazioneErogata, codiceVersamento, prenotazione);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pratica {\n");
    
    sb.append("    importoPratica: ").append(toIndentedString(importoPratica)).append("\n");
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

