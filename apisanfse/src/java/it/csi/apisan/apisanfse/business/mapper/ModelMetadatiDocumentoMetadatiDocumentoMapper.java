/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import java.util.List;
import java.util.stream.Collectors;

import it.csi.apisan.apisanfse.dto.apisanfse.ModelMetadatiDocumento;
import it.csi.apisan.apisanfse.integration.documenti.dma.Azienda;
import it.csi.apisan.apisanfse.integration.documenti.dma.TipoFirma;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.AssettoOrganizzativo;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.MetadatiDocumento;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.Prestazione;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.TipoDocumento;

public class ModelMetadatiDocumentoMetadatiDocumentoMapper
		extends BaseMapper<ModelMetadatiDocumento, MetadatiDocumento> {

	@Override
	public MetadatiDocumento to(ModelMetadatiDocumento source) {
		if(source == null) {
			return null;
		}
		MetadatiDocumento metadatiDocumento = new MetadatiDocumento();
		metadatiDocumento.setCodiceDocumentoDipartimentale(source.getCodiceDocumentoDipartimentale());
		metadatiDocumento.setAzienda(new ModelCodificaCodificaDocumentoMapper<Azienda>(new Azienda()).to(source.getAzienda()));
		metadatiDocumento.setDescrizioneStruttura(source.getDescrizioneStruttura());
		metadatiDocumento.setDescrizioneUnitaOperativa(source.getDescrizioneUnitaOperativa());
		metadatiDocumento.setMatricolaUpDipartimentale(source.getMatricolaUpDipartimentale());
		//TODO da verificare formati data
		metadatiDocumento.setDataValidazione(new DateTStringMapper().to(source.getDataValidazione()));
		metadatiDocumento.setTipoDocumento(new ModelCodificaCodificaDocumentoMapper<TipoDocumento>(new TipoDocumento()).to(source.getTipoDocumento()));
		metadatiDocumento.setTipoFile(source.getTipoFile());
		metadatiDocumento.setCodiceDipartimentale(source.getCodiceDipartimentale());
		metadatiDocumento.setCodiceTipoDocumentoAlto(source.getCodiceTipoDocumentoAlto());
		metadatiDocumento.setAssettoOrganizzativo(new ModelCodificaCodificaDocumentoMapper<AssettoOrganizzativo>(new AssettoOrganizzativo()).to(source.getAssettoOrganizzativo()));
		metadatiDocumento.setIdRepositoryCL(source.getIdRepositoryCl());
		metadatiDocumento.setTipoFirma(new ModelCodificaCodificaDocumentoMapper<TipoFirma>(new TipoFirma()).to(source.getTipoFirma()));
		metadatiDocumento.setTicketPagato(new ImportoStringMapper().to(source.getTicketPagato()));
		metadatiDocumento.setTicketDaPagare(new ImportoStringMapper().to(source.getTicketDaPagare()));
		metadatiDocumento.setPagatoTicket(source.getPagatoTicket());
		metadatiDocumento.setCoccarda(source.getCoccarda());
	    metadatiDocumento.setFlagEpisodiCollegati(new BooleanStringMapper().to(source.isFlagEpisodiCollegati()));
		metadatiDocumento.setFlagAssociazioniNre(new BooleanStringMapper().to(source.isFlagAssociazioniNre()));
		metadatiDocumento.setFlagAssociazioniAppend(new BooleanStringMapper().to(source.isFlagAssociazioniAppend()));
		metadatiDocumento.setDataPrimoScarico(new DateTStringMapper().to(source.getDataPrimoScarico()));
		metadatiDocumento.setDataRitiroDeVisu(new DateTStringMapper().to(source.getDataRitiroDeVisu()));
		metadatiDocumento.setRecuperoPregresso(source.getRecuperoPregresso());
		metadatiDocumento.setDescrizioneTipoFile(source.getDescrizioneTipoFile());
		if(source.getPrestazioni()!=null) {
			List<Prestazione> prestazioni = metadatiDocumento.getPrestazioni();		
			prestazioni = source.getPrestazioni().stream().map(prestazione -> new PrestazioneMapper().to(prestazione)).collect(Collectors.toList());
		}
		return metadatiDocumento; 
	}

	@Override
	public ModelMetadatiDocumento from(MetadatiDocumento dest) {
		if(dest == null) {
			return null;
		}
		ModelMetadatiDocumento modelMetadatiDocumento = new ModelMetadatiDocumento();
		modelMetadatiDocumento.setCodiceDocumentoDipartimentale(dest.getCodiceDocumentoDipartimentale());
		modelMetadatiDocumento.setAzienda(new ModelCodificaCodificaDocumentoMapper<Azienda>(new Azienda()).from(dest.getAzienda()));
		modelMetadatiDocumento.setDescrizioneStruttura(dest.getDescrizioneStruttura());
		modelMetadatiDocumento.setDescrizioneUnitaOperativa(dest.getDescrizioneUnitaOperativa());
		modelMetadatiDocumento.setMatricolaUpDipartimentale(dest.getMatricolaUpDipartimentale());		
		modelMetadatiDocumento.setTipoDocumento(new ModelCodificaCodificaDocumentoMapper<TipoDocumento>(new TipoDocumento()).from(dest.getTipoDocumento()));
		modelMetadatiDocumento.setTipoFile(dest.getTipoFile());
		modelMetadatiDocumento.setCodiceDipartimentale(dest.getCodiceDipartimentale());
		modelMetadatiDocumento.setCodiceTipoDocumentoAlto(dest.getCodiceTipoDocumentoAlto());
		modelMetadatiDocumento.setAssettoOrganizzativo(new ModelCodificaCodificaDocumentoMapper<AssettoOrganizzativo>(new AssettoOrganizzativo()).from(dest.getAssettoOrganizzativo()));
		modelMetadatiDocumento.setIdRepositoryCl(dest.getIdRepositoryCL());
		modelMetadatiDocumento.setTipoFirma(new ModelCodificaCodificaDocumentoMapper<TipoFirma>(new TipoFirma()).from(dest.getTipoFirma()));							
		modelMetadatiDocumento.setTicketPagato(new ImportoStringMapper().from(dest.getTicketPagato()));
		modelMetadatiDocumento.setTicketDaPagare(new ImportoStringMapper().from(dest.getTicketDaPagare()));
		modelMetadatiDocumento.setPagatoTicket(dest.getPagatoTicket());

		modelMetadatiDocumento.setCoccarda(dest.getCoccarda());
		//TODO modificare boolean
		modelMetadatiDocumento.setFlagEpisodiCollegati(new BooleanStringMapper().from(dest.getFlagEpisodiCollegati()));		
		modelMetadatiDocumento.setFlagAssociazioniNre(new BooleanStringMapper().from(dest.getFlagAssociazioniNre()));		
		modelMetadatiDocumento.setFlagAssociazioniAppend(new BooleanStringMapper().from(dest.getFlagAssociazioniAppend()));
		 
		modelMetadatiDocumento.setDataValidazione(new DateTStringMapper().from(dest.getDataValidazione()));		
		modelMetadatiDocumento.setDataPrimoScarico(new DateTStringMapper().from(dest.getDataPrimoScarico()));
		modelMetadatiDocumento.setDataRitiroDeVisu(new DateTStringMapper().from(dest.getDataRitiroDeVisu()));
		
		if(dest.getPrestazioni()!=null) 
			modelMetadatiDocumento.setPrestazioni(dest.getPrestazioni().stream().map(prestazione -> new PrestazioneMapper().from(prestazione)).collect(Collectors.toList()));
		modelMetadatiDocumento.setRecuperoPregresso(dest.getRecuperoPregresso());
		modelMetadatiDocumento.setDescrizioneTipoFile(dest.getDescrizioneTipoFile());				
		modelMetadatiDocumento.setTipoContributo(dest.getTipoContributo());
		return modelMetadatiDocumento;
	}

	
}
