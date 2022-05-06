/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanassistenza.dto.apisanassistenza;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.codehaus.jackson.annotate.JsonProperty;

public class PayloadRichiestaNuova {
	
	public PayloadRichiestaNuova() {
		super();
	}

	public PayloadRichiestaNuova(String email, String telefono, ModelRichiestaCittadino cittadino,
			RichiesteMessaggio messaggio, String tipologia, String assetId) {
		super();
		this.email = email;
		this.telefono = telefono;
		this.cittadino = cittadino;
		this.messaggio = messaggio;
		this.tipologia = tipologia;
		this.assetId = assetId;
	}

	// verra' utilizzata la seguente strategia serializzazione degli attributi:
	// [explicit-as-modeled]

	private String email = null;
	private String telefono = null;
	private ModelRichiestaCittadino cittadino = null;
	private RichiesteMessaggio messaggio = null;
	private String tipologia = null;
	private String assetId = null;

	/**
	 * La mail su cui contattare il cittadino per questa richiesta
	 **/

	@JsonProperty("email")

	@NotNull
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Il telefono su cui contattare il cittadino per questa richiesta
	 **/

	@JsonProperty("telefono")

	@NotNull
	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 **/

	@JsonProperty("cittadino")

	@NotNull
	public ModelRichiestaCittadino getCittadino() {
		return cittadino;
	}

	public void setCittadino(ModelRichiestaCittadino cittadino) {
		this.cittadino = cittadino;
	}

	/**
	 **/

	@JsonProperty("messaggio")

	public RichiesteMessaggio getMessaggio() {
		return messaggio;
	}

	public void setMessaggio(RichiesteMessaggio messaggio) {
		this.messaggio = messaggio;
	}

	@JsonProperty("tipologia")
	public String getTipologia() {
		return tipologia;
	}

	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}	
	
	

	@JsonProperty("asset_id")
	public String getAssetId() {
		return assetId;
	}

	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}
	

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PayloadRichiestaNuova payloadRichiestaNuova = (PayloadRichiestaNuova) o;
		return Objects.equals(email, payloadRichiestaNuova.email)
				&& Objects.equals(telefono, payloadRichiestaNuova.telefono)
				&& Objects.equals(assetId, payloadRichiestaNuova.assetId)
				&& Objects.equals(cittadino, payloadRichiestaNuova.cittadino)
				&& Objects.equals(messaggio, payloadRichiestaNuova.messaggio);
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, telefono, assetId, cittadino, messaggio);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PayloadRichiestaNuova {\n");

		sb.append("    email: ").append(toIndentedString(email)).append("\n");
		sb.append("    telefono: ").append(toIndentedString(telefono)).append("\n");
		sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
		sb.append("    cittadino: ").append(toIndentedString(cittadino)).append("\n");
		sb.append("    messaggio: ").append(toIndentedString(messaggio)).append("\n");
		sb.append("    asset id: ").append(toIndentedString(assetId)).append("\n");
		sb.append("    tipologia: ").append(toIndentedString(tipologia)).append("\n");
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
