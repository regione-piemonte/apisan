/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.documenti.dmacc;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.14
 * 2021-07-21T14:42:53.845+02:00
 * Generated source version: 2.7.14
 * 
 */
public final class DocumentiService_DocumentiServicePort_Client {

    private static final QName SERVICE_NAME = new QName("http://dmacc.csi.it/", "DocumentiService");

    private DocumentiService_DocumentiServicePort_Client() {
    }

  /*  public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = DocumentiService_Service.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        DocumentiService_Service ss = new DocumentiService_Service(wsdlURL, SERVICE_NAME);
        DocumentiService port = ss.getDocumentiServicePort();  
        
        {
        System.out.println("Invoking registraAvvenutoRitiro...");
        it.csi.dmacc.RegistraAvvenutoRitiroRequest _registraAvvenutoRitiro_registraAvvenutoRitiro = null;
        it.csi.dmacc.RegistraAvvenutoRitiroResponse _registraAvvenutoRitiro__return = port.registraAvvenutoRitiro(_registraAvvenutoRitiro_registraAvvenutoRitiro);
        System.out.println("registraAvvenutoRitiro.result=" + _registraAvvenutoRitiro__return);


        }
        {
        System.out.println("Invoking getSoloEpisodi...");
        it.csi.dmacc.GetSoloEpisodiRequest _getSoloEpisodi_getSoloEpisodi = null;
        it.csi.dmacc.GetSoloEpisodiResponse _getSoloEpisodi__return = port.getSoloEpisodi(_getSoloEpisodi_getSoloEpisodi);
        System.out.println("getSoloEpisodi.result=" + _getSoloEpisodi__return);


        }
        {
        System.out.println("Invoking getMieiRefertiDocs...");
        it.csi.dmacc.GetRefertiRequest _getMieiRefertiDocs_getMieiRefertiDocs = null;
        it.csi.dmacc.GetRefertiResponse _getMieiRefertiDocs__return = port.getMieiRefertiDocs(_getMieiRefertiDocs_getMieiRefertiDocs);
        System.out.println("getMieiRefertiDocs.result=" + _getMieiRefertiDocs__return);


        }
        {
        System.out.println("Invoking getDettaglioDocumento...");
        it.csi.dmacc.GetDettaglioDocumentoRequest _getDettaglioDocumento_getDettaglioDocumento = null;
        it.csi.dmacc.GetDettaglioDocumentoResponse _getDettaglioDocumento__return = port.getDettaglioDocumento(_getDettaglioDocumento_getDettaglioDocumento);
        System.out.println("getDettaglioDocumento.result=" + _getDettaglioDocumento__return);


        }
        {
        System.out.println("Invoking getDocumento...");
        it.csi.dmacc.GetDocumento _getDocumento_getDocumento = null;
        it.csi.dmacc.GetDocumentoResponse _getDocumento__return = port.getDocumento(_getDocumento_getDocumento);
        System.out.println("getDocumento.result=" + _getDocumento__return);


        }
        {
        System.out.println("Invoking getDocumentiEpisodio...");
        it.csi.dmacc.GetDocumentiEpisodioRequest _getDocumentiEpisodio_getDocumentiEpisodio = null;
        it.csi.dmacc.GetDocumentiEpisodioResponse _getDocumentiEpisodio__return = port.getDocumentiEpisodio(_getDocumentiEpisodio_getDocumentiEpisodio);
        System.out.println("getDocumentiEpisodio.result=" + _getDocumentiEpisodio__return);


        }
        {
        System.out.println("Invoking getTuttiDocs...");
        it.csi.dmacc.GetTuttiDocsRequest _getTuttiDocs_getTuttiDocs = null;
        it.csi.dmacc.GetTuttiDocsResponse _getTuttiDocs__return = port.getTuttiDocs(_getTuttiDocs_getTuttiDocs);
        System.out.println("getTuttiDocs.result=" + _getTuttiDocs__return);


        }
        {
        System.out.println("Invoking smediazioneDocumenti...");
        it.csi.dmacc.SmediazioneDocumentiRequest _smediazioneDocumenti_smediazioneDocumenti = null;
        it.csi.dmacc.SmediazioneDocumentiResponse _smediazioneDocumenti__return = port.smediazioneDocumenti(_smediazioneDocumenti_smediazioneDocumenti);
        System.out.println("smediazioneDocumenti.result=" + _smediazioneDocumenti__return);


        }
        {
        System.out.println("Invoking getMieiReferti...");
        it.csi.dmacc.GetRefertiRequest _getMieiReferti_getMieiReferti = null;
        it.csi.dmacc.GetRefertiResponse _getMieiReferti__return = port.getMieiReferti(_getMieiReferti_getMieiReferti);
        System.out.println("getMieiReferti.result=" + _getMieiReferti__return);


        }
        {
        System.out.println("Invoking getDocumentiCorrelati...");
        it.csi.dmacc.GetDocumentiCorrelatiRequest _getDocumentiCorrelati_getDocumentiCorrelati = null;
        it.csi.dmacc.GetDocumentiCorrelatiResponse _getDocumentiCorrelati__return = port.getDocumentiCorrelati(_getDocumentiCorrelati_getDocumentiCorrelati);
        System.out.println("getDocumentiCorrelati.result=" + _getDocumentiCorrelati__return);


        }
        {
        System.out.println("Invoking verificaDocumentoScaricabile...");
        it.csi.dmacc.VerificaDocumentoScaricabileRequest _verificaDocumentoScaricabile_verificaDocumentoScaricabile = null;
        it.csi.dmacc.VerificaDocumentoScaricabileResponse _verificaDocumentoScaricabile__return = port.verificaDocumentoScaricabile(_verificaDocumentoScaricabile_verificaDocumentoScaricabile);
        System.out.println("verificaDocumentoScaricabile.result=" + _verificaDocumentoScaricabile__return);


        }
        {
        System.out.println("Invoking getDocumentiCorrelatiOSC...");
        it.csi.dmacc.GetDocumentiCorrelatiOSCRequest _getDocumentiCorrelatiOSC_getDocumentiCorrelatiOSC = null;
        it.csi.dmacc.GetDocumentiCorrelatiOSCResponse _getDocumentiCorrelatiOSC__return = port.getDocumentiCorrelatiOSC(_getDocumentiCorrelatiOSC_getDocumentiCorrelatiOSC);
        System.out.println("getDocumentiCorrelatiOSC.result=" + _getDocumentiCorrelatiOSC__return);


        }
        {
        System.out.println("Invoking getConteggi...");
        it.csi.dmacc.GetConteggiRequest _getConteggi_getConteggi = null;
        it.csi.dmacc.GetConteggiResponse _getConteggi__return = port.getConteggi(_getConteggi_getConteggi);
        System.out.println("getConteggi.result=" + _getConteggi__return);


        }

        System.exit(0);
    }*/

}
