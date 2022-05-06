/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanassistenza.dto.apisanassistenza;

import java.util.Objects;

import org.codehaus.jackson.annotate.JsonProperty;

public class ModelMessaggio {
	// verra' utilizzata la seguente strategia serializzazione degli attributi:
	// [explicit-as-modeled]

	private String id = null;
	private String dataCreazione = null;
	private String testo = null;
	private String autore = null;
	private String tipologiaAutore = null;
	private ModelDocumentoLettura allegato = null;

	/**
	 * Un identificativo univoco
	 **/

	@JsonProperty("id")

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * la data di creazione del messaggio
	 **/

	@JsonProperty("data_creazione")

	public String getDataCreazione() {
		return dataCreazione;
	}

	public void setDataCreazione(String dataCreazione) {
		this.dataCreazione = dataCreazione;
	}

	/**
	 * Il testo del messaggio
	 **/

	@JsonProperty("testo")

	public String getTesto() {
		return testo;
	}

	public void setTesto(String testo) {
		this.testo = testo;
	}

	/**
	 * Il nome dell&#39;autore del messaggio. Se il messaggio è stato inviato dal
	 * cittadino allora sarà il cognome e nome del cittadino.
	 **/

	@JsonProperty("autore")

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	/**
	 **/
	@JsonProperty("tipologia_autore")
	public String getTipologiaAutore() {
		return tipologiaAutore;
	}

	public void setTipologiaAutore(String tipologiaAutore) {
		this.tipologiaAutore = tipologiaAutore;
	}

	@JsonProperty("allegato")

	public ModelDocumentoLettura getAllegato() {
		return allegato;
	}
	
	public void setAllegato(ModelDocumentoLettura allegato) {
		this.allegato = allegato;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ModelMessaggio modelMessaggio = (ModelMessaggio) o;
		return Objects.equals(id, modelMessaggio.id) && Objects.equals(dataCreazione, modelMessaggio.dataCreazione)
				&& Objects.equals(testo, modelMessaggio.testo) && Objects.equals(autore, modelMessaggio.autore)
				&& Objects.equals(tipologiaAutore, modelMessaggio.tipologiaAutore)
				&& Objects.equals(allegato, modelMessaggio.allegato);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, dataCreazione, testo, autore, tipologiaAutore, allegato);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ModelMessaggio {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    dataCreazione: ").append(toIndentedString(dataCreazione)).append("\n");
		sb.append("    testo: ").append(toIndentedString(testo)).append("\n");
		sb.append("    autore: ").append(toIndentedString(autore)).append("\n");
		sb.append("    tipologiaAutore: ").append(toIndentedString(tipologiaAutore)).append("\n");
		sb.append("    allegato: ").append(toIndentedString(allegato)).append("\n");
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
