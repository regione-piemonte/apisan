/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanffe.dto.apisanffe;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.math.BigDecimal;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;

public class ModelModalitaErogazione   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String id = null;
  private Integer rimborsoModalitaCodice = null;
  private String asrId = null;
  private String servizioCodice = null;
  private String versamentoCodice = null;
  private String motivoPagamentoCodice = null;
  private BigDecimal importoBonificoMinimo = null;

  /**
   * Un id univoco
   **/
  

  @JsonProperty("id") 
 
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Il codice della modalità di rimborso impostato/usato per questo pagamento. * 1 - Voucher * 2 - Bonifico * 3 - Borsellino 
   **/
  

  @JsonProperty("rimborso_modalita_codice") 
 
  public Integer getRimborsoModalitaCodice() {
    return rimborsoModalitaCodice;
  }
  public void setRimborsoModalitaCodice(Integer rimborsoModalitaCodice) {
    this.rimborsoModalitaCodice = rimborsoModalitaCodice;
  }

  /**
   * L&#39;id dell&#39;ASR  su cui si applica la modalità di erogazione
   **/
  

  @JsonProperty("asr_id") 
 
  public String getAsrId() {
    return asrId;
  }
  public void setAsrId(String asrId) {
    this.asrId = asrId;
  }

  /**
   * Il codice del servizio a cui si applica la modalità di erogazione
   **/
  

  @JsonProperty("servizio_codice") 
 
  public String getServizioCodice() {
    return servizioCodice;
  }
  public void setServizioCodice(String servizioCodice) {
    this.servizioCodice = servizioCodice;
  }

  /**
   * Il codice del versamento a cui si applica la modalità di erogazione
   **/
  

  @JsonProperty("versamento_codice") 
 
  public String getVersamentoCodice() {
    return versamentoCodice;
  }
  public void setVersamentoCodice(String versamentoCodice) {
    this.versamentoCodice = versamentoCodice;
  }

  /**
   * Il codice del motivo di pagamento a cui si applica la modalità di erogazione
   **/
  

  @JsonProperty("motivo_pagamento_codice") 
 
  public String getMotivoPagamentoCodice() {
    return motivoPagamentoCodice;
  }
  public void setMotivoPagamentoCodice(String motivoPagamentoCodice) {
    this.motivoPagamentoCodice = motivoPagamentoCodice;
  }

  /**
   * L&#39;importo minimo del bonifico per usare permettere la modalità di erogazione
   **/
  

  @JsonProperty("importo_bonifico_minimo") 
 
  public BigDecimal getImportoBonificoMinimo() {
    return importoBonificoMinimo;
  }
  public void setImportoBonificoMinimo(BigDecimal importoBonificoMinimo) {
    this.importoBonificoMinimo = importoBonificoMinimo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelModalitaErogazione modelModalitaErogazione = (ModelModalitaErogazione) o;
    return Objects.equals(id, modelModalitaErogazione.id) &&
        Objects.equals(rimborsoModalitaCodice, modelModalitaErogazione.rimborsoModalitaCodice) &&
        Objects.equals(asrId, modelModalitaErogazione.asrId) &&
        Objects.equals(servizioCodice, modelModalitaErogazione.servizioCodice) &&
        Objects.equals(versamentoCodice, modelModalitaErogazione.versamentoCodice) &&
        Objects.equals(motivoPagamentoCodice, modelModalitaErogazione.motivoPagamentoCodice) &&
        Objects.equals(importoBonificoMinimo, modelModalitaErogazione.importoBonificoMinimo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, rimborsoModalitaCodice, asrId, servizioCodice, versamentoCodice, motivoPagamentoCodice, importoBonificoMinimo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelModalitaErogazione {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    rimborsoModalitaCodice: ").append(toIndentedString(rimborsoModalitaCodice)).append("\n");
    sb.append("    asrId: ").append(toIndentedString(asrId)).append("\n");
    sb.append("    servizioCodice: ").append(toIndentedString(servizioCodice)).append("\n");
    sb.append("    versamentoCodice: ").append(toIndentedString(versamentoCodice)).append("\n");
    sb.append("    motivoPagamentoCodice: ").append(toIndentedString(motivoPagamentoCodice)).append("\n");
    sb.append("    importoBonificoMinimo: ").append(toIndentedString(importoBonificoMinimo)).append("\n");
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

