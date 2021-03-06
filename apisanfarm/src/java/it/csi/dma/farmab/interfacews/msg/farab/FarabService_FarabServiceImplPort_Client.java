/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.farmab.interfacews.msg.farab;

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
 * 2021-11-29T16:39:33.846+01:00
 * Generated source version: 2.7.14
 * 
 */
public final class FarabService_FarabServiceImplPort_Client {

    private static final QName SERVICE_NAME = new QName("http://farab.msg.interfacews.farmab.dma.csi.it/", "FarabServiceImplService");

    private FarabService_FarabServiceImplPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = FarabServiceImplService.WSDL_LOCATION;
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
      
        FarabServiceImplService ss = new FarabServiceImplService(wsdlURL, SERVICE_NAME);
        FarabService port = ss.getFarabServiceImplPort();  
        
        {
        System.out.println("Invoking certificaDevice...");
        it.csi.dma.farmab.interfacews.msg.farab.Richiedente _certificaDevice_richiedente = null;
        java.lang.String _certificaDevice_cfCittadino = "";
        java.lang.String _certificaDevice_uuidDevice = "";
        it.csi.dma.farmab.interfacews.msg.farab.Codifica _certificaDevice_fonte = null;
        java.lang.String _certificaDevice_telCittadino = "";
        it.csi.dma.farmab.interfacews.msg.farab.Dispositivo _certificaDevice_dispositivo = null;
        javax.xml.ws.Holder<java.lang.String> _certificaDevice_esito = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<it.csi.dma.farmab.interfacews.msg.farab.ElencoErroriType> _certificaDevice_elencoErrori = new javax.xml.ws.Holder<it.csi.dma.farmab.interfacews.msg.farab.ElencoErroriType>();
        javax.xml.ws.Holder<java.lang.String> _certificaDevice_statoCertificazione = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<it.csi.dma.farmab.interfacews.msg.farab.CertificazioneType> _certificaDevice_datiCertificazione = new javax.xml.ws.Holder<it.csi.dma.farmab.interfacews.msg.farab.CertificazioneType>();
        port.certificaDevice(_certificaDevice_richiedente, _certificaDevice_cfCittadino, _certificaDevice_uuidDevice, _certificaDevice_fonte, _certificaDevice_telCittadino, _certificaDevice_dispositivo, _certificaDevice_esito, _certificaDevice_elencoErrori, _certificaDevice_statoCertificazione, _certificaDevice_datiCertificazione);

        System.out.println("certificaDevice._certificaDevice_esito=" + _certificaDevice_esito.value);
        System.out.println("certificaDevice._certificaDevice_elencoErrori=" + _certificaDevice_elencoErrori.value);
        System.out.println("certificaDevice._certificaDevice_statoCertificazione=" + _certificaDevice_statoCertificazione.value);
        System.out.println("certificaDevice._certificaDevice_datiCertificazione=" + _certificaDevice_datiCertificazione.value);

        }
        {
        System.out.println("Invoking autorizzaFarmaciaOccasionale...");
        it.csi.dma.farmab.interfacews.msg.farab.Richiedente _autorizzaFarmaciaOccasionale_richiedente = null;
        java.lang.String _autorizzaFarmaciaOccasionale_uuidDevice = "";
        javax.xml.ws.Holder<java.lang.String> _autorizzaFarmaciaOccasionale_esito = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<it.csi.dma.farmab.interfacews.msg.farab.ElencoErroriType> _autorizzaFarmaciaOccasionale_elencoErrori = new javax.xml.ws.Holder<it.csi.dma.farmab.interfacews.msg.farab.ElencoErroriType>();
        javax.xml.ws.Holder<it.csi.dma.farmab.interfacews.msg.farab.FarmaciaOccasionaleType> _autorizzaFarmaciaOccasionale_farmaciaOccasionale = new javax.xml.ws.Holder<it.csi.dma.farmab.interfacews.msg.farab.FarmaciaOccasionaleType>();
        port.autorizzaFarmaciaOccasionale(_autorizzaFarmaciaOccasionale_richiedente, _autorizzaFarmaciaOccasionale_uuidDevice, _autorizzaFarmaciaOccasionale_esito, _autorizzaFarmaciaOccasionale_elencoErrori, _autorizzaFarmaciaOccasionale_farmaciaOccasionale);

        System.out.println("autorizzaFarmaciaOccasionale._autorizzaFarmaciaOccasionale_esito=" + _autorizzaFarmaciaOccasionale_esito.value);
        System.out.println("autorizzaFarmaciaOccasionale._autorizzaFarmaciaOccasionale_elencoErrori=" + _autorizzaFarmaciaOccasionale_elencoErrori.value);
        System.out.println("autorizzaFarmaciaOccasionale._autorizzaFarmaciaOccasionale_farmaciaOccasionale=" + _autorizzaFarmaciaOccasionale_farmaciaOccasionale.value);

        }
        {
        System.out.println("Invoking getFarmaciaOccasionale...");
        it.csi.dma.farmab.interfacews.msg.farab.Richiedente _getFarmaciaOccasionale_richiedente = null;
        java.lang.String _getFarmaciaOccasionale_uuidDevice = "";
        javax.xml.ws.Holder<java.lang.String> _getFarmaciaOccasionale_esito = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<it.csi.dma.farmab.interfacews.msg.farab.ElencoErroriType> _getFarmaciaOccasionale_elencoErrori = new javax.xml.ws.Holder<it.csi.dma.farmab.interfacews.msg.farab.ElencoErroriType>();
        javax.xml.ws.Holder<it.csi.dma.farmab.interfacews.msg.farab.FarmaciaOccasionaleType> _getFarmaciaOccasionale_farmaciaOccasionale = new javax.xml.ws.Holder<it.csi.dma.farmab.interfacews.msg.farab.FarmaciaOccasionaleType>();
        port.getFarmaciaOccasionale(_getFarmaciaOccasionale_richiedente, _getFarmaciaOccasionale_uuidDevice, _getFarmaciaOccasionale_esito, _getFarmaciaOccasionale_elencoErrori, _getFarmaciaOccasionale_farmaciaOccasionale);

        System.out.println("getFarmaciaOccasionale._getFarmaciaOccasionale_esito=" + _getFarmaciaOccasionale_esito.value);
        System.out.println("getFarmaciaOccasionale._getFarmaciaOccasionale_elencoErrori=" + _getFarmaciaOccasionale_elencoErrori.value);
        System.out.println("getFarmaciaOccasionale._getFarmaciaOccasionale_farmaciaOccasionale=" + _getFarmaciaOccasionale_farmaciaOccasionale.value);

        }
        {
        System.out.println("Invoking certificaDeviceConOtp...");
        it.csi.dma.farmab.interfacews.msg.farab.Richiedente _certificaDeviceConOtp_richiedente = null;
        java.lang.String _certificaDeviceConOtp_uuidDevice = "";
        java.lang.String _certificaDeviceConOtp_codiceOtp = "";
        java.lang.String _certificaDeviceConOtp_cfCittadino = "";
        it.csi.dma.farmab.interfacews.msg.farab.Dispositivo _certificaDeviceConOtp_dispositivo = null;
        javax.xml.ws.Holder<java.lang.String> _certificaDeviceConOtp_esito = new javax.xml.ws.Holder<java.lang.String>();
        javax.xml.ws.Holder<it.csi.dma.farmab.interfacews.msg.farab.ElencoErroriType> _certificaDeviceConOtp_elencoErrori = new javax.xml.ws.Holder<it.csi.dma.farmab.interfacews.msg.farab.ElencoErroriType>();
        port.certificaDeviceConOtp(_certificaDeviceConOtp_richiedente, _certificaDeviceConOtp_uuidDevice, _certificaDeviceConOtp_codiceOtp, _certificaDeviceConOtp_cfCittadino, _certificaDeviceConOtp_dispositivo, _certificaDeviceConOtp_esito, _certificaDeviceConOtp_elencoErrori);

        System.out.println("certificaDeviceConOtp._certificaDeviceConOtp_esito=" + _certificaDeviceConOtp_esito.value);
        System.out.println("certificaDeviceConOtp._certificaDeviceConOtp_elencoErrori=" + _certificaDeviceConOtp_elencoErrori.value);

        }

        System.exit(0);
    }

}
