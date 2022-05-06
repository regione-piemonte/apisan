/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesen.dto.red;
import java.util.Objects;

import org.codehaus.jackson.annotate.JsonProperty;


public class CittadinoPost   {
	  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
	  
	  private String codiceFiscale = null;
	  private String nome = null;
	  private String cognome = null;
	  private String sesso = null;
	  private String dataNascita = null;
	  private String luogoNascita = null;

	  /**
	   * codice fiscale
	   **/
	  
	  @JsonProperty("codice_fiscale") 
	 
	  public String getCodiceFiscale() {
	    return codiceFiscale;
	  }
	  public void setCodiceFiscale(String codiceFiscale) {
	    this.codiceFiscale = codiceFiscale;
	  }

	  /**
	   * nome
	   **/
	  
	  @JsonProperty("nome") 
	 
	  public String getNome() {
	    return nome;
	  }
	  public void setNome(String nome) {
	    this.nome = nome;
	  }

	  /**
	   * cognome
	   **/
	  
	  @JsonProperty("cognome") 
	 
	  public String getCognome() {
	    return cognome;
	  }
	  public void setCognome(String cognome) {
	    this.cognome = cognome;
	  }

	  /**
	   * sesso
	   **/
	  
	  @JsonProperty("sesso") 
	 
	  public String getSesso() {
	    return sesso;
	  }
	  public void setSesso(String sesso) {
	    this.sesso = sesso;
	  }

	  /**
	   **/
	  
	  @JsonProperty("data_nascita") 
	 
	  public String getDataNascita() {
	    return dataNascita;
	  }
	  public void setDataNascita(String dataNascita) {
	    this.dataNascita = dataNascita;
	  }

	  /**
	   **/
	  
	  @JsonProperty("luogo_nascita") 
	 
	  public String getLuogoNascita() {
	    return luogoNascita;
	  }
	  public void setLuogoNascita(String luogoNascita) {
	    this.luogoNascita = luogoNascita;
	  }


	  @Override
	  public boolean equals(Object o) {
	    if (this == o) {
	      return true;
	    }
	    if (o == null || getClass() != o.getClass()) {
	      return false;
	    }
	    CittadinoPost cittadinoPost = (CittadinoPost) o;
	    return Objects.equals(codiceFiscale, cittadinoPost.codiceFiscale) &&
	        Objects.equals(nome, cittadinoPost.nome) &&
	        Objects.equals(cognome, cittadinoPost.cognome) &&
	        Objects.equals(sesso, cittadinoPost.sesso) &&
	        Objects.equals(dataNascita, cittadinoPost.dataNascita) &&
	        Objects.equals(luogoNascita, cittadinoPost.luogoNascita);
	  }

	  @Override
	  public int hashCode() {
	    return Objects.hash(codiceFiscale, nome, cognome, sesso, dataNascita, luogoNascita);
	  }

	  @Override
	  public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("class CittadinoPost {\n");
	    
	    sb.append("    codiceFiscale: ").append(toIndentedString(codiceFiscale)).append("\n");
	    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
	    sb.append("    cognome: ").append(toIndentedString(cognome)).append("\n");
	    sb.append("    sesso: ").append(toIndentedString(sesso)).append("\n");
	    sb.append("    dataNascita: ").append(toIndentedString(dataNascita)).append("\n");
	    sb.append("    luogoNascita: ").append(toIndentedString(luogoNascita)).append("\n");
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

