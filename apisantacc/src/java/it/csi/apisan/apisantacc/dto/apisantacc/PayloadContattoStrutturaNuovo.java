/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.dto.apisantacc;

import java.util.Objects;
import java.util.ArrayList;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class PayloadContattoStrutturaNuovo   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String denominazione = null;
  private Date dataContattoInizio = null;
  private Date dataContattoFine = null;
  private String motivazione = null;
  private String medicinaNonConvenzionaleTipoContatto = null;
  private String tipoContattoCodice = null;
  private String strutturaTipoCodice = null;

  /**
   * La denominazione inserita dall&#39;utente
   **/
  
  @ApiModelProperty(value = "La denominazione inserita dall'utente")
  @JsonProperty("denominazione") 
 
  public String getDenominazione() {
    return denominazione;
  }
  public void setDenominazione(String denominazione) {
    this.denominazione = denominazione;
  }

  /**
   * La data di inizio contatto
   **/
  
  @ApiModelProperty(value = "La data di inizio contatto")
  @JsonProperty("data_contatto_inizio") 
 
  public Date getDataContattoInizio() {
    return dataContattoInizio;
  }
  public void setDataContattoInizio(Date dataContattoInizio) {
    this.dataContattoInizio = dataContattoInizio;
  }

  /**
   * La data di fine contatto
   **/
  
  @ApiModelProperty(value = "La data di fine contatto")
  @JsonProperty("data_contatto_fine") 
 
  public Date getDataContattoFine() {
    return dataContattoFine;
  }
  public void setDataContattoFine(Date dataContattoFine) {
    this.dataContattoFine = dataContattoFine;
  }

  /**
   * La motivazione inserita dall&#39;utente Questo campo viene popolato solo in caso cui il tipo contatto è \&quot;strutture sanitarie\&quot; 
   **/
  
  @ApiModelProperty(value = "La motivazione inserita dall'utente Questo campo viene popolato solo in caso cui il tipo contatto è \"strutture sanitarie\" ")
  @JsonProperty("motivazione") 
 
  public String getMotivazione() {
    return motivazione;
  }
  public void setMotivazione(String motivazione) {
    this.motivazione = motivazione;
  }

  /**
   * Questo campo viene popolato solo in caso cui il tipo struttura è \&quot;medicina non convenzionale\&quot; 
   **/
  
  @ApiModelProperty(value = "Questo campo viene popolato solo in caso cui il tipo struttura è \"medicina non convenzionale\" ")
  @JsonProperty("medicina_non_convenzionale_tipo_contatto") 
 
  public String getMedicinaNonConvenzionaleTipoContatto() {
    return medicinaNonConvenzionaleTipoContatto;
  }
  public void setMedicinaNonConvenzionaleTipoContatto(String medicinaNonConvenzionaleTipoContatto) {
    this.medicinaNonConvenzionaleTipoContatto = medicinaNonConvenzionaleTipoContatto;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tipo_contatto_codice") 
 
  public String getTipoContattoCodice() {
    return tipoContattoCodice;
  }
  public void setTipoContattoCodice(String tipoContattoCodice) {
    this.tipoContattoCodice = tipoContattoCodice;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("struttura_tipo_codice") 
 
  public String getStrutturaTipoCodice() {
    return strutturaTipoCodice;
  }
  public void setStrutturaTipoCodice(String strutturaTipoCodice) {
    this.strutturaTipoCodice = strutturaTipoCodice;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayloadContattoStrutturaNuovo payloadContattoStrutturaNuovo = (PayloadContattoStrutturaNuovo) o;
    return Objects.equals(denominazione, payloadContattoStrutturaNuovo.denominazione) &&
        Objects.equals(dataContattoInizio, payloadContattoStrutturaNuovo.dataContattoInizio) &&
        Objects.equals(dataContattoFine, payloadContattoStrutturaNuovo.dataContattoFine) &&
        Objects.equals(motivazione, payloadContattoStrutturaNuovo.motivazione) &&
        Objects.equals(medicinaNonConvenzionaleTipoContatto, payloadContattoStrutturaNuovo.medicinaNonConvenzionaleTipoContatto) &&
        Objects.equals(tipoContattoCodice, payloadContattoStrutturaNuovo.tipoContattoCodice) &&
        Objects.equals(strutturaTipoCodice, payloadContattoStrutturaNuovo.strutturaTipoCodice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(denominazione, dataContattoInizio, dataContattoFine, motivazione, medicinaNonConvenzionaleTipoContatto, tipoContattoCodice, strutturaTipoCodice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadContattoStrutturaNuovo {\n");
    
    sb.append("    denominazione: ").append(toIndentedString(denominazione)).append("\n");
    sb.append("    dataContattoInizio: ").append(toIndentedString(dataContattoInizio)).append("\n");
    sb.append("    dataContattoFine: ").append(toIndentedString(dataContattoFine)).append("\n");
    sb.append("    motivazione: ").append(toIndentedString(motivazione)).append("\n");
    sb.append("    medicinaNonConvenzionaleTipoContatto: ").append(toIndentedString(medicinaNonConvenzionaleTipoContatto)).append("\n");
    sb.append("    tipoContattoCodice: ").append(toIndentedString(tipoContattoCodice)).append("\n");
    sb.append("    strutturaTipoCodice: ").append(toIndentedString(strutturaTipoCodice)).append("\n");
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

