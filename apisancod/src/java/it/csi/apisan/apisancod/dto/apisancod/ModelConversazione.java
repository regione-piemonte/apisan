/*******************************************************************************

* Copyright Regione Piemonte - 2023

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancod.dto.apisancod;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import io.swagger.annotations.ApiModel;
import it.csi.apisan.apisancod.dto.apisancod.ModelAutore;
import it.csi.apisan.apisancod.dto.apisancod.ModelMedico;
import it.csi.apisan.apisancod.dto.apisancod.ModelMotivoBlocco;
import it.csi.apisan.apisancod.dto.apisancod.ModelUltimoMessaggio;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;

public class ModelConversazione   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String id = null;
  private ModelMedico medico = null;
  private String argomento = null;
  private Integer nMessaggiNonLetti = null;
  private Boolean solaLettura = null;
  private ModelUltimoMessaggio ultimoMessaggio = null;
  private String dataCreazione = null;
  private ModelMotivoBlocco motivoBlocco = null;
  private String motivazioneMedico = null;
  private ModelAutore autore = null;

  /**
   * Identificativo univoco
   **/
  

  @JsonProperty("id") 
 
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  

  @JsonProperty("medico") 
 
  public ModelMedico getMedico() {
    return medico;
  }
  public void setMedico(ModelMedico medico) {
    this.medico = medico;
  }

  /**
   * L&#39;argomento della conversazione
   **/
  

  @JsonProperty("argomento") 
 
  public String getArgomento() {
    return argomento;
  }
  public void setArgomento(String argomento) {
    this.argomento = argomento;
  }

  /**
   * Il numero dei messaggi ancora non letti della conversazione
   **/
  

  @JsonProperty("n_messaggi_non_letti") 
 
  public Integer getNMessaggiNonLetti() {
    return nMessaggiNonLetti;
  }
  public void setNMessaggiNonLetti(Integer nMessaggiNonLetti) {
    this.nMessaggiNonLetti = nMessaggiNonLetti;
  }

  /**
   * Indica se la conversazione è in sola lettura
   **/
  

  @JsonProperty("sola_lettura") 
 
  public Boolean isSolaLettura() {
    return solaLettura;
  }
  public void setSolaLettura(Boolean solaLettura) {
    this.solaLettura = solaLettura;
  }

  /**
   **/
  

  @JsonProperty("ultimo_messaggio") 
 
  public ModelUltimoMessaggio getUltimoMessaggio() {
    return ultimoMessaggio;
  }
  public void setUltimoMessaggio(ModelUltimoMessaggio ultimoMessaggio) {
    this.ultimoMessaggio = ultimoMessaggio;
  }

  /**
   * La data in cui è stata creata la conversazione
   **/
  

  @JsonProperty("data_creazione") 
 
  public String getDataCreazione() {
    return dataCreazione;
  }
  public void setDataCreazione(String dataCreazione) {
    this.dataCreazione = dataCreazione;
  }

  /**
   **/
  

  @JsonProperty("motivo_blocco") 
 
  public ModelMotivoBlocco getMotivoBlocco() {
    return motivoBlocco;
  }
  public void setMotivoBlocco(ModelMotivoBlocco motivoBlocco) {
    this.motivoBlocco = motivoBlocco;
  }

  /**
   * La motivazione scritta dal medico quando blocca un assistito
   **/
  

  @JsonProperty("motivazione_medico") 
 
  public String getMotivazioneMedico() {
    return motivazioneMedico;
  }
  public void setMotivazioneMedico(String motivazioneMedico) {
    this.motivazioneMedico = motivazioneMedico;
  }

  /**
   **/
  

  @JsonProperty("autore") 
 
  public ModelAutore getAutore() {
    return autore;
  }
  public void setAutore(ModelAutore autore) {
    this.autore = autore;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelConversazione modelConversazione = (ModelConversazione) o;
    return Objects.equals(id, modelConversazione.id) &&
        Objects.equals(medico, modelConversazione.medico) &&
        Objects.equals(argomento, modelConversazione.argomento) &&
        Objects.equals(nMessaggiNonLetti, modelConversazione.nMessaggiNonLetti) &&
        Objects.equals(solaLettura, modelConversazione.solaLettura) &&
        Objects.equals(ultimoMessaggio, modelConversazione.ultimoMessaggio) &&
        Objects.equals(dataCreazione, modelConversazione.dataCreazione) &&
        Objects.equals(motivoBlocco, modelConversazione.motivoBlocco) &&
        Objects.equals(motivazioneMedico, modelConversazione.motivazioneMedico) &&
        Objects.equals(autore, modelConversazione.autore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, medico, argomento, nMessaggiNonLetti, solaLettura, ultimoMessaggio, dataCreazione, motivoBlocco, motivazioneMedico, autore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelConversazione {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    medico: ").append(toIndentedString(medico)).append("\n");
    sb.append("    argomento: ").append(toIndentedString(argomento)).append("\n");
    sb.append("    nMessaggiNonLetti: ").append(toIndentedString(nMessaggiNonLetti)).append("\n");
    sb.append("    solaLettura: ").append(toIndentedString(solaLettura)).append("\n");
    sb.append("    ultimoMessaggio: ").append(toIndentedString(ultimoMessaggio)).append("\n");
    sb.append("    dataCreazione: ").append(toIndentedString(dataCreazione)).append("\n");
    sb.append("    motivoBlocco: ").append(toIndentedString(motivoBlocco)).append("\n");
    sb.append("    motivazioneMedico: ").append(toIndentedString(motivazioneMedico)).append("\n");
    sb.append("    autore: ").append(toIndentedString(autore)).append("\n");
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

