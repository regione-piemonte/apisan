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



public class CanalePagamento   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private Integer id = null;
  private String descrizione = null;
  private Tesoriere tesoriere = null;
  private String tipologia = null;
  private List<CartaCommissione> carteCommissioni = new ArrayList<CartaCommissione>();

  /**
   * idnetificativo unico del canale di pagamento
   **/
  
  @ApiModelProperty(example = "1", value = "idnetificativo unico del canale di pagamento")
  @JsonProperty("id") 
 
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * descrizione del canale di pagamento
   **/
  
  @ApiModelProperty(example = "PAGAMENTO CON CARTA DI CREDITO PREDISPOSTO DAL TESORIERE DELL'AZIENDA SANITARIA", value = "descrizione del canale di pagamento")
  @JsonProperty("descrizione") 
 
  public String getDescrizione() {
    return descrizione;
  }
  public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tesoriere") 
 
  public Tesoriere getTesoriere() {
    return tesoriere;
  }
  public void setTesoriere(Tesoriere tesoriere) {
    this.tesoriere = tesoriere;
  }

  /**
   * POS
   **/
  
  @ApiModelProperty(value = "POS")
  @JsonProperty("tipologia") 
 
  public String getTipologia() {
    return tipologia;
  }
  public void setTipologia(String tipologia) {
    this.tipologia = tipologia;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("carte_commissioni") 
 
  public List<CartaCommissione> getCarteCommissioni() {
    return carteCommissioni;
  }
  public void setCarteCommissioni(List<CartaCommissione> carteCommissioni) {
    this.carteCommissioni = carteCommissioni;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CanalePagamento canalePagamento = (CanalePagamento) o;
    return Objects.equals(id, canalePagamento.id) &&
        Objects.equals(descrizione, canalePagamento.descrizione) &&
        Objects.equals(tesoriere, canalePagamento.tesoriere) &&
        Objects.equals(tipologia, canalePagamento.tipologia) &&
        Objects.equals(carteCommissioni, canalePagamento.carteCommissioni);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, descrizione, tesoriere, tipologia, carteCommissioni);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CanalePagamento {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    descrizione: ").append(toIndentedString(descrizione)).append("\n");
    sb.append("    tesoriere: ").append(toIndentedString(tesoriere)).append("\n");
    sb.append("    tipologia: ").append(toIndentedString(tipologia)).append("\n");
    sb.append("    carteCommissioni: ").append(toIndentedString(carteCommissioni)).append("\n");
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

