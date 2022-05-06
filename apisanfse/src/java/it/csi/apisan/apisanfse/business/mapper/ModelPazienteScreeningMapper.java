/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import java.util.stream.Collectors;

import it.csi.apisan.apisanfse.dto.apisanfse.ModelPaziente;
import it.csi.apisan.apisanfse.integration.screening.dma.PazienteScreening;

public class ModelPazienteScreeningMapper  extends BaseMapper<ModelPaziente, PazienteScreening>{

	@Override
	public PazienteScreening to(ModelPaziente source) {
		if(source == null) {
			return null;
		}
		PazienteScreening pazienteScreening = new PazienteScreening();	
		pazienteScreening.setIdScreening(source.getIdScreening());
		pazienteScreening.setCodiceFiscale(source.getCodiceFiscale());
		pazienteScreening.setCodiceFiscaleMMG(source.getCodiceFiscaleMMG());
		pazienteScreening.setCognome(source.getCognome());
		pazienteScreening.setComuneDiNascita(new ComuneDiNascitaScreeningMapper().to(source.getComuneDiNascita()));
		pazienteScreening.setConsenso(new ModelConsensoScreeningMapper().to(source.getConsenso()));		    
		pazienteScreening.setDataDecesso(new DateXMLGregorianCalendarMapper().to(source.getDataDecesso()));		    
		pazienteScreening.setDataDiNascita(new DateXMLGregorianCalendarMapper().to(source.getDataNascita()));		    
		pazienteScreening.setDataRiconduzione(new DateXMLGregorianCalendarMapper().to(source.getDataRiconduzione()));		    
		pazienteScreening.setFlagRegistryIncarico(source.getFlagRegistryIncarico());
		//TODO BIgDEcimal Long
		pazienteScreening.setIdAsr(new BigDecimalLongMapper().to(source.getIdAsr()));
		pazienteScreening.setIdAura(new BigDecimalLongMapper().to(source.getIdAura()));
		pazienteScreening.setIdIlec(new BigDecimalLongMapper().to(source.getIdIlec()));
		pazienteScreening.setIdIrec(new BigDecimalLongMapper().to(source.getIdIrec()));
		pazienteScreening.setIdPazienteRicondotto(new BigDecimalLongMapper().to(source.getIdPazienteRicondotto()));
		//TODO enum si no boolean
		
		pazienteScreening.setMailPerAccessoDMA(new BooleanSiNoScreeningMapper().to(source.isMailPerAccessoDMA()));
		
		pazienteScreening.setNome(source.getNome());
		pazienteScreening.setSesso(new SessoEnumSessoScreeningMapper().to(source.getSesso()));			
		pazienteScreening.setStatoDiNascita(new StatoDiNascitaScreeningMapper().to(source.getStatoDiNascita()));
		
		return pazienteScreening;
	}

	@Override
	public ModelPaziente from(PazienteScreening dest) {
		if(dest == null) {
			return null;
		}
		ModelPaziente modelPazienteScreening = new ModelPaziente();
		modelPazienteScreening.setIdScreening(dest.getIdScreening());
		modelPazienteScreening.setCodiceFiscale(dest.getCodiceFiscale());
		modelPazienteScreening.setCodiceFiscaleMMG(dest.getCodiceFiscaleMMG());
		modelPazienteScreening.setCognome(dest.getCognome());
		modelPazienteScreening.setComuneDiNascita(new ComuneDiNascitaScreeningMapper().from(dest.getComuneDiNascita()));
		modelPazienteScreening.setConsenso(new ModelConsensoScreeningMapper().from(dest.getConsenso()));
		modelPazienteScreening.setDataDecesso(new DateXMLGregorianCalendarMapper().from(dest.getDataDecesso()));
		modelPazienteScreening.setDataNascita(new DateXMLGregorianCalendarMapper().from(dest.getDataDiNascita()));
		modelPazienteScreening.setDataRiconduzione(new DateXMLGregorianCalendarMapper().from(dest.getDataRiconduzione()));
		if(dest.getDeleghe()!=null) {
			modelPazienteScreening.setDeleghe(dest.getDeleghe().stream().map(s -> {
				it.csi.apisan.apisanfse.dto.apisanfse.ModelDelega delega = new it.csi.apisan.apisanfse.dto.apisanfse.ModelDelega();
				delega.setGradoDelega(s.getGradoDelega());
				delega.setTipoDelega(s.getTipoDelega());
				return delega;			
			}).collect(Collectors.toList()));
		}
		modelPazienteScreening.setFlagRegistryIncarico(dest.getFlagRegistryIncarico());
		modelPazienteScreening.setIdAsr(new BigDecimalLongMapper().from(dest.getIdAsr()));
		modelPazienteScreening.setIdAura(new BigDecimalLongMapper().from(dest.getIdAura()));
		modelPazienteScreening.setIdIlec(new BigDecimalLongMapper().from(dest.getIdIlec()));
		modelPazienteScreening.setIdIrec(new BigDecimalLongMapper().from(dest.getIdIrec()));
		modelPazienteScreening.setIdPazienteRicondotto(new BigDecimalLongMapper().from(dest.getIdPazienteRicondotto()));
		modelPazienteScreening.setMailPerAccessoDMA(new BooleanSiNoScreeningMapper().from(dest.getMailPerAccessoDMA()));
		modelPazienteScreening.setNome(dest.getNome());
		modelPazienteScreening.setSesso(new SessoEnumSessoScreeningMapper().from(dest.getSesso()));
		modelPazienteScreening.setStatoDiNascita(new StatoDiNascitaScreeningMapper().from(dest.getStatoDiNascita()));
		return modelPazienteScreening;
	}

}
