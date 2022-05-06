/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancross.dto.apisancross;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisancross.dto.apisancross.BooleanCrit;
import it.csi.apisan.apisancross.dto.apisancross.StringCrit;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ServizioFilter   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private StringCrit codiceServizio = null;
  private BooleanCrit notificabile = null;
  private BooleanCrit delegabile = null;
  private BooleanCrit arruolabile = null;
  private BooleanCrit obbligatorioArruolamento = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("codice_servizio") 
 
  public StringCrit getCodiceServizio() {
    return codiceServizio;
  }
  public void setCodiceServizio(StringCrit codiceServizio) {
    this.codiceServizio = codiceServizio;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("notificabile") 
 
  public BooleanCrit getNotificabile() {
    return notificabile;
  }
  public void setNotificabile(BooleanCrit notificabile) {
    this.notificabile = notificabile;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("delegabile") 
 
  public BooleanCrit getDelegabile() {
    return delegabile;
  }
  public void setDelegabile(BooleanCrit delegabile) {
    this.delegabile = delegabile;
  }

  /**
   * true/false a seconda se bisogna o meno chiamare il servizio arruolamento
   **/
  
  @ApiModelProperty(value = "true/false a seconda se bisogna o meno chiamare il servizio arruolamento")
  @JsonProperty("arruolabile") 
 
  public BooleanCrit getArruolabile() {
    return arruolabile;
  }
  public void setArruolabile(BooleanCrit arruolabile) {
    this.arruolabile = arruolabile;
  }

  /**
   * indica se per tale servizio sia obbligatorio o meno dare il consenso all&#39;arruolamento       
   **/
  
  @ApiModelProperty(value = "indica se per tale servizio sia obbligatorio o meno dare il consenso all'arruolamento       ")
  @JsonProperty("obbligatorio_arruolamento") 
 
  public BooleanCrit getObbligatorioArruolamento() {
    return obbligatorioArruolamento;
  }
  public void setObbligatorioArruolamento(BooleanCrit obbligatorioArruolamento) {
    this.obbligatorioArruolamento = obbligatorioArruolamento;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServizioFilter servizioFilter = (ServizioFilter) o;
    return Objects.equals(codiceServizio, servizioFilter.codiceServizio) &&
        Objects.equals(notificabile, servizioFilter.notificabile) &&
        Objects.equals(delegabile, servizioFilter.delegabile) &&
        Objects.equals(arruolabile, servizioFilter.arruolabile) &&
        Objects.equals(obbligatorioArruolamento, servizioFilter.obbligatorioArruolamento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codiceServizio, notificabile, delegabile, arruolabile, obbligatorioArruolamento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServizioFilter {\n");
    
    sb.append("    codiceServizio: ").append(toIndentedString(codiceServizio)).append("\n");
    sb.append("    notificabile: ").append(toIndentedString(notificabile)).append("\n");
    sb.append("    delegabile: ").append(toIndentedString(delegabile)).append("\n");
    sb.append("    arruolabile: ").append(toIndentedString(arruolabile)).append("\n");
    sb.append("    obbligatorioArruolamento: ").append(toIndentedString(obbligatorioArruolamento)).append("\n");
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

