/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanaut.dto.apisanaut;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanaut.dto.apisanaut.Cittadino;
import it.csi.apisan.apisanaut.dto.apisanaut.DichiarazioneDettaglio;
import it.csi.apisan.apisanaut.dto.apisanaut.DichiarazioneModo;
import it.csi.apisan.apisanaut.dto.apisanaut.DichiarazioneStato;
import it.csi.apisan.apisanaut.dto.apisanaut.DichiarazioneTipo;
import java.util.Date;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class Dichiarazione   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String uuid = null;
  private DichiarazioneTipo tipo = null;
  private DichiarazioneStato stato = null;
  private DichiarazioneModo modo = null;
  private Cittadino cittadino = null;
  private String numeroDocumento = null;
  private String autorita = null;
  private Date dataInizioTutela = null;
  private Date dataFineTutela = null;
  private List<DichiarazioneDettaglio> dettagli = new ArrayList<DichiarazioneDettaglio>();

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
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tipo") 
 
  public DichiarazioneTipo getTipo() {
    return tipo;
  }
  public void setTipo(DichiarazioneTipo tipo) {
    this.tipo = tipo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("stato") 
 
  public DichiarazioneStato getStato() {
    return stato;
  }
  public void setStato(DichiarazioneStato stato) {
    this.stato = stato;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("modo") 
 
  public DichiarazioneModo getModo() {
    return modo;
  }
  public void setModo(DichiarazioneModo modo) {
    this.modo = modo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cittadino") 
 
  public Cittadino getCittadino() {
    return cittadino;
  }
  public void setCittadino(Cittadino cittadino) {
    this.cittadino = cittadino;
  }

  /**
   * numero del documento
   **/
  
  @ApiModelProperty(value = "numero del documento")
  @JsonProperty("numero_documento") 
 
  public String getNumeroDocumento() {
    return numeroDocumento;
  }
  public void setNumeroDocumento(String numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
  }

  /**
   * autorita che ha emesso il documento
   **/
  
  @ApiModelProperty(value = "autorita che ha emesso il documento")
  @JsonProperty("autorita") 
 
  public String getAutorita() {
    return autorita;
  }
  public void setAutorita(String autorita) {
    this.autorita = autorita;
  }

  /**
   * data di inizio tutela valorizzata solo per le tutele indica la data di inizio tutela
   **/
  
  @ApiModelProperty(value = "data di inizio tutela valorizzata solo per le tutele indica la data di inizio tutela")
  @JsonProperty("data_inizio_tutela") 
 
  public Date getDataInizioTutela() {
    return dataInizioTutela;
  }
  public void setDataInizioTutela(Date dataInizioTutela) {
    this.dataInizioTutela = dataInizioTutela;
  }

  /**
   * data di fine tutela valorizzata solo per le tutele indica la data di inizio tutela
   **/
  
  @ApiModelProperty(value = "data di fine tutela valorizzata solo per le tutele indica la data di inizio tutela")
  @JsonProperty("data_fine_tutela") 
 
  public Date getDataFineTutela() {
    return dataFineTutela;
  }
  public void setDataFineTutela(Date dataFineTutela) {
    this.dataFineTutela = dataFineTutela;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dettagli") 
 
  public List<DichiarazioneDettaglio> getDettagli() {
    return dettagli;
  }
  public void setDettagli(List<DichiarazioneDettaglio> dettagli) {
    this.dettagli = dettagli;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dichiarazione dichiarazione = (Dichiarazione) o;
    return Objects.equals(uuid, dichiarazione.uuid) &&
        Objects.equals(tipo, dichiarazione.tipo) &&
        Objects.equals(stato, dichiarazione.stato) &&
        Objects.equals(modo, dichiarazione.modo) &&
        Objects.equals(cittadino, dichiarazione.cittadino) &&
        Objects.equals(numeroDocumento, dichiarazione.numeroDocumento) &&
        Objects.equals(autorita, dichiarazione.autorita) &&
        Objects.equals(dataInizioTutela, dichiarazione.dataInizioTutela) &&
        Objects.equals(dataFineTutela, dichiarazione.dataFineTutela) &&
        Objects.equals(dettagli, dichiarazione.dettagli);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, tipo, stato, modo, cittadino, numeroDocumento, autorita, dataInizioTutela, dataFineTutela, dettagli);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dichiarazione {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    stato: ").append(toIndentedString(stato)).append("\n");
    sb.append("    modo: ").append(toIndentedString(modo)).append("\n");
    sb.append("    cittadino: ").append(toIndentedString(cittadino)).append("\n");
    sb.append("    numeroDocumento: ").append(toIndentedString(numeroDocumento)).append("\n");
    sb.append("    autorita: ").append(toIndentedString(autorita)).append("\n");
    sb.append("    dataInizioTutela: ").append(toIndentedString(dataInizioTutela)).append("\n");
    sb.append("    dataFineTutela: ").append(toIndentedString(dataFineTutela)).append("\n");
    sb.append("    dettagli: ").append(toIndentedString(dettagli)).append("\n");
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

