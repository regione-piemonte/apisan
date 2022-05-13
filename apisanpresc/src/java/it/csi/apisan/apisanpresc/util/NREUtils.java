/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.util;

import java.util.HashMap;

public class NREUtils {

    private static      LogUtil _log                        = new LogUtil(NREUtils.class);
    public static final String  CODICE_PARTE_UNO            = "codiceParteUNO";
    public static final String  CODICE_PARTE_DUE            = "codiceParteDUE";
    public static final String  CODICE_PROVINCA_REGIONE     = "codiceProvinciaRegione";
    public static final String  CODICE_RAGGRUPPAMENTO_LOTTO = "codiceLotto";
    public static final String  CODICE_ID_LOTTO             = "idLotto";
    public static final String  CODICE_LOTTO_PROGRESSIVO    = "codiceLottoProgressivo";

    public static HashMap<String, String> getNreDetails(String nre) {

        HashMap<String, String> result = new HashMap<>();

        /*
         lo spazio identificato dal numero 2 deve contenere il Numero di Ricetta Elettronica (NRE) in formato codice a barre e in formato alfanumerico, in particolare:
           lo standard da utilizzare per il codice a barre è il Code 39 (anche conosciuto come Alpha39, Code 3 of 9, Code 3/9, Type 39, USS Code 39, or USD-3); se tale tipologia di codice a barre non dovesse essere letto da dispositivi ottici si può optare, solo in seconda analisi, per lo standard UCC/EAN-128.
           l’altezza del codice deve essere di 8 mm;

           il codice deve essere composto da due parti separate: la prima parte contiene i dati relativi al codice Regione/Provincia (3 cifre), e il codice di raggruppamento del lotto (2 cifre), mentre la seconda parte contiene i dati identificativi del lotto (1 cifra) e il codice del lotto+progressivo (9 cifre). Le regole di composizione dell’NRE sono presenti nei documenti di progetto;
           la parte alfanumerica sottostante il codice a barre deve riportare i valori delimitati da un asterisco iniziale e finale.
         */

        try {
            String codiceProvinciaRegione    = nre.substring(0, 3);
            String codiceRaggruppamentoLotto = nre.substring(3, 5);
            String idLotto                   = nre.substring(5, 6);
            String lottoProgressivo          = nre.substring(6, nre.length());

            result.put(CODICE_PROVINCA_REGIONE, codiceProvinciaRegione);
            result.put(CODICE_RAGGRUPPAMENTO_LOTTO, codiceRaggruppamentoLotto);
            result.put(CODICE_ID_LOTTO, idLotto);
            result.put(CODICE_LOTTO_PROGRESSIVO, lottoProgressivo);
            result.put(CODICE_PARTE_UNO, codiceProvinciaRegione + codiceRaggruppamentoLotto);
            result.put(CODICE_PARTE_DUE, idLotto + lottoProgressivo);

        } catch (Exception e) {
            _log.error("getNreDetails", e.getMessage(), e);
        }

        return result;
    }

}
