/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancons.dto.apisancons;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisancons.dto.apisancons.TipoAsr;
import it.csi.apisan.apisancons.dto.apisancons.TipoStato;
import it.csi.apisan.apisancons.dto.apisancons.ValoreConsenso;
import java.util.Date;
import java.util.UUID;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class Consenso   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String cfCittadino = null;
  private String cfDelegato = null;
  private String nomeDelegato = null;
  private String cognomeDelegato = null;
  private String idAura = null;
  private String nome = null;
  private String cognome = null;
  private Date dataAcquisizione = null;
  private TipoStato tipoStato = null;
  private Integer idInformativa = null;
  private UUID uuid = null;
  private TipoAsr asr = null;
  private ValoreConsenso valoreConsenso = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cf_cittadino") 
 
  public String getCfCittadino() {
    return cfCittadino;
  }
  public void setCfCittadino(String cfCittadino) {
    this.cfCittadino = cfCittadino;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cf_delegato") 
 
  public String getCfDelegato() {
    return cfDelegato;
  }
  public void setCfDelegato(String cfDelegato) {
    this.cfDelegato = cfDelegato;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("nome_delegato") 
 
  public String getNomeDelegato() {
    return nomeDelegato;
  }
  public void setNomeDelegato(String nomeDelegato) {
    this.nomeDelegato = nomeDelegato;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cognome_delegato") 
 
  public String getCognomeDelegato() {
    return cognomeDelegato;
  }
  public void setCognomeDelegato(String cognomeDelegato) {
    this.cognomeDelegato = cognomeDelegato;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id_aura") 
 
  public String getIdAura() {
    return idAura;
  }
  public void setIdAura(String idAura) {
    this.idAura = idAura;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("nome") 
 
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cognome") 
 
  public String getCognome() {
    return cognome;
  }
  public void setCognome(String cognome) {
    this.cognome = cognome;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_acquisizione") 
 
  public Date getDataAcquisizione() {
    return dataAcquisizione;
  }
  public void setDataAcquisizione(Date dataAcquisizione) {
    this.dataAcquisizione = dataAcquisizione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tipo_stato") 
 
  public TipoStato getTipoStato() {
    return tipoStato;
  }
  public void setTipoStato(TipoStato tipoStato) {
    this.tipoStato = tipoStato;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id_informativa") 
 
  public Integer getIdInformativa() {
    return idInformativa;
  }
  public void setIdInformativa(Integer idInformativa) {
    this.idInformativa = idInformativa;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("uuid") 
 
  public UUID getUuid() {
    return uuid;
  }
  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("asr") 
 
  public TipoAsr getAsr() {
    return asr;
  }
  public void setAsr(TipoAsr asr) {
    this.asr = asr;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("valore_consenso") 
 
  public ValoreConsenso getValoreConsenso() {
    return valoreConsenso;
  }
  public void setValoreConsenso(ValoreConsenso valoreConsenso) {
    this.valoreConsenso = valoreConsenso;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Consenso consenso = (Consenso) o;
    return Objects.equals(cfCittadino, consenso.cfCittadino) &&
        Objects.equals(cfDelegato, consenso.cfDelegato) &&
        Objects.equals(nomeDelegato, consenso.nomeDelegato) &&
        Objects.equals(cognomeDelegato, consenso.cognomeDelegato) &&
        Objects.equals(idAura, consenso.idAura) &&
        Objects.equals(nome, consenso.nome) &&
        Objects.equals(cognome, consenso.cognome) &&
        Objects.equals(dataAcquisizione, consenso.dataAcquisizione) &&
        Objects.equals(tipoStato, consenso.tipoStato) &&
        Objects.equals(idInformativa, consenso.idInformativa) &&
        Objects.equals(uuid, consenso.uuid) &&
        Objects.equals(asr, consenso.asr) &&
        Objects.equals(valoreConsenso, consenso.valoreConsenso);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cfCittadino, cfDelegato, nomeDelegato, cognomeDelegato, idAura, nome, cognome, dataAcquisizione, tipoStato, idInformativa, uuid, asr, valoreConsenso);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Consenso {\n");
    
    sb.append("    cfCittadino: ").append(toIndentedString(cfCittadino)).append("\n");
    sb.append("    cfDelegato: ").append(toIndentedString(cfDelegato)).append("\n");
    sb.append("    nomeDelegato: ").append(toIndentedString(nomeDelegato)).append("\n");
    sb.append("    cognomeDelegato: ").append(toIndentedString(cognomeDelegato)).append("\n");
    sb.append("    idAura: ").append(toIndentedString(idAura)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    cognome: ").append(toIndentedString(cognome)).append("\n");
    sb.append("    dataAcquisizione: ").append(toIndentedString(dataAcquisizione)).append("\n");
    sb.append("    tipoStato: ").append(toIndentedString(tipoStato)).append("\n");
    sb.append("    idInformativa: ").append(toIndentedString(idInformativa)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    asr: ").append(toIndentedString(asr)).append("\n");
    sb.append("    valoreConsenso: ").append(toIndentedString(valoreConsenso)).append("\n");
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

