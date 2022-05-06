/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.business.mapper;

import java.text.SimpleDateFormat;

import it.csi.apisan.apisanscreen.dto.apisanscreen.PayloadAppuntamentoModifica;
import it.csi.screenserviziwebsol.CreaAppuntamentoWEBInParametersType;

public class PayloadAppuntamentoModificaCreaAppuntamentoWEBInParametersTypeMapper extends BaseMapper<PayloadAppuntamentoModifica, CreaAppuntamentoWEBInParametersType> {
	
	SimpleDateFormat sd = new SimpleDateFormat("ddMMyyyy"); 
	
	
	@Override
	public CreaAppuntamentoWEBInParametersType to(PayloadAppuntamentoModifica source) {
		if(source == null) {
			return null;
		}
		CreaAppuntamentoWEBInParametersType dest = new CreaAppuntamentoWEBInParametersType();
		dest.setICODAGENDA(source.getAgendaCodice());
		dest.setICODAZIENDA(source.getAslCodice());
		dest.setICODDIPARTIMENTO(source.getDipartimentoCodice());
		dest.setICODUNPR(source.getUnitaOperativaCodice());
		dest.setIDATAAPPUNTAMENTO(sd.format(source.getData()));
		//dest.setIINSMOD(source.get);
		dest.setIORAAPPUNTAMENTO(source.getOra().replace(":", ""));
		dest.setIORAFINEATTIVITA(source.getOraFine().replace(":", ""));
		dest.setIORAINIZIOATTIVITA(source.getOraInizio().replace(":", ""));
		dest.setIORASLOTAPPUNTAMENTO(source.getOraSlot().replace(":", ""));
		dest.setIPROGRESSIVOAPP(Integer.parseInt(source.getProgressivo()));
		dest.setIINSMOD("");
		return dest;
	}

	@Override
	public PayloadAppuntamentoModifica from(CreaAppuntamentoWEBInParametersType dest) {
		// TODO Auto-generated method stub
		return null;
	}

}
