/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.util;

import org.codehaus.jackson.annotate.JsonProperty;

import io.swagger.annotations.ApiModelProperty;
import it.csi.apisan.apisanvac.model.FiltriStringhe;

public class FilterPeriodiLiberi {

	private FiltriStringhe dataInizio;
	private FiltriStringhe dataFine;
	private FiltriStringhe codicePaziente;
	private FiltriStringhe codiceAmbulatorio;
	
	
	 @ApiModelProperty(value = "")
	 @JsonProperty("data_inizio") 
	public FiltriStringhe getDataInizio() {
		return dataInizio;
	}
	public void setDataInizio(FiltriStringhe dataInizio) {
		this.dataInizio = dataInizio;
	}
	
	 @ApiModelProperty(value = "")
	 @JsonProperty("data_fine") 
	public FiltriStringhe getDataFine() {
		return dataFine;
	}
	public void setDataFine(FiltriStringhe dataFine) {
		this.dataFine = dataFine;
	}
	
	
	 @ApiModelProperty(value = "")
	 @JsonProperty("codice_paziente") 
	public FiltriStringhe getCodicePaziente() {
		return codicePaziente;
	}
	public void setCodicePaziente(FiltriStringhe codicePaziente) {
		this.codicePaziente = codicePaziente;
	}
	
	
	 @ApiModelProperty(value = "")
	 @JsonProperty("codice_ambulatorio") 	
	public FiltriStringhe getCodiceAmbulatorio() {
		return codiceAmbulatorio;
	}
	public void setCodiceAmbulatorio(FiltriStringhe codiceAmbulatorio) {
		this.codiceAmbulatorio = codiceAmbulatorio;
	}
	
	
}
