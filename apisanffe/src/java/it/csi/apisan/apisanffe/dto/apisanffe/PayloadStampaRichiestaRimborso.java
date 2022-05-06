/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanffe.dto.apisanffe;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;

public class PayloadStampaRichiestaRimborso   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String codiceAsr = null;
  private List<String> idRicevute = new ArrayList<String>();
  private List<String> idRimborso = new ArrayList<String>();
  private List<String> rtId = new ArrayList<String>();
  private List<String> esitiId = new ArrayList<String>();
  private Integer modalitaRimborso = null;
  private Boolean stampabile = null;

  /**
   * Il codice della ASl beneficiaria 
   **/
  

  @JsonProperty("codice_asr") 
 
  public String getCodiceAsr() {
    return codiceAsr;
  }
  public void setCodiceAsr(String codiceAsr) {
    this.codiceAsr = codiceAsr;
  }

  /**
   * lista con gli ID della ricevute di pagamento 
   **/
  

  @JsonProperty("id_ricevute") 
 
  public List<String> getIdRicevute() {
    return idRicevute;
  }
  public void setIdRicevute(List<String> idRicevute) {
    this.idRicevute = idRicevute;
  }

  /**
   * lista con gli ID della ricevute di rimborso 
   **/
  

  @JsonProperty("id_rimborso") 
 
  public List<String> getIdRimborso() {
    return idRimborso;
  }
  public void setIdRimborso(List<String> idRimborso) {
    this.idRimborso = idRimborso;
  }

  /**
   * lista con identificativi delle RicevuteTelematiche generate a seguito del pagamento contenuto nella RT 
   **/
  

  @JsonProperty("rt_id") 
 
  public List<String> getRtId() {
    return rtId;
  }
  public void setRtId(List<String> rtId) {
    this.rtId = rtId;
  }

  /**
   * lista con identificativi degli esiti di pagamento generati a seguito dei pagamenti Telematici 
   **/
  

  @JsonProperty("esiti_id") 
 
  public List<String> getEsitiId() {
    return esitiId;
  }
  public void setEsitiId(List<String> esitiId) {
    this.esitiId = esitiId;
  }

  /**
   * Il codice della modalità di rimborso impostato/usato per questo pagamento. * 1 - Voucher * 2 - Bonifico * 3 - Borsellino 
   **/
  

  @JsonProperty("modalita_rimborso") 
 
  @NotNull
  public Integer getModalitaRimborso() {
    return modalitaRimborso;
  }
  public void setModalitaRimborso(Integer modalitaRimborso) {
    this.modalitaRimborso = modalitaRimborso;
  }

  /**
   * Indica il servizio deve scaricare i documenti (true) oppure restituire un json (false) 
   **/
  

  @JsonProperty("stampabile") 
 
  @NotNull
  public Boolean isStampabile() {
    return stampabile;
  }
  public void setStampabile(Boolean stampabile) {
    this.stampabile = stampabile;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayloadStampaRichiestaRimborso payloadStampaRichiestaRimborso = (PayloadStampaRichiestaRimborso) o;
    return Objects.equals(codiceAsr, payloadStampaRichiestaRimborso.codiceAsr) &&
        Objects.equals(idRicevute, payloadStampaRichiestaRimborso.idRicevute) &&
        Objects.equals(idRimborso, payloadStampaRichiestaRimborso.idRimborso) &&
        Objects.equals(rtId, payloadStampaRichiestaRimborso.rtId) &&
        Objects.equals(esitiId, payloadStampaRichiestaRimborso.esitiId) &&
        Objects.equals(modalitaRimborso, payloadStampaRichiestaRimborso.modalitaRimborso) &&
        Objects.equals(stampabile, payloadStampaRichiestaRimborso.stampabile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codiceAsr, idRicevute, idRimborso, rtId, esitiId, modalitaRimborso, stampabile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadStampaRichiestaRimborso {\n");
    
    sb.append("    codiceAsr: ").append(toIndentedString(codiceAsr)).append("\n");
    sb.append("    idRicevute: ").append(toIndentedString(idRicevute)).append("\n");
    sb.append("    idRimborso: ").append(toIndentedString(idRimborso)).append("\n");
    sb.append("    rtId: ").append(toIndentedString(rtId)).append("\n");
    sb.append("    esitiId: ").append(toIndentedString(esitiId)).append("\n");
    sb.append("    modalitaRimborso: ").append(toIndentedString(modalitaRimborso)).append("\n");
    sb.append("    stampabile: ").append(toIndentedString(stampabile)).append("\n");
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

