/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.documenti.dmacc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per tipoMedico.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoMedico">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VALIDANTE"/>
 *     &lt;enumeration value="REFERTANTE"/>
 *     &lt;enumeration value="ENTRAMBI"/>
 *     &lt;enumeration value="VALIDANTEOREFERTANTE"/>
 *     &lt;enumeration value="UNDEFINED_VALUE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoMedico")
@XmlEnum
public enum TipoMedico {

    VALIDANTE,
    REFERTANTE,
    ENTRAMBI,
    VALIDANTEOREFERTANTE,
    UNDEFINED_VALUE;

    public String value() {
        return name();
    }

    public static TipoMedico fromValue(String v) {
        return valueOf(v);
    }

}
