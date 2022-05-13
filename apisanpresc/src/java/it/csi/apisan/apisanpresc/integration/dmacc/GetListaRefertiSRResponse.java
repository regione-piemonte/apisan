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
import it.csi.apisan.apisanpresc.integration.dma.ComponenteLocaleRisposta;
import it.csi.apisan.apisanpresc.integration.dma.Errore;
import it.csi.apisan.apisanpresc.integration.dma.MetadatiDocumentoSR;
import it.csi.apisan.apisanpresc.integration.dma.RisultatoCodice;


/**
 * <p>Classe Java per getListaRefertiSRResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getListaRefertiSRResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmacc.csi.it/}Ens_Response">
 *       &lt;sequence>
 *         &lt;element ref="{http://dma.csi.it/}codifiche" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://dma.csi.it/}errori" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="esito" type="{http://dma.csi.it/}risultatoCodice" minOccurs="0"/>
 *         &lt;element ref="{http://dma.csi.it/}metadatiDocumenti" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://dma.csi.it/}risposteComponentiLocali" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getListaRefertiSRResponse", propOrder = {
    "codifiche",
    "errori",
    "esito",
    "metadatiDocumenti",
    "risposteComponentiLocali"
})
public class GetListaRefertiSRResponse
    extends EnsResponse
{

    @XmlElement(namespace = "http://dma.csi.it/", nillable = true)
    protected List<Codifica> codifiche;
    @XmlElement(namespace = "http://dma.csi.it/", nillable = true)
    protected List<Errore> errori;
    @XmlSchemaType(name = "string")
    protected RisultatoCodice esito;
    @XmlElement(namespace = "http://dma.csi.it/", nillable = true)
    protected List<MetadatiDocumentoSR> metadatiDocumenti;
    @XmlElement(namespace = "http://dma.csi.it/", nillable = true)
    protected List<ComponenteLocaleRisposta> risposteComponentiLocali;

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
     * Gets the value of the metadatiDocumenti property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metadatiDocumenti property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetadatiDocumenti().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetadatiDocumentoSR }
     * 
     * 
     */
    public List<MetadatiDocumentoSR> getMetadatiDocumenti() {
        if (metadatiDocumenti == null) {
            metadatiDocumenti = new ArrayList<MetadatiDocumentoSR>();
        }
        return this.metadatiDocumenti;
    }

    /**
     * Gets the value of the risposteComponentiLocali property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the risposteComponentiLocali property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRisposteComponentiLocali().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComponenteLocaleRisposta }
     * 
     * 
     */
    public List<ComponenteLocaleRisposta> getRisposteComponentiLocali() {
        if (risposteComponentiLocali == null) {
            risposteComponentiLocali = new ArrayList<ComponenteLocaleRisposta>();
        }
        return this.risposteComponentiLocali;
    }

}
