/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.business.mapper;

import it.csi.apisan.apisanscreen.dto.apisanscreen.ModelDocumentoLista;
import it.csi.screenserviziwebsol.GetElencoDocumentiDigitaliOutParametersType;

public class ModelDocumentoListaGetElencoDocumentiDigitaliOutParametersTypeMapper extends BaseMapper<ModelDocumentoLista, GetElencoDocumentiDigitaliOutParametersType> {

	@Override
	public GetElencoDocumentiDigitaliOutParametersType to(ModelDocumentoLista source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelDocumentoLista from(GetElencoDocumentiDigitaliOutParametersType dest) {
		if(dest == null) {
			return null;
		}
		ModelDocumentoLista source = new ModelDocumentoLista();
		source.setCategoriaCodice(dest.getPCategoria());
		source.setCodice(dest.getPCodDocumento());
		source.setDataGenerazione(new DateXMLGregorianCalendarMapper().from(dest.getPDataGenerazione()));
		source.setFileNome(dest.getPNomeFile());
		source.setId(dest.getPIdDocumento());
		source.setLetto(new BooleanStringMapper().from(dest.getPLetto()));
		source.setModelloCodice(dest.getPCodModello());
		source.setModelloDescrizione(dest.getPDesModello());
		source.setTipologiaScreeningCodice(dest.getPTipoScreen());
		source.setTipologiaScreeningDescrizione(dest.getPDescScreen());
	
		return source;
	}

}
