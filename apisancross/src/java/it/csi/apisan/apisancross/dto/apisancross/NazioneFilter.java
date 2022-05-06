/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancross.dto.apisancross;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisancross.dto.apisancross.DateCrit;
import it.csi.apisan.apisancross.dto.apisancross.StringCrit;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class NazioneFilter   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private StringCrit desc = null;
  private StringCrit codiceIstat = null;
  private StringCrit territorio = null;
  private DateCrit dataValidita = null;

  /**
   * descrizione della nazione (in si o eq)
   **/
  
  @ApiModelProperty(value = "descrizione della nazione (in si o eq)")
  @JsonProperty("desc") 
 
  public StringCrit getDesc() {
    return desc;
  }
  public void setDesc(StringCrit desc) {
    this.desc = desc;
  }

  /**
   * codice istat della nazione
   **/
  
  @ApiModelProperty(value = "codice istat della nazione")
  @JsonProperty("codice_istat") 
 
  public StringCrit getCodiceIstat() {
    return codiceIstat;
  }
  public void setCodiceIstat(StringCrit codiceIstat) {
    this.codiceIstat = codiceIstat;
  }

  /**
   * descrizione del territorio della nazione (in si o eq)
   **/
  
  @ApiModelProperty(value = "descrizione del territorio della nazione (in si o eq)")
  @JsonProperty("territorio") 
 
  public StringCrit getTerritorio() {
    return territorio;
  }
  public void setTerritorio(StringCrit territorio) {
    this.territorio = territorio;
  }

  /**
   * data di validita del comune compresa tra  data_inizio_validita e data_fine_validita
   **/
  
  @ApiModelProperty(value = "data di validita del comune compresa tra  data_inizio_validita e data_fine_validita")
  @JsonProperty("data_validita") 
 
  public DateCrit getDataValidita() {
    return dataValidita;
  }
  public void setDataValidita(DateCrit dataValidita) {
    this.dataValidita = dataValidita;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NazioneFilter nazioneFilter = (NazioneFilter) o;
    return Objects.equals(desc, nazioneFilter.desc) &&
        Objects.equals(codiceIstat, nazioneFilter.codiceIstat) &&
        Objects.equals(territorio, nazioneFilter.territorio) &&
        Objects.equals(dataValidita, nazioneFilter.dataValidita);
  }

  @Override
  public int hashCode() {
    return Objects.hash(desc, codiceIstat, territorio, dataValidita);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NazioneFilter {\n");
    
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    codiceIstat: ").append(toIndentedString(codiceIstat)).append("\n");
    sb.append("    territorio: ").append(toIndentedString(territorio)).append("\n");
    sb.append("    dataValidita: ").append(toIndentedString(dataValidita)).append("\n");
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

