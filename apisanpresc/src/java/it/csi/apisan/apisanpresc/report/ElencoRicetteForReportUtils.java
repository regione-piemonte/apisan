/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.report;

import it.csi.apisan.apisanpresc.common.RegioneEnum;
import it.csi.apisan.apisanpresc.soap.sar.visprescsol.InfoRicettaType;
import it.csi.apisan.apisanpresc.util.LogUtil;
import it.csi.apisan.apisanpresc.util.NREUtils;
import it.csi.apisan.apisanpresc.util.ReportPrescUtils;
import it.csi.apisan.apisanpresc.util.SARResponseUtils;

import java.io.ByteArrayInputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ElencoRicetteForReportUtils {

    private static LogUtil _log = new LogUtil(NREUtils.class);

    public static List<RicetteForReport> getListaRicette(List<InfoRicettaType> infoRicettaTypes, String cfUtente) {

        List<RicetteForReport> result = new ArrayList<>();

        infoRicettaTypes.forEach(infoRicettaType -> {

            try {

                RicetteForReport ricetteForReport = new RicetteForReport();
                ricetteForReport.setRegione(getDescrizioneRegioneByCodice(infoRicettaType.getCodRegione()));
                HashMap<String, String> nreDetails = NREUtils.getNreDetails(infoRicettaType.getNre());
                ricetteForReport.setNreRegProv(nreDetails.get(NREUtils.CODICE_PROVINCA_REGIONE));
                ricetteForReport.setNreRagLotto(nreDetails.get(NREUtils.CODICE_RAGGRUPPAMENTO_LOTTO));
                ricetteForReport.setNreIdLotto(nreDetails.get(NREUtils.CODICE_ID_LOTTO));
                ricetteForReport.setNreCodLottoProgressivo(nreDetails.get(NREUtils.CODICE_LOTTO_PROGRESSIVO));

                ricetteForReport.setCodiceParteUno(nreDetails.get(NREUtils.CODICE_PARTE_UNO));
                ricetteForReport.setCodiceParteDue(nreDetails.get(NREUtils.CODICE_PARTE_DUE));
                ricetteForReport.setCodiceParteTre(cfUtente);

                byte[] parteUno = Barcode39Custom.generateBarcode39(nreDetails.get(NREUtils.CODICE_PARTE_UNO));
                byte[] parteDue = Barcode39Custom.generateBarcode39(nreDetails.get(NREUtils.CODICE_PARTE_DUE));
                byte[] parteTre = Barcode39Custom.generateBarcode39(cfUtente);

                ricetteForReport.setCodiceParteUnoS(new ByteArrayInputStream(parteUno));
                ricetteForReport.setCodiceParteDueS(new ByteArrayInputStream(parteDue));
                ricetteForReport.setCodiceParteTreS(new ByteArrayInputStream(parteTre));

                ricetteForReport.setCf(cfUtente);
                ricetteForReport.setOscuramDati(infoRicettaType.getOscuramDati() != null ? infoRicettaType.getOscuramDati() : "0");

                HashMap<String, String> indirizzoMap = ReportPrescUtils.getIndirizzo(infoRicettaType.getIndirizzo() != null ? infoRicettaType.getIndirizzo() : "");

                boolean isDatiOscurati = infoRicettaType.getOscuramDati() != null && infoRicettaType.getOscuramDati().equals("1");
                ricetteForReport.setIsDatiOscurati(isDatiOscurati);
                if (isDatiOscurati) {
                    ricetteForReport.setStringaDatiOscurati("DATI DELL'ASSISTITO OSCURATI AI SENSI DELL'ARTICOLO 87 DEL DL 30 giugno 2003, n. 196");
                }
                ricetteForReport.setVia(indirizzoMap.get(ReportPrescUtils.INDIRIZZO_RESULT));
                ricetteForReport.setCognomeNomeRichiedente(infoRicettaType.getCognNome());
                ricetteForReport.setCap(indirizzoMap.get(ReportPrescUtils.CAP_RESULT));
                ricetteForReport.setCivico("");
                ricetteForReport.setCitta(indirizzoMap.get(ReportPrescUtils.CITTA_RESULT));
                ricetteForReport.setProvincia(indirizzoMap.get(ReportPrescUtils.PROV_RESULT));


                ricetteForReport.setEsenzione(infoRicettaType.getCodEsenzione() != null ? infoRicettaType.getCodEsenzione() : "NON ESENTE");

                ricetteForReport.setSiglaProvincia(infoRicettaType.getProvAssistito() != null ? infoRicettaType.getProvAssistito() : "");
                ricetteForReport.setCodiceASL(infoRicettaType.getCodASLAo() != null ? infoRicettaType.getCodASLAo() : "");
                ricetteForReport.setDisposizioniRegionali(infoRicettaType.getDispReg() != null ? infoRicettaType.getDispReg() : "");
                ricetteForReport.setPrioritaPresc(SARResponseUtils.getPrioritaByClasse(infoRicettaType.getClassePriorita() != null && !"".equals(infoRicettaType.getClassePriorita().trim()) ? infoRicettaType.getClassePriorita() : ""));
                ricetteForReport.setAltro(getBiffatura(infoRicettaType.getAltro() != null ? infoRicettaType.getAltro() : ""));
                ricetteForReport.setQuesitoDiagnostico(getQuesitoDiag(infoRicettaType));

                SimpleDateFormat sFrom = new SimpleDateFormat("yyyy-MM-dd HH:mm:SS");
                SimpleDateFormat sTo   = new SimpleDateFormat("dd/MM/yyyy");
                ricetteForReport.setData(sTo.format(sFrom.parse(infoRicettaType.getDataCompilazione())));    //data compilazione o altro
                ricetteForReport.setCfMedico1((infoRicettaType.getCfMedico2() != null && !"".equals(infoRicettaType.getCfMedico2())
                        ? infoRicettaType.getCfMedico2() : (infoRicettaType.getCfMedico1() != null ? infoRicettaType.getCfMedico1() : "")));
                ricetteForReport.setCodAutenticazione(infoRicettaType.getCodiceAutenticazione());

                Integer totalePrescrizioni = infoRicettaType.getElencoDettagliPrescrizioni().getDettaglioPrescrizione().stream()
                        .map(dettPresc -> Integer.parseInt(dettPresc.getQuantita()))
                        .reduce(0, (a, b) -> a + b);

                ricetteForReport.setNumPrestazioniConfezioni(totalePrescrizioni.toString());
                ricetteForReport.setCognomeNomeMedico(infoRicettaType.getCognomeMedico1() + " " + infoRicettaType.getNomeMedico1());
                ricetteForReport.setCognomeMedico(infoRicettaType.getCognomeMedico1());
                ricetteForReport.setNomeMedico(infoRicettaType.getNomeMedico1());

                ricetteForReport.setCognomeRichiedente("");
                ricetteForReport.setNomeRichiedente("");


                ricetteForReport.setNre(infoRicettaType.getNre());
                ricetteForReport.setCodRegione(infoRicettaType.getCodRegione() != null ? infoRicettaType.getCodRegione() : "");
                ricetteForReport.setCodASLAo(infoRicettaType.getCodASLAo() != null ? infoRicettaType.getCodASLAo() : "");
                ricetteForReport.setCodSpecializzazione(infoRicettaType.getCodSpecializzazione() != null ? infoRicettaType.getCodSpecializzazione() : "");
                ricetteForReport.setTestata1(infoRicettaType.getTestata1() != null ? infoRicettaType.getTestata1() : "");
                ricetteForReport.setTipoRicetta(getTipoRicettaByCode(infoRicettaType.getTipoRic()));
                ricetteForReport.setTipoPrescrizione(getTipoPrescrizione(infoRicettaType.getIndicazionePrescr() != null ? infoRicettaType.getIndicazionePrescr() : ""));
                ricetteForReport.setNonEsente(infoRicettaType.getNonEsente() != null ? infoRicettaType.getNonEsente() : "");
                ricetteForReport.setTipoVista(infoRicettaType.getTipoVisita() != null ? infoRicettaType.getTipoVisita() : "");
                ricetteForReport.setDisposizioniRegionali(infoRicettaType.getDispReg() != null ? infoRicettaType.getDispReg() : "");
                ricetteForReport.setClassePriorita(infoRicettaType.getClassePriorita() != null ? infoRicettaType.getClassePriorita() : "");
                ricetteForReport.setStatoEstero(infoRicettaType.getStatoEstero() != null ? infoRicettaType.getStatoEstero() : "");
                ricetteForReport.setIstituzCompetente(infoRicettaType.getIstituzCompetente() != null ? infoRicettaType.getIstituzCompetente() : "");
                ricetteForReport.setNumIdentPers(infoRicettaType.getNumIdentPers() != null ? infoRicettaType.getNumIdentPers() : "");
                ricetteForReport.setNumIdentTess(infoRicettaType.getNumIdentTess() != null ? infoRicettaType.getNumIdentTess() : "");
                ricetteForReport.setDataNascitaEstero(infoRicettaType.getDataNascitaEstero() != null ? infoRicettaType.getDataNascitaEstero() : "");
                ricetteForReport.setDataScadTessera(infoRicettaType.getDataScadTessera() != null ? infoRicettaType.getDataScadTessera() : "");
                ricetteForReport.setStatoProcesso(infoRicettaType.getStatoProcesso() != null ? infoRicettaType.getStatoProcesso() : "");

                infoRicettaType.getElencoDettagliPrescrizioni().getDettaglioPrescrizione().stream().forEach(dettaglioPrescrizioneType -> {
                    ricetteForReport.getPrescrizioniForReportList().add(new PrescrizioniForReport(dettaglioPrescrizioneType));
                });
                // CR - Inizialmente dovevano esserci max 9 righe (anche vuote)
//                int remain = 9 - ricetteForReport.getPrescrizioniForReportList().size();
//                ricetteForReport.getPrescrizioniForReportList().addAll(Stream.generate(PrescrizioniForReport::new).limit(remain).collect(Collectors.toList()));

                result.add(ricetteForReport);
            } catch (Exception e) {
                _log.error("getListaRicette", e.getMessage());
            }
        });


        return result;
    }

    private static String getQuesitoDiag(InfoRicettaType infoRicettaType) {
        String result = "";
        if (infoRicettaType.getCodDiagnosi() != null && !"".equals(infoRicettaType.getCodDiagnosi())) {
            result = infoRicettaType.getCodDiagnosi() +
                    (infoRicettaType.getDescrizioneCodiceDiagnosi() != null && !"".equals(infoRicettaType.getDescrizioneCodiceDiagnosi()) ?
                            " - " + infoRicettaType.getDescrizioneCodiceDiagnosi() : "");
        } else {
            result = infoRicettaType.getDescrizioneDiagnosi();
        }
        return result;
    }

    private static String getTipoRicettaByCode(String tipoRic) {
        String result  = "";
        String toCheck = tipoRic != null && !"".equals(tipoRic) ? tipoRic : "";
        switch (toCheck) {
            case "NA":
                result = "NA";
                break;
            case "ND":
                result = "ND";
                break;
            case "NE":
                result = "NE";
                break;
            case "NX":
                result = "NX";
                break;
            default:
                result = "Assist.SSN";
        }

        return result;
    }

    /*private static String getCognomeRichWithPrivacy(InfoRicettaType infoRicettaType) {
        //commmittato
        if ("1".equals(infoRicettaType.getOscuramDati())) {
            return "DATI DELL'ASSISTITO OSCURATI AI SENSI DELL'ARTICOLO 87 DEL DL 30 giugno 2003, n. 196";
        } else {
            return infoRicettaType.getCognNome() != null && !"".equals(infoRicettaType.getCognNome().trim()) ? infoRicettaType.getCognNome() : "";
        }
    }*/

    private static String getDescrizioneRegioneByCodice(String codRegione) {
        for (RegioneEnum regioneEnum : RegioneEnum.values()) {
            if (regioneEnum.codice.equals(codRegione)) {
                return regioneEnum.descrizione;
            }
        }
        return RegioneEnum.PIEMONTE.descrizione;
    }

    private static String getBiffatura(String altro) {
        if (altro.equalsIgnoreCase("a")) {
            return "X";
        } else {
            return altro;
        }
    }

    private static String getTipoPrescrizione(String codiceTipoPresc) {
        if ("".equals(codiceTipoPresc)) {
            return "";
        } else if ("S".equalsIgnoreCase(codiceTipoPresc)) {
            return "SUGG";
        } else if ("H".equalsIgnoreCase(codiceTipoPresc)) {
            return "RICOV";
        } else {
            _log.info("getTipoPrescrizione", "Codice tipo prescrizione non gestito.  (" + codiceTipoPresc + ")");
            return "";
        }

    }

    private static String getNomeMedicoFromTestata(String testata1) {
        String result = "";
        if (testata1 == null) {
            return result;
        }

        result = testata1.split(";")[1].split("=")[1];

        return result;
    }

    private static String getCognomeMedicoFromTestata(String testata1) {
        String result = "";
        if (testata1 == null) {
            return result;
        }

        result = testata1.split(";")[0].split("=")[1];

        return result;
    }

    private static String getCognomeNomeMedicoFromTestata(String testata1) {
        String result = "";
        if (testata1 == null) {
            return result;
        }

        result = getCognomeMedicoFromTestata(testata1) + " " + getNomeMedicoFromTestata(testata1);

        return result;
    }

}
