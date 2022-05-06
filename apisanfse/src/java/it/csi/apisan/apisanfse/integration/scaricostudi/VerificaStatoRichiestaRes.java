/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.scaricostudi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per VerificaStatoRichiestaRes complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="VerificaStatoRichiestaRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmacc.csi.it/}Ens_Response">
 *       &lt;sequence>
 *         &lt;element ref="{http://dma.csi.it/}errori" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://dmacc.csi.it/}esito" minOccurs="0"/>
 *         &lt;element ref="{http://dma.csi.it/}idPacchetto" minOccurs="0"/>
 *         &lt;element ref="{http://dma.csi.it/}statoRichiesta" minOccurs="0"/>
 *         &lt;element ref="{http://dma.csi.it/}dimensione" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerificaStatoRichiestaRes", propOrder = {
    "errori",
    "esito",
    "idPacchetto",
    "statoRichiesta",
    "dimensione"
})
public class VerificaStatoRichiestaRes
    extends EnsResponse
{

    @XmlElement(namespace = "http://dma.csi.it/", nillable = true)
    protected List<Errore> errori;
    @XmlElement(namespace = "http://dmacc.csi.it/")
    protected RisultatoCodice esito;
    @XmlElement(namespace = "http://dma.csi.it/")
    protected String idPacchetto;
    @XmlElement(namespace = "http://dma.csi.it/")
    protected StatoRichiesta statoRichiesta;
    @XmlElement(namespace = "http://dma.csi.it/")
    protected Long dimensione;

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
     * Recupera il valore della proprieta esito.
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
     * Imposta il valore della proprieta esito.
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
     * Recupera il valore della proprieta idPacchetto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPacchetto() {
        return idPacchetto;
    }

    /**
     * Imposta il valore della proprieta idPacchetto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPacchetto(String value) {
        this.idPacchetto = value;
    }

    /**
     * Recupera il valore della proprieta statoRichiesta.
     * 
     * @return
     *     possible object is
     *     {@link StatoRichiesta }
     *     
     */
    public StatoRichiesta getStatoRichiesta() {
        return statoRichiesta;
    }

    /**
     * Imposta il valore della proprieta statoRichiesta.
     * 
     * @param value
     *     allowed object is
     *     {@link StatoRichiesta }
     *     
     */
    public void setStatoRichiesta(StatoRichiesta value) {
        this.statoRichiesta = value;
    }

    /**
     * Recupera il valore della proprieta dimensione.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDimensione() {
        return dimensione;
    }

    /**
     * Imposta il valore della proprieta dimensione.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDimensione(Long value) {
        this.dimensione = value;
    }

}
