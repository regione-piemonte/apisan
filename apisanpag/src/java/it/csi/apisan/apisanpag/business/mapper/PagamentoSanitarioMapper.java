/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.business.mapper;

import it.csi.apisan.apisanpag.dto.apisanpag.PagamentoSanitario;

public class PagamentoSanitarioMapper extends BaseMapper<PagamentoSanitario, it.csi.apisan.apisanpag.dto.ptw.PagamentoSanitario> {

	@Override
	public it.csi.apisan.apisanpag.dto.ptw.PagamentoSanitario to(PagamentoSanitario source) {
		if(source==null) {
			return null;
		}
		it.csi.apisan.apisanpag.dto.ptw.PagamentoSanitario ps = new it.csi.apisan.apisanpag.dto.ptw.PagamentoSanitario();
		
		ps.setAsr(new AsrMapper().to(source.getAsr()));
		ps.setAssegnazioneIuv(new AssegnazioneIuvMapper().to(source.getAssegnazioneIuv()));
		ps.setDaPagare(new ImportoMapper().to(source.getDaPagare()));
		ps.setDataCreazione(new DateStringMapper().to(source.getDataCreazione()));
		ps.setDescrizioneOpposizione730(source.getDescrizioneOpposizione730());
		ps.setIdRicevuta(source.getIdRicevuta());
		ps.setIva(new ImportoMapper().to(source.getIva()));
		ps.setIvaPerStampaVideo(source.getIvaPerStampaVideo());
		ps.setMarcaDaBollo(new ImportoMapper().to(source.getMarcaDaBollo()));
		ps.setMotivo(source.getMotivo());
		ps.setNre(new NreStringMapper().toList(source.getNre()));
		ps.setNumeroPraticaAsr(source.getNumeroPraticaAsr());
		ps.setNumeroPraticaRegionale(source.getNumeroPraticaRegionale());
		ps.setOpposizione730(source.getOpposizione730());
		ps.setPagato(new ImportoMapper().to(source.getPagato()));
		ps.setPaziente(new CittadinoMapper().to(source.getPaziente()));
		ps.setStato(source.getStato());
		ps.setUuid(source.getUuid());
		ps.setCodiceServizio(source.getCodiceServizio());
		ps.setCodiceVersamento(source.getCodiceVersamento());
		return ps;
	}

	@Override
	public PagamentoSanitario from(it.csi.apisan.apisanpag.dto.ptw.PagamentoSanitario dest) {
		if(dest==null) {
			return null;
		}
		PagamentoSanitario ps = new PagamentoSanitario();
		
		ps.setAsr(new AsrMapper().from(dest.getAsr()));
		ps.setAssegnazioneIuv(new AssegnazioneIuvMapper().from(dest.getAssegnazioneIuv()));
		ps.setDaPagare(new ImportoMapper().from(dest.getDaPagare()));
		ps.setDataCreazione(new DateStringMapper().from(dest.getDataCreazione()));
		ps.setDescrizioneOpposizione730(dest.getDescrizioneOpposizione730());
		ps.setIdRicevuta(dest.getIdRicevuta());
		ps.setIva(new ImportoMapper().from(dest.getIva()));
		ps.setIvaPerStampaVideo(dest.getIvaPerStampaVideo());
		ps.setMarcaDaBollo(new ImportoMapper().from(dest.getMarcaDaBollo()));
		ps.setMotivo(dest.getMotivo());
		ps.setNre(new NreStringMapper().fromList(dest.getNre()) );
		ps.setNumeroPraticaAsr(dest.getNumeroPraticaAsr());
		ps.setNumeroPraticaRegionale(dest.getNumeroPraticaRegionale());
		ps.setOpposizione730(dest.getOpposizione730());
		ps.setPagato(new ImportoMapper().from(dest.getPagato()));
		ps.setPaziente(new CittadinoMapper().from(dest.getPaziente()));
		ps.setStato(dest.getStato());
		ps.setUuid(dest.getUuid());
		ps.setCodiceServizio(dest.getCodiceServizio());
		ps.setCodiceVersamento(dest.getCodiceVersamento());
		return ps;
	}
	
	

}
