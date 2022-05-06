/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.common;

import it.csi.apisan.apisanvac.common.exception.RESTException;
import it.csi.apisan.apisanvac.model.Errore;
import it.csi.apisan.apisanvac.model.ErroreDettaglio;
import it.csi.apisan.apisanvac.util.LogUtil;
import it.csi.deleghe.deleghebe.ws.DelegheCittadiniService;
import it.csi.deleghe.deleghebe.ws.model.Cittadino;
import it.csi.deleghe.deleghebe.ws.msg.GetDeleganti;
import it.csi.deleghe.deleghebe.ws.msg.GetDelegantiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import java.util.*;

public abstract class DelegheRESTBaseService extends VacRESTBaseService {

    @Autowired
    protected DelegheCittadiniService delegheCittadiniService;

    @Value("${serviceDelegheName}")
    private String serviceDelegheName;

    public DelegheRESTBaseService(String xRequestID, SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request, HttpServletResponse response) {
        super(xRequestID, securityContext, httpHeaders, request, response);
    }

    //aggiunta nella condizione che l'utente sia delegato
    protected void checkUtenteAutorizzatoOrDelegato(String cf) throws RESTException {
        checkNotNull(shibIdentitaCodiceFiscale, new RESTException(ApisanVacStatus.PARAMETRO_NON_VALIDO.getStatusCode(), MediaType.APPLICATION_JSON_TYPE, null, ApisanVacStatus.PARAMETRO_NON_VALIDO.getMessage("shibIdentitaCodiceFiscale")));
        if (!isUtenteAutorizzato(cf)) {
            checkCondition(isUtenteDelegato(cf), new RESTException(ApisanVacStatus.DELEGA_NON_VALIDA.getStatusCode(), MediaType.APPLICATION_JSON_TYPE, null, ApisanVacStatus.DELEGA_NON_VALIDA.getMessage()));
        }

    }

    protected boolean isUtenteDelegato(String cf) {
        final String                                  METHOD_NAME = "isUtenteDelegato";
        GetDeleganti                                  req         = new GetDeleganti();
        it.csi.deleghe.deleghebe.ws.model.Richiedente richiedente = new it.csi.deleghe.deleghebe.ws.model.Richiedente(xRequestId, xCodiceServizio, shibIdentitaCodiceFiscale);
        req.setRichiedente(richiedente);

        Cittadino cittDelegante = new Cittadino();
        cittDelegante.setCodiceFiscale(cf);
        req.setCittadinoDelegante(cittDelegante);
        req.setCodiciServizio(Arrays.asList(serviceDelegheName));
        req.setStatiDelega(Arrays.asList(StatoDelega.ATTIVA.toString(), StatoDelega.INSCADENZA.toString()));


        Cittadino cittDelegato = new Cittadino();
        cittDelegato.setCodiceFiscale(shibIdentitaCodiceFiscale);
        req.setCittadinoDelegato(cittDelegato);


        //per verificare se il cf in path abbia delegato l'utente nell'header (shibidentitacf) preferisco fare una chiamata sui deleganti (ovvero chi ha effettuato l'autenticazione
        // richiama il servizio per vedere se il cf del path sia un suo delegante in questo modo per l'audit la catena ha preciso chi effettua la chiamata
        GetDelegantiResponse gdResp = delegheCittadiniService.getDelegantiService(req);

        if (!it.csi.deleghe.deleghebe.ws.model.RisultatoCodice.SUCCESSO.equals(gdResp.getEsito())) {
            List<it.csi.deleghe.deleghebe.ws.model.Errore> errori = gdResp.getErrori();
            if (errori != null) {
                log.error(METHOD_NAME, "Errore getDelegatiService service:");
                errori.forEach(e -> {
                    log.error(METHOD_NAME, "   Codice: %s, Descrizione: %s", e.getCodice(), e.getDescrizione());
                });
            }

            return false;
        }


        return isPresenteDeleganteAttivo(gdResp);
    }

    private boolean isPresenteDeleganteAttivo(GetDelegantiResponse gdResp) {

        boolean presentiDeleghe = (gdResp.getDeleganti() != null && !gdResp.getDeleganti().isEmpty());

        return (presentiDeleghe && gdResp.getDeleganti().stream().anyMatch(c -> c.getDeleghe().stream().filter(delRol -> serviceDelegheName.equals(delRol.getCodiceServizio())
                && (StatoDelega.ATTIVA.toString().equals(delRol.getStatoDelega())
                || StatoDelega.INSCADENZA.toString().equals(delRol.getStatoDelega())))
                .anyMatch(del -> del.getDataInizioDelega().compareTo(new Date()) <= 0 && del.getDataFineDelega().compareTo(new Date()) >= 0)));
    }

    protected Response returnErrorResponse(Exception e, String errorFrom, String methodName, String _xRequestID, Integer defaultStatusCode, LogUtil _log) {
        Integer statusCode = e instanceof RESTException ? ((RESTException) e).getStatus() : defaultStatusCode;
        String  message    = e instanceof RESTException ? ((RESTException) e).getMessage() : "Errore " + statusCode;

        List<ErroreDettaglio> listaDettaglioErrori = new ArrayList<>();


        ErroreDettaglio erroreDettaglioMetodo = new ErroreDettaglio();
        erroreDettaglioMetodo.setChiave("method");
        erroreDettaglioMetodo.setValore(methodName);
        listaDettaglioErrori.add(erroreDettaglioMetodo);

        ErroreDettaglio erroreDettaglioMessage = new ErroreDettaglio();
        erroreDettaglioMessage.setChiave("dettaglioErrore");
        erroreDettaglioMessage.setValore(message);
        listaDettaglioErrori.add(erroreDettaglioMessage);

        ErroreDettaglio erroreDettaglioException = new ErroreDettaglio();
        erroreDettaglioException.setChiave("exception");
        erroreDettaglioException.setValore(e != null ? e.getMessage() : "");
        listaDettaglioErrori.add(erroreDettaglioMessage);

        Errore errore = new Errore();
        errore.setDetail(listaDettaglioErrori);
        errore.setStatus(statusCode);
        errore.setTitle("Errore " + statusCode);

        _log.error(errorFrom, e.getMessage());

        return Response.serverError().type(MediaType.APPLICATION_JSON)
                .status(statusCode).entity(errore).header("X-Request-ID", _xRequestID).build();
    }


}
	