/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanpresc.soap.dma.scaricapdfricetta;

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
 * 2019-11-15T09:59:07.618+01:00
 * Generated source version: 2.7.14
 * 
 */
public final class CCScaricaPdfRicettaService_CCScaricaPdfRicettaServicePort_Client {

    private static final QName SERVICE_NAME = new QName("http://dmacc.csi.it/", "CCScaricaPdfRicettaService");

    private CCScaricaPdfRicettaService_CCScaricaPdfRicettaServicePort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = CCScaricaPdfRicettaService_Service.WSDL_LOCATION;
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
      
        CCScaricaPdfRicettaService_Service ss = new CCScaricaPdfRicettaService_Service(wsdlURL, SERVICE_NAME);
        CCScaricaPdfRicettaService port = ss.getCCScaricaPdfRicettaServicePort();  
        
        {
        System.out.println("Invoking scaricaPdfRicetta...");
        it.csi.apisan.apisanpresc.soap.dma.scaricapdfricetta.ScaricaPdfRicettaRequest _scaricaPdfRicetta_scaricaPdfRicettaRequest = new it.csi.apisan.apisanpresc.soap.dma.scaricapdfricetta.ScaricaPdfRicettaRequest();
        it.csi.apisan.apisanpresc.soap.dma.scaricapdfricetta.ScaricaPdfRicettaResponse _scaricaPdfRicetta__return = port.scaricaPdfRicetta(_scaricaPdfRicetta_scaricaPdfRicettaRequest);
        System.out.println("scaricaPdfRicetta.result=" + _scaricaPdfRicetta__return);


        }

        System.exit(0);
    }

}
