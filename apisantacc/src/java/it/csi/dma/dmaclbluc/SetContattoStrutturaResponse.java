/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.dmaclbluc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per setContattoStrutturaResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="setContattoStrutturaResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmaclbluc.dma.csi.it/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="contattoStruttura" type="{http://dmaclbluc.dma.csi.it/}contattoStrutturaResponse" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setContattoStrutturaResponse", propOrder = {
    "contattoStruttura"
})
public class SetContattoStrutturaResponse
    extends ServiceResponse
{

    protected ContattoStrutturaResponse contattoStruttura;

    /**
     * Recupera il valore della proprietà contattoStruttura.
     * 
     * @return
     *     possible object is
     *     {@link ContattoStrutturaResponse }
     *     
     */
    public ContattoStrutturaResponse getContattoStruttura() {
        return contattoStruttura;
    }

    /**
     * Imposta il valore della proprietà contattoStruttura.
     * 
     * @param value
     *     allowed object is
     *     {@link ContattoStrutturaResponse }
     *     
     */
    public void setContattoStruttura(ContattoStrutturaResponse value) {
        this.contattoStruttura = value;
    }

}
