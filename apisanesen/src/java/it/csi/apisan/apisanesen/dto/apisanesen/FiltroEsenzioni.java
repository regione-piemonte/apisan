/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesen.dto.apisanesen;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanesen.dto.apisanesen.DateCrit;
import it.csi.apisan.apisanesen.dto.apisanesen.StringCrit;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class FiltroEsenzioni   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private StringCrit stato = null;
  private StringCrit codiceEsenzione = null;
  private StringCrit rapportoFamiliare = null;
  private DateCrit dataRichiesta = null;
  private DateCrit dataInizioValidita = null;
  private DateCrit dataScadenza = null;
  private DateCrit dataRevoca = null;
  private StringCrit creatoDa = null;
  private StringCrit creatoPer = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("stato") 
 
  public StringCrit getStato() {
    return stato;
  }
  public void setStato(StringCrit stato) {
    this.stato = stato;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("codice_esenzione") 
 
  public StringCrit getCodiceEsenzione() {
    return codiceEsenzione;
  }
  public void setCodiceEsenzione(StringCrit codiceEsenzione) {
    this.codiceEsenzione = codiceEsenzione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("rapporto_familiare") 
 
  public StringCrit getRapportoFamiliare() {
    return rapportoFamiliare;
  }
  public void setRapportoFamiliare(StringCrit rapportoFamiliare) {
    this.rapportoFamiliare = rapportoFamiliare;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_richiesta") 
 
  public DateCrit getDataRichiesta() {
    return dataRichiesta;
  }
  public void setDataRichiesta(DateCrit dataRichiesta) {
    this.dataRichiesta = dataRichiesta;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_inizio_validita") 
 
  public DateCrit getDataInizioValidita() {
    return dataInizioValidita;
  }
  public void setDataInizioValidita(DateCrit dataInizioValidita) {
    this.dataInizioValidita = dataInizioValidita;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_scadenza") 
 
  public DateCrit getDataScadenza() {
    return dataScadenza;
  }
  public void setDataScadenza(DateCrit dataScadenza) {
    this.dataScadenza = dataScadenza;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_revoca") 
 
  public DateCrit getDataRevoca() {
    return dataRevoca;
  }
  public void setDataRevoca(DateCrit dataRevoca) {
    this.dataRevoca = dataRevoca;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("creato_da") 
 
  public StringCrit getCreatoDa() {
    return creatoDa;
  }
  public void setCreatoDa(StringCrit creatoDa) {
    this.creatoDa = creatoDa;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("creato_per") 
 
  public StringCrit getCreatoPer() {
    return creatoPer;
  }
  public void setCreatoPer(StringCrit creatoPer) {
    this.creatoPer = creatoPer;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FiltroEsenzioni filtroEsenzioni = (FiltroEsenzioni) o;
    return Objects.equals(stato, filtroEsenzioni.stato) &&
        Objects.equals(codiceEsenzione, filtroEsenzioni.codiceEsenzione) &&
        Objects.equals(rapportoFamiliare, filtroEsenzioni.rapportoFamiliare) &&
        Objects.equals(dataRichiesta, filtroEsenzioni.dataRichiesta) &&
        Objects.equals(dataInizioValidita, filtroEsenzioni.dataInizioValidita) &&
        Objects.equals(dataScadenza, filtroEsenzioni.dataScadenza) &&
        Objects.equals(dataRevoca, filtroEsenzioni.dataRevoca) &&
        Objects.equals(creatoDa, filtroEsenzioni.creatoDa) &&
        Objects.equals(creatoPer, filtroEsenzioni.creatoPer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stato, codiceEsenzione, rapportoFamiliare, dataRichiesta, dataInizioValidita, dataScadenza, dataRevoca, creatoDa, creatoPer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FiltroEsenzioni {\n");
    
    sb.append("    stato: ").append(toIndentedString(stato)).append("\n");
    sb.append("    codiceEsenzione: ").append(toIndentedString(codiceEsenzione)).append("\n");
    sb.append("    rapportoFamiliare: ").append(toIndentedString(rapportoFamiliare)).append("\n");
    sb.append("    dataRichiesta: ").append(toIndentedString(dataRichiesta)).append("\n");
    sb.append("    dataInizioValidita: ").append(toIndentedString(dataInizioValidita)).append("\n");
    sb.append("    dataScadenza: ").append(toIndentedString(dataScadenza)).append("\n");
    sb.append("    dataRevoca: ").append(toIndentedString(dataRevoca)).append("\n");
    sb.append("    creatoDa: ").append(toIndentedString(creatoDa)).append("\n");
    sb.append("    creatoPer: ").append(toIndentedString(creatoPer)).append("\n");
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

