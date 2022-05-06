/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import org.springframework.beans.BeanUtils;

import it.csi.apisan.apisanfse.dto.apisanfse.Codifica;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelInformazioniSistemiScreening;
import it.csi.apisan.apisanfse.integration.screening.dma.InformazioniSistemiScreening;

public class ModelInformazioniSistemiScreeningInformazioniSistemiScreeningMapper extends BaseMapper<ModelInformazioniSistemiScreening, InformazioniSistemiScreening> {

	@Override
	public InformazioniSistemiScreening to(ModelInformazioniSistemiScreening source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelInformazioniSistemiScreening from(InformazioniSistemiScreening dest) {
		if(dest == null) {
			return null;
		}
		ModelInformazioniSistemiScreening source = new ModelInformazioniSistemiScreening();
		source.setEsami(new ModelEsameScreeningMapper().fromList(dest.getEsami()));
		source.setPaziente(new ModelPazienteScreeningMapper().from(dest.getPaziente()));
		Codifica tipo = new Codifica();
        BeanUtils.copyProperties(dest.getTipo(), tipo);
		source.setTipo(tipo);
		return source;
		
	}

}
