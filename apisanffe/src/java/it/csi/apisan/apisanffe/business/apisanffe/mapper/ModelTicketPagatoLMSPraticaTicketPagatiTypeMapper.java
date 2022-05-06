/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanffe.business.apisanffe.mapper;

import java.math.BigInteger;

import it.csi.apisan.apisanffe.dto.apisanffe.ModelTicketPagato;
import it.csi.gpr.LMSPraticaTicketPagatiType;

public class ModelTicketPagatoLMSPraticaTicketPagatiTypeMapper extends BaseMapper<ModelTicketPagato, LMSPraticaTicketPagatiType> {

	@Override
	public LMSPraticaTicketPagatiType to(ModelTicketPagato source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelTicketPagato from(LMSPraticaTicketPagatiType dest) {
		if(dest == null) {
			return null;
		}
		ModelTicketPagato source = new ModelTicketPagato();
		source.setAsrDescrizione(dest.getDESCRIZIONEIDASRCUP());
		source.setAsrId(dest.getIDASRCUP());
		try {
			source.setConsenso730(Integer.parseInt(dest.getCONSENSO730()));
		} catch (NumberFormatException e) {
			
		}
		source.setDataAnnullamento(new DateStringMapper(DateStringMapper.DATEYYYMMDD).from(dest.getDATAANNULLAMENTO()) );
		source.setImportoDaRimborsare(new BigDecimalStringMapper().from(getJaxbElement( dest.getIMPORTODARIMBORSARE())));
		source.setImportoPagamento(new BigDecimalStringMapper().from( dest.getIMPORTOTICKETPAGATO()));
		source.setImportoPratica(  new BigDecimalStringMapper().from(dest.getIMPORTOPRATICA()));
		source.setImportoRimborsato(new BigDecimalStringMapper().from(getJaxbElement( dest.getIMPORTORIMBORSATO())));
		source.setMotivoPagamento(dest.getMOTIVOPAGAMENTO());
		source.setNumeroPratica(dest.getNUMEROPRATICA());
		source.setRicevutePagamento(new ModelTicketPagatoRicevutaPagamentoLMSRicevutePagamentoTicketPagatiTypeMapper().fromList(dest.getRICEVUTAPAGAMENTO()));
		source.setRicevuteRimborso(new ModelTicketPagatoRicevutaRimborsoLMSRicevuteRimborsoPagamentoTypeMapper().fromList(dest.getRIMBORSOPAGAMENTO())  );
		if(dest.getRIMBORSIUTILIZZATI()!= null) {
			source.setRimborsiUtilizzati(new ModelTicketPagatoRimborsoUtilizzatoLMSRimborsoUtilizzatoTypeMapper().fromList( dest.getRIMBORSIUTILIZZATI().getRIMBORSOUTILIZZATO()));
		}
		BigInteger modRimb =  getJaxbElement(dest.getMODALITARIMBORSO());
		source.setRimborsoModalitaCodice(modRimb != null? modRimb.intValue() : null );
		source.setServizioCodice(dest.getCODICESERVIZIO());
		try {
			source.setStatoPraticaCodice(dest.getCODICESTATOPRATICA() );
		} catch (Exception e) {
			
		}
		source.setStatoPraticaDescrizione(dest.getDESCIZIONESTATOPRATICA());
		//TODO
		//source.setTipologiaCodice(dest.ge);
		source.setVersamentoCodice(dest.getCODICEVERSAMENTO());
		
		
		
		return source;
	}


}
