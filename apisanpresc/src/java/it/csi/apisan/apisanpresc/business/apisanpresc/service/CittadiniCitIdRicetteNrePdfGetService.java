/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.business.apisanpresc.service;

import it.csi.apisan.apisanpresc.business.apisanpresc.service.common.PrescDelegheRESTBaseService;
import it.csi.apisan.apisanpresc.business.apisanpresc.service.stampapdf.StampaPDFRicetteReqInvocation;
import it.csi.apisan.apisanpresc.common.ApiSanPrescConstants;
import it.csi.apisan.apisanpresc.dto.apisanpresc.FiltroRicetta;
import it.csi.apisan.apisanpresc.exception.RESTException;
import it.csi.apisan.apisanpresc.util.ApisanPrescStatus;
import it.csi.apisan.apisanpresc.util.LogUtil;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import java.io.IOException;
import java.util.Date;

//import it.csi.apisan.apisanaut.dto.apisanaut.DelegaFilter;
//import it.csi.apisan.apisanaut.util.filter.FilterUtil;


// servizio stampa pdf ricetta
@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdRicetteNrePdfGetService extends PrescDelegheRESTBaseService {

    private String _filter;
    private String _ipRequest;
    private String _xCodiceServizio;
    private String _shibIdentitaCodiceFiscale;
    private String _xRequestID;
    private String _nre;
    private String _cf;

    LogUtil _log = new LogUtil(this.getClass());

    public CittadiniCitIdRicetteNrePdfGetService(String shibIdentitaCodiceFiscale, String xCodiceServizio,
                                                 String xRequestID, String xForwardedFor, String cf, String nre, String filter, SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request) {
        super(shibIdentitaCodiceFiscale, xRequestID, xCodiceServizio, securityContext, httpHeaders, request);

        this._cf                        = cf;
        this._nre                       = nre;
        this._filter                    = filter;
        this._shibIdentitaCodiceFiscale = shibIdentitaCodiceFiscale;
        this._xCodiceServizio           = xCodiceServizio;
        this._xRequestID                = xRequestID;
    }


    @Override
    protected Response execute() {
        _log.info("execute", "CittadiniCitIdRicetteNrePdfGetService start...");
        StampaPDFRicetteService       stampaPDFRicetteService = new StampaPDFRicetteService();
        StampaPDFRicetteReqInvocation reqContainer            = new StampaPDFRicetteReqInvocation();
        FiltroRicetta                 filtroRicetta           = null;
        Boolean                       isRegionale             = null;
        String                        tipologia               = null;
        Date                          dataInizio              = null;
        Date                          dataFine                = null;

        try {
            ObjectMapper mapper = new ObjectMapper();
            checkNotNull(_filter, new RESTException(ApisanPrescStatus.PARAMETRO_NON_PRESENTE.getStatusCode(), MediaType.APPLICATION_JSON_TYPE, null, ApisanPrescStatus.PARAMETRO_NON_PRESENTE.getMessage("_filter")));
            checkNotBlank(_filter, new RESTException(ApisanPrescStatus.PARAMETRO_NON_VALIDO.getStatusCode(), MediaType.APPLICATION_JSON_TYPE, null, ApisanPrescStatus.PARAMETRO_NON_VALIDO.getMessage("_filter")));
            filtroRicetta = mapper.readValue(_filter, FiltroRicetta.class);

            isRegionale = filtroRicetta.getRegionale() != null ? filtroRicetta.getRegionale().isEq() : null;
            tipologia   = filtroRicetta.getTipologia() != null && filtroRicetta.getTipologia().getEq() != null ? filtroRicetta.getTipologia().getEq().toString() : null;
            dataInizio  = filtroRicetta.getDataCompilazione() != null ? filtroRicetta.getDataCompilazione().getGte() : null;
            dataFine    = filtroRicetta.getDataCompilazione() != null ? filtroRicetta.getDataCompilazione().getLte() : null;


            checkNotNull(xRequestID, new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "xRequestID non valorizzata"));
            checkNotBlank(_cf, new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "citId non valorizzata"));
            checkNotNull(_filter, new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "Filter non valorizzato"));
            checkNotNull(filtroRicetta.getRegionale() != null && filtroRicetta.getRegionale().isEq() != null ? filtroRicetta.getRegionale().isEq() : null, new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "Filter regionale non valorizzato"));
            checkNotNull(filtroRicetta.getTipologia() != null && filtroRicetta.getTipologia().getEq() != null && !"".equals(filtroRicetta.getTipologia().getEq()) ? filtroRicetta.getTipologia().getEq() : null, new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "Filter tipologia non valorizzato"));

            checkCodiceFiscaleValido(_cf);
            _log.info("execute", "CittadiniCitIdRicetteNrePdfGetService controllo delega...");
            checkUtenteAutorizzatoOrDelegato(_cf);
            _log.info("execute", "CittadiniCitIdRicetteNrePdfGetService controllo delega OK...");

            checkCondition(tipologia.equalsIgnoreCase("P") || tipologia.equalsIgnoreCase("F"), new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "Tipologia non valida"));
            if (tipologia.equalsIgnoreCase(ApiSanPrescConstants.SAR_PARAM_TIPOPRESCRIZIONE_SPECIALISTICA)) {
                checkNotNull(dataInizio, new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "Data inizio non valida"));
                checkNotNull(dataFine, new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "Data fine non valida"));
                checkCondition(dataInizio.before(dataFine), new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "Data fine precedente data inizio"));
            }
            if (tipologia.equalsIgnoreCase(ApiSanPrescConstants.SAR_PARAM_TIPOPRESCRIZIONE_FARMACEUTICA)
            		&& dataInizio != null && dataFine != null) {
                checkCondition(dataInizio.before(dataFine), new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "Data fine precedente data inizio"));
            }

        } catch (JsonMappingException e) {
            return returnErrorResponse(e, "Dettaglio Ricetta", "JSON", _xRequestID, 400, _log);
        } catch (RESTException | IOException e) {
            return returnErrorResponse(e, "Stampa dettaglio ricetta PDF", "stampaPdf", _xRequestID, 500, _log);
        }

        _log.info("execute", "shibIdentitaCodiceFiscale: " + shibIdentitaCodiceFiscale);
        _log.info("execute", "cf: " + _cf);
        _log.info("execute", "tipologia: " + tipologia);
        _log.info("execute", "regionale: " + isRegionale);
        _log.info("execute", "nre: " + _nre);

        reqContainer.setCodiceFiscaleUtenteRich(shibIdentitaCodiceFiscale);
        reqContainer.setCodiceFiscalePaziente(_cf);
        reqContainer.setTipologia(tipologia);
        reqContainer.setRegionale(isRegionale);
        reqContainer.setDataInizioRange(dataInizio);
        reqContainer.setDataFineRange(dataFine);

        reqContainer.setNre(_nre);
        reqContainer.setCodiceFiscaleUtenteRich(_shibIdentitaCodiceFiscale);
        reqContainer.setXCodiceServizio(_xCodiceServizio);
        reqContainer.setxRequestID(_xRequestID);
        reqContainer.setIpRequest(getIPRemoteAddress());

        reqContainer = stampaPDFRicetteService.processRequest(reqContainer);

        if (reqContainer.getErrore().getStatus() > 0) {
            return Response.serverError()
                    .entity(reqContainer.getErrore())
                    .status(reqContainer.getErrore().getStatus())
                    .type("application/json")
                    .header("X-Request-ID", _xRequestID)
                    .build();
        } else {
            return Response.ok(reqContainer.getPdf()).type("application/pdf").header("Content-Disposition",
                    "attachment; filename=\"ricetta.pdf\"").build();
        }


    }

//	private void populateFilters(GetDeleganti req, DelegaFilter f) {
//		
//		req.setStatiDelega(FilterUtil.in(f.getStatoDelega()));
//		req.setCodiciServizio(FilterUtil.in(f.getCodiceServizio()));
//		
//		if(f.getCodiceFiscale() != null && StringUtils.isNotBlank(f.getCodiceFiscale().getEq())){
//			Cittadino cittadinoDelegante = new Cittadino();
//			cittadinoDelegante.setCodiceFiscale(f.getCodiceFiscale().getEq());
//			req.setCittadinoDelegante(cittadinoDelegante);
//		}
//	}

}
