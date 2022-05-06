/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.etichette.dma;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per tipoEtichetta.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoEtichetta">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PERSONALE"/>
 *     &lt;enumeration value="ANATOMICA"/>
 *     &lt;enumeration value="ENTRAMBE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoEtichetta")
@XmlEnum
public enum TipoEtichetta {

    PERSONALE,
    ANATOMICA,
    ENTRAMBE;

    public String value() {
        return name();
    }

    public static TipoEtichetta fromValue(String v) {
        return valueOf(v);
    }

}
