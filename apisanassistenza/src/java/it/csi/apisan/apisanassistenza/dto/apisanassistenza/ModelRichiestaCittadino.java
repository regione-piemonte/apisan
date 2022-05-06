/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanassistenza.dto.apisanassistenza;

import java.util.Objects;

import org.codehaus.jackson.annotate.JsonProperty;

public class ModelRichiestaCittadino   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
	
  public ModelRichiestaCittadino() {
		super();
		// TODO Auto-generated constructor stub
  }	
  
  public ModelRichiestaCittadino(String nome, String cognome, String codiceFiscale) {
	super();
	this.nome = nome;
	this.cognome = cognome;
	this.codiceFiscale = codiceFiscale;
  }  
  
  private String nome = null;
  private String cognome = null;
  private String codiceFiscale = null;

  /**
   * Il nome del cittadino
   **/
  

  @JsonProperty("nome") 
 
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  /**
   * Il cognome del cittadino
   **/
  

  @JsonProperty("cognome") 
 
  public String getCognome() {
    return cognome;
  }
  public void setCognome(String cognome) {
    this.cognome = cognome;
  }

  /**
   * Il codice fiscale del cittadino
   **/
  

  @JsonProperty("codice_fiscale") 
 
  public String getCodiceFiscale() {
    return codiceFiscale;
  }
  public void setCodiceFiscale(String codiceFiscale) {
    this.codiceFiscale = codiceFiscale;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelRichiestaCittadino modelRichiestaCittadino = (ModelRichiestaCittadino) o;
    return Objects.equals(nome, modelRichiestaCittadino.nome) &&
        Objects.equals(cognome, modelRichiestaCittadino.cognome) &&
        Objects.equals(codiceFiscale, modelRichiestaCittadino.codiceFiscale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, cognome, codiceFiscale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelRichiestaCittadino {\n");
    
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    cognome: ").append(toIndentedString(cognome)).append("\n");
    sb.append("    codiceFiscale: ").append(toIndentedString(codiceFiscale)).append("\n");
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

