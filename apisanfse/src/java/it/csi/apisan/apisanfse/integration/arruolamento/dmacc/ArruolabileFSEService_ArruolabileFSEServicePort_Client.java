/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.integration.arruolamento.dmacc;

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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.14
 * 2020-03-20T10:15:37.802+01:00
 * Generated source version: 2.7.14
 * 
 */
public final class ArruolabileFSEService_ArruolabileFSEServicePort_Client {

    private static final QName SERVICE_NAME = new QName("http://dmacc.csi.it/", "ArruolabileFSEService");

    private ArruolabileFSEService_ArruolabileFSEServicePort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = ArruolabileFSEService_Service.WSDL_LOCATION;
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
      
        ArruolabileFSEService_Service ss = new ArruolabileFSEService_Service(wsdlURL, SERVICE_NAME);
        ArruolabileFSEService port = ss.getArruolabileFSEServicePort();  
        
        {
        System.out.println("Invoking isArruolabile...");
        java.lang.String _isArruolabile_codiceFiscale = "";
        it.csi.apisan.apisanfse.integration.arruolamento.dma.RichiedenteArruolamento _isArruolabile_richiedente = null;
        it.csi.apisan.apisanfse.integration.arruolamento.dma.FascicoloArruolabile _isArruolabile__return = port.isArruolabile(_isArruolabile_codiceFiscale, _isArruolabile_richiedente);
        System.out.println("isArruolabile.result=" + _isArruolabile__return);


        }

        System.exit(0);
    }

}
