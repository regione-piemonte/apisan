/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.paziente.dmaccbl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per sintesiElementoTipo.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="sintesiElementoTipo">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EPISODI"/>
 *     &lt;enumeration value="DOCUMENTI"/>
 *     &lt;enumeration value="ROPVA"/>
 *     &lt;enumeration value="FARMACI"/>
 *     &lt;enumeration value="VACCINAZIONI"/>
 *     &lt;enumeration value="SCREENING"/>
 *     &lt;enumeration value="ESENZIONI"/>
 *     &lt;enumeration value="PABI"/>
 *     &lt;enumeration value="MARARE"/>
 *     &lt;enumeration value="DOCUMENTI_PERSONALI"/>
 *     &lt;enumeration value="MISURAZIONI"/>
 *     &lt;enumeration value="RILEVAZIONI_ALIMENTARI"/>
 *     &lt;enumeration value="NOTE"/>
 *     &lt;enumeration value="ASSUNZIONE_FARMACI"/>
 *     &lt;enumeration value="APPREG"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "sintesiElementoTipo")
@XmlEnum
public enum SintesiElementoTipo {

    EPISODI,
    DOCUMENTI,
    ROPVA,
    FARMACI,
    VACCINAZIONI,
    SCREENING,
    ESENZIONI,
    PABI,
    MARARE,
    DOCUMENTI_PERSONALI,
    MISURAZIONI,
    RILEVAZIONI_ALIMENTARI,
    NOTE,
    ASSUNZIONE_FARMACI,
    APPREG;

    public String value() {
        return name();
    }

    public static SintesiElementoTipo fromValue(String v) {
        return valueOf(v);
    }

}
