/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.ScaricoStudiWSBean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per VerificaStatoRichiestaResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="VerificaStatoRichiestaResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dma.csi.it/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="idPacchetto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statoRichiesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dimensione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerificaStatoRichiestaResponse", propOrder = {
    "idPacchetto",
    "statoRichiesta",
    "dimensione"
})
public class VerificaStatoRichiestaResponse
    extends ServiceResponse
{

    protected String idPacchetto;
    protected String statoRichiesta;
    protected String dimensione;

    /**
     * Recupera il valore della propriet� idPacchetto.
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
     * Imposta il valore della propriet� idPacchetto.
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
     * Recupera il valore della propriet� statoRichiesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatoRichiesta() {
        return statoRichiesta;
    }

    /**
     * Imposta il valore della propriet� statoRichiesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatoRichiesta(String value) {
        this.statoRichiesta = value;
    }

    /**
     * Recupera il valore della propriet� dimensione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDimensione() {
        return dimensione;
    }

    /**
     * Imposta il valore della propriet� dimensione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDimensione(String value) {
        this.dimensione = value;
    }

}
