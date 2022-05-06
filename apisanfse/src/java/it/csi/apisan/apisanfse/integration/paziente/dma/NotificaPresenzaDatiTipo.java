/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.paziente.dma;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per notificaPresenzaDatiTipo.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="notificaPresenzaDatiTipo">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AS"/>
 *     &lt;enumeration value="ROPVA"/>
 *     &lt;enumeration value="IMR"/>
 *     &lt;enumeration value="DOCUMENTI_PERSONALI"/>
 *     &lt;enumeration value="MISURAZIONI"/>
 *     &lt;enumeration value="RILEVAZIONI_ALIMENTARI"/>
 *     &lt;enumeration value="ASSUNZIONE_FARMACI"/>
 *     &lt;enumeration value="NOTE"/>
 *     &lt;enumeration value="APPLICAZIONE_REGIONALE"/>
 *     &lt;enumeration value="UNDEFINED_VALUE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "notificaPresenzaDatiTipo")
@XmlEnum
public enum NotificaPresenzaDatiTipo {

    AS,
    ROPVA,
    IMR,
    DOCUMENTI_PERSONALI,
    MISURAZIONI,
    RILEVAZIONI_ALIMENTARI,
    ASSUNZIONE_FARMACI,
    NOTE,
    APPLICAZIONE_REGIONALE,
    UNDEFINED_VALUE;

    public String value() {
        return name();
    }

    public static NotificaPresenzaDatiTipo fromValue(String v) {
        return valueOf(v);
    }

}
