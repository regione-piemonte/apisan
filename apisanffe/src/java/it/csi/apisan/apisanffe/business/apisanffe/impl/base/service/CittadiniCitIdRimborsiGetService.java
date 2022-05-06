/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanffe.business.apisanffe.impl.base.service;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanffe.business.apisanffe.impl.base.FfeDelegheRESTBaseService;
import it.csi.apisan.apisanffe.business.apisanffe.mapper.DateStringMapper;
import it.csi.apisan.apisanffe.business.apisanffe.mapper.ModelListaTicketImportiMapper;
import it.csi.apisan.apisanffe.dto.apisanffe.ModelListaTicket;
import it.csi.apisan.apisanffe.util.ConstantsFfe;
import it.csi.gpr.GetListaRimborsiGPRRequest;
import it.csi.gpr.ListaRimborsiGPRResultType;
import it.csi.gpr.ProxyGPRPortType;


@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdRimborsiGetService extends FfeDelegheRESTBaseService {
	
	@Autowired
	private ProxyGPRPortType gprService;
	private String citId;
	private String dataDal;
	private String dataAl;
	private Integer statoTicket;
	private Integer inErogazione;
	private Integer modalitaRimborso;
	private String idAsr;
	private String motivoPagamento;
	private String codiceVersamento;
	private String codiceServizio;
	
	
	public CittadiniCitIdRimborsiGetService(String citId,String dataDal,String dataAl,Integer statoTicket,Integer inErogazione,Integer modalitaRimborso,String idAsr,
			String motivoPagamento,String codiceVersamento,String codiceServizio,SecurityContext securityContext, HttpHeaders httpHeaders , @Context HttpServletRequest httpRequest) {
		super(securityContext, httpHeaders, httpRequest);
		this.citId = citId;
		this.dataDal = dataDal;
		this.dataAl = dataAl;
		this.statoTicket = statoTicket;
		this.inErogazione = inErogazione;
		this.modalitaRimborso = modalitaRimborso;
		this.idAsr = idAsr;
		this.motivoPagamento = motivoPagamento;
		this.codiceVersamento = codiceVersamento;
		this.codiceServizio = codiceServizio;
		
	}

	@Override
	protected Response execute() {
		checkNotBlank(xCodiceServizio, "Valorizzare il codice servizio");
		checkNotBlank(shibIdentitaCodiceFiscale, "Valorizzare l'identita");
		
		checkNotBlank(citId, "Valorizzare il codice fiscale");
		checkUtenteAutorizzatoOrDelegato(citId);
		
		ListaRimborsiGPRResultType lista = gprService.getListaRimborsiGPR(createRequest());
		
		List<ModelListaTicket> listaTicket = new ModelListaTicketImportiMapper().fromList(lista.getLISTATICKET());
		
		return Response.ok().entity(listaTicket).build() ;
	}
	

	private GetListaRimborsiGPRRequest createRequest() {
		
		GetListaRimborsiGPRRequest request = new GetListaRimborsiGPRRequest();
		
		request.setCODICEFISCALE(citId);
		//request.setCODICESERVIZIO(getJaxbElement(ConstantFfe.NAMESPACE, "CODICE_SERVIZIO", String.class, this.xCodiceServizio));
		request.setCODICEVERSAMENTO(getJaxbElement(ConstantsFfe.NAMESPACE, "CODICE_VERSAMENTO", String.class, codiceVersamento));
		
		if(StringUtils.isNotEmpty(dataDal)) {
			Date dataDa = dateIsoFromString(dataDal, "Data dal");
			String date = new DateStringMapper(DateStringMapper.DATEDDMMYYYY).to(dataDa);
			request.setDATADAL(getJaxbElement(ConstantsFfe.NAMESPACE, "DATA_DAL", String.class, date));
		}
		if(StringUtils.isNotEmpty(dataAl)) {
			Date dataa = dateIsoFromString(dataAl, "Data al");
			String date = new DateStringMapper(DateStringMapper.DATEDDMMYYYY).to(dataa);
			request.setDATAAL(getJaxbElement(ConstantsFfe.NAMESPACE, "DATA_AL", String.class, date));
		}
		
		request.setIDASR(getJaxbElement(ConstantsFfe.NAMESPACE, "ID_ASR", String.class, this.idAsr));
		
		if(this.inErogazione != null) {
			request.setINEROGAZIONE(getJaxbElement(ConstantsFfe.NAMESPACE, "IN_EROGAZIONE", String.class, this.inErogazione.toString()));
		}
		
		if(this.modalitaRimborso != null) {
			BigInteger bigInt = BigInteger.valueOf(this.modalitaRimborso.intValue());
			request.setMODALITARIMBORSO(getJaxbElement(ConstantsFfe.NAMESPACE, "MODALITA_RIMBORSO", BigInteger.class, bigInt));
		}
		
		request.setMOTIVOPAGAMENTO(getJaxbElement(ConstantsFfe.NAMESPACE, "MOTIVO_PAGAMENTO", String.class, motivoPagamento));
		
		if(this.statoTicket != null) {
			BigInteger bigInt = BigInteger.valueOf(this.statoTicket.intValue());
			request.setSTATOTICKET(getJaxbElement(ConstantsFfe.NAMESPACE, "STATO_TICKET", BigInteger.class, bigInt));
		}
		
		request.setUUID(this.xRequestID);
		
		return request;
	}
}
