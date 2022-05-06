/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.dto.ptw;

import org.codehaus.jackson.annotate.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public class PraticaDaRimborsare {
	
	 private String codiceFiscale = null;
	 private String numeroPraticaRegionale = null;
	  
	
	 @ApiModelProperty(value = "")
	  @JsonProperty("codice_fiscale") 
	 
	  public String getCodiceFiscale() {
	    return codiceFiscale;
	  }
	  public void setCodiceFiscale(String codiceFiscale) {
	    this.codiceFiscale = codiceFiscale;
	  }

	  /**
	   * indentificativo regionale della pratica da pagare
	   **/
	  
	  @ApiModelProperty(value = "")
	  @JsonProperty("numero_pratica_regionale") 
	 
	  public String getNumeroPraticaRegionale() {
	    return numeroPraticaRegionale;
	  }
	  public void setNumeroPraticaRegionale(String numeroPraticaRegionale) {
	    this.numeroPraticaRegionale = numeroPraticaRegionale;
	  }
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codiceFiscale == null) ? 0 : codiceFiscale.hashCode());
		result = prime * result + ((numeroPraticaRegionale == null) ? 0 : numeroPraticaRegionale.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PraticaDaRimborsare other = (PraticaDaRimborsare) obj;
		if (codiceFiscale == null) {
			if (other.codiceFiscale != null)
				return false;
		} else if (!codiceFiscale.equals(other.codiceFiscale))
			return false;
		if (numeroPraticaRegionale == null) {
			if (other.numeroPraticaRegionale != null)
				return false;
		} else if (!numeroPraticaRegionale.equals(other.numeroPraticaRegionale))
			return false;
		return true;
	}

	  
}
