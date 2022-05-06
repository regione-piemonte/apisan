/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanfse.dto.apisanfse.AziendaSanitaria;
import it.csi.apisan.apisanfse.dto.apisanfse.Codifica;
import it.csi.apisan.apisanfse.dto.apisanfse.ComponenteLocaleTipo;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelServizio;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelComponenteLocale   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String codice = null;
  private String descrizione = null;
  private String riferimento = null;
  private AziendaSanitaria aziendaSanitaria = null;
  private ComponenteLocaleTipo componenteLocaleTipo = null;
  private List<ModelServizio> servizi = new ArrayList<ModelServizio>();
  private Boolean erroreRegistrazioneConsenso = null;
  private List<Codifica> errori = new ArrayList<Codifica>();
  private Codifica stato = null;
  private Long tempoMaxAttesaClInSec = null;
  private Long tempoMaxRestituzioneDatiInSec = null;

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

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("servizi") 
 
  public List<ModelServizio> getServizi() {
    return servizi;
  }
  public void setServizi(List<ModelServizio> servizi) {
    this.servizi = servizi;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("errore_registrazione_consenso") 
 
  public Boolean isErroreRegistrazioneConsenso() {
    return erroreRegistrazioneConsenso;
  }
  public void setErroreRegistrazioneConsenso(Boolean erroreRegistrazioneConsenso) {
    this.erroreRegistrazioneConsenso = erroreRegistrazioneConsenso;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("errori") 
 
  public List<Codifica> getErrori() {
    return errori;
  }
  public void setErrori(List<Codifica> errori) {
    this.errori = errori;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("stato") 
 
  public Codifica getStato() {
    return stato;
  }
  public void setStato(Codifica stato) {
    this.stato = stato;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tempo_max_attesa_cl_in_sec") 
 
  public Long getTempoMaxAttesaClInSec() {
    return tempoMaxAttesaClInSec;
  }
  public void setTempoMaxAttesaClInSec(Long tempoMaxAttesaClInSec) {
    this.tempoMaxAttesaClInSec = tempoMaxAttesaClInSec;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tempo_max_restituzione_dati_in_sec") 
 
  public Long getTempoMaxRestituzioneDatiInSec() {
    return tempoMaxRestituzioneDatiInSec;
  }
  public void setTempoMaxRestituzioneDatiInSec(Long tempoMaxRestituzioneDatiInSec) {
    this.tempoMaxRestituzioneDatiInSec = tempoMaxRestituzioneDatiInSec;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelComponenteLocale modelComponenteLocale = (ModelComponenteLocale) o;
    return Objects.equals(codice, modelComponenteLocale.codice) &&
        Objects.equals(descrizione, modelComponenteLocale.descrizione) &&
        Objects.equals(riferimento, modelComponenteLocale.riferimento) &&
        Objects.equals(aziendaSanitaria, modelComponenteLocale.aziendaSanitaria) &&
        Objects.equals(componenteLocaleTipo, modelComponenteLocale.componenteLocaleTipo) &&
        Objects.equals(servizi, modelComponenteLocale.servizi) &&
        Objects.equals(erroreRegistrazioneConsenso, modelComponenteLocale.erroreRegistrazioneConsenso) &&
        Objects.equals(errori, modelComponenteLocale.errori) &&
        Objects.equals(stato, modelComponenteLocale.stato) &&
        Objects.equals(tempoMaxAttesaClInSec, modelComponenteLocale.tempoMaxAttesaClInSec) &&
        Objects.equals(tempoMaxRestituzioneDatiInSec, modelComponenteLocale.tempoMaxRestituzioneDatiInSec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codice, descrizione, riferimento, aziendaSanitaria, componenteLocaleTipo, servizi, erroreRegistrazioneConsenso, errori, stato, tempoMaxAttesaClInSec, tempoMaxRestituzioneDatiInSec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelComponenteLocale {\n");
    
    sb.append("    codice: ").append(toIndentedString(codice)).append("\n");
    sb.append("    descrizione: ").append(toIndentedString(descrizione)).append("\n");
    sb.append("    riferimento: ").append(toIndentedString(riferimento)).append("\n");
    sb.append("    aziendaSanitaria: ").append(toIndentedString(aziendaSanitaria)).append("\n");
    sb.append("    componenteLocaleTipo: ").append(toIndentedString(componenteLocaleTipo)).append("\n");
    sb.append("    servizi: ").append(toIndentedString(servizi)).append("\n");
    sb.append("    erroreRegistrazioneConsenso: ").append(toIndentedString(erroreRegistrazioneConsenso)).append("\n");
    sb.append("    errori: ").append(toIndentedString(errori)).append("\n");
    sb.append("    stato: ").append(toIndentedString(stato)).append("\n");
    sb.append("    tempoMaxAttesaClInSec: ").append(toIndentedString(tempoMaxAttesaClInSec)).append("\n");
    sb.append("    tempoMaxRestituzioneDatiInSec: ").append(toIndentedString(tempoMaxRestituzioneDatiInSec)).append("\n");
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

