/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.apisanfse.impl.base.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanfse.business.apisanfse.impl.base.FseRESTBaseService;
import it.csi.apisan.apisanfse.business.integration.dao.ApisanTCategoriaTipoDocDao;
import it.csi.apisan.apisanfse.business.integration.dao.dto.ApisanTCategoriaDocumentoDto;
import it.csi.apisan.apisanfse.business.mapper.ModelCategoriaApisanTCategoriaDocumentoDtoMapper;
import it.csi.apisan.apisanfse.business.mapper.TipoDocumentoApisanTCategoriaDocumentoDtoMapper;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelCategoria;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class DecodificheDocumentiCategorieGetService extends FseRESTBaseService {
	@Autowired
	ApisanTCategoriaTipoDocDao categoriaDao;
	private String codiceAppVerticale;
	
	public DecodificheDocumentiCategorieGetService(String codiceAppVerticale, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.codiceAppVerticale = codiceAppVerticale;
	}

	@Override
	protected Response execute() {
		checkNotNull(this.xCodiceServizio, "Codice Servizio non impostato");
		checkNotNull(this.xRequestID, "Request id non impostata");
		checkNotBlank(this.codiceAppVerticale, "Inserire il codice app verticale");
		
		
		/*
		 * 3 metodi 
		 * 1 usare resulsetextractor evita di riciclare a questo livello (codice non bellissimo a livello di dao)
		 * 2 mettere comparable su un dto apposta ApisanTCategoriaDocumentoDto usi le lambda solo con distinct (ma il dto non sarebbe un bean puro)
		 * 3 usare wrapper come ApisanTCategoriaDocumentoDtoWrapper ma devi fare ciclo a questo livello + wrap e unwrap
		 * 4 usare  select array_to_json(array_agg( row_to_json ma lo trovo complicato e un po sporco 
		 * */
		//List<ApisanTCategoriaDocumentoDto> listaTutteCatDoc = categoriaDao.getCategorieDocumenti();
		//List<ApisanTCategoriaDocumentoDto> listaCategorie = getcategoriedocDistinct(listaTutteCatDoc);
		
		/*List<ApisanTCategoriaDocumentoDto> listaCategorie = listaTutteCatDoc.stream().distinct().collect(Collectors.toList());
		
		List<ModelCategoria> listaRet =  new ModelCategoriaApisanTCategoriaDocumentoDtoMapper().fromList(listaCategorie);
		
		
		for(ModelCategoria tmp : listaRet) {
			tmp.setTipiDoumento(new TipoDocumentoApisanTCategoriaDocumentoDtoMapper().fromList(listaTutteCatDoc.stream().filter(p -> p.getCodiceCategoria().equals(tmp.getCodice())).collect(Collectors.toList())));
		}*/
		List<ModelCategoria> listaRet = categoriaDao.getCategorieDocumenti(codiceAppVerticale);
		
		
		return Response.ok(listaRet).build();
	}
	
	
	/*public List getcategoriedocDistinct(List<ApisanTCategoriaDocumentoDto> listaCategorie) {
		return listaCategorie.stream().map(ApisanTCategoriaDocumentoDtoWrapper::new)
				.sorted()
				.distinct()
				.map(ApisanTCategoriaDocumentoDtoWrapper::unwrap)
				.collect(Collectors.toList());
	}
	
	class ApisanTCategoriaDocumentoDtoWrapper implements Comparable<ApisanTCategoriaDocumentoDtoWrapper>{
		ApisanTCategoriaDocumentoDto catDocumento;
		
		ApisanTCategoriaDocumentoDtoWrapper(ApisanTCategoriaDocumentoDto tmp){
			this.catDocumento = tmp;
		}
		
		ApisanTCategoriaDocumentoDto unwrap() {
			return this.catDocumento;
		}
		
		@Override
		public int hashCode() {
			return catDocumento.getIdCategoria().hashCode();
		}


		@Override
		public boolean equals(Object other) {
			if (other instanceof ApisanTCategoriaDocumentoDtoWrapper) {
				return ((ApisanTCategoriaDocumentoDtoWrapper) other).catDocumento.getIdCategoria()
						.equals(this.catDocumento.getIdCategoria());
			}
			return false;
		}
		
		@Override
		public int compareTo(ApisanTCategoriaDocumentoDtoWrapper arg0) {
			
			return catDocumento.getIdCategoria().compareTo(arg0.catDocumento.getIdCategoria());
		}
		
		
	}*/
}
