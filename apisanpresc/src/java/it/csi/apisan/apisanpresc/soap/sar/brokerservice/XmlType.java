/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanpresc.soap.sar.brokerservice;

import javax.xml.bind.annotation.XmlEnum;


/**
 * <p>Classe Java per xmlType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="xmlType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IN"/>
 *     &lt;enumeration value="OUT"/>
 *     &lt;enumeration value="SAC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@javax.xml.bind.annotation.XmlType(name = "xmlType")
@XmlEnum
public enum XmlType {

    IN,
    OUT,
    SAC;

    public String value() {
        return name();
    }

    public static XmlType fromValue(String v) {
        return valueOf(v);
    }

}
