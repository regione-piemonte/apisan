/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanassistenza.dto.apisanassistenza;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.codehaus.jackson.annotate.JsonProperty;

public class ModelRichiestaDettaglio {
	// verra' utilizzata la seguente strategia serializzazione degli attributi:
	// [explicit-as-modeled]

	private String id = null;
	private String dataCreazione = null;
	private String dataAggiornamento = null;
	private Boolean modificabile = null;
	private Boolean archiviata = null;
	private String email = null;
	private String telefono = null;
	private String assegnatario = null;
	private ModelRichiestaStato stato = null;
	private ModelRichiestaCittadino cittadino = null;
	private String tipologia = null;
	private String assetId = null;
	private String richiestaNumero = null;
	private List<ModelMessaggio> messaggi = new ArrayList<ModelMessaggio>();

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
	 * La data di creazione della richiesta
	 **/

	@JsonProperty("data_creazione")

	public String getDataCreazione() {
		return dataCreazione;
	}

	public void setDataCreazione(String dataCreazione) {
		this.dataCreazione = dataCreazione;
	}

	/**
	 * La data dell&#39;ultimo aggiornamento della richiesta
	 **/

	@JsonProperty("data_aggiornamento")

	public String getDataAggiornamento() {
		return dataAggiornamento;
	}

	public void setDataAggiornamento(String dataAggiornamento) {
		this.dataAggiornamento = dataAggiornamento;
	}

	/**
	 * Indica se il cittadino può modificare la richiesta o meno
	 **/

	@JsonProperty("modificabile")

	public Boolean isModificabile() {
		return modificabile;
	}

	public void setModificabile(Boolean modificabile) {
		this.modificabile = modificabile;
	}

	/**
	 * Indica se la richiesta è archiviata o meno
	 **/

	@JsonProperty("archiviata")

	public Boolean isArchiviata() {
		return archiviata;
	}

	public void setArchiviata(Boolean archiviata) {
		this.archiviata = archiviata;
	}

	/**
	 * La mail inserita dal cittadino al momento della creazione della richiesta
	 **/

	@JsonProperty("email")

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Il telefono inserito dal cittadino al momento della creazione della richiesta
	 **/

	@JsonProperty("telefono")

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * Indica a chi è stato assegnata la richiesta
	 **/

	@JsonProperty("assegnatario")

	public String getAssegnatario() {
		return assegnatario;
	}

	public void setAssegnatario(String assegnatario) {
		this.assegnatario = assegnatario;
	}

	/**
	 **/

	@JsonProperty("stato")

	public ModelRichiestaStato getStato() {
		return stato;
	}

	public void setStato(ModelRichiestaStato stato) {
		this.stato = stato;
	}

	
	@JsonProperty("asset_id")
	public String getAssetId() {
		return assetId;
	}

	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}

	/**
	 **/

	@JsonProperty("cittadino")

	public ModelRichiestaCittadino getCittadino() {
		return cittadino;
	}

	public void setCittadino(ModelRichiestaCittadino cittadino) {
		this.cittadino = cittadino;
	}

	/**
	 **/

	@JsonProperty("messaggi")

	public List<ModelMessaggio> getMessaggi() {
		return messaggi;
	}

	public void setMessaggi(List<ModelMessaggio> messaggi) {
		this.messaggi = messaggi;
	}

	@JsonProperty("tipologia")
	public String getTipologia() {
		return tipologia;
	}

	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}
	
	@JsonProperty("richiesta_numero")
	public String getRichiestaNumero() {
		return richiestaNumero;
	}

	public void setRichiestaNumero(String richiestaNumero) {
		this.richiestaNumero = richiestaNumero;
	}	


	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ModelRichiestaDettaglio modelRichiestaDettaglio = (ModelRichiestaDettaglio) o;
		return Objects.equals(id, modelRichiestaDettaglio.id)
				&& Objects.equals(dataCreazione, modelRichiestaDettaglio.dataCreazione)
				&& Objects.equals(dataAggiornamento, modelRichiestaDettaglio.dataAggiornamento)
				&& Objects.equals(modificabile, modelRichiestaDettaglio.modificabile)
				&& Objects.equals(archiviata, modelRichiestaDettaglio.archiviata)
				&& Objects.equals(email, modelRichiestaDettaglio.email)
				&& Objects.equals(telefono, modelRichiestaDettaglio.telefono)
				&& Objects.equals(assetId, modelRichiestaDettaglio.assetId)
				&& Objects.equals(assegnatario, modelRichiestaDettaglio.assegnatario)
				&& Objects.equals(stato, modelRichiestaDettaglio.stato)
				&& Objects.equals(richiestaNumero, modelRichiestaDettaglio.richiestaNumero)
				&& Objects.equals(cittadino, modelRichiestaDettaglio.cittadino)
				&& Objects.equals(messaggi, modelRichiestaDettaglio.messaggi);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, dataCreazione, dataAggiornamento, modificabile, archiviata, email, telefono,
				assetId, assegnatario, stato, richiestaNumero, cittadino, messaggi);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ModelRichiestaDettaglio {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    dataCreazione: ").append(toIndentedString(dataCreazione)).append("\n");
		sb.append("    dataAggiornamento: ").append(toIndentedString(dataAggiornamento)).append("\n");
		sb.append("    modificabile: ").append(toIndentedString(modificabile)).append("\n");
		sb.append("    archiviata: ").append(toIndentedString(archiviata)).append("\n");
		sb.append("    email: ").append(toIndentedString(email)).append("\n");
		sb.append("    telefono: ").append(toIndentedString(telefono)).append("\n");
		sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
		sb.append("    assegnatario: ").append(toIndentedString(assegnatario)).append("\n");
		sb.append("    stato: ").append(toIndentedString(stato)).append("\n");
		sb.append("    richiestaNumero: ").append(toIndentedString(richiestaNumero)).append("\n");
		sb.append("    cittadino: ").append(toIndentedString(cittadino)).append("\n");
		sb.append("    messaggi: ").append(toIndentedString(messaggi)).append("\n");
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
