/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelTipoDato;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelOscuramento   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String fonteOscuramento = null;
  private String idDocumento = null;
  private String codiceCl = null;
  private String tipoScreening = null;
  private Date dataEsame = null;
  private String tipoEsame = null;
  private ModelTipoDato tipoDiDato = null;
  private Boolean oscurato = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("fonte_oscuramento") 
 
  public String getFonteOscuramento() {
    return fonteOscuramento;
  }
  public void setFonteOscuramento(String fonteOscuramento) {
    this.fonteOscuramento = fonteOscuramento;
  }

  /**
   * id del documento da oscurare, da valorizzare nel caso in cui il tipo di dato codice valga DOC o DOCPER
   **/
  
  @ApiModelProperty(value = "id del documento da oscurare, da valorizzare nel caso in cui il tipo di dato codice valga DOC o DOCPER")
  @JsonProperty("id_documento") 
 
  public String getIdDocumento() {
    return idDocumento;
  }
  public void setIdDocumento(String idDocumento) {
    this.idDocumento = idDocumento;
  }

  /**
   * codice componente locale deve essere valorizzato nel caso in cui si stia oscurando un documento proveniente da un&#39;asr
   **/
  
  @ApiModelProperty(value = "codice componente locale deve essere valorizzato nel caso in cui si stia oscurando un documento proveniente da un'asr")
  @JsonProperty("codice_cl") 
 
  public String getCodiceCl() {
    return codiceCl;
  }
  public void setCodiceCl(String codiceCl) {
    this.codiceCl = codiceCl;
  }

  /**
   * da valorizzare nel caso in cui il tipo di dato codice valga SCR
   **/
  
  @ApiModelProperty(value = "da valorizzare nel caso in cui il tipo di dato codice valga SCR")
  @JsonProperty("tipo_screening") 
 
  public String getTipoScreening() {
    return tipoScreening;
  }
  public void setTipoScreening(String tipoScreening) {
    this.tipoScreening = tipoScreening;
  }

  /**
   * data dell&#39;esame da valorizzare nel caso in cui il tipo di dato codice valga SCR
   **/
  
  @ApiModelProperty(value = "data dell'esame da valorizzare nel caso in cui il tipo di dato codice valga SCR")
  @JsonProperty("data_esame") 
 
  public Date getDataEsame() {
    return dataEsame;
  }
  public void setDataEsame(Date dataEsame) {
    this.dataEsame = dataEsame;
  }

  /**
   * da valorizzare nel caso in cui il tipo di dato codice valga SCR
   **/
  
  @ApiModelProperty(value = "da valorizzare nel caso in cui il tipo di dato codice valga SCR")
  @JsonProperty("tipo_esame") 
 
  public String getTipoEsame() {
    return tipoEsame;
  }
  public void setTipoEsame(String tipoEsame) {
    this.tipoEsame = tipoEsame;
  }

  /**
   * codice del tipo di dato può valere DOCPER (per documenti personali), DOC (per docuemnti), ESE (per esenzioni), SCR (per screening)
   **/
  
  @ApiModelProperty(value = "codice del tipo di dato può valere DOCPER (per documenti personali), DOC (per docuemnti), ESE (per esenzioni), SCR (per screening)")
  @JsonProperty("tipo_di_dato") 
 
  public ModelTipoDato getTipoDiDato() {
    return tipoDiDato;
  }
  public void setTipoDiDato(ModelTipoDato tipoDiDato) {
    this.tipoDiDato = tipoDiDato;
  }

  /**
   * indica se si oscura o meno il dato passato nel payload
   **/
  
  @ApiModelProperty(value = "indica se si oscura o meno il dato passato nel payload")
  @JsonProperty("oscurato") 
 
  public Boolean isOscurato() {
    return oscurato;
  }
  public void setOscurato(Boolean oscurato) {
    this.oscurato = oscurato;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelOscuramento modelOscuramento = (ModelOscuramento) o;
    return Objects.equals(fonteOscuramento, modelOscuramento.fonteOscuramento) &&
        Objects.equals(idDocumento, modelOscuramento.idDocumento) &&
        Objects.equals(codiceCl, modelOscuramento.codiceCl) &&
        Objects.equals(tipoScreening, modelOscuramento.tipoScreening) &&
        Objects.equals(dataEsame, modelOscuramento.dataEsame) &&
        Objects.equals(tipoEsame, modelOscuramento.tipoEsame) &&
        Objects.equals(tipoDiDato, modelOscuramento.tipoDiDato) &&
        Objects.equals(oscurato, modelOscuramento.oscurato);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fonteOscuramento, idDocumento, codiceCl, tipoScreening, dataEsame, tipoEsame, tipoDiDato, oscurato);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelOscuramento {\n");
    
    sb.append("    fonteOscuramento: ").append(toIndentedString(fonteOscuramento)).append("\n");
    sb.append("    idDocumento: ").append(toIndentedString(idDocumento)).append("\n");
    sb.append("    codiceCl: ").append(toIndentedString(codiceCl)).append("\n");
    sb.append("    tipoScreening: ").append(toIndentedString(tipoScreening)).append("\n");
    sb.append("    dataEsame: ").append(toIndentedString(dataEsame)).append("\n");
    sb.append("    tipoEsame: ").append(toIndentedString(tipoEsame)).append("\n");
    sb.append("    tipoDiDato: ").append(toIndentedString(tipoDiDato)).append("\n");
    sb.append("    oscurato: ").append(toIndentedString(oscurato)).append("\n");
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

