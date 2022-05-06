/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import java.util.HashMap;

import it.csi.apisan.apisanfse.dto.apisanfse.PayloadAssociaEtichette.TipoOperazioneEnum;
import it.csi.apisan.apisanfse.integration.etichette.dma.TipoOperazione;

public class TipoOperazioneTipoOperazioneMapper  extends BaseMapper<TipoOperazioneEnum, TipoOperazione> {
	
	HashMap<TipoOperazioneEnum, TipoOperazione> tipoOperazioneToMap;	
	HashMap<TipoOperazione,TipoOperazioneEnum> tipoOperazioneFromMap;
	
	public TipoOperazioneTipoOperazioneMapper(){
		this.tipoOperazioneFromMap = new HashMap<TipoOperazione, TipoOperazioneEnum>();		
		this.tipoOperazioneToMap =	new HashMap<TipoOperazioneEnum, TipoOperazione>();
		
		tipoOperazioneFromMap.put(TipoOperazione.ASSOCIAZIONE, TipoOperazioneEnum.ASSOCIAZIONE);
		tipoOperazioneFromMap.put(TipoOperazione.DISASSOCIAZIONE, TipoOperazioneEnum.DISASSOCIAZIONE);
		
		tipoOperazioneToMap.put(TipoOperazioneEnum.ASSOCIAZIONE,TipoOperazione.ASSOCIAZIONE);
		tipoOperazioneToMap.put(TipoOperazioneEnum.DISASSOCIAZIONE,TipoOperazione.DISASSOCIAZIONE);
	}
	
	@Override
	public TipoOperazione to(TipoOperazioneEnum source) {
		if(source == null) {
			return null;
		}
		return tipoOperazioneToMap.get(source);
	}

	@Override
	public TipoOperazioneEnum from(TipoOperazione dest) {
		if(dest == null) {
			return null;
		}
		return tipoOperazioneFromMap.get(dest);
	}
	
	
}
