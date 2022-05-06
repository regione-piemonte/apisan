/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.util;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import it.csi.apisan.apisanvac.model.ModelAmbulatorio;
import it.csi.apisan.apisanvac.model.ModelAmbulatorioOrario;
import it.csi.apisan.apisanvac.model.ModelAppuntamento;
import it.csi.apisan.apisanvac.model.ModelAppuntamentoCreato;
import it.csi.apisan.apisanvac.model.ModelAsl;
import it.csi.apisan.apisanvac.model.ModelAssociazione;
import it.csi.apisan.apisanvac.model.ModelCentroVaccinale;
import it.csi.apisan.apisanvac.model.ModelCentroVaccinaleOrario;
import it.csi.apisan.apisanvac.model.ModelCittadino;
import it.csi.apisan.apisanvac.model.ModelCittadinoContatti;
import it.csi.apisan.apisanvac.model.ModelCittadinoIndirizzo;
import it.csi.apisan.apisanvac.model.ModelConvocazione;
import it.csi.apisan.apisanvac.model.ModelDocumento;
import it.csi.apisan.apisanvac.model.ModelReazioneAvversa;
import it.csi.apisan.apisanvac.model.ModelSomministrazione;
import it.csi.apisan.apisanvac.model.ModelSomministrazioneAssociazioni;
import it.csi.apisan.apisanvac.model.ModelVaccinazioneImmunizzata;
import it.csi.apisan.apisanvac.model.ModelVaccino;
import it.csi.apisan.apisanvac.model.ModelVaccinoNoDose;
import it.csi.apisan.apisanvac.model.ModelVaccinoSomministrato;
import it.csi.apisan.apisanvac.model.PayloadAutocontribuzione;

public class MapperUtils {

    private static LogUtil _log = new LogUtil(MapperUtils.class);

    //Inizio DettaglioCentroVaccinale
    public static List<ModelAmbulatorio> createModelAmbulatorio(String jsonSource) throws JSONException {

        List<ModelAmbulatorio> result = new ArrayList<>();

        try {
        	if(!"".equals(jsonSource)) {
        		JSONArray jsonArray = new JSONArray(jsonSource);

        		for (int i = 0; i < jsonArray.length(); i++) {
        			JSONObject jsonObject = jsonArray.getJSONObject(i);
        			ModelAmbulatorio modelAmbulatorio = new ModelAmbulatorio();
        			modelAmbulatorio.setDescrizione(getStringFromJsonObject(jsonObject, "Descrizione"));
        			modelAmbulatorio.setCodice(getStringFromJsonObject(jsonObject, "Codice"));
        			
        			/*
        			 * JSONObject obj = new JSONObject(result);
   for(int i=1;i<=14;i++) {

        JSONArray arr = obj.optJSONArray(""+i);
        if(arr != null) {
              extraction(arr, i);
        }
   }
        			 * */
        			
        			JSONArray jsonArrayOrario = jsonObject.optJSONArray("Orari");
        			
        			if(jsonArrayOrario != null) {
        				modelAmbulatorio.setOrari(createListaOrariAmbulatori(jsonArrayOrario.toString()));
        			}
        			
        			result.add(modelAmbulatorio);
        		}
        	}

        } catch (JSONException e) {
            _log.error("createModelAmbulatorio", e.getMessage());
            throw e;
        }

        return result;
    }


