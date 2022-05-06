/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.dto.apisanscreen;

import java.util.Objects;
import java.util.ArrayList;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelCittadino   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private Integer codiceInterno = null;

  /**
   * Un prefisso che si abbina al codice interno. * S &#x3D; &#39;screening&#39; * E &#x3D; &#39;extra screening&#39; * V &#x3D; &#39;Valle d&#39;Aosta&#39; 
   */
  public enum CodiceInternoPrefissoEnum {
    S("S"),

        E("E"),

        V("V");
    private String value;

    CodiceInternoPrefissoEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private CodiceInternoPrefissoEnum codiceInternoPrefisso = null;
  private String nome = null;
  private String cognome = null;
  private Date dataNascita = null;
  private String tesseraSanitaria = null;
  private String provincia = null;
  private String comune = null;
  private String cap = null;
  private String indirizzo = null;
  private String civico = null;
  private String provinciaAlternativo = null;
  private String comuneAlternativo = null;
  private String capAlternativo = null;
  private String indirizzoAlternativo = null;
  private String civicoAlternativo = null;
  private String telefono1 = null;
  private String telefono2 = null;
  private String telefono1Locale = null;
  private String telefono2Locale = null;
  private String email = null;
  private String statoCodice = null;

  /**
   * Un codice che identifica univocamente l&#39;assistita all&#39;interno del sistema regionale di screening 
   **/
  
  @ApiModelProperty(value = "Un codice che identifica univocamente l'assistita all'interno del sistema regionale di screening ")
  @JsonProperty("codice_interno") 
 
  public Integer getCodiceInterno() {
    return codiceInterno;
  }
  public void setCodiceInterno(Integer codiceInterno) {
    this.codiceInterno = codiceInterno;
  }

  /**
   * Un prefisso che si abbina al codice interno. * S &#x3D; &#39;screening&#39; * E &#x3D; &#39;extra screening&#39; * V &#x3D; &#39;Valle d&#39;Aosta&#39; 
   **/
  
  @ApiModelProperty(value = "Un prefisso che si abbina al codice interno. * S = 'screening' * E = 'extra screening' * V = 'Valle d'Aosta' ")
  @JsonProperty("codice_interno_prefisso") 
 
  public CodiceInternoPrefissoEnum getCodiceInternoPrefisso() {
    return codiceInternoPrefisso;
  }
  public void setCodiceInternoPrefisso(CodiceInternoPrefissoEnum codiceInternoPrefisso) {
    this.codiceInternoPrefisso = codiceInternoPrefisso;
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
  @JsonProperty("tessera_sanitaria") 
 
  public String getTesseraSanitaria() {
    return tesseraSanitaria;
  }
  public void setTesseraSanitaria(String tesseraSanitaria) {
    this.tesseraSanitaria = tesseraSanitaria;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("provincia") 
 
  public String getProvincia() {
    return provincia;
  }
  public void setProvincia(String provincia) {
    this.provincia = provincia;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("comune") 
 
  public String getComune() {
    return comune;
  }
  public void setComune(String comune) {
    this.comune = comune;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cap") 
 
  public String getCap() {
    return cap;
  }
  public void setCap(String cap) {
    this.cap = cap;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("indirizzo") 
 
  public String getIndirizzo() {
    return indirizzo;
  }
  public void setIndirizzo(String indirizzo) {
    this.indirizzo = indirizzo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("civico") 
 
  public String getCivico() {
    return civico;
  }
  public void setCivico(String civico) {
    this.civico = civico;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("provincia_alternativo") 
 
  public String getProvinciaAlternativo() {
    return provinciaAlternativo;
  }
  public void setProvinciaAlternativo(String provinciaAlternativo) {
    this.provinciaAlternativo = provinciaAlternativo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("comune_alternativo") 
 
  public String getComuneAlternativo() {
    return comuneAlternativo;
  }
  public void setComuneAlternativo(String comuneAlternativo) {
    this.comuneAlternativo = comuneAlternativo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cap_alternativo") 
 
  public String getCapAlternativo() {
    return capAlternativo;
  }
  public void setCapAlternativo(String capAlternativo) {
    this.capAlternativo = capAlternativo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("indirizzo_alternativo") 
 
  public String getIndirizzoAlternativo() {
    return indirizzoAlternativo;
  }
  public void setIndirizzoAlternativo(String indirizzoAlternativo) {
    this.indirizzoAlternativo = indirizzoAlternativo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("civico_alternativo") 
 
  public String getCivicoAlternativo() {
    return civicoAlternativo;
  }
  public void setCivicoAlternativo(String civicoAlternativo) {
    this.civicoAlternativo = civicoAlternativo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("telefono_1") 
 
  public String getTelefono1() {
    return telefono1;
  }
  public void setTelefono1(String telefono1) {
    this.telefono1 = telefono1;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("telefono_2") 
 
  public String getTelefono2() {
    return telefono2;
  }
  public void setTelefono2(String telefono2) {
    this.telefono2 = telefono2;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("telefono_1_locale") 
 
  public String getTelefono1Locale() {
    return telefono1Locale;
  }
  public void setTelefono1Locale(String telefono1Locale) {
    this.telefono1Locale = telefono1Locale;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("telefono_2_locale") 
 
  public String getTelefono2Locale() {
    return telefono2Locale;
  }
  public void setTelefono2Locale(String telefono2Locale) {
    this.telefono2Locale = telefono2Locale;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("email") 
 
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * E&#39; il codice dello stato dell&#39;assistito (recuperato dalla tabella MAMMOGRAFICO o CITOLOGCIO). Ritorna 0 se lo stato non è valido per operare sui SOL. E&#39; il valore che viene restituito dalla chiamata alla procedura PLSQL \&quot;STATO_VAL\&quot;. 
   **/
  
  @ApiModelProperty(value = "E' il codice dello stato dell'assistito (recuperato dalla tabella MAMMOGRAFICO o CITOLOGCIO). Ritorna 0 se lo stato non è valido per operare sui SOL. E' il valore che viene restituito dalla chiamata alla procedura PLSQL \"STATO_VAL\". ")
  @JsonProperty("stato_codice") 
 
  public String getStatoCodice() {
    return statoCodice;
  }
  public void setStatoCodice(String statoCodice) {
    this.statoCodice = statoCodice;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelCittadino modelCittadino = (ModelCittadino) o;
    return Objects.equals(codiceInterno, modelCittadino.codiceInterno) &&
        Objects.equals(codiceInternoPrefisso, modelCittadino.codiceInternoPrefisso) &&
        Objects.equals(nome, modelCittadino.nome) &&
        Objects.equals(cognome, modelCittadino.cognome) &&
        Objects.equals(dataNascita, modelCittadino.dataNascita) &&
        Objects.equals(tesseraSanitaria, modelCittadino.tesseraSanitaria) &&
        Objects.equals(provincia, modelCittadino.provincia) &&
        Objects.equals(comune, modelCittadino.comune) &&
        Objects.equals(cap, modelCittadino.cap) &&
        Objects.equals(indirizzo, modelCittadino.indirizzo) &&
        Objects.equals(civico, modelCittadino.civico) &&
        Objects.equals(provinciaAlternativo, modelCittadino.provinciaAlternativo) &&
        Objects.equals(comuneAlternativo, modelCittadino.comuneAlternativo) &&
        Objects.equals(capAlternativo, modelCittadino.capAlternativo) &&
        Objects.equals(indirizzoAlternativo, modelCittadino.indirizzoAlternativo) &&
        Objects.equals(civicoAlternativo, modelCittadino.civicoAlternativo) &&
        Objects.equals(telefono1, modelCittadino.telefono1) &&
        Objects.equals(telefono2, modelCittadino.telefono2) &&
        Objects.equals(telefono1Locale, modelCittadino.telefono1Locale) &&
        Objects.equals(telefono2Locale, modelCittadino.telefono2Locale) &&
        Objects.equals(email, modelCittadino.email) &&
        Objects.equals(statoCodice, modelCittadino.statoCodice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codiceInterno, codiceInternoPrefisso, nome, cognome, dataNascita, tesseraSanitaria, provincia, comune, cap, indirizzo, civico, provinciaAlternativo, comuneAlternativo, capAlternativo, indirizzoAlternativo, civicoAlternativo, telefono1, telefono2, telefono1Locale, telefono2Locale, email, statoCodice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelCittadino {\n");
    
    sb.append("    codiceInterno: ").append(toIndentedString(codiceInterno)).append("\n");
    sb.append("    codiceInternoPrefisso: ").append(toIndentedString(codiceInternoPrefisso)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    cognome: ").append(toIndentedString(cognome)).append("\n");
    sb.append("    dataNascita: ").append(toIndentedString(dataNascita)).append("\n");
    sb.append("    tesseraSanitaria: ").append(toIndentedString(tesseraSanitaria)).append("\n");
    sb.append("    provincia: ").append(toIndentedString(provincia)).append("\n");
    sb.append("    comune: ").append(toIndentedString(comune)).append("\n");
    sb.append("    cap: ").append(toIndentedString(cap)).append("\n");
    sb.append("    indirizzo: ").append(toIndentedString(indirizzo)).append("\n");
    sb.append("    civico: ").append(toIndentedString(civico)).append("\n");
    sb.append("    provinciaAlternativo: ").append(toIndentedString(provinciaAlternativo)).append("\n");
    sb.append("    comuneAlternativo: ").append(toIndentedString(comuneAlternativo)).append("\n");
    sb.append("    capAlternativo: ").append(toIndentedString(capAlternativo)).append("\n");
    sb.append("    indirizzoAlternativo: ").append(toIndentedString(indirizzoAlternativo)).append("\n");
    sb.append("    civicoAlternativo: ").append(toIndentedString(civicoAlternativo)).append("\n");
    sb.append("    telefono1: ").append(toIndentedString(telefono1)).append("\n");
    sb.append("    telefono2: ").append(toIndentedString(telefono2)).append("\n");
    sb.append("    telefono1Locale: ").append(toIndentedString(telefono1Locale)).append("\n");
    sb.append("    telefono2Locale: ").append(toIndentedString(telefono2Locale)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    statoCodice: ").append(toIndentedString(statoCodice)).append("\n");
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

