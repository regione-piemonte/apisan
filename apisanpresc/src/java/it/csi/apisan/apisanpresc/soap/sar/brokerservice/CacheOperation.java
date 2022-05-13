/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanpresc.soap.sar.brokerservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per cacheOperation.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="cacheOperation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CL"/>
 *     &lt;enumeration value="GT"/>
 *     &lt;enumeration value="GTI"/>
 *     &lt;enumeration value="GT_PARAM"/>
 *     &lt;enumeration value="GT_ATTIVAZ"/>
 *     &lt;enumeration value="RM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cacheOperation")
@XmlEnum
public enum CacheOperation {

    CL,
    GT,
    GTI,
    GT_PARAM,
    GT_ATTIVAZ,
    RM;

    public String value() {
        return name();
    }

    public static CacheOperation fromValue(String v) {
        return valueOf(v);
    }

}
