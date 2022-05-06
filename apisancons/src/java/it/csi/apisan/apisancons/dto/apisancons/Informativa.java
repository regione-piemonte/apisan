/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancons.dto.apisancons;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisancons.dto.apisancons.SottoTipoConsenso;
import it.csi.apisan.apisancons.dto.apisancons.TipoConsenso;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class Informativa   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private Integer idInformativa = null;
  private TipoConsenso tipoConsenso = null;
  private SottoTipoConsenso sottoTipoConsenso = null;
  private String descInformativa = null;
  private Date dataDecorrenza = null;
  private Date dataScadenza = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id_informativa") 
 
  public Integer getIdInformativa() {
    return idInformativa;
  }
  public void setIdInformativa(Integer idInformativa) {
    this.idInformativa = idInformativa;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tipo_consenso") 
 
  public TipoConsenso getTipoConsenso() {
    return tipoConsenso;
  }
  public void setTipoConsenso(TipoConsenso tipoConsenso) {
    this.tipoConsenso = tipoConsenso;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sotto_tipo_consenso") 
 
  public SottoTipoConsenso getSottoTipoConsenso() {
    return sottoTipoConsenso;
  }
  public void setSottoTipoConsenso(SottoTipoConsenso sottoTipoConsenso) {
    this.sottoTipoConsenso = sottoTipoConsenso;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("desc_informativa") 
 
  public String getDescInformativa() {
    return descInformativa;
  }
  public void setDescInformativa(String descInformativa) {
    this.descInformativa = descInformativa;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_decorrenza") 
 
  public Date getDataDecorrenza() {
    return dataDecorrenza;
  }
  public void setDataDecorrenza(Date dataDecorrenza) {
    this.dataDecorrenza = dataDecorrenza;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_scadenza") 
 
  public Date getDataScadenza() {
    return dataScadenza;
  }
  public void setDataScadenza(Date dataScadenza) {
    this.dataScadenza = dataScadenza;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Informativa informativa = (Informativa) o;
    return Objects.equals(idInformativa, informativa.idInformativa) &&
        Objects.equals(tipoConsenso, informativa.tipoConsenso) &&
        Objects.equals(sottoTipoConsenso, informativa.sottoTipoConsenso) &&
        Objects.equals(descInformativa, informativa.descInformativa) &&
        Objects.equals(dataDecorrenza, informativa.dataDecorrenza) &&
        Objects.equals(dataScadenza, informativa.dataScadenza);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idInformativa, tipoConsenso, sottoTipoConsenso, descInformativa, dataDecorrenza, dataScadenza);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Informativa {\n");
    
    sb.append("    idInformativa: ").append(toIndentedString(idInformativa)).append("\n");
    sb.append("    tipoConsenso: ").append(toIndentedString(tipoConsenso)).append("\n");
    sb.append("    sottoTipoConsenso: ").append(toIndentedString(sottoTipoConsenso)).append("\n");
    sb.append("    descInformativa: ").append(toIndentedString(descInformativa)).append("\n");
    sb.append("    dataDecorrenza: ").append(toIndentedString(dataDecorrenza)).append("\n");
    sb.append("    dataScadenza: ").append(toIndentedString(dataScadenza)).append("\n");
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

