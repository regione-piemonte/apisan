/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.common;

public class CostantiConsenso {
    public static final String CONTESTO_OPERATIVO = "CONSENT"; //VARIABILE STATIC

    public static final String IDENTIFICATIVO_ORGANIZZAZIONE = "010"; // deve essere statico?? si rappresenta regione piemonte
    public static final String PRESA_IN_CARICO = "true";
    public static final String RUOLO = "CIT";
    public static final String RUOLO_UTENTE = "ASS";
    public static final String STRUTTURA_UTENTE = "------";
    public static final String TIPO_ATTIVITA = "CREATE";
    public static final String CODICE_REGIME = "AMB";
    public static final String APPLICAZIONE_RICHIEDENTE = "WEBAPP_CM";  // credo di dover avere un codice applicazione

    private CostantiConsenso() {
    }
}
