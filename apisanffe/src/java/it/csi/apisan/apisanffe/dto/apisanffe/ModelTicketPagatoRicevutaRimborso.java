/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanffe.dto.apisanffe;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.math.BigDecimal;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;

public class ModelTicketPagatoRicevutaRimborso   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String id = null;
  private Date dataRimborso = null;
  private BigDecimal importoRimborso = null;
  private String praticaId = null;
  private String numeroRimborso = null;

  /**
   * Id univoco
   **/
  

  @JsonProperty("id") 
 
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * La data in cui è stato effettuato il rimborso
   **/
  

  @JsonProperty("data_rimborso") 
 
  public Date getDataRimborso() {
    return dataRimborso;
  }
  public void setDataRimborso(Date dataRimborso) {
    this.dataRimborso = dataRimborso;
  }

  /**
   * L&#39;importo rimborsato
   **/
  

  @JsonProperty("importo_rimborso") 
 
  public BigDecimal getImportoRimborso() {
    return importoRimborso;
  }
  public void setImportoRimborso(BigDecimal importoRimborso) {
    this.importoRimborso = importoRimborso;
  }

  /**
   * Identificativo della pratica il cui credito è stato pagato in toto o in parte con questo rimborso (in caso di erogazione tramite borsellino) 
   **/
  

  @JsonProperty("pratica_id") 
 
  public String getPraticaId() {
    return praticaId;
  }
  public void setPraticaId(String praticaId) {
    this.praticaId = praticaId;
  }

  /**
   * Numero del rimborso 
   **/
  

  @JsonProperty("numero_rimborso") 
 
  public String getNumeroRimborso() {
    return numeroRimborso;
  }
  public void setNumeroRimborso(String numeroRimborso) {
    this.numeroRimborso = numeroRimborso;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelTicketPagatoRicevutaRimborso modelTicketPagatoRicevutaRimborso = (ModelTicketPagatoRicevutaRimborso) o;
    return Objects.equals(id, modelTicketPagatoRicevutaRimborso.id) &&
        Objects.equals(dataRimborso, modelTicketPagatoRicevutaRimborso.dataRimborso) &&
        Objects.equals(importoRimborso, modelTicketPagatoRicevutaRimborso.importoRimborso) &&
        Objects.equals(praticaId, modelTicketPagatoRicevutaRimborso.praticaId) &&
        Objects.equals(numeroRimborso, modelTicketPagatoRicevutaRimborso.numeroRimborso);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dataRimborso, importoRimborso, praticaId, numeroRimborso);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelTicketPagatoRicevutaRimborso {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dataRimborso: ").append(toIndentedString(dataRimborso)).append("\n");
    sb.append("    importoRimborso: ").append(toIndentedString(importoRimborso)).append("\n");
    sb.append("    praticaId: ").append(toIndentedString(praticaId)).append("\n");
    sb.append("    numeroRimborso: ").append(toIndentedString(numeroRimborso)).append("\n");
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

