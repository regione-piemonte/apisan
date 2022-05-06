/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import java.util.List;
import java.util.stream.Collectors;

import it.csi.apisan.apisanfse.business.mapper.TipologiaEtichettaEnumTipoEtichettaMapper.TipologiaServizi;
import it.csi.apisan.apisanfse.dto.apisanfse.EtichettaDocumenti;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelDocumento;
import it.csi.apisan.apisanfse.integration.documenti.dma.Etichetta;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.Documento;
import it.csi.apisan.apisanfse.util.LogUtil;

public class ModelDocumentoDocumentoMapper  extends BaseMapper<ModelDocumento, Documento> {
	
	protected LogUtil log = new LogUtil(this.getClass());		
	
	
	public ModelDocumentoDocumentoMapper() {}
	
	@Override
	public Documento to(ModelDocumento source) {
		if(source == null)
			return null;
		Documento documento = new Documento();
		
		documento.setCategoria(new StringCategoriaMapper().to(source.getCategoria()));			
		documento.setCodiceCL(source.getCodiceCl());        	    			
		documento.setEpisodio(new ModelEpisodioEpisodioMapper().to(source.getEpisodio()));
		documento.setEtichettaAnatomica((Etichetta) new ModelEtichettaEtichettaMapper(new EtichettaDocumenti(),TipologiaServizi.DOCUMENTI).to(source.getEtichettaAnatomica()));
		if(source.getEtichettePersonali()!=null) {
			List<Etichetta> etichettaPersonale = documento.getEtichettaPersonale();
			etichettaPersonale = source.getEtichettePersonali().stream().map( e -> (Etichetta)
				new ModelEtichettaEtichettaMapper(new EtichettaDocumenti(),TipologiaServizi.DOCUMENTI).to(e)).collect(Collectors.toList());
		}
		documento.setIdDocumentoIlec(new BigDecimalStringMapper().from(source.getIdDocumentoIlec()));
		documento.setMetadatiDocumento(new ModelMetadatiDocumentoMetadatiDocumentoMapper().to(source.getMetadati()));
		documento.setOscurato(source.getOscurato());
		
		List<String> list = documento.getNre();
		list.addAll(source.getNre());
		return documento;
	}

	@Override
	public ModelDocumento from(Documento dest) {
		if(dest == null)
			return null;
		ModelDocumento modelDocumento = new ModelDocumento();
		modelDocumento.setCategoria(new StringCategoriaMapper().from(dest.getCategoria()));
		modelDocumento.setCodiceCl(dest.getCodiceCL());
		modelDocumento.setEpisodio(new ModelEpisodioEpisodioMapper().from(dest.getEpisodio()));
		if(dest.getEtichettaAnatomica()!=null) {
			modelDocumento.setEtichettaAnatomica(new ModelEtichettaEtichettaMapper(new EtichettaDocumenti(),TipologiaServizi.DOCUMENTI).from(new EtichettaDocumenti(dest.getEtichettaAnatomica())));
		}
    	modelDocumento.setIdDocumentoIlec(new BigDecimalStringMapper().to(dest.getIdDocumentoIlec()));
    	if(dest.getEtichettaPersonale()!=null) {
    		modelDocumento.setEtichettePersonali(dest.getEtichettaPersonale().stream().map( e -> 
    			new ModelEtichettaEtichettaMapper(new EtichettaDocumenti(),TipologiaServizi.DOCUMENTI).from(new EtichettaDocumenti(e))).collect(Collectors.toList()));
    	}		    	
    	
    	modelDocumento.setMetadati(new ModelMetadatiDocumentoMetadatiDocumentoMapper().from(dest.getMetadatiDocumento()));
    	modelDocumento.setOscurato(dest.getOscurato());        	
    	modelDocumento.setAccessionNumbers(dest.getAccessionNumber().stream().map( a -> new ModelAccessionNumberAccessionNumber().from(a)).collect(Collectors.toList()));
    	modelDocumento.setMedici(new ModelMedicoMedicoMapper().fromList(dest.getMedici()));
    	modelDocumento.setNre(dest.getNre());
    	modelDocumento.setStatoGenerazionePacchetto(dest.getStatoGenerazionePacchetto());   
    	
		return modelDocumento;
	}
	

	
	
}
