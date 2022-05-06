/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesen.dto.apisanesen;

import java.util.Objects;
import java.util.ArrayList;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class CodiceEsenzione   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String codice = null;
  private String descrizione = null;
  private String motivo = null;
  private Boolean familiare = null;
  private Boolean valido = null;
  private String dataAttivazione = null;
  private String dataScadenza = null;

  /**
   * Il codice dell&#39;esenzione.
   **/
  
  @ApiModelProperty(example = "E01", value = "Il codice dell'esenzione.")
  @JsonProperty("codice") 
 
  public String getCodice() {
    return codice;
  }
  public void setCodice(String codice) {
    this.codice = codice;
  }

  /**
   **/
  
  @ApiModelProperty(example = "Cittadini con meno di 6 anni o più di 65 anni", value = "")
  @JsonProperty("descrizione") 
 
  public String getDescrizione() {
    return descrizione;
  }
  public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
  }

  /**
   * Una descrizione testuale da mostrare all&#39;utente.
   **/
  
  @ApiModelProperty(example = "Cittadini di età inferiore a sei anni e superiore a sessantacinque anni, appartenenti ad un nucleo familiare con reddito annuo complessivo non superiore a 36.151,98 euro.", value = "Una descrizione testuale da mostrare all'utente.")
  @JsonProperty("motivo") 
 
  public String getMotivo() {
    return motivo;
  }
  public void setMotivo(String motivo) {
    this.motivo = motivo;
  }

  /**
   * Indica se la tipologia di esenzione definita dal codice è relativa al nucleo familiare
   **/
  
  @ApiModelProperty(example = "false", value = "Indica se la tipologia di esenzione definita dal codice è relativa al nucleo familiare")
  @JsonProperty("familiare") 
 
  public Boolean isFamiliare() {
    return familiare;
  }
  public void setFamiliare(Boolean familiare) {
    this.familiare = familiare;
  }

  /**
   * Indica se il codice è attualmente valido o se deve essere utilizzato solo per la ricerca delle esenzioni vecchie
   **/
  
  @ApiModelProperty(example = "true", value = "Indica se il codice è attualmente valido o se deve essere utilizzato solo per la ricerca delle esenzioni vecchie")
  @JsonProperty("valido") 
 
  public Boolean isValido() {
    return valido;
  }
  public void setValido(Boolean valido) {
    this.valido = valido;
  }

  /**
   * Indica quando è stata attivato o verrà attivato il codice esenzione. Potrebbe essere utile per mostrare l&#39;informazione all&#39;utente
   **/
  
  @ApiModelProperty(example = "2018-07-23T15:25:00+02:00", value = "Indica quando è stata attivato o verrà attivato il codice esenzione. Potrebbe essere utile per mostrare l'informazione all'utente")
  @JsonProperty("data_attivazione") 
 
  public String getDataAttivazione() {
    return dataAttivazione;
  }
  public void setDataAttivazione(String dataAttivazione) {
    this.dataAttivazione = dataAttivazione;
  }

  /**
   * Indica quando scade il codice esenzione. Potrebbe essere utile per mostrare l&#39;informazione all&#39;utente
   **/
  
  @ApiModelProperty(example = "2018-07-23T15:25:00+02:00", value = "Indica quando scade il codice esenzione. Potrebbe essere utile per mostrare l'informazione all'utente")
  @JsonProperty("data_scadenza") 
 
  public String getDataScadenza() {
    return dataScadenza;
  }
  public void setDataScadenza(String dataScadenza) {
    this.dataScadenza = dataScadenza;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CodiceEsenzione codiceEsenzione = (CodiceEsenzione) o;
    return Objects.equals(codice, codiceEsenzione.codice) &&
        Objects.equals(descrizione, codiceEsenzione.descrizione) &&
        Objects.equals(motivo, codiceEsenzione.motivo) &&
        Objects.equals(familiare, codiceEsenzione.familiare) &&
        Objects.equals(valido, codiceEsenzione.valido) &&
        Objects.equals(dataAttivazione, codiceEsenzione.dataAttivazione) &&
        Objects.equals(dataScadenza, codiceEsenzione.dataScadenza);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codice, descrizione, motivo, familiare, valido, dataAttivazione, dataScadenza);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodiceEsenzione {\n");
    
    sb.append("    codice: ").append(toIndentedString(codice)).append("\n");
    sb.append("    descrizione: ").append(toIndentedString(descrizione)).append("\n");
    sb.append("    motivo: ").append(toIndentedString(motivo)).append("\n");
    sb.append("    familiare: ").append(toIndentedString(familiare)).append("\n");
    sb.append("    valido: ").append(toIndentedString(valido)).append("\n");
    sb.append("    dataAttivazione: ").append(toIndentedString(dataAttivazione)).append("\n");
    sb.append("    dataScadenza: ").append(toIndentedString(dataScadenza)).append("\n");
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

