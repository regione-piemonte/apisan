/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import org.springframework.beans.BeanUtils;

import it.csi.apisan.apisanfse.dto.apisanfse.ModelPaziente;
import it.csi.apisan.apisanfse.integration.oscuramento.dma.ComuneDiNascita;
import it.csi.apisan.apisanfse.integration.oscuramento.dma.Paziente;

public class ModelPazientePazienteMapper extends BaseMapper<ModelPaziente, Paziente>{

	@Override
	public Paziente to(ModelPaziente source) {
		
		if(source == null) {
			return null;
		}
		
		//TODO verificare campi
		Paziente paziente = new Paziente();
		paziente.setCodiceFiscale(source.getCodiceFiscale());
		paziente.setCodiceFiscaleMMG(source.getCodiceFiscaleMMG());
		paziente.setCognome(source.getCognome());
		ComuneDiNascita comuneDiNascita = new ComuneDiNascita();
		BeanUtils.copyProperties(source.getComuneDiNascita(), comuneDiNascita);
		paziente.setComuneDiNascita(comuneDiNascita);
		paziente.setConsenso(new ModelConsensoScreeningConsensoMapper().to(source.getConsenso()));
		paziente.setDataDecesso(new DateXMLGregorianCalendarMapper().to(source.getDataDecesso()));
		paziente.setDataDiNascita(new DateXMLGregorianCalendarMapper().to(source.getDataNascita()));
		paziente.setDataRiconduzione(new DateXMLGregorianCalendarMapper().to(source.getDataRiconduzione()));
		//paziente.setDeleghe(source.getPaziente().getDeleghe());
		paziente.setFlagRegistryIncarico(source.getFlagRegistryIncarico());
		paziente.setIdAsr(new BigDecimalLongMapper().to(source.getIdAsr()));
		paziente.setIdAura(new BigDecimalLongMapper().to(source.getIdAura()));
		paziente.setIdIlec(new BigDecimalLongMapper().to(source.getIdIlec()));
		paziente.setIdIrec( new BigDecimalLongMapper().to(source.getIdIrec()));
		paziente.setIdPazienteRicondotto(new BigDecimalLongMapper().to(source.getIdPazienteRicondotto()));
		paziente.setMailPerAccessoDMA(new BooleanSiNoOscuramentoMapper().to(source.isMailPerAccessoDMA()));
		paziente.setNome(source.getNome());
		paziente.setSesso(new SessoEnumSessoOscuramentoMapper().to(source.getSesso()));		
		paziente.setStatoDiNascita(new StatoDiNascitaOscuramentoMapper().to(source.getStatoDiNascita()));
		
		
		return paziente;
	}

	@Override
	public ModelPaziente from(Paziente dest) {
		// TODO Auto-generated method stub
		return null;
	}

}
