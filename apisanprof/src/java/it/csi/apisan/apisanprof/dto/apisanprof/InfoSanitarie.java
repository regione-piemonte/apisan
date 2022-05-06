/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanprof.dto.apisanprof;

import java.util.Objects;
import java.util.ArrayList;
import java.math.BigDecimal;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class InfoSanitarie   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String aslAssistenza = null;
  private String codiceFiscaleMedico = null;
  private String codiceTesseraTeam = null;
  private String codRegionaleMedico = null;
  private String cognomeMedico = null;
  private Date dataFineAsl = null;
  private Date dataFineAssMedico = null;
  private Date dataFineSsn = null;
  private Date dataInizioAsl = null;
  private Date dataInizioAssMedico = null;
  private Date dataInizioSsn = null;
  private String nomeMedico = null;
  private BigDecimal idProfiloSanitario = null;
  private String codTipoProfiloSanitario = null;
  private String descTipoProfiloSanitario = null;
  private String aslResidenza = null;
  private String aslDomicilio = null;
  private String codDistrettoDomicilio = null;
  private String descDistrettoDomicilio = null;
  private String tipoMovimento = null;
  private Date dataMovimento = null;
  private Date dataDecorrenza = null;
  private String motivoFineAssistenza = null;
  private String statoInvioMef = null;
  private String codiceTesseraRegionale = null;
  private String codDistrettoResidenza = null;
  private String descDistrettoResidenza = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("asl_assistenza") 
 
  public String getAslAssistenza() {
    return aslAssistenza;
  }
  public void setAslAssistenza(String aslAssistenza) {
    this.aslAssistenza = aslAssistenza;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("codice_fiscale_medico") 
 
  public String getCodiceFiscaleMedico() {
    return codiceFiscaleMedico;
  }
  public void setCodiceFiscaleMedico(String codiceFiscaleMedico) {
    this.codiceFiscaleMedico = codiceFiscaleMedico;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("codice_tessera_team") 
 
  public String getCodiceTesseraTeam() {
    return codiceTesseraTeam;
  }
  public void setCodiceTesseraTeam(String codiceTesseraTeam) {
    this.codiceTesseraTeam = codiceTesseraTeam;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cod_regionale_medico") 
 
  public String getCodRegionaleMedico() {
    return codRegionaleMedico;
  }
  public void setCodRegionaleMedico(String codRegionaleMedico) {
    this.codRegionaleMedico = codRegionaleMedico;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cognome_medico") 
 
  public String getCognomeMedico() {
    return cognomeMedico;
  }
  public void setCognomeMedico(String cognomeMedico) {
    this.cognomeMedico = cognomeMedico;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_fine_asl") 
 
  public Date getDataFineAsl() {
    return dataFineAsl;
  }
  public void setDataFineAsl(Date dataFineAsl) {
    this.dataFineAsl = dataFineAsl;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_fine_ass_medico") 
 
  public Date getDataFineAssMedico() {
    return dataFineAssMedico;
  }
  public void setDataFineAssMedico(Date dataFineAssMedico) {
    this.dataFineAssMedico = dataFineAssMedico;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_fine_ssn") 
 
  public Date getDataFineSsn() {
    return dataFineSsn;
  }
  public void setDataFineSsn(Date dataFineSsn) {
    this.dataFineSsn = dataFineSsn;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_inizio_asl") 
 
  public Date getDataInizioAsl() {
    return dataInizioAsl;
  }
  public void setDataInizioAsl(Date dataInizioAsl) {
    this.dataInizioAsl = dataInizioAsl;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_inizio_ass_medico") 
 
  public Date getDataInizioAssMedico() {
    return dataInizioAssMedico;
  }
  public void setDataInizioAssMedico(Date dataInizioAssMedico) {
    this.dataInizioAssMedico = dataInizioAssMedico;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_inizio_ssn") 
 
  public Date getDataInizioSsn() {
    return dataInizioSsn;
  }
  public void setDataInizioSsn(Date dataInizioSsn) {
    this.dataInizioSsn = dataInizioSsn;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("nome_medico") 
 
  public String getNomeMedico() {
    return nomeMedico;
  }
  public void setNomeMedico(String nomeMedico) {
    this.nomeMedico = nomeMedico;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id_profilo_sanitario") 
 
  public BigDecimal getIdProfiloSanitario() {
    return idProfiloSanitario;
  }
  public void setIdProfiloSanitario(BigDecimal idProfiloSanitario) {
    this.idProfiloSanitario = idProfiloSanitario;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cod_tipo_profilo_sanitario") 
 
  public String getCodTipoProfiloSanitario() {
    return codTipoProfiloSanitario;
  }
  public void setCodTipoProfiloSanitario(String codTipoProfiloSanitario) {
    this.codTipoProfiloSanitario = codTipoProfiloSanitario;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("desc_tipo_profilo_sanitario") 
 
  public String getDescTipoProfiloSanitario() {
    return descTipoProfiloSanitario;
  }
  public void setDescTipoProfiloSanitario(String descTipoProfiloSanitario) {
    this.descTipoProfiloSanitario = descTipoProfiloSanitario;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("asl_residenza") 
 
  public String getAslResidenza() {
    return aslResidenza;
  }
  public void setAslResidenza(String aslResidenza) {
    this.aslResidenza = aslResidenza;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("asl_domicilio") 
 
  public String getAslDomicilio() {
    return aslDomicilio;
  }
  public void setAslDomicilio(String aslDomicilio) {
    this.aslDomicilio = aslDomicilio;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cod_distretto_domicilio") 
 
  public String getCodDistrettoDomicilio() {
    return codDistrettoDomicilio;
  }
  public void setCodDistrettoDomicilio(String codDistrettoDomicilio) {
    this.codDistrettoDomicilio = codDistrettoDomicilio;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("desc_distretto_domicilio") 
 
  public String getDescDistrettoDomicilio() {
    return descDistrettoDomicilio;
  }
  public void setDescDistrettoDomicilio(String descDistrettoDomicilio) {
    this.descDistrettoDomicilio = descDistrettoDomicilio;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tipo_movimento") 
 
  public String getTipoMovimento() {
    return tipoMovimento;
  }
  public void setTipoMovimento(String tipoMovimento) {
    this.tipoMovimento = tipoMovimento;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_movimento") 
 
  public Date getDataMovimento() {
    return dataMovimento;
  }
  public void setDataMovimento(Date dataMovimento) {
    this.dataMovimento = dataMovimento;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_decorrenza") 
 
  public Date getDataDecorrenza() {
    return dataDecorrenza;
  }
  public void setDataDecorrenza(Date dataDecorrenza) {
    this.dataDecorrenza = dataDecorrenza;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("motivo_fine_assistenza") 
 
  public String getMotivoFineAssistenza() {
    return motivoFineAssistenza;
  }
  public void setMotivoFineAssistenza(String motivoFineAssistenza) {
    this.motivoFineAssistenza = motivoFineAssistenza;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("stato_invio_mef") 
 
  public String getStatoInvioMef() {
    return statoInvioMef;
  }
  public void setStatoInvioMef(String statoInvioMef) {
    this.statoInvioMef = statoInvioMef;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("codice_tessera_regionale") 
 
  public String getCodiceTesseraRegionale() {
    return codiceTesseraRegionale;
  }
  public void setCodiceTesseraRegionale(String codiceTesseraRegionale) {
    this.codiceTesseraRegionale = codiceTesseraRegionale;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cod_distretto_residenza") 
 
  public String getCodDistrettoResidenza() {
    return codDistrettoResidenza;
  }
  public void setCodDistrettoResidenza(String codDistrettoResidenza) {
    this.codDistrettoResidenza = codDistrettoResidenza;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("desc_distretto_residenza") 
 
  public String getDescDistrettoResidenza() {
    return descDistrettoResidenza;
  }
  public void setDescDistrettoResidenza(String descDistrettoResidenza) {
    this.descDistrettoResidenza = descDistrettoResidenza;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfoSanitarie infoSanitarie = (InfoSanitarie) o;
    return Objects.equals(aslAssistenza, infoSanitarie.aslAssistenza) &&
        Objects.equals(codiceFiscaleMedico, infoSanitarie.codiceFiscaleMedico) &&
        Objects.equals(codiceTesseraTeam, infoSanitarie.codiceTesseraTeam) &&
        Objects.equals(codRegionaleMedico, infoSanitarie.codRegionaleMedico) &&
        Objects.equals(cognomeMedico, infoSanitarie.cognomeMedico) &&
        Objects.equals(dataFineAsl, infoSanitarie.dataFineAsl) &&
        Objects.equals(dataFineAssMedico, infoSanitarie.dataFineAssMedico) &&
        Objects.equals(dataFineSsn, infoSanitarie.dataFineSsn) &&
        Objects.equals(dataInizioAsl, infoSanitarie.dataInizioAsl) &&
        Objects.equals(dataInizioAssMedico, infoSanitarie.dataInizioAssMedico) &&
        Objects.equals(dataInizioSsn, infoSanitarie.dataInizioSsn) &&
        Objects.equals(nomeMedico, infoSanitarie.nomeMedico) &&
        Objects.equals(idProfiloSanitario, infoSanitarie.idProfiloSanitario) &&
        Objects.equals(codTipoProfiloSanitario, infoSanitarie.codTipoProfiloSanitario) &&
        Objects.equals(descTipoProfiloSanitario, infoSanitarie.descTipoProfiloSanitario) &&
        Objects.equals(aslResidenza, infoSanitarie.aslResidenza) &&
        Objects.equals(aslDomicilio, infoSanitarie.aslDomicilio) &&
        Objects.equals(codDistrettoDomicilio, infoSanitarie.codDistrettoDomicilio) &&
        Objects.equals(descDistrettoDomicilio, infoSanitarie.descDistrettoDomicilio) &&
        Objects.equals(tipoMovimento, infoSanitarie.tipoMovimento) &&
        Objects.equals(dataMovimento, infoSanitarie.dataMovimento) &&
        Objects.equals(dataDecorrenza, infoSanitarie.dataDecorrenza) &&
        Objects.equals(motivoFineAssistenza, infoSanitarie.motivoFineAssistenza) &&
        Objects.equals(statoInvioMef, infoSanitarie.statoInvioMef) &&
        Objects.equals(codiceTesseraRegionale, infoSanitarie.codiceTesseraRegionale) &&
        Objects.equals(codDistrettoResidenza, infoSanitarie.codDistrettoResidenza) &&
        Objects.equals(descDistrettoResidenza, infoSanitarie.descDistrettoResidenza);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aslAssistenza, codiceFiscaleMedico, codiceTesseraTeam, codRegionaleMedico, cognomeMedico, dataFineAsl, dataFineAssMedico, dataFineSsn, dataInizioAsl, dataInizioAssMedico, dataInizioSsn, nomeMedico, idProfiloSanitario, codTipoProfiloSanitario, descTipoProfiloSanitario, aslResidenza, aslDomicilio, codDistrettoDomicilio, descDistrettoDomicilio, tipoMovimento, dataMovimento, dataDecorrenza, motivoFineAssistenza, statoInvioMef, codiceTesseraRegionale, codDistrettoResidenza, descDistrettoResidenza);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfoSanitarie {\n");
    
    sb.append("    aslAssistenza: ").append(toIndentedString(aslAssistenza)).append("\n");
    sb.append("    codiceFiscaleMedico: ").append(toIndentedString(codiceFiscaleMedico)).append("\n");
    sb.append("    codiceTesseraTeam: ").append(toIndentedString(codiceTesseraTeam)).append("\n");
    sb.append("    codRegionaleMedico: ").append(toIndentedString(codRegionaleMedico)).append("\n");
    sb.append("    cognomeMedico: ").append(toIndentedString(cognomeMedico)).append("\n");
    sb.append("    dataFineAsl: ").append(toIndentedString(dataFineAsl)).append("\n");
    sb.append("    dataFineAssMedico: ").append(toIndentedString(dataFineAssMedico)).append("\n");
    sb.append("    dataFineSsn: ").append(toIndentedString(dataFineSsn)).append("\n");
    sb.append("    dataInizioAsl: ").append(toIndentedString(dataInizioAsl)).append("\n");
    sb.append("    dataInizioAssMedico: ").append(toIndentedString(dataInizioAssMedico)).append("\n");
    sb.append("    dataInizioSsn: ").append(toIndentedString(dataInizioSsn)).append("\n");
    sb.append("    nomeMedico: ").append(toIndentedString(nomeMedico)).append("\n");
    sb.append("    idProfiloSanitario: ").append(toIndentedString(idProfiloSanitario)).append("\n");
    sb.append("    codTipoProfiloSanitario: ").append(toIndentedString(codTipoProfiloSanitario)).append("\n");
    sb.append("    descTipoProfiloSanitario: ").append(toIndentedString(descTipoProfiloSanitario)).append("\n");
    sb.append("    aslResidenza: ").append(toIndentedString(aslResidenza)).append("\n");
    sb.append("    aslDomicilio: ").append(toIndentedString(aslDomicilio)).append("\n");
    sb.append("    codDistrettoDomicilio: ").append(toIndentedString(codDistrettoDomicilio)).append("\n");
    sb.append("    descDistrettoDomicilio: ").append(toIndentedString(descDistrettoDomicilio)).append("\n");
    sb.append("    tipoMovimento: ").append(toIndentedString(tipoMovimento)).append("\n");
    sb.append("    dataMovimento: ").append(toIndentedString(dataMovimento)).append("\n");
    sb.append("    dataDecorrenza: ").append(toIndentedString(dataDecorrenza)).append("\n");
    sb.append("    motivoFineAssistenza: ").append(toIndentedString(motivoFineAssistenza)).append("\n");
    sb.append("    statoInvioMef: ").append(toIndentedString(statoInvioMef)).append("\n");
    sb.append("    codiceTesseraRegionale: ").append(toIndentedString(codiceTesseraRegionale)).append("\n");
    sb.append("    codDistrettoResidenza: ").append(toIndentedString(codDistrettoResidenza)).append("\n");
    sb.append("    descDistrettoResidenza: ").append(toIndentedString(descDistrettoResidenza)).append("\n");
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

