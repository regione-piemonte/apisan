/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gestutility;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TipoEntitaStatoType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoEntitaStatoType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ELABORAZIONE"/>
 *     &lt;enumeration value="LOTTO"/>
 *     &lt;enumeration value="SIMULAZIONE_GOI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoEntitaStatoType")
@XmlEnum
public enum TipoEntitaStatoType {

    ELABORAZIONE,
    LOTTO,
    SIMULAZIONE_GOI;

    public String value() {
        return name();
    }

    public static TipoEntitaStatoType fromValue(String v) {
        return valueOf(v);
    }

}
