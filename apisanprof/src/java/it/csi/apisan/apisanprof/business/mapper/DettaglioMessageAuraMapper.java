/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanprof.business.mapper;



import it.csi.apisan.apisanprof.dto.apisanprof.Dettaglio;
import it.csi.aura.auraws.services.central.anagrafefind.Message;

public class DettaglioMessageAuraMapper extends BaseMapper<Dettaglio, Message> {

	@Override
	public Message to(Dettaglio source) {
		Message mess = new Message();
		
		mess.setCodice(source.getChiave());
		mess.setDescrizione(source.getValore());
		
		return mess;
	}

	@Override
	public Dettaglio from(Message dest) {
		Dettaglio dettaglio = new Dettaglio();
		
		dettaglio.setChiave(dest.getCodice());
		dettaglio.setValore(dest.getDescrizione());
		
		return dettaglio;
	}

	
}
