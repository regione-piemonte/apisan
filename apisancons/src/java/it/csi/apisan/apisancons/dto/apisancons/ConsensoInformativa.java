/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancons.dto.apisancons;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisancons.dto.apisancons.Consenso;
import it.csi.apisan.apisancons.dto.apisancons.Informativa;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ConsensoInformativa   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private Informativa informativa = null;
  private List<Consenso> consensi = new ArrayList<Consenso>();
  private List<StatoNotificaDipartimentale> statoNotificheDipartimentali = new ArrayList<StatoNotificaDipartimentale>();

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("informativa") 
 
  public Informativa getInformativa() {
    return informativa;
  }
  public void setInformativa(Informativa informativa) {
    this.informativa = informativa;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("consensi") 
 
  public List<Consenso> getConsensi() {
    return consensi;
  }
  public void setConsensi(List<Consenso> consensi) {
    this.consensi = consensi;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("stato_notifiche_dipartimentali") 
  public List<StatoNotificaDipartimentale> getStatoNotificheDipartimentali() {
	return statoNotificheDipartimentali;
  }
  public void setStatoNotificheDipartimentali(List<StatoNotificaDipartimentale> statoNotificheDipartimentali) {
	this.statoNotificheDipartimentali = statoNotificheDipartimentali;
  }
  
  
@Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsensoInformativa consensoInformativa = (ConsensoInformativa) o;
    return Objects.equals(informativa, consensoInformativa.informativa) &&
        Objects.equals(consensi, consensoInformativa.consensi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(informativa, consensi);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsensoInformativa {\n");
    
    sb.append("    informativa: ").append(toIndentedString(informativa)).append("\n");
    sb.append("    consensi: ").append(toIndentedString(consensi)).append("\n");
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

