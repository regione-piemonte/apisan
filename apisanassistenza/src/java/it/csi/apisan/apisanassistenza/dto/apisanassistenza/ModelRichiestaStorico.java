/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanassistenza.dto.apisanassistenza;

import java.util.Objects;

import org.codehaus.jackson.annotate.JsonProperty;

@Deprecated
public class ModelRichiestaStorico   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String id = null;
  private String data = null;
  private String assegnatario = null;
  private String statoCodice = null;
  private String tipologiaCodice = null;
  private ModelRichiestaStato stato = null;
  private ModelRichiestaStoricoTipologia tipologia = null;

  /**
   * Un identificativo univoco
   **/
  

  @JsonProperty("id") 
 
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * La data di cambio stato
   **/
  

  @JsonProperty("data") 
 
  public String getData() {
    return data;
  }
  public void setData(String data) {
    this.data = data;
  }

  /**
   * Il nuovo assegnatario
   **/
  

  @JsonProperty("assegnatario") 
 
  public String getAssegnatario() {
    return assegnatario;
  }
  public void setAssegnatario(String assegnatario) {
    this.assegnatario = assegnatario;
  }

  /**
   * Il codice del nuovo stato
   **/
  

  @JsonProperty("stato_codice") 
 
  public String getStatoCodice() {
    return statoCodice;
  }
  public void setStatoCodice(String statoCodice) {
    this.statoCodice = statoCodice;
  }

  /**
   * Il codice della tipologia di modifica
   **/
  

  @JsonProperty("tipologia_codice") 
 
  public String getTipologiaCodice() {
    return tipologiaCodice;
  }
  public void setTipologiaCodice(String tipologiaCodice) {
    this.tipologiaCodice = tipologiaCodice;
  }

  /**
   **/
  

  @JsonProperty("stato") 
 
  public ModelRichiestaStato getStato() {
    return stato;
  }
  public void setStato(ModelRichiestaStato stato) {
    this.stato = stato;
  }

  /**
   **/
  

  @JsonProperty("tipologia") 
 
  public ModelRichiestaStoricoTipologia getTipologia() {
    return tipologia;
  }
  public void setTipologia(ModelRichiestaStoricoTipologia tipologia) {
    this.tipologia = tipologia;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelRichiestaStorico modelRichiestaStorico = (ModelRichiestaStorico) o;
    return Objects.equals(id, modelRichiestaStorico.id) &&
        Objects.equals(data, modelRichiestaStorico.data) &&
        Objects.equals(assegnatario, modelRichiestaStorico.assegnatario) &&
        Objects.equals(statoCodice, modelRichiestaStorico.statoCodice) &&
        Objects.equals(tipologiaCodice, modelRichiestaStorico.tipologiaCodice) &&
        Objects.equals(stato, modelRichiestaStorico.stato) &&
        Objects.equals(tipologia, modelRichiestaStorico.tipologia);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, data, assegnatario, statoCodice, tipologiaCodice, stato, tipologia);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelRichiestaStorico {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    assegnatario: ").append(toIndentedString(assegnatario)).append("\n");
    sb.append("    statoCodice: ").append(toIndentedString(statoCodice)).append("\n");
    sb.append("    tipologiaCodice: ").append(toIndentedString(tipologiaCodice)).append("\n");
    sb.append("    stato: ").append(toIndentedString(stato)).append("\n");
    sb.append("    tipologia: ").append(toIndentedString(tipologia)).append("\n");
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

