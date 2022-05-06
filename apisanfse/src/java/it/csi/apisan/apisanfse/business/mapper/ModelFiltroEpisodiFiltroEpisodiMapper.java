/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import it.csi.apisan.apisanfse.business.mapper.TipologiaEtichettaEnumTipoEtichettaMapper.TipologiaServizi;
import it.csi.apisan.apisanfse.dto.apisanfse.EtichettaDocumenti;
import it.csi.apisan.apisanfse.dto.apisanfse.FiltroEpisodiExt;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelFiltroDocs;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelFiltroEpisodi;
import it.csi.apisan.apisanfse.integration.documenti.dma.Etichetta;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.CategoriaTipologia;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.FiltroEpisodi;

public class ModelFiltroEpisodiFiltroEpisodiMapper extends BaseMapper<ModelFiltroEpisodi, FiltroEpisodiExt> {

	@Override
	public FiltroEpisodiExt to(ModelFiltroEpisodi source) {
		if(source == null) {
			return null;
		}
		

		List<CategoriaTipologia> categoriaTipologia = new ArrayList<CategoriaTipologia>();
		List<Etichetta> etichettaAnatomica = new ArrayList<Etichetta>();
		List<Etichetta> etichettaPersonale = new ArrayList<Etichetta>();
		 
		
		categoriaTipologia = new ModelCategoriaTipologiaCategoriaTipologiaMapper().toList(source.getCategoriaTipologia());
		if(source.getEtichettaAnatomica()!=null) {
			etichettaAnatomica = source.getEtichettaAnatomica().stream().map( e -> (Etichetta) new ModelEtichettaEtichettaMapper(new EtichettaDocumenti(),TipologiaServizi.DOCUMENTI).to(e)).collect(Collectors.toList());
		}
		if(source.getEtichettePersonali()!=null) {
			etichettaPersonale = source.getEtichettePersonali().stream().map( e -> (Etichetta) new ModelEtichettaEtichettaMapper(new EtichettaDocumenti(),TipologiaServizi.DOCUMENTI).to(e)).collect(Collectors.toList());
		}	
		
		FiltroEpisodiExt dest = new FiltroEpisodiExt(categoriaTipologia, etichettaAnatomica, etichettaPersonale, source.getTipoEpisodio());
		
		
		dest.setDataFine(new DateTStringMapper("dd/MM/yyyy").to((source.getDataFine()))+" 23:59:59");
		dest.setDataInizio(new DateTStringMapper("dd/MM/yyyy").to(source.getDataInizio())+" 00:00:01");
				
		
		return dest;
		
	}

	@Override
	public ModelFiltroEpisodi from(FiltroEpisodiExt dest) {
		// TODO Auto-generated method stub
		return null;
	}

}
