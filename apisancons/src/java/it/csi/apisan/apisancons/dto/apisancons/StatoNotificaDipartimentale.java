/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancons.dto.apisancons;

import java.util.UUID;

import org.codehaus.jackson.annotate.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public class StatoNotificaDipartimentale {

	// verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
	  
	  private String cfCittadino = null;
	  private String uuid = null;
	  private TipoAsr asr = null;
	  private String dipartimentale = null;
	  private String statoDipartimentale = null;
	  private String statoDecodificato = null;
	  private String statoNotifica = null;
	  
	  /**
	   **/
	  
	  @ApiModelProperty(value = "")
	  @JsonProperty("cf_cittadino") 
	 
	  public String getCfCittadino() {
	    return cfCittadino;
	  }
	  public void setCfCittadino(String cfCittadino) {
	    this.cfCittadino = cfCittadino;
	  }
	  
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
	  @JsonProperty("asr") 
	 
	  public TipoAsr getAsr() {
	    return asr;
	  }
	  public void setAsr(TipoAsr asr) {
	    this.asr = asr;
	  }
	  
	  /**
	   **/	  
	  @ApiModelProperty(value = "")
	  @JsonProperty("dipartimentale") 
	  public String getDipartimentale() {
		return dipartimentale;
	  }
	  public void setDipartimentale(String dipartimentale) {
		this.dipartimentale = dipartimentale;
	  }
	  
	  /**
	   **/	  
	  @ApiModelProperty(value = "")
	  @JsonProperty("stato_dipartimentale") 
	  public String getStatoDipartimentale() {
		return statoDipartimentale;
	  }
	  public void setStatoDipartimentale(String statoDipartimentale) {
		this.statoDipartimentale = statoDipartimentale;
	  }
	  
	  /**
	   **/	  
	  @ApiModelProperty(value = "stato_decodificato")
	  public String getStatoDecodificato() {
		return statoDecodificato;
	  }
	  public void setStatoDecodificato(String statoDecodificato) {
		this.statoDecodificato = statoDecodificato;
	  }
	  
	  
	  /**
	   **/	  
	  @ApiModelProperty(value = "stato_notifica")
	  public String getStatoNotifica() {
		return statoNotifica;
	  }
	  public void setStatoNotifica(String statoNotifica) {
		this.statoNotifica = statoNotifica;
	  }  
}
