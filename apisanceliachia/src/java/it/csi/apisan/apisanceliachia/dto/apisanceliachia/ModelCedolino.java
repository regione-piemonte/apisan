/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanceliachia.dto.apisanceliachia;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import it.csi.apisan.apisanceliachia.dto.apisanceliachia.ModelAutorizzazione;
import java.math.BigDecimal;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;

public class ModelCedolino   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private BigDecimal importoTotale = null;
  private BigDecimal importoDisponibile = null;
  private Date dataInizio = null;
  private Date dataFine = null;
  private ModelAutorizzazione autorizzazione = null;

  /**
   * Il valore del cedolino
   **/
  

  @JsonProperty("importo_totale") 
 
  public BigDecimal getImportoTotale() {
    return importoTotale;
  }
  public void setImportoTotale(BigDecimal importoTotale) {
    this.importoTotale = importoTotale;
  }

  /**
   * L&#39;importo ancora disponibile sul cedolino
   **/
  

  @JsonProperty("importo_disponibile") 
 
  public BigDecimal getImportoDisponibile() {
    return importoDisponibile;
  }
  public void setImportoDisponibile(BigDecimal importoDisponibile) {
    this.importoDisponibile = importoDisponibile;
  }

  /**
   * La data di inizio del cedolino
   **/
  

  @JsonProperty("data_inizio") 
 
  public Date getDataInizio() {
    return dataInizio;
  }
  public void setDataInizio(Date dataInizio) {
    this.dataInizio = dataInizio;
  }

  /**
   * La data di inizio del cedolino
   **/
  

  @JsonProperty("data_fine") 
 
  public Date getDataFine() {
    return dataFine;
  }
  public void setDataFine(Date dataFine) {
    this.dataFine = dataFine;
  }

  /**
   **/
  

  @JsonProperty("autorizzazione") 
 
  public ModelAutorizzazione getAutorizzazione() {
    return autorizzazione;
  }
  public void setAutorizzazione(ModelAutorizzazione autorizzazione) {
    this.autorizzazione = autorizzazione;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelCedolino modelCedolino = (ModelCedolino) o;
    return Objects.equals(importoTotale, modelCedolino.importoTotale) &&
        Objects.equals(importoDisponibile, modelCedolino.importoDisponibile) &&
        Objects.equals(dataInizio, modelCedolino.dataInizio) &&
        Objects.equals(dataFine, modelCedolino.dataFine) &&
        Objects.equals(autorizzazione, modelCedolino.autorizzazione);
  }

  @Override
  public int hashCode() {
    return Objects.hash(importoTotale, importoDisponibile, dataInizio, dataFine, autorizzazione);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelCedolino {\n");
    
    sb.append("    importoTotale: ").append(toIndentedString(importoTotale)).append("\n");
    sb.append("    importoDisponibile: ").append(toIndentedString(importoDisponibile)).append("\n");
    sb.append("    dataInizio: ").append(toIndentedString(dataInizio)).append("\n");
    sb.append("    dataFine: ").append(toIndentedString(dataFine)).append("\n");
    sb.append("    autorizzazione: ").append(toIndentedString(autorizzazione)).append("\n");
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

