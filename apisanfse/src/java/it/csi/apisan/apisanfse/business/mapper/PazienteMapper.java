/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import it.csi.apisan.apisanfse.dto.apisanfse.Paziente;

public class PazienteMapper extends BaseMapper<Paziente,it.csi.apisan.apisanfse.integration.dma.Paziente> {

	@Override
	public it.csi.apisan.apisanfse.integration.dma.Paziente to(Paziente source) {
		if(source==null) {
			return null;
		}
		it.csi.apisan.apisanfse.integration.dma.Paziente result = new it.csi.apisan.apisanfse.integration.dma.Paziente();
		result.setCodiceFiscale(source.getCodiceFiscale());
		result.setCognome(source.getCognome());
		result.setNome(source.getNome());
		result.setComuneDiNascita(new ComuneDiNascitaMapper().to(source.getComuneDiNascita()));
		result.setDataDiNascita(new DateXMLGregorianCalendarMapper().to(source.getDataDiNascita()));
		result.setIdAura(new IntegerLongMapper().to(source.getIdAura()));
		result.setIdIrec(new IntegerLongMapper().to(source.getIdIrec()));
		result.setMailPerAccessoDMA(new BooleanSiNoMapper().to(source.isMailPerAccessoDma()));
		result.setSesso(new StringSessoMapper().to(source.getSesso()));
		result.setStatoDiNascita(new StatoDiNascitaMapper().to(source.getStatoDiNascita()));
		return result;
	}

	@Override
	public Paziente from(it.csi.apisan.apisanfse.integration.dma.Paziente dest) {
		if(dest==null) {
			return null;
		}
		Paziente result = new Paziente();
		result.setCodiceFiscale(dest.getCodiceFiscale());
		result.setCognome(dest.getCognome());
		result.setNome(dest.getNome());
		result.setComuneDiNascita(new ComuneDiNascitaMapper().from(dest.getComuneDiNascita()));
		result.setDataDiNascita(new DateXMLGregorianCalendarMapper().from(dest.getDataDiNascita()));
		result.setIdAura(new IntegerLongMapper().from(dest.getIdAura()));
		result.setIdIrec(new IntegerLongMapper().from(dest.getIdIrec()));
		result.setMailPerAccessoDma(new BooleanSiNoMapper().from(dest.getMailPerAccessoDMA()));
		result.setSesso(new StringSessoMapper().from(dest.getSesso()));
		result.setStatoDiNascita(new StatoDiNascitaMapper().from(dest.getStatoDiNascita()));
		return result;
	}

	
	

}
