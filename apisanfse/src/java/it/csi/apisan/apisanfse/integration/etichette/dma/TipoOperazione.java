/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.etichette.dma;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per tipoOperazione.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoOperazione">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AGGIORNAMENTO"/>
 *     &lt;enumeration value="CANCELLAZIONE"/>
 *     &lt;enumeration value="ASSOCIAZIONE"/>
 *     &lt;enumeration value="DISASSOCIAZIONE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoOperazione")
@XmlEnum
public enum TipoOperazione {

    AGGIORNAMENTO,
    CANCELLAZIONE,
    ASSOCIAZIONE,
    DISASSOCIAZIONE;

    public String value() {
        return name();
    }

    public static TipoOperazione fromValue(String v) {
        return valueOf(v);
    }

}
