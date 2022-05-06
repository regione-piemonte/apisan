/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.business.mapper;



import org.apache.commons.lang3.StringUtils;

import it.csi.apisan.apisanscreen.dto.apisanscreen.ModelCittadino;
import it.csi.apisan.apisanscreen.dto.apisanscreen.ModelCittadino.CodiceInternoPrefissoEnum;
import it.csi.screenserviziwebsol.ScrAna01OutParametersType;

public class ModelCittadinoScrAna01OutParametersTypeMapper extends BaseMapper<ModelCittadino, ScrAna01OutParametersType> {

	@Override
	public ScrAna01OutParametersType to(ModelCittadino source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelCittadino from(ScrAna01OutParametersType dest) {
		if(dest == null) {
			return null;
		}
		ModelCittadino source = new ModelCittadino();
		source.setCap(dest.getPCapRes());
		source.setCapAlternativo(dest.getPCapAlt());
		source.setCivico(dest.getPNumCivRes());
		source.setCivicoAlternativo(dest.getPNumCivAlt());
		source.setCodiceInterno(dest.getPCodInterno());
		if(dest.getPPrefInterno() != null && !StringUtils.isEmpty(dest.getPPrefInterno())) {
			CodiceInternoPrefissoEnum enumPref = CodiceInternoPrefissoEnum.valueOf(dest.getPPrefInterno());
			source.setCodiceInternoPrefisso(enumPref);
		}
		source.setCognome(dest.getPCognome());
		source.setComune(dest.getPComuneRes());
		source.setComuneAlternativo(dest.getPComuneAlt());
		source.setDataNascita(new DateStringMapper().from(dest.getPDataNascita()));
		source.setEmail(dest.getPEMail());
		source.setIndirizzo(dest.getPIndirizzoRes());
		source.setIndirizzoAlternativo(dest.getPIndirizzoAlt());
		source.setNome(dest.getPNome());
		source.setProvincia(dest.getPProvinciaRes());
		source.setProvinciaAlternativo(dest.getPProvinciaAlt());
		source.setStatoCodice(dest.getPStato());
		source.setTelefono1(dest.getPTelefono1());
		source.setTelefono1Locale(dest.getPTelefonoLocale1());
		source.setTelefono2(dest.getPTelefono2());
		source.setTelefono2Locale(dest.getPTelefonolocale2());
		source.setTesseraSanitaria(dest.getPTessSanitaria());
		return source;
	}

}
