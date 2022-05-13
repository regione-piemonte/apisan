/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanpresc.soap.pro.logaudit;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per risultatoCodice.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="risultatoCodice">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SUCCESSO"/>
 *     &lt;enumeration value="FALLIMENTO"/>
 *     &lt;enumeration value="AVVISO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "risultatoCodice")
@XmlEnum
public enum RisultatoCodice {

    SUCCESSO,
    FALLIMENTO,
    AVVISO;

    public String value() {
        return name();
    }

    public static RisultatoCodice fromValue(String v) {
        return valueOf(v);
    }

}
