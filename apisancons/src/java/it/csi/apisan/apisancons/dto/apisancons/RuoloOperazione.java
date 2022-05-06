/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancons.dto.apisancons;

import java.util.Objects;
import java.util.ArrayList;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class RuoloOperazione   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private Date dataCreazione = null;
  private Date dataModifica = null;
  private Date dataCancellazione = null;
  private String loginOperazione = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_creazione") 
 
  public Date getDataCreazione() {
    return dataCreazione;
  }
  public void setDataCreazione(Date dataCreazione) {
    this.dataCreazione = dataCreazione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_modifica") 
 
  public Date getDataModifica() {
    return dataModifica;
  }
  public void setDataModifica(Date dataModifica) {
    this.dataModifica = dataModifica;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_cancellazione") 
 
  public Date getDataCancellazione() {
    return dataCancellazione;
  }
  public void setDataCancellazione(Date dataCancellazione) {
    this.dataCancellazione = dataCancellazione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("login_operazione") 
 
  public String getLoginOperazione() {
    return loginOperazione;
  }
  public void setLoginOperazione(String loginOperazione) {
    this.loginOperazione = loginOperazione;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuoloOperazione ruoloOperazione = (RuoloOperazione) o;
    return Objects.equals(dataCreazione, ruoloOperazione.dataCreazione) &&
        Objects.equals(dataModifica, ruoloOperazione.dataModifica) &&
        Objects.equals(dataCancellazione, ruoloOperazione.dataCancellazione) &&
        Objects.equals(loginOperazione, ruoloOperazione.loginOperazione);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataCreazione, dataModifica, dataCancellazione, loginOperazione);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuoloOperazione {\n");
    
    sb.append("    dataCreazione: ").append(toIndentedString(dataCreazione)).append("\n");
    sb.append("    dataModifica: ").append(toIndentedString(dataModifica)).append("\n");
    sb.append("    dataCancellazione: ").append(toIndentedString(dataCancellazione)).append("\n");
    sb.append("    loginOperazione: ").append(toIndentedString(loginOperazione)).append("\n");
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

