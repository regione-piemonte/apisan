/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanaut.dto.apisanaut;

import java.util.Objects;
import java.util.ArrayList;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class DelegaServizio   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String uuid = null;
  private String codiceServizio = null;
  private Date dataInizioDelega = null;
  private Date dataFineDelega = null;
  private Date dataRevocaDelega = null;
  private Date dataRinunciaDelega = null;
  private String statoDelega = null;
  private String tipoDelega = null;
  private String gradoDelega = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("uuid") 
 
  public String getUuid() {
    return uuid;
  }
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("codice_servizio") 
 
  public String getCodiceServizio() {
    return codiceServizio;
  }
  public void setCodiceServizio(String codiceServizio) {
    this.codiceServizio = codiceServizio;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_inizio_delega") 
 
  public Date getDataInizioDelega() {
    return dataInizioDelega;
  }
  public void setDataInizioDelega(Date dataInizioDelega) {
    this.dataInizioDelega = dataInizioDelega;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_fine_delega") 
 
  public Date getDataFineDelega() {
    return dataFineDelega;
  }
  public void setDataFineDelega(Date dataFineDelega) {
    this.dataFineDelega = dataFineDelega;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_revoca_delega") 
 
  public Date getDataRevocaDelega() {
    return dataRevocaDelega;
  }
  public void setDataRevocaDelega(Date dataRevocaDelega) {
    this.dataRevocaDelega = dataRevocaDelega;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_rinuncia_delega") 
 
  public Date getDataRinunciaDelega() {
    return dataRinunciaDelega;
  }
  public void setDataRinunciaDelega(Date dataRinunciaDelega) {
    this.dataRinunciaDelega = dataRinunciaDelega;
  }

  /**
   * i possibili valori dello stato delega modificabili sono  ATTIVA, REVOCATA, RIFIUTATA. Altri valori restituibili dalla business ma non modificabili sono IN SCADENZA e SCADUTA.
   **/
  
  @ApiModelProperty(value = "i possibili valori dello stato delega modificabili sono  ATTIVA, REVOCATA, RIFIUTATA. Altri valori restituibili dalla business ma non modificabili sono IN SCADENZA e SCADUTA.")
  @JsonProperty("stato_delega") 
 
  public String getStatoDelega() {
    return statoDelega;
  }
  public void setStatoDelega(String statoDelega) {
    this.statoDelega = statoDelega;
  }

  /**
   * tipologia della delega POSSIBILI VALORI ADULTO, GENITOREMONO, CONGIUNTA, TUTELA_MAG18, AMMSOSTEGNO
   **/
  
  @ApiModelProperty(example = "ADULTO", value = "tipologia della delega POSSIBILI VALORI ADULTO, GENITOREMONO, CONGIUNTA, TUTELA_MAG18, AMMSOSTEGNO")
  @JsonProperty("tipo_delega") 
 
  public String getTipoDelega() {
    return tipoDelega;
  }
  public void setTipoDelega(String tipoDelega) {
    this.tipoDelega = tipoDelega;
  }

  /**
   * grado della delega possibili valori FORTE, DEBOLE
   **/
  
  @ApiModelProperty(example = "FORTE", value = "grado della delega possibili valori FORTE, DEBOLE")
  @JsonProperty("grado_delega") 
 
  public String getGradoDelega() {
    return gradoDelega;
  }
  public void setGradoDelega(String gradoDelega) {
    this.gradoDelega = gradoDelega;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DelegaServizio delegaServizio = (DelegaServizio) o;
    return Objects.equals(uuid, delegaServizio.uuid) &&
        Objects.equals(codiceServizio, delegaServizio.codiceServizio) &&
        Objects.equals(dataInizioDelega, delegaServizio.dataInizioDelega) &&
        Objects.equals(dataFineDelega, delegaServizio.dataFineDelega) &&
        Objects.equals(dataRevocaDelega, delegaServizio.dataRevocaDelega) &&
        Objects.equals(dataRinunciaDelega, delegaServizio.dataRinunciaDelega) &&
        Objects.equals(statoDelega, delegaServizio.statoDelega) &&
        Objects.equals(tipoDelega, delegaServizio.tipoDelega) &&
        Objects.equals(gradoDelega, delegaServizio.gradoDelega);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, codiceServizio, dataInizioDelega, dataFineDelega, dataRevocaDelega, dataRinunciaDelega, statoDelega, tipoDelega, gradoDelega);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DelegaServizio {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    codiceServizio: ").append(toIndentedString(codiceServizio)).append("\n");
    sb.append("    dataInizioDelega: ").append(toIndentedString(dataInizioDelega)).append("\n");
    sb.append("    dataFineDelega: ").append(toIndentedString(dataFineDelega)).append("\n");
    sb.append("    dataRevocaDelega: ").append(toIndentedString(dataRevocaDelega)).append("\n");
    sb.append("    dataRinunciaDelega: ").append(toIndentedString(dataRinunciaDelega)).append("\n");
    sb.append("    statoDelega: ").append(toIndentedString(statoDelega)).append("\n");
    sb.append("    tipoDelega: ").append(toIndentedString(tipoDelega)).append("\n");
    sb.append("    gradoDelega: ").append(toIndentedString(gradoDelega)).append("\n");
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

