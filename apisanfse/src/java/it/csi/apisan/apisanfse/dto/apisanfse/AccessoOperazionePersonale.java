/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import it.csi.apisan.apisanfse.integration.paziente.dma.AccessoOperazione;
import it.csi.apisan.apisanfse.integration.paziente.dma.TipoAccessoOperazione;

public class AccessoOperazionePersonale extends AccessoOperazione implements Accessible<TipoAccessoOperazione> {

	public AccessoOperazionePersonale(AccessoOperazione operazione) {
		super.setCodiceFiscaleOperatore(operazione.getCodiceFiscaleOperatore());
		super.setCognomeOperatore(operazione.getCognomeOperatore());
		super.setCollocazione(operazione.getCollocazione());
		super.setDataAccesso(operazione.getDataAccesso());
		super.setDescrizione(operazione.getDescrizione());
		super.setIdAccesso(operazione.getIdAccesso());
		super.setNomeOperatore(operazione.getNomeOperatore());
		super.setRegime(operazione.getRegime());
		super.setRuolo(operazione.getRuolo());
		super.setTipoOperazione(operazione.getTipoOperazione());
		super.setApplicazioneVerticale(operazione.getApplicazioneVerticale());
	}

}
