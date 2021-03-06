/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanpresc.soap.pro.nascondinre;

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
 * 2019-09-24T15:18:38.710+02:00
 * Generated source version: 2.7.14
 * 
 */
public final class NascondiNreService_NascondiNreServicePort_Client {

    private static final QName SERVICE_NAME = new QName("http://dmapro.csi.it/", "NascondiNreService");

    private NascondiNreService_NascondiNreServicePort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = NascondiNreService_Service.WSDL_LOCATION;
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
      
        NascondiNreService_Service ss = new NascondiNreService_Service(wsdlURL, SERVICE_NAME);
        NascondiNreService port = ss.getNascondiNreServicePort();  
        
        {
        System.out.println("Invoking nascondiNre...");
        it.csi.apisan.apisanpresc.soap.pro.nascondinre.NascondiNre _nascondiNre_nascondiNreRequest = new it.csi.apisan.apisanpresc.soap.pro.nascondinre.NascondiNre();
        it.csi.apisan.apisanpresc.soap.pro.nascondinre.NascondiNreResponse _nascondiNre__return = port.nascondiNre(_nascondiNre_nascondiNreRequest);
        System.out.println("nascondiNre.result=" + _nascondiNre__return);


        }

        System.exit(0);
    }

}
