/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import java.util.HashMap;

import it.csi.apisan.apisanfse.integration.documenti.dmacc.Categoria;

public class CategoriaEtichetteCategoriaDocumentiMapper  extends BaseMapper<it.csi.apisan.apisanfse.integration.etichette.dmacc.Categoria, Categoria> {
	
	HashMap<it.csi.apisan.apisanfse.integration.etichette.dmacc.Categoria, it.csi.apisan.apisanfse.integration.documenti.dmacc.Categoria> categoriaToMap;	
	HashMap<it.csi.apisan.apisanfse.integration.documenti.dmacc.Categoria, it.csi.apisan.apisanfse.integration.etichette.dmacc.Categoria> categoriaFromMap;
	
	public CategoriaEtichetteCategoriaDocumentiMapper(){
		this.categoriaFromMap = new HashMap<Categoria, it.csi.apisan.apisanfse.integration.etichette.dmacc.Categoria>();		
		this.categoriaToMap =	new HashMap<it.csi.apisan.apisanfse.integration.etichette.dmacc.Categoria,Categoria>();
		
		categoriaFromMap.put(Categoria.FSE, it.csi.apisan.apisanfse.integration.etichette.dmacc.Categoria.FSE);
		categoriaFromMap.put(Categoria.PERSONALE, it.csi.apisan.apisanfse.integration.etichette.dmacc.Categoria.PERSONALE);
		
		categoriaToMap.put(it.csi.apisan.apisanfse.integration.etichette.dmacc.Categoria.FSE,Categoria.FSE);
		categoriaToMap.put(it.csi.apisan.apisanfse.integration.etichette.dmacc.Categoria.PERSONALE,Categoria.PERSONALE);
	}
	
	@Override
	public Categoria to(it.csi.apisan.apisanfse.integration.etichette.dmacc.Categoria source) {
		if(source == null) {
			return null;
		}
		return categoriaToMap.get(source);
	}

	@Override
	public it.csi.apisan.apisanfse.integration.etichette.dmacc.Categoria from(Categoria dest) {
		if(dest == null) {
			return null;
		}
		return categoriaFromMap.get(dest);
	}
	
	
}
