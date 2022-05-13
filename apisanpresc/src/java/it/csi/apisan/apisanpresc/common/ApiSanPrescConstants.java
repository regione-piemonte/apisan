/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.common;

public class ApiSanPrescConstants {

    //    public        String DMA_ELENCORICETTESTAMPAPROMEMORIA_WSDL      = "https://tst-feapi-dma.isan.csi.it/dmaccpromed/services/CCElencoRicetteStampaPromemoriaService?wsdl";
    public final static String DMA_ELENCORICETTESTAMPAPROMEMORIA_WSDL          = PropertiesLoader.getInstance().getProperty("DMA_ELENCORICETTESTAMPAPROMEMORIA_WSDL");
    public final static String DMA_ELENCORICETTESTAMPAPROMEMORIA_ENDPOINT      = PropertiesLoader.getInstance().getProperty("DMA_ELENCORICETTESTAMPAPROMEMORIA_ENDPOINT");
    public final static String DMA_DETTAGLIORICETTAPRESCRITTA_WSDL             = PropertiesLoader.getInstance().getProperty("DMA_DETTAGLIORICETTAPRESCRITTA_WSDL");
    public final static String DMA_DETTAGLIORICETTAPRESCRITTA_ENDPOINT         = PropertiesLoader.getInstance().getProperty("DMA_DETTAGLIORICETTAPRESCRITTA_ENDPOINT");
    //    public final static String PROREL_LOGAUDITSERVICE_WSDL                 = "https://tst-srv-promemoria.isan.csi.it/prorel/LogAuditService?wsdl"; // DEV
    public final static String PROREL_LOGAUDITSERVICE_ENDPOINT                 = PropertiesLoader.getInstance().getProperty("PROREL_LOGAUDITSERVICE_ENDPOINT");
    public final static String PROREL_LOGAUDITSERVICE_WSDL                     = "https://tst-srv-promemoria.isan.csi.it/prorelrti/LogAuditService?wsdl";
    public final static String PROREL_ELENCONRENASCOSTI_ENDPOINT               = PropertiesLoader.getInstance().getProperty("PROREL_ELENCONRENASCOSTI_ENDPOINT");
    public final static String PROREL_ELENCONRENASCOSTI_WSDL                   = "https://tst-srv-promemoria.isan.csi.it/prorelrti/ElencoNreNascostiService?wsdl";
    public final static String PROREL_NASCONDINRE_ENDPOINT                     = PropertiesLoader.getInstance().getProperty("PROREL_NASCONDINRE_ENDPOINT");
    public final static String PROREL_NASCONDINRE_WSDL                         = "https://tst-srv-promemoria.isan.csi.it/prorelrti/NascondiNreService?wsdl";
    public final static String SAR_VISUALIZZA_PRESCRITTO_PAZIENTE_SOL_ENDPOINT = PropertiesLoader.getInstance().getProperty("SAR_VISUALIZZA_PRESCRITTO_PAZIENTE_SOL_ENDPOINT");
    public final static String SAR_VISUALIZZA_PRESCRITTO_PAZIENTE_SOL_WSDL     = "https://tst-applogic.reteunitaria.piemonte.it:1449/RELSOL/Prescritto/VisualizzaPrescrittoPazienteSOL?wsdl";
    public final static String SAR_BROKERSERVICE_SOL_ENDPOINT                  = PropertiesLoader.getInstance().getProperty("SAR_BROKERSERVICE_SOL_ENDPOINT");
    public final static String SAR_BROKERSERVICE_SOL_WSDL                      = "https://tst-applogic.reteunitaria.piemonte.it:1449/DEMCSI/BrokerService?wsdl";
    public final static String CONTESTO_OPERATIVO                              = PropertiesLoader.getInstance().getProperty("CONTESTO_OPERATIVO");
    public final static String CONSTANTS_REGIONEPRESCRIZIONE_P                 = "P";
    public final static String CONSTANTS_REGIONEPRESCRIZIONE_RP                = "RP";
    public final static String CONSTANTS_REGIONEPRESCRIZIONE_EXTRARP           = "EXTRA_RP";
    public final static String CODICE_PRO_ELE_RIC                              = "EVELRIC";
    public final static String CODICE_PRO_DET_RIC                              = "PRO_DET_RIC";
    public final static String CODICE_PRO_STA_RIC                              = "PRO_STA_RIC";
    public final static String CODICE_PRO_NAS_RIC                              = "PRO_NAS_RIC";
    public final static String CODICE_PRO_NASCONDI_NRE                         = "CODICE_PRO_NASCONDI_NRE";
    public final static String PRESCRIZIONE_SPECIALISTICA_P                    = "P";
    public final static String TIPOLOGIA_PRESCRIZIONE_FARMACEUTICA_F           = "F";
    public final static String RUOLO_UTENTE_ASS                                = PropertiesLoader.getInstance().getProperty("RUOLO_UTENTE_ASS");
    public final static String RUOLO_UTENTE_DEL                                = PropertiesLoader.getInstance().getProperty("RUOLO_UTENTE_DEL");

