/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanassistenza.dto.apisanassistenza;

import java.util.Objects;

import org.codehaus.jackson.annotate.JsonProperty;

public class ModelDocumentoLettura {

	// verra' utilizzata la seguente strategia serializzazione degli attributi:
	// [explicit-as-modeled]

	private String id = null;
	private String nomeFile = null;
	private Integer dimensione = null;

	/**
	 * identificativo univoco
	 **/

	@JsonProperty("id")

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * il nome del file
	 **/

	@JsonProperty("nome_file")

	public String getNomeFile() {
		return nomeFile;
	}

	public void setNomeFile(String nomeFile) {
		this.nomeFile = nomeFile;
	}

	/**
	 * La dimensione del file in byte
	 **/

	@JsonProperty("dimensione")

	public Integer getDimensione() {
		return dimensione;
	}

	public void setDimensione(Integer dimensione) {
		this.dimensione = dimensione;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ModelDocumentoLettura modelDocumentoLettura = (ModelDocumentoLettura) o;
		return Objects.equals(id, modelDocumentoLettura.id) && Objects.equals(nomeFile, modelDocumentoLettura.nomeFile)
				&& Objects.equals(dimensione, modelDocumentoLettura.dimensione);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nomeFile, dimensione);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ModelDocumentoLettura {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    nomeFile: ").append(toIndentedString(nomeFile)).append("\n");
		sb.append("    dimensione: ").append(toIndentedString(dimensione)).append("\n");
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