    public static List<ModelAmbulatorioOrario> createListaOrariAmbulatori(String jsonSource) throws JSONException {

        List<ModelAmbulatorioOrario> result = new ArrayList<>();

        try {
            JSONArray jsonArray = new JSONArray(jsonSource);

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);

                ModelAmbulatorioOrario orario = new ModelAmbulatorioOrario();
                orario.setGiorno(getStringFromJsonObject(jsonObject, "Giorno"));
                orario.setOraInizioAm(getStringFromJsonObject(jsonObject, "OraInizioAM"));
                orario.setOraFineAm(getStringFromJsonObject(jsonObject, "OraFineAM"));
                orario.setOraInizioPm(getStringFromJsonObject(jsonObject, "OraInizioPM"));
                orario.setOraFinePm(getStringFromJsonObject(jsonObject, "OraFinePM"));

                result.add(orario);
            }

        } catch (JSONException e) {
            _log.error("createListaOrariAmbulatori", e.getMessage());
            throw e;
        }

        return result;
    }

    public static List<ModelCentroVaccinaleOrario> createModelCentroVaccinaleOrario(String jsonSource) throws JSONException {

        List<ModelCentroVaccinaleOrario> result = new ArrayList<>();

//        try {
//
//        } catch (JSONException e) {
//            _log.error("createModelCentroVaccinaleOrario", e.getMessage());
//            throw new Exception(e);
//        }

        return result;
    }

    public static ModelCentroVaccinale createModelCentroVaccinale(String jsonSource) throws JSONException {
        ModelCentroVaccinale result = null;
        try {
            JSONObject json = new JSONObject(jsonSource);
            ModelCentroVaccinale modelCentroVaccinale = new ModelCentroVaccinale();
            modelCentroVaccinale.setMail(getStringFromJsonObject(json, "Mail"));
            modelCentroVaccinale.setNote(getStringFromJsonObject(json, "Note"));
            modelCentroVaccinale.setDescrizione(getStringFromJsonObject(json, "Descrizione"));
            modelCentroVaccinale.setComune(getStringFromJsonObject(json, "Comune"));
            modelCentroVaccinale.setCodice(getStringFromJsonObject(json, "Codice"));
            modelCentroVaccinale.setIndirizzo(getStringFromJsonObject(json, "Indirizzo"));
//            modelCentroVaccinale.setId(getStringFromJsonObject(json, "Id")); /TODO ?????????????????
            modelCentroVaccinale.setTelefono(getStringFromJsonObject(json, "Telefono"));
            modelCentroVaccinale.setAmbulatori(createModelAmbulatorio(getStringFromJsonObject(json, "Ambulatori")));
//              modelCentroVaccinale.setOrarioApertura(createModelCentroVaccinaleOrario(getStringFromJsonObject(json,"Ambulatori")));
//            modelCentroVaccinale.setOrarioApertura(null);
            if(!"".equals(getStringFromJsonObject(json, "AslCodice"))) {
            	modelCentroVaccinale.setAsl(new ModelAsl());
            	modelCentroVaccinale.getAsl().setCodice(getStringFromJsonObject(json, "AslCodice"));
            }
            result = modelCentroVaccinale;
        } catch (JSONException e) {
            _log.error("createModelCentroVaccinale", e.getMessage());
            throw e;

        }

        return result;
    }
    //Fine DettaglioCentroVaccinale
    
    
   /* public static ModelAppuntamentoCreato createModelAppuntamentoCreato(String jsonSource) throws Exception{
    	ModelAppuntamentoCreato result = null;
    	try {
    		JSONObject json = new JSONObject(jsonSource);
    		result = new ModelAppuntamentoCreato();
    		result.setId(getStringFromJsonObject(json, "IdConvocazione"));
    		result.setCentroVaccinale(getStringFromJsonObject(json,  "CodiceCentroVaccinale"));
    		
    		Date dataAppuntamento = null;
            String dateToParse = getStringFromJsonObject(json, "DataAppuntamento");
            if (dateToParse != null) {
                ZonedDateTime zdt = getZonedDateTime(dateToParse);

                dataAppuntamento = Date.from(zdt.toInstant());
            }
    		
    		result.setDataAppuntamento(getStringFromJsonObject(json, "DataAppuntamento"));
    		
    		String vaccini = getStringFromJsonObject(json, "Vaccini");
            if (vaccini != null && !("").equalsIgnoreCase(vaccini) && !("null").equalsIgnoreCase(vaccini)) {
            	result.setVaccini(createModelVaccinoPerPost(vaccini));
            }			
    		
    	}catch(JSONException e) {
            _log.error("createModelAppuntamentoCreato", e.getMessage());
            throw e;    		
    	}
    	return result;
    }*/
    
    ////Inizio CittadiniCitIdGetService
    public static ModelCittadino createModelCittadino(String jsonSource, String jsonSourceContatti) throws Exception {

        ModelCittadino result = new ModelCittadino();
        ModelCittadinoContatti resultContatti = new ModelCittadinoContatti();

        try {
            JSONObject jsonObject = new JSONObject(jsonSource);

            /* Mapping Contatti*/
            resultContatti = createModelCittadinoContatti(jsonSourceContatti);

            /* Mapping */
            result.setCodiceFiscale(getStringFromJsonObject(jsonObject, "Codice_Fiscale"));
            result.setCognome(getStringFromJsonObject(jsonObject, "Cognome"));
            result.setNome(getStringFromJsonObject(jsonObject, "Nome"));

            Date dataDiNascita = null;
            String dateToParse = getStringFromJsonObject(jsonObject, "DataDiNascita");
            if (dateToParse != null) {
                ZonedDateTime zdt = getZonedDateTime(dateToParse);

                dataDiNascita = Date.from(zdt.toInstant());
            }

            result.setDataNascita(dataDiNascita);
            result.setSesso(getStringFromJsonObject(jsonObject, "Sesso"));
            result.setComuneNascita(getStringFromJsonObject(jsonObject, "ComuneDiNascita"));
            result.setCentroVaccinale(getStringFromJsonObject(jsonObject, "CentroVaccinale"));
            result.setCodicePaziente(getStringFromJsonObject(jsonObject, "CodicePaziente"));
            result.setCategoriaRischioCodice(getStringFromJsonObject(jsonObject, "CategoriaRischioCodice"));
            result.setCategoriaRischioDescrizione(getStringFromJsonObject(jsonObject, "CategoriaRischioDescrizione"));

            ModelAsl asl = new ModelAsl();
            asl.setCodice(getStringFromJsonObject(jsonObject, "UslResidenzaCodice"));
            asl.setDescrizione(getStringFromJsonObject(jsonObject, "UslResidenzaDescrizione"));
            result.setAsl(asl);

            result.setDomicilioVaccinazioni(modelModelCittadinoIndirizzo(getStringFromJsonObject(jsonObject, "ComuneDomicilio")));

            /*Mapping contatti*/
            result.setContattiVaccinazioni(resultContatti);


        } catch (JSONException e) {
            _log.error("createModelCittadino", e.getMessage());
            throw new Exception(e);
        }

        return result;
    }

    public static ModelCittadinoContatti createModelCittadinoContatti(String jsonSource) throws Exception {

        ModelCittadinoContatti result = new ModelCittadinoContatti();

        try {
            JSONObject jsonObject = new JSONObject(jsonSource);

            /* Mapping */
            result.setEmail(getStringFromJsonObject(jsonObject, "Email"));
            result.setTelefono(getStringFromJsonObject(jsonObject, "Telefono"));
            result.setTelefono2(getStringFromJsonObject(jsonObject, "Telefono2"));
            result.setTelefono3(getStringFromJsonObject(jsonObject, "Telefono3"));

        } catch (JSONException e) {
            _log.error("createModelCittadinoContatti", e.getMessage());
            throw new Exception(e);
        }

        return result;
    }
    //Fine CittadiniCitIdGetService


    public static ModelCittadinoIndirizzo modelModelCittadinoIndirizzo(String jsonSource) throws Exception {

        ModelCittadinoIndirizzo result = new ModelCittadinoIndirizzo();

        try {
            JSONObject jsonObject = new JSONObject(jsonSource);

            /* Mapping */
            result.setComune(getStringFromJsonObject(jsonObject, "Descrizione"));
            result.setCap(getStringFromJsonObject(jsonObject, "Cap"));
            result.setDataFine(getStringFromJsonObject(jsonObject, "DataFine"));
            result.setDataInizio(getStringFromJsonObject(jsonObject, "DataInizio"));
            result.setIndirizzo(getStringFromJsonObject(jsonObject, "Indirizzo"));

        } catch (JSONException e) {
            _log.error("createModelCittadinoIndirizzo", e.getMessage());
            throw new Exception(e);
        }

        return result;
    }

    private static ZonedDateTime getZonedDateTime(String dateToParse) {
        // Response non valida per le date. Se c'e' T deve esserci anche la Z alla fine  es "DataDiNascita": "0001-01-01T00:00:00"
        if (!dateToParse.toUpperCase().contains("Z")) {
            dateToParse += "Z";
        }

        Instant instant = Instant.parse(dateToParse);
        ZoneId zoneId = ZoneId.of("Europe/Rome");
        return ZonedDateTime.ofInstant(instant, zoneId);
    }

    public static byte[] base64toPDF(String base64) throws Exception {

        byte[] result = null;
        try {
            if (base64 != null && !("").equalsIgnoreCase(base64) && !("null").equalsIgnoreCase(base64)) {
            	base64 = (base64.startsWith("\"") && base64.endsWith("\"") ? base64.substring(1, base64.length()-1) : base64);
                if (Utils.isBase64(base64)) {
                    result = Utils.decodeBase64(base64);
                } else {
                    throw new Exception("Base 64 not valid");
                }
            }

        } catch (JSONException e) {
            _log.error("createModelCittadino", e.getMessage());
            throw new Exception(e);
        }

        return result;
    }


    public static List<ModelAppuntamento> createModelAppuntamento(String jsonSource) throws Exception {
        List<ModelAppuntamento> result = new ArrayList<>();

        try {

            JSONArray jsonArray = new JSONArray(jsonSource);

            /* Mapping */
            for (int i = 0, size = jsonArray.length(); i < size; i++) {

                JSONObject appuntamento = jsonArray.getJSONObject(i);
                ModelAppuntamento modelAppuntamento = new ModelAppuntamento();

                if (!appuntamento.isNull("IdAppuntamento")) {
                    modelAppuntamento.setId(getStringFromJsonObject(appuntamento, "IdAppuntamento"));
                    modelAppuntamento.setCentroVaccinale(getStringFromJsonObject(appuntamento, "Luogo"));
                    modelAppuntamento.setDataAppuntamento(getStringFromJsonObject(appuntamento, "Data"));
                    modelAppuntamento.setAnnullabilita(getStringFromJsonObject(appuntamento, "Annullabile"));
                    modelAppuntamento.setDataConvocazione(getStringFromJsonObject(appuntamento, "DataConvocazione"));
                    modelAppuntamento.setAgenda(getStringFromJsonObject(appuntamento, "AgendaEsposta").equalsIgnoreCase("S"));


                    String vaccini = getStringFromJsonObject(appuntamento, "Associazioni");
                    if (vaccini != null && !("").equalsIgnoreCase(vaccini) && !("null").equalsIgnoreCase(vaccini)) {
                       // modelAppuntamento.setVaccini(createModelVaccino(getStringFromJsonObject(appuntamento, "Vaccini")));
                    	modelAppuntamento.setAssociazioni(createModelAssociazione(getStringFromJsonObject(appuntamento, "Associazioni")));
                    }
                    result.add(modelAppuntamento);
                }
            }
        } catch (JSONException e) {
            _log.error("createModelAppuntamento", e.getMessage());
            throw new Exception(e);

        }

        return result;
    }

    public static List<ModelSomministrazione> createModelSomministrazione(String jsonSource) throws Exception {

        List<ModelSomministrazione> result = new ArrayList<>();
        try {

            JSONArray jsonArray = new JSONArray(jsonSource);

            int size = jsonArray.length();

            for (int i = 0; i < size; i++) {
                JSONObject somministrazione = jsonArray.getJSONObject(i);
                ModelSomministrazione modelSomministrazione = new ModelSomministrazione();
                if (!somministrazione.isNull("Id")) {
                	modelSomministrazione.setId(getStringFromJsonObject(somministrazione, "Id"));
                	modelSomministrazione.setCentroVaccinale(getStringFromJsonObject(somministrazione, "CentroVaccinale"));
                	modelSomministrazione.setMedicoResponsabile(getStringFromJsonObject(somministrazione, "MedicoResponsabile"));
                	modelSomministrazione.setDataAppuntamento(getStringFromJsonObject(somministrazione, "Data"));
                	modelSomministrazione.setOraAppuntamento(getStringFromJsonObjectNull(somministrazione, "OraEsecuzione"));
                	
                	modelSomministrazione.setAmbulatorio(getStringFromJsonObjectNull(somministrazione, "ambulatorio"));
                	modelSomministrazione.setComuneCentro(getStringFromJsonObjectNull(somministrazione, "ComuneCentro" ));
                	modelSomministrazione.setTelefonoCentro(getStringFromJsonObjectNull(somministrazione, "TelefonoCentro" ));
                	modelSomministrazione.setLotto(getStringFromJsonObjectNull(somministrazione, "Lotto"));
                	modelSomministrazione.setNomeCommerciale(getStringFromJsonObjectNull(somministrazione, "NomeCommerciale"));
                	modelSomministrazione.setVaccinatore(getStringFromJsonObjectNull(somministrazione, "Vaccinatore"));
                	modelSomministrazione.setSitoInoculazione(getStringFromJsonObjectNull(somministrazione, "SitoInoculazione"));
                	modelSomministrazione.setViaSomministrazione(getStringFromJsonObjectNull(somministrazione, "ViaSomministrazione"));
                	modelSomministrazione.setIsFittizia(getStringFromJsonObject(somministrazione, "IsFittizia").equalsIgnoreCase("true"));
                	modelSomministrazione.setPazienteCodice(getStringFromJsonObjectNull(somministrazione, "PazienteCodice"));
                	modelSomministrazione.setPazienteNome(getStringFromJsonObjectNull(somministrazione, "PazienteNome"));
                	modelSomministrazione.setPazienteCognome(getStringFromJsonObjectNull(somministrazione, "PazienteCognome"));
                	modelSomministrazione.setPazienteDataNascita(getStringFromJsonObjectNull(somministrazione, "PazienteDataNascita"));
                	modelSomministrazione.setCondizioneRischioCodice(getStringFromJsonObjectNull(somministrazione, "CondizioneRischioCodice"));
                	modelSomministrazione.setCondizioneRischioDescrizione(getStringFromJsonObjectNull(somministrazione, "CondizioneRischioDescrizione"));
                	modelSomministrazione.setCondizioneSanitariaCodice(getStringFromJsonObjectNull(somministrazione, "CondizioneSanitariaCodice"));
                	modelSomministrazione.setCondizioneSanitariaDescrizione(getStringFromJsonObjectNull(somministrazione, "CondizioneSanitariaDescrizione"));
                	
                	ModelReazioneAvversa reazioneAvversa = new ModelReazioneAvversa();
                	reazioneAvversa.setDescrizioneReazione1(getStringFromJsonObject(somministrazione, "DescrizioneReazione"));
                	reazioneAvversa.setDescrizioneReazione2(getStringFromJsonObject(somministrazione, "DescrizioneReazione1"));
                	reazioneAvversa.setDescrizioneReazione3(getStringFromJsonObject(somministrazione, "DescrizioneReazione2"));
                	reazioneAvversa.setData(getStringFromJsonObject(somministrazione, "Data"));
                	reazioneAvversa.setGravita(getStringFromJsonObject(somministrazione, "Gravita"));
                	modelSomministrazione.setReazioneAvversa(reazioneAvversa);

                	List<ModelSomministrazioneAssociazioni> listaassociazioni = new ArrayList<>();
                	listaassociazioni = createModelSomministrazioneAssociazioni(getStringFromJsonObject(somministrazione, "Associazioni"));
                	modelSomministrazione.setAssociazioni(listaassociazioni);

                	result.add(modelSomministrazione);
                }
            }
        } catch (Exception e) {
            _log.error("createModelSomministrazione", e.getMessage());
            throw new Exception(e);

        }

        return result;
    }

    public static List<ModelVaccinazioneImmunizzata> createModelVaccinazioneImmunizzata(String jsonSource) throws Exception {

        List<ModelVaccinazioneImmunizzata> result = new ArrayList<>();

        try {
            JSONArray jsonArray = new JSONArray(jsonSource);

            int size = jsonArray.length();

            for (int i = 0; i < size; i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                ModelVaccinazioneImmunizzata modelVaccinazioneImmunizzata = new ModelVaccinazioneImmunizzata();

                modelVaccinazioneImmunizzata.setId(String.valueOf(jsonObject.getString("Id")));
                modelVaccinazioneImmunizzata.setNote(getStringFromJsonObject(jsonObject, "Note"));
                modelVaccinazioneImmunizzata.setDataRegistrazione(getStringFromJsonObject(jsonObject, "DataResistrazione"));
                modelVaccinazioneImmunizzata.setDataScadenza(getStringFromJsonObject(jsonObject, "DataScadenza"));
                modelVaccinazioneImmunizzata.setDataEsclusione(getStringFromJsonObject(jsonObject, "DataEliminAzione"));
                modelVaccinazioneImmunizzata.setDataAppuntamento(getStringFromJsonObject(jsonObject, "DataVisita"));
                modelVaccinazioneImmunizzata.setMotivazioneCodice(jsonObject.getString("CodiceMotivoEsclusione"));
                modelVaccinazioneImmunizzata.setMotivazioneDescrizione(getStringFromJsonObject(jsonObject, "DescrizioneMotivoEsclusione"));
                modelVaccinazioneImmunizzata.setVaccinazione(getStringFromJsonObject(jsonObject, "CodiceVaccinazione"));
                modelVaccinazioneImmunizzata.setDose(new BigDecimal(jsonObject.getString("NumeroDose")));

                String flagVisibilitaKey = "";
                Iterator ketysOfJson = jsonObject.keys();

                while (ketysOfJson.hasNext()) {

                    String element = (String) ketysOfJson.next();
                    if (element.startsWith("FlagVisibilit")) {
                        flagVisibilitaKey = element;
                        break;
                    }
                }
                String visibile = getStringFromJsonObject(jsonObject, flagVisibilitaKey);

                if (visibile == null || "N".equalsIgnoreCase(visibile) || "null".equalsIgnoreCase(visibile)) {
                    modelVaccinazioneImmunizzata.setVisibile(false);
                }
                if ("S".equalsIgnoreCase(visibile)) {
                    modelVaccinazioneImmunizzata.setVisibile(true);
                }

                result.add(modelVaccinazioneImmunizzata);
            }

        } catch (JSONException e) {
            _log.error("createModelVaccinazioneImmunizzata", e.getMessage());
            throw new Exception(e);

        }

        return result;
    }

    public static List<ModelDocumento> createModelDocumento(String jsonSource) throws Exception {

        List<ModelDocumento> result = new ArrayList<ModelDocumento>();

        try {
            JSONArray jsonArray = new JSONArray(jsonSource);

            /* Mapping */
            for (int i = 0, size = jsonArray.length(); i < size; i++) {

                JSONObject documento = jsonArray.getJSONObject(i);
                ModelDocumento modelDocumento = new ModelDocumento();

                modelDocumento.setId(getStringFromJsonObject(documento, "ID"));
                modelDocumento.setDataArchiviazione(getStringFromJsonObject(documento, "DataArchiviazione"));
                modelDocumento.setDescrizione(getStringFromJsonObject(documento, "Descrizione"));
                modelDocumento.setTipologia(getStringFromJsonObject(documento, "Tipologia"));
                modelDocumento.setNomeDocumento(getStringFromJsonObject(documento, "NomeDocumento"));
                modelDocumento.setStatoDocumentoDescrizione(getStringFromJsonObject(documento, "StatoDocumentoDescrizione"));
                modelDocumento.setStatoDocumentoId(getStringFromJsonObject(documento, "StatoDocumentoId"));
                modelDocumento.setSoggettoEmittente(getStringFromJsonObject(documento, "SoggettoEmittente"));

                result.add(modelDocumento);
            }


        } catch (JSONException e) {
            _log.error("createModelDocumento", e.getMessage());
            throw new Exception(e);
        }

        return result;
    }


    public static PayloadAutocontribuzione getStampaDocumentoService(String jsonSource) throws Exception {

        PayloadAutocontribuzione result = new PayloadAutocontribuzione();

        try {
            JSONObject jsonObject = new JSONObject(jsonSource);

            /* Mapping */
            result.setDescrizione(getStringFromJsonObject(jsonObject, "Descrizione"));
            result.setDocumento64(getStringFromJsonObject(jsonObject, "Documento64"));
            result.setNomeDocumento(getStringFromJsonObject(jsonObject, "NomeDocumento"));
            result.setSoggettoEmittente(getStringFromJsonObject(jsonObject, "SoggettoEmittente"));
            result.setTipologia(getStringFromJsonObject(jsonObject, "Tipologia"));


        } catch (JSONException e) {
            _log.error("createPayload6", e.getMessage());
            throw new Exception(e);
        }

        return result;
    }

    public static List<ModelVaccinoSomministrato> createModelVaccinazioni(String jsonSource) throws Exception {

        JSONArray vacciniArray = new JSONArray(jsonSource);
        List<ModelVaccinoSomministrato> listaModelVaccino = new ArrayList<>();

        try {
            for (int vacciniInt = 0, sizeVacciniArray = vacciniArray.length(); vacciniInt < sizeVacciniArray; vacciniInt++) {
                JSONObject vaccino = vacciniArray.getJSONObject(vacciniInt);
                ModelVaccinoSomministrato modelVaccino = new ModelVaccinoSomministrato();
                modelVaccino.setCodice(vaccino.getString("Codice"));
                modelVaccino.setDescrizione(vaccino.getString("Descrizione"));
                modelVaccino.setDose(new BigDecimal(vaccino.getString("Dose")));
                listaModelVaccino.add(modelVaccino);
            }

        } catch (JSONException e) {
            _log.error("createModelConvocazione", e.getMessage());
            throw new Exception(e);
        }

        return listaModelVaccino;
    }

    public static List<ModelVaccino> createModelVaccino(String jsonSource) throws Exception {
        JSONArray vacciniArray = new JSONArray(jsonSource);
        List<ModelVaccino> listaModelVaccino = new ArrayList<>();

        try {
            for (int vacciniInt = 0, sizeVacciniArray = vacciniArray.length(); vacciniInt < sizeVacciniArray; vacciniInt++) {
                JSONObject vaccino = vacciniArray.getJSONObject(vacciniInt);
                ModelVaccino modelVaccino = new ModelVaccino();
                modelVaccino.setCodice(getStringFromJsonObject(vaccino, "CodiceVaccino"));
                modelVaccino.setDescrizione(getStringFromJsonObject(vaccino, "DescrizioneVaccino"));
                listaModelVaccino.add(modelVaccino);
            }

        } catch (JSONException e) {
            _log.error("createModelConvocazione", e.getMessage());
            throw new Exception(e);
        }

        return listaModelVaccino;
    }
    
    //FIXME Egidio
    public static List<ModelAssociazione> createModelAssociazione(String jsonSource) throws Exception {
        JSONArray associazioniArray = new JSONArray(jsonSource);
        List<ModelAssociazione> listaModelAssociazione = new ArrayList<>();

        try {
            for (int vacciniInt = 0, sizeVacciniArray = associazioniArray.length(); vacciniInt < sizeVacciniArray; vacciniInt++) {
                JSONObject associazione = associazioniArray.getJSONObject(vacciniInt);
                ModelAssociazione modelAssociazione = new ModelAssociazione();
                modelAssociazione.setCodice(getStringFromJsonObject(associazione, "Codice"));
                modelAssociazione.setDescrizione(getStringFromJsonObject(associazione, "Descrizione"));
                modelAssociazione.setImportoIndicativo(new BigDecimal (getStringFromJsonObject(associazione, "ImportoIndicativo")));
                String vaccini = getStringFromJsonObject(associazione, "Vaccinazioni");
                if (vaccini != null && !("").equalsIgnoreCase(vaccini) && !("null").equalsIgnoreCase(vaccini)) {
                	modelAssociazione.setVaccinazioni(createModelVaccinoPerPost(getStringFromJsonObject(associazione, "Vaccinazioni")));
                	
                }
                   
                listaModelAssociazione.add(modelAssociazione);
            }

        } catch (JSONException e) {
            _log.error("createModelAssociazione", e.getMessage());
            throw new Exception(e);
        }

        return listaModelAssociazione;
    }
    
    public static List<ModelVaccino> createModelVaccinoPerPost(String jsonSource) throws Exception {
    	  JSONArray vacciniArray = new JSONArray(jsonSource);
          List<ModelVaccino> listaModelVaccino = new ArrayList<>();

          try {
              for (int vacciniInt = 0, sizeVacciniArray = vacciniArray.length(); vacciniInt < sizeVacciniArray; vacciniInt++) {
                  JSONObject vaccino = vacciniArray.getJSONObject(vacciniInt);
                  ModelVaccino modelVaccino = new ModelVaccino();
                  modelVaccino.setCodice(getStringFromJsonObject(vaccino, "Codice"));
                  modelVaccino.setDescrizione(getStringFromJsonObject(vaccino, "Descrizione"));
                  String dose = vaccino.getString("Dose");
                  try {
                	  modelVaccino.setDose(Integer.parseInt(dose) );  
                  }catch(NumberFormatException e) {
                	  
                  }
                  
                  listaModelVaccino.add(modelVaccino);
              }

          } catch (JSONException e) {
              _log.error("createModelConvocazione", e.getMessage());
              throw new Exception(e);
          }

          return listaModelVaccino;
    }
    
    
    public static List<ModelVaccinoNoDose> createModelVaccinoNoDose(String jsonSource) throws Exception {
        JSONArray vacciniArray = new JSONArray(jsonSource);
        List<ModelVaccinoNoDose> listaModelVaccino = new ArrayList<>();

        try {
            for (int vacciniInt = 0, sizeVacciniArray = vacciniArray.length(); vacciniInt < sizeVacciniArray; vacciniInt++) {
                JSONObject vaccino = vacciniArray.getJSONObject(vacciniInt);
                ModelVaccinoNoDose modelVaccino = new ModelVaccinoNoDose();
                modelVaccino.setCodice(getStringFromJsonObject(vaccino, "CodiceVaccino"));
                modelVaccino.setDescrizione(getStringFromJsonObject(vaccino, "DescrizioneVaccino"));
                listaModelVaccino.add(modelVaccino);
            }

        } catch (JSONException e) {
            _log.error("createModelConvocazione", e.getMessage());
            throw new Exception(e);
        }

        return listaModelVaccino;
    }

    public static List<ModelSomministrazioneAssociazioni> createModelSomministrazioneAssociazioni(String jsonSource) throws Exception {

        JSONArray somministrazioniArray = new JSONArray(jsonSource);
        List<ModelSomministrazioneAssociazioni> modelSomministrazioneAssociazionis = new ArrayList<>();
        List<ModelVaccino> modelVaccinos = new ArrayList<>();

        try {
            for (int i = 0; i < somministrazioniArray.length(); i++) {
                JSONObject jsonObject = somministrazioniArray.getJSONObject(i);
                ModelSomministrazioneAssociazioni modelSomministrazioneAssociazioni = new ModelSomministrazioneAssociazioni();
                modelSomministrazioneAssociazioni.setCodice(jsonObject.getString("Codice"));
                modelSomministrazioneAssociazioni.setDescrizione(jsonObject.getString("Descrizione"));
                modelSomministrazioneAssociazioni.setDose(BigDecimal.valueOf(Long.parseLong(jsonObject.getString("Dose"))));

                List<ModelVaccinoSomministrato> modelVaccino = createModelVaccinazioni(jsonObject.getString("Vaccinazioni"));
                modelSomministrazioneAssociazioni.setVaccinazioni(modelVaccino);

                modelSomministrazioneAssociazionis.add(modelSomministrazioneAssociazioni);
            }

        } catch (JSONException e) {
            _log.error("createModelConvocazione", e.getMessage());
            throw new Exception(e);
        }

        return modelSomministrazioneAssociazionis;
    }


    public static List<ModelConvocazione> createModelConvocazione(String jsonSource) throws Exception {

        List<ModelConvocazione> result = new ArrayList<ModelConvocazione>();

        try {
            //JSONObject jsonObject = new JSONObject(jsonSource);
            JSONArray jsonArray = new JSONArray(jsonSource);

            /* Mapping */
            for (int i = 0, size = jsonArray.length(); i < size; i++) {

                JSONObject convocazione = jsonArray.getJSONObject(i);
                ModelConvocazione modelConvocazione = new ModelConvocazione();

                modelConvocazione.setPaziente(getStringFromJsonObject(convocazione, "CodicePaziente"));
                modelConvocazione.setDataConvocazione(getStringFromJsonObject(convocazione, "DataConvocazione"));
                modelConvocazione.setConsultorio(getStringFromJsonObject(convocazione, "CodiceConsultorio"));
                modelConvocazione.setCentroVaccinale(getStringFromJsonObject(convocazione, "CodiceAmbulatorio"));
               
                modelConvocazione.setDataAppuntamento(getStringFromJsonObject(convocazione, "DataAppuntamento"));
                modelConvocazione.setIdConvocazione(getStringFromJsonObject(convocazione, "IdConvocazione"));

                List<ModelVaccinoNoDose> vaccinos = createModelVaccinoNoDose(getStringFromJsonObject(convocazione, "Vaccini"));

                modelConvocazione.setVaccini(vaccinos);
                result.add(modelConvocazione);
            }

        } catch (JSONException e) {
            _log.error("createModelConvocazione", e.getMessage());
            throw new Exception(e);
        }

        return result;
    }

    private static String getStringFromJsonObjectNull(JSONObject jsonObject, String tipoCampo) throws JSONException {
        return (jsonObject.has(tipoCampo) && !jsonObject.isNull(tipoCampo)) ? jsonObject.getString(tipoCampo) : null;
    }    
    
    private static String getStringFromJsonObject(JSONObject jsonObject, String tipoCampo) throws JSONException {
        return (jsonObject.has(tipoCampo) && !jsonObject.isNull(tipoCampo)) ? jsonObject.getString(tipoCampo) : "";
    }

}
