/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfarm.dto.apisanfarm;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import it.csi.apisan.apisanfarm.dto.apisanfarm.EnumAzioneFarmaciaAbituale;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;

public class PayloadFarmaciaAbituale   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private EnumAzioneFarmaciaAbituale azione = null;
  private String farmaciaCodice = null;
  private String farmaciaAbitualeId = null;
  private Date dataValiditaInizio = null;
  private Date dataValiditaFine = null;

  /**
   **/
  

  @JsonProperty("azione") 
 
  @NotNull
  public EnumAzioneFarmaciaAbituale getAzione() {
    return azione;
  }
  public void setAzione(EnumAzioneFarmaciaAbituale azione) {
    this.azione = azione;
  }

  /**
   * Il codice univoco della farmacia. Questo campo è popolato ed obbligatorio se azione è C o R 
   **/
  

  @JsonProperty("farmacia_codice") 
 
  public String getFarmaciaCodice() {
    return farmaciaCodice;
  }
  public void setFarmaciaCodice(String farmaciaCodice) {
    this.farmaciaCodice = farmaciaCodice;
  }

  /**
   * Il codice univoco della farmacia abituale. Questo campo è popolato ed obbligatorio se azione è M 
   **/
  

  @JsonProperty("farmacia_abituale_id") 
 
  public String getFarmaciaAbitualeId() {
    return farmaciaAbitualeId;
  }
  public void setFarmaciaAbitualeId(String farmaciaAbitualeId) {
    this.farmaciaAbitualeId = farmaciaAbitualeId;
  }

  /**
   * La data da cui la farmacia deve essere considerata come \&quot;abituale\&quot; per il cittadino. Questo campo è popolato ed obbligatorio se azione è C 
   **/
  

  @JsonProperty("data_validita_inizio") 
 
  public Date getDataValiditaInizio() {
    return dataValiditaInizio;
  }
  public void setDataValiditaInizio(Date dataValiditaInizio) {
    this.dataValiditaInizio = dataValiditaInizio;
  }

  /**
   * La data limite entro cui la farmacia deve essere considerata come \&quot;abituale\&quot; per il cittadino. Questo campo è popolato ed obbligatorio se azione è uno tra C e M 
   **/
  

  @JsonProperty("data_validita_fine") 
 
  public Date getDataValiditaFine() {
    return dataValiditaFine;
  }
  public void setDataValiditaFine(Date dataValiditaFine) {
    this.dataValiditaFine = dataValiditaFine;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayloadFarmaciaAbituale payloadFarmaciaAbituale = (PayloadFarmaciaAbituale) o;
    return Objects.equals(azione, payloadFarmaciaAbituale.azione) &&
        Objects.equals(farmaciaCodice, payloadFarmaciaAbituale.farmaciaCodice) &&
        Objects.equals(farmaciaAbitualeId, payloadFarmaciaAbituale.farmaciaAbitualeId) &&
        Objects.equals(dataValiditaInizio, payloadFarmaciaAbituale.dataValiditaInizio) &&
        Objects.equals(dataValiditaFine, payloadFarmaciaAbituale.dataValiditaFine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(azione, farmaciaCodice, farmaciaAbitualeId, dataValiditaInizio, dataValiditaFine);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadFarmaciaAbituale {\n");
    
    sb.append("    azione: ").append(toIndentedString(azione)).append("\n");
    sb.append("    farmaciaCodice: ").append(toIndentedString(farmaciaCodice)).append("\n");
    sb.append("    farmaciaAbitualeId: ").append(toIndentedString(farmaciaAbitualeId)).append("\n");
    sb.append("    dataValiditaInizio: ").append(toIndentedString(dataValiditaInizio)).append("\n");
    sb.append("    dataValiditaFine: ").append(toIndentedString(dataValiditaFine)).append("\n");
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

