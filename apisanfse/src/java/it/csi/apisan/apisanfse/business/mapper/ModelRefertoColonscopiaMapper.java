/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import it.csi.apisan.apisanfse.dto.apisanfse.ModelRefertoColonscopia;
import it.csi.apisan.apisanfse.integration.screening.dma.ScreeningRefertoColonscopia;

public class ModelRefertoColonscopiaMapper extends BaseMapper<ModelRefertoColonscopia, ScreeningRefertoColonscopia>{

	@Override
	public ScreeningRefertoColonscopia to(ModelRefertoColonscopia source) {
		if(source == null) {
			return null;
		}
		ScreeningRefertoColonscopia screeningRefertoColonscopia = new ScreeningRefertoColonscopia();
		screeningRefertoColonscopia.setColonscopiaInDH(source.getColonscopiaInDH());
		screeningRefertoColonscopia.setVisionePulizia(source.getVisionePulizia());
		screeningRefertoColonscopia.setSedeRaggiunta(source.getSedeRaggiunta());
		screeningRefertoColonscopia.setColonscopiaNonCompleta(source.getColonscopiaNonCompleta());
		screeningRefertoColonscopia.setMotivo(source.getMotivo());
		screeningRefertoColonscopia.setPresenzaPolipi(source.getPresenzaPolipi());
		screeningRefertoColonscopia.setPresenzaLesioneSospettaPerCA(source.getPresenzaLesioneSospettaPerCA());
		screeningRefertoColonscopia.setNecessitaDiSupportoFarmacologico(source.getNecessitaSupportoFarmacologico());
		screeningRefertoColonscopia.setAltreAnomalieRilevate(source.getAltreAnomalieRilevate());
		screeningRefertoColonscopia.setComplicanzeImmediate(source.getComplicanzeImmediate());
		screeningRefertoColonscopia.setNecessitaDiAssistenzaOspedaliera(source.getNecessitaAssistenzaOspedaliera());
		//screeningRefertoColonscopia.setPolipi(new ModelScreeningPolipoMapper().toList(source.getPolipi()));		
		return screeningRefertoColonscopia;
	}

	@Override
	public ModelRefertoColonscopia from(ScreeningRefertoColonscopia dest) {
		if(dest == null) {
			return null;
		}
		ModelRefertoColonscopia modelRefertoColonscopia = new ModelRefertoColonscopia();
		modelRefertoColonscopia.setColonscopiaInDH(dest.getColonscopiaInDH());
		modelRefertoColonscopia.setVisionePulizia(dest.getVisionePulizia());
		modelRefertoColonscopia.setSedeRaggiunta(dest.getSedeRaggiunta());
		modelRefertoColonscopia.setColonscopiaNonCompleta(dest.getColonscopiaNonCompleta());
		modelRefertoColonscopia.setMotivo(dest.getMotivo());
		modelRefertoColonscopia.setPresenzaPolipi(dest.getPresenzaPolipi());
		modelRefertoColonscopia.setPresenzaLesioneSospettaPerCA(dest.getPresenzaLesioneSospettaPerCA());
		modelRefertoColonscopia.setNecessitaSupportoFarmacologico(dest.getNecessitaDiSupportoFarmacologico());
		modelRefertoColonscopia.setAltreAnomalieRilevate(dest.getAltreAnomalieRilevate());
		modelRefertoColonscopia.setComplicanzeImmediate(dest.getComplicanzeImmediate());
		modelRefertoColonscopia.setNecessitaAssistenzaOspedaliera(dest.getNecessitaDiAssistenzaOspedaliera());			
		modelRefertoColonscopia.setPolipi(new ModelScreeningPolipoMapper().fromList(dest.getPolipi()));
		return modelRefertoColonscopia;
	}

}
