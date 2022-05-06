/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import it.csi.apisan.apisanfse.dto.apisanfse.ModelEpisodio;
import it.csi.apisan.apisanfse.integration.documenti.dma.Azienda;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.Episodio;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.TipoEpisodio;

public class ModelEpisodioEpisodioMapper  extends BaseMapper<ModelEpisodio, Episodio> {
	

	@Override
	public Episodio to(ModelEpisodio source) {
		if(source == null)
			return null;
		Episodio episodio = new Episodio();
		episodio.setIdEpisodio(source.getIdEpisodio());
		episodio.setDataInizio(new DateTStringMapper().to(source.getDataInizio()));
		episodio.setDataFine(new DateTStringMapper().to(source.getDataInizio()));						
		episodio.setAziendaAccettazione(new ModelCodificaCodificaDocumentoMapper<Azienda>(new Azienda()).to(source.getAziendaAccettazione()));
		episodio.setAziendaDimissione(new ModelCodificaCodificaDocumentoMapper<Azienda>(new Azienda()).to(source.getAziendaDimissione()));
		episodio.setDescrizioneStrutturaAccettazione(source.getDescrizioneStrutturaAccettazione());
		episodio.setDescrizioneStrutturaDimissione(source.getDescrizioneStrutturaDimissione());
		episodio.setDescrizioneUnitaOperativaAccettazione(source.getDescrizioneUnitaOperativaAccettazione());
		episodio.setDescrizioneUnitaOperativaDimissione(source.getDescrizioneUnitaOperativaDimissione());
		episodio.setMatricolaAccettazione(source.getMatricolaDimissione());
		episodio.setMatricolaDimissione(source.getMatricolaDimissione());
		episodio.setNumeroPassaggio(source.getNumeroPassaggio());
		episodio.setNumeroNosologico(source.getNumeroNosologico());
		episodio.setTipoEpisodio(new ModelCodificaCodificaDocumentoMapper<TipoEpisodio>(new TipoEpisodio()).to(source.getTipoEpisodio())); 
    	episodio.setCodiceCL(source.getCodiceCl()); 
		return episodio;
	}

	@Override
	public ModelEpisodio from(Episodio dest) {
		if(dest == null)
			return null;
		ModelEpisodio modelEpisodio = new ModelEpisodio();
		modelEpisodio.setIdEpisodio(dest.getIdEpisodio());
		modelEpisodio.setDataInizio(new DateTStringMapper().from(dest.getDataInizio()));		
		modelEpisodio.setDataFine(new DateTStringMapper().from(dest.getDataFine()));
		modelEpisodio.setAziendaAccettazione(new ModelCodificaCodificaDocumentoMapper<Azienda>(new Azienda()).from(dest.getAziendaAccettazione()));
		modelEpisodio.setAziendaDimissione(new ModelCodificaCodificaDocumentoMapper<Azienda>(new Azienda()).from(dest.getAziendaDimissione()));
		modelEpisodio.setDescrizioneStrutturaAccettazione(dest.getDescrizioneStrutturaAccettazione());
		modelEpisodio.setDescrizioneStrutturaDimissione(dest.getDescrizioneStrutturaDimissione());
		modelEpisodio.setDescrizioneUnitaOperativaAccettazione(dest.getDescrizioneUnitaOperativaAccettazione());
		modelEpisodio.setDescrizioneUnitaOperativaDimissione(dest.getDescrizioneUnitaOperativaDimissione());
		modelEpisodio.setMatricolaAccettazione(dest.getMatricolaAccettazione());
		modelEpisodio.setMatricolaDimissione(dest.getMatricolaDimissione());
		modelEpisodio.setNumeroPassaggio(dest.getNumeroPassaggio());
		modelEpisodio.setNumeroNosologico(dest.getNumeroNosologico());
		modelEpisodio.setTipoEpisodio(new ModelCodificaCodificaDocumentoMapper<TipoEpisodio>(new TipoEpisodio()).from(dest.getTipoEpisodio()));
		modelEpisodio.setCodiceCl(dest.getCodiceCL());  
		    	    	
		return modelEpisodio;
	}
	
	
}
