/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.dto.scerev;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanscerev.dto.scerev.ModelAssociazioneMedici;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelAssociazione   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String id = null;
  private String nome = null;
  private String cap = null;
  private String comune = null;
  private String indirizzo = null;
  private String numeroCivico = null;
  private String telefono = null;
  private List<ModelAssociazioneMedici> medici = new ArrayList<ModelAssociazioneMedici>();

  /**
   * Identificativo univoco
   **/
  
  @ApiModelProperty(example = "32568", value = "Identificativo univoco")
  @JsonProperty("id") 
 
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Il nome dell&#39;associazione
   **/
  
  @ApiModelProperty(example = "ASL TO ASS. 130", value = "Il nome dell'associazione")
  @JsonProperty("nome") 
 
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  /**
   * Il CAP dell&#39;associazione
   **/
  
  @ApiModelProperty(value = "Il CAP dell'associazione")
  @JsonProperty("cap") 
 
  public String getCap() {
    return cap;
  }
  public void setCap(String cap) {
    this.cap = cap;
  }

  /**
   * Il comune dell&#39;associazione
   **/
  
  @ApiModelProperty(value = "Il comune dell'associazione")
  @JsonProperty("comune") 
 
  public String getComune() {
    return comune;
  }
  public void setComune(String comune) {
    this.comune = comune;
  }

  /**
   * L&#39;indirizzo dell&#39;associazione
   **/
  
  @ApiModelProperty(value = "L'indirizzo dell'associazione")
  @JsonProperty("indirizzo") 
 
  public String getIndirizzo() {
    return indirizzo;
  }
  public void setIndirizzo(String indirizzo) {
    this.indirizzo = indirizzo;
  }

  /**
   * Il numero civico dell&#39;associazione
   **/
  
  @ApiModelProperty(value = "Il numero civico dell'associazione")
  @JsonProperty("numeroCivico") 
 
  public String getNumeroCivico() {
    return numeroCivico;
  }
  public void setNumeroCivico(String numeroCivico) {
    this.numeroCivico = numeroCivico;
  }

  /**
   * Il telefono dell&#39;associazione
   **/
  
  @ApiModelProperty(value = "Il telefono dell'associazione")
  @JsonProperty("telefono") 
 
  public String getTelefono() {
    return telefono;
  }
  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("medici") 
 
  public List<ModelAssociazioneMedici> getMedici() {
    return medici;
  }
  public void setMedici(List<ModelAssociazioneMedici> medici) {
    this.medici = medici;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelAssociazione modelAssociazione = (ModelAssociazione) o;
    return Objects.equals(id, modelAssociazione.id) &&
        Objects.equals(nome, modelAssociazione.nome) &&
        Objects.equals(cap, modelAssociazione.cap) &&
        Objects.equals(comune, modelAssociazione.comune) &&
        Objects.equals(indirizzo, modelAssociazione.indirizzo) &&
        Objects.equals(numeroCivico, modelAssociazione.numeroCivico) &&
        Objects.equals(telefono, modelAssociazione.telefono) &&
        Objects.equals(medici, modelAssociazione.medici);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome, cap, comune, indirizzo, numeroCivico, telefono, medici);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelAssociazione {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    cap: ").append(toIndentedString(cap)).append("\n");
    sb.append("    comune: ").append(toIndentedString(comune)).append("\n");
    sb.append("    indirizzo: ").append(toIndentedString(indirizzo)).append("\n");
    sb.append("    numeroCivico: ").append(toIndentedString(numeroCivico)).append("\n");
    sb.append("    telefono: ").append(toIndentedString(telefono)).append("\n");
    sb.append("    medici: ").append(toIndentedString(medici)).append("\n");
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

