/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.util;

import it.csi.apisan.apisanpresc.soap.sar.visprescsol.DettaglioPrescrizioneType;
import it.csi.apisan.apisanpresc.soap.sar.visprescsol.InfoRicettaType;

public class SARResponseUtils {
	public static String getQuesitoDiag(InfoRicettaType infoRicettaType) {
        String result = "";
        if (infoRicettaType.getCodDiagnosi()!=null && !"".equals(infoRicettaType.getCodDiagnosi())) {
            result = infoRicettaType.getCodDiagnosi() + 
            		(infoRicettaType.getDescrizioneCodiceDiagnosi() != null && !"".equals(infoRicettaType.getDescrizioneCodiceDiagnosi()) ? 
            				" - "+infoRicettaType.getDescrizioneCodiceDiagnosi() : "");
        } else {
            result = infoRicettaType.getDescrizioneDiagnosi();
        }
        return result;
    }

    public static String generateNota(DettaglioPrescrizioneType dettaglioPrescrizioneType) {
        /*
        nel caso di ricette specialistiche e solo per le prestazioni previste dal DM 9 dic 2015 del Ministero della Salute, è destinato a contenere le specifiche informazioni di appropriatezza prescrittiva, secondo tale schema:
        * riga superiore del campo:
        - numero nota
        - spazio
        - condizione di erogabilità oppure indicazione di appropriatezza prescrittiva, esprimibili tramite lettera dell’alfabeto
        * riga inferiore del campo:
        - codice patologia
        Per le prestazioni non previste dal DM 9 DIC 2015 il campo deve riportare la stringa “---“, ad indicare che non può essere compilato.
         */

        String result = "";

        String numeroNota   = dettaglioPrescrizioneType.getNumeroNota() != null ? dettaglioPrescrizioneType.getNumeroNota() : "";
        String condErog     = dettaglioPrescrizioneType.getCondErogabilita() != null ? dettaglioPrescrizioneType.getCondErogabilita() : "";
        String appPresc     = dettaglioPrescrizioneType.getApproprPrescrittiva() != null ? dettaglioPrescrizioneType.getApproprPrescrittiva() : "";
        String codPatologia = dettaglioPrescrizioneType.getPatologia() != null ? dettaglioPrescrizioneType.getPatologia() : "";

        if ("".equals(numeroNota)) {
            result = "---";
        } else {
            String riga1 = numeroNota + " " + (!condErog.equals("") ? condErog : appPresc);
            String riga2 = codPatologia;

            result = riga1 + "\n" + riga2;
        }

        return result;
    }

    public static String getPrioritaByClasse(String classePriorita) {
        String result = "";

        switch (classePriorita.toUpperCase().trim()) {
            case "U":
                result = "Nel piu' breve tempo possibile; se differibile entro 72 ore";
                break;
            case "B":
                result = "Entro 10 giorni";
                break;
            case "D":
                result = "Entro 30 (visite), entro 60 gg (visite strumentali)";
                break;
            case "P":
                result = "Programmabile";
                break;
            default:
                result = "";
        }

        return result;
    }
    
    public static String getPrioritaDescrizioneByClasse(String classePriorita) {
        String result = "";

        switch (classePriorita.toUpperCase().trim()) {
            case "U":
                result = "Nel piu' breve tempo possibile; se differibile entro 72 ore";
                break;
            case "B":
                result = "Entro 10 giorni";
                break;
            case "D":
                result = "Entro 30 (visite), entro 60 gg (visite strumentali)";
                break;
            case "P":
                result = "Programmabile";
                break;
            default:
                result = "";
        }

        return result;
    }
}
