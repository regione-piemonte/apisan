/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.business.mapper;

import java.text.SimpleDateFormat;

import it.csi.apisan.apisanscreen.dto.apisanscreen.PayloadAppuntamentoNiovo;
import it.csi.screenserviziwebsol.CreaAppuntamentoWEBInParametersType;
import it.csi.screenserviziwebsol.TipoScreenType;

public class PayloadAppuntamentoNiovoCreaAppuntamentoWEBInParametersTypeMapper extends BaseMapper<PayloadAppuntamentoNiovo, CreaAppuntamentoWEBInParametersType> {
	private SimpleDateFormat sd = new SimpleDateFormat("ddMMyyyy"); 
	
	@Override
	public CreaAppuntamentoWEBInParametersType to(PayloadAppuntamentoNiovo source) {
		if(source == null) {
			return null;
		}
		CreaAppuntamentoWEBInParametersType dest = new CreaAppuntamentoWEBInParametersType();
		dest.setITIPOSCREENING(TipoScreenType.fromValue(source.getTipologiaCodice()));
		dest.setICODAGENDA(source.getAgendaCodice());
		dest.setICODAZIENDA(source.getAslCodice());
		dest.setICODDIPARTIMENTO(source.getDipartimentoCodice());
		dest.setICODUNPR(source.getUnitaOperativaCodice());
		dest.setIDATAAPPUNTAMENTO(sd.format(source.getData()));
		dest.setIORAAPPUNTAMENTO(source.getOra().replace(":", ""));
		dest.setIORAFINEATTIVITA(source.getOraFine().replace(":", ""));
		dest.setIORAINIZIOATTIVITA(source.getOraInizio().replace(":", ""));
		dest.setIORASLOTAPPUNTAMENTO(source.getOraSlot().replace(":", ""));
		//dest.setIPROGRESSIVOAPP(Integer.parseInt(source.getProgressivo()));
		dest.setIPROGRESSIVOAPP(0);
		dest.setIINSMOD("ins");
		return dest;
	}

	@Override
	public PayloadAppuntamentoNiovo from(CreaAppuntamentoWEBInParametersType dest) {
		// TODO Auto-generated method stub
		return null;
	}

}
