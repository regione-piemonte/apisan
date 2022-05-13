/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.business.apisanpresc.service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanpresc.business.apisanpresc.service.common.PrescDelegheRESTBaseService;
import it.csi.apisan.apisanpresc.business.apisanpresc.service.nascondinre.NascondiNREInvocation;
import it.csi.apisan.apisanpresc.business.apisanpresc.service.nascondinre.NascondiNREService;
import it.csi.apisan.apisanpresc.common.ApiSanPrescConstants;
import it.csi.apisan.apisanpresc.dto.apisanpresc.Dettaglio;
import it.csi.apisan.apisanpresc.dto.apisanpresc.ErroreDettaglio;
import it.csi.apisan.apisanpresc.dto.apisanpresc.Payload;
import it.csi.apisan.apisanpresc.exception.ErroreRESTException;
import it.csi.apisan.apisanpresc.exception.RESTException;
import it.csi.apisan.apisanpresc.util.ApisanPrescUtil;
import it.csi.apisan.apisanpresc.util.ErroreBuilder;
import it.csi.apisan.apisanpresc.util.LogUtil;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class NascondiNRE extends PrescDelegheRESTBaseService {

    LogUtil _log = new LogUtil(this.getClass());

    private String  _ipRequest;
    private String  _xCodiceServizio;
    private String  _xRequestID;
    private Boolean _isNascosta;
    private String  _citId;
    private String  _cfRichiedente;
    private String  _nre;

    public NascondiNRE(String shibIdentitaCodiceFiscale, String xCodiceServizio, String xRequestID, String xForwardedFor, String citId, String nre, Payload payload, SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request) {
        super(securityContext, httpHeaders, request);

        this._cfRichiedente   = shibIdentitaCodiceFiscale;
        this._citId           = citId;
        this._nre             = nre;
        this._xCodiceServizio = xCodiceServizio;
        this._xRequestID      = xRequestID;
        this._isNascosta      = payload.isNascosta();
    }

    @Override
    protected Response execute() {

        NascondiNREService    nascondiNreGetService = new NascondiNREService();
        NascondiNREInvocation nri                   = new NascondiNREInvocation();

        /* Validazioni */
        try {

            checkUtenteAutorizzatoOrDelegato(_citId);

            checkNotNull(xRequestID, new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "xRequestID non valorizzata"));
            checkNotBlank(_citId, new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "citId non valorizzata"));
            checkNotNull(_isNascosta, new RESTException(400, MediaType.APPLICATION_JSON_TYPE, null, "isNascosta non valorizzato"));

        } catch (RESTException e) {
            return returnErrorResponse(e, "Nascondi NRE", "Nascondi NRE", _xRequestID, 500, _log);
        }

        nri.setCodice(ApiSanPrescConstants.CODICE_PRO_NASCONDI_NRE);
        nri.setCodiceFiscaleUtenteRich(_cfRichiedente);
        nri.setCodiceFiscalePaziente(_citId);
        nri.setNre(_nre);
        nri.setContestoOperativo(ApiSanPrescConstants.CONTESTO_OPERATIVO);
        nri.setIdentificativoIpRichiedente(getIPRemoteAddress());
        nri.setRuoloUtente(ApisanPrescUtil.getRuoloDMA(_citId, _cfRichiedente));
        nri.setXCodiceServizio(_xCodiceServizio);
        nri.setXRequestId(_xRequestID);
        nri.setIsNascosta(_isNascosta);

        nri = nascondiNreGetService.processRequest(nri);

        HashMap<String, Object> result = new HashMap<>();
        if (nri.getNascondiNreResponse() != null && nri.getNascondiNreResponse().getEsito() != null && nri.getNascondiNreResponse().getErrori() != null) {
            result.put("esito", nri.getNascondiNreResponse().getEsito());
            result.put("errori", nri.getNascondiNreResponse().getErrori());
        }

/*        
 * Egidio 10/05/2021 viene fatto un test su un codice mai settato
 * if (nri.getErrore().getStatus() > 0) {
            return Response.serverError().entity(nri.getErrore())
                    .status(nri.getErrore().getStatus())
                    .header("X-Request-ID", _xRequestID)
                    .build();
        }*/ 
        /*if( !((String)result.get("esito")).equalsIgnoreCase("0000")       ) {
        	//ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).code((String)result.get("esito"))
        	return Response.serverError().entity(result).header("X-Request-ID", _xRequestID).build();
        }
        else {*/
        checkSuccesso(nri);
            return Response.ok(result).header("X-Request-ID", _xRequestID).build();
       // }
    }
    
    
    private void checkSuccesso(NascondiNREInvocation nri ) {
    	if(nri.getNascondiNreResponse() != null && nri.getNascondiNreResponse().getEsito() != null && nri.getNascondiNreResponse().getErrori() != null
    			&& !"0000".equalsIgnoreCase(nri.getNascondiNreResponse().getEsito())) {
    		
    		it.csi.apisan.apisanpresc.dto.apisanpresc.Errore err = ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).code(nri.getNascondiNreResponse().getEsito()).build();
    		if(nri.getNascondiNreResponse().getErrori().getErrore() != null && nri.getNascondiNreResponse().getErrori().getErrore().size() > 0) {
    			
    			Optional<it.csi.apisan.apisanpresc.soap.pro.nascondinre.Errore> errore = 
    					nri.getNascondiNreResponse().getErrori().getErrore().stream().filter(c -> "PRO-ERR-0186".equalsIgnoreCase(c.getCodiceEsito())).findFirst();
    			if(errore.isPresent()) {
    				throw new ErroreRESTException(ErroreBuilder.from(Status.FORBIDDEN).code(errore.get().getCodiceEsito()).title(errore.get().getEsitoErrore()).build() );
    			}
    			
    		}

    		throw new ErroreRESTException(err);
    	}
    			
    }
    	
   
    

}




