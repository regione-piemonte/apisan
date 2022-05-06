/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.dto.apisanpag;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import it.csi.apisan.apisanpag.dto.apisanpag.IntegerCrit;
import it.csi.apisan.apisanpag.dto.apisanpag.NumberCrit;
import it.csi.apisan.apisanpag.dto.apisanpag.StringCrit;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="definizione del filtro sul pagamento. Al momento è bbligatorio ricercare solo le pratiche da pagare per fare questo è necessario impostare il filtro  con la regola 'stato ci (000) pagato eq 0 e da_pagare gt 0'.")

public class PagamentoFilter   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private IntegerCrit idAsr = null;
  private StringCrit nre = null;
  private StringCrit numeroPraticaAsr = null;
  private NumberCrit pagato = null;
  private NumberCrit daPagare = null;
  private StringCrit stato = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id_asr") 
 
  public IntegerCrit getIdAsr() {
    return idAsr;
  }
  public void setIdAsr(IntegerCrit idAsr) {
    this.idAsr = idAsr;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("nre") 
 
  public StringCrit getNre() {
    return nre;
  }
  public void setNre(StringCrit nre) {
    this.nre = nre;
  }

  /**
   * numero pratica asr 
   **/
  
  @ApiModelProperty(value = "numero pratica asr ")
  @JsonProperty("numero_pratica_asr") 
 
  public StringCrit getNumeroPraticaAsr() {
    return numeroPraticaAsr;
  }
  public void setNumeroPraticaAsr(StringCrit numeroPraticaAsr) {
    this.numeroPraticaAsr = numeroPraticaAsr;
  }

  /**
   * filtri supportati eq e gt esempio voglio cercare le pratiche che sono completamente da pagare passo 0 nel filter pagato con la clausola eq es &#39;pagato eq 0&#39; se voglio cercare quelle parzialmente pagate metto es &#39;pagato gt 0&#39; devo metterlo in and con il filtro &#39;da_pagare eq 0&#39;
   **/
  
  @ApiModelProperty(value = "filtri supportati eq e gt esempio voglio cercare le pratiche che sono completamente da pagare passo 0 nel filter pagato con la clausola eq es 'pagato eq 0' se voglio cercare quelle parzialmente pagate metto es 'pagato gt 0' devo metterlo in and con il filtro 'da_pagare eq 0'")
  @JsonProperty("pagato") 
 
  public NumberCrit getPagato() {
    return pagato;
  }
  public void setPagato(NumberCrit pagato) {
    this.pagato = pagato;
  }

  /**
   * filtri supportati eq e gt voglio cercare le pratiche che sono da pagare imposto &#39;da_pagare gt 0&#39;. Se voglio cercare le pratiche che non sono da pagare imposto il filter con &#39;da_pagare eq 0&#39;.
   **/
  
  @ApiModelProperty(value = "filtri supportati eq e gt voglio cercare le pratiche che sono da pagare imposto 'da_pagare gt 0'. Se voglio cercare le pratiche che non sono da pagare imposto il filter con 'da_pagare eq 0'.")
  @JsonProperty("da_pagare") 
 
  public NumberCrit getDaPagare() {
    return daPagare;
  }
  public void setDaPagare(NumberCrit daPagare) {
    this.daPagare = daPagare;
  }

  /**
   * filtro supportato &#39;ci&#39; e &#39;c&#39; ovvero  (contains, ignore case); attenzione lo stato viene composto da descrizione + codice, e essendo le descrizioni variabili a seconda dell&#39;asr di provenienza possiamo filtrare unicamente per contenuto della stringa i possibili valori contenuti sono sotto riportati - (000) description: pratica interamente da pagare - (003) description: pratica esente - (012) description: pratica parzialmente pagata - (032) description: pratica già pagata o da non pagare - (033) description: tipologia di pratica nonda_pagare  pagabile
   **/
  
  @ApiModelProperty(value = "filtro supportato 'ci' e 'c' ovvero  (contains, ignore case); attenzione lo stato viene composto da descrizione + codice, e essendo le descrizioni variabili a seconda dell'asr di provenienza possiamo filtrare unicamente per contenuto della stringa i possibili valori contenuti sono sotto riportati - (000) description: pratica interamente da pagare - (003) description: pratica esente - (012) description: pratica parzialmente pagata - (032) description: pratica già pagata o da non pagare - (033) description: tipologia di pratica nonda_pagare  pagabile")
  @JsonProperty("stato") 
 
  public StringCrit getStato() {
    return stato;
  }
  public void setStato(StringCrit stato) {
    this.stato = stato;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PagamentoFilter pagamentoFilter = (PagamentoFilter) o;
    return Objects.equals(idAsr, pagamentoFilter.idAsr) &&
        Objects.equals(nre, pagamentoFilter.nre) &&
        Objects.equals(numeroPraticaAsr, pagamentoFilter.numeroPraticaAsr) &&
        Objects.equals(pagato, pagamentoFilter.pagato) &&
        Objects.equals(daPagare, pagamentoFilter.daPagare) &&
        Objects.equals(stato, pagamentoFilter.stato);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idAsr, nre, numeroPraticaAsr, pagato, daPagare, stato);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagamentoFilter {\n");
    
    sb.append("    idAsr: ").append(toIndentedString(idAsr)).append("\n");
    sb.append("    nre: ").append(toIndentedString(nre)).append("\n");
    sb.append("    numeroPraticaAsr: ").append(toIndentedString(numeroPraticaAsr)).append("\n");
    sb.append("    pagato: ").append(toIndentedString(pagato)).append("\n");
    sb.append("    daPagare: ").append(toIndentedString(daPagare)).append("\n");
    sb.append("    stato: ").append(toIndentedString(stato)).append("\n");
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

