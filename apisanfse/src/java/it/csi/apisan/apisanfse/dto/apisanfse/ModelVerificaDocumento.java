/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelVerificaDocumento   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String codiceAzione = null;
  private String codiceCl = null;
  private String codiceEpisodio = null;
  private String idDocumentoIlec = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("codice_azione") 
 
  public String getCodiceAzione() {
    return codiceAzione;
  }
  public void setCodiceAzione(String codiceAzione) {
    this.codiceAzione = codiceAzione;
  }

  /**
   * codice componente lovale
   **/
  
  @ApiModelProperty(value = "codice componente lovale")
  @JsonProperty("codice_cl") 
 
  public String getCodiceCl() {
    return codiceCl;
  }
  public void setCodiceCl(String codiceCl) {
    this.codiceCl = codiceCl;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("codice_episodio") 
 
  public String getCodiceEpisodio() {
    return codiceEpisodio;
  }
  public void setCodiceEpisodio(String codiceEpisodio) {
    this.codiceEpisodio = codiceEpisodio;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id_documento_ilec") 
 
  public String getIdDocumentoIlec() {
    return idDocumentoIlec;
  }
  public void setIdDocumentoIlec(String idDocumentoIlec) {
    this.idDocumentoIlec = idDocumentoIlec;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelVerificaDocumento modelVerificaDocumento = (ModelVerificaDocumento) o;
    return Objects.equals(codiceAzione, modelVerificaDocumento.codiceAzione) &&
        Objects.equals(codiceCl, modelVerificaDocumento.codiceCl) &&
        Objects.equals(codiceEpisodio, modelVerificaDocumento.codiceEpisodio) &&
        Objects.equals(idDocumentoIlec, modelVerificaDocumento.idDocumentoIlec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codiceAzione, codiceCl, codiceEpisodio, idDocumentoIlec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelVerificaDocumento {\n");
    
    sb.append("    codiceAzione: ").append(toIndentedString(codiceAzione)).append("\n");
    sb.append("    codiceCl: ").append(toIndentedString(codiceCl)).append("\n");
    sb.append("    codiceEpisodio: ").append(toIndentedString(codiceEpisodio)).append("\n");
    sb.append("    idDocumentoIlec: ").append(toIndentedString(idDocumentoIlec)).append("\n");
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

