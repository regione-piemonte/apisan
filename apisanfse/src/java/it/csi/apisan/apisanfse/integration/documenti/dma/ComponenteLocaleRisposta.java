/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.documenti.dma;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per componenteLocaleRisposta complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="componenteLocaleRisposta">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dma.csi.it/}componenteLocale">
 *       &lt;sequence>
 *         &lt;element name="errori" type="{http://dma.csi.it/}errore" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="stato" type="{http://dma.csi.it/}componenteLocaleRispostaStato" minOccurs="0"/>
 *         &lt;element name="tempoMaxAttesaCLInSec" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="tempoMaxRestituzioneDatiInSec" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "componenteLocaleRisposta", propOrder = {
    "errori",
    "stato",
    "tempoMaxAttesaCLInSec",
    "tempoMaxRestituzioneDatiInSec"
})
public class ComponenteLocaleRisposta
    extends ComponenteLocale
{

    @XmlElement(nillable = true)
    protected List<Errore> errori;
    protected ComponenteLocaleRispostaStato stato;
    protected long tempoMaxAttesaCLInSec;
    protected long tempoMaxRestituzioneDatiInSec;

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
     * Recupera il valore della proprietà stato.
     * 
     * @return
     *     possible object is
     *     {@link ComponenteLocaleRispostaStato }
     *     
     */
    public ComponenteLocaleRispostaStato getStato() {
        return stato;
    }

    /**
     * Imposta il valore della proprietà stato.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponenteLocaleRispostaStato }
     *     
     */
    public void setStato(ComponenteLocaleRispostaStato value) {
        this.stato = value;
    }

    /**
     * Recupera il valore della proprietà tempoMaxAttesaCLInSec.
     * 
     */
    public long getTempoMaxAttesaCLInSec() {
        return tempoMaxAttesaCLInSec;
    }

    /**
     * Imposta il valore della proprietà tempoMaxAttesaCLInSec.
     * 
     */
    public void setTempoMaxAttesaCLInSec(long value) {
        this.tempoMaxAttesaCLInSec = value;
    }

    /**
     * Recupera il valore della proprietà tempoMaxRestituzioneDatiInSec.
     * 
     */
    public long getTempoMaxRestituzioneDatiInSec() {
        return tempoMaxRestituzioneDatiInSec;
    }

    /**
     * Imposta il valore della proprietà tempoMaxRestituzioneDatiInSec.
     * 
     */
    public void setTempoMaxRestituzioneDatiInSec(long value) {
        this.tempoMaxRestituzioneDatiInSec = value;
    }

}
