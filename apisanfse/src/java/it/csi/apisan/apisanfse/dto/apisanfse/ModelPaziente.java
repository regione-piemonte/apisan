/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanfse.dto.apisanfse.ComuneDiNascita;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelConsensoScreening;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelDelega;
import it.csi.apisan.apisanfse.dto.apisanfse.StatoDiNascita;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelPaziente   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String codiceFiscale = null;
  private String codiceFiscaleMMG = null;
  private String cognome = null;
  private ComuneDiNascita comuneDiNascita = null;
  private ModelConsensoScreening consenso = null;
  private Date dataDecesso = null;
  private Date dataNascita = null;
  private Date dataRiconduzione = null;
  private List<ModelDelega> deleghe = new ArrayList<ModelDelega>();
  private String flagRegistryIncarico = null;
  private BigDecimal idAsr = null;
  private BigDecimal idAura = null;
  private BigDecimal idIlec = null;
  private BigDecimal idIrec = null;
  private BigDecimal idPazienteRicondotto = null;
  private Boolean mailPerAccessoDMA = null;
  private String nome = null;

  /**
   * sesso del paziente
   */
  public enum SessoEnum {
    M("M"),

        F("F");
    private String value;

    SessoEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private SessoEnum sesso = null;
  private StatoDiNascita statoDiNascita = null;
  private String idScreening = null;

  /**
   * codice fiscale del paziente
   **/
  
  @ApiModelProperty(value = "codice fiscale del paziente")
  @JsonProperty("codice_fiscale") 
 
  public String getCodiceFiscale() {
    return codiceFiscale;
  }
  public void setCodiceFiscale(String codiceFiscale) {
    this.codiceFiscale = codiceFiscale;
  }

  /**
   * codice fiscale del medico mmg
   **/
  
  @ApiModelProperty(value = "codice fiscale del medico mmg")
  @JsonProperty("codice_fiscale_MMG") 
 
  public String getCodiceFiscaleMMG() {
    return codiceFiscaleMMG;
  }
  public void setCodiceFiscaleMMG(String codiceFiscaleMMG) {
    this.codiceFiscaleMMG = codiceFiscaleMMG;
  }

  /**
   * cognome del paziente
   **/
  
  @ApiModelProperty(value = "cognome del paziente")
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
  @JsonProperty("comune_di_nascita") 
 
  public ComuneDiNascita getComuneDiNascita() {
    return comuneDiNascita;
  }
  public void setComuneDiNascita(ComuneDiNascita comuneDiNascita) {
    this.comuneDiNascita = comuneDiNascita;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("consenso") 
 
  public ModelConsensoScreening getConsenso() {
    return consenso;
  }
  public void setConsenso(ModelConsensoScreening consenso) {
    this.consenso = consenso;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_decesso") 
 
  public Date getDataDecesso() {
    return dataDecesso;
  }
  public void setDataDecesso(Date dataDecesso) {
    this.dataDecesso = dataDecesso;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_nascita") 
 
  public Date getDataNascita() {
    return dataNascita;
  }
  public void setDataNascita(Date dataNascita) {
    this.dataNascita = dataNascita;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_riconduzione") 
 
  public Date getDataRiconduzione() {
    return dataRiconduzione;
  }
  public void setDataRiconduzione(Date dataRiconduzione) {
    this.dataRiconduzione = dataRiconduzione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("deleghe") 
 
  public List<ModelDelega> getDeleghe() {
    return deleghe;
  }
  public void setDeleghe(List<ModelDelega> deleghe) {
    this.deleghe = deleghe;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("flag_registry_incarico") 
 
  public String getFlagRegistryIncarico() {
    return flagRegistryIncarico;
  }
  public void setFlagRegistryIncarico(String flagRegistryIncarico) {
    this.flagRegistryIncarico = flagRegistryIncarico;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id_asr") 
 
  public BigDecimal getIdAsr() {
    return idAsr;
  }
  public void setIdAsr(BigDecimal idAsr) {
    this.idAsr = idAsr;
  }

  /**
   * id aura del paziente
   **/
  
  @ApiModelProperty(value = "id aura del paziente")
  @JsonProperty("id_aura") 
 
  public BigDecimal getIdAura() {
    return idAura;
  }
  public void setIdAura(BigDecimal idAura) {
    this.idAura = idAura;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id_ilec") 
 
  public BigDecimal getIdIlec() {
    return idIlec;
  }
  public void setIdIlec(BigDecimal idIlec) {
    this.idIlec = idIlec;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id_irec") 
 
  public BigDecimal getIdIrec() {
    return idIrec;
  }
  public void setIdIrec(BigDecimal idIrec) {
    this.idIrec = idIrec;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id_paziente_ricondotto") 
 
  public BigDecimal getIdPazienteRicondotto() {
    return idPazienteRicondotto;
  }
  public void setIdPazienteRicondotto(BigDecimal idPazienteRicondotto) {
    this.idPazienteRicondotto = idPazienteRicondotto;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("mail_per_accesso_DMA") 
 
  public Boolean isMailPerAccessoDMA() {
    return mailPerAccessoDMA;
  }
  public void setMailPerAccessoDMA(Boolean mailPerAccessoDMA) {
    this.mailPerAccessoDMA = mailPerAccessoDMA;
  }

  /**
   * nome del paziente
   **/
  
  @ApiModelProperty(value = "nome del paziente")
  @JsonProperty("nome") 
 
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  /**
   * sesso del paziente
   **/
  
  @ApiModelProperty(value = "sesso del paziente")
  @JsonProperty("sesso") 
 
  public SessoEnum getSesso() {
    return sesso;
  }
  public void setSesso(SessoEnum sesso) {
    this.sesso = sesso;
  }

  /**
   * stato di nascita del paziente
   **/
  
  @ApiModelProperty(value = "stato di nascita del paziente")
  @JsonProperty("stato_di_nascita") 
 
  public StatoDiNascita getStatoDiNascita() {
    return statoDiNascita;
  }
  public void setStatoDiNascita(StatoDiNascita statoDiNascita) {
    this.statoDiNascita = statoDiNascita;
  }

  /**
   * id screening del paziente
   **/
  
  @ApiModelProperty(value = "id screening del paziente")
  @JsonProperty("id_screening") 
 
  public String getIdScreening() {
    return idScreening;
  }
  public void setIdScreening(String idScreening) {
    this.idScreening = idScreening;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelPaziente modelPaziente = (ModelPaziente) o;
    return Objects.equals(codiceFiscale, modelPaziente.codiceFiscale) &&
        Objects.equals(codiceFiscaleMMG, modelPaziente.codiceFiscaleMMG) &&
        Objects.equals(cognome, modelPaziente.cognome) &&
        Objects.equals(comuneDiNascita, modelPaziente.comuneDiNascita) &&
        Objects.equals(consenso, modelPaziente.consenso) &&
        Objects.equals(dataDecesso, modelPaziente.dataDecesso) &&
        Objects.equals(dataNascita, modelPaziente.dataNascita) &&
        Objects.equals(dataRiconduzione, modelPaziente.dataRiconduzione) &&
        Objects.equals(deleghe, modelPaziente.deleghe) &&
        Objects.equals(flagRegistryIncarico, modelPaziente.flagRegistryIncarico) &&
        Objects.equals(idAsr, modelPaziente.idAsr) &&
        Objects.equals(idAura, modelPaziente.idAura) &&
        Objects.equals(idIlec, modelPaziente.idIlec) &&
        Objects.equals(idIrec, modelPaziente.idIrec) &&
        Objects.equals(idPazienteRicondotto, modelPaziente.idPazienteRicondotto) &&
        Objects.equals(mailPerAccessoDMA, modelPaziente.mailPerAccessoDMA) &&
        Objects.equals(nome, modelPaziente.nome) &&
        Objects.equals(sesso, modelPaziente.sesso) &&
        Objects.equals(statoDiNascita, modelPaziente.statoDiNascita) &&
        Objects.equals(idScreening, modelPaziente.idScreening);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codiceFiscale, codiceFiscaleMMG, cognome, comuneDiNascita, consenso, dataDecesso, dataNascita, dataRiconduzione, deleghe, flagRegistryIncarico, idAsr, idAura, idIlec, idIrec, idPazienteRicondotto, mailPerAccessoDMA, nome, sesso, statoDiNascita, idScreening);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelPaziente {\n");
    
    sb.append("    codiceFiscale: ").append(toIndentedString(codiceFiscale)).append("\n");
    sb.append("    codiceFiscaleMMG: ").append(toIndentedString(codiceFiscaleMMG)).append("\n");
    sb.append("    cognome: ").append(toIndentedString(cognome)).append("\n");
    sb.append("    comuneDiNascita: ").append(toIndentedString(comuneDiNascita)).append("\n");
    sb.append("    consenso: ").append(toIndentedString(consenso)).append("\n");
    sb.append("    dataDecesso: ").append(toIndentedString(dataDecesso)).append("\n");
    sb.append("    dataNascita: ").append(toIndentedString(dataNascita)).append("\n");
    sb.append("    dataRiconduzione: ").append(toIndentedString(dataRiconduzione)).append("\n");
    sb.append("    deleghe: ").append(toIndentedString(deleghe)).append("\n");
    sb.append("    flagRegistryIncarico: ").append(toIndentedString(flagRegistryIncarico)).append("\n");
    sb.append("    idAsr: ").append(toIndentedString(idAsr)).append("\n");
    sb.append("    idAura: ").append(toIndentedString(idAura)).append("\n");
    sb.append("    idIlec: ").append(toIndentedString(idIlec)).append("\n");
    sb.append("    idIrec: ").append(toIndentedString(idIrec)).append("\n");
    sb.append("    idPazienteRicondotto: ").append(toIndentedString(idPazienteRicondotto)).append("\n");
    sb.append("    mailPerAccessoDMA: ").append(toIndentedString(mailPerAccessoDMA)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    sesso: ").append(toIndentedString(sesso)).append("\n");
    sb.append("    statoDiNascita: ").append(toIndentedString(statoDiNascita)).append("\n");
    sb.append("    idScreening: ").append(toIndentedString(idScreening)).append("\n");
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

