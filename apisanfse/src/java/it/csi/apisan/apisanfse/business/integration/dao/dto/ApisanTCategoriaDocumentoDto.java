/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.integration.dao.dto;



public class ApisanTCategoriaDocumentoDto implements Comparable<ApisanTCategoriaDocumentoDto>{
	private Integer idCategoria;
	private String codiceCategoria;
	private String descrizioneCategoria;
	private Integer idDocumento;
	private String codiceDocumento;
	private String descrizioneDocumento;
	public Integer getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}
	public String getCodiceCategoria() {
		return codiceCategoria;
	}
	public void setCodiceCategoria(String codiceCategoria) {
		this.codiceCategoria = codiceCategoria;
	}
	public String getDescrizioneCategoria() {
		return descrizioneCategoria;
	}
	public void setDescrizioneCategoria(String descrizioneCategoria) {
		this.descrizioneCategoria = descrizioneCategoria;
	}
	public Integer getIdDocumento() {
		return idDocumento;
	}
	public void setIdDocumento(Integer idDocumento) {
		this.idDocumento = idDocumento;
	}
	public String getCodiceDocumento() {
		return codiceDocumento;
	}
	public void setCodiceDocumento(String codiceDocumento) {
		this.codiceDocumento = codiceDocumento;
	}
	public String getDescrizioneDocumento() {
		return descrizioneDocumento;
	}
	public void setDescrizioneDocumento(String descrizioneDocumento) {
		this.descrizioneDocumento = descrizioneDocumento;
	}
	
	
	@Override
	public int hashCode() {
		return getIdCategoria().hashCode();
	}

	
	@Override
	public boolean equals(Object other) {
		if (other instanceof ApisanTCategoriaDocumentoDto) {
			return ((ApisanTCategoriaDocumentoDto) other).getIdCategoria()
					.equals(this.getIdCategoria());
		}
		return false;
	}
	@Override
	public int compareTo(ApisanTCategoriaDocumentoDto o) {
		return this.getIdCategoria().compareTo(o.getIdCategoria());
	}
	
	

}
