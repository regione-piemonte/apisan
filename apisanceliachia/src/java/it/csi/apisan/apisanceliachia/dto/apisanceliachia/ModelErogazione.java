/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanceliachia.dto.apisanceliachia;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import it.csi.apisan.apisanceliachia.dto.apisanceliachia.ModelStruttura;
import java.math.BigDecimal;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;

public class ModelErogazione   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String id = null;
  private BigDecimal importo = null;
  private Date data = null;
  private ModelStruttura struttura = null;

  /**
   * Identificativo univoco
   **/
  

  @JsonProperty("id") 
 
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * L&#39;importo dell&#39;erogazione
   **/
  

  @JsonProperty("importo") 
 
  public BigDecimal getImporto() {
    return importo;
  }
  public void setImporto(BigDecimal importo) {
    this.importo = importo;
  }

  /**
   * La data in cui è avvenuta l&#39;erogazione
   **/
  

  @JsonProperty("data") 
 
  public Date getData() {
    return data;
  }
  public void setData(Date data) {
    this.data = data;
  }

  /**
   **/
  

  @JsonProperty("struttura") 
 
  public ModelStruttura getStruttura() {
    return struttura;
  }
  public void setStruttura(ModelStruttura struttura) {
    this.struttura = struttura;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelErogazione modelErogazione = (ModelErogazione) o;
    return Objects.equals(id, modelErogazione.id) &&
        Objects.equals(importo, modelErogazione.importo) &&
        Objects.equals(data, modelErogazione.data) &&
        Objects.equals(struttura, modelErogazione.struttura);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, importo, data, struttura);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelErogazione {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    importo: ").append(toIndentedString(importo)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    struttura: ").append(toIndentedString(struttura)).append("\n");
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

