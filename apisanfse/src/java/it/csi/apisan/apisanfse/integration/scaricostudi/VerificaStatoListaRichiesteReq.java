/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.scaricostudi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per VerificaStatoListaRichiesteReq complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="VerificaStatoListaRichiesteReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmacc.csi.it/}Ens_Request">
 *       &lt;sequence>
 *         &lt;element name="codiceFiscale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idReferti" type="{http://dmacc.csi.it/}ArrayOfidRefertoString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerificaStatoListaRichiesteReq", propOrder = {
    "codiceFiscale",
    "idReferti"
})
public class VerificaStatoListaRichiesteReq
    extends EnsRequest
{

    protected String codiceFiscale;
    protected ArrayOfidRefertoString idReferti;

    /**
     * Recupera il valore della proprieta codiceFiscale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    /**
     * Imposta il valore della proprieta codiceFiscale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceFiscale(String value) {
        this.codiceFiscale = value;
    }

    /**
     * Recupera il valore della proprieta idReferti.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfidRefertoString }
     *     
     */
    public ArrayOfidRefertoString getIdReferti() {
        return idReferti;
    }

    /**
     * Imposta il valore della proprieta idReferti.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfidRefertoString }
     *     
     */
    public void setIdReferti(ArrayOfidRefertoString value) {
        this.idReferti = value;
    }

}
