/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanassistenza.dto.apisanassistenza;

import java.util.Objects;

import org.codehaus.jackson.annotate.JsonProperty;

public class ModelDocumentoScrittura {
	// verra' utilizzata la seguente strategia serializzazione degli attributi:
	// [explicit-as-modeled]

	public ModelDocumentoScrittura(String nomeFile, String base64) {
		super();
		this.nomeFile = nomeFile;
		this.base64 = base64;
	}
	public ModelDocumentoScrittura() {
		super();
		// TODO Auto-generated constructor stub
	}


	private String nomeFile = null;
	private String base64 = null;

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
	 * Il file codificato in base64
	 **/

	@JsonProperty("base64")

	public String getBase64() {
		return base64;
	}

	public void setBase64(String base64) {
		this.base64 = base64;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ModelDocumentoScrittura modelDocumentoScrittura = (ModelDocumentoScrittura) o;
		return Objects.equals(nomeFile, modelDocumentoScrittura.nomeFile)
				&& Objects.equals(base64, modelDocumentoScrittura.base64);
	}

	@Override
	public int hashCode() {
		return Objects.hash(nomeFile, base64);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ModelDocumentoScrittura {\n");

		sb.append("    nomeFile: ").append(toIndentedString(nomeFile)).append("\n");
		sb.append("    base64: ").append(toIndentedString(base64)).append("\n");
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
