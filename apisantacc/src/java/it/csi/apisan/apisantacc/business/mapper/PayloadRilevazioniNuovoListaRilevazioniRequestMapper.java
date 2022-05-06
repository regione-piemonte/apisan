/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.mapper;

import it.csi.apisan.apisantacc.dto.apisantacc.CittadinicitIdtaccuinotaccuinoIdrilevazioniLista;
import it.csi.dma.dmaclbluc.RilevazioneRequest;

public class PayloadRilevazioniNuovoListaRilevazioniRequestMapper extends BaseMapper<CittadinicitIdtaccuinotaccuinoIdrilevazioniLista, RilevazioneRequest>{

	@Override
	public RilevazioneRequest to(CittadinicitIdtaccuinotaccuinoIdrilevazioniLista source) {
		if(source == null) {
			return null;
		}	
		
		RilevazioneRequest rilevazioneRequest = new RilevazioneRequest();
		rilevazioneRequest.setData(new DateXMLGregorianCalendarMapper().to(source.getData()));
		rilevazioneRequest.setCodiceDescrittore(source.getDescrittoreCodice());
		rilevazioneRequest.setCodiceGruppo(source.getGruppoCodice());
		rilevazioneRequest.setCodiceModalita(source.getModalitaCodice());
		rilevazioneRequest.setCodiceUnitaMisura(source.getUnitaMisuraCodice());
		rilevazioneRequest.setValoreNumerico(new BigDecimalFloatMapper().to(source.getValoreNumerico()));
		rilevazioneRequest.setValoreTestuale(source.getValoreTestuale());		
		
		return rilevazioneRequest;
	}

	@Override
	public CittadinicitIdtaccuinotaccuinoIdrilevazioniLista from(RilevazioneRequest dest) {
		if(dest == null) {
			return null;
		}		
		
		CittadinicitIdtaccuinotaccuinoIdrilevazioniLista cittadinicitIdtaccuinotaccuinoIdrilevazioniLista = new CittadinicitIdtaccuinotaccuinoIdrilevazioniLista();
		cittadinicitIdtaccuinotaccuinoIdrilevazioniLista.setData(new DateXMLGregorianCalendarMapper().from(dest.getData()));
		cittadinicitIdtaccuinotaccuinoIdrilevazioniLista.setDescrittoreCodice(dest.getCodiceDescrittore());
		cittadinicitIdtaccuinotaccuinoIdrilevazioniLista.setGruppoCodice(dest.getCodiceGruppo());
		cittadinicitIdtaccuinotaccuinoIdrilevazioniLista.setModalitaCodice(dest.getCodiceModalita());
		cittadinicitIdtaccuinotaccuinoIdrilevazioniLista.setUnitaMisuraCodice(dest.getCodiceUnitaMisura());
		cittadinicitIdtaccuinotaccuinoIdrilevazioniLista.setValoreNumerico(new BigDecimalFloatMapper().from(dest.getValoreNumerico()));
		cittadinicitIdtaccuinotaccuinoIdrilevazioniLista.setValoreTestuale(dest.getValoreTestuale());
		
		return cittadinicitIdtaccuinotaccuinoIdrilevazioniLista;
	}
	
}
