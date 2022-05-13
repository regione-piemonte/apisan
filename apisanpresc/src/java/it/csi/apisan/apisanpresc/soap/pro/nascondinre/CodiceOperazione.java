/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanpresc.soap.pro.nascondinre;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per codiceOperazione.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="codiceOperazione">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RENDI_VISIBILE"/>
 *     &lt;enumeration value="RENDI_INVISIBILE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "codiceOperazione")
@XmlEnum
public enum CodiceOperazione {

    RENDI_VISIBILE,
    RENDI_INVISIBILE;

    public String value() {
        return name();
    }

    public static CodiceOperazione fromValue(String v) {
        return valueOf(v);
    }

}
