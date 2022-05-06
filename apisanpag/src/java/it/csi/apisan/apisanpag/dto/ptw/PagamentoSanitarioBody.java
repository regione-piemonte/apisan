/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.dto.ptw;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import io.swagger.annotations.ApiModelProperty;



public class PagamentoSanitarioBody   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private List<PraticaInCarrello> praticheDaPagare = new ArrayList<PraticaInCarrello>();
  @JsonSerialize(include=JsonSerialize.Inclusion.NON_EMPTY)
  private List<PraticaDaRimborsare> praticheDaRimborsare = new ArrayList<PraticaDaRimborsare>();
  private String mail = null;
  private Cittadino versante = null;
  private Boolean psp = null;
  private CartaCommissione pos = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("pratiche_da_pagare") 
 
  public List<PraticaInCarrello> getPraticheDaPagare() {
    return praticheDaPagare;
  }
  public void setPraticheDaPagare(List<PraticaInCarrello> praticheDaPagare) {
    this.praticheDaPagare = praticheDaPagare;
  }
  
  
  @ApiModelProperty(value = "")
  @JsonProperty("pratiche_da_rimborsare") 
  
  public List<PraticaDaRimborsare> getPraticheDaRimborsare() {
	  return praticheDaRimborsare;
  }
  public void setPraticheDaRimborsare(List<PraticaDaRimborsare> praticheDaRimborsare) {
	  this.praticheDaRimborsare = praticheDaRimborsare;
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
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("versante") 
 
  public Cittadino getVersante() {
    return versante;
  }
  public void setVersante(Cittadino versante) {
    this.versante = versante;
  }

  /**
   * valorizzato a true se il cittadino ha deciso di pagare con pagoPA se valorizzato a true il tag \&quot;pos\&quot; non sara preso in considerazione se valorizzato a false o non specificato si intende che il cittadino ha scelto di pagare con il POS
   **/
  
  @ApiModelProperty(example = "true", value = "valorizzato a true se il cittadino ha deciso di pagare con pagoPA se valorizzato a true il tag \"pos\" non sara preso in considerazione se valorizzato a false o non specificato si intende che il cittadino ha scelto di pagare con il POS")
  @JsonProperty("psp") 
 
  public Boolean isPsp() {
    return psp;
  }
  public void setPsp(Boolean psp) {
    this.psp = psp;
  }

  /**
   * questo tag viene preso in cosiderazione se il tag \&quot;psp\&quot; non è valorizzato oppure vale false se valorizzato vuol dire che il cittadino ha deciso di pagare con POS viene valorizzato l&#39;identificativo della carta di credito scelta dal cittadino
   **/
  
  @ApiModelProperty(value = "questo tag viene preso in cosiderazione se il tag \"psp\" non è valorizzato oppure vale false se valorizzato vuol dire che il cittadino ha deciso di pagare con POS viene valorizzato l'identificativo della carta di credito scelta dal cittadino")
  @JsonProperty("pos") 
 
  public CartaCommissione getPos() {
    return pos;
  }
  public void setPos(CartaCommissione pos) {
    this.pos = pos;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PagamentoSanitarioBody pagamentoSanitarioBody = (PagamentoSanitarioBody) o;
    return Objects.equals(praticheDaPagare, pagamentoSanitarioBody.praticheDaPagare) &&
        Objects.equals(mail, pagamentoSanitarioBody.mail) &&
        Objects.equals(versante, pagamentoSanitarioBody.versante) &&
        Objects.equals(psp, pagamentoSanitarioBody.psp) &&
        Objects.equals(pos, pagamentoSanitarioBody.pos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(praticheDaPagare, mail, versante, psp, pos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagamentoSanitarioBody {\n");
    
    sb.append("    praticheDaPagare: ").append(toIndentedString(praticheDaPagare)).append("\n");
    sb.append("    mail: ").append(toIndentedString(mail)).append("\n");
    sb.append("    versante: ").append(toIndentedString(versante)).append("\n");
    sb.append("    psp: ").append(toIndentedString(psp)).append("\n");
    sb.append("    pos: ").append(toIndentedString(pos)).append("\n");
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

