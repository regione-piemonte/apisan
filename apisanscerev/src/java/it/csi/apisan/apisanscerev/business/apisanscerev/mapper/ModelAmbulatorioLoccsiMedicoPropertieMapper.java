/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.mapper;

import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelAmbulatorioLoccsiMedico;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelAsl;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelMedicoAmbito;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelMedicoDistretto;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelMedicoTipologia;
import it.csi.apisan.apisanscerev.dto.loccsi.Propertie;
import it.csi.apisan.apisanscerev.util.ScerevConstants;

public class ModelAmbulatorioLoccsiMedicoPropertieMapper extends BaseMapper<ModelAmbulatorioLoccsiMedico, Propertie> {

	@Override
	public Propertie to(ModelAmbulatorioLoccsiMedico source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAmbulatorioLoccsiMedico from(Propertie dest) {
		if(dest == null) {
			return null;
		}
		ModelAmbulatorioLoccsiMedico source = new ModelAmbulatorioLoccsiMedico();
		ModelMedicoAmbito ambito = new ModelMedicoAmbito();
		ambito.setAmbitoCodice(dest.getCodAmbitoMedico()); 
		ambito.setAmbitoDescrizione(dest.getDescAmbitoMedico());
		source.setAmbito(ambito);
		ModelAsl asl = new ModelAsl();
		asl.setId( dest.getCodAsl());
		asl.setDescrizione(dest.getDescAsl());
		source.setAsl(asl);
		ModelMedicoDistretto distretto = new ModelMedicoDistretto();
		distretto.setCodice(dest.getCodDistrettoMedico());
		distretto.setDescrizione(dest.getDescDistrettoMedico());
		source.setDistretto(distretto);
		source.setCodiceFiscale(dest.getCodiceFiscaleMedico());
		source.setCodiceRegionale(dest.getCodiceRegionaleMedico());
		source.setCognome(dest.getCognomeMedico());
		source.setNome(dest.getNomeMedico());
		source.setDataNascita(new DateTStringMapper().from(dest.getDataNascitaMedico()));
		source.setSesso(ScerevConstants.MAP_DECODIFICHE.get(dest.getSessoMedico()) );
		if(dest.getIdAuraMedico() != null) {
			source.setId(dest.getIdAuraMedico().toString());
		}
		
		//TODO verificare bene la tipologia
		if(dest.getTipologiaMedico() != null) {
			ModelMedicoTipologia tipologia = new ModelMedicoTipologia();  
			tipologia.setId(ScerevConstants.MAP_DECODIFICHE.get(dest.getTipologiaMedico()));
			tipologia.setDescrizione(ScerevConstants.MAP_DECODIFICHE.get(tipologia.getId()));
			source.setTipologia(tipologia);
		}
		
		
		source.setMail(dest.getIndirizzoEmailMedico());
		source.setAutolimitato(new BooleanStringMapper("SI", "NO").from(dest.getAutolimitato()) );
		source.setMassimale(dest.getMassimale());
		source.setMassimaleAssistenzaTemporanea(dest.getMassimaleScelteTemporanee());
		source.setMassimaleDeroga(dest.getMassimaleScelteInDeroga());
		source.setMassimaleInfanzia(dest.getMassimaleRiservatoFasciaEta());
		return source;
		
	}
	
	
}
