/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.dto.scerev;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanscerev.dto.scerev.ModelAsl;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelControlloCombinazione   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private Boolean ammessa = null;
  private Boolean derogaTerritoriale = null;
  private Boolean derogaAssociazione = null;
  private Boolean derogaPls = null;
  private Boolean derogaMmg = null;
  private Boolean variazioneAsl = null;
  private Boolean ricusazione = null;
  private ModelAsl aslIscrizione = null;
  private ModelAsl aslDomicilio = null;
  private ModelAsl aslResidenza = null;

  /**
   * true se la combinazione è ammessa, false altrimenti.  Se false il front-end blocca la procedura notificando all&#39;utente l&#39;inammissibilità della soluzione scelta 
   **/
  
  @ApiModelProperty(example = "true", value = "true se la combinazione è ammessa, false altrimenti.  Se false il front-end blocca la procedura notificando all'utente l'inammissibilità della soluzione scelta ")
  @JsonProperty("ammessa") 
 
  public Boolean isAmmessa() {
    return ammessa;
  }
  public void setAmmessa(Boolean ammessa) {
    this.ammessa = ammessa;
  }

  /**
   * true se c&#39;è deroga territoriale, false altrimenti.  Se true il front-end richiederà all&#39;utente il consenso del medico 
   **/
  
  @ApiModelProperty(example = "true", value = "true se c'è deroga territoriale, false altrimenti.  Se true il front-end richiederà all'utente il consenso del medico ")
  @JsonProperty("derogaTerritoriale") 
 
  public Boolean isDerogaTerritoriale() {
    return derogaTerritoriale;
  }
  public void setDerogaTerritoriale(Boolean derogaTerritoriale) {
    this.derogaTerritoriale = derogaTerritoriale;
  }

  /**
   * true se c&#39;è deroga per associazione, false altrimenti  Se true il front-end richiederà all&#39;utente il consenso del medico 
   **/
  
  @ApiModelProperty(example = "false", value = "true se c'è deroga per associazione, false altrimenti  Se true il front-end richiederà all'utente il consenso del medico ")
  @JsonProperty("derogaAssociazione") 
 
  public Boolean isDerogaAssociazione() {
    return derogaAssociazione;
  }
  public void setDerogaAssociazione(Boolean derogaAssociazione) {
    this.derogaAssociazione = derogaAssociazione;
  }

  /**
   * true se c&#39;è deroga per pediatra, false altrimenti  Se true il front-end richiederà all&#39;utente il consenso del medico 
   **/
  
  @ApiModelProperty(example = "false", value = "true se c'è deroga per pediatra, false altrimenti  Se true il front-end richiederà all'utente il consenso del medico ")
  @JsonProperty("derogaPls") 
 
  public Boolean isDerogaPls() {
    return derogaPls;
  }
  public void setDerogaPls(Boolean derogaPls) {
    this.derogaPls = derogaPls;
  }

  /**
   * true se c&#39;è deroga per medico generale, false altrimenti  Se true il front-end richiederà all&#39;utente il consenso del medico 
   **/
  
  @ApiModelProperty(example = "false", value = "true se c'è deroga per medico generale, false altrimenti  Se true il front-end richiederà all'utente il consenso del medico ")
  @JsonProperty("derogaMmg") 
 
  public Boolean isDerogaMmg() {
    return derogaMmg;
  }
  public void setDerogaMmg(Boolean derogaMmg) {
    this.derogaMmg = derogaMmg;
  }

  /**
   * true se c&#39;è una variazione dell&#39;asl di domicilio o residenza rispetto a quelle presenti nel sistema, false altrimenti 
   **/
  
  @ApiModelProperty(example = "true", value = "true se c'è una variazione dell'asl di domicilio o residenza rispetto a quelle presenti nel sistema, false altrimenti ")
  @JsonProperty("variazioneAsl") 
 
  public Boolean isVariazioneAsl() {
    return variazioneAsl;
  }
  public void setVariazioneAsl(Boolean variazioneAsl) {
    this.variazioneAsl = variazioneAsl;
  }

  /**
   * Indica se il medico non vuole più essere scelto da un assistito 
   **/
  
  @ApiModelProperty(value = "Indica se il medico non vuole più essere scelto da un assistito ")
  @JsonProperty("ricusazione") 
 
  public Boolean isRicusazione() {
    return ricusazione;
  }
  public void setRicusazione(Boolean ricusazione) {
    this.ricusazione = ricusazione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("aslIscrizione") 
 
  public ModelAsl getAslIscrizione() {
    return aslIscrizione;
  }
  public void setAslIscrizione(ModelAsl aslIscrizione) {
    this.aslIscrizione = aslIscrizione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("aslDomicilio") 
 
  public ModelAsl getAslDomicilio() {
    return aslDomicilio;
  }
  public void setAslDomicilio(ModelAsl aslDomicilio) {
    this.aslDomicilio = aslDomicilio;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("aslResidenza") 
 
  public ModelAsl getAslResidenza() {
    return aslResidenza;
  }
  public void setAslResidenza(ModelAsl aslResidenza) {
    this.aslResidenza = aslResidenza;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelControlloCombinazione modelControlloCombinazione = (ModelControlloCombinazione) o;
    return Objects.equals(ammessa, modelControlloCombinazione.ammessa) &&
        Objects.equals(derogaTerritoriale, modelControlloCombinazione.derogaTerritoriale) &&
        Objects.equals(derogaAssociazione, modelControlloCombinazione.derogaAssociazione) &&
        Objects.equals(derogaPls, modelControlloCombinazione.derogaPls) &&
        Objects.equals(derogaMmg, modelControlloCombinazione.derogaMmg) &&
        Objects.equals(variazioneAsl, modelControlloCombinazione.variazioneAsl) &&
        Objects.equals(ricusazione, modelControlloCombinazione.ricusazione) &&
        Objects.equals(aslIscrizione, modelControlloCombinazione.aslIscrizione) &&
        Objects.equals(aslDomicilio, modelControlloCombinazione.aslDomicilio) &&
        Objects.equals(aslResidenza, modelControlloCombinazione.aslResidenza);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ammessa, derogaTerritoriale, derogaAssociazione, derogaPls, derogaMmg, variazioneAsl, ricusazione, aslIscrizione, aslDomicilio, aslResidenza);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelControlloCombinazione {\n");
    
    sb.append("    ammessa: ").append(toIndentedString(ammessa)).append("\n");
    sb.append("    derogaTerritoriale: ").append(toIndentedString(derogaTerritoriale)).append("\n");
    sb.append("    derogaAssociazione: ").append(toIndentedString(derogaAssociazione)).append("\n");
    sb.append("    derogaPls: ").append(toIndentedString(derogaPls)).append("\n");
    sb.append("    derogaMmg: ").append(toIndentedString(derogaMmg)).append("\n");
    sb.append("    variazioneAsl: ").append(toIndentedString(variazioneAsl)).append("\n");
    sb.append("    ricusazione: ").append(toIndentedString(ricusazione)).append("\n");
    sb.append("    aslIscrizione: ").append(toIndentedString(aslIscrizione)).append("\n");
    sb.append("    aslDomicilio: ").append(toIndentedString(aslDomicilio)).append("\n");
    sb.append("    aslResidenza: ").append(toIndentedString(aslResidenza)).append("\n");
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

