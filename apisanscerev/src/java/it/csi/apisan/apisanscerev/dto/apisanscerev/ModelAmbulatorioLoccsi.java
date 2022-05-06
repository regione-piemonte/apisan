/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.dto.apisanscerev;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanscerev.dto.apisanscerev.GeoJsonPunto;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelAmbulatorioLoccsiMedico;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelAmbulatorioOrarioGiorno;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelAmbulatorioTipo;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelAmbulatorioLoccsi   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private Integer id = null;
  private String provincia = null;
  private String comune = null;
  private String cap = null;
  private String indirizzo = null;
  private String telefono = null;
  private String email = null;
  private String note = null;
  private Integer rapportoLavoroId = null;
  private ModelAmbulatorioTipo tipo = null;
  private GeoJsonPunto coordinate = null;
  private ModelAmbulatorioLoccsiMedico medico = null;
  private List<ModelAmbulatorioOrarioGiorno> orari = new ArrayList<ModelAmbulatorioOrarioGiorno>();

  /**
   * Identificativo univoco
   **/
  
  @ApiModelProperty(example = "88631", value = "Identificativo univoco")
  @JsonProperty("id") 
 
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * La provincia dell&#39;ambulatorio
   **/
  
  @ApiModelProperty(example = "TO", value = "La provincia dell'ambulatorio")
  @JsonProperty("provincia") 
 
  public String getProvincia() {
    return provincia;
  }
  public void setProvincia(String provincia) {
    this.provincia = provincia;
  }

  /**
   * Il comune dell&#39;ambulatorio
   **/
  
  @ApiModelProperty(example = "Torino", value = "Il comune dell'ambulatorio")
  @JsonProperty("comune") 
 
  public String getComune() {
    return comune;
  }
  public void setComune(String comune) {
    this.comune = comune;
  }

  /**
   * Il CAP dell&#39;ambulatorio
   **/
  
  @ApiModelProperty(example = "10127", value = "Il CAP dell'ambulatorio")
  @JsonProperty("cap") 
 
  public String getCap() {
    return cap;
  }
  public void setCap(String cap) {
    this.cap = cap;
  }

  /**
   * Indirizzo dell&#39;ambulatorio
   **/
  
  @ApiModelProperty(example = "Via Roma 14, Torino", value = "Indirizzo dell'ambulatorio")
  @JsonProperty("indirizzo") 
 
  public String getIndirizzo() {
    return indirizzo;
  }
  public void setIndirizzo(String indirizzo) {
    this.indirizzo = indirizzo;
  }

  /**
   * Il telefono dell&#39;ambulatorio
   **/
  
  @ApiModelProperty(example = "01055649", value = "Il telefono dell'ambulatorio")
  @JsonProperty("telefono") 
 
  public String getTelefono() {
    return telefono;
  }
  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  /**
   * E-mail dell&#39;ambulatorio
   **/
  
  @ApiModelProperty(example = "ambulatorio@gmail.com", value = "E-mail dell'ambulatorio")
  @JsonProperty("email") 
 
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * Note dell&#39;ambulatorio
   **/
  
  @ApiModelProperty(example = "Resterà chiuso dal 18 al 24, rcatevi all'ambulatorio in via Garibaldi", value = "Note dell'ambulatorio")
  @JsonProperty("note") 
 
  public String getNote() {
    return note;
  }
  public void setNote(String note) {
    this.note = note;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("rapporto_lavoro_id") 
 
  public Integer getRapportoLavoroId() {
    return rapportoLavoroId;
  }
  public void setRapportoLavoroId(Integer rapportoLavoroId) {
    this.rapportoLavoroId = rapportoLavoroId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tipo") 
 
  public ModelAmbulatorioTipo getTipo() {
    return tipo;
  }
  public void setTipo(ModelAmbulatorioTipo tipo) {
    this.tipo = tipo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("coordinate") 
 
  public GeoJsonPunto getCoordinate() {
    return coordinate;
  }
  public void setCoordinate(GeoJsonPunto coordinate) {
    this.coordinate = coordinate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("medico") 
 
  public ModelAmbulatorioLoccsiMedico getMedico() {
    return medico;
  }
  public void setMedico(ModelAmbulatorioLoccsiMedico medico) {
    this.medico = medico;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("orari") 
 
  public List<ModelAmbulatorioOrarioGiorno> getOrari() {
    return orari;
  }
  public void setOrari(List<ModelAmbulatorioOrarioGiorno> orari) {
    this.orari = orari;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelAmbulatorioLoccsi modelAmbulatorioLoccsi = (ModelAmbulatorioLoccsi) o;
    return Objects.equals(id, modelAmbulatorioLoccsi.id) &&
        Objects.equals(provincia, modelAmbulatorioLoccsi.provincia) &&
        Objects.equals(comune, modelAmbulatorioLoccsi.comune) &&
        Objects.equals(cap, modelAmbulatorioLoccsi.cap) &&
        Objects.equals(indirizzo, modelAmbulatorioLoccsi.indirizzo) &&
        Objects.equals(telefono, modelAmbulatorioLoccsi.telefono) &&
        Objects.equals(email, modelAmbulatorioLoccsi.email) &&
        Objects.equals(note, modelAmbulatorioLoccsi.note) &&
        Objects.equals(rapportoLavoroId, modelAmbulatorioLoccsi.rapportoLavoroId) &&
        Objects.equals(tipo, modelAmbulatorioLoccsi.tipo) &&
        Objects.equals(coordinate, modelAmbulatorioLoccsi.coordinate) &&
        Objects.equals(medico, modelAmbulatorioLoccsi.medico) &&
        Objects.equals(orari, modelAmbulatorioLoccsi.orari);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, provincia, comune, cap, indirizzo, telefono, email, note, rapportoLavoroId, tipo, coordinate, medico, orari);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelAmbulatorioLoccsi {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    provincia: ").append(toIndentedString(provincia)).append("\n");
    sb.append("    comune: ").append(toIndentedString(comune)).append("\n");
    sb.append("    cap: ").append(toIndentedString(cap)).append("\n");
    sb.append("    indirizzo: ").append(toIndentedString(indirizzo)).append("\n");
    sb.append("    telefono: ").append(toIndentedString(telefono)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    rapportoLavoroId: ").append(toIndentedString(rapportoLavoroId)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    coordinate: ").append(toIndentedString(coordinate)).append("\n");
    sb.append("    medico: ").append(toIndentedString(medico)).append("\n");
    sb.append("    orari: ").append(toIndentedString(orari)).append("\n");
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

