/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.integration.scaricostudi;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;

/**
 * This class was generated by Apache CXF 2.7.14
 * 2018-10-18T17:13:01.822+02:00
 * Generated source version: 2.7.14
 * 
 */
@WebService(targetNamespace = "http://dmacc.csi.it/", name = "CCScaricoStudiServicePortType")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface CCScaricoStudiServicePortType {

    @WebMethod(action = "http://dmacc.csi.it/IMR.WS.ScaricoStudi.verificaStatoRichiesta")
    @Action(input = "http://dmacc.csi.it/IMR.WS.ScaricoStudi.verificaStatoRichiesta", output = "http://dmacc.csi.it/ScaricoStudiServiceSoap/verificaStatoRichiestaResponse")
    @WebResult(name = "verificaStatoRichiestaResponse", targetNamespace = "http://dmacc.csi.it/", partName = "verificaStatoRichiestaResponse")
    public VerificaStatoRichiestaRes verificaStatoRichiesta(
        @WebParam(partName = "pRequest3", name = "pRequest3", targetNamespace = "http://dmacc.csi.it/")
        VerificaStatoRichiestaReq pRequest3
    );

    @WebMethod(action = "http://dmacc.csi.it/IMR.WS.ScaricoStudi.verificaStatoListaRichieste")
    @Action(input = "http://dmacc.csi.it/IMR.WS.ScaricoStudi.verificaStatoListaRichieste", output = "http://dmacc.csi.it/ScaricoStudiServiceSoap/verificaStatoListaRichiesteResponse")
    @WebResult(name = "verificaStatoListaRichiesteResponse", targetNamespace = "http://dmacc.csi.it/", partName = "verificaStatoListaRichiesteResponse")
    public VerificaStatoListaRichiesteRes verificaStatoListaRichieste(
        @WebParam(partName = "pRequest4", name = "pRequest4", targetNamespace = "http://dmacc.csi.it/")
        VerificaStatoListaRichiesteReq pRequest4
    );

    @WebMethod(action = "http://dmacc.csi.it/IMR.WS.ScaricoStudi.cancellaPacchetto")
    @Action(input = "http://dmacc.csi.it/IMR.WS.ScaricoStudi.cancellaPacchetto", output = "http://dmacc.csi.it/ScaricoStudiServiceSoap/cancellaPacchettoResponse")
    @WebResult(name = "cancellaPacchettoResponse", targetNamespace = "http://dmacc.csi.it/", partName = "cancellaPacchettoResponse")
    public CancellaPacchettoRes cancellaPacchetto(
        @WebParam(partName = "pRequest1", name = "pRequest1", targetNamespace = "http://dmacc.csi.it/")
        CancellaPacchettoReq pRequest1
    );

    @WebMethod(action = "http://dmacc.csi.it/IMR.WS.ScaricoStudi.scaricaStudi")
    @Action(input = "http://dmacc.csi.it/IMR.WS.ScaricoStudi.scaricaStudi", output = "http://dmacc.csi.it/ScaricoStudiServiceSoap/scaricaStudiResponse")
    @WebResult(name = "scaricaStudiResponse", targetNamespace = "http://dmacc.csi.it/", partName = "scaricaStudiResponse")
    public ScaricaStudiRes scaricaStudi(
        @WebParam(partName = "pRequest2", name = "pRequest2", targetNamespace = "http://dmacc.csi.it/")
        ScaricaStudiReq pRequest2
    );
}
