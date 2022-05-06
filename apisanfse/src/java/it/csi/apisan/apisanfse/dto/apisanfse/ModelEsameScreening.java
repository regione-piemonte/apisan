/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanfse.dto.apisanfse.AziendaSanitaria;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelDettaglioEsame;
import it.csi.apisan.apisanfse.dto.apisanfse.TipoEsame;
import it.csi.apisan.apisanfse.dto.apisanfse.UnitaOperativaSanitaria;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelEsameScreening   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private Date data = null;
  private TipoEsame tipoEsame = null;
  private String esito = null;
  private AziendaSanitaria aziendaSanitaria = null;
  private UnitaOperativaSanitaria unitaOperativa = null;
  private String oscurato = null;
  private ModelDettaglioEsame dettaglio = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data") 
 
  public Date getData() {
    return data;
  }
  public void setData(Date data) {
    this.data = data;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tipo_esame") 
 
  public TipoEsame getTipoEsame() {
    return tipoEsame;
  }
  public void setTipoEsame(TipoEsame tipoEsame) {
    this.tipoEsame = tipoEsame;
  }

  /**
   * esito dell&#39;esame
   **/
  
  @ApiModelProperty(value = "esito dell'esame")
  @JsonProperty("esito") 
 
  public String getEsito() {
    return esito;
  }
  public void setEsito(String esito) {
    this.esito = esito;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("azienda_sanitaria") 
 
  public AziendaSanitaria getAziendaSanitaria() {
    return aziendaSanitaria;
  }
  public void setAziendaSanitaria(AziendaSanitaria aziendaSanitaria) {
    this.aziendaSanitaria = aziendaSanitaria;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("unita_operativa") 
 
  public UnitaOperativaSanitaria getUnitaOperativa() {
    return unitaOperativa;
  }
  public void setUnitaOperativa(UnitaOperativaSanitaria unitaOperativa) {
    this.unitaOperativa = unitaOperativa;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("oscurato") 
 
  public String getOscurato() {
    return oscurato;
  }
  public void setOscurato(String oscurato) {
    this.oscurato = oscurato;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dettaglio") 
 
  public ModelDettaglioEsame getDettaglio() {
    return dettaglio;
  }
  public void setDettaglio(ModelDettaglioEsame dettaglio) {
    this.dettaglio = dettaglio;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelEsameScreening modelEsameScreening = (ModelEsameScreening) o;
    return Objects.equals(data, modelEsameScreening.data) &&
        Objects.equals(tipoEsame, modelEsameScreening.tipoEsame) &&
        Objects.equals(esito, modelEsameScreening.esito) &&
        Objects.equals(aziendaSanitaria, modelEsameScreening.aziendaSanitaria) &&
        Objects.equals(unitaOperativa, modelEsameScreening.unitaOperativa) &&
        Objects.equals(oscurato, modelEsameScreening.oscurato) &&
        Objects.equals(dettaglio, modelEsameScreening.dettaglio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, tipoEsame, esito, aziendaSanitaria, unitaOperativa, oscurato, dettaglio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelEsameScreening {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    tipoEsame: ").append(toIndentedString(tipoEsame)).append("\n");
    sb.append("    esito: ").append(toIndentedString(esito)).append("\n");
    sb.append("    aziendaSanitaria: ").append(toIndentedString(aziendaSanitaria)).append("\n");
    sb.append("    unitaOperativa: ").append(toIndentedString(unitaOperativa)).append("\n");
    sb.append("    oscurato: ").append(toIndentedString(oscurato)).append("\n");
    sb.append("    dettaglio: ").append(toIndentedString(dettaglio)).append("\n");
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

