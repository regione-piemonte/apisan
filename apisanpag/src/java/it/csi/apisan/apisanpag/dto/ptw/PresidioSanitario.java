/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.dto.ptw;

import java.util.Objects;

import org.codehaus.jackson.annotate.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class PresidioSanitario   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private Integer id = null;
  private String descrizione = null;

  /**
   * identificativo del presidio sanitario regionale afferente ad una Azienda sanitaria regionale
   **/
  
  @ApiModelProperty(example = "301001", value = "identificativo del presidio sanitario regionale afferente ad una Azienda sanitaria regionale")
  @JsonProperty("id") 
 
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * nome del presidio sanitario regionale afferente ad una Azienda sanitaria regionale
   **/
  
  @ApiModelProperty(example = "OSPEDALE SANT'ANNA", value = "nome del presidio sanitario regionale afferente ad una Azienda sanitaria regionale")
  @JsonProperty("descrizione") 
 
  public String getDescrizione() {
    return descrizione;
  }
  public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PresidioSanitario presidioSanitario = (PresidioSanitario) o;
    return Objects.equals(id, presidioSanitario.id) &&
        Objects.equals(descrizione, presidioSanitario.descrizione);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, descrizione);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PresidioSanitario {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    descrizione: ").append(toIndentedString(descrizione)).append("\n");
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

