/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.dto.ptw;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.codehaus.jackson.annotate.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class Asr   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private Integer id = null;
  private String descrizione = null;
  private Boolean canalePsp = null;
  private CanalePagamento canalePos = null;
  private List<CausalePagamento> causaliVersamento = new ArrayList<CausalePagamento>();
  private List<PresidioSanitario> presidiSanitari = new ArrayList<PresidioSanitario>();

  /**
   * identificativo della Azienda sanitaria regionale
   **/
  
  @ApiModelProperty(example = "909", value = "identificativo della Azienda sanitaria regionale")
  @JsonProperty("id") 
 
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * Descrizione della Azienda sanitaria regionale
   **/
  
  @ApiModelProperty(example = "CITTA DELLA SALUTE E DELLA SCIENZA DI TORINO", value = "Descrizione della Azienda sanitaria regionale")
  @JsonProperty("descrizione") 
 
  public String getDescrizione() {
    return descrizione;
  }
  public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
  }

  /**
   * indica se è previsto o meno di pagare tramite psp
   **/
  
  @ApiModelProperty(example = "true", value = "indica se è previsto o meno di pagare tramite psp")
  @JsonProperty("canale_psp") 
 
  public Boolean isCanalePsp() {
    return canalePsp;
  }
  public void setCanalePsp(Boolean canalePsp) {
    this.canalePsp = canalePsp;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("canale_pos") 
 
  public CanalePagamento getCanalePos() {
    return canalePos;
  }
  public void setCanalePos(CanalePagamento canalePos) {
    this.canalePos = canalePos;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("causali_versamento") 
 
  public List<CausalePagamento> getCausaliVersamento() {
    return causaliVersamento;
  }
  public void setCausaliVersamento(List<CausalePagamento> causaliVersamento) {
    this.causaliVersamento = causaliVersamento;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("presidi_sanitari") 
 
  public List<PresidioSanitario> getPresidiSanitari() {
    return presidiSanitari;
  }
  public void setPresidiSanitari(List<PresidioSanitario> presidiSanitari) {
    this.presidiSanitari = presidiSanitari;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Asr asr = (Asr) o;
    return Objects.equals(id, asr.id) &&
        Objects.equals(descrizione, asr.descrizione) &&
        Objects.equals(canalePsp, asr.canalePsp) &&
        Objects.equals(canalePos, asr.canalePos) &&
        Objects.equals(causaliVersamento, asr.causaliVersamento) &&
        Objects.equals(presidiSanitari, asr.presidiSanitari);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, descrizione, canalePsp, canalePos, causaliVersamento, presidiSanitari);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Asr {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    descrizione: ").append(toIndentedString(descrizione)).append("\n");
    sb.append("    canalePsp: ").append(toIndentedString(canalePsp)).append("\n");
    sb.append("    canalePos: ").append(toIndentedString(canalePos)).append("\n");
    sb.append("    causaliVersamento: ").append(toIndentedString(causaliVersamento)).append("\n");
    sb.append("    presidiSanitari: ").append(toIndentedString(presidiSanitari)).append("\n");
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

