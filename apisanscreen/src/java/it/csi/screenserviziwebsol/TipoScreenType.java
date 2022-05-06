/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.screenserviziwebsol;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per tipoScreenType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoScreenType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CR"/>
 *     &lt;enumeration value="CV"/>
 *     &lt;enumeration value="MX"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoScreenType")
@XmlEnum
public enum TipoScreenType {

    CR,
    CV,
    MX;

    public String value() {
        return name();
    }

    public static TipoScreenType fromValue(String v) {
        return valueOf(v);
    }

}
