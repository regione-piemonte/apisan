/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisancons.integration.conspref.fontecittadino;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.Codifica;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.TipoFonte;


/**
 * <p>Classe Java per fonte complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="fonte">
 *   &lt;complexContent>
 *     &lt;extension base="{http://consprefbe.csi.it/}codifica">
 *       &lt;sequence>
 *         &lt;element name="tipoFonte" type="{http://consprefbe.csi.it/}tipoFonte" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fonte", propOrder = {
    "tipoFonte"
})
public class Fonte
    extends Codifica
{

    protected TipoFonte tipoFonte;

    /**
     * Recupera il valore della proprietà tipoFonte.
     * 
     * @return
     *     possible object is
     *     {@link TipoFonte }
     *     
     */
    public TipoFonte getTipoFonte() {
        return tipoFonte;
    }

    /**
     * Imposta il valore della proprietà tipoFonte.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoFonte }
     *     
     */
    public void setTipoFonte(TipoFonte value) {
        this.tipoFonte = value;
    }

}
