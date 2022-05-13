/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanpresc.soap.dma.elencoricetteservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per elencoRicetteStampaPromemoriaRequest complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="elencoRicetteStampaPromemoriaRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="richiedente" type="{http://dmacc.csi.it/}richiedente"/>
 *         &lt;element name="paziente" type="{http://dmacc.csi.it/}estremiPaziente"/>
 *         &lt;element name="informazioniRichiedente" type="{http://dmacc.csi.it/}informazioniRichiedente"/>
 *         &lt;element name="filtro" type="{http://dma.csi.it/}filtroRicette" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "elencoRicetteStampaPromemoriaRequest", namespace = "http://dmacc.csi.it/", propOrder = {
    "richiedente",
    "paziente",
    "informazioniRichiedente",
    "filtro"
})
public class ElencoRicetteStampaPromemoriaRequest {

    @XmlElement(required = true)
    protected Richiedente richiedente;
    @XmlElement(required = true)
    protected EstremiPaziente paziente;
    @XmlElement(required = true)
    protected InformazioniRichiedente informazioniRichiedente;
    protected FiltroRicette filtro;

    /**
     * Recupera il valore della property richiedente.
     * 
     * @return
     *     possible object is
     *     {@link Richiedente }
     *     
     */
    public Richiedente getRichiedente() {
        return richiedente;
    }

    /**
     * Imposta il valore della property richiedente.
     * 
     * @param value
     *     allowed object is
     *     {@link Richiedente }
     *     
     */
    public void setRichiedente(Richiedente value) {
        this.richiedente = value;
    }

    /**
     * Recupera il valore della property paziente.
     * 
     * @return
     *     possible object is
     *     {@link EstremiPaziente }
     *     
     */
    public EstremiPaziente getPaziente() {
        return paziente;
    }

    /**
     * Imposta il valore della property paziente.
     * 
     * @param value
     *     allowed object is
     *     {@link EstremiPaziente }
     *     
     */
    public void setPaziente(EstremiPaziente value) {
        this.paziente = value;
    }

    /**
     * Recupera il valore della property informazioniRichiedente.
     * 
     * @return
     *     possible object is
     *     {@link InformazioniRichiedente }
     *     
     */
    public InformazioniRichiedente getInformazioniRichiedente() {
        return informazioniRichiedente;
    }

    /**
     * Imposta il valore della property informazioniRichiedente.
     * 
     * @param value
     *     allowed object is
     *     {@link InformazioniRichiedente }
     *     
     */
    public void setInformazioniRichiedente(InformazioniRichiedente value) {
        this.informazioniRichiedente = value;
    }

    /**
     * Recupera il valore della property filtro.
     * 
     * @return
     *     possible object is
     *     {@link FiltroRicette }
     *     
     */
    public FiltroRicette getFiltro() {
        return filtro;
    }

    /**
     * Imposta il valore della property filtro.
     * 
     * @param value
     *     allowed object is
     *     {@link FiltroRicette }
     *     
     */
    public void setFiltro(FiltroRicette value) {
        this.filtro = value;
    }

}
