/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.model;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanvac.model.ModelVaccinoDose;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class PayloadAutocontribuzione   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String descrizione = null;
  private String tipologia = null;
  private String soggettoEmittente = null;
  private String dataEmissioneDocumento = null;
  private String documento64 = null;
  private String nomeDocumento = null;
  private String idConvocazione = null;
  private String idAppuntamento = null;
  private String telefono = null;
  private String mail = null;
  private String motivazione = null;
  private List<ModelVaccinoDose> vaccinazioni = new ArrayList<ModelVaccinoDose>();

  /**
   * Note
   **/
  
  @ApiModelProperty(value = "Note")
  @JsonProperty("descrizione") 
 
  public String getDescrizione() {
    return descrizione;
  }
  public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
  }

  /**
   * La tipologia di autocontribuzone ( DIFFERIMENTO, OMISSIONE, COMUNICAZIONE)
   **/
  
  @ApiModelProperty(example = "DIFFERIMENTO", required = true, value = "La tipologia di autocontribuzone ( DIFFERIMENTO, OMISSIONE, COMUNICAZIONE)")
  @JsonProperty("tipologia") 
 
  @NotNull
  public String getTipologia() {
    return tipologia;
  }
  public void setTipologia(String tipologia) {
    this.tipologia = tipologia;
  }

  /**
   * Il soggetto che ha emesso il documento
   **/
  
  @ApiModelProperty(example = "Comune di Torino", required = true, value = "Il soggetto che ha emesso il documento")
  @JsonProperty("soggetto_emittente") 
 
  @NotNull
  public String getSoggettoEmittente() {
    return soggettoEmittente;
  }
  public void setSoggettoEmittente(String soggettoEmittente) {
    this.soggettoEmittente = soggettoEmittente;
  }

  /**
   * La data di emissione del documento
   **/
  
  @ApiModelProperty(example = "2019-11-08T09:21:38.739Z", value = "La data di emissione del documento")
  @JsonProperty("data_emissione_documento") 
 
  public String getDataEmissioneDocumento() {
    return dataEmissioneDocumento;
  }
  public void setDataEmissioneDocumento(String dataEmissioneDocumento) {
    this.dataEmissioneDocumento = dataEmissioneDocumento;
  }

  /**
   * Il documento codificato in base64
   **/
  
  @ApiModelProperty(required = true, value = "Il documento codificato in base64")
  @JsonProperty("documento_64") 
 
  @NotNull
  public String getDocumento64() {
    return documento64;
  }
  public void setDocumento64(String documento64) {
    this.documento64 = documento64;
  }

  /**
   * il nome del documento
   **/
  
  @ApiModelProperty(example = "cartificato.crt", required = true, value = "il nome del documento")
  @JsonProperty("nome_documento") 
 
  @NotNull
  public String getNomeDocumento() {
    return nomeDocumento;
  }
  public void setNomeDocumento(String nomeDocumento) {
    this.nomeDocumento = nomeDocumento;
  }

  /**
   * eventuale id della convocazione
   **/
  
  @ApiModelProperty(value = "eventuale id della convocazione")
  @JsonProperty("id_convocazione") 
 
  public String getIdConvocazione() {
    return idConvocazione;
  }
  public void setIdConvocazione(String idConvocazione) {
    this.idConvocazione = idConvocazione;
  }

  /**
   * eventuale id dell appuntamento
   **/
  
  @ApiModelProperty(value = "eventuale id dell appuntamento")
  @JsonProperty("id_appuntamento") 
 
  public String getIdAppuntamento() {
    return idAppuntamento;
  }
  public void setIdAppuntamento(String idAppuntamento) {
    this.idAppuntamento = idAppuntamento;
  }

  /**
   * contatto telefonico
   **/
  
  @ApiModelProperty(value = "contatto telefonico")
  @JsonProperty("telefono") 
 
  public String getTelefono() {
    return telefono;
  }
  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  /**
   * contatto email
   **/
  
  @ApiModelProperty(value = "contatto email")
  @JsonProperty("mail") 
 
  public String getMail() {
    return mail;
  }
  public void setMail(String mail) {
    this.mail = mail;
  }

  /**
   * codice motivazione
   **/
  
  @ApiModelProperty(value = "codice motivazione")
  @JsonProperty("motivazione") 
 
  public String getMotivazione() {
    return motivazione;
  }
  public void setMotivazione(String motivazione) {
    this.motivazione = motivazione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("vaccinazioni") 
 
  public List<ModelVaccinoDose> getVaccinazioni() {
    return vaccinazioni;
  }
  public void setVaccinazioni(List<ModelVaccinoDose> vaccinazioni) {
    this.vaccinazioni = vaccinazioni;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayloadAutocontribuzione payloadAutocontribuzione = (PayloadAutocontribuzione) o;
    return Objects.equals(descrizione, payloadAutocontribuzione.descrizione) &&
        Objects.equals(tipologia, payloadAutocontribuzione.tipologia) &&
        Objects.equals(soggettoEmittente, payloadAutocontribuzione.soggettoEmittente) &&
        Objects.equals(dataEmissioneDocumento, payloadAutocontribuzione.dataEmissioneDocumento) &&
        Objects.equals(documento64, payloadAutocontribuzione.documento64) &&
        Objects.equals(nomeDocumento, payloadAutocontribuzione.nomeDocumento) &&
        Objects.equals(idConvocazione, payloadAutocontribuzione.idConvocazione) &&
        Objects.equals(idAppuntamento, payloadAutocontribuzione.idAppuntamento) &&
        Objects.equals(telefono, payloadAutocontribuzione.telefono) &&
        Objects.equals(mail, payloadAutocontribuzione.mail) &&
        Objects.equals(motivazione, payloadAutocontribuzione.motivazione) &&
        Objects.equals(vaccinazioni, payloadAutocontribuzione.vaccinazioni);
  }

  @Override
  public int hashCode() {
    return Objects.hash(descrizione, tipologia, soggettoEmittente, dataEmissioneDocumento, documento64, nomeDocumento, idConvocazione, idAppuntamento, telefono, mail, motivazione, vaccinazioni);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadAutocontribuzione {\n");
    
    sb.append("    descrizione: ").append(toIndentedString(descrizione)).append("\n");
    sb.append("    tipologia: ").append(toIndentedString(tipologia)).append("\n");
    sb.append("    soggettoEmittente: ").append(toIndentedString(soggettoEmittente)).append("\n");
    sb.append("    dataEmissioneDocumento: ").append(toIndentedString(dataEmissioneDocumento)).append("\n");
    sb.append("    documento64: ").append(toIndentedString(documento64)).append("\n");
    sb.append("    nomeDocumento: ").append(toIndentedString(nomeDocumento)).append("\n");
    sb.append("    idConvocazione: ").append(toIndentedString(idConvocazione)).append("\n");
    sb.append("    idAppuntamento: ").append(toIndentedString(idAppuntamento)).append("\n");
    sb.append("    telefono: ").append(toIndentedString(telefono)).append("\n");
    sb.append("    mail: ").append(toIndentedString(mail)).append("\n");
    sb.append("    motivazione: ").append(toIndentedString(motivazione)).append("\n");
    sb.append("    vaccinazioni: ").append(toIndentedString(vaccinazioni)).append("\n");
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

