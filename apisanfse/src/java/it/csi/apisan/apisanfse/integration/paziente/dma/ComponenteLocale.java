/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.paziente.dma;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per componenteLocale complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="componenteLocale">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dma.csi.it/}codifica">
 *       &lt;sequence>
 *         &lt;element name="aziendaSanitaria" type="{http://dma.csi.it/}aziendaSanitaria" minOccurs="0"/>
 *         &lt;element name="componenteLocaleTipo" type="{http://dma.csi.it/}componenteLocaleTipo" minOccurs="0"/>
 *         &lt;element name="servizi" type="{http://dma.csi.it/}componenteLocaleServizio" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="erroreRegistrazioneConsenso" type="{http://dma.csi.it/}siNo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "componenteLocale", propOrder = {
    "aziendaSanitaria",
    "componenteLocaleTipo",
    "servizi",
    "erroreRegistrazioneConsenso"
})
@XmlSeeAlso({
    ComponenteLocaleRisposta.class
})
public class ComponenteLocale
    extends Codifica
{

    protected AziendaSanitaria aziendaSanitaria;
    protected ComponenteLocaleTipo componenteLocaleTipo;
    @XmlElement(nillable = true)
    protected List<ComponenteLocaleServizio> servizi;
    protected SiNo erroreRegistrazioneConsenso;

    /**
     * Recupera il valore della proprietà aziendaSanitaria.
     * 
     * @return
     *     possible object is
     *     {@link AziendaSanitaria }
     *     
     */
    public AziendaSanitaria getAziendaSanitaria() {
        return aziendaSanitaria;
    }

    /**
     * Imposta il valore della proprietà aziendaSanitaria.
     * 
     * @param value
     *     allowed object is
     *     {@link AziendaSanitaria }
     *     
     */
    public void setAziendaSanitaria(AziendaSanitaria value) {
        this.aziendaSanitaria = value;
    }

    /**
     * Recupera il valore della proprietà componenteLocaleTipo.
     * 
     * @return
     *     possible object is
     *     {@link ComponenteLocaleTipo }
     *     
     */
    public ComponenteLocaleTipo getComponenteLocaleTipo() {
        return componenteLocaleTipo;
    }

    /**
     * Imposta il valore della proprietà componenteLocaleTipo.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponenteLocaleTipo }
     *     
     */
    public void setComponenteLocaleTipo(ComponenteLocaleTipo value) {
        this.componenteLocaleTipo = value;
    }

    /**
     * Gets the value of the servizi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the servizi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServizi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComponenteLocaleServizio }
     * 
     * 
     */
    public List<ComponenteLocaleServizio> getServizi() {
        if (servizi == null) {
            servizi = new ArrayList<ComponenteLocaleServizio>();
        }
        return this.servizi;
    }

    /**
     * Recupera il valore della proprietà erroreRegistrazioneConsenso.
     * 
     * @return
     *     possible object is
     *     {@link SiNo }
     *     
     */
    public SiNo getErroreRegistrazioneConsenso() {
        return erroreRegistrazioneConsenso;
    }

    /**
     * Imposta il valore della proprietà erroreRegistrazioneConsenso.
     * 
     * @param value
     *     allowed object is
     *     {@link SiNo }
     *     
     */
    public void setErroreRegistrazioneConsenso(SiNo value) {
        this.erroreRegistrazioneConsenso = value;
    }

}
