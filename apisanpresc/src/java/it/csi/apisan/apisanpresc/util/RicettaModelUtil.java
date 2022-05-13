/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.util;

import it.csi.apisan.apisanpresc.business.apisanpresc.service.elencoricette.ElencoRicetteUtil;
import it.csi.apisan.apisanpresc.common.ApiSanPrescConstants;
import it.csi.apisan.apisanpresc.dto.apisanpresc.*;
import it.csi.apisan.apisanpresc.soap.dma.elencoricetteservice.Ricetta;
import it.csi.apisan.apisanpresc.soap.sar.visprescsol.InfoRicettaType;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class RicettaModelUtil {

    static LogUtil _log = new LogUtil(RicettaModelUtil.class);

    /**
     * * Il metoro ritorna un ModelRicetta nuovo i dati da SAR
     *
     * @param ricettaSar
     * @param codiceFiscaleUtente
     * @param isNascosta
     * @param isCompleta
     * @return
     */
    public static ModelRicetta makeModelRicetteFromSAR(InfoRicettaType ricettaSar, String codiceFiscaleUtente, boolean isNascosta, boolean isCompleta) {
        return makeModelRicetteFromSAR(null, ricettaSar, codiceFiscaleUtente, isNascosta, isCompleta);
    }

    /**
     * Il metoro ritorna un ModelRicetta aggiornato con i dati da SAR
     *
     * @param ricettaToUpdate
     * @param ricettaSar
     * @param codiceFiscaleUtente
     * @param isNascosta
     * @param isCompleta
     * @return
     */
    public static ModelRicetta makeModelRicetteFromSAR(ModelRicetta ricettaToUpdate, InfoRicettaType ricettaSar, String codiceFiscaleUtente, boolean isNascosta, boolean isCompleta) {
        Date dataFineValidita = ApisanPrescUtil.toDateFromString(ricettaSar.getDataCompilazione(), "yyyy-MM-dd hh:mm:ss");

        ModelRicetta result = ricettaToUpdate != null ? ricettaToUpdate : new ModelRicetta();
        result.setNre(ricettaSar.getNre() != null ? ricettaSar.getNre() : "NO NRE");
        ModelCittadino modelCittadino = new ModelCittadino();
        modelCittadino.setCodiceFiscale(codiceFiscaleUtente);
        modelCittadino.setCognome(ricettaSar.getCognNome());

        HashMap<String, String> indirizzoMap = ReportPrescUtils.getIndirizzo(ricettaSar.getIndirizzo() != null ? ricettaSar.getIndirizzo() : "");
        modelCittadino.setIndirizzo(indirizzoMap.get(ReportPrescUtils.INDIRIZZO_RESULT));
        modelCittadino.setCap(indirizzoMap.get(ReportPrescUtils.CAP_RESULT));
        modelCittadino.setSiglaProvincia(indirizzoMap.get(ReportPrescUtils.PROV_RESULT));
        modelCittadino.setComune(indirizzoMap.get(ReportPrescUtils.CITTA_RESULT));
        
        result.setAssistito(modelCittadino);
        result.setDataCompilazione(ApisanPrescUtil.toDateFromString(ricettaSar.getDataCompilazione(), "yyyy-MM-dd hh:mm:ss"));
        result.setDataFineValidita(ApisanPrescUtil.computedDataFineValidita(ricettaSar.getTipoPrescrizione(), ricettaSar.getStatoProcesso(), dataFineValidita));
        result.setNre(ricettaSar.getNre());
        result.setDiagnosi(SARResponseUtils.getQuesitoDiag(ricettaSar));

        ModelEsenzione modelEsenzione = new ModelEsenzione();
        modelEsenzione.setCodice(ricettaSar.getCodEsenzione() != null ? ricettaSar.getCodEsenzione() : "");
        modelEsenzione.setDescrizione(ricettaSar.getCodEsenzione() != null ? ricettaSar.getCodEsenzione() : "NON ESENTE");
        result.setEsenzione(modelEsenzione);

        ModelMedico medicoPrescrittore = new ModelMedico();
//        medicoPrescrittore.setCodiceFiscale(ricettaSar.getCfMedico1() + (ricettaSar.getCfMedico2() != null ? " " + ricettaSar.getCfMedico2() : ""));
        medicoPrescrittore.setCodiceFiscale((ricettaSar.getCfMedico2() != null && !"".equals(ricettaSar.getCfMedico2())
        		? ricettaSar.getCfMedico2() : (ricettaSar.getCfMedico1() != null ? ricettaSar.getCfMedico1() : "")));
        medicoPrescrittore.setCognome(ricettaSar.getCognomeMedico1() != null ? ricettaSar.getCognomeMedico1() : "");
        medicoPrescrittore.setNome(ricettaSar.getNomeMedico1() != null ? ricettaSar.getNomeMedico1() : "");
        result.setMedicoPrescrittore(medicoPrescrittore);

        List<ModelPrescrizione> elencoPrescrizioni = new ArrayList<>();
        ricettaSar.getElencoDettagliPrescrizioni().getDettaglioPrescrizione().stream().forEach(dettaglioPrescrizioneType -> {
            ModelPrescrizione modelPrescrizione = new ModelPrescrizione();
            modelPrescrizione.setCodiceCatalogoRegionale(dettaglioPrescrizioneType.getCodCatalogoPrescr() != null ? dettaglioPrescrizioneType.getCodCatalogoPrescr() : "");
            modelPrescrizione.setCodiceGruppoEquivalenza(dettaglioPrescrizioneType.getCodGruppoEquival() != null ? dettaglioPrescrizioneType.getCodGruppoEquival() : "");
            modelPrescrizione.setDescrizioneGruppoEquivalenza(dettaglioPrescrizioneType.getDescrGruppoEquival() != null ? dettaglioPrescrizioneType.getDescrGruppoEquival() : "");
            
            String descrizioneCatalogoRegionale = (dettaglioPrescrizioneType.getCodProdPrest() + " (" + dettaglioPrescrizioneType.getCodCatalogoPrescr() + ") - " + dettaglioPrescrizioneType.getDescrProdPrest());
            if(ApiSanPrescConstants.TIPOLOGIA_PRESCRIZIONE_FARMACEUTICA_F.equals(ricettaSar.getTipoPrescrizione())) {
            	// gestione AIC
                modelPrescrizione.setDescrizioneCatalogoRegionale("");
                modelPrescrizione.setCodiceAic(dettaglioPrescrizioneType.getCodProdPrest() != null ? dettaglioPrescrizioneType.getCodProdPrest() : "");
                modelPrescrizione.setDescrizioneAic(dettaglioPrescrizioneType.getDescrProdPrest() != null ? dettaglioPrescrizioneType.getDescrProdPrest() : "");
            } else {
                modelPrescrizione.setDescrizioneCatalogoRegionale(descrizioneCatalogoRegionale);
                modelPrescrizione.setCodiceAic("");
                modelPrescrizione.setDescrizioneAic("");
            }
            modelPrescrizione.setNota(SARResponseUtils.generateNota(dettaglioPrescrizioneType));
            modelPrescrizione.setQuantita(Integer.parseInt(dettaglioPrescrizioneType.getQuantita()));
            modelPrescrizione.setTipoAccesso(dettaglioPrescrizioneType.getTipoAccesso() != null ? dettaglioPrescrizioneType.getTipoAccesso() : "");

            elencoPrescrizioni.add(modelPrescrizione);

        });
        result.setPrescrizioni(elencoPrescrizioni);

        ModelPrioritaRicetta modelPrioritaRicetta = new ModelPrioritaRicetta();
        modelPrioritaRicetta.setNome(SARResponseUtils.getPrioritaByClasse(ricettaSar.getClassePriorita() != null ? ricettaSar.getClassePriorita() : ""));
        modelPrioritaRicetta.setCodice(ricettaSar.getClassePriorita() != null && !"".equals(ricettaSar.getClassePriorita().trim()) ? ModelPrioritaRicetta.CodiceEnum.valueOf(ricettaSar.getClassePriorita()) : null);
        modelPrioritaRicetta.setDescrizione(SARResponseUtils.getPrioritaDescrizioneByClasse(ricettaSar.getClassePriorita() != null ? ricettaSar.getClassePriorita() : ""));

        result.setPriorita(modelPrioritaRicetta);
        
        ModelTipologiaRicetta modelTipologiaRicetta = new ModelTipologiaRicetta();
        if (ApiSanPrescConstants.TIPOLOGIA_PRESCRIZIONE_FARMACEUTICA_F.equals(ricettaSar.getTipoPrescrizione())) {
            modelTipologiaRicetta.setCodice(ModelTipologiaRicetta.CodiceEnum.F);
            modelTipologiaRicetta.setNome(SarTipologiaRicettaUtility.getName(ModelTipologiaRicetta.CodiceEnum.F));
            modelTipologiaRicetta.setDescrizione("");
        } else {
            modelTipologiaRicetta.setCodice(ModelTipologiaRicetta.CodiceEnum.P);
            modelTipologiaRicetta.setNome(SarTipologiaRicettaUtility.getName(ModelTipologiaRicetta.CodiceEnum.P));
            modelTipologiaRicetta.setDescrizione("");
        }

        result.setNascosta(isNascosta);
        result.setRegionale(true);
        result.setTipologia(modelTipologiaRicetta);

        ModelStatoRicetta statoRicetta = new ModelStatoRicetta();
        if (ModelStatoRicetta.CodiceEnum._3.toString().equals(ricettaSar.getStatoProcesso())) {
            statoRicetta.setCodice(ModelStatoRicetta.CodiceEnum._3);
            statoRicetta.setNome(SarStatoRicettaUtility.getName(ModelStatoRicetta.CodiceEnum._3));
            statoRicetta.setDescrizione("");
        } else if (ModelStatoRicetta.CodiceEnum._5.toString().equals(ricettaSar.getStatoProcesso())) {
            statoRicetta.setCodice(ModelStatoRicetta.CodiceEnum._5);
            statoRicetta.setNome(SarStatoRicettaUtility.getName(ModelStatoRicetta.CodiceEnum._5));
            statoRicetta.setDescrizione("");
        }
        result.setStato(statoRicetta);

        result.setCompleta(isCompleta);

        return result;
    }

    /**
     * Il metodo ritorna un model Ricetta a partire da una response DMA. Il tipo di _ricettaDMA puo' essere:
     * <b>it.csi.apisan.apisanpresc.soap.dma.dettaglioricettaprescritta.Ricetta</b> oppure
     * <b>it.csi.apisan.apisanpresc.soap.dma.elencoricettestampapromemoriaservice.Ricetta</b>
     *
     * @param _ricettaDMA
     * @param isHidden
     * @param isRegionale
     * @param tipologia
     * @param isCompleta
     * @return ModelRicetta
     */
    public static ModelRicetta makeModelElencoRicetteFromDMA(Object _ricettaDMA, boolean isHidden, Boolean isRegionale, String tipologia, Boolean isCompleta) {

        ModelRicetta result = new ModelRicetta();

        if (_ricettaDMA instanceof Ricetta) {
            Ricetta ricettaDMA = (Ricetta) _ricettaDMA;
            result.setNascosta(isHidden);
            result.setDataCompilazione(ElencoRicetteUtil.toDate(ricettaDMA.getDataCompilazione()));
            result.setDataFineValidita(ApisanPrescUtil.computedDataFineValidita(ricettaDMA.getTipologia().getCodice(), ricettaDMA.getStato().getCodice(), ElencoRicetteUtil.toDate(ricettaDMA.getDataCompilazione())));
            result.setAssistito(new ModelCittadino());
            result.getAssistito().setCodiceFiscale(ricettaDMA.getCodiceFiscalePaziente());
            result.setMedicoPrescrittore(new ModelMedico());
            result.getMedicoPrescrittore().setCodiceFiscale(ricettaDMA.getMedicoPrescrittore());
            result.setNre(ricettaDMA.getNre());
            result.setRegionale(isRegionale);
            ModelStatoRicetta statoRicetta = new ModelStatoRicetta();
            if (ModelStatoRicetta.CodiceEnum._3.toString().equals(ricettaDMA.getStato().getCodice())) {
                statoRicetta.setCodice(ModelStatoRicetta.CodiceEnum._3);
                statoRicetta.setNome(SarStatoRicettaUtility.getName(ModelStatoRicetta.CodiceEnum._3));
                statoRicetta.setDescrizione("");
            } else {
                statoRicetta.setCodice(ModelStatoRicetta.CodiceEnum._5);
                statoRicetta.setNome(SarStatoRicettaUtility.getName(ModelStatoRicetta.CodiceEnum._5));
                statoRicetta.setDescrizione("");
            }
            result.setStato(statoRicetta);
            ModelTipologiaRicetta tipologiaRicetta = new ModelTipologiaRicetta();
            if (ApiSanPrescConstants.TIPOLOGIA_PRESCRIZIONE_FARMACEUTICA_F.equals(ricettaDMA.getTipologia().getCodice())) {
                tipologiaRicetta.setCodice(ModelTipologiaRicetta.CodiceEnum.F);
                tipologiaRicetta.setNome(SarTipologiaRicettaUtility.getName(ModelTipologiaRicetta.CodiceEnum.F));
                tipologiaRicetta.setDescrizione("");
            } else {
                tipologiaRicetta.setCodice(ModelTipologiaRicetta.CodiceEnum.P);
                tipologiaRicetta.setNome(SarTipologiaRicettaUtility.getName(ModelTipologiaRicetta.CodiceEnum.P));
                tipologiaRicetta.setDescrizione("");
            }
            result.setTipologia(tipologiaRicetta);
            result.setCompleta(isCompleta);
        } else if (_ricettaDMA instanceof it.csi.apisan.apisanpresc.soap.dma.dettaglioricettaprescritta.Ricetta) {
            it.csi.apisan.apisanpresc.soap.dma.dettaglioricettaprescritta.Ricetta ricettaDMA = (it.csi.apisan.apisanpresc.soap.dma.dettaglioricettaprescritta.Ricetta) _ricettaDMA;
            result.setNascosta(isHidden);
            result.setDataCompilazione(ElencoRicetteUtil.toDate(ricettaDMA.getDataCompilazione()));
            result.setDataFineValidita(ApisanPrescUtil.computedDataFineValidita(ricettaDMA.getTipologia().getCodice(), ricettaDMA.getStato().getCodice(), ElencoRicetteUtil.toDate(ricettaDMA.getDataCompilazione())));
            result.setAssistito(new ModelCittadino());
            result.getAssistito().setCodiceFiscale(ricettaDMA.getCodiceFiscalePaziente());
            result.setMedicoPrescrittore(new ModelMedico());
            result.getMedicoPrescrittore().setCodiceFiscale(ricettaDMA.getMedicoPrescrittore());
            result.setNre(ricettaDMA.getNre());
            result.setRegionale(isRegionale);
            ModelStatoRicetta statoRicetta = new ModelStatoRicetta();
            if (ModelStatoRicetta.CodiceEnum._3.toString().equals(ricettaDMA.getStato().getCodice())) {
                statoRicetta.setCodice(ModelStatoRicetta.CodiceEnum._3);
                statoRicetta.setNome(SarStatoRicettaUtility.getName(ModelStatoRicetta.CodiceEnum._3));
                statoRicetta.setDescrizione("");
            } else {
                statoRicetta.setCodice(ModelStatoRicetta.CodiceEnum._5);
                statoRicetta.setNome(SarStatoRicettaUtility.getName(ModelStatoRicetta.CodiceEnum._5));
                statoRicetta.setDescrizione("");
            }
            result.setStato(statoRicetta);
            ModelTipologiaRicetta tipologiaRicetta = new ModelTipologiaRicetta();
            if (ApiSanPrescConstants.TIPOLOGIA_PRESCRIZIONE_FARMACEUTICA_F.equals(ricettaDMA.getTipologia().getCodice())) {
                tipologiaRicetta.setCodice(ModelTipologiaRicetta.CodiceEnum.F);
                tipologiaRicetta.setNome(SarTipologiaRicettaUtility.getName(ModelTipologiaRicetta.CodiceEnum.F));
                tipologiaRicetta.setDescrizione("");
            } else {
                tipologiaRicetta.setCodice(ModelTipologiaRicetta.CodiceEnum.P);
                tipologiaRicetta.setNome(SarTipologiaRicettaUtility.getName(ModelTipologiaRicetta.CodiceEnum.P));
                tipologiaRicetta.setDescrizione("");
            }
            result.setTipologia(tipologiaRicetta);
            result.setCompleta(isCompleta);
        } else {
            _log.error("makeModelElencoRicetteFromDMA", "makeModelElencoRicetteFromDMA:\tModel not found");
        }
        return result;
    }


    /**
     * Il metodo ritorna una ricetta con flag completo = TRUE in quanto i dati di DMA sono stati integrati con quelli di SAR
     *
     * @param ricettaDMA
     * @param infoRicettaTypeSAR
     * @param codiceFiscaleUtente
     * @return ModelRicetta
     */
    public static ModelRicetta mergeDMAandSAR(Object ricettaDMA, InfoRicettaType infoRicettaTypeSAR, String codiceFiscaleUtente, String tipologia) {
        final ModelRicetta ricettaResultDMA     = makeModelElencoRicetteFromDMA(ricettaDMA, false, true, tipologia, true);
        final ModelRicetta ricettaMergedWithSAR = makeModelRicetteFromSAR(ricettaResultDMA, infoRicettaTypeSAR, codiceFiscaleUtente, false, true);

        return ricettaMergedWithSAR;

    }

    public static String getPrioritaByClasse(String classePriorita) {
        String result = "";

        switch (classePriorita.toUpperCase().trim()) {
            case "U":
                result = "URGENTE";
                break;
            case "B":
                result = "BREVE";
                break;
            case "D":
                result = "DIFFERITA";
                break;
            case "P":
                result = "PROGRAMMABILE";
                break;
            default:
                result = "";
        }

        return result;
    }
    
    /**
     * 
     * @param tipoAccesso
     * @return
     */
    private static String getTipoAccessoByCode(String tipoAccesso) {
        String result = "";
        if (tipoAccesso != null && !"".equals(tipoAccesso)) {
        	switch (tipoAccesso.trim()) {
        	case "1":
        		result = "PRIMO ACCESSO";
        		break;
        	case "0":
        		result = "ALTRA TIPOLOGIA DI ACCESSO";
        		break;
            }
        }
        return result;

    }
}

