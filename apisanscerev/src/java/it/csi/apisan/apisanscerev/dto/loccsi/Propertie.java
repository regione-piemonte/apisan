/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.dto.loccsi;

import java.math.BigDecimal;
import java.util.Objects;

import org.codehaus.jackson.annotate.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class Propertie   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private BigDecimal idAuraMedico = null;
  private String autolimitato = null;
  private String indirizzoEmailAmbulatorio = null;
  private String cognomeMedico = null;
  private String codAmbitoMedico = null;
  private String noteAmbulatorio = null;
  private String indirizzoEmailMedico = null;
  private String idRaplavAmbulatorio = null;
  private String orarioAmbMartedi = null;
  private String indirizzoAmbulatorio = null;
  private String codAsl = null;
  private String specializzazioni = null;
  private String orarioAmbSabato = null;
  private String descTipoAmbulatorio = null;
  private String orarioAmbGiovedi = null;
  private Integer massimale = null;
  private String dataNascitaMedico = null;
  private Integer massimaleScelteInDeroga = null;
  private String sessoMedico = null;
  private String descDistrettoMedico = null;
  private String loccsiComputedDistance;
  private String loccsiLabel = null;
  private String codiceRegionaleMedico = null;
  private String orarioAmbMercoledi = null;
  private String telefonoAmbulMedico = null;
  private String provinciaAmbulatorio = null;
  private String tipologiaMedico = null;
  private String idTipoAmbulMedico = null;
  private String nomeMedico = null;
  private String descAsl = null;
  private Integer massimaleRiservatoFasciaEta = null;
  private Integer massimaleScelteTemporanee = null;
  private String comuneAmbulatorio = null;
  private String capAmbulatorio = null;
  private String orarioAmbDomenica = null;
  private String orarioAmbVenerdi = null;
  private String descAmbitoMedico = null;
  private Integer idAmbulatorio = null;
  private String orarioAmbLunedi = null;
  private Integer codDistrettoMedico = null;
  private String codiceFiscaleMedico = null;

  /**
   * id aura del medico
   **/
  
  @ApiModelProperty(value = "id aura del medico")
  @JsonProperty("id_aura_medico") 
 
  public BigDecimal getIdAuraMedico() {
    return idAuraMedico;
  }
  public void setIdAuraMedico(BigDecimal idAuraMedico) {
    this.idAuraMedico = idAuraMedico;
  }

  /**
   * flag autolimitato
   **/
  
  @ApiModelProperty(value = "flag autolimitato")
  @JsonProperty("autolimitato") 
 
  public String getAutolimitato() {
    return autolimitato;
  }
  public void setAutolimitato(String autolimitato) {
    this.autolimitato = autolimitato;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("indirizzo_email_ambulatorio") 
 
  public String getIndirizzoEmailAmbulatorio() {
    return indirizzoEmailAmbulatorio;
  }
  public void setIndirizzoEmailAmbulatorio(String indirizzoEmailAmbulatorio) {
    this.indirizzoEmailAmbulatorio = indirizzoEmailAmbulatorio;
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
  @JsonProperty("cod_ambito_medico") 
 
  public String getCodAmbitoMedico() {
    return codAmbitoMedico;
  }
  public void setCodAmbitoMedico(String codAmbitoMedico) {
    this.codAmbitoMedico = codAmbitoMedico;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("note_ambulatorio") 
 
  public String getNoteAmbulatorio() {
    return noteAmbulatorio;
  }
  public void setNoteAmbulatorio(String noteAmbulatorio) {
    this.noteAmbulatorio = noteAmbulatorio;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("indirizzo_email_medico") 
 
  public String getIndirizzoEmailMedico() {
    return indirizzoEmailMedico;
  }
  public void setIndirizzoEmailMedico(String indirizzoEmailMedico) {
    this.indirizzoEmailMedico = indirizzoEmailMedico;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id_raplav_ambulatorio") 
 
  public String getIdRaplavAmbulatorio() {
    return idRaplavAmbulatorio;
  }
  public void setIdRaplavAmbulatorio(String idRaplavAmbulatorio) {
    this.idRaplavAmbulatorio = idRaplavAmbulatorio;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("orario_amb_martedi") 
 
  public String getOrarioAmbMartedi() {
    return orarioAmbMartedi;
  }
  public void setOrarioAmbMartedi(String orarioAmbMartedi) {
    this.orarioAmbMartedi = orarioAmbMartedi;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("indirizzo_ambulatorio") 
 
  public String getIndirizzoAmbulatorio() {
    return indirizzoAmbulatorio;
  }
  public void setIndirizzoAmbulatorio(String indirizzoAmbulatorio) {
    this.indirizzoAmbulatorio = indirizzoAmbulatorio;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cod_asl") 
 
  public String getCodAsl() {
    return codAsl;
  }
  public void setCodAsl(String codAsl) {
    this.codAsl = codAsl;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("specializzazioni") 
 
  public String getSpecializzazioni() {
    return specializzazioni;
  }
  public void setSpecializzazioni(String specializzazioni) {
    this.specializzazioni = specializzazioni;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("orario_amb_sabato") 
 
  public String getOrarioAmbSabato() {
    return orarioAmbSabato;
  }
  public void setOrarioAmbSabato(String orarioAmbSabato) {
    this.orarioAmbSabato = orarioAmbSabato;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("desc_tipo_ambulatorio") 
 
  public String getDescTipoAmbulatorio() {
    return descTipoAmbulatorio;
  }
  public void setDescTipoAmbulatorio(String descTipoAmbulatorio) {
    this.descTipoAmbulatorio = descTipoAmbulatorio;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("orario_amb_giovedi") 
 
  public String getOrarioAmbGiovedi() {
    return orarioAmbGiovedi;
  }
  public void setOrarioAmbGiovedi(String orarioAmbGiovedi) {
    this.orarioAmbGiovedi = orarioAmbGiovedi;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("massimale") 
 
  public Integer getMassimale() {
    return massimale;
  }
  public void setMassimale(Integer massimale) {
    this.massimale = massimale;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_nascita_medico") 
 
  public String getDataNascitaMedico() {
    return dataNascitaMedico;
  }
  public void setDataNascitaMedico(String dataNascitaMedico) {
    this.dataNascitaMedico = dataNascitaMedico;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("massimale_scelte_in_deroga") 
 
  public Integer getMassimaleScelteInDeroga() {
    return massimaleScelteInDeroga;
  }
  public void setMassimaleScelteInDeroga(Integer massimaleScelteInDeroga) {
    this.massimaleScelteInDeroga = massimaleScelteInDeroga;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sesso_medico") 
 
  public String getSessoMedico() {
    return sessoMedico;
  }
  public void setSessoMedico(String sessoMedico) {
    this.sessoMedico = sessoMedico;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("desc_distretto_medico") 
 
  public String getDescDistrettoMedico() {
    return descDistrettoMedico;
  }
  public void setDescDistrettoMedico(String descDistrettoMedico) {
    this.descDistrettoMedico = descDistrettoMedico;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("loccsi_label") 
 
  public String getLoccsiLabel() {
    return loccsiLabel;
  }
  public void setLoccsiLabel(String loccsiLabel) {
    this.loccsiLabel = loccsiLabel;
  }

  @ApiModelProperty(value = "")
  @JsonProperty("loccsi_computed_distance")
  public String getLoccsiComputedDistance() {
	return loccsiComputedDistance;
  }
	public void setLoccsiComputedDistance(String loccsiComputedDistance) {
		this.loccsiComputedDistance = loccsiComputedDistance;
	}
	
/**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("codice_regionale_medico") 
 
  public String getCodiceRegionaleMedico() {
    return codiceRegionaleMedico;
  }
  public void setCodiceRegionaleMedico(String codiceRegionaleMedico) {
    this.codiceRegionaleMedico = codiceRegionaleMedico;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("orario_amb_mercoledi") 
 
  public String getOrarioAmbMercoledi() {
    return orarioAmbMercoledi;
  }
  public void setOrarioAmbMercoledi(String orarioAmbMercoledi) {
    this.orarioAmbMercoledi = orarioAmbMercoledi;
  }

  @ApiModelProperty(value = "")
  @JsonProperty("telefono_ambul_medico")
  
  public String getTelefonoAmbulMedico() {
	  return telefonoAmbulMedico;
  }
  
  
  public void setTelefonoAmbulMedico(String telefonoAmbulMedico) {
	  this.telefonoAmbulMedico = telefonoAmbulMedico;
  }
  
/**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("provincia_ambulatorio") 
 
  public String getProvinciaAmbulatorio() {
    return provinciaAmbulatorio;
  }
  public void setProvinciaAmbulatorio(String provinciaAmbulatorio) {
    this.provinciaAmbulatorio = provinciaAmbulatorio;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tipologia_medico") 
 
  public String getTipologiaMedico() {
    return tipologiaMedico;
  }
  public void setTipologiaMedico(String tipologiaMedico) {
    this.tipologiaMedico = tipologiaMedico;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id_tipo_ambul_medico") 
 
  public String getIdTipoAmbulMedico() {
    return idTipoAmbulMedico;
  }
  public void setIdTipoAmbulMedico(String idTipoAmbulMedico) {
    this.idTipoAmbulMedico = idTipoAmbulMedico;
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
  @JsonProperty("desc_asl") 
 
  public String getDescAsl() {
    return descAsl;
  }
  public void setDescAsl(String descAsl) {
    this.descAsl = descAsl;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("massimale_riservato_fascia_eta") 
 
  public Integer getMassimaleRiservatoFasciaEta() {
    return massimaleRiservatoFasciaEta;
  }
  public void setMassimaleRiservatoFasciaEta(Integer massimaleRiservatoFasciaEta) {
    this.massimaleRiservatoFasciaEta = massimaleRiservatoFasciaEta;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("massimale_scelte_temporanee") 
 
  public Integer getMassimaleScelteTemporanee() {
    return massimaleScelteTemporanee;
  }
  public void setMassimaleScelteTemporanee(Integer massimaleScelteTemporanee) {
    this.massimaleScelteTemporanee = massimaleScelteTemporanee;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("comune_ambulatorio") 
 
  public String getComuneAmbulatorio() {
    return comuneAmbulatorio;
  }
  public void setComuneAmbulatorio(String comuneAmbulatorio) {
    this.comuneAmbulatorio = comuneAmbulatorio;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cap_ambulatorio") 
 
  public String getCapAmbulatorio() {
    return capAmbulatorio;
  }
  public void setCapAmbulatorio(String capAmbulatorio) {
    this.capAmbulatorio = capAmbulatorio;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("orario_amb_domenica") 
 
  public String getOrarioAmbDomenica() {
    return orarioAmbDomenica;
  }
  public void setOrarioAmbDomenica(String orarioAmbDomenica) {
    this.orarioAmbDomenica = orarioAmbDomenica;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("orario_amb_venerdi") 
 
  public String getOrarioAmbVenerdi() {
    return orarioAmbVenerdi;
  }
  public void setOrarioAmbVenerdi(String orarioAmbVenerdi) {
    this.orarioAmbVenerdi = orarioAmbVenerdi;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("desc_ambito_medico") 
 
  public String getDescAmbitoMedico() {
    return descAmbitoMedico;
  }
  public void setDescAmbitoMedico(String descAmbitoMedico) {
    this.descAmbitoMedico = descAmbitoMedico;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id_ambulatorio") 
 
  public Integer getIdAmbulatorio() {
    return idAmbulatorio;
  }
  public void setIdAmbulatorio(Integer idAmbulatorio) {
    this.idAmbulatorio = idAmbulatorio;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("orario_amb_lunedi") 
 
  public String getOrarioAmbLunedi() {
    return orarioAmbLunedi;
  }
  public void setOrarioAmbLunedi(String orarioAmbLunedi) {
    this.orarioAmbLunedi = orarioAmbLunedi;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cod_distretto_medico") 
 
  public Integer getCodDistrettoMedico() {
    return codDistrettoMedico;
  }
  public void setCodDistrettoMedico(Integer codDistrettoMedico) {
    this.codDistrettoMedico = codDistrettoMedico;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Propertie propertie = (Propertie) o;
    return Objects.equals(idAuraMedico, propertie.idAuraMedico) &&
        Objects.equals(autolimitato, propertie.autolimitato) &&
        Objects.equals(indirizzoEmailAmbulatorio, propertie.indirizzoEmailAmbulatorio) &&
        Objects.equals(cognomeMedico, propertie.cognomeMedico) &&
        Objects.equals(codAmbitoMedico, propertie.codAmbitoMedico) &&
        Objects.equals(noteAmbulatorio, propertie.noteAmbulatorio) &&
        Objects.equals(indirizzoEmailMedico, propertie.indirizzoEmailMedico) &&
        Objects.equals(idRaplavAmbulatorio, propertie.idRaplavAmbulatorio) &&
        Objects.equals(orarioAmbMartedi, propertie.orarioAmbMartedi) &&
        Objects.equals(indirizzoAmbulatorio, propertie.indirizzoAmbulatorio) &&
        Objects.equals(codAsl, propertie.codAsl) &&
        Objects.equals(specializzazioni, propertie.specializzazioni) &&
        Objects.equals(orarioAmbSabato, propertie.orarioAmbSabato) &&
        Objects.equals(descTipoAmbulatorio, propertie.descTipoAmbulatorio) &&
        Objects.equals(orarioAmbGiovedi, propertie.orarioAmbGiovedi) &&
        Objects.equals(massimale, propertie.massimale) &&
        Objects.equals(dataNascitaMedico, propertie.dataNascitaMedico) &&
        Objects.equals(massimaleScelteInDeroga, propertie.massimaleScelteInDeroga) &&
        Objects.equals(sessoMedico, propertie.sessoMedico) &&
        Objects.equals(descDistrettoMedico, propertie.descDistrettoMedico) &&
        Objects.equals(loccsiLabel, propertie.loccsiLabel) &&
        Objects.equals(codiceRegionaleMedico, propertie.codiceRegionaleMedico) &&
        Objects.equals(orarioAmbMercoledi, propertie.orarioAmbMercoledi) &&
        Objects.equals(provinciaAmbulatorio, propertie.provinciaAmbulatorio) &&
        Objects.equals(tipologiaMedico, propertie.tipologiaMedico) &&
        Objects.equals(idTipoAmbulMedico, propertie.idTipoAmbulMedico) &&
        Objects.equals(nomeMedico, propertie.nomeMedico) &&
        Objects.equals(descAsl, propertie.descAsl) &&
        Objects.equals(massimaleRiservatoFasciaEta, propertie.massimaleRiservatoFasciaEta) &&
        Objects.equals(massimaleScelteTemporanee, propertie.massimaleScelteTemporanee) &&
        Objects.equals(comuneAmbulatorio, propertie.comuneAmbulatorio) &&
        Objects.equals(capAmbulatorio, propertie.capAmbulatorio) &&
        Objects.equals(orarioAmbDomenica, propertie.orarioAmbDomenica) &&
        Objects.equals(orarioAmbVenerdi, propertie.orarioAmbVenerdi) &&
        Objects.equals(descAmbitoMedico, propertie.descAmbitoMedico) &&
        Objects.equals(idAmbulatorio, propertie.idAmbulatorio) &&
        Objects.equals(orarioAmbLunedi, propertie.orarioAmbLunedi) &&
        Objects.equals(codDistrettoMedico, propertie.codDistrettoMedico) &&
        Objects.equals(codiceFiscaleMedico, propertie.codiceFiscaleMedico);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idAuraMedico, autolimitato, indirizzoEmailAmbulatorio, cognomeMedico, codAmbitoMedico, noteAmbulatorio, indirizzoEmailMedico, idRaplavAmbulatorio, orarioAmbMartedi, indirizzoAmbulatorio, codAsl, specializzazioni, orarioAmbSabato, descTipoAmbulatorio, orarioAmbGiovedi, massimale, dataNascitaMedico, massimaleScelteInDeroga, sessoMedico, descDistrettoMedico, loccsiLabel, codiceRegionaleMedico, orarioAmbMercoledi, provinciaAmbulatorio, tipologiaMedico, idTipoAmbulMedico, nomeMedico, descAsl, massimaleRiservatoFasciaEta, massimaleScelteTemporanee, comuneAmbulatorio, capAmbulatorio, orarioAmbDomenica, orarioAmbVenerdi, descAmbitoMedico, idAmbulatorio, orarioAmbLunedi, codDistrettoMedico, codiceFiscaleMedico);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Propertie {\n");
    
    sb.append("    idAuraMedico: ").append(toIndentedString(idAuraMedico)).append("\n");
    sb.append("    autolimitato: ").append(toIndentedString(autolimitato)).append("\n");
    sb.append("    indirizzoEmailAmbulatorio: ").append(toIndentedString(indirizzoEmailAmbulatorio)).append("\n");
    sb.append("    cognomeMedico: ").append(toIndentedString(cognomeMedico)).append("\n");
    sb.append("    codAmbitoMedico: ").append(toIndentedString(codAmbitoMedico)).append("\n");
    sb.append("    noteAmbulatorio: ").append(toIndentedString(noteAmbulatorio)).append("\n");
    sb.append("    indirizzoEmailMedico: ").append(toIndentedString(indirizzoEmailMedico)).append("\n");
    sb.append("    idRaplavAmbulatorio: ").append(toIndentedString(idRaplavAmbulatorio)).append("\n");
    sb.append("    orarioAmbMartedi: ").append(toIndentedString(orarioAmbMartedi)).append("\n");
    sb.append("    indirizzoAmbulatorio: ").append(toIndentedString(indirizzoAmbulatorio)).append("\n");
    sb.append("    codAsl: ").append(toIndentedString(codAsl)).append("\n");
    sb.append("    specializzazioni: ").append(toIndentedString(specializzazioni)).append("\n");
    sb.append("    orarioAmbSabato: ").append(toIndentedString(orarioAmbSabato)).append("\n");
    sb.append("    descTipoAmbulatorio: ").append(toIndentedString(descTipoAmbulatorio)).append("\n");
    sb.append("    orarioAmbGiovedi: ").append(toIndentedString(orarioAmbGiovedi)).append("\n");
    sb.append("    massimale: ").append(toIndentedString(massimale)).append("\n");
    sb.append("    dataNascitaMedico: ").append(toIndentedString(dataNascitaMedico)).append("\n");
    sb.append("    massimaleScelteInDeroga: ").append(toIndentedString(massimaleScelteInDeroga)).append("\n");
    sb.append("    sessoMedico: ").append(toIndentedString(sessoMedico)).append("\n");
    sb.append("    descDistrettoMedico: ").append(toIndentedString(descDistrettoMedico)).append("\n");
    sb.append("    loccsiLabel: ").append(toIndentedString(loccsiLabel)).append("\n");
    sb.append("    codiceRegionaleMedico: ").append(toIndentedString(codiceRegionaleMedico)).append("\n");
    sb.append("    orarioAmbMercoledi: ").append(toIndentedString(orarioAmbMercoledi)).append("\n");
    sb.append("    provinciaAmbulatorio: ").append(toIndentedString(provinciaAmbulatorio)).append("\n");
    sb.append("    tipologiaMedico: ").append(toIndentedString(tipologiaMedico)).append("\n");
    sb.append("    idTipoAmbulMedico: ").append(toIndentedString(idTipoAmbulMedico)).append("\n");
    sb.append("    nomeMedico: ").append(toIndentedString(nomeMedico)).append("\n");
    sb.append("    descAsl: ").append(toIndentedString(descAsl)).append("\n");
    sb.append("    massimaleRiservatoFasciaEta: ").append(toIndentedString(massimaleRiservatoFasciaEta)).append("\n");
    sb.append("    massimaleScelteTemporanee: ").append(toIndentedString(massimaleScelteTemporanee)).append("\n");
    sb.append("    comuneAmbulatorio: ").append(toIndentedString(comuneAmbulatorio)).append("\n");
    sb.append("    capAmbulatorio: ").append(toIndentedString(capAmbulatorio)).append("\n");
    sb.append("    orarioAmbDomenica: ").append(toIndentedString(orarioAmbDomenica)).append("\n");
    sb.append("    orarioAmbVenerdi: ").append(toIndentedString(orarioAmbVenerdi)).append("\n");
    sb.append("    descAmbitoMedico: ").append(toIndentedString(descAmbitoMedico)).append("\n");
    sb.append("    idAmbulatorio: ").append(toIndentedString(idAmbulatorio)).append("\n");
    sb.append("    orarioAmbLunedi: ").append(toIndentedString(orarioAmbLunedi)).append("\n");
    sb.append("    codDistrettoMedico: ").append(toIndentedString(codDistrettoMedico)).append("\n");
    sb.append("    codiceFiscaleMedico: ").append(toIndentedString(codiceFiscaleMedico)).append("\n");
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

