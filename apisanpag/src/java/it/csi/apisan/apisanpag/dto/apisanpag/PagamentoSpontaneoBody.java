/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.dto.apisanpag;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanpag.dto.apisanpag.Cittadino;
import it.csi.apisan.apisanpag.dto.apisanpag.Importo;
import java.math.BigDecimal;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class PagamentoSpontaneoBody   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private Integer idAsr = null;
  private Importo pagato = null;
  private BigDecimal causaleVersamento = null;
  private String mail = null;
  private Cittadino pagatore = null;
  private Cittadino versante = null;
  private String note = null;

  /**
   * id dell&#39;asr
   **/
  
  @ApiModelProperty(example = "909", value = "id dell'asr")
  @JsonProperty("id_asr") 
 
  public Integer getIdAsr() {
    return idAsr;
  }
  public void setIdAsr(Integer idAsr) {
    this.idAsr = idAsr;
  }

  /**
   * importo pagato
   **/
  
  @ApiModelProperty(value = "importo pagato")
  @JsonProperty("pagato") 
 
  public Importo getPagato() {
    return pagato;
  }
  public void setPagato(Importo pagato) {
    this.pagato = pagato;
  }

  /**
   * id della causale di pagamento
   **/
  
  @ApiModelProperty(example = "72.0", value = "id della causale di pagamento")
  @JsonProperty("causale_versamento") 
 
  public BigDecimal getCausaleVersamento() {
    return causaleVersamento;
  }
  public void setCausaleVersamento(BigDecimal causaleVersamento) {
    this.causaleVersamento = causaleVersamento;
  }

  /**
   * mail dove ricevere la ricevuta parametro opzionale
   **/
  
  @ApiModelProperty(example = "mail@csi.it", value = "mail dove ricevere la ricevuta parametro opzionale")
  @JsonProperty("mail") 
 
  public String getMail() {
    return mail;
  }
  public void setMail(String mail) {
    this.mail = mail;
  }

  /**
   * chi paga
   **/
  
  @ApiModelProperty(value = "chi paga")
  @JsonProperty("pagatore") 
 
  public Cittadino getPagatore() {
    return pagatore;
  }
  public void setPagatore(Cittadino pagatore) {
    this.pagatore = pagatore;
  }

  /**
   * chi effettua il pagamento
   **/
  
  @ApiModelProperty(value = "chi effettua il pagamento")
  @JsonProperty("versante") 
 
  public Cittadino getVersante() {
    return versante;
  }
  public void setVersante(Cittadino versante) {
    this.versante = versante;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("note") 
 
  public String getNote() {
    return note;
  }
  public void setNote(String note) {
    this.note = note;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PagamentoSpontaneoBody pagamentoSpontaneoBody = (PagamentoSpontaneoBody) o;
    return Objects.equals(idAsr, pagamentoSpontaneoBody.idAsr) &&
        Objects.equals(pagato, pagamentoSpontaneoBody.pagato) &&
        Objects.equals(causaleVersamento, pagamentoSpontaneoBody.causaleVersamento) &&
        Objects.equals(mail, pagamentoSpontaneoBody.mail) &&
        Objects.equals(pagatore, pagamentoSpontaneoBody.pagatore) &&
        Objects.equals(versante, pagamentoSpontaneoBody.versante) &&
        Objects.equals(note, pagamentoSpontaneoBody.note);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idAsr, pagato, causaleVersamento, mail, pagatore, versante, note);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagamentoSpontaneoBody {\n");
    
    sb.append("    idAsr: ").append(toIndentedString(idAsr)).append("\n");
    sb.append("    pagato: ").append(toIndentedString(pagato)).append("\n");
    sb.append("    causaleVersamento: ").append(toIndentedString(causaleVersamento)).append("\n");
    sb.append("    mail: ").append(toIndentedString(mail)).append("\n");
    sb.append("    pagatore: ").append(toIndentedString(pagatore)).append("\n");
    sb.append("    versante: ").append(toIndentedString(versante)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
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

