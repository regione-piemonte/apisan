/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelOperazione;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelServizio   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String codice = null;
  private String descrizione = null;
  private String riferimento = null;
  private String urlServizio = null;
  private List<ModelOperazione> operazioni = new ArrayList<ModelOperazione>();

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("codice") 
 
  public String getCodice() {
    return codice;
  }
  public void setCodice(String codice) {
    this.codice = codice;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
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
  @JsonProperty("riferimento") 
 
  public String getRiferimento() {
    return riferimento;
  }
  public void setRiferimento(String riferimento) {
    this.riferimento = riferimento;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("url_servizio") 
 
  public String getUrlServizio() {
    return urlServizio;
  }
  public void setUrlServizio(String urlServizio) {
    this.urlServizio = urlServizio;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("operazioni") 
 
  public List<ModelOperazione> getOperazioni() {
    return operazioni;
  }
  public void setOperazioni(List<ModelOperazione> operazioni) {
    this.operazioni = operazioni;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelServizio modelServizio = (ModelServizio) o;
    return Objects.equals(codice, modelServizio.codice) &&
        Objects.equals(descrizione, modelServizio.descrizione) &&
        Objects.equals(riferimento, modelServizio.riferimento) &&
        Objects.equals(urlServizio, modelServizio.urlServizio) &&
        Objects.equals(operazioni, modelServizio.operazioni);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codice, descrizione, riferimento, urlServizio, operazioni);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelServizio {\n");
    
    sb.append("    codice: ").append(toIndentedString(codice)).append("\n");
    sb.append("    descrizione: ").append(toIndentedString(descrizione)).append("\n");
    sb.append("    riferimento: ").append(toIndentedString(riferimento)).append("\n");
    sb.append("    urlServizio: ").append(toIndentedString(urlServizio)).append("\n");
    sb.append("    operazioni: ").append(toIndentedString(operazioni)).append("\n");
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

