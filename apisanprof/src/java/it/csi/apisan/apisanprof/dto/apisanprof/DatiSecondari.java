/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanprof.dto.apisanprof;

import java.util.Objects;
import java.util.ArrayList;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class DatiSecondari   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String cap = null;
  private String codComune = null;
  private String codStato = null;
  private String descComune = null;
  private String descStato = null;
  private String indirizzo = null;
  private String numCivico = null;
  private String statoResidenza = null;
  private String telefono = null;
  private Date dataInizio = null;
  private Date dataFine = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cap") 
 
  public String getCap() {
    return cap;
  }
  public void setCap(String cap) {
    this.cap = cap;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cod_comune") 
 
  public String getCodComune() {
    return codComune;
  }
  public void setCodComune(String codComune) {
    this.codComune = codComune;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cod_stato") 
 
  public String getCodStato() {
    return codStato;
  }
  public void setCodStato(String codStato) {
    this.codStato = codStato;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("desc_comune") 
 
  public String getDescComune() {
    return descComune;
  }
  public void setDescComune(String descComune) {
    this.descComune = descComune;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("desc_stato") 
 
  public String getDescStato() {
    return descStato;
  }
  public void setDescStato(String descStato) {
    this.descStato = descStato;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("indirizzo") 
 
  public String getIndirizzo() {
    return indirizzo;
  }
  public void setIndirizzo(String indirizzo) {
    this.indirizzo = indirizzo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("num_civico") 
 
  public String getNumCivico() {
    return numCivico;
  }
  public void setNumCivico(String numCivico) {
    this.numCivico = numCivico;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("stato_residenza") 
 
  public String getStatoResidenza() {
    return statoResidenza;
  }
  public void setStatoResidenza(String statoResidenza) {
    this.statoResidenza = statoResidenza;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("telefono") 
 
  public String getTelefono() {
    return telefono;
  }
  public void setTelefono(String telefono) {
    this.telefono = telefono;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatiSecondari datiSecondari = (DatiSecondari) o;
    return Objects.equals(cap, datiSecondari.cap) &&
        Objects.equals(codComune, datiSecondari.codComune) &&
        Objects.equals(codStato, datiSecondari.codStato) &&
        Objects.equals(descComune, datiSecondari.descComune) &&
        Objects.equals(descStato, datiSecondari.descStato) &&
        Objects.equals(indirizzo, datiSecondari.indirizzo) &&
        Objects.equals(numCivico, datiSecondari.numCivico) &&
        Objects.equals(statoResidenza, datiSecondari.statoResidenza) &&
        Objects.equals(telefono, datiSecondari.telefono) &&
        Objects.equals(dataInizio, datiSecondari.dataInizio) &&
        Objects.equals(dataFine, datiSecondari.dataFine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cap, codComune, codStato, descComune, descStato, indirizzo, numCivico, statoResidenza, telefono, dataInizio, dataFine);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatiSecondari {\n");
    
    sb.append("    cap: ").append(toIndentedString(cap)).append("\n");
    sb.append("    codComune: ").append(toIndentedString(codComune)).append("\n");
    sb.append("    codStato: ").append(toIndentedString(codStato)).append("\n");
    sb.append("    descComune: ").append(toIndentedString(descComune)).append("\n");
    sb.append("    descStato: ").append(toIndentedString(descStato)).append("\n");
    sb.append("    indirizzo: ").append(toIndentedString(indirizzo)).append("\n");
    sb.append("    numCivico: ").append(toIndentedString(numCivico)).append("\n");
    sb.append("    statoResidenza: ").append(toIndentedString(statoResidenza)).append("\n");
    sb.append("    telefono: ").append(toIndentedString(telefono)).append("\n");
    sb.append("    dataInizio: ").append(toIndentedString(dataInizio)).append("\n");
    sb.append("    dataFine: ").append(toIndentedString(dataFine)).append("\n");
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

