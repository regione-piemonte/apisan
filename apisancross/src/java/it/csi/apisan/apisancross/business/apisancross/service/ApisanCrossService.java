/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancross.business.apisancross.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import javax.annotation.PostConstruct;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import it.csi.apisan.apisancross.business.apisancross.impl.mock.MockComuniJSON;
import it.csi.apisan.apisancross.business.apisancross.impl.mock.MockNazioni;
import it.csi.apisan.apisancross.business.apisancross.impl.mock.MockProvince;
import it.csi.apisan.apisancross.business.apisancross.impl.mock.MockRegioni;
import it.csi.apisan.apisancross.business.apisancross.impl.mock.MockServizi;
import it.csi.apisan.apisancross.dto.apisancross.Comune;
import it.csi.apisan.apisancross.dto.apisancross.Nazione;
import it.csi.apisan.apisancross.dto.apisancross.Provincia;
import it.csi.apisan.apisancross.dto.apisancross.Regione;
import it.csi.apisan.apisancross.dto.apisancross.Servizio;
import it.csi.apisan.apisancross.util.LogUtil;
import it.csi.apisan.apisancross.util.filter.Clause;
import it.csi.apisan.apisancross.util.filter.Filter;
import it.csi.apisan.apisancross.util.filter.Literal;
import it.csi.apisan.apisancross.util.filter.Operator;

@Component
public class ApisanCrossService {
	protected LogUtil log = new LogUtil(this.getClass());
	
	List<Comune> comuni; 
	List<Nazione> nazioni; 
	List<Provincia> province; 
	List<Servizio> servizi;
	List<Regione> regioni;
	
	
	@PostConstruct
	public void costruisciLista() {
		log.debug("costruisciLista", "*********************** ApisanCrossService - costruisciLista Mock *********************");
		comuni = MockComuniJSON.getInstance().getComuni();
		nazioni = MockNazioni.getInstance().getNazioni();
		province = MockProvince.getInstance().getProvince();
		servizi = MockServizi.getInstance().getServizi();
		regioni = MockRegioni.getInstance().getRegioni();
	}
	
	
	public List<Provincia> getListaProvince(String filter){
		log.debug("getListaProvince", "invoked");
		List<Provincia> listaProvinceRit = new ArrayList<Provincia>();  
		if(StringUtils.isBlank(filter)) {
			listaProvinceRit = province;
		}else{
			try {
				Filter filtro = new Filter(filter);
				//gestisco per ora solo la ricerca per cod_istat_comune 
				Clause clause = filtro.getClause("codice");
				Literal literal = clause.getLiteral(Operator.EQ);
				String codice = (String) literal.getValue();
				
				for(Iterator<Provincia> iter = province.iterator(); iter.hasNext();) {
					Provincia pro = iter.next();
					if(pro.getCodiceIstat().equals(codice)) {
						listaProvinceRit.add(pro);
					}
				}
				
			} catch(IllegalArgumentException e) {
				listaProvinceRit = province;
			}catch(NoSuchElementException e) {
				listaProvinceRit = province;
			}
		}
		return listaProvinceRit;
	}
	

	 
	 public List<Servizio> getListaServizi(String filter){
		 List<Servizio> serviziRit = new ArrayList<>();
		 if(StringUtils.isBlank(filter)) {
			 serviziRit = servizi;
		 }else {
			 try {
				 Filter filtro = new Filter(filter);
			 //gestisco per ora solo la ricerca per codice_servizio
				 Clause clause = filtro.getClause("codice_servizio");
				 Literal literal = clause.getLiteral(Operator.EQ);
				 String codice = (String) literal.getValue();

				 for(Iterator<Servizio> iter = servizi.iterator(); iter.hasNext(); ) {
					 Servizio serTmp = iter.next();
					 if(serTmp.getCodiceServizio().equalsIgnoreCase(codice)) {
						 serviziRit.add(serTmp); 
					 }				 
				 }				 

			 } catch (IllegalArgumentException e) {
				 // TODO Auto-generated catch block
				 serviziRit = servizi;
			 } catch(NoSuchElementException e) {
				 serviziRit = servizi;
			 } 
		 }

		 return serviziRit;
	 }
}
