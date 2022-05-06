/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancross.dto.apisancross;

import java.util.Objects;
import java.util.ArrayList;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class Nazione   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String codiceIstat = null;
  private String desc = null;
  private String territorio = null;
  private Date dataInizioValidita = null;
  private Date dataFineValidita = null;
  private String continente = null;

  /**
   * codice istat della nazione
   **/
  
  @ApiModelProperty(value = "codice istat della nazione")
  @JsonProperty("codice_istat") 
 
  public String getCodiceIstat() {
    return codiceIstat;
  }
  public void setCodiceIstat(String codiceIstat) {
    this.codiceIstat = codiceIstat;
  }

  /**
   * nome della nazione
   **/
  
  @ApiModelProperty(value = "nome della nazione")
  @JsonProperty("desc") 
 
  public String getDesc() {
    return desc;
  }
  public void setDesc(String desc) {
    this.desc = desc;
  }

  /**
   * descrizione territorio
   **/
  
  @ApiModelProperty(value = "descrizione territorio")
  @JsonProperty("territorio") 
 
  public String getTerritorio() {
    return territorio;
  }
  public void setTerritorio(String territorio) {
    this.territorio = territorio;
  }

  /**
   * data inizio validita
   **/
  
  @ApiModelProperty(value = "data inizio validita")
  @JsonProperty("data_inizio_validita") 
 
  public Date getDataInizioValidita() {
    return dataInizioValidita;
  }
  public void setDataInizioValidita(Date dataInizioValidita) {
    this.dataInizioValidita = dataInizioValidita;
  }

  /**
   * data fine validita
   **/
  
  @ApiModelProperty(value = "data fine validita")
  @JsonProperty("data_fine_validita") 
 
  public Date getDataFineValidita() {
    return dataFineValidita;
  }
  public void setDataFineValidita(Date dataFineValidita) {
    this.dataFineValidita = dataFineValidita;
  }

  /**
   * descrizione del continente
   **/
  
  @ApiModelProperty(value = "descrizione del continente")
  @JsonProperty("continente") 
 
  public String getContinente() {
    return continente;
  }
  public void setContinente(String continente) {
    this.continente = continente;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Nazione nazione = (Nazione) o;
    return Objects.equals(codiceIstat, nazione.codiceIstat) &&
        Objects.equals(desc, nazione.desc) &&
        Objects.equals(territorio, nazione.territorio) &&
        Objects.equals(dataInizioValidita, nazione.dataInizioValidita) &&
        Objects.equals(dataFineValidita, nazione.dataFineValidita) &&
        Objects.equals(continente, nazione.continente);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codiceIstat, desc, territorio, dataInizioValidita, dataFineValidita, continente);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Nazione {\n");
    
    sb.append("    codiceIstat: ").append(toIndentedString(codiceIstat)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    territorio: ").append(toIndentedString(territorio)).append("\n");
    sb.append("    dataInizioValidita: ").append(toIndentedString(dataInizioValidita)).append("\n");
    sb.append("    dataFineValidita: ").append(toIndentedString(dataFineValidita)).append("\n");
    sb.append("    continente: ").append(toIndentedString(continente)).append("\n");
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

