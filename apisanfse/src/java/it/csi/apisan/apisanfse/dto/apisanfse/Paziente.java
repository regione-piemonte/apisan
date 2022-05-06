/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanfse.dto.apisanfse.ComuneDiNascita;
import it.csi.apisan.apisanfse.dto.apisanfse.StatoDiNascita;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class Paziente   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String codiceFiscale = null;
  private String cognome = null;
  private String nome = null;
  private Integer idAura = null;
  private Integer idIrec = null;
  private Date dataDiNascita = null;
  private String sesso = null;
  private ComuneDiNascita comuneDiNascita = null;
  private Boolean mailPerAccessoDma = null;
  private StatoDiNascita statoDiNascita = null;

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
  @JsonProperty("id_aura") 
 
  public Integer getIdAura() {
    return idAura;
  }
  public void setIdAura(Integer idAura) {
    this.idAura = idAura;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id_irec") 
 
  public Integer getIdIrec() {
    return idIrec;
  }
  public void setIdIrec(Integer idIrec) {
    this.idIrec = idIrec;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_di_nascita") 
 
  public Date getDataDiNascita() {
    return dataDiNascita;
  }
  public void setDataDiNascita(Date dataDiNascita) {
    this.dataDiNascita = dataDiNascita;
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
  @JsonProperty("comune_di_nascita") 
 
  public ComuneDiNascita getComuneDiNascita() {
    return comuneDiNascita;
  }
  public void setComuneDiNascita(ComuneDiNascita comuneDiNascita) {
    this.comuneDiNascita = comuneDiNascita;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("mail_per_accesso_dma") 
 
  public Boolean isMailPerAccessoDma() {
    return mailPerAccessoDma;
  }
  public void setMailPerAccessoDma(Boolean mailPerAccessoDma) {
    this.mailPerAccessoDma = mailPerAccessoDma;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("stato_di_nascita") 
 
  public StatoDiNascita getStatoDiNascita() {
    return statoDiNascita;
  }
  public void setStatoDiNascita(StatoDiNascita statoDiNascita) {
    this.statoDiNascita = statoDiNascita;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Paziente paziente = (Paziente) o;
    return Objects.equals(codiceFiscale, paziente.codiceFiscale) &&
        Objects.equals(cognome, paziente.cognome) &&
        Objects.equals(nome, paziente.nome) &&
        Objects.equals(idAura, paziente.idAura) &&
        Objects.equals(idIrec, paziente.idIrec) &&
        Objects.equals(dataDiNascita, paziente.dataDiNascita) &&
        Objects.equals(sesso, paziente.sesso) &&
        Objects.equals(comuneDiNascita, paziente.comuneDiNascita) &&
        Objects.equals(mailPerAccessoDma, paziente.mailPerAccessoDma) &&
        Objects.equals(statoDiNascita, paziente.statoDiNascita);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codiceFiscale, cognome, nome, idAura, idIrec, dataDiNascita, sesso, comuneDiNascita, mailPerAccessoDma, statoDiNascita);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Paziente {\n");
    
    sb.append("    codiceFiscale: ").append(toIndentedString(codiceFiscale)).append("\n");
    sb.append("    cognome: ").append(toIndentedString(cognome)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    idAura: ").append(toIndentedString(idAura)).append("\n");
    sb.append("    idIrec: ").append(toIndentedString(idIrec)).append("\n");
    sb.append("    dataDiNascita: ").append(toIndentedString(dataDiNascita)).append("\n");
    sb.append("    sesso: ").append(toIndentedString(sesso)).append("\n");
    sb.append("    comuneDiNascita: ").append(toIndentedString(comuneDiNascita)).append("\n");
    sb.append("    mailPerAccessoDma: ").append(toIndentedString(mailPerAccessoDma)).append("\n");
    sb.append("    statoDiNascita: ").append(toIndentedString(statoDiNascita)).append("\n");
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

