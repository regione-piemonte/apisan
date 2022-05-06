/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanprof.dto.apisanprof;

import java.util.Objects;
import java.util.ArrayList;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class DatiPrimari   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String codCittadinanza = null;
  private String codComuneNascita = null;
  private String codStatoNascita = null;
  private String codiceFiscale = null;
  private String cognome = null;
  private Date dataDecesso = null;
  private Date dataNascita = null;
  private String descCittadinanza = null;
  private String descComuneNascita = null;
  private String descStatoNascita = null;
  private String nome = null;
  private String sesso = null;
  private String siglaProvNascita = null;
  private String statoCodiceFiscale = null;
  private String statoProfiloAnagrafico = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cod_cittadinanza") 
 
  public String getCodCittadinanza() {
    return codCittadinanza;
  }
  public void setCodCittadinanza(String codCittadinanza) {
    this.codCittadinanza = codCittadinanza;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cod_comune_nascita") 
 
  public String getCodComuneNascita() {
    return codComuneNascita;
  }
  public void setCodComuneNascita(String codComuneNascita) {
    this.codComuneNascita = codComuneNascita;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cod_stato_nascita") 
 
  public String getCodStatoNascita() {
    return codStatoNascita;
  }
  public void setCodStatoNascita(String codStatoNascita) {
    this.codStatoNascita = codStatoNascita;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("codice_fiscale") 
 
  public String getCodiceFiscale() {
    return codiceFiscale;
  }
  public void setCodiceFiscale(String codiceFiscale) {
    this.codiceFiscale = codiceFiscale;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cognome") 
 
  public String getCognome() {
    return cognome;
  }
  public void setCognome(String cognome) {
    this.cognome = cognome;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_decesso") 
 
  public Date getDataDecesso() {
    return dataDecesso;
  }
  public void setDataDecesso(Date dataDecesso) {
    this.dataDecesso = dataDecesso;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_nascita") 
 
  public Date getDataNascita() {
    return dataNascita;
  }
  public void setDataNascita(Date dataNascita) {
    this.dataNascita = dataNascita;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("desc_cittadinanza") 
 
  public String getDescCittadinanza() {
    return descCittadinanza;
  }
  public void setDescCittadinanza(String descCittadinanza) {
    this.descCittadinanza = descCittadinanza;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("desc_comune_nascita") 
 
  public String getDescComuneNascita() {
    return descComuneNascita;
  }
  public void setDescComuneNascita(String descComuneNascita) {
    this.descComuneNascita = descComuneNascita;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("desc_stato_nascita") 
 
  public String getDescStatoNascita() {
    return descStatoNascita;
  }
  public void setDescStatoNascita(String descStatoNascita) {
    this.descStatoNascita = descStatoNascita;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("nome") 
 
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sesso") 
 
  public String getSesso() {
    return sesso;
  }
  public void setSesso(String sesso) {
    this.sesso = sesso;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sigla_prov_nascita") 
 
  public String getSiglaProvNascita() {
    return siglaProvNascita;
  }
  public void setSiglaProvNascita(String siglaProvNascita) {
    this.siglaProvNascita = siglaProvNascita;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("stato_codice_fiscale") 
 
  public String getStatoCodiceFiscale() {
    return statoCodiceFiscale;
  }
  public void setStatoCodiceFiscale(String statoCodiceFiscale) {
    this.statoCodiceFiscale = statoCodiceFiscale;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("stato_profilo_anagrafico") 
 
  public String getStatoProfiloAnagrafico() {
    return statoProfiloAnagrafico;
  }
  public void setStatoProfiloAnagrafico(String statoProfiloAnagrafico) {
    this.statoProfiloAnagrafico = statoProfiloAnagrafico;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatiPrimari datiPrimari = (DatiPrimari) o;
    return Objects.equals(codCittadinanza, datiPrimari.codCittadinanza) &&
        Objects.equals(codComuneNascita, datiPrimari.codComuneNascita) &&
        Objects.equals(codStatoNascita, datiPrimari.codStatoNascita) &&
        Objects.equals(codiceFiscale, datiPrimari.codiceFiscale) &&
        Objects.equals(cognome, datiPrimari.cognome) &&
        Objects.equals(dataDecesso, datiPrimari.dataDecesso) &&
        Objects.equals(dataNascita, datiPrimari.dataNascita) &&
        Objects.equals(descCittadinanza, datiPrimari.descCittadinanza) &&
        Objects.equals(descComuneNascita, datiPrimari.descComuneNascita) &&
        Objects.equals(descStatoNascita, datiPrimari.descStatoNascita) &&
        Objects.equals(nome, datiPrimari.nome) &&
        Objects.equals(sesso, datiPrimari.sesso) &&
        Objects.equals(siglaProvNascita, datiPrimari.siglaProvNascita) &&
        Objects.equals(statoCodiceFiscale, datiPrimari.statoCodiceFiscale) &&
        Objects.equals(statoProfiloAnagrafico, datiPrimari.statoProfiloAnagrafico);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codCittadinanza, codComuneNascita, codStatoNascita, codiceFiscale, cognome, dataDecesso, dataNascita, descCittadinanza, descComuneNascita, descStatoNascita, nome, sesso, siglaProvNascita, statoCodiceFiscale, statoProfiloAnagrafico);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatiPrimari {\n");
    
    sb.append("    codCittadinanza: ").append(toIndentedString(codCittadinanza)).append("\n");
    sb.append("    codComuneNascita: ").append(toIndentedString(codComuneNascita)).append("\n");
    sb.append("    codStatoNascita: ").append(toIndentedString(codStatoNascita)).append("\n");
    sb.append("    codiceFiscale: ").append(toIndentedString(codiceFiscale)).append("\n");
    sb.append("    cognome: ").append(toIndentedString(cognome)).append("\n");
    sb.append("    dataDecesso: ").append(toIndentedString(dataDecesso)).append("\n");
    sb.append("    dataNascita: ").append(toIndentedString(dataNascita)).append("\n");
    sb.append("    descCittadinanza: ").append(toIndentedString(descCittadinanza)).append("\n");
    sb.append("    descComuneNascita: ").append(toIndentedString(descComuneNascita)).append("\n");
    sb.append("    descStatoNascita: ").append(toIndentedString(descStatoNascita)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    sesso: ").append(toIndentedString(sesso)).append("\n");
    sb.append("    siglaProvNascita: ").append(toIndentedString(siglaProvNascita)).append("\n");
    sb.append("    statoCodiceFiscale: ").append(toIndentedString(statoCodiceFiscale)).append("\n");
    sb.append("    statoProfiloAnagrafico: ").append(toIndentedString(statoProfiloAnagrafico)).append("\n");
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

