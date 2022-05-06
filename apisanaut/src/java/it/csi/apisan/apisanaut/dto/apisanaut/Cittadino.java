/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanaut.dto.apisanaut;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanaut.dto.apisanaut.Documento;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class Cittadino   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String codiceFiscale = null;
  private String nome = null;
  private String cognome = null;
  private Date dataNascita = null;
  private String comuneNascita = null;
  private String sesso = null;
  private Integer idAura = null;
  private String aslAssistenza = null;
  private Documento documento = null;

  /**
   * codice fiscale
   **/
  
  @ApiModelProperty(example = "AAAAAA00B77B000F", value = "codice fiscale")
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
  
  @ApiModelProperty(value = "nome")
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
  
  @ApiModelProperty(value = "cognome")
  @JsonProperty("cognome") 
 
  public String getCognome() {
    return cognome;
  }
  public void setCognome(String cognome) {
    this.cognome = cognome;
  }

  /**
   * data di nascita
   **/
  
  @ApiModelProperty(value = "data di nascita")
  @JsonProperty("data_nascita") 
 
  public Date getDataNascita() {
    return dataNascita;
  }
  public void setDataNascita(Date dataNascita) {
    this.dataNascita = dataNascita;
  }

  /**
   * comune di nascita
   **/
  
  @ApiModelProperty(value = "comune di nascita")
  @JsonProperty("comune_nascita") 
 
  public String getComuneNascita() {
    return comuneNascita;
  }
  public void setComuneNascita(String comuneNascita) {
    this.comuneNascita = comuneNascita;
  }

  /**
   * sesso questo campo non è obbligatorio
   **/
  
  @ApiModelProperty(value = "sesso questo campo non è obbligatorio")
  @JsonProperty("sesso") 
 
  public String getSesso() {
    return sesso;
  }
  public void setSesso(String sesso) {
    this.sesso = sesso;
  }

  /**
   * idAura questo campo non è obbligatorio
   **/
  
  @ApiModelProperty(value = "idAura questo campo non è obbligatorio")
  @JsonProperty("id_aura") 
 
  public Integer getIdAura() {
    return idAura;
  }
  public void setIdAura(Integer idAura) {
    this.idAura = idAura;
  }

  /**
   * codice dell&#39;asl di assistenza
   **/
  
  @ApiModelProperty(value = "codice dell'asl di assistenza")
  @JsonProperty("asl_assistenza") 
 
  public String getAslAssistenza() {
    return aslAssistenza;
  }
  public void setAslAssistenza(String aslAssistenza) {
    this.aslAssistenza = aslAssistenza;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("documento") 
 
  public Documento getDocumento() {
    return documento;
  }
  public void setDocumento(Documento documento) {
    this.documento = documento;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cittadino cittadino = (Cittadino) o;
    return Objects.equals(codiceFiscale, cittadino.codiceFiscale) &&
        Objects.equals(nome, cittadino.nome) &&
        Objects.equals(cognome, cittadino.cognome) &&
        Objects.equals(dataNascita, cittadino.dataNascita) &&
        Objects.equals(comuneNascita, cittadino.comuneNascita) &&
        Objects.equals(sesso, cittadino.sesso) &&
        Objects.equals(idAura, cittadino.idAura) &&
        Objects.equals(aslAssistenza, cittadino.aslAssistenza) &&
        Objects.equals(documento, cittadino.documento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codiceFiscale, nome, cognome, dataNascita, comuneNascita, sesso, idAura, aslAssistenza, documento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cittadino {\n");
    
    sb.append("    codiceFiscale: ").append(toIndentedString(codiceFiscale)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    cognome: ").append(toIndentedString(cognome)).append("\n");
    sb.append("    dataNascita: ").append(toIndentedString(dataNascita)).append("\n");
    sb.append("    comuneNascita: ").append(toIndentedString(comuneNascita)).append("\n");
    sb.append("    sesso: ").append(toIndentedString(sesso)).append("\n");
    sb.append("    idAura: ").append(toIndentedString(idAura)).append("\n");
    sb.append("    aslAssistenza: ").append(toIndentedString(aslAssistenza)).append("\n");
    sb.append("    documento: ").append(toIndentedString(documento)).append("\n");
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

