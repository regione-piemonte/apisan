/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.dto.apisanscerev;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelAsl;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelCittadinanza;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelMotivazioneSoggiorno;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class PayloadControlloAllegati   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private ModelCittadinanza cittadinanza = null;
  private ModelMotivazioneSoggiorno motivazioneSoggiorno = null;
  private ModelAsl aslIscrizione = null;
  private ModelAsl aslDomicilio = null;
  private ModelAsl aslResidenza = null;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("cittadinanza") 
 
  @NotNull
  public ModelCittadinanza getCittadinanza() {
    return cittadinanza;
  }
  public void setCittadinanza(ModelCittadinanza cittadinanza) {
    this.cittadinanza = cittadinanza;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("motivazione_soggiorno") 
 
  @NotNull
  public ModelMotivazioneSoggiorno getMotivazioneSoggiorno() {
    return motivazioneSoggiorno;
  }
  public void setMotivazioneSoggiorno(ModelMotivazioneSoggiorno motivazioneSoggiorno) {
    this.motivazioneSoggiorno = motivazioneSoggiorno;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("asl_iscrizione") 
 
  @NotNull
  public ModelAsl getAslIscrizione() {
    return aslIscrizione;
  }
  public void setAslIscrizione(ModelAsl aslIscrizione) {
    this.aslIscrizione = aslIscrizione;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("asl_domicilio") 
 
  @NotNull
  public ModelAsl getAslDomicilio() {
    return aslDomicilio;
  }
  public void setAslDomicilio(ModelAsl aslDomicilio) {
    this.aslDomicilio = aslDomicilio;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("asl_residenza") 
 
  @NotNull
  public ModelAsl getAslResidenza() {
    return aslResidenza;
  }
  public void setAslResidenza(ModelAsl aslResidenza) {
    this.aslResidenza = aslResidenza;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayloadControlloAllegati payloadControlloAllegati = (PayloadControlloAllegati) o;
    return Objects.equals(cittadinanza, payloadControlloAllegati.cittadinanza) &&
        Objects.equals(motivazioneSoggiorno, payloadControlloAllegati.motivazioneSoggiorno) &&
        Objects.equals(aslIscrizione, payloadControlloAllegati.aslIscrizione) &&
        Objects.equals(aslDomicilio, payloadControlloAllegati.aslDomicilio) &&
        Objects.equals(aslResidenza, payloadControlloAllegati.aslResidenza);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cittadinanza, motivazioneSoggiorno, aslIscrizione, aslDomicilio, aslResidenza);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadControlloAllegati {\n");
    
    sb.append("    cittadinanza: ").append(toIndentedString(cittadinanza)).append("\n");
    sb.append("    motivazioneSoggiorno: ").append(toIndentedString(motivazioneSoggiorno)).append("\n");
    sb.append("    aslIscrizione: ").append(toIndentedString(aslIscrizione)).append("\n");
    sb.append("    aslDomicilio: ").append(toIndentedString(aslDomicilio)).append("\n");
    sb.append("    aslResidenza: ").append(toIndentedString(aslResidenza)).append("\n");
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

