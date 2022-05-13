/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.business.apisanpresc.service;

import it.csi.apisan.apisanpresc.business.apisanpresc.service.common.PrescDelegheRESTBaseService;
import it.csi.apisan.apisanpresc.business.apisanpresc.service.dettaglioricette.DettaglioNREService;
import it.csi.apisan.apisanpresc.business.apisanpresc.service.dettaglioricette.DettaglioRicettaInvocation;
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

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class DettaglioNRE extends PrescDelegheRESTBaseService {

    private String _filter;
    private String _ipRequest;
    private String _xCodiceServizio;
    private String _shibIdentitaCodiceFiscale;
    private String _xRequestID;
    private String _nre;
    private String _cf;

    LogUtil _log = new LogUtil(this.getClass());

    public DettaglioNRE(String shibIdentitaCodiceFiscale, String xCodiceServizio, String xRequestID, String xForwardedFor, String citId, String nre, String filter, SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request) {
        super(securityContext, httpHeaders, request);

        this._filter                    = filter;
        this._nre                       = nre;
        this._shibIdentitaCodiceFiscale = shibIdentitaCodiceFiscale;
        this._xCodiceServizio           = xCodiceServizio;
        this._xRequestID                = xRequestID;
        this._cf                        = citId;
    }

    @Override
    protected Response execute() {

         /*   CONTESTO_OPERATIVO: costante PERSONAL;
        IDENTIFICATIVO_IP_RICHIEDENTE: chiedo in che modo recuparlo;
        RUOLO_UTENTE: devo chiedere;
        SERVIZIO CHIAMANTE: deve contenere il valore del campo X-Codice-Servizio presente nell'header;
       UUID: deve contenere il valore del campo X-Request-ID presente nell'header;
        REGIONE_PRESCRIZIONE=RP o EXTRA_RP */
        DettaglioRicettaInvocation dettaglioRicettaInvocation = new DettaglioRicettaInvocation();
        DettaglioNREService        dettaglioNREService        = new DettaglioNREService();
        FiltroRicetta              filtroRicetta              = null;
        Boolean                    isRegionale                = null;
        String                     tipologia                  = null;
        Date                       dataInizio                 = null;
        Date                       dataFine                   = null;

        try {

            ObjectMapper mapper = new ObjectMapper();
            checkNotNull(_filter, new RESTException(ApisanPrescStatus.PARAMETRO_NON_PRESENTE.getStatusCode(), MediaType.APPLICATION_JSON_TYPE, null, ApisanPrescStatus.PARAMETRO_NON_PRESENTE.getMessage("_filter")));
            checkNotBlank(_filter, new RESTException(ApisanPrescStatus.PARAMETRO_NON_VALIDO.getStatusCode(), MediaType.APPLICATION_JSON_TYPE, null, ApisanPrescStatus.PARAMETRO_NON_VALIDO.getMessage("_filter")));
            filtroRicetta = mapper.readValue(_filter, FiltroRicetta.class);

            isRegionale = filtroRicetta.getRegionale() != null ? filtroRicetta.getRegionale().isEq() : null;
            tipologia   = filtroRicetta.getTipologia() != null && filtroRicetta.getTipologia().getEq() != null ? filtroRicetta.getTipologia().getEq().toString() : null;
            dataInizio  = filtroRicetta.getDataCompilazione() != null ? filtroRicetta.getDataCompilazione().getGte() : null;
            dataFine    = filtroRicetta.getDataCompilazione() != null ? filtroRicetta.getDataCompilazione().getLte() : null;

            checkUtenteAutorizzatoOrDelegato(_cf);
            checkNotNull(_shibIdentitaCodiceFiscale, new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "_shibIdentitaCodiceFiscale non valorizzato"));
            checkNotNull(_shibIdentitaCodiceFiscale, new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "_shibIdentitaCodiceFiscale non valorizzato"));
            checkNotNull(_xRequestID, new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "xRequestID non valorizzata"));
            checkNotBlank(_cf, new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "citId non valorizzata"));
            checkNotNull(_filter, new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "Filter non valorizzato"));
            checkNotNull(filtroRicetta.getRegionale() != null && filtroRicetta.getRegionale().isEq() != null ? filtroRicetta.getRegionale().isEq() : null, new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "Filter regionale non valorizzato"));
            checkNotNull(filtroRicetta.getTipologia() != null && filtroRicetta.getTipologia().getEq() != null && !"".equals(filtroRicetta.getTipologia().getEq()) ? filtroRicetta.getTipologia().getEq() : null, new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "Filter tipologia non valorizzato"));
            checkNotNull(_nre, new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "Nre non valorizzato"));

            checkCondition(tipologia.equalsIgnoreCase("P") || tipologia.equalsIgnoreCase("F"), new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "Tipologia non valida"));
            if (tipologia.equalsIgnoreCase(ApiSanPrescConstants.SAR_PARAM_TIPOPRESCRIZIONE_SPECIALISTICA)) {
                checkNotNull(dataInizio, new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "Data inizio non valida"));
                checkNotNull(dataFine, new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "Data fine non valida"));
                checkCondition(dataInizio.before(dataFine), new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "Data fine precedente data inizio"));
            }
            if (tipologia.equalsIgnoreCase(ApiSanPrescConstants.SAR_PARAM_TIPOPRESCRIZIONE_FARMACEUTICA)) {
                if (dataInizio != null && dataFine != null) {
                    checkCondition(dataInizio.before(dataFine), new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "Data fine precedente data inizio"));
                }
            }
        } catch (JsonMappingException e) {
            return returnErrorResponse(e, "Dettaglio Ricetta", "JSON", _xRequestID, 400, _log);
        } catch (RESTException | IOException e) {
            return returnErrorResponse(e, "Dettaglio Ricetta", "Dettaglio Ricetta", _xRequestID, 500, _log);
        }

        dettaglioRicettaInvocation.setCodiceFiscaleUtenteRich(_shibIdentitaCodiceFiscale);
        dettaglioRicettaInvocation.setCodiceFiscalePaziente(_cf);
        dettaglioRicettaInvocation.setTipologia(tipologia);
        dettaglioRicettaInvocation.setRegionale(isRegionale);
        dettaglioRicettaInvocation.setContestoOperativo(ApiSanPrescConstants.CONTESTO_OPERATIVO);
        dettaglioRicettaInvocation.setXCodiceServizio(_xCodiceServizio);
        dettaglioRicettaInvocation.setxRequestID(_xRequestID);
        dettaglioRicettaInvocation.setRegionePrescrizione(isRegionale ? ApiSanPrescConstants.CONSTANTS_REGIONEPRESCRIZIONE_RP : ApiSanPrescConstants.CONSTANTS_REGIONEPRESCRIZIONE_EXTRARP);
        dettaglioRicettaInvocation.setIdentificativoIpRichiedente(getIPRemoteAddress());
        dettaglioRicettaInvocation.setNre(_nre);
        dettaglioRicettaInvocation.setDataInizioRange(dataInizio);
        dettaglioRicettaInvocation.setDataFineRange(dataFine);

        dettaglioRicettaInvocation = dettaglioNREService.processRequest(dettaglioRicettaInvocation);

        if (dettaglioRicettaInvocation.getErrore().getStatus() > 0) {
            return Response.serverError().entity(dettaglioRicettaInvocation.getErrore())
                    .status(dettaglioRicettaInvocation.getErrore().getStatus())
                    .header("X-Request-ID", _xRequestID)
                    .build();
        } else {
            return Response.ok(dettaglioRicettaInvocation.getEntityResponse()).header("X-Request-ID", _xRequestID).build();
        }
    }


}
