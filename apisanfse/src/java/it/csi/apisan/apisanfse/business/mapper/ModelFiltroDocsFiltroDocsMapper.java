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
import it.csi.apisan.apisanfse.dto.apisanfse.Etichettable;
import it.csi.apisan.apisanfse.dto.apisanfse.FiltroDocsExt;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelFiltroDocs;
import it.csi.apisan.apisanfse.integration.documenti.dma.Etichetta;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.CategoriaTipologia;

public class ModelFiltroDocsFiltroDocsMapper extends BaseMapper<ModelFiltroDocs, FiltroDocsExt>{

	@Override
	public FiltroDocsExt to(ModelFiltroDocs source) {
		if(source == null) {
			return null;
		}						
		
		List<CategoriaTipologia> categoriaTipologia = new ArrayList<CategoriaTipologia>();
		List<Etichetta> etichettaAnatomica = new ArrayList<Etichetta>();
		List<Etichetta> etichettaPersonale = new ArrayList<Etichetta>();
		
		if(source.getCategoriaTipologia()!=null) {
			categoriaTipologia = source.getCategoriaTipologia().stream().map( c -> new ModelCategoriaTipologiaCategoriaTipologiaMapper().to(c)).collect(Collectors.toList());		
		}
		if(source.getEtichettaAnatomica()!=null) {
			etichettaAnatomica = source.getEtichettaAnatomica().stream().map( e -> (Etichetta) new ModelEtichettaEtichettaMapper(new EtichettaDocumenti(),TipologiaServizi.DOCUMENTI).to(e)).collect(Collectors.toList());
		}
		if(source.getEtichettePersonali()!=null) {
			etichettaPersonale = source.getEtichettePersonali().stream().map( e -> (Etichetta) new ModelEtichettaEtichettaMapper(new EtichettaDocumenti(),TipologiaServizi.DOCUMENTI).to(e)).collect(Collectors.toList());
		}	
		FiltroDocsExt filtroDocs = new FiltroDocsExt(categoriaTipologia,etichettaAnatomica,etichettaPersonale);		 		
		filtroDocs.setDataFine(new DateTStringMapper("dd/MM/yyyy").to((source.getDataFine()))+" 23:59:59");
		filtroDocs.setDataInizio(new DateTStringMapper("dd/MM/yyyy").to(source.getDataInizio())+" 00:00:00");
		filtroDocs.setTipoEpisodio(source.getTipoEpisodio());		
		return filtroDocs;
	}

	@Override
	public ModelFiltroDocs from(FiltroDocsExt dest) {
		if(dest == null) {
			return null;
		}

		ModelFiltroDocs modelFiltroDocs = new ModelFiltroDocs();
		
		if(dest.getCategoriaTipologia()!=null) {
			modelFiltroDocs.setCategoriaTipologia(dest.getCategoriaTipologia().stream().map( c -> new ModelCategoriaTipologiaCategoriaTipologiaMapper().from(c)).collect((Collectors.toList())));
		}
		if(dest.getEtichettaAnatomica()!=null) {
			modelFiltroDocs.setEtichettaAnatomica(dest.getEtichettaAnatomica().stream().map( e -> new ModelEtichettaEtichettaMapper().from((Etichettable)e)).collect(Collectors.toList()));
		}
		if(dest.getEtichettaPersonale()!=null) {		
			modelFiltroDocs.setEtichettePersonali(dest.getEtichettaPersonale().stream().map( e -> new ModelEtichettaEtichettaMapper().from((Etichettable)e)).collect(Collectors.toList()));
		}
		
		modelFiltroDocs.setDataFine(new DateTStringMapper().from(dest.getDataFine()));		
		modelFiltroDocs.setDataInizio(new DateTStringMapper().from(dest.getDataInizio()));
		modelFiltroDocs.setTipoEpisodio(dest.getTipoEpisodio());
		return modelFiltroDocs;
	}

}
