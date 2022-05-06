/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanaut.dto.apisanaut;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanaut.dto.apisanaut.Cittadino;
import it.csi.apisan.apisanaut.dto.apisanaut.DichiarazioneDettaglioStato;
import it.csi.apisan.apisanaut.dto.apisanaut.DichiarazioneRuolo;
import it.csi.apisan.apisanaut.dto.apisanaut.Documento;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class DichiarazioneDettaglio   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String uuid = null;
  private DichiarazioneDettaglioStato stato = null;
  private Cittadino genitoreTutoreCuratore = null;
  private DichiarazioneRuolo ruoloGenitoreTutoreCuratore = null;
  private Cittadino figlioTutelatoCurato = null;
  private DichiarazioneRuolo ruoloFiglioTutelatoCurato = null;
  private Documento documentoFamiglia = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("uuid") 
 
  public String getUuid() {
    return uuid;
  }
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("stato") 
 
  public DichiarazioneDettaglioStato getStato() {
    return stato;
  }
  public void setStato(DichiarazioneDettaglioStato stato) {
    this.stato = stato;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("genitore_tutore_curatore") 
 
  public Cittadino getGenitoreTutoreCuratore() {
    return genitoreTutoreCuratore;
  }
  public void setGenitoreTutoreCuratore(Cittadino genitoreTutoreCuratore) {
    this.genitoreTutoreCuratore = genitoreTutoreCuratore;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ruolo_genitore_tutore_curatore") 
 
  public DichiarazioneRuolo getRuoloGenitoreTutoreCuratore() {
    return ruoloGenitoreTutoreCuratore;
  }
  public void setRuoloGenitoreTutoreCuratore(DichiarazioneRuolo ruoloGenitoreTutoreCuratore) {
    this.ruoloGenitoreTutoreCuratore = ruoloGenitoreTutoreCuratore;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("figlio_tutelato_curato") 
 
  public Cittadino getFiglioTutelatoCurato() {
    return figlioTutelatoCurato;
  }
  public void setFiglioTutelatoCurato(Cittadino figlioTutelatoCurato) {
    this.figlioTutelatoCurato = figlioTutelatoCurato;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ruolo_figlio_tutelato_curato") 
 
  public DichiarazioneRuolo getRuoloFiglioTutelatoCurato() {
    return ruoloFiglioTutelatoCurato;
  }
  public void setRuoloFiglioTutelatoCurato(DichiarazioneRuolo ruoloFiglioTutelatoCurato) {
    this.ruoloFiglioTutelatoCurato = ruoloFiglioTutelatoCurato;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("documento_famiglia") 
 
  public Documento getDocumentoFamiglia() {
    return documentoFamiglia;
  }
  public void setDocumentoFamiglia(Documento documentoFamiglia) {
    this.documentoFamiglia = documentoFamiglia;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DichiarazioneDettaglio dichiarazioneDettaglio = (DichiarazioneDettaglio) o;
    return Objects.equals(uuid, dichiarazioneDettaglio.uuid) &&
        Objects.equals(stato, dichiarazioneDettaglio.stato) &&
        Objects.equals(genitoreTutoreCuratore, dichiarazioneDettaglio.genitoreTutoreCuratore) &&
        Objects.equals(ruoloGenitoreTutoreCuratore, dichiarazioneDettaglio.ruoloGenitoreTutoreCuratore) &&
        Objects.equals(figlioTutelatoCurato, dichiarazioneDettaglio.figlioTutelatoCurato) &&
        Objects.equals(ruoloFiglioTutelatoCurato, dichiarazioneDettaglio.ruoloFiglioTutelatoCurato) &&
        Objects.equals(documentoFamiglia, dichiarazioneDettaglio.documentoFamiglia);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, stato, genitoreTutoreCuratore, ruoloGenitoreTutoreCuratore, figlioTutelatoCurato, ruoloFiglioTutelatoCurato, documentoFamiglia);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DichiarazioneDettaglio {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    stato: ").append(toIndentedString(stato)).append("\n");
    sb.append("    genitoreTutoreCuratore: ").append(toIndentedString(genitoreTutoreCuratore)).append("\n");
    sb.append("    ruoloGenitoreTutoreCuratore: ").append(toIndentedString(ruoloGenitoreTutoreCuratore)).append("\n");
    sb.append("    figlioTutelatoCurato: ").append(toIndentedString(figlioTutelatoCurato)).append("\n");
    sb.append("    ruoloFiglioTutelatoCurato: ").append(toIndentedString(ruoloFiglioTutelatoCurato)).append("\n");
    sb.append("    documentoFamiglia: ").append(toIndentedString(documentoFamiglia)).append("\n");
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

