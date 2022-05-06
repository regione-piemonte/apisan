/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfarm.business.apisanfarm.impl.base.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.SecurityContext;
import javax.xml.ws.Holder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanfarm.business.apisanfarm.impl.base.FarmRESTBaseService;
import it.csi.apisan.apisanfarm.business.apisanfarm.mapper.DateTStringMapper;
import it.csi.apisan.apisanfarm.business.apisanfarm.mapper.ModelFarmaciaFarmaciaSetMapper;
import it.csi.apisan.apisanfarm.business.integration.dao.ApisanFarmDErroreDao;
import it.csi.apisan.apisanfarm.dto.apisanfarm.EnumAzioneFarmaciaAbituale;
import it.csi.apisan.apisanfarm.dto.apisanfarm.ErroreDettaglio;
import it.csi.apisan.apisanfarm.dto.apisanfarm.ModelFarmacia;
import it.csi.apisan.apisanfarm.dto.apisanfarm.PayloadFarmaciaAbituale;
import it.csi.apisan.apisanfarm.exception.ErroreBuilder;
import it.csi.apisan.apisanfarm.exception.ErroreRESTException;
import it.csi.apisan.apisanfarm.util.ConstantsFarm;
import it.csi.dma.farmab.interfacews.msg.setfarmaciaabituale.ElencoErroriType;
import it.csi.dma.farmab.interfacews.msg.setfarmaciaabituale.Errore;
import it.csi.dma.farmab.interfacews.msg.setfarmaciaabituale.Farmacia;
import it.csi.dma.farmab.interfacews.msg.setfarmaciaabituale.Richiedente;
import it.csi.dma.farmab.interfacews.msg.setfarmaciaabituale.SetFarmaciaAbitualeService;
import it.csi.dma.farmab.interfacews.msg.setfarmaciaabituale.TipoCodice;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdFarmacieAbitualiPostService extends FarmRESTBaseService {
	
	private String citId;
	private String codiceVerticaleDelega;
	private PayloadFarmaciaAbituale payloadFarmaciaAbituale;
	
	@Autowired
	private SetFarmaciaAbitualeService service;
	
	@Autowired
	ApisanFarmDErroreDao erroreDao;
	
	public CittadiniCitIdFarmacieAbitualiPostService(String citId, String codiceVerticaleDelega,
			PayloadFarmaciaAbituale payloadFarmaciaAbituale, SecurityContext securityContext, HttpHeaders httpHeaders,
			HttpServletRequest httpRequest) {
		super(securityContext, httpHeaders, httpRequest);
		this.citId = citId;
		this.codiceVerticaleDelega = codiceVerticaleDelega;
		this.payloadFarmaciaAbituale = payloadFarmaciaAbituale;		
	}

	@Override
	protected Response execute() {
		checkNotBlank(xRequestID, "Impostare xrequest id");
		checkNotBlank(xForwardedFor, "Impostare forwarded for");
		checkNotBlank(citId, "Impostare citId");
		checkNotBlank(codiceVerticaleDelega, "Impostare codice verticale delega");
		checkNotNull(payloadFarmaciaAbituale, "Impostare il payload");
		checkPayload();
		
		String dataInizio =  new DateTStringMapper(DateTStringMapper.FORMATOyyyyMMddHHmmss).to(payloadFarmaciaAbituale.getDataValiditaInizio());
		String dataFine =  new DateTStringMapper(DateTStringMapper.FORMATOyyyyMMddHHmmss).to(payloadFarmaciaAbituale.getDataValiditaFine());
		Holder<String> esito = new Holder<String>();
		Holder<ElencoErroriType> elencoErrori = new Holder<ElencoErroriType>();
		Holder<Farmacia> farmacia = new Holder<Farmacia>();
		
		service.setFarmaciaAbituale(createnewRichiedente(), citId, payloadFarmaciaAbituale.getAzione().toString(), payloadFarmaciaAbituale.getFarmaciaAbitualeId(), 
				payloadFarmaciaAbituale.getFarmaciaCodice(), dataInizio, dataFine, esito, elencoErrori, farmacia);
		
		checkSuccesso(esito, elencoErrori, this.getClass());
		
		if(EnumAzioneFarmaciaAbituale.R.equals(payloadFarmaciaAbituale.getAzione())){
			return Response.ok().build();
		}else if(farmacia != null && farmacia.value != null ) {
			ModelFarmacia farmaciaResp = new ModelFarmaciaFarmaciaSetMapper().from(farmacia.value); 
			return Response.ok().entity(farmaciaResp).build();
			
		}else {
			throw ErroreBuilder.from(502, "CittadiniCitIdFarmacieAbitualiPostService").exception();
		}

	}
	
	private void checkPayload() {
		checkNotNull(payloadFarmaciaAbituale.getAzione(), "Impostare azione");
		checkAzione(payloadFarmaciaAbituale.getAzione()); 

		if(payloadFarmaciaAbituale.getDataValiditaInizio() != null && payloadFarmaciaAbituale.getDataValiditaFine() != null) {
			checkCondition((payloadFarmaciaAbituale.getDataValiditaFine().after(payloadFarmaciaAbituale.getDataValiditaInizio())), ErroreBuilder.from(Status.BAD_REQUEST).dettaglio("PARAMETRO", "Data fine minore della data inizio").exception());
		}
	
	}
	
	private void checkAzione(EnumAzioneFarmaciaAbituale azione) {
		switch (azione) {
			case C:
				checkNotNull(payloadFarmaciaAbituale.getDataValiditaInizio(), "Valorizzare la daat di inizio validita");
				checkNotNull(payloadFarmaciaAbituale.getFarmaciaCodice(), "Valorizzare il codice della farmacia");
				checkNotNull(payloadFarmaciaAbituale.getDataValiditaFine(), "Impostare la data fine validita");
				break;
			case M:
				checkNotNull(payloadFarmaciaAbituale.getFarmaciaAbitualeId(), "Valorizzare l'id della farmacia");
				checkNotNull(payloadFarmaciaAbituale.getDataValiditaFine(), "Valorizzare la data di fine validita");
				break;
			case R:
				checkNotNull(payloadFarmaciaAbituale.getFarmaciaCodice(), "Valorizzare il codice della farmacia");
			break;
		}
			
	}
	
	private void checkDate(Date data) {
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateTStringMapper.FORMATOyyyyMMddHHmmss, Locale.ITALIAN);
		simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
		//Date myDate=simpleDateFormat.parse(data);
		String date = new DateTStringMapper(DateTStringMapper.FORMATOyyyyMMddHHmmss).to(payloadFarmaciaAbituale.getDataValiditaInizio());
		String dateFormat = simpleDateFormat.format(data) ;
		
		log.debug("checkDate", " Convertita in simpleDateFormat: "+ dateFormat + " mapper: " + date);
		
		
		
		/*String doppiaConversione=simpleDateFormat.format(myDate);
		if(data.equalsIgnoreCase(doppiaConversione))
		ret= true;*/
	}
	
	protected 	Richiedente createnewRichiedente() {
		Richiedente rich = new Richiedente();
		TipoCodice appVerticale = new TipoCodice();
		appVerticale.setCodice(codiceVerticaleDelega);
		rich.setApplicativoVerticale(appVerticale);
		
		TipoCodice applicazione = new TipoCodice();
		applicazione.setCodice(xCodiceServizio);
		rich.setApplicazione(applicazione);
		
		rich.setCodiceFiscale(shibIdentitaCodiceFiscale);
		rich.setIp(xForwardedFor);
		rich.setNumeroTransazione(xRequestID);
		TipoCodice ruolo = new TipoCodice();		
		ruolo.setCodice(ConstantsFarm.RUOLO);
		rich.setRuolo(ruolo);
		
		return rich;
	}
	
	
	protected void checkSuccesso(Holder<String> esito, Holder<ElencoErroriType> errori, Class<?> methodName) {
		
		
		if (!ConstantsFarm.SUCCESSO.equals(esito.value) ) {
			ElencoErroriType elencoErrori = errori.value;
			if (elencoErrori != null && elencoErrori.getErrore() != null && elencoErrori.getErrore().size() > 0) {
				log.error(methodName.getName(), "Risposta dal servizio %s andata in errore con codice $s. Errore: %s",
						methodName);
				List<ErroreDettaglio> listaDettagli = elencoErrori.getErrore().stream().map( err -> {
					ErroreDettaglio d = new ErroreDettaglio();
					d.setChiave(err.getCodice());
					d.setValore(err.getDescrizione());
					return d;
				}).collect(Collectors.toList()) ;
				
				 it.csi.apisan.apisanfarm.dto.apisanfarm.Errore errorePres =  erroreDao.getMappingErrore(listaDettagli);
				 throw new ErroreRESTException(errorePres);
			}else {
				throw ErroreBuilder.from(502, methodName.getName()).exception();
			}
		}
	}
	
	


	protected ErroreRESTException toErroreRESTException(ElencoErroriType elencoErrori) {
		String title = "Errore esecuzione servizio " + this.getClass().getSimpleName();
		List<Errore> errori = elencoErrori.getErrore();
		
		
		return ErroreBuilder.from(502, errori.get(0).getCodice()).title(title).dettagli(errori, elEr -> {
			ErroreDettaglio d = new ErroreDettaglio();
			d.setChiave(elEr.getCodice());
			d.setValore(elEr.getDescrizione());
			return d;
		}).exception(errori.get(0).getDescrizione());
		

		
	}
}
