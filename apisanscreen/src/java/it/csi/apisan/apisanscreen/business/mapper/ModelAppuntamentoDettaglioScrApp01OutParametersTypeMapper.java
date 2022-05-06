/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.business.mapper;

import java.math.BigDecimal;

import it.csi.apisan.apisanscreen.dto.apisanscreen.GeoJsonPoint;
import it.csi.apisan.apisanscreen.dto.apisanscreen.GeoJsonPoint3D;
import it.csi.apisan.apisanscreen.dto.apisanscreen.ModelAppuntamentoDettaglio;
import it.csi.apisan.apisanscreen.dto.apisanscreen.ModelIndirizzoGeo;
import it.csi.screenserviziwebsol.ScrApp01OutParametersType;
import it.csi.screenserviziwebsol.TipoScreenType;

public class ModelAppuntamentoDettaglioScrApp01OutParametersTypeMapper extends BaseMapper<ModelAppuntamentoDettaglio, ScrApp01OutParametersType> {
	
	TipoScreenType tipoScreen;
	
	public ModelAppuntamentoDettaglioScrApp01OutParametersTypeMapper( TipoScreenType tipoScreen){
		this.tipoScreen = tipoScreen;
	}
	
	@Override
	public ScrApp01OutParametersType to(ModelAppuntamentoDettaglio source) {
		// TODO Auto-generated method stubT
		return null;
	}

	@Override
	public ModelAppuntamentoDettaglio from(ScrApp01OutParametersType dest) {
		if(dest == null) {
			return null;
		}
		ModelAppuntamentoDettaglio source = new ModelAppuntamentoDettaglio();
		source.setAgendaCodice(dest.getPCodAgenda());
		source.setDataInvitabile(new DateXMLGregorianCalendarMapper().from(dest.getPDataReinv()));
		source.setAslCodice(dest.getPCodAzienda());
		source.setAslDescrizione(dest.getPAzienda());
		source.setDipartimentoCodice(dest.getPCodDipartimento());
		source.setDipartimentoDescrizione(dest.getPDipartimento());
		
		if((this.tipoScreen == TipoScreenType.CV && dest.getPTipoUnpr() == 1) || (this.tipoScreen == TipoScreenType.MX && dest.getPTipoUnpr() == 3)) {
			source.setLivelloAppuntamento("1");
		}else {
			source.setLivelloAppuntamento("2");
		}
			
		source.setStatoCodice(dest.getPStatoAssistita());
		source.setUnitaOperativaCivico(dest.getPNumeroCivico());
		source.setUnitaOperativaCodice(dest.getPCodUnpr());
		source.setUnitaOperativaComune(dest.getPComune());
		source.setUnitaOperativaDescrizione(dest.getPUnitaOperativa());
		source.setUnitaOperativaIndirizzo(dest.getPIndirizzo());
		if(dest.getPViaStradario() != null || dest.getPTipovStradario() != null || dest.getPPrepStradario() != null 
				|| dest.getPLatitudine() != null || dest.getPLatitudine() != null || dest.getPCivicoStradario() != null) {
			ModelIndirizzoGeo indirizzoGeo = new ModelIndirizzoGeo();	
			indirizzoGeo.setCivico(dest.getPCivicoStradario());
			indirizzoGeo.setComune(dest.getPComuneStradario());
			indirizzoGeo.setPrepStradario(dest.getPPrepStradario());
			indirizzoGeo.setTipoViaStradario(dest.getPTipovStradario());
			indirizzoGeo.setVia(dest.getPViaStradario());
			if(dest.getPLongitudine() != null && dest.getPLatitudine() != null) {
				GeoJsonPoint punto = new GeoJsonPoint(); 
				punto.setType(GeoJsonPoint.TypeEnum.POINT);
				GeoJsonPoint3D coordinate = new GeoJsonPoint3D();
				coordinate.add(new BigDecimal(dest.getPLongitudine()) );
				coordinate.add(new BigDecimal(dest.getPLatitudine()));
				punto.setCoordinates(coordinate);
				indirizzoGeo.setCoordinate(punto);
			}
			source.setIndirizzoGeo(indirizzoGeo);
		}
		 
		return source;
	}

}
