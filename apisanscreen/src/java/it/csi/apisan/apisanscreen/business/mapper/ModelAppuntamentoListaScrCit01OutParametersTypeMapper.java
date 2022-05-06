/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.business.mapper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import it.csi.apisan.apisanscreen.dto.apisanscreen.ModelAppuntamentoLista;
import it.csi.screenserviziwebsol.ScrCit01OutParametersType;

public class ModelAppuntamentoListaScrCit01OutParametersTypeMapper extends BaseMapper<ModelAppuntamentoLista, ScrCit01OutParametersType> {

	@Override
	public ScrCit01OutParametersType to(ModelAppuntamentoLista source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAppuntamentoLista from(ScrCit01OutParametersType dest) {
		if(dest == null) {
			return null;
		}
		ModelAppuntamentoLista source = new ModelAppuntamentoLista();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");//TODO IMPOSTARE PATTERN DATA


		if (dest.getPDataApp() != null && !dest.getPDataApp().isEmpty()) {
			Date d = null;
			try {
				d = sdf.parse(dest.getPDataApp());
			} catch (ParseException e) {
				// TODO
			}
			source.setData(d);
		}
		
		source.setAgendaCodice(dest.getPCodAgendaCit());
		source.setDataConvocazioneUltimo(dest.getPDataSpedConv());
		source.setDataEsitoUltimo(dest.getPDataSpedEsit());
		source.setDataSollecitoUltimo(dest.getPDataSpedSoll());
		source.setLuogo(dest.getPLuogoApp());
		source.setOra(dest.getPOraApp());
		source.setStatoCodice(dest.getPCodStatoPaz());
		source.setAppVisibile(dest.getPAppVisibile());
		return source;
		
	}

}
