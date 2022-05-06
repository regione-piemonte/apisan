/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.dmaclbluc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per strutturaTipoCodice.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="strutturaTipoCodice">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="STRUT_SAN"/>
 *     &lt;enumeration value="MNC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "strutturaTipoCodice")
@XmlEnum
public enum StrutturaTipoCodice {

    STRUT_SAN,
    MNC;

    public String value() {
        return name();
    }

    public static StrutturaTipoCodice fromValue(String v) {
        return valueOf(v);
    }

}
