/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanvac.xml.infodatiassistito;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per StatiVaccinaliEnum.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="StatiVaccinaliEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="InCorso"/>
 *     &lt;enumeration value="Terminato"/>
 *     &lt;enumeration value="InadempienteTotale"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StatiVaccinaliEnum")
@XmlEnum
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-03T10:17:06+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public enum StatiVaccinaliEnum {

    @XmlEnumValue("InCorso")
    IN_CORSO("InCorso"),
    @XmlEnumValue("Terminato")
    TERMINATO("Terminato"),
    @XmlEnumValue("InadempienteTotale")
    INADEMPIENTE_TOTALE("InadempienteTotale");
    private final String value;

    StatiVaccinaliEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatiVaccinaliEnum fromValue(String v) {
        for (StatiVaccinaliEnum c: StatiVaccinaliEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
