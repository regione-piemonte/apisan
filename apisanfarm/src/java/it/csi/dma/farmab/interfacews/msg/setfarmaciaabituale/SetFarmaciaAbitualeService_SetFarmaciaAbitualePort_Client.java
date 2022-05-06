/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.farmab.interfacews.msg.setfarmaciaabituale;

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
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.14
 * 2021-11-19T15:27:06.849+01:00
 * Generated source version: 2.7.14
 * 
 */
public final class SetFarmaciaAbitualeService_SetFarmaciaAbitualePort_Client {

    private static final QName SERVICE_NAME = new QName("http://setfarmaciaabituale.msg.interfacews.farmab.dma.csi.it/", "SetFarmaciaAbitualeServiceImplService");

    private SetFarmaciaAbitualeService_SetFarmaciaAbitualePort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = SetFarmaciaAbitualeServiceImplService.WSDL_LOCATION;
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
      
        SetFarmaciaAbitualeServiceImplService ss = new SetFarmaciaAbitualeServiceImplService(wsdlURL, SERVICE_NAME);
        SetFarmaciaAbitualeService port = ss.getSetFarmaciaAbitualePort();  
        
        {
        System.out.println("Invoking setFarmaciaAbituale...");
        it.csi.dma.farmab.interfacews.msg.setfarmaciaabituale.Richiedente _setFarmaciaAbituale_richiedente = null;
        java.lang.String _setFarmaciaAbituale_cfCittadino = "";
        java.lang.String _setFarmaciaAbituale_azione = "";
        java.lang.String _setFarmaciaAbituale_idFarmaciaAbituale = "";
        java.lang.String _setFarmaciaAbituale_codiceFarmacia = "";
        java.lang.String _setFarmaciaAbituale_dataInizioValidita = "";
        java.lang.String _setFarmaciaAbituale_dataFineValidita = "";
        javax.xml.ws.Holder<java.lang.String> _setFarmaciaAbituale_esito = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<it.csi.dma.farmab.interfacews.msg.setfarmaciaabituale.ElencoErroriType> _setFarmaciaAbituale_elencoErrori = new javax.xml.ws.Holder<it.csi.dma.farmab.interfacews.msg.setfarmaciaabituale.ElencoErroriType>();
        javax.xml.ws.Holder<it.csi.dma.farmab.interfacews.msg.setfarmaciaabituale.Farmacia> _setFarmaciaAbituale_farmaciaAbituale = new javax.xml.ws.Holder<it.csi.dma.farmab.interfacews.msg.setfarmaciaabituale.Farmacia>();
        port.setFarmaciaAbituale(_setFarmaciaAbituale_richiedente, _setFarmaciaAbituale_cfCittadino, _setFarmaciaAbituale_azione, _setFarmaciaAbituale_idFarmaciaAbituale, _setFarmaciaAbituale_codiceFarmacia, _setFarmaciaAbituale_dataInizioValidita, _setFarmaciaAbituale_dataFineValidita, _setFarmaciaAbituale_esito, _setFarmaciaAbituale_elencoErrori, _setFarmaciaAbituale_farmaciaAbituale);

        System.out.println("setFarmaciaAbituale._setFarmaciaAbituale_esito=" + _setFarmaciaAbituale_esito.value);
        System.out.println("setFarmaciaAbituale._setFarmaciaAbituale_elencoErrori=" + _setFarmaciaAbituale_elencoErrori.value);
        System.out.println("setFarmaciaAbituale._setFarmaciaAbituale_farmaciaAbituale=" + _setFarmaciaAbituale_farmaciaAbituale.value);

        }

        System.exit(0);
    }

}
