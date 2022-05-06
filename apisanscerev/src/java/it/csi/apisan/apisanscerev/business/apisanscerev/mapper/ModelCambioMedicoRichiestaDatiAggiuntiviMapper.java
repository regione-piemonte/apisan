/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.mapper;

import org.apache.commons.lang3.StringUtils;

import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelCambioMedicoRichiestaDatiAggiuntivi;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelCambioMedicoRichiestaDatiAggiuntivi.LavoroTipologiaEnum;

public class ModelCambioMedicoRichiestaDatiAggiuntiviMapper extends BaseMapper<ModelCambioMedicoRichiestaDatiAggiuntivi, it.csi.apisan.apisanscerev.dto.scerev.ModelCambioMedicoRichiestaDatiAggiuntivi> {

	@Override
	public it.csi.apisan.apisanscerev.dto.scerev.ModelCambioMedicoRichiestaDatiAggiuntivi to(
			ModelCambioMedicoRichiestaDatiAggiuntivi source) {
		if(source == null) {
			return null;
		}
		it.csi.apisan.apisanscerev.dto.scerev.ModelCambioMedicoRichiestaDatiAggiuntivi dest = new it.csi.apisan.apisanscerev.dto.scerev.ModelCambioMedicoRichiestaDatiAggiuntivi();
		dest.setAssitenzaTemporaneaDataFineValidita(source.getAssitenzaTemporaneaDataFineValidita());
		dest.setLavoroAzienda(source.getLavoroAzienda());
		dest.setLavoroAziendaCivico(source.getLavoroAziendaCivico());
		dest.setLavoroAziendaComune(source.getLavoroAziendaComune());
		dest.setLavoroAziendaIndirizzo(source.getLavoroAziendaIndirizzo());
		dest.setLavoroAziendaProvincia(source.getLavoroAziendaProvincia());
		dest.setLavoroAziendaTelefono(source.getLavoroAziendaTelefono());
		dest.setLavoroDataFineValiditaContratto(source.getLavoroDataFineValiditaContratto());
		dest.setLavoroNumeroIscrizione(source.getLavoroNumeroIscrizione());
		dest.setLavoroPartitaIva(source.getLavoroPartitaIva());
		dest.setLavoroProfessione(source.getLavoroProfessione());
		if(source.getLavoroTipologia() != null && !StringUtils.isEmpty(source.getLavoroTipologia().toString())) {
			it.csi.apisan.apisanscerev.dto.scerev.ModelCambioMedicoRichiestaDatiAggiuntivi.LavoroTipologiaEnum enumTipologia = it.csi.apisan.apisanscerev.dto.scerev.ModelCambioMedicoRichiestaDatiAggiuntivi.LavoroTipologiaEnum.valueOf(source.getLavoroTipologia().toString());
			dest.setLavoroTipologia(enumTipologia);
		}
		dest.setMotivazioneDomicilio(new ModelMotivazioneDomicilioMapper().to(source.getMotivazioneDomicilio()));
		dest.setMotivazioneSoggiorno(new ModelMotivazioneSoggiornoMapper().to(source.getMotivazioneSoggiorno()));
		dest.setNote(source.getNote());
		dest.setRicongiungimentoCodiceFiscale(source.getRicongiungimentoCodiceFiscale());
		dest.setRicongiungimentoCognome(source.getRicongiungimentoCognome());
		dest.setRicongiungimentoNome(source.getRicongiungimentoNome());
		dest.setRicongiungimentoParentela(source.getRicongiungimentoParentela());
		dest.setStudioDataTermineIscrizione(source.getStudioDataTermineIscrizione());
		dest.setStudioIstitutoCivico(source.getStudioIstitutoCivico());
		dest.setStudioIstitutoComune(source.getStudioIstitutoComune());
		dest.setStudioIstitutoIndirizzo(source.getStudioIstitutoIndirizzo());
		dest.setStudioIstitutoProvincia(source.getStudioIstitutoProvincia());
		dest.setStudioNomeIstituto(source.getStudioNomeIstituto());
		dest.setMotivazioneDomanda(source.getMotivazioneDomanda());
		return dest;
		
	}

	@Override
	public ModelCambioMedicoRichiestaDatiAggiuntivi from(
			it.csi.apisan.apisanscerev.dto.scerev.ModelCambioMedicoRichiestaDatiAggiuntivi dest) {
		if(dest == null) {
			return null;
		}
		ModelCambioMedicoRichiestaDatiAggiuntivi source = new ModelCambioMedicoRichiestaDatiAggiuntivi();
		source.setAssitenzaTemporaneaDataFineValidita(dest.getAssitenzaTemporaneaDataFineValidita());
		source.setLavoroAzienda(dest.getLavoroAzienda());
		source.setLavoroAziendaCivico(dest.getLavoroAziendaCivico());
		source.setLavoroAziendaComune(dest.getLavoroAziendaComune());
		source.setLavoroAziendaIndirizzo(dest.getLavoroAziendaIndirizzo());
		source.setLavoroAziendaProvincia(dest.getLavoroAziendaProvincia());
		source.setLavoroAziendaTelefono(dest.getLavoroAziendaTelefono());
		source.setLavoroDataFineValiditaContratto(dest.getLavoroDataFineValiditaContratto());
		source.setLavoroNumeroIscrizione(dest.getLavoroNumeroIscrizione());
		source.setLavoroPartitaIva(dest.getLavoroPartitaIva());
		source.setLavoroProfessione(dest.getLavoroProfessione());
		if(dest.getLavoroTipologia() != null && !StringUtils.isEmpty(dest.getLavoroTipologia().toString()) ) {
			LavoroTipologiaEnum enumTipologia = LavoroTipologiaEnum.valueOf(dest.getLavoroTipologia().toString());
			source.setLavoroTipologia(enumTipologia);
		}
		source.setMotivazioneDomicilio(new ModelMotivazioneDomicilioMapper().from(dest.getMotivazioneDomicilio()));
		source.setMotivazioneSoggiorno(new ModelMotivazioneSoggiornoMapper().from(dest.getMotivazioneSoggiorno()));
		source.setNote(dest.getNote());
		source.setRicongiungimentoCodiceFiscale(dest.getRicongiungimentoCodiceFiscale());
		source.setRicongiungimentoCognome(dest.getRicongiungimentoCognome());
		source.setRicongiungimentoNome(dest.getRicongiungimentoNome());
		source.setRicongiungimentoParentela(dest.getRicongiungimentoParentela());
		source.setStudioDataTermineIscrizione(dest.getStudioDataTermineIscrizione());
		source.setStudioIstitutoCivico(dest.getStudioIstitutoCivico());
		source.setStudioIstitutoComune(dest.getStudioIstitutoComune());
		source.setStudioIstitutoIndirizzo(dest.getStudioIstitutoIndirizzo());
		source.setStudioIstitutoProvincia(dest.getStudioIstitutoProvincia());
		source.setStudioNomeIstituto(dest.getStudioNomeIstituto());
		source.setMotivazioneDomanda(dest.getMotivazioneDomanda());
		return source;
		
	}

}
