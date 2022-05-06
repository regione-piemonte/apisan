/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancross.dto.apisancross;

import java.util.Objects;
import java.util.ArrayList;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class Servizio   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String codiceServizio = null;
  private String descrizione = null;
  private String descrizioneEstesa = null;
  private Boolean notificabile = null;
  private Boolean delegabile = null;
  private Boolean arruolabile = null;
  private Boolean obbligatorioArruolamento = null;
  private Date dataInizioValidita = null;
  private Date dataFineValidita = null;
  private Integer numeroGiorniDelegabile = null;
  private String url = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("codice_servizio") 
 
  public String getCodiceServizio() {
    return codiceServizio;
  }
  public void setCodiceServizio(String codiceServizio) {
    this.codiceServizio = codiceServizio;
  }

  /**
   * nome del servizio
   **/
  
  @ApiModelProperty(value = "nome del servizio")
  @JsonProperty("descrizione") 
 
  public String getDescrizione() {
    return descrizione;
  }
  public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
  }

  /**
   * descrizione estesa del servizio
   **/
  
  @ApiModelProperty(value = "descrizione estesa del servizio")
  @JsonProperty("descrizione_estesa") 
 
  public String getDescrizioneEstesa() {
    return descrizioneEstesa;
  }
  public void setDescrizioneEstesa(String descrizioneEstesa) {
    this.descrizioneEstesa = descrizioneEstesa;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("notificabile") 
 
  public Boolean isNotificabile() {
    return notificabile;
  }
  public void setNotificabile(Boolean notificabile) {
    this.notificabile = notificabile;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("delegabile") 
 
  public Boolean isDelegabile() {
    return delegabile;
  }
  public void setDelegabile(Boolean delegabile) {
    this.delegabile = delegabile;
  }

  /**
   * true/false a seconda se bisogna o meno chiamare il servizio arruolamento
   **/
  
  @ApiModelProperty(value = "true/false a seconda se bisogna o meno chiamare il servizio arruolamento")
  @JsonProperty("arruolabile") 
 
  public Boolean isArruolabile() {
    return arruolabile;
  }
  public void setArruolabile(Boolean arruolabile) {
    this.arruolabile = arruolabile;
  }

  /**
   * indica se per tale servizio sia obbligatorio o meno dare il consenso all&#39;arruolamento
   **/
  
  @ApiModelProperty(value = "indica se per tale servizio sia obbligatorio o meno dare il consenso all'arruolamento")
  @JsonProperty("obbligatorio_arruolamento") 
 
  public Boolean isObbligatorioArruolamento() {
    return obbligatorioArruolamento;
  }
  public void setObbligatorioArruolamento(Boolean obbligatorioArruolamento) {
    this.obbligatorioArruolamento = obbligatorioArruolamento;
  }

  /**
   * data di nizio validita del servizio
   **/
  
  @ApiModelProperty(value = "data di nizio validita del servizio")
  @JsonProperty("data_inizio_validita") 
 
  public Date getDataInizioValidita() {
    return dataInizioValidita;
  }
  public void setDataInizioValidita(Date dataInizioValidita) {
    this.dataInizioValidita = dataInizioValidita;
  }

  /**
   * data fine validita del servizio
   **/
  
  @ApiModelProperty(value = "data fine validita del servizio")
  @JsonProperty("data_fine_validita") 
 
  public Date getDataFineValidita() {
    return dataFineValidita;
  }
  public void setDataFineValidita(Date dataFineValidita) {
    this.dataFineValidita = dataFineValidita;
  }

  /**
   * massimo numero di giorni per cui il servizio può essere delegato
   **/
  
  @ApiModelProperty(value = "massimo numero di giorni per cui il servizio può essere delegato")
  @JsonProperty("numero_giorni_delegabile") 
 
  public Integer getNumeroGiorniDelegabile() {
    return numeroGiorniDelegabile;
  }
  public void setNumeroGiorniDelegabile(Integer numeroGiorniDelegabile) {
    this.numeroGiorniDelegabile = numeroGiorniDelegabile;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("url") 
 
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Servizio servizio = (Servizio) o;
    return Objects.equals(codiceServizio, servizio.codiceServizio) &&
        Objects.equals(descrizione, servizio.descrizione) &&
        Objects.equals(descrizioneEstesa, servizio.descrizioneEstesa) &&
        Objects.equals(notificabile, servizio.notificabile) &&
        Objects.equals(delegabile, servizio.delegabile) &&
        Objects.equals(arruolabile, servizio.arruolabile) &&
        Objects.equals(obbligatorioArruolamento, servizio.obbligatorioArruolamento) &&
        Objects.equals(dataInizioValidita, servizio.dataInizioValidita) &&
        Objects.equals(dataFineValidita, servizio.dataFineValidita) &&
        Objects.equals(numeroGiorniDelegabile, servizio.numeroGiorniDelegabile) &&
        Objects.equals(url, servizio.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codiceServizio, descrizione, descrizioneEstesa, notificabile, delegabile, arruolabile, obbligatorioArruolamento, dataInizioValidita, dataFineValidita, numeroGiorniDelegabile, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Servizio {\n");
    
    sb.append("    codiceServizio: ").append(toIndentedString(codiceServizio)).append("\n");
    sb.append("    descrizione: ").append(toIndentedString(descrizione)).append("\n");
    sb.append("    descrizioneEstesa: ").append(toIndentedString(descrizioneEstesa)).append("\n");
    sb.append("    notificabile: ").append(toIndentedString(notificabile)).append("\n");
    sb.append("    delegabile: ").append(toIndentedString(delegabile)).append("\n");
    sb.append("    arruolabile: ").append(toIndentedString(arruolabile)).append("\n");
    sb.append("    obbligatorioArruolamento: ").append(toIndentedString(obbligatorioArruolamento)).append("\n");
    sb.append("    dataInizioValidita: ").append(toIndentedString(dataInizioValidita)).append("\n");
    sb.append("    dataFineValidita: ").append(toIndentedString(dataFineValidita)).append("\n");
    sb.append("    numeroGiorniDelegabile: ").append(toIndentedString(numeroGiorniDelegabile)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

