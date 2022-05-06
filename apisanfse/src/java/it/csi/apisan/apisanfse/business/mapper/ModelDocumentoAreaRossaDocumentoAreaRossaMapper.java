/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import org.springframework.beans.BeanUtils;

import it.csi.apisan.apisanfse.dto.apisanfse.AziendaSanitaria;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelDocumentoAreaRossa;
import it.csi.apisan.apisanfse.integration.documenti.dma.Azienda;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.DocumentoAreaRossa;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.TipoDocumento;

public class ModelDocumentoAreaRossaDocumentoAreaRossaMapper extends BaseMapper<ModelDocumentoAreaRossa, DocumentoAreaRossa>{

	@Override
	public DocumentoAreaRossa to(ModelDocumentoAreaRossa source) {

		if(source == null) {
				return null;
		}
		
		DocumentoAreaRossa dest = new DocumentoAreaRossa();
		
		if(source.getAzienda()!=null) {
			Azienda azienda =new Azienda();
			BeanUtils.copyProperties(source.getAzienda(), azienda);
			dest.setAzienda(azienda);
		}
		
		dest.setCodiceCL(source.getCodiceCl());
		dest.setDataEmissione(new DateTStringMapper().to(source.getDataEmisione()));
		dest.setDataInserimento(new DateTStringMapper().to(source.getDataInserimento()));
		dest.setDataScadenza(new DateTStringMapper().to(source.getDataInserimento()) );		
		dest.setDescrizioneStruttura(source.getDescrizioneStruttura());
		dest.setGgDownload(source.getGgDownload());
		dest.setIdDocumentoIlec(new StringLongMapper().to(source.getIdDocumentoIlec()));
		dest.setImportoDaPagare(new ImportoStringMapper().to(source.getImportoDaPagare()));		
		dest.setImportoPagato(new ImportoStringMapper().to(source.getImportoPagato()));
		dest.setPagatoTicket(source.getPagatoTicket());
		dest.setRol(source.getRol());
		
		dest.setTipoDocumento(new ModelCodificaCodificaDocumentoMapper<TipoDocumento>(new TipoDocumento()).to(source.getTipoDocumento()));
		
		return dest;
	}

	@Override
	public ModelDocumentoAreaRossa from(DocumentoAreaRossa dest) {
		
		if(dest == null) {
			return null;
		}
		
		ModelDocumentoAreaRossa source = new ModelDocumentoAreaRossa();
		if(dest.getAzienda()!=null) {
			AziendaSanitaria azienda =new AziendaSanitaria();
			BeanUtils.copyProperties(dest.getAzienda(), azienda);
			source.setAzienda(azienda);
		}
		source.setCodiceCl(dest.getCodiceCL());
		source.setDataEmisione(new DateTStringMapper().from(dest.getDataEmissione()));
		source.setDataInserimento(new DateTStringMapper().from(dest.getDataInserimento()));
		source.setDataScadenza(new DateTStringMapper().from( dest.getDataScadenza()));	
		
		source.setDescrizioneStruttura(dest.getDescrizioneStruttura());
		source.setGgDownload(dest.getGgDownload());
		source.setIdDocumentoIlec(new StringLongMapper().from(dest.getIdDocumentoIlec()));
		source.setImportoDaPagare(new ImportoStringMapper().from(dest.getImportoDaPagare()));
		source.setImportoPagato(new ImportoStringMapper().from(dest.getImportoPagato()));
		//modificare in stringa
		source.setPagatoTicket(dest.getPagatoTicket());
		
		source.setRol(dest.getRol());
		source.setIdEpisodio(dest.getIdEpisodio());
		source.setTipoDocumento(new ModelCodificaCodificaDocumentoMapper<TipoDocumento>(new TipoDocumento()).from(dest.getTipoDocumento()));
		source.setStatoGenerazionePacchetto(dest.getStatoGenerazionePacchetto());
		source.setAccessionNumbers(new ModelAccessionNumberAccessionNumber().fromList(dest.getAccessionNumber()) );
		source.setCodiceDocumentoDipartimentale(dest.getCodiceDocumentoDipartimentale());
		
		
		return source;		
	
	}

}
