/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanaut.business.apisanaut;

import it.csi.apisan.apisanaut.dto.apisanaut.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import it.csi.apisan.apisanaut.dto.apisanaut.AssistitoPiemontese;
import it.csi.apisan.apisanaut.dto.apisanaut.Cittadino;
import it.csi.apisan.apisanaut.dto.apisanaut.DelegaCittadino;
import it.csi.apisan.apisanaut.dto.apisanaut.DelegaServizio;
import it.csi.apisan.apisanaut.dto.apisanaut.Dichiarazione;
import it.csi.apisan.apisanaut.dto.apisanaut.Errore;
import java.util.List;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/cittadini")


@io.swagger.annotations.Api(description = "the cittadini API")

public interface CittadiniApi  {
   
    @GET
    @Path("/{cf}/assistito-piemontese")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "ritora se un cittadino è piemontese o meno", response = AssistitoPiemontese.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Operazione eseguita con successo ", response = AssistitoPiemontese.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "bad request", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Utente non autorizzato a compiere l'operazione", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Risorsa non trovata", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Errore.class) })
    public Response cittadiniCfAssistitoPiemonteseGet(@ApiParam(value = "" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "" ,required=true)@HeaderParam("X-Request-ID") String xRequestID,@ApiParam(value = "" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cf") String cf,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/{cf}/deleganti/{cfdelegante}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Corrisponde alla risorsa  singola del delegato  rappresenta uno 'shortcut' alla uri deleganti. Il codice fiscale dell'header deve essere verificato con il cf passato nel path param se sono diversi ritorna errore 401. I deleganti ritornati hanno ognuno un elenco di deleghe; il codice fiscale non viene ripetuto per ogni delega.Verificare   X-Request-ID deve essere usato anche nella response o serve solo per   l'audit? Aggiunto codice servizio nell'header per requisito sicurezza proveniente dal giallo   I filtri ammissibili sono i seguenti   ", response = DelegaCittadino.class, responseContainer = "List", tags={ "Gestione Deleghe", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "operazione eseguita con successo", response = DelegaCittadino.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "bad request", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Utente non autorizzato a compiere l'operazione", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Risorsa non trovata", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Errore.class) })
    public Response cittadiniCfDelegantiCfdeleganteGet(@ApiParam(value = "" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "" ,required=true)@HeaderParam("X-Request-ID") String xRequestID,@ApiParam(value = "" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cf") String cf, @PathParam("cfdelegante") String cfdelegante,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @PUT
    @Path("/{cf}/deleganti/{cfdelegante}/servizi/{uuid}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Esegue una rinuncia a una delega ricevuta; il cf passato come path param viene verificato con il cf dell'header se non coincidono ritorna errore 401, e corrisponde alla persona che rinuncia alla delega precedentemente conferitagli dal delegante passato nel path param cfdelegante.  Il codice servizio rappresenta il servizio a cui il cittadino rinuncia a essere delegante. Non effettua una delete su database ma inserisce una data di fine validita = alla data odierna. Il parametro uuid rappresenta la chiave della delega (verificare) ", response = Void.class, tags={ "Gestione Deleghe", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Operazione eseguita con successo ", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "bad request", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Utente non autorizzato a compiere l'operazione", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Risorsa non trovata", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Errore.class) })
    public Response cittadiniCfDelegantiCfdeleganteServiziUuidPut(@ApiParam(value = "" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "" ,required=true)@HeaderParam("X-Request-ID") String xRequestID,@ApiParam(value = "" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cf") String cf, @PathParam("cfdelegante") String cfdelegante, @PathParam("uuid") String uuid,@ApiParam(value = "" ,required=true) DelegaServizio delegheServizio,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/{cf}/deleganti")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Fornisce l'elenco delle persone che hanno delegato il cf passato in path param a compiere operazioni sui servizi sanitari. Il codice fiscale dell'header deve essere verificato con il cf passato nel path param se sono diversi ritorna errore 401. Viene ritornato un array di cittadino-deleghe che rappresenta le persone che hanno compiuto l'operazione di delegare il cittadino su un servizio. Il codice fiscale non viene ripetuto per ogni delega. codice fiscale non viene ripetuto per ogni delega.Verificare X-Request-ID deve essere usato anche nella response o serve solo per l'audit? Aggiunto codice servizio nell'header per requisito sicurezza proveniente dal giallo. Il filtro viene consentito per codice_fiscale, per stato_delega e sul codice servizio come definito sull'oggetto delega_filter ", response = DelegaCittadino.class, responseContainer = "List", tags={ "Gestione Deleghe", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "operazione eseguita con successo", response = DelegaCittadino.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "bad request", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Utente non autorizzato a compiere l'operazione", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Risorsa non trovata", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Errore.class) })
    public Response cittadiniCfDelegantiGet(@ApiParam(value = "" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "" ,required=true)@HeaderParam("X-Request-ID") String xRequestID,@ApiParam(value = "" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cf") String cf, @QueryParam("filter") String filter,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/{cf}/delegati/{cfdelegato}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Corrisponde alla risorsa  singola del delegato  rappresenta uno 'shortcut' alla uri delegati  Il codice fiscale dell'header deve essere verificato con il cf passato nel path param, se sono diversi ritorna errore 401. Ogni delegante ritornato ha un elenco di deleghe; ", response = DelegaCittadino.class, tags={ "Gestione Deleghe", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "operazione eseguita con successo", response = DelegaCittadino.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "bad request", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Utente non autorizzato a compiere l'operazione", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Risorsa non trovata", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Errore.class) })
    public Response cittadiniCfDelegatiCfdelegatoGet(@ApiParam(value = "" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "" ,required=true)@HeaderParam("X-Request-ID") String xRequestID,@ApiParam(value = "" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cf") String cf, @PathParam("cfdelegato") String cfdelegato,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @PUT
    @Path("/{cf}/delegati/{cfdelegato}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "Modifica le deleghe di un delegato è possibile non avere una delega in stato attiva. Nell'header viene passato un codice fiscale che deve essere verificato con il codice fiscale passato nel path, se non corrispondono ritorna errore 401.Gli stati possibili sono     * ATTIVA     * IN_SCADENZA     * SCADUTA     * RIFIUTATA     * REVOCATA ", response = DelegaCittadino.class, tags={ "Gestione Deleghe", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Operazione eseguita con successo ", response = DelegaCittadino.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "bad request", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Utente non autorizzato a compiere l'operazione", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Risorsa non trovata", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Errore.class) })
    public Response cittadiniCfDelegatiCfdelegatoPut(@ApiParam(value = "" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "" ,required=true)@HeaderParam("X-Request-ID") String xRequestID,@ApiParam(value = "" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cfdelegato") String cfdelegato, @PathParam("cf") String cf,@ApiParam(value = "I campi obbligatori da valorizzare sono    * uuid   * codice_fiscale_delega   * nome_delega   * cognome_delega   * data_nascita_delega   * luogo_nascita_delega   * sesso_delega   * stato_anagrafica -> stati possibili indicati in descrizione del servizio    deleghe     * uuid nel caso in cui presente da precedente get      * codice_servizio     * data_inizio_delega     * data_fine_delega     * stato_delega possibili valori su descrizione del servizio " ,required=true) DelegaCittadino cittadinoDelega,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/{cf}/delegati/deleghe-valide")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Fornisce l'elenco delle persone che il cf ha delegato a compiere operazioni sui servizi sanitari per il codice fiscale fornito nel path param che hanno una delega valida (stati Attiva e in Scadenza). Il codice fiscale dell'header deve essere verificato con il cf passato nel path param, se sono diversi ritorna errore 401. Ogni delegante ritornato  ha un elenco di deleghe; il codice fiscale e i dati anagrafici non vengono ripetuti per ogni delega.Il filtro viene consentito per codice_fiscale e codice_servizio come definito nell'oggetto delega_valida_filter ", response = DelegaCittadino.class, responseContainer = "List", tags={ "Gestione Deleghe", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "operazione eseguita con successo", response = DelegaCittadino.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "bad request", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Utente non autorizzato a compiere l'operazione", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Risorsa non trovata", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Errore.class) })
    public Response cittadiniCfDelegatiDelegheValideGet(@ApiParam(value = "" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "" ,required=true)@HeaderParam("X-Request-ID") String xRequestID,@ApiParam(value = "" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cf") String cf, @QueryParam("filter") String filter,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/{cf}/delegati")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Fornisce l'elenco delle persone che il cf ha delegato a compiere operazioni sui servizi sanitari per il codice fiscale fornito nel path param. Il codice fiscale dell'header deve essere verificato con il cf passato nel path param, se sono diversi ritorna errore 401. Ogni delegante ritornato  ha un elenco di deleghe; il codice fiscale e i dati anagrafici non vengono ripetuti per ogni delega.Il filtro viene consentito per codice_fiscale, stato_delega e codice_servizio come definito nell'oggetto delega_filter ", response = DelegaCittadino.class, responseContainer = "List", tags={ "Gestione Deleghe", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "operazione eseguita con successo", response = DelegaCittadino.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "bad request", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Utente non autorizzato a compiere l'operazione", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Risorsa non trovata", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Errore.class) })
    public Response cittadiniCfDelegatiGet(@ApiParam(value = "" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "" ,required=true)@HeaderParam("X-Request-ID") String xRequestID,@ApiParam(value = "" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cf") String cf, @QueryParam("filter") String filter,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @POST
    @Path("/{cf}/delegati")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "inserisce almeno un delegato che deve avere almeno una delega in stato attiva. Nell'header viene passato un codice fiscale che deve essere verificato con il codice fiscale passato nel path, se non corrispondono ritorna errore 401. Il cittadino che compie l'operazione viene reperito dal servizio tramite chiamata ad aura in quanto possono inserire deleghe e delegati unicamente cittadini piemontesi. Stati delega consentiti (al front end). Non è da  valorizare il campo grado_delega in quanto lo calcola da sistema.  * Attiva ", response = Void.class, tags={ "Gestione Deleghe", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Operazione eseguita con successo type: array items:   $ref: '#/definitions/delega_cittadino' ", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "bad request", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Utente non autorizzato a compiere l'operazione", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Risorsa non trovata", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Errore.class) })
    public Response cittadiniCfDelegatiPost(@ApiParam(value = "" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "" ,required=true)@HeaderParam("X-Request-ID") String xRequestID,@ApiParam(value = "" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cf") String cf,@ApiParam(value = "I campi obbligatori da valorizzare sono * codice_fiscale_delega * nome_delega * cognome_delega * data_nascita_delega * luogo_nascita_delega * sesso_delega deleghe   * codice_servizio   * data_inizio_delega -> deve essere data odierna    * data_fine_delega -> il massimo possibile deve essere preso dal servizio apisancross/servizi con data inizio delega + numero_giorni_delegabile    * stato_delega -> in inserimento deve essere ATTIVA " ,required=true) List<DelegaCittadino> delegati,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    @Path("/{cf}/dichiarazioni")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Ricerca di dichiarazioni di un cittadino", response = Dichiarazione.class, responseContainer = "List", tags={ "Gestione Dichiarazioni", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Operazione eseguita con successo ", response = Dichiarazione.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "bad request", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Utente non autorizzato a compiere l'operazione", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Risorsa non trovata", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Errore.class) })
    public Response cittadiniCfDichiarazioniGet(@ApiParam(value = "" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "" ,required=true)@HeaderParam("X-Request-ID") String xRequestID,@ApiParam(value = "" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cf") String cf, @QueryParam("filter") String filter,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @POST
    @Path("/{cf}/dichiarazioni")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Inserisce una dichiarazione nel body devono essere presenti 2 dettagli uno per il genitore 1, ovvero lo stesso del path param, e l'altro per il secondo genitore. Cittadino1 del web service corrisponde sempre a genitore_tutore_curatore, figlio_tutelato_curato corrisponde a cittadino2 del web service.", response = Dichiarazione.class, tags={ "Gestione Dichiarazioni", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Operazione eseguita con successo ", response = Dichiarazione.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "bad request", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Utente non autorizzato a compiere l'operazione", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Risorsa non trovata", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Errore.class) })
    public Response cittadiniCfDichiarazioniPost(@ApiParam(value = "" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "" ,required=true)@HeaderParam("X-Request-ID") String xRequestID,@ApiParam(value = "" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cf") String cf,@ApiParam(value = "I campi obbligatori sono  * tipo    * codice -> deve essere CONGIUNTA  * stato    * codice -> deve essere DA_COMPLETARE  * modo    * codice -> deve essere valorizzato ON_LINE  * cittadino    * deve essere cittadino dichiarantw    * documento del cittadino -> deve essere lo stato id famiglia  * dettagli    * stato      * codice -> deve essere DA_APPROVARE  * genitore_tutore_curatore     * codice_fiscale   * ruolo_genitore_curatore     * codice -> deve essere  GENITORE_1 o GENITORE_2    * documento -> documento identita  * figlio_tutelato_curato     * codice_fiscale     * dosumento -> documento identita  * ruolo_figlio_tutelato_curato     * codice deve essere passato FIGLIO " ) Dichiarazione dichiarazione,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @PUT
    @Path("/{cf}/dichiarazioni/{uuid_dichiarazione}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Aggiorna una dichiarazione", response = Dichiarazione.class, tags={ "Gestione Dichiarazioni", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Operazione eseguita con successo ", response = Dichiarazione.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "bad request", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Utente non autorizzato a compiere l'operazione", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Risorsa non trovata", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Errore.class) })
    public Response cittadiniCfDichiarazioniUuidDichiarazionePut(@ApiParam(value = "" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "" ,required=true)@HeaderParam("X-Request-ID") String xRequestID,@ApiParam(value = "" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cf") String cf, @PathParam("uuid_dichiarazione") String uuidDichiarazione,@ApiParam(value = "I campi obbligatori sono  * tipo    * codice -> deve essere CONGIUNTA  * stato    * codice -> deve essere DA_COMPLETARE, ATTIVA, REVOCATA, SCADUTA  * modo    * codice -> deve essere valorizzato ON_LINE  * dettagli    * stato      * codice -> deve essere DA_APPROVARE, VALIDA, DA_APPROVARE, REVOCATA_BLOCCO, REVOCATA, SCADUTA  * genitore_tutore_curatore     * codice_fiscale   * ruolo_genitore_curatore     * codice -> deve essere  GENITORE_1 o GENITORE_2  * figlio_tutelato_curato     * codice_fiscale   * ruolo_figlio_tutelato_curato     * codice deve essere passato FIGLIO " ) Dichiarazione dichiarazione,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @PUT
    @Path("/{cf}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "Aggiorna un cittadino", response = Cittadino.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Operazione eseguita con successo ", response = Cittadino.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "bad request", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Utente non autorizzato a compiere l'operazione", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Risorsa non trovata", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Errore.class) })
    public Response cittadiniCfPut(@ApiParam(value = "" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "" ,required=true)@HeaderParam("X-Request-ID") String xRequestID,@ApiParam(value = "" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio, @PathParam("cf") String cf,@ApiParam(value = "" ) Cittadino cittadino,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @GET
    
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "Ricerca cittadini", response = Cittadino.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Operazione eseguita con successo ", response = Cittadino.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "bad request", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Utente non autorizzato a compiere l'operazione", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Risorsa non trovata", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Errore.class) })
    public Response cittadiniGet(@ApiParam(value = "" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "" ,required=true)@HeaderParam("X-Request-ID") String xRequestID,@ApiParam(value = "" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio, @QueryParam("filter") String filter,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @POST
    
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "Inserisce un cittadino", response = Dichiarazione.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Operazione eseguita con successo ", response = Dichiarazione.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "bad request", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Utente non autorizzato a compiere l'operazione", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Risorsa non trovata", response = Errore.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Errore.class) })
    public Response cittadiniPost(@ApiParam(value = "" ,required=true)@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@ApiParam(value = "" ,required=true)@HeaderParam("X-Request-ID") String xRequestID,@ApiParam(value = "" ,required=true)@HeaderParam("X-Codice-Servizio") String xCodiceServizio,@ApiParam(value = "" ) Cittadino cittadino,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
}
