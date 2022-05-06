/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.dmaclbluc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per cancellaFarmacoRequest complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="cancellaFarmacoRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmaclbluc.dma.csi.it/}requestCommon">
 *       &lt;sequence>
 *         &lt;element name="identificativoFarmaco" type="{http://www.w3.org/2001/XMLSchema}long" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cancellaFarmacoRequest", propOrder = {
    "identificativoFarmaco"
})
public class CancellaFarmacoRequest
    extends RequestCommon
{

    protected long identificativoFarmaco;

    /**
     * Recupera il valore della proprietà identificativoFarmaco.
     * 
     */
    public long getIdentificativoFarmaco() {
        return identificativoFarmaco;
    }

    /**
     * Imposta il valore della proprietà identificativoFarmaco.
     * 
     */
    public void setIdentificativoFarmaco(long value) {
        this.identificativoFarmaco = value;
    }

}
