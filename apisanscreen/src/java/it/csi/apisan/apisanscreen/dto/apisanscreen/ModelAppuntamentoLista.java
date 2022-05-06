/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.dto.apisanscreen;

import java.util.Objects;
import java.util.ArrayList;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelAppuntamentoLista   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private Date data = null;
  private String ora = null;
  private String luogo = null;
  private String dataEsitoUltimo = null;
  private String dataSollecitoUltimo = null;
  private String dataConvocazioneUltimo = null;
  private String statoCodice = null;
  private Integer agendaCodice = null;
  private String appVisibile = null;

  /**
   * Il giorno dell&#39;appuntamento
   **/
  
  @ApiModelProperty(value = "Il giorno dell'appuntamento")
  @JsonProperty("data") 
 
  public Date getData() {
    return data;
  }
  public void setData(Date data) {
    this.data = data;
  }

  /**
   * L&#39;orario dell&#39;appuntamento
   **/
  
  @ApiModelProperty(example = "12:05", value = "L'orario dell'appuntamento")
  @JsonProperty("ora") 
 
  public String getOra() {
    return ora;
  }
  public void setOra(String ora) {
    this.ora = ora;
  }

  /**
   * La descrizione dell&#39;unità operativa presso cui si svolgerà l&#39;appuntamento
   **/
  
  @ApiModelProperty(value = "La descrizione dell'unità operativa presso cui si svolgerà l'appuntamento")
  @JsonProperty("luogo") 
 
  public String getLuogo() {
    return luogo;
  }
  public void setLuogo(String luogo) {
    this.luogo = luogo;
  }

  /**
   * Data ultimo invio esito
   **/
  
  @ApiModelProperty(value = "Data ultimo invio esito")
  @JsonProperty("data_esito_ultimo") 
 
  public String getDataEsitoUltimo() {
    return dataEsitoUltimo;
  }
  public void setDataEsitoUltimo(String dataEsitoUltimo) {
    this.dataEsitoUltimo = dataEsitoUltimo;
  }

  /**
   * Data ultimo invio sollecito
   **/
  
  @ApiModelProperty(value = "Data ultimo invio sollecito")
  @JsonProperty("data_sollecito_ultimo") 
 
  public String getDataSollecitoUltimo() {
    return dataSollecitoUltimo;
  }
  public void setDataSollecitoUltimo(String dataSollecitoUltimo) {
    this.dataSollecitoUltimo = dataSollecitoUltimo;
  }

  /**
   * Data ultimo invio invito GOI
   **/
  
  @ApiModelProperty(value = "Data ultimo invio invito GOI")
  @JsonProperty("data_convocazione_ultimo") 
 
  public String getDataConvocazioneUltimo() {
    return dataConvocazioneUltimo;
  }
  public void setDataConvocazioneUltimo(String dataConvocazioneUltimo) {
    this.dataConvocazioneUltimo = dataConvocazioneUltimo;
  }

  /**
   * Il codice dello stato attuale citologico del cittadino
   **/
  
  @ApiModelProperty(value = "Il codice dello stato attuale citologico del cittadino")
  @JsonProperty("stato_codice") 
 
  public String getStatoCodice() {
    return statoCodice;
  }
  public void setStatoCodice(String statoCodice) {
    this.statoCodice = statoCodice;
  }

  /**
   * Il codice dell&#39;agenda citologica
   **/
  
  @ApiModelProperty(value = "Il codice dell'agenda citologica")
  @JsonProperty("agenda_codice") 
 
  public Integer getAgendaCodice() {
    return agendaCodice;
  }
  public void setAgendaCodice(Integer agendaCodice) {
    this.agendaCodice = agendaCodice;
  }

  /**
   * indica se l&#39;appuntamento sia visibile o meno può valere S, N o UO
   **/
  
  @ApiModelProperty(value = "indica se l'appuntamento sia visibile o meno può valere S, N o UO")
  @JsonProperty("app_visibile") 
 
  public String getAppVisibile() {
    return appVisibile;
  }
  public void setAppVisibile(String appVisibile) {
    this.appVisibile = appVisibile;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelAppuntamentoLista modelAppuntamentoLista = (ModelAppuntamentoLista) o;
    return Objects.equals(data, modelAppuntamentoLista.data) &&
        Objects.equals(ora, modelAppuntamentoLista.ora) &&
        Objects.equals(luogo, modelAppuntamentoLista.luogo) &&
        Objects.equals(dataEsitoUltimo, modelAppuntamentoLista.dataEsitoUltimo) &&
        Objects.equals(dataSollecitoUltimo, modelAppuntamentoLista.dataSollecitoUltimo) &&
        Objects.equals(dataConvocazioneUltimo, modelAppuntamentoLista.dataConvocazioneUltimo) &&
        Objects.equals(statoCodice, modelAppuntamentoLista.statoCodice) &&
        Objects.equals(agendaCodice, modelAppuntamentoLista.agendaCodice) &&
        Objects.equals(appVisibile, modelAppuntamentoLista.appVisibile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, ora, luogo, dataEsitoUltimo, dataSollecitoUltimo, dataConvocazioneUltimo, statoCodice, agendaCodice, appVisibile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelAppuntamentoLista {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    ora: ").append(toIndentedString(ora)).append("\n");
    sb.append("    luogo: ").append(toIndentedString(luogo)).append("\n");
    sb.append("    dataEsitoUltimo: ").append(toIndentedString(dataEsitoUltimo)).append("\n");
    sb.append("    dataSollecitoUltimo: ").append(toIndentedString(dataSollecitoUltimo)).append("\n");
    sb.append("    dataConvocazioneUltimo: ").append(toIndentedString(dataConvocazioneUltimo)).append("\n");
    sb.append("    statoCodice: ").append(toIndentedString(statoCodice)).append("\n");
    sb.append("    agendaCodice: ").append(toIndentedString(agendaCodice)).append("\n");
    sb.append("    appVisibile: ").append(toIndentedString(appVisibile)).append("\n");
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

