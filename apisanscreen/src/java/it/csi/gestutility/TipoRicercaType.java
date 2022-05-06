/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gestutility;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TipoRicercaType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoRicercaType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="STUDIO"/>
 *     &lt;enumeration value="GRUPPO"/>
 *     &lt;enumeration value="ORDINAMENTO"/>
 *     &lt;enumeration value="LETTERA"/>
 *     &lt;enumeration value="SOTTOGRUPPO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoRicercaType")
@XmlEnum
public enum TipoRicercaType {

    STUDIO,
    GRUPPO,
    ORDINAMENTO,
    LETTERA,
    SOTTOGRUPPO;

    public String value() {
        return name();
    }

    public static TipoRicercaType fromValue(String v) {
        return valueOf(v);
    }

}
