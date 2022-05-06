/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesenpat.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import it.csi.apisan.apisanesenpat.model.ModelCittadino;
import it.csi.apisan.apisanesenpat.model.ModelEsenzioneStato;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Rappresenta la modifica dello stato di un'esenzione ")

public class ModelEsenzioneCambioStato   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String id = null;
  private String dataCreazione = null;
  private ModelEsenzioneStato nuovoStato = null;
  private ModelCittadino utente = null;
  private String nota = null;

  /**
   * Un identificativo univoco del cambio di stato. 
   **/
  
  @ApiModelProperty(required = true, value = "Un identificativo univoco del cambio di stato. ")
  @JsonProperty("id") 
 
  @NotNull
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Quando c&#39;è stata una variazione nello stato 
   **/
  
  @ApiModelProperty(required = true, value = "Quando c'è stata una variazione nello stato ")
  @JsonProperty("data_creazione") 
 
  @NotNull
  public String getDataCreazione() {
    return dataCreazione;
  }
  public void setDataCreazione(String dataCreazione) {
    this.dataCreazione = dataCreazione;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("nuovo_stato") 
 
  @NotNull
  public ModelEsenzioneStato getNuovoStato() {
    return nuovoStato;
  }
  public void setNuovoStato(ModelEsenzioneStato nuovoStato) {
    this.nuovoStato = nuovoStato;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("utente") 
 
  @NotNull
  public ModelCittadino getUtente() {
    return utente;
  }
  public void setUtente(ModelCittadino utente) {
    this.utente = utente;
  }

  /**
   * L&#39;eventuale nota associata al cambio di stato
   **/
  
  @ApiModelProperty(value = "L'eventuale nota associata al cambio di stato")
  @JsonProperty("nota") 
 
  public String getNota() {
    return nota;
  }
  public void setNota(String nota) {
    this.nota = nota;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelEsenzioneCambioStato modelEsenzioneCambioStato = (ModelEsenzioneCambioStato) o;
    return Objects.equals(id, modelEsenzioneCambioStato.id) &&
        Objects.equals(dataCreazione, modelEsenzioneCambioStato.dataCreazione) &&
        Objects.equals(nuovoStato, modelEsenzioneCambioStato.nuovoStato) &&
        Objects.equals(utente, modelEsenzioneCambioStato.utente) &&
        Objects.equals(nota, modelEsenzioneCambioStato.nota);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dataCreazione, nuovoStato, utente, nota);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelEsenzioneCambioStato {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dataCreazione: ").append(toIndentedString(dataCreazione)).append("\n");
    sb.append("    nuovoStato: ").append(toIndentedString(nuovoStato)).append("\n");
    sb.append("    utente: ").append(toIndentedString(utente)).append("\n");
    sb.append("    nota: ").append(toIndentedString(nota)).append("\n");
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

