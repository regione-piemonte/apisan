/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanfse.dto.apisanfse.AziendaSanitaria;
import it.csi.apisan.apisanfse.dto.apisanfse.ComponenteLocaleTipo;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ComponenteLocale   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String codice = null;
  private String descrizione = null;
  private String riferimento = null;
  private AziendaSanitaria aziendaSanitaria = null;
  private ComponenteLocaleTipo componenteLocaleTipo = null;

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
  @JsonProperty("componente_locale_tipo") 
 
  public ComponenteLocaleTipo getComponenteLocaleTipo() {
    return componenteLocaleTipo;
  }
  public void setComponenteLocaleTipo(ComponenteLocaleTipo componenteLocaleTipo) {
    this.componenteLocaleTipo = componenteLocaleTipo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponenteLocale componenteLocale = (ComponenteLocale) o;
    return Objects.equals(codice, componenteLocale.codice) &&
        Objects.equals(descrizione, componenteLocale.descrizione) &&
        Objects.equals(riferimento, componenteLocale.riferimento) &&
        Objects.equals(aziendaSanitaria, componenteLocale.aziendaSanitaria) &&
        Objects.equals(componenteLocaleTipo, componenteLocale.componenteLocaleTipo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codice, descrizione, riferimento, aziendaSanitaria, componenteLocaleTipo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComponenteLocale {\n");
    
    sb.append("    codice: ").append(toIndentedString(codice)).append("\n");
    sb.append("    descrizione: ").append(toIndentedString(descrizione)).append("\n");
    sb.append("    riferimento: ").append(toIndentedString(riferimento)).append("\n");
    sb.append("    aziendaSanitaria: ").append(toIndentedString(aziendaSanitaria)).append("\n");
    sb.append("    componenteLocaleTipo: ").append(toIndentedString(componenteLocaleTipo)).append("\n");
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

