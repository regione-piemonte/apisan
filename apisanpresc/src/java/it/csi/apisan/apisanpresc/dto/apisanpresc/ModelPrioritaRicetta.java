/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.dto.apisanpresc;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Model che descrive la priorità di una ricetta")

public class ModelPrioritaRicetta   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  

  /**
   * Il codice che identifica univocamente la priorità della ricetta
   */
  public enum CodiceEnum {
    U("U"),

        B("B"),

        D("D"),

        P("P");
    private String value;

    CodiceEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private CodiceEnum codice = null;
  private String nome = null;
  private String descrizione = null;

  /**
   * Il codice che identifica univocamente la priorità della ricetta
   **/
  
  @ApiModelProperty(required = true, value = "Il codice che identifica univocamente la priorità della ricetta")
  @JsonProperty("codice") 
 
  @NotNull
  public CodiceEnum getCodice() {
    return codice;
  }
  public void setCodice(CodiceEnum codice) {
    this.codice = codice;
  }

  /**
   * Un nome user-friendly da mostrare sulla UI (es. Priorità alta)
   **/
  
  @ApiModelProperty(required = true, value = "Un nome user-friendly da mostrare sulla UI (es. Priorità alta)")
  @JsonProperty("nome") 
 
  @NotNull
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  /**
   * Una descrizione dettagliata della priorità
   **/
  
  @ApiModelProperty(required = true, value = "Una descrizione dettagliata della priorità")
  @JsonProperty("descrizione") 
 
  @NotNull
  public String getDescrizione() {
    return descrizione;
  }
  public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelPrioritaRicetta modelPrioritaRicetta = (ModelPrioritaRicetta) o;
    return Objects.equals(codice, modelPrioritaRicetta.codice) &&
        Objects.equals(nome, modelPrioritaRicetta.nome) &&
        Objects.equals(descrizione, modelPrioritaRicetta.descrizione);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codice, nome, descrizione);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelPrioritaRicetta {\n");
    
    sb.append("    codice: ").append(toIndentedString(codice)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    descrizione: ").append(toIndentedString(descrizione)).append("\n");
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

