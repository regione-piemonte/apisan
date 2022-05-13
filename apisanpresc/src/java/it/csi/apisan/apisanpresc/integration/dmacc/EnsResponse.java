/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanpresc.integration.dmacc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import it.csi.apisan.apisanpresc.integration.dma.EnsMessagebody;


/**
 * <p>Classe Java per Ens_Response complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Ens_Response">
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
@XmlType(name = "Ens_Response")
@XmlSeeAlso({
    GetRefertoSRResponse.class,
    GetListaRefertiSRResponse.class,
    AnnullaRefertoSRResponse.class
})
public class EnsResponse
    extends EnsMessagebody
{


}
