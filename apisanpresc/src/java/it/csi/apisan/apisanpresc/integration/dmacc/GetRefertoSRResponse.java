/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanpresc.integration.dmacc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import it.csi.apisan.apisanpresc.integration.dma.Codifica;
import it.csi.apisan.apisanpresc.integration.dma.DocumentoSR;
import it.csi.apisan.apisanpresc.integration.dma.Errore;
import it.csi.apisan.apisanpresc.integration.dma.RisultatoCodice;


/**
 * <p>Classe Java per getRefertoSRResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getRefertoSRResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmacc.csi.it/}Ens_Response">
 *       &lt;sequence>
 *         &lt;element ref="{http://dma.csi.it/}codifiche" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://dma.csi.it/}errori" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="esito" type="{http://dma.csi.it/}risultatoCodice" minOccurs="0"/>
 *         &lt;element ref="{http://dma.csi.it/}documenti" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRefertoSRResponse", propOrder = {
    "codifiche",
    "errori",
    "esito",
    "documenti"
})
public class GetRefertoSRResponse
    extends EnsResponse
{

    @XmlElement(namespace = "http://dma.csi.it/", nillable = true)
    protected List<Codifica> codifiche;
    @XmlElement(namespace = "http://dma.csi.it/", nillable = true)
    protected List<Errore> errori;
    @XmlSchemaType(name = "string")
    protected RisultatoCodice esito;
    @XmlElement(namespace = "http://dma.csi.it/", nillable = true)
    protected List<DocumentoSR> documenti;

    /**
     * Gets the value of the codifiche property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codifiche property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodifiche().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Codifica }
     * 
     * 
     */
    public List<Codifica> getCodifiche() {
        if (codifiche == null) {
            codifiche = new ArrayList<Codifica>();
        }
        return this.codifiche;
    }

    /**
     * Gets the value of the errori property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errori property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrori().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Errore }
     * 
     * 
     */
    public List<Errore> getErrori() {
        if (errori == null) {
            errori = new ArrayList<Errore>();
        }
        return this.errori;
    }

    /**
     * Recupera il valore della property esito.
     * 
     * @return
     *     possible object is
     *     {@link RisultatoCodice }
     *     
     */
    public RisultatoCodice getEsito() {
        return esito;
    }

    /**
     * Imposta il valore della property esito.
     * 
     * @param value
     *     allowed object is
     *     {@link RisultatoCodice }
     *     
     */
    public void setEsito(RisultatoCodice value) {
        this.esito = value;
    }

    /**
     * Gets the value of the documenti property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documenti property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumenti().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentoSR }
     * 
     * 
     */
    public List<DocumentoSR> getDocumenti() {
        if (documenti == null) {
            documenti = new ArrayList<DocumentoSR>();
        }
        return this.documenti;
    }

}
