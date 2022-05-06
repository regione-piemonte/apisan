/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import it.csi.apisan.apisanfse.integration.paziente.dma.AccessoConsultazione;
import it.csi.apisan.apisanfse.integration.paziente.dma.Codifica;
import it.csi.apisan.apisanfse.integration.paziente.dma.RegimeDMA;
import it.csi.apisan.apisanfse.integration.paziente.dma.TipoAccessoConsultazione;

public class AccessoConsultazionePersonale extends AccessoConsultazione implements Accessible<TipoAccessoConsultazione> {

	public AccessoConsultazionePersonale(AccessoConsultazione accesso) {
		super.setCodiceFiscaleOperatore(accesso.getCodiceFiscaleOperatore());
		super.setCognomeOperatore(accesso.getCognomeOperatore());
		super.setCollocazione(accesso.getCollocazione());
		super.setDataAccesso(accesso.getDataAccesso());
		super.setDescrizione(accesso.getDescrizione());
		super.setIdAccesso(accesso.getIdAccesso());
		super.setNomeOperatore(accesso.getNomeOperatore());
		super.setRegime(accesso.getRegime());
		super.setRuolo(accesso.getRuolo());
		super.setTipoConsultazione(accesso.getTipoConsultazione());
	}

	@Override
	public Codifica getTipoOperazione() {
		
		return super.getTipoConsultazione() ;
	}

	@Override
	public void setTipoOperazione(TipoAccessoConsultazione tipoOpeazione) {
		super.setTipoConsultazione(tipoConsultazione);
		
	}

	@Override
	public void setApplicazioneVerticale(String applicazioneVerticale) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getApplicazioneVerticale() {
		// TODO Auto-generated method stub
		return null;
	}

	
	

	

	

	

}
