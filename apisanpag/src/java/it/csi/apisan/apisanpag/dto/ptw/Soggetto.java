/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.dto.ptw;

import java.util.Objects;

import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModelProperty;



public class Soggetto   {
  
  private String codFisc = null;
  private String nome = null;
  private String cognome = null;
  private String dataNascita = null;
  private String dataNascita2 = null;

  /**
   * codice fiscale
   **/
  
  @ApiModelProperty(value = "codice fiscale")
  //@JsonProperty("cod_fisc")
  @Size(max=16)
  public String getCodFisc() {
    return codFisc;
  }
  public void setCodFisc(String codFisc) {
    this.codFisc = codFisc;
  }

  /**
   * nome del soggetto
   **/
  
  @ApiModelProperty(value = "nome del soggetto")
  //@JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  /**
   * cognome del soggetto
   **/
  
  @ApiModelProperty(value = "cognome del soggetto")
  //@JsonProperty("cognome")
  public String getCognome() {
    return cognome;
  }
  public void setCognome(String cognome) {
    this.cognome = cognome;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  //@JsonProperty("data_nascita")
  public String getDataNascita() {
    return dataNascita;
  }
  public void setDataNascita(String dataNascita) {
    this.dataNascita = dataNascita;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  //@JsonProperty("data_nascita2")
  public String getDataNascita2() {
    return dataNascita2;
  }
  public void setDataNascita2(String dataNascita2) {
    this.dataNascita2 = dataNascita2;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Soggetto soggetto = (Soggetto) o;
    return Objects.equals(codFisc, soggetto.codFisc) &&
        Objects.equals(nome, soggetto.nome) &&
        Objects.equals(cognome, soggetto.cognome) &&
        Objects.equals(dataNascita, soggetto.dataNascita) &&
        Objects.equals(dataNascita2, soggetto.dataNascita2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codFisc, nome, cognome, dataNascita, dataNascita2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Soggetto {\n");
    
    sb.append("    codFisc: ").append(toIndentedString(codFisc)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    cognome: ").append(toIndentedString(cognome)).append("\n");
    sb.append("    dataNascita: ").append(toIndentedString(dataNascita)).append("\n");
    sb.append("    dataNascita2: ").append(toIndentedString(dataNascita2)).append("\n");
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

