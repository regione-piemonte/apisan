/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import org.springframework.beans.BeanUtils;

import it.csi.apisan.apisanfse.dto.apisanfse.ModelOscuramento;
import it.csi.apisan.apisanfse.integration.oscuramento.dma.Codifica;
import it.csi.apisan.apisanfse.integration.oscuramento.dma.ConsensoMatriceTipoDato;
import it.csi.apisan.apisanfse.integration.oscuramento.dma.Oscuramento;
import it.csi.apisan.apisanfse.util.CostantiOscuramento;
import it.csi.apisan.apisanfse.util.TipoOscuramento;

public class ModelOscuramentoOscuramentoMapper extends BaseMapper<ModelOscuramento, Oscuramento> {

	@Override
	public Oscuramento to(ModelOscuramento source) {
		if(source == null) {
			return null;
		}
		Oscuramento dest = new Oscuramento();
		dest.setFonteOscuramento(CostantiOscuramento.FONTE_OSCURAMENTO);
		TipoOscuramento tipoOscuramento = TipoOscuramento.valueOf(source.getTipoDiDato().getCodice());

		switch(tipoOscuramento) {
		case DOC:
			dest.setId1(source.getIdDocumento());
			dest.setId2(source.getCodiceCl());
		
			break;
		case DOCPER:
			dest.setId1(source.getIdDocumento());
			break;
		case ESE:
			
			break;
		case SCR:
			dest.setId1(source.getTipoScreening());
			dest.setId2(new DateTStringMapper("dd/MM/yyyy").to(source.getDataEsame()) ); //Veronica sta capendo dove deve andare la data

			dest.setId3(source.getTipoEsame());
			break;
		default:
			break;
			
		}
		Codifica tipo = new Codifica();
		BeanUtils.copyProperties(source.getTipoDiDato(), tipo);

		dest.setTipoDiDato(new ModelTipoDatoConsensoMatriceTipoDatoMapper().to(source.getTipoDiDato()));
		dest.setOscurato(new BooleanSiNoOscuramentoMapper().to(source.isOscurato()));

		return dest;
	}

	@Override
	public ModelOscuramento from(Oscuramento dest) {
		// TODO Auto-generated method stub
		return null;
	}

}
