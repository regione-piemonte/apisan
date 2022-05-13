/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.business.apisanpresc.service;

import it.csi.apisan.apisanpresc.business.apisanpresc.service.common.PrescDelegheRESTBaseService;
import it.csi.apisan.apisanpresc.business.apisanpresc.service.elencoricette.ElencoRicetteInvocation;
import it.csi.apisan.apisanpresc.business.apisanpresc.service.elencoricette.ElencoRicetteService;
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
import java.util.StringTokenizer;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class ElencoRicette extends PrescDelegheRESTBaseService {

    private LogUtil _log = new LogUtil(this.getClass());

    private String _filter;
    private String _ipRequest;
    private String _xCodiceServizio;
    private String _shibIdentitaCodiceFiscale;
    private String _xRequestID;
    private String _cf;


    public ElencoRicette(String shibIdentitaCodiceFiscale, String xCodiceServizio, String xRequestID, String xForwardedFor, String citId, String filter, SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request) {
        super(securityContext, httpHeaders, request);

        this._filter                    = filter;
        this._cf                        = citId;
        this._shibIdentitaCodiceFiscale = shibIdentitaCodiceFiscale;
        this._xCodiceServizio           = xCodiceServizio;
        this._xRequestID                = xRequestID;
    }

    @Override protected Response execute() {

        ElencoRicetteService    elencoRicetteService    = new ElencoRicetteService();
        ElencoRicetteInvocation elencoRicetteInvocation = new ElencoRicetteInvocation();
        FiltroRicetta           filtroRicetta           = null;
        Boolean                 isRegionale             = null;
        String                  tipologia               = null;
        Date                    dataInizio              = null;
        Date                    dataFine                = null;
        /* Validazioni */
        try {

            ObjectMapper mapper = new ObjectMapper();
            checkNotNull(_filter, new RESTException(ApisanPrescStatus.PARAMETRO_NON_PRESENTE.getStatusCode(), MediaType.APPLICATION_JSON_TYPE, null, ApisanPrescStatus.PARAMETRO_NON_PRESENTE.getMessage("_filter")));
            checkNotBlank(_filter, new RESTException(ApisanPrescStatus.PARAMETRO_NON_VALIDO.getStatusCode(), MediaType.APPLICATION_JSON_TYPE, null, ApisanPrescStatus.PARAMETRO_NON_VALIDO.getMessage("_filter")));
            filtroRicetta = mapper.readValue(_filter, FiltroRicetta.class);

            checkUtenteAutorizzatoOrDelegato(_cf);

            checkNotNull(xRequestID, new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "xRequestID non valorizzata"));
            checkNotBlank(_cf, new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "citId non valorizzata"));
            checkNotNull(_filter, new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "Filter non valorizzato"));
            checkNotNull(filtroRicetta.getRegionale() != null && filtroRicetta.getRegionale().isEq() != null ? filtroRicetta.getRegionale().isEq() : null, new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "Filter regionale non valorizzato"));
            checkNotNull(filtroRicetta.getTipologia() != null && filtroRicetta.getTipologia().getEq() != null && !"".equals(filtroRicetta.getTipologia().getEq()) ? filtroRicetta.getTipologia().getEq() : null, new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "Filter tipologia non valorizzato"));

            isRegionale = filtroRicetta.getRegionale() != null ? filtroRicetta.getRegionale().isEq() : null;
            tipologia   = filtroRicetta.getTipologia() != null && filtroRicetta.getTipologia().getEq() != null ? filtroRicetta.getTipologia().getEq().toString() : null;
            dataInizio  = filtroRicetta.getDataCompilazione() != null ? filtroRicetta.getDataCompilazione().getGte() : null;
            dataFine    = filtroRicetta.getDataCompilazione() != null ? filtroRicetta.getDataCompilazione().getLte() : null;

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
            return returnErrorResponse(e, "Elenco Ricetta", "JSON", _xRequestID, 400, _log);
        } catch (RESTException | IOException e) {
            return returnErrorResponse(e, "Elenco Ricette", "Elenco Ricette", _xRequestID, 500, _log);
        }


        elencoRicetteInvocation.setCodiceFiscaleUtenteRich(_shibIdentitaCodiceFiscale);
        elencoRicetteInvocation.setCodiceFiscalePaziente(_cf);
        elencoRicetteInvocation.setTipologia(tipologia);
        elencoRicetteInvocation.setRegionale(isRegionale);
        elencoRicetteInvocation.setDataInizioRange(dataInizio);
        elencoRicetteInvocation.setDataFineRange(dataFine);
        elencoRicetteInvocation.setxCodiceServizio(_xCodiceServizio);
        elencoRicetteInvocation.setIpRequest(getIPRemoteAddress());
        elencoRicetteInvocation.setxRequestID(_xRequestID);
        elencoRicetteInvocation.setRegionePrescrizione(isRegionale ? ApiSanPrescConstants.CONSTANTS_REGIONEPRESCRIZIONE_P : ApiSanPrescConstants.CONSTANTS_REGIONEPRESCRIZIONE_EXTRARP);
        elencoRicetteInvocation = elencoRicetteService.processRequest(elencoRicetteInvocation);

        if (elencoRicetteInvocation.getErrore().getStatus() > 0) {
            return Response.serverError().entity(elencoRicetteInvocation.getErrore())
                    .status(elencoRicetteInvocation.getErrore().getStatus())
                    .header("X-Request-ID", _xRequestID)
                    .build();
        } else {
            return Response.ok(elencoRicetteInvocation.getEntityResponse()).header("X-Request-ID", _xRequestID).build();
        }

    }
}
