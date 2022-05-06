/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.business.mapper;

import org.apache.commons.lang3.StringUtils;

import it.csi.apisan.apisanpag.dto.apisanpag.ModalitaErogazione;
import it.csi.gpr.ModalitaAmmissibileType;

public class ModalitaErogazioneModalitaAmmissibileTypeMapper extends BaseMapper<ModalitaErogazione, ModalitaAmmissibileType> {

	@Override
	public ModalitaAmmissibileType to(ModalitaErogazione source) {
		return null;		
	}

	@Override
	public ModalitaErogazione from(ModalitaAmmissibileType dest) {
		if(dest == null) {
			return null;
		}
		ModalitaErogazione source = new ModalitaErogazione();
		source.setCodiceServizio(dest.getCODICESERVIZIO());
		source.setCodiceVersamento(dest.getCODICEVERSAMENTO());
		source.setIdAsr(Integer.parseInt(dest.getIDASR()));
		if(dest.getIMPORTOMINBONIFICO() != null &&  StringUtils.isNotBlank(dest.getIMPORTOMINBONIFICO().getValue() )) {
			source.setImportoBinBonifico(new ImportoStringMapper().from(dest.getIMPORTOMINBONIFICO().getValue()));
			//source.setImportoBinBonifico(dest.getIMPORTOMINBONIFICO().getValue());
		}
		source.setMotivoPagamento(dest.getMOTIVOPAGAMENTO()); 
		if(dest.getMODALITAEROGAZIONE() != null) {
			source.setModalitaErogazione(dest.getMODALITAEROGAZIONE().longValue());
		}
		return source;	
	}

}
