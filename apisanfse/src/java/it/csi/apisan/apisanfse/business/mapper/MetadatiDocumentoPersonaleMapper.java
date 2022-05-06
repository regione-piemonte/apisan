/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import it.csi.apisan.apisanfse.dto.apisanfse.ModelMetadatiDocumentoPersonale;
import it.csi.apisan.apisanfse.integration.documentoPersonale.dma.MetadatiDocumentoPersonale;
import it.csi.apisan.apisanfse.integration.documentoPersonale.dmacc.TipoContributo;
import it.csi.apisan.apisanfse.integration.documentoPersonale.dmacc.TipoDocumento;

public class MetadatiDocumentoPersonaleMapper   extends BaseMapper<ModelMetadatiDocumentoPersonale, MetadatiDocumentoPersonale> {

	@Override
	public MetadatiDocumentoPersonale to(ModelMetadatiDocumentoPersonale source) {
		if(source == null)
			return null;
		MetadatiDocumentoPersonale metadatiDocumentoPersonale = new MetadatiDocumentoPersonale();
		metadatiDocumentoPersonale.setDataEmissione(new DateXMLGregorianCalendarMapper().to(source.getDataEmissione()));
		metadatiDocumentoPersonale.setDataOraAggiornamento(new DateXMLGregorianCalendarMapper().to(source.getDataOraAggiornamento()));		
		metadatiDocumentoPersonale.setMedico(source.getMedico());
		metadatiDocumentoPersonale.setStruttura(source.getStruttura());
		metadatiDocumentoPersonale.setTipoContributo(new ModelCodificaCodificaDocumentoPersonaleMapper<TipoContributo>(new TipoContributo()).to(source.getTipoContributo()));
		metadatiDocumentoPersonale.setTipoDocumento(new ModelCodificaCodificaDocumentoPersonaleMapper<TipoDocumento>(new TipoDocumento()).to(source.getTipoDocumento()));
		metadatiDocumentoPersonale.setUnita(source.getUnita());
		
		return metadatiDocumentoPersonale;
	}

	@Override
	public ModelMetadatiDocumentoPersonale from(MetadatiDocumentoPersonale dest) {
		if(dest == null)
			return null;
		ModelMetadatiDocumentoPersonale modelMetadatiDocumentoPersonale = new ModelMetadatiDocumentoPersonale();
		modelMetadatiDocumentoPersonale.setDataEmissione(new DateXMLGregorianCalendarMapper().from(dest.getDataEmissione()));
		modelMetadatiDocumentoPersonale.setDataOraAggiornamento(new DateXMLGregorianCalendarMapper().from(dest.getDataOraAggiornamento()));
		modelMetadatiDocumentoPersonale.setMedico(dest.getMedico());
		modelMetadatiDocumentoPersonale.setStruttura(dest.getStruttura());
		modelMetadatiDocumentoPersonale.setTipoContributo(new ModelCodificaCodificaDocumentoPersonaleMapper<TipoContributo>(new TipoContributo()).from(dest.getTipoContributo()));
		modelMetadatiDocumentoPersonale.setTipoDocumento(new ModelCodificaCodificaDocumentoPersonaleMapper<TipoDocumento>(new TipoDocumento()).from(dest.getTipoDocumento()));
		modelMetadatiDocumentoPersonale.setUnita(dest.getUnita());
		
		return modelMetadatiDocumentoPersonale;
	}

}
