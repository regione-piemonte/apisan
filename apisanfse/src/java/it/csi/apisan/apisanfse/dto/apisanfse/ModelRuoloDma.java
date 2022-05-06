/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanfse.dto.apisanfse.AziendaSanitaria;
import it.csi.apisan.apisanfse.dto.apisanfse.Profilo;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelRuoloDma   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String codice = null;
  private String descrizione = null;
  private String riferimento = null;
  private AziendaSanitaria aziendaSanitaria = null;
  private Profilo profilo = null;
  private String flagVisibilePerConsenso = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("codice") 
 
  public String getCodice() {
    return codice;
  }
  public void setCodice(String codice) {
    this.codice = codice;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("descrizione") 
 
  public String getDescrizione() {
    return descrizione;
  }
  public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("riferimento") 
 
  public String getRiferimento() {
    return riferimento;
  }
  public void setRiferimento(String riferimento) {
    this.riferimento = riferimento;
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
  @JsonProperty("profilo") 
 
  public Profilo getProfilo() {
    return profilo;
  }
  public void setProfilo(Profilo profilo) {
    this.profilo = profilo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("flag_visibile_per_consenso") 
 
  public String getFlagVisibilePerConsenso() {
    return flagVisibilePerConsenso;
  }
  public void setFlagVisibilePerConsenso(String flagVisibilePerConsenso) {
    this.flagVisibilePerConsenso = flagVisibilePerConsenso;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelRuoloDma modelRuoloDma = (ModelRuoloDma) o;
    return Objects.equals(codice, modelRuoloDma.codice) &&
        Objects.equals(descrizione, modelRuoloDma.descrizione) &&
        Objects.equals(riferimento, modelRuoloDma.riferimento) &&
        Objects.equals(aziendaSanitaria, modelRuoloDma.aziendaSanitaria) &&
        Objects.equals(profilo, modelRuoloDma.profilo) &&
        Objects.equals(flagVisibilePerConsenso, modelRuoloDma.flagVisibilePerConsenso);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codice, descrizione, riferimento, aziendaSanitaria, profilo, flagVisibilePerConsenso);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelRuoloDma {\n");
    
    sb.append("    codice: ").append(toIndentedString(codice)).append("\n");
    sb.append("    descrizione: ").append(toIndentedString(descrizione)).append("\n");
    sb.append("    riferimento: ").append(toIndentedString(riferimento)).append("\n");
    sb.append("    aziendaSanitaria: ").append(toIndentedString(aziendaSanitaria)).append("\n");
    sb.append("    profilo: ").append(toIndentedString(profilo)).append("\n");
    sb.append("    flagVisibilePerConsenso: ").append(toIndentedString(flagVisibilePerConsenso)).append("\n");
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

