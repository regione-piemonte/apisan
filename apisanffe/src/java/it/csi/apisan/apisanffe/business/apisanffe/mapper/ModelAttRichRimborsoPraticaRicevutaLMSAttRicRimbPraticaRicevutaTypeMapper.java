/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanffe.business.apisanffe.mapper;

import java.math.BigDecimal;

import it.csi.apisan.apisanffe.dto.apisanffe.ModelAttRichRimborsoPraticaRicevuta;
import it.csi.gpr.LMSAttRicRimbPraticaRicevutaType;

public class ModelAttRichRimborsoPraticaRicevutaLMSAttRicRimbPraticaRicevutaTypeMapper extends BaseMapper<ModelAttRichRimborsoPraticaRicevuta, LMSAttRicRimbPraticaRicevutaType> {

	@Override
	public LMSAttRicRimbPraticaRicevutaType to(ModelAttRichRimborsoPraticaRicevuta source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAttRichRimborsoPraticaRicevuta from(LMSAttRicRimbPraticaRicevutaType dest) {
		if(dest == null) {
			return null;
		}
		ModelAttRichRimborsoPraticaRicevuta source = new ModelAttRichRimborsoPraticaRicevuta();
		if(dest.getINVIATODAASR() != null) {
			source.setInviatoDaAsr(new BigDecimal( dest.getINVIATODAASR().longValue()));
		}
		if(dest.getMODALITARIMBORSO() != null) {
			source.setModalitaRimborso(new BigDecimal(dest.getMODALITARIMBORSO().longValue()));
		}
		source.setStampa(dest.getSTAMPA());
		return source;
	}

}
