/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanffe.business.apisanffe.mapper;

import java.math.BigDecimal;

import it.csi.apisan.apisanffe.dto.apisanffe.ModelPrenotazione;
import it.csi.gpr.Prenotazione;

public class ModelPrenotazionePrenotazioneMapper extends BaseMapper<ModelPrenotazione, Prenotazione> {

	@Override
	public Prenotazione to(ModelPrenotazione source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelPrenotazione from(Prenotazione dest) {
		if(dest == null) {
			return null;
		}
		ModelPrenotazione source = new ModelPrenotazione();
		source.setAsrBeneficiaria(dest.getASRBENEFICIARIA());
		source.setAvvisoPagamento(new ModelAvvisoPagamentoAVVISOPAGAMENTOtypeMapper().from(dest.getAVVISOPAGAMENTO()) );
		source.setCodiceServizio(dest.getCODICESERVIZIO());
		source.setDataCreazionePrenotazione(dest.getDATACREAZIONEPRENOTAZIONE());
		source.setIbanRimborso(getJaxbElement(dest.getIBANRIMBORSO()));
		try {
			source.setImportoDaPagare(new BigDecimal( dest.getIMPORTODAPAGARE()));
		} catch (Exception e) {
			
		}
		try {
			source.setImportoDaRimborsare(new BigDecimal( getJaxbElement(dest.getIMPORTODARIMBORSARE())));
		} catch (Exception e) {

		}
		try {
			source.setImportoPagato(new BigDecimal(dest.getIMPORTOPAGATO()));
		} catch (Exception e) {
			
		}
		try {
			source.setImportoRimborsato(new BigDecimal( getJaxbElement(dest.getIMPORTORIMBORSATO())));
		} catch (Exception e) {
		
		}
		source.setIuvMod1(dest.getIUVMOD1());
		//TODO da verificare: ElencoPagamentyType non è una lisat
/*		if(dest.getLISTAFATTURA().getELENCOPAGAMENTI() != null) {
			source.setListaFattura( new ModelElencoPagamentiElencoPagamentiTypeMapper().fromList(dest.getLISTAFATTURA().getELENCOPAGAMENTI()) );
		}*/
		if(dest.getLISTANRE() != null) {
			source.setListaNre(dest.getLISTANRE().getNRE());
		}
		if(dest.getLISTARIMBORSI()!= null ) {
			source.setListaRimborsi(new ModelRimborsoRimborsoTypeMapper().fromList(dest.getLISTARIMBORSI().getRIMBORSO()) );
		}
		
		source.setModalitaRimborso( getJaxbElement(dest.getMODALITARIMBORSO()));
		source.setMotivoPagamento(dest.getMOTIVOPAGAMENTO());
		source.setNumeroPratica(dest.getNUMEROPRATICA());
		source.setNumeroQuietanza(dest.getNUMEROQUIETANZA());
		try {
			source.setOpposizione730(new Integer( dest.getOPPOSIZIONE730()));
		} catch (NumberFormatException e) {
	
		}
		source.setRimborsoInErogazione(getJaxbElement(dest.getRIMBORSOINEROGAZIONE()));
		
		
		return source;
		
	}

}
