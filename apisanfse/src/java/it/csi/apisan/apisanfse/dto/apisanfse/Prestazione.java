/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanfse.dto.apisanfse.Branca;
import it.csi.apisan.apisanfse.dto.apisanfse.ValoriPrestazione;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class Prestazione   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String codice = null;
  private String descrizione = null;
  private String riferimento = null;
  private Branca branca = null;
  private Date dataOra = null;
  private Long idPrestazione = null;
  private ValoriPrestazione valoriPrestazione = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("codice") 
 
  public String getCodice() {
    return codice;
  }
  public void setCodice(String codice) {
    this.codice = codice;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("descrizione") 
 
  public String getDescrizione() {
    return descrizione;
  }
  public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("riferimento") 
 
  public String getRiferimento() {
    return riferimento;
  }
  public void setRiferimento(String riferimento) {
    this.riferimento = riferimento;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("branca") 
 
  public Branca getBranca() {
    return branca;
  }
  public void setBranca(Branca branca) {
    this.branca = branca;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_ora") 
 
  public Date getDataOra() {
    return dataOra;
  }
  public void setDataOra(Date dataOra) {
    this.dataOra = dataOra;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id_prestazione") 
 
  public Long getIdPrestazione() {
    return idPrestazione;
  }
  public void setIdPrestazione(Long idPrestazione) {
    this.idPrestazione = idPrestazione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("valori_prestazione") 
 
  public ValoriPrestazione getValoriPrestazione() {
    return valoriPrestazione;
  }
  public void setValoriPrestazione(ValoriPrestazione valoriPrestazione) {
    this.valoriPrestazione = valoriPrestazione;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Prestazione prestazione = (Prestazione) o;
    return Objects.equals(codice, prestazione.codice) &&
        Objects.equals(descrizione, prestazione.descrizione) &&
        Objects.equals(riferimento, prestazione.riferimento) &&
        Objects.equals(branca, prestazione.branca) &&
        Objects.equals(dataOra, prestazione.dataOra) &&
        Objects.equals(idPrestazione, prestazione.idPrestazione) &&
        Objects.equals(valoriPrestazione, prestazione.valoriPrestazione);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codice, descrizione, riferimento, branca, dataOra, idPrestazione, valoriPrestazione);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Prestazione {\n");
    
    sb.append("    codice: ").append(toIndentedString(codice)).append("\n");
    sb.append("    descrizione: ").append(toIndentedString(descrizione)).append("\n");
    sb.append("    riferimento: ").append(toIndentedString(riferimento)).append("\n");
    sb.append("    branca: ").append(toIndentedString(branca)).append("\n");
    sb.append("    dataOra: ").append(toIndentedString(dataOra)).append("\n");
    sb.append("    idPrestazione: ").append(toIndentedString(idPrestazione)).append("\n");
    sb.append("    valoriPrestazione: ").append(toIndentedString(valoriPrestazione)).append("\n");
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

