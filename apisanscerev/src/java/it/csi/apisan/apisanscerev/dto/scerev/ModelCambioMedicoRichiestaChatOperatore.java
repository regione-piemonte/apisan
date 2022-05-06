/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.dto.scerev;

import java.util.Objects;
import java.util.ArrayList;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Rappresenta l'elenco delle note scambiate tra il cittadino e l'operatore su una richiesta di cambio medico.  Tramite questi dati il front-end può mostrare al cittadino delle informazioni utili (soprattutto in caso di rettifica) per completare con successo il cambio del medico. ")

public class ModelCambioMedicoRichiestaChatOperatore   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private Boolean cittadino = null;
  private Date data = null;
  private String testo = null;

  /**
   * true se il messaggio/nota appartiene al cittadino, false altrimenti
   **/
  
  @ApiModelProperty(example = "true", value = "true se il messaggio/nota appartiene al cittadino, false altrimenti")
  @JsonProperty("cittadino") 
 
  public Boolean isCittadino() {
    return cittadino;
  }
  public void setCittadino(Boolean cittadino) {
    this.cittadino = cittadino;
  }

  /**
   * La data in cui è stato mandato il messaggio/nota
   **/
  
  @ApiModelProperty(example = "2020-02-07T14:14:39.420Z", value = "La data in cui è stato mandato il messaggio/nota")
  @JsonProperty("data") 
 
  public Date getData() {
    return data;
  }
  public void setData(Date data) {
    this.data = data;
  }

  /**
   * Il testo della nota
   **/
  
  @ApiModelProperty(example = "Ho allegato la carta d'identità", value = "Il testo della nota")
  @JsonProperty("testo") 
 
  public String getTesto() {
    return testo;
  }
  public void setTesto(String testo) {
    this.testo = testo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelCambioMedicoRichiestaChatOperatore modelCambioMedicoRichiestaChatOperatore = (ModelCambioMedicoRichiestaChatOperatore) o;
    return Objects.equals(cittadino, modelCambioMedicoRichiestaChatOperatore.cittadino) &&
        Objects.equals(data, modelCambioMedicoRichiestaChatOperatore.data) &&
        Objects.equals(testo, modelCambioMedicoRichiestaChatOperatore.testo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cittadino, data, testo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelCambioMedicoRichiestaChatOperatore {\n");
    
    sb.append("    cittadino: ").append(toIndentedString(cittadino)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    testo: ").append(toIndentedString(testo)).append("\n");
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

