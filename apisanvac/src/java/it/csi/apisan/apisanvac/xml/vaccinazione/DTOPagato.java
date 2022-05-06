/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanvac.xml.vaccinazione;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per DTOPagato complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DTOPagato">
 *   &lt;complexContent>
 *     &lt;extension base="{}DTO">
 *       &lt;sequence>
 *         &lt;element name="Importo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTOPagato", propOrder = {
    "importo"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class DTOPagato
    extends DTO
{

    @XmlElement(name = "Importo")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected double importo;

    /**
     * Recupera il valore della proprietà importo.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public double getImporto() {
        return importo;
    }

    /**
     * Imposta il valore della proprietà importo.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:22+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setImporto(double value) {
        this.importo = value;
    }

}
