/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.dto.apisanpresc;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Il model che descrive una prestazione o un farmaco prescritto in una ricetta ")

public class ModelPrescrizione   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String codiceCatalogoRegionale = null;
  private String descrizioneCatalogoRegionale = null;
  private String codiceAic = null;
  private String descrizioneAic = null;
  private String codiceGruppoEquivalenza = null;
  private String descrizioneGruppoEquivalenza = null;
  private Integer quantita = null;
  private String nota = null;
  private String tipoAccesso = null;

  /**
   * Il codice della prestazione riportato nel catalogo regionale
   **/
  
  @ApiModelProperty(value = "Il codice della prestazione riportato nel catalogo regionale")
  @JsonProperty("codice_catalogo_regionale") 
 
  public String getCodiceCatalogoRegionale() {
    return codiceCatalogoRegionale;
  }
  public void setCodiceCatalogoRegionale(String codiceCatalogoRegionale) {
    this.codiceCatalogoRegionale = codiceCatalogoRegionale;
  }

  /**
   * Descrizione della prestazione riportata nel catalogo regionale
   **/
  
  @ApiModelProperty(value = "Descrizione della prestazione riportata nel catalogo regionale")
  @JsonProperty("descrizione_catalogo_regionale") 
 
  public String getDescrizioneCatalogoRegionale() {
    return descrizioneCatalogoRegionale;
  }
  public void setDescrizioneCatalogoRegionale(String descrizioneCatalogoRegionale) {
    this.descrizioneCatalogoRegionale = descrizioneCatalogoRegionale;
  }

  /**
   * Il codice del farmaco AIC (i farmaci commerciali)
   **/
  
  @ApiModelProperty(value = "Il codice del farmaco AIC (i farmaci commerciali)")
  @JsonProperty("codice_aic") 
 
  public String getCodiceAic() {
    return codiceAic;
  }
  public void setCodiceAic(String codiceAic) {
    this.codiceAic = codiceAic;
  }

  /**
   * Descrizione del farmaco AIC (i farmaci commerciali)
   **/
  
  @ApiModelProperty(value = "Descrizione del farmaco AIC (i farmaci commerciali)")
  @JsonProperty("descrizione_aic") 
 
  public String getDescrizioneAic() {
    return descrizioneAic;
  }
  public void setDescrizioneAic(String descrizioneAic) {
    this.descrizioneAic = descrizioneAic;
  }

  /**
   * Codice del farmaco generico
   **/
  
  @ApiModelProperty(value = "Codice del farmaco generico")
  @JsonProperty("codice_gruppo_equivalenza") 
 
  public String getCodiceGruppoEquivalenza() {
    return codiceGruppoEquivalenza;
  }
  public void setCodiceGruppoEquivalenza(String codiceGruppoEquivalenza) {
    this.codiceGruppoEquivalenza = codiceGruppoEquivalenza;
  }

  /**
   * Descrizione del farmaco generico
   **/
  
  @ApiModelProperty(value = "Descrizione del farmaco generico")
  @JsonProperty("descrizione_gruppo_equivalenza") 
 
  public String getDescrizioneGruppoEquivalenza() {
    return descrizioneGruppoEquivalenza;
  }
  public void setDescrizioneGruppoEquivalenza(String descrizioneGruppoEquivalenza) {
    this.descrizioneGruppoEquivalenza = descrizioneGruppoEquivalenza;
  }

  /**
   * la quantità di farmaci o visite prescritte
   **/
  
  @ApiModelProperty(required = true, value = "la quantità di farmaci o visite prescritte")
  @JsonProperty("quantita") 
 
  @NotNull
  public Integer getQuantita() {
    return quantita;
  }
  public void setQuantita(Integer quantita) {
    this.quantita = quantita;
  }

  /**
   * Nota presente nella prestazione
   **/
  
  @ApiModelProperty(required = true, value = "Nota presente nella prestazione")
  @JsonProperty("nota") 
 
  @NotNull
  public String getNota() {
    return nota;
  }
  public void setNota(String nota) {
    this.nota = nota;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tipo_accesso") 
 
  public String getTipoAccesso() {
    return tipoAccesso;
  }
  public void setTipoAccesso(String tipoAccesso) {
    this.tipoAccesso = tipoAccesso;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelPrescrizione modelPrescrizione = (ModelPrescrizione) o;
    return Objects.equals(codiceCatalogoRegionale, modelPrescrizione.codiceCatalogoRegionale) &&
        Objects.equals(descrizioneCatalogoRegionale, modelPrescrizione.descrizioneCatalogoRegionale) &&
        Objects.equals(codiceAic, modelPrescrizione.codiceAic) &&
        Objects.equals(descrizioneAic, modelPrescrizione.descrizioneAic) &&
        Objects.equals(codiceGruppoEquivalenza, modelPrescrizione.codiceGruppoEquivalenza) &&
        Objects.equals(descrizioneGruppoEquivalenza, modelPrescrizione.descrizioneGruppoEquivalenza) &&
        Objects.equals(quantita, modelPrescrizione.quantita) &&
        Objects.equals(nota, modelPrescrizione.nota) &&
        Objects.equals(tipoAccesso, modelPrescrizione.tipoAccesso);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codiceCatalogoRegionale, descrizioneCatalogoRegionale, codiceAic, descrizioneAic, codiceGruppoEquivalenza, descrizioneGruppoEquivalenza, quantita, nota, tipoAccesso);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelPrescrizione {\n");
    
    sb.append("    codiceCatalogoRegionale: ").append(toIndentedString(codiceCatalogoRegionale)).append("\n");
    sb.append("    descrizioneCatalogoRegionale: ").append(toIndentedString(descrizioneCatalogoRegionale)).append("\n");
    sb.append("    codiceAic: ").append(toIndentedString(codiceAic)).append("\n");
    sb.append("    descrizioneAic: ").append(toIndentedString(descrizioneAic)).append("\n");
    sb.append("    codiceGruppoEquivalenza: ").append(toIndentedString(codiceGruppoEquivalenza)).append("\n");
    sb.append("    descrizioneGruppoEquivalenza: ").append(toIndentedString(descrizioneGruppoEquivalenza)).append("\n");
    sb.append("    quantita: ").append(toIndentedString(quantita)).append("\n");
    sb.append("    nota: ").append(toIndentedString(nota)).append("\n");
    sb.append("    tipoAccesso: ").append(toIndentedString(tipoAccesso)).append("\n");
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

