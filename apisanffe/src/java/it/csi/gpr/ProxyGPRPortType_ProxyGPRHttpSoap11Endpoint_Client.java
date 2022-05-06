/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gpr;

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
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.14
 * 2021-09-28T16:08:01.206+02:00
 * Generated source version: 2.7.14
 * 
 */
public final class ProxyGPRPortType_ProxyGPRHttpSoap11Endpoint_Client {

    private static final QName SERVICE_NAME = new QName("http://csi.it", "proxyGPR");

    private ProxyGPRPortType_ProxyGPRHttpSoap11Endpoint_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = ProxyGPR.WSDL_LOCATION;
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
      
        ProxyGPR ss = new ProxyGPR(wsdlURL, SERVICE_NAME);
        ProxyGPRPortType port = ss.getProxyGPRHttpSoap11Endpoint();  
        
        {
        System.out.println("Invoking estrazioneListaTicketMetadatiGPR...");
        java.lang.String _estrazioneListaTicketMetadatiGPR_asr = "";
        java.lang.String _estrazioneListaTicketMetadatiGPR_uuid = "";
        java.lang.String _estrazioneListaTicketMetadatiGPR_azione = "";
        it.csi.gpr.Errore _estrazioneListaTicketMetadatiGPR__return = port.estrazioneListaTicketMetadatiGPR(_estrazioneListaTicketMetadatiGPR_asr, _estrazioneListaTicketMetadatiGPR_uuid, _estrazioneListaTicketMetadatiGPR_azione);
        System.out.println("estrazioneListaTicketMetadatiGPR.result=" + _estrazioneListaTicketMetadatiGPR__return);


        }
        {
        System.out.println("Invoking getModalitaErogazioneAmmissibiliGPR...");
        it.csi.gpr.GetModalitaErogazioneAmmissibiliGPRRequest _getModalitaErogazioneAmmissibiliGPR_richiesta = null;
        it.csi.gpr.ModalitaErogazioneAmmissibiliGPRResultType _getModalitaErogazioneAmmissibiliGPR__return = port.getModalitaErogazioneAmmissibiliGPR(_getModalitaErogazioneAmmissibiliGPR_richiesta);
        System.out.println("getModalitaErogazioneAmmissibiliGPR.result=" + _getModalitaErogazioneAmmissibiliGPR__return);


        }
        {
        System.out.println("Invoking dispacciaFlussoRendicontazione...");
        it.csi.gpr.DispacciaFlussoRendicontazioneRequest _dispacciaFlussoRendicontazione_parameters = null;
        it.csi.gpr.DispacciaFlussoRendicontazioneResponse _dispacciaFlussoRendicontazione__return = port.dispacciaFlussoRendicontazione(_dispacciaFlussoRendicontazione_parameters);
        System.out.println("dispacciaFlussoRendicontazione.result=" + _dispacciaFlussoRendicontazione__return);


        }
        {
        System.out.println("Invoking setCodiceVersamentoGPR...");
        it.csi.gpr.RichiestaSetCodiceVersamento _setCodiceVersamentoGPR_richiesta = null;
        it.csi.gpr.SetCodiceVersamentoGPRResponseType _setCodiceVersamentoGPR__return = port.setCodiceVersamentoGPR(_setCodiceVersamentoGPR_richiesta);
        System.out.println("setCodiceVersamentoGPR.result=" + _setCodiceVersamentoGPR__return);


        }
        {
        System.out.println("Invoking getConfigLottoIUVGPR...");
        it.csi.gpr.RichiestaGetConfigLottoIUV _getConfigLottoIUVGPR_richiesta = null;
        javax.xml.ws.Holder<it.csi.gpr.RispostaGetConfigLottoIUVGPRResponse> _getConfigLottoIUVGPR_risposta = new javax.xml.ws.Holder<it.csi.gpr.RispostaGetConfigLottoIUVGPRResponse>();
        javax.xml.ws.Holder<it.csi.gpr.Errore> _getConfigLottoIUVGPR_errore = new javax.xml.ws.Holder<it.csi.gpr.Errore>();
        port.getConfigLottoIUVGPR(_getConfigLottoIUVGPR_richiesta, _getConfigLottoIUVGPR_risposta, _getConfigLottoIUVGPR_errore);

        System.out.println("getConfigLottoIUVGPR._getConfigLottoIUVGPR_risposta=" + _getConfigLottoIUVGPR_risposta.value);
        System.out.println("getConfigLottoIUVGPR._getConfigLottoIUVGPR_errore=" + _getConfigLottoIUVGPR_errore.value);

        }
        {
        System.out.println("Invoking getSingleIuvGPR...");
        it.csi.gpr.RichiestaIuv _getSingleIuvGPR_richiesta = null;
        javax.xml.ws.Holder<it.csi.gpr.RispostaIuv> _getSingleIuvGPR_risposta = new javax.xml.ws.Holder<it.csi.gpr.RispostaIuv>();
        javax.xml.ws.Holder<it.csi.gpr.Errore> _getSingleIuvGPR_errore = new javax.xml.ws.Holder<it.csi.gpr.Errore>();
        port.getSingleIuvGPR(_getSingleIuvGPR_richiesta, _getSingleIuvGPR_risposta, _getSingleIuvGPR_errore);

        System.out.println("getSingleIuvGPR._getSingleIuvGPR_risposta=" + _getSingleIuvGPR_risposta.value);
        System.out.println("getSingleIuvGPR._getSingleIuvGPR_errore=" + _getSingleIuvGPR_errore.value);

        }
        {
        System.out.println("Invoking getAvvisiUNPGPR...");
        it.csi.gpr.AvvisoRequest _getAvvisiUNPGPR_richiesta = null;
        java.util.List<it.csi.gpr.Avviso> _getAvvisiUNPGPR__return = port.getAvvisiUNPGPR(_getAvvisiUNPGPR_richiesta);
        System.out.println("getAvvisiUNPGPR.result=" + _getAvvisiUNPGPR__return);


        }
        {
        System.out.println("Invoking attivazioneRecuperoMetadati...");
        java.lang.String _attivazioneRecuperoMetadati_asr = "";
        java.lang.String _attivazioneRecuperoMetadati_dataRECUPERODA = "";
        java.lang.String _attivazioneRecuperoMetadati_dataRECUPEROA = "";
        java.lang.String _attivazioneRecuperoMetadati__return = port.attivazioneRecuperoMetadati(_attivazioneRecuperoMetadati_asr, _attivazioneRecuperoMetadati_dataRECUPERODA, _attivazioneRecuperoMetadati_dataRECUPEROA);
        System.out.println("attivazioneRecuperoMetadati.result=" + _attivazioneRecuperoMetadati__return);


        }
        {
        System.out.println("Invoking setOpposizionePrecompilazione730GPR...");
        it.csi.gpr.SetOpposizionePrecompilazione730GPRRequest _setOpposizionePrecompilazione730GPR_richiesta = null;
        it.csi.gpr.SetOpposizionePrecompilazione730GPRResultType _setOpposizionePrecompilazione730GPR__return = port.setOpposizionePrecompilazione730GPR(_setOpposizionePrecompilazione730GPR_richiesta);
        System.out.println("setOpposizionePrecompilazione730GPR.result=" + _setOpposizionePrecompilazione730GPR__return);


        }
        {
        System.out.println("Invoking getListaTicketCF...");
        java.lang.String _getListaTicketCF_asr = "";
        java.lang.String _getListaTicketCF_uuid = "";
        java.lang.String _getListaTicketCF_azione = "";
        java.lang.String _getListaTicketCF_numeroSPORTELLO = "";
        java.lang.String _getListaTicketCF_numeroPRATICA = "";
        java.lang.String _getListaTicketCF_codiceFISCALE = "";
        java.lang.String _getListaTicketCF_importoPRATICA = "";
        it.csi.gpr.Importi _getListaTicketCF__return = port.getListaTicketCF(_getListaTicketCF_asr, _getListaTicketCF_uuid, _getListaTicketCF_azione, _getListaTicketCF_numeroSPORTELLO, _getListaTicketCF_numeroPRATICA, _getListaTicketCF_codiceFISCALE, _getListaTicketCF_importoPRATICA);
        System.out.println("getListaTicketCF.result=" + _getListaTicketCF__return);


        }
        {
        System.out.println("Invoking setAvvenutoPagamento...");
        it.csi.gpr.Pagamento _setAvvenutoPagamento_richiesta = null;
        it.csi.gpr.Quietanza _setAvvenutoPagamento__return = port.setAvvenutoPagamento(_setAvvenutoPagamento_richiesta);
        System.out.println("setAvvenutoPagamento.result=" + _setAvvenutoPagamento__return);


        }
        {
        System.out.println("Invoking setModalitaErogazioneRimborsoGPR...");
        it.csi.gpr.SetModalitaErogazioneRimborsoGPRRequest _setModalitaErogazioneRimborsoGPR_richiesta = null;
        it.csi.gpr.SetModalitaErogazioneRimborsoGPRResultType _setModalitaErogazioneRimborsoGPR__return = port.setModalitaErogazioneRimborsoGPR(_setModalitaErogazioneRimborsoGPR_richiesta);
        System.out.println("setModalitaErogazioneRimborsoGPR.result=" + _setModalitaErogazioneRimborsoGPR__return);


        }
        {
        System.out.println("Invoking getImportoTicket...");
        it.csi.gpr.Richiesta _getImportoTicket_richiesta = null;
        it.csi.gpr.Importi _getImportoTicket__return = port.getImportoTicket(_getImportoTicket_richiesta);
        System.out.println("getImportoTicket.result=" + _getImportoTicket__return);


        }
        {
        System.out.println("Invoking lmsGetTicketPagati...");
        it.csi.gpr.LMSGetTicketPagatiRequest _lmsGetTicketPagati_parameters = null;
        it.csi.gpr.LMSGetTicketPagatiResponse _lmsGetTicketPagati__return = port.lmsGetTicketPagati(_lmsGetTicketPagati_parameters);
        System.out.println("lmsGetTicketPagati.result=" + _lmsGetTicketPagati__return);


        }
        {
        System.out.println("Invoking getMultiIUVGPR...");
        it.csi.gpr.RichiestaMultiIuv _getMultiIUVGPR_richiesta = null;
        javax.xml.ws.Holder<it.csi.gpr.RispostaMultiIuv> _getMultiIUVGPR_getMultiIUVGPRResult = new javax.xml.ws.Holder<it.csi.gpr.RispostaMultiIuv>();
        javax.xml.ws.Holder<it.csi.gpr.Errore> _getMultiIUVGPR_errore = new javax.xml.ws.Holder<it.csi.gpr.Errore>();
        port.getMultiIUVGPR(_getMultiIUVGPR_richiesta, _getMultiIUVGPR_getMultiIUVGPRResult, _getMultiIUVGPR_errore);

        System.out.println("getMultiIUVGPR._getMultiIUVGPR_getMultiIUVGPRResult=" + _getMultiIUVGPR_getMultiIUVGPRResult.value);
        System.out.println("getMultiIUVGPR._getMultiIUVGPR_errore=" + _getMultiIUVGPR_errore.value);

        }
        {
        System.out.println("Invoking getListaRimborsiGPR...");
        it.csi.gpr.GetListaRimborsiGPRRequest _getListaRimborsiGPR_richiesta = null;
        it.csi.gpr.ListaRimborsiGPRResultType _getListaRimborsiGPR__return = port.getListaRimborsiGPR(_getListaRimborsiGPR_richiesta);
        System.out.println("getListaRimborsiGPR.result=" + _getListaRimborsiGPR__return);


        }
        {
        System.out.println("Invoking setAssociazioneIUVTicketGPR...");
        it.csi.gpr.RichiestaAssociazioneIUVTicket _setAssociazioneIUVTicketGPR_richiesta = null;
        javax.xml.ws.Holder<it.csi.gpr.RispostaAssociazioneIUVTicket> _setAssociazioneIUVTicketGPR_risposta = new javax.xml.ws.Holder<it.csi.gpr.RispostaAssociazioneIUVTicket>();
        javax.xml.ws.Holder<it.csi.gpr.Errore> _setAssociazioneIUVTicketGPR_errore = new javax.xml.ws.Holder<it.csi.gpr.Errore>();
        port.setAssociazioneIUVTicketGPR(_setAssociazioneIUVTicketGPR_richiesta, _setAssociazioneIUVTicketGPR_risposta, _setAssociazioneIUVTicketGPR_errore);

        System.out.println("setAssociazioneIUVTicketGPR._setAssociazioneIUVTicketGPR_risposta=" + _setAssociazioneIUVTicketGPR_risposta.value);
        System.out.println("setAssociazioneIUVTicketGPR._setAssociazioneIUVTicketGPR_errore=" + _setAssociazioneIUVTicketGPR_errore.value);

        }
        {
        System.out.println("Invoking echo...");
        java.lang.String _echo_arg = "";
        java.lang.String _echo__return = port.echo(_echo_arg);
        System.out.println("echo.result=" + _echo__return);


        }
        {
        System.out.println("Invoking getDatiSensibiliUtenteCentrale...");
        java.lang.String _getDatiSensibiliUtenteCentrale_asr = "";
        java.lang.String _getDatiSensibiliUtenteCentrale_uuid = "";
        java.lang.String _getDatiSensibiliUtenteCentrale_azione = "";
        java.lang.String _getDatiSensibiliUtenteCentrale_numeroPRATICA = "";
        java.lang.String _getDatiSensibiliUtenteCentrale__return = port.getDatiSensibiliUtenteCentrale(_getDatiSensibiliUtenteCentrale_asr, _getDatiSensibiliUtenteCentrale_uuid, _getDatiSensibiliUtenteCentrale_azione, _getDatiSensibiliUtenteCentrale_numeroPRATICA);
        System.out.println("getDatiSensibiliUtenteCentrale.result=" + _getDatiSensibiliUtenteCentrale__return);


        }
        {
        System.out.println("Invoking attivazioneAcquisizioneListaStatoTicket...");
        java.lang.String _attivazioneAcquisizioneListaStatoTicket_azione = "";
        java.lang.String _attivazioneAcquisizioneListaStatoTicket_asr = "";
        java.lang.String _attivazioneAcquisizioneListaStatoTicket__return = port.attivazioneAcquisizioneListaStatoTicket(_attivazioneAcquisizioneListaStatoTicket_azione, _attivazioneAcquisizioneListaStatoTicket_asr);
        System.out.println("attivazioneAcquisizioneListaStatoTicket.result=" + _attivazioneAcquisizioneListaStatoTicket__return);


        }
        {
        System.out.println("Invoking lmsGetRicevuta...");
        it.csi.gpr.LMSGetRicevutaRequest _lmsGetRicevuta_parameters = null;
        it.csi.gpr.LMSGetRicevutaResponse _lmsGetRicevuta__return = port.lmsGetRicevuta(_lmsGetRicevuta_parameters);
        System.out.println("lmsGetRicevuta.result=" + _lmsGetRicevuta__return);


        }

        System.exit(0);
    }

}
