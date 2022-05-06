/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.mapper;

import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelMedicoLoccsi;
import it.csi.apisan.apisanscerev.dto.scerev.ModelMonitoraMedico;

public class ModelMedicoLoccsiModelMonitoraMedicoMapper extends BaseMapper<ModelMedicoLoccsi, ModelMonitoraMedico> {

	@Override
	public ModelMonitoraMedico to(ModelMedicoLoccsi source) {
		if(source == null) {
			return null;
		}
		ModelMonitoraMedico dest = new ModelMonitoraMedico();
		dest.setAmbito(new ModelMedicoAmbitoModelMedicoAmbitoMapper().to(source.getAmbito()));
		dest.setAsl(new ModelAslModelAslMapper().to(source.getAsl()));
		dest.setAutolimitato(source.isAutolimitato());
		dest.setCodiceFiscale(source.getCodiceFiscale());
		dest.setCodiceRegionale(source.getCodiceRegionale());
		dest.setCognome(source.getCognome());
		dest.setDataNascita(source.getDataNascita());
		dest.setDistretto(new ModelMedicoDistrettoModelMedicoDistrettoMapper().to(source.getDistretto()));
		dest.setId(source.getId());
		dest.setMail(source.getMail());
		dest.setMassimale(source.getMassimale());
		dest.setMassimaleAssistenzaTemporanea(source.getMassimaleAssistenzaTemporanea());
		dest.setMassimaleDeroga(source.getMassimaleDeroga());
		dest.setMassimaleInfanzia(source.getMassimaleInfanzia());
		dest.setNome(source.getNome());
		dest.setSesso(source.getSesso());
		dest.setSpecializzazioni(source.getSpecializzazioni());
		dest.setTipologia(new ModelMedicoTipologiaModelMedicoTipologiaMapper().to(source.getTipologia()));
		
		return dest;
		
	}

	@Override
	public ModelMedicoLoccsi from(ModelMonitoraMedico dest) {
		// TODO Auto-generated method stub
		return null;
	}

}
