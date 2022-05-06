/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanffe.business.apisanffe.mapper;

import it.csi.apisan.apisanffe.dto.apisanffe.ModelPraticaRicevuta;
import it.csi.gpr.LMSPraticaRicevutaType;

public class ModelPraticaRicevutaLMSPraticaRicevutaTypeMapper extends BaseMapper<ModelPraticaRicevuta, LMSPraticaRicevutaType> {

	@Override
	public LMSPraticaRicevutaType to(ModelPraticaRicevuta source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelPraticaRicevuta from(LMSPraticaRicevutaType dest) {
		if(dest == null) {
			return null;
		}
		ModelPraticaRicevuta source = new ModelPraticaRicevuta();
		source.setCodiceFiscale(dest.getCODICEFISCALE());
		source.setIdAsrCup(dest.getIDASRCUP());
		source.setNumeroPratica(dest.getNUMEROPRATICA());
		source.setAttestatoRichiestaRimborso(new ModelAttRichRimborsoPraticaRicevutaLMSAttRicRimbPraticaRicevutaTypeMapper().from(dest.getATTESTATORICHIESTARIMBORSO()) );
		source.setElencoEsitiPagamento(new ModelDettEsitiPagPraticaRicevutaLMSDettEsitiPagPraticaRicevutaTypeMapper().from(dest.getELENCOESITIPAGAMENTO())  );
		source.setElencoRicevuteCortesia(new ModelDettPraticaRicevutaLMSDettPraticaRicevutaTypeMapper().from(dest.getELENCORICEVUTECORTESIA()) );
		source.setElencoRicevuteStampaAsr(new ModelDettPraticaRicevutaLMSDettPraticaRicevutaTypeMapper().from(dest.getELENCORICEVUTESTAMPAASR() ));
		source.setElencoRicevuteStampaRegionale(new ModelDettPraticaRicevutaLMSDettPraticaRicevutaTypeMapper().from(dest.getELENCORICEVUTESTAMPAREGIONALE()));
		source.setElencoRicevuteTelematiche(new ModelDettRichTelPraticaRicevutaLMSDettRicTelPraticaRicevutaTypeMapper().from(dest.getELENCORICEVUTETELEMATICHE()) );
		
		
		return source;
		
	}

	

}