    public final static String SAR_PARAM_TIPOPRESCRIZIONE_SPECIALISTICA = "P";
    public final static String SAR_PARAM_TIPOPRESCRIZIONE_FARMACEUTICA  = "F";
    public final static String SAR_PARAM_TIPOREGIME_DM                  = "DM";
    public final static String SAR_PARAM_TIPO_RICETTA_I                 = "I";
    public final static String SAR_PARAM_RICETTE_SCADUTE_N              = "N";
    public final static String SAR_PARAM_RICETTE_SCADUTE_S              = "S";
    public final static String SAR_RICEROG_NON_SSN                      = "N";
    public final static String SAR_TBD_PINCODE                          = PropertiesLoader.getInstance().getProperty("SAR_TBD_PINCODE");
    public final static String SAR_CONSTANTS_STATOPROCESSO_3            = "3";
    public final static String SAR_CONSTANTS_STATOPROCESSO_5            = "5";
    public final static String SAR_CONSTANTS_REGPRESC_P                 = "P";

    /* DMA ElencoRicetteStampaPromemoria */
    public final static String DMA_PARAM_ALTRA_REGIONE                  = "AR";
    public final static String DMA_PARAM_TIPO_PRESCRIZIONE_FARMACEUTICA = "F";
    public final static String DMA_PARAM_RICETTESCADUTE_N               = "N";
    public final static String DMA_PARAM_RICETTESCADUTE_S               = "S";
    public final static String DMA_PARAM_REGIONE_PIEMONTE               = "RP";

    public final static String TIPOLOGIA_PRESCRIZIONE_SPECIALISTICA_P             = "P";
    public final static String TIPOLOGIA_PRESCRIZIONE_SPECIALISTICA_P_DESCRIZIONE = "Descrizione Tipologia Specialistica";
    public final static String TIPOLOGIA_PRESCRIZIONE_SPECIALISTICA_P_NOME        = "SPECIALISTICA";
    public final static String TIPOLOGIA_PRESCRIZIONE_FARMACEUTICA_F_DESCRIZIONE  = "Descrizione Tipologia Farmaceutica";
    public final static String TIPOLOGIA_PRESCRIZIONE_FARMACEUTICA_F_NOME         = "FARMACEUTICA";
//    public final static String DMA_PRO_STAMPARICETTAPDF_WSDL                      = "https://tst-feapi-dma.isan.csi.it/dmaccpromedrti/services/CCScaricaPDFRicettaService?wsdl";
    public final static String DMA_PRO_STAMPARICETTAPDF_WSDL          			  = PropertiesLoader.getInstance().getProperty("DMA_PRO_STAMPARICETTAPDF_WSDL");
    public final static String DMA_PRO_STAMPARICETTAPDF_ADDRESS_PROPERTY          = PropertiesLoader.getInstance().getProperty("DMA_PRO_STAMPARICETTAPDF_ADDRESS_PROPERTY");
    public final static String SAR_AUTHENTICAION_USER                             = PropertiesLoader.getInstance().getProperty("SAR_AUTHENTICAION_USER");
    public final static String SAR_AUTHENTICAION_PASSWORD                         = PropertiesLoader.getInstance().getProperty("SAR_AUTHENTICAION_PASSWORD");

    public final static String SAR_ENCRYPT_USER     = PropertiesLoader.getInstance().getProperty("SAR_ENCRYPT_USER");
    public final static String SAR_ENCRYPT_PASSWORD = PropertiesLoader.getInstance().getProperty("SAR_ENCRYPT_PASSWORD");

    public static final String DMA_ESITO_ERRORE_CODE            = "9999";
    public static final String SAR_ESITO_ERRORE_CODE            = "9999";
    public static final String REGIONE_PIEMONTE_DEFAULT         = "010";
    public static final String CONSTANTS_REGIONEPRESCRIZIONE_AR = "AR";
    public static final String DMA_USER_SOAP                    = PropertiesLoader.getInstance().getProperty("DMA_USER_SOAP");
    public static final String DMA_PASSWORD_SOAP                = PropertiesLoader.getInstance().getProperty("DMA_PASSWORD_SOAP");
    public static final String PRO_USER_SOAP                    = PropertiesLoader.getInstance().getProperty("PRO_USER_SOAP");
    public static final String PRO_PASSWORD_SOAP                = PropertiesLoader.getInstance().getProperty("PRO_PASSWORD_SOAP");
}
