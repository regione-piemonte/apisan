/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanvac.integration.dmacc;

import it.csi.apisan.apisanvac.integration.dma.AnnullaRefertoSR;
import it.csi.apisan.apisanvac.integration.dma.EnsMessagebody;
import it.csi.apisan.apisanvac.integration.dma.GetRefertoSR;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Ens_Request complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Ens_Request">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmacc.csi.it/}Ens_Messagebody">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ens_Request")
@XmlSeeAlso({
    GetRefertoSR.class,
    GetListaRefertiSR.class,
    AnnullaRefertoSR.class
})
public class EnsRequest
    extends EnsMessagebody
{


}
