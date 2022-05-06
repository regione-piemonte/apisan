/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanprof.business.mapper;

import it.csi.apisan.apisanprof.dto.apisanprof.InfoSanitarie;

public class InfoSanitarieMapper extends BaseMapper<InfoSanitarie, it.csi.aura.auraws.services.central.anagrafesanitaria.InfoSanitarie> {

	@Override
	public it.csi.aura.auraws.services.central.anagrafesanitaria.InfoSanitarie to(InfoSanitarie source) {
		if(source == null) {
			return null;
		}
		it.csi.aura.auraws.services.central.anagrafesanitaria.InfoSanitarie infoDest = new it.csi.aura.auraws.services.central.anagrafesanitaria.InfoSanitarie();
		infoDest.setAslAssistenza(source.getAslAssistenza());
		infoDest.setAslDomicilio(source.getAslDomicilio());
		infoDest.setAslResidenza(source.getAslResidenza());
		infoDest.setCodDistrettoDomicilio(source.getCodDistrettoDomicilio());
		infoDest.setCodDistrettoResidenza(source.getCodDistrettoResidenza());
		infoDest.setCodiceFiscaleMedico(source.getCodiceFiscaleMedico());
		infoDest.setCodiceTesseraRegionale(source.getCodiceTesseraRegionale());
		//DA VERIFICARE
		//infoDest.setCodTipoProfiloSanitario(source.getCodProfiloSanitario());
		infoDest.setCodRegionaleMedico(source.getCodRegionaleMedico());
		infoDest.setCognomeMedico(source.getCognomeMedico());
		infoDest.setDataDecorrenza(new DateXMLGregorianCalendarMapper().to(source.getDataDecorrenza()));
		infoDest.setDataFineASL(new DateXMLGregorianCalendarMapper().to(source.getDataFineAsl()));  
		infoDest.setDataFineAssMedico(new DateXMLGregorianCalendarMapper().to(source.getDataFineAssMedico()));
		infoDest.setDataFineSSN(new DateXMLGregorianCalendarMapper().to(source.getDataFineSsn()));
		infoDest.setDataInizioASL(new DateXMLGregorianCalendarMapper().to(source.getDataInizioAsl()));
		infoDest.setDataInizioAssMedico(new DateXMLGregorianCalendarMapper().to(source.getDataInizioAssMedico()));
		infoDest.setDataFineSSN(new DateXMLGregorianCalendarMapper().to(source.getDataFineSsn()));
		infoDest.setDataInizioASL(new DateXMLGregorianCalendarMapper().to(source.getDataInizioAsl()));
		infoDest.setDataInizioAssMedico(new DateXMLGregorianCalendarMapper().to(source.getDataInizioAssMedico()));
		infoDest.setDataInizioSSN(new DateXMLGregorianCalendarMapper().to(source.getDataInizioSsn()));
		infoDest.setDataMovimento(new DateXMLGregorianCalendarMapper().to(source.getDataMovimento()));
		infoDest.setDescDistrettoDomicilio(source.getDescDistrettoDomicilio());
		infoDest.setDescDistrettoResidenza(source.getDescDistrettoResidenza());
		//infoDest.setDescProfiloSanitario(source.getDescProfiloSanitario());
		//Deciso di togliere l'idAura del medico
		//infoDest.setIdMedico(source.getIdMedico());
		infoDest.setIdProfiloSanitario(source.getIdProfiloSanitario());
		infoDest.setMotivoFineAssistenza(source.getMotivoFineAssistenza());
		infoDest.setNomeMedico(source.getNomeMedico());
		infoDest.setStatoInvioMEF(source.getStatoInvioMef());
		infoDest.setTipoMovimento(source.getTipoMovimento());
		
		return infoDest;
	}

	@Override
	public InfoSanitarie from(it.csi.aura.auraws.services.central.anagrafesanitaria.InfoSanitarie dest) {
		if(dest == null) {
			return null;
		}
		InfoSanitarie infoSource = new InfoSanitarie();
		
		infoSource.setAslAssistenza(dest.getAslAssistenza());
		infoSource.setAslDomicilio(dest.getAslDomicilio());
		infoSource.setAslResidenza(dest.getAslResidenza());
		infoSource.setCodDistrettoDomicilio(dest.getCodDistrettoDomicilio());
		infoSource.setCodDistrettoResidenza(dest.getCodDistrettoResidenza());
		infoSource.setCodiceFiscaleMedico(dest.getCodiceFiscaleMedico());
		infoSource.setCodiceTesseraRegionale(dest.getCodiceTesseraRegionale());
		infoSource.setCodTipoProfiloSanitario(dest.getCodTipoProfiloSanitario());
		infoSource.setCodiceTesseraTeam(dest.getCodiceTesseraTEAM());
		infoSource.setCodRegionaleMedico(dest.getCodRegionaleMedico());
		infoSource.setCognomeMedico(dest.getCognomeMedico());
		infoSource.setDataDecorrenza(new DateXMLGregorianCalendarMapper().from(dest.getDataDecorrenza()));
		infoSource.setDataFineAsl(new DateXMLGregorianCalendarMapper().from(dest.getDataFineASL()));
		infoSource.setDataFineAssMedico(new DateXMLGregorianCalendarMapper().from(dest.getDataFineAssMedico()));
		infoSource.setDataFineSsn(new DateXMLGregorianCalendarMapper().from(dest.getDataFineSSN()));
		infoSource.setDataInizioAsl(new DateXMLGregorianCalendarMapper().from(dest.getDataInizioASL()));
		infoSource.setDataInizioAssMedico(new DateXMLGregorianCalendarMapper().from(dest.getDataInizioAssMedico()));
		infoSource.setDataFineSsn(new DateXMLGregorianCalendarMapper().from(dest.getDataFineSSN()));
		infoSource.setDataInizioAsl(new DateXMLGregorianCalendarMapper().from(dest.getDataInizioASL()));
		infoSource.setDataInizioAssMedico(new DateXMLGregorianCalendarMapper().from(dest.getDataInizioAssMedico()));
		infoSource.setDataInizioSsn(new DateXMLGregorianCalendarMapper().from(dest.getDataInizioSSN()));
		infoSource.setDataMovimento(new DateXMLGregorianCalendarMapper().from(dest.getDataMovimento()));
		infoSource.setDescDistrettoDomicilio(dest.getDescDistrettoDomicilio());
		infoSource.setDescDistrettoResidenza(dest.getDescDistrettoResidenza());
		infoSource.setDescTipoProfiloSanitario(dest.getDescTipoProfiloSanitario());
		//deciso di togliere l'idaura del medico
		//infoSource.setIdMedico(dest.getIdMedico());
		infoSource.setIdProfiloSanitario(dest.getIdProfiloSanitario());
		infoSource.setMotivoFineAssistenza(dest.getMotivoFineAssistenza());
		infoSource.setNomeMedico(dest.getNomeMedico());
		infoSource.setStatoInvioMef(dest.getStatoInvioMEF());
		infoSource.setTipoMovimento(dest.getTipoMovimento());
		
		return infoSource;
	}
	
	

}
