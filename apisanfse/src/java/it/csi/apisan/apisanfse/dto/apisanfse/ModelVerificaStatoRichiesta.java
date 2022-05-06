/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelVerificaStatoRichiesta   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String idPacchetto = null;
  private String statoRichiesta = null;
  private Long dimensione = null;

  /**
   * id del pacchetto dell&#39;imagine da scaricare
   **/
  
  @ApiModelProperty(value = "id del pacchetto dell'imagine da scaricare")
  @JsonProperty("id_pacchetto") 
 
  public String getIdPacchetto() {
    return idPacchetto;
  }
  public void setIdPacchetto(String idPacchetto) {
    this.idPacchetto = idPacchetto;
  }

  /**
   * stato della richiesta
   **/
  
  @ApiModelProperty(value = "stato della richiesta")
  @JsonProperty("stato_richiesta") 
 
  public String getStatoRichiesta() {
    return statoRichiesta;
  }
  public void setStatoRichiesta(String statoRichiesta) {
    this.statoRichiesta = statoRichiesta;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dimensione") 
 
  public Long getDimensione() {
    return dimensione;
  }
  public void setDimensione(Long dimensione) {
    this.dimensione = dimensione;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelVerificaStatoRichiesta modelVerificaStatoRichiesta = (ModelVerificaStatoRichiesta) o;
    return Objects.equals(idPacchetto, modelVerificaStatoRichiesta.idPacchetto) &&
        Objects.equals(statoRichiesta, modelVerificaStatoRichiesta.statoRichiesta) &&
        Objects.equals(dimensione, modelVerificaStatoRichiesta.dimensione);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idPacchetto, statoRichiesta, dimensione);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelVerificaStatoRichiesta {\n");
    
    sb.append("    idPacchetto: ").append(toIndentedString(idPacchetto)).append("\n");
    sb.append("    statoRichiesta: ").append(toIndentedString(statoRichiesta)).append("\n");
    sb.append("    dimensione: ").append(toIndentedString(dimensione)).append("\n");
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

