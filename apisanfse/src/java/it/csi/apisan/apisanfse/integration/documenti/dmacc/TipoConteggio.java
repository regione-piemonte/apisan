/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.documenti.dmacc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per tipoConteggio.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoConteggio">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AREA_BLU"/>
 *     &lt;enumeration value="ETICHETTA"/>
 *     &lt;enumeration value="EPISODIO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoConteggio")
@XmlEnum
public enum TipoConteggio {

    AREA_BLU,
    ETICHETTA,
    EPISODIO;

    public String value() {
        return name();
    }

    public static TipoConteggio fromValue(String v) {
        return valueOf(v);
    }

}
