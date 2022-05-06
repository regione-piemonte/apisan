/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.dmaclbluc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per cancellaDietaRequest complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="cancellaDietaRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmaclbluc.dma.csi.it/}requestCommon">
 *       &lt;sequence>
 *         &lt;element name="identificativoDieta" type="{http://www.w3.org/2001/XMLSchema}long" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cancellaDietaRequest", propOrder = {
    "identificativoDieta"
})
public class CancellaDietaRequest
    extends RequestCommon
{

    protected long identificativoDieta;

    /**
     * Recupera il valore della proprietà identificativoDieta.
     * 
     */
    public long getIdentificativoDieta() {
        return identificativoDieta;
    }

    /**
     * Imposta il valore della proprietà identificativoDieta.
     * 
     */
    public void setIdentificativoDieta(long value) {
        this.identificativoDieta = value;
    }

}
