/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanprof.business.mapper;

import it.csi.apisan.apisanprof.dto.apisanprof.DatiPrimari;

public class DatiPrimariMapper  extends BaseMapper<DatiPrimari, it.csi.aura.auraws.services.central.anagrafesanitaria.DatiPrimari> {

	@Override
	public it.csi.aura.auraws.services.central.anagrafesanitaria.DatiPrimari to(DatiPrimari source) {
		// questo metodo non servirebbe sono solo in lettura
		it.csi.aura.auraws.services.central.anagrafesanitaria.DatiPrimari datiDest = new it.csi.aura.auraws.services.central.anagrafesanitaria.DatiPrimari();
		
		datiDest.setCodCittadinanza(source.getCodCittadinanza());
		datiDest.setCodComuneNascita(source.getCodComuneNascita());
		datiDest.setCodiceFiscale(source.getCodiceFiscale());
		datiDest.setCodStatoNascita(source.getCodStatoNascita());
		datiDest.setCognome(source.getCognome());
		//mettere a posto le date
		 datiDest.setDataDecesso(new DateXMLGregorianCalendarMapper().to(source.getDataDecesso()) );
		datiDest.setDataNascita(new DateXMLGregorianCalendarMapper().to(source.getDataNascita()));
		datiDest.setDescCittadinanza(source.getDescCittadinanza());
		datiDest.setDescComuneNascita(source.getDescComuneNascita());
		datiDest.setDescStatoNascita(source.getDescStatoNascita());
		datiDest.setNome(source.getNome());
		datiDest.setSesso(source.getSesso());
		datiDest.setSiglaProvNascita(source.getSiglaProvNascita());
		datiDest.setStatoCodiceFiscale(source.getStatoCodiceFiscale());
		datiDest.setStatoProfiloAnagrafico(source.getStatoProfiloAnagrafico());
		
		return datiDest;
	}

	@Override
	public DatiPrimari from(it.csi.aura.auraws.services.central.anagrafesanitaria.DatiPrimari dest) {
		// TODO Auto-generated method stub
		DatiPrimari datiSource = new DatiPrimari();
		datiSource.setCodCittadinanza(dest.getCodCittadinanza());
		datiSource.setCodComuneNascita(dest.getCodComuneNascita());
		datiSource.setCodiceFiscale(dest.getCodiceFiscale());
		datiSource.setCodStatoNascita(dest.getCodStatoNascita());
		datiSource.setCognome(dest.getCognome());
		//mettere a posto le date
		datiSource.setDataDecesso(new DateXMLGregorianCalendarMapper().from(dest.getDataDecesso()));
		datiSource.setDataNascita(new DateXMLGregorianCalendarMapper().from(dest.getDataNascita()));
		datiSource.setDescCittadinanza(dest.getDescCittadinanza());
		datiSource.setDescComuneNascita(dest.getDescComuneNascita());
		datiSource.setDescStatoNascita(dest.getDescStatoNascita());
		datiSource.setNome(dest.getNome());
		datiSource.setSesso(dest.getSesso());
		datiSource.setSiglaProvNascita(dest.getSiglaProvNascita());
		datiSource.setStatoCodiceFiscale(dest.getStatoCodiceFiscale());
		datiSource.setStatoProfiloAnagrafico(dest.getStatoProfiloAnagrafico());
		
		return datiSource;
	}
	
	

}
