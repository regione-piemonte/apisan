/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package test;

import java.util.ArrayList;
import java.util.List;

import it.csi.apisan.apisanscreen.dto.apisanscreen.GeoJsonPoint;
import it.csi.apisan.apisanscreen.dto.apisanscreen.ModelOperazione;
import it.csi.apisan.apisanscreen.dto.apisanscreen.ModelOperazioniAppuntamento;
import it.csi.apisan.apisanscreen.dto.apisanscreen.GeoJsonPoint.TypeEnum;
import it.csi.apisan.apisanscreen.dto.apisanscreen.ModelCittadinoSesso.CodiceInternoPrefissoEnum;

public class TestApisanscreen {

	public TestApisanscreen() {
		// TODO Auto-generated constructor stub
	}

	private static ModelOperazioniAppuntamento creaModelOperazione(boolean isVisualizzabile, boolean isModificabile, boolean isPrenotabile ) {
		ModelOperazioniAppuntamento modelOperazioni = new ModelOperazioniAppuntamento();
	
		
		modelOperazioni.setModificabile(isModificabile);
		modelOperazioni.setPrenotabile(isPrenotabile);
		modelOperazioni.setVisualizzabile(isVisualizzabile);
		
		return modelOperazioni;
	}
	
	public static void main(String[] args) {
		
		
		List<Integer> listaErroriDaNonMappare = new ArrayList<Integer>();
		listaErroriDaNonMappare.add(2115);
		listaErroriDaNonMappare.add(2116);
		listaErroriDaNonMappare.add(2117);
		listaErroriDaNonMappare.add(2118);
		listaErroriDaNonMappare.add(2119);
		listaErroriDaNonMappare.add(2120);
		listaErroriDaNonMappare.add(2121);
		listaErroriDaNonMappare.add(2122);
		
		boolean mappato =  listaErroriDaNonMappare.stream().anyMatch(c -> c.intValue() == 2112);
		
		System.out.println("Mappato: " + mappato);
		
		ModelOperazioniAppuntamento operazioni = creaModelOperazione(true, false, false);
		operazioni.setMessaggio("messaggio");
		
		System.out.println("operazione visualizzabile: " + operazioni.getMessaggio());
		
		
		String point = "Point";
		GeoJsonPoint pointGeo = new GeoJsonPoint();
		pointGeo.setType(TypeEnum.POINT);
		
		TypeEnum typeEn = TypeEnum.valueOf("POINT");
		System.out.println("typeEn: " + typeEn);
		
		for(TypeEnum en : TypeEnum.values()) {
			System.out.println("values: " + en.toString());
		}
		
		CodiceInternoPrefissoEnum encd = CodiceInternoPrefissoEnum.valueOf("S");
		System.out.println("encd: " + encd);
		
		//pointGeo.setType(TypeEnum.valueOf(point));
		System.out.println("poingeo: " + pointGeo.getType().toString());

	}

}
