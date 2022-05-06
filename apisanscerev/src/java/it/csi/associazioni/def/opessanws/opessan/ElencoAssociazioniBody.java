/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.associazioni.def.opessanws.opessan;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ElencoAssociazioniBody complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ElencoAssociazioniBody">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idAura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="infoRappLavoro" type="{http://opessan.opessanws.def.csi.it/}InfoRapportiLavoro" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElencoAssociazioniBody", propOrder = {
    "idAura",
    "infoRappLavoro"
})
public class ElencoAssociazioniBody {

    protected String idAura;
    protected InfoRapportiLavoro infoRappLavoro;

    /**
     * Recupera il valore della proprieta idAura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdAura() {
        return idAura;
    }

    /**
     * Imposta il valore della proprieta idAura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdAura(String value) {
        this.idAura = value;
    }

    /**
     * Recupera il valore della proprieta infoRappLavoro.
     * 
     * @return
     *     possible object is
     *     {@link InfoRapportiLavoro }
     *     
     */
    public InfoRapportiLavoro getInfoRappLavoro() {
        return infoRappLavoro;
    }

    /**
     * Imposta il valore della proprieta infoRappLavoro.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoRapportiLavoro }
     *     
     */
    public void setInfoRappLavoro(InfoRapportiLavoro value) {
        this.infoRappLavoro = value;
    }

}
