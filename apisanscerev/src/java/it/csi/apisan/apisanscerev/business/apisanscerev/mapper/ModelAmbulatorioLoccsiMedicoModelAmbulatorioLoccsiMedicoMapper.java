/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.mapper;

import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelAmbulatorioLoccsiMedico;

public class ModelAmbulatorioLoccsiMedicoModelAmbulatorioLoccsiMedicoMapper extends BaseMapper<ModelAmbulatorioLoccsiMedico, it.csi.apisan.apisanscerev.dto.scerev.ModelAmbulatorioLoccsiMedico> {

	@Override
	public it.csi.apisan.apisanscerev.dto.scerev.ModelAmbulatorioLoccsiMedico to(ModelAmbulatorioLoccsiMedico source) {
		if(source == null) {
			return null;
		}
		it.csi.apisan.apisanscerev.dto.scerev.ModelAmbulatorioLoccsiMedico dest = new it.csi.apisan.apisanscerev.dto.scerev.ModelAmbulatorioLoccsiMedico();
		dest.setAmbito(new ModelMedicoAmbitoModelMedicoAmbitoMapper().to(source.getAmbito()));
		dest.setAsl(new ModelAslModelAslMapper().to(source.getAsl()));
		dest.setAutolimitato(source.isAutolimitato());
		dest.setCodiceFiscale(source.getCodiceFiscale());
		dest.setCodiceRegionale(source.getCodiceRegionale());
		dest.setCognome(source.getCognome());
		dest.setDataNascita(new DateNascitaTMapper().to(source.getDataNascita()));
		//dest.setDataNascita(source.getDataNascita());
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
	public ModelAmbulatorioLoccsiMedico from(it.csi.apisan.apisanscerev.dto.scerev.ModelAmbulatorioLoccsiMedico dest) {
		if(dest == null) {
			return null;
		}
		ModelAmbulatorioLoccsiMedico source = new ModelAmbulatorioLoccsiMedico();
		
		source.setAmbito(new ModelMedicoAmbitoModelMedicoAmbitoMapper().from(dest.getAmbito()));
		source.setAsl(new ModelAslModelAslMapper().from(dest.getAsl()));
		source.setAutolimitato(dest.isAutolimitato());
		source.setCodiceFiscale(dest.getCodiceFiscale());
		source.setCodiceRegionale(dest.getCodiceRegionale());
		source.setCognome(dest.getCognome());
		source.setDataNascita(new DateNascitaTMapper().from(  dest.getDataNascita()));
		//source.setDataNascita(dest.getDataNascita());
		source.setDistretto(new ModelMedicoDistrettoModelMedicoDistrettoMapper().from(dest.getDistretto()));
		source.setId(dest.getId());
		source.setMail(dest.getMail());
		source.setMassimale(dest.getMassimale());
		source.setMassimaleAssistenzaTemporanea(dest.getMassimaleAssistenzaTemporanea());
		source.setMassimaleDeroga(dest.getMassimaleDeroga());
		source.setMassimaleInfanzia(dest.getMassimaleInfanzia());
		source.setNome(dest.getNome());
		source.setSesso(dest.getSesso());
		source.setSpecializzazioni(dest.getSpecializzazioni());
		source.setTipologia(new ModelMedicoTipologiaModelMedicoTipologiaMapper().from(dest.getTipologia()));
		
		return source;
		
	}
	

}
