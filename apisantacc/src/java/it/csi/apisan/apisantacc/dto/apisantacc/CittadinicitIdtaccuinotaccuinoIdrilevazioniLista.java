/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.dto.apisantacc;

import java.util.Objects;
import java.util.ArrayList;
import java.math.BigDecimal;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class CittadinicitIdtaccuinotaccuinoIdrilevazioniLista   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private BigDecimal valoreNumerico = null;
  private String valoreTestuale = null;
  private Date data = null;
  private String unitaMisuraCodice = null;
  private String gruppoCodice = null;
  private String descrittoreCodice = null;
  private String modalitaCodice = null;

  /**
   * Il valore della rilevazione inserita dall&#39;utente
   **/
  
  @ApiModelProperty(value = "Il valore della rilevazione inserita dall'utente")
  @JsonProperty("valore_numerico") 
 
  public BigDecimal getValoreNumerico() {
    return valoreNumerico;
  }
  public void setValoreNumerico(BigDecimal valoreNumerico) {
    this.valoreNumerico = valoreNumerico;
  }

  /**
   * Il valore testuale della rilevazione
   **/
  
  @ApiModelProperty(value = "Il valore testuale della rilevazione")
  @JsonProperty("valore_testuale") 
 
  public String getValoreTestuale() {
    return valoreTestuale;
  }
  public void setValoreTestuale(String valoreTestuale) {
    this.valoreTestuale = valoreTestuale;
  }

  /**
   * la data di rilevazione inserita dall&#39;utente
   **/
  
  @ApiModelProperty(value = "la data di rilevazione inserita dall'utente")
  @JsonProperty("data") 
 
  public Date getData() {
    return data;
  }
  public void setData(Date data) {
    this.data = data;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("unita_misura_codice") 
 
  public String getUnitaMisuraCodice() {
    return unitaMisuraCodice;
  }
  public void setUnitaMisuraCodice(String unitaMisuraCodice) {
    this.unitaMisuraCodice = unitaMisuraCodice;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("gruppo_codice") 
 
  public String getGruppoCodice() {
    return gruppoCodice;
  }
  public void setGruppoCodice(String gruppoCodice) {
    this.gruppoCodice = gruppoCodice;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("descrittore_codice") 
 
  public String getDescrittoreCodice() {
    return descrittoreCodice;
  }
  public void setDescrittoreCodice(String descrittoreCodice) {
    this.descrittoreCodice = descrittoreCodice;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("modalita_codice") 
 
  public String getModalitaCodice() {
    return modalitaCodice;
  }
  public void setModalitaCodice(String modalitaCodice) {
    this.modalitaCodice = modalitaCodice;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CittadinicitIdtaccuinotaccuinoIdrilevazioniLista cittadinicitIdtaccuinotaccuinoIdrilevazioniLista = (CittadinicitIdtaccuinotaccuinoIdrilevazioniLista) o;
    return Objects.equals(valoreNumerico, cittadinicitIdtaccuinotaccuinoIdrilevazioniLista.valoreNumerico) &&
        Objects.equals(valoreTestuale, cittadinicitIdtaccuinotaccuinoIdrilevazioniLista.valoreTestuale) &&
        Objects.equals(data, cittadinicitIdtaccuinotaccuinoIdrilevazioniLista.data) &&
        Objects.equals(unitaMisuraCodice, cittadinicitIdtaccuinotaccuinoIdrilevazioniLista.unitaMisuraCodice) &&
        Objects.equals(gruppoCodice, cittadinicitIdtaccuinotaccuinoIdrilevazioniLista.gruppoCodice) &&
        Objects.equals(descrittoreCodice, cittadinicitIdtaccuinotaccuinoIdrilevazioniLista.descrittoreCodice) &&
        Objects.equals(modalitaCodice, cittadinicitIdtaccuinotaccuinoIdrilevazioniLista.modalitaCodice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valoreNumerico, valoreTestuale, data, unitaMisuraCodice, gruppoCodice, descrittoreCodice, modalitaCodice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CittadinicitIdtaccuinotaccuinoIdrilevazioniLista {\n");
    
    sb.append("    valoreNumerico: ").append(toIndentedString(valoreNumerico)).append("\n");
    sb.append("    valoreTestuale: ").append(toIndentedString(valoreTestuale)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    unitaMisuraCodice: ").append(toIndentedString(unitaMisuraCodice)).append("\n");
    sb.append("    gruppoCodice: ").append(toIndentedString(gruppoCodice)).append("\n");
    sb.append("    descrittoreCodice: ").append(toIndentedString(descrittoreCodice)).append("\n");
    sb.append("    modalitaCodice: ").append(toIndentedString(modalitaCodice)).append("\n");
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

