/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanaut.dto.apisanaut;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanaut.dto.apisanaut.DelegaServizio;
import java.util.Date;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class DelegaCittadino   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String uuid = null;
  private String codiceFiscaleDelega = null;
  private String nomeDelega = null;
  private String cognomeDelega = null;
  private Date dataNascitaDelega = null;
  private String luogoNascitaDelega = null;
  private String sessoDelega = null;
  private String statoAnagrafica = null;
  private List<DelegaServizio> deleghe = new ArrayList<DelegaServizio>();

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
   * codice fiscale
   **/
  
  @ApiModelProperty(example = "AAAAAA00B77B000F", value = "codice fiscale")
  @JsonProperty("codice_fiscale_delega") 
 
  public String getCodiceFiscaleDelega() {
    return codiceFiscaleDelega;
  }
  public void setCodiceFiscaleDelega(String codiceFiscaleDelega) {
    this.codiceFiscaleDelega = codiceFiscaleDelega;
  }

  /**
   * nome
   **/
  
  @ApiModelProperty(value = "nome")
  @JsonProperty("nome_delega") 
 
  public String getNomeDelega() {
    return nomeDelega;
  }
  public void setNomeDelega(String nomeDelega) {
    this.nomeDelega = nomeDelega;
  }

  /**
   * cognome
   **/
  
  @ApiModelProperty(value = "cognome")
  @JsonProperty("cognome_delega") 
 
  public String getCognomeDelega() {
    return cognomeDelega;
  }
  public void setCognomeDelega(String cognomeDelega) {
    this.cognomeDelega = cognomeDelega;
  }

  /**
   * data di nascita questo campo non è obbligatorio
   **/
  
  @ApiModelProperty(value = "data di nascita questo campo non è obbligatorio")
  @JsonProperty("data_nascita_delega") 
 
  public Date getDataNascitaDelega() {
    return dataNascitaDelega;
  }
  public void setDataNascitaDelega(Date dataNascitaDelega) {
    this.dataNascitaDelega = dataNascitaDelega;
  }

  /**
   * luogo di nascita questo campo non è obbligatorio
   **/
  
  @ApiModelProperty(value = "luogo di nascita questo campo non è obbligatorio")
  @JsonProperty("luogo_nascita_delega") 
 
  public String getLuogoNascitaDelega() {
    return luogoNascitaDelega;
  }
  public void setLuogoNascitaDelega(String luogoNascitaDelega) {
    this.luogoNascitaDelega = luogoNascitaDelega;
  }

  /**
   * sesso questo campo non è obbligatorio
   **/
  
  @ApiModelProperty(value = "sesso questo campo non è obbligatorio")
  @JsonProperty("sesso_delega") 
 
  public String getSessoDelega() {
    return sessoDelega;
  }
  public void setSessoDelega(String sessoDelega) {
    this.sessoDelega = sessoDelega;
  }

  /**
   * gestisce cancellazione o attivazione valori possibili attivi, eliminato
   **/
  
  @ApiModelProperty(value = "gestisce cancellazione o attivazione valori possibili attivi, eliminato")
  @JsonProperty("stato_anagrafica") 
 
  public String getStatoAnagrafica() {
    return statoAnagrafica;
  }
  public void setStatoAnagrafica(String statoAnagrafica) {
    this.statoAnagrafica = statoAnagrafica;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("deleghe") 
 
  public List<DelegaServizio> getDeleghe() {
    return deleghe;
  }
  public void setDeleghe(List<DelegaServizio> deleghe) {
    this.deleghe = deleghe;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DelegaCittadino delegaCittadino = (DelegaCittadino) o;
    return Objects.equals(uuid, delegaCittadino.uuid) &&
        Objects.equals(codiceFiscaleDelega, delegaCittadino.codiceFiscaleDelega) &&
        Objects.equals(nomeDelega, delegaCittadino.nomeDelega) &&
        Objects.equals(cognomeDelega, delegaCittadino.cognomeDelega) &&
        Objects.equals(dataNascitaDelega, delegaCittadino.dataNascitaDelega) &&
        Objects.equals(luogoNascitaDelega, delegaCittadino.luogoNascitaDelega) &&
        Objects.equals(sessoDelega, delegaCittadino.sessoDelega) &&
        Objects.equals(statoAnagrafica, delegaCittadino.statoAnagrafica) &&
        Objects.equals(deleghe, delegaCittadino.deleghe);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, codiceFiscaleDelega, nomeDelega, cognomeDelega, dataNascitaDelega, luogoNascitaDelega, sessoDelega, statoAnagrafica, deleghe);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DelegaCittadino {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    codiceFiscaleDelega: ").append(toIndentedString(codiceFiscaleDelega)).append("\n");
    sb.append("    nomeDelega: ").append(toIndentedString(nomeDelega)).append("\n");
    sb.append("    cognomeDelega: ").append(toIndentedString(cognomeDelega)).append("\n");
    sb.append("    dataNascitaDelega: ").append(toIndentedString(dataNascitaDelega)).append("\n");
    sb.append("    luogoNascitaDelega: ").append(toIndentedString(luogoNascitaDelega)).append("\n");
    sb.append("    sessoDelega: ").append(toIndentedString(sessoDelega)).append("\n");
    sb.append("    statoAnagrafica: ").append(toIndentedString(statoAnagrafica)).append("\n");
    sb.append("    deleghe: ").append(toIndentedString(deleghe)).append("\n");
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

