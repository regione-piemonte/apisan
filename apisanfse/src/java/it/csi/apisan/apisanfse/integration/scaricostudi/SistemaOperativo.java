/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.scaricostudi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per sistemaOperativo.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="sistemaOperativo">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WINDOWS"/>
 *     &lt;enumeration value="LINUX"/>
 *     &lt;enumeration value="MAC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "sistemaOperativo", namespace = "http://dma.csi.it/")
@XmlEnum
public enum SistemaOperativo {

    WINDOWS,
    LINUX,
    MAC;

    public String value() {
        return name();
    }

    public static SistemaOperativo fromValue(String v) {
        return valueOf(v);
    }

}
