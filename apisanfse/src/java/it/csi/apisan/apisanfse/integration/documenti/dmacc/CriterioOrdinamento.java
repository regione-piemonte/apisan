/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.documenti.dmacc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per criterioOrdinamento.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="criterioOrdinamento">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DATA"/>
 *     &lt;enumeration value="TIPO_DOC"/>
 *     &lt;enumeration value="MEDICO"/>
 *     &lt;enumeration value="REGIONE"/>
 *     &lt;enumeration value="AZIENDA"/>
 *     &lt;enumeration value="STRUTTURA"/>
 *     &lt;enumeration value="UNITA_OPERATIVA"/>
 *     &lt;enumeration value="MEDIATO"/>
 *     &lt;enumeration value="DA_MEDIARE"/>
 *     &lt;enumeration value="UNDEFINED_VALUE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "criterioOrdinamento")
@XmlEnum
public enum CriterioOrdinamento {

    DATA,
    TIPO_DOC,
    MEDICO,
    REGIONE,
    AZIENDA,
    STRUTTURA,
    UNITA_OPERATIVA,
    MEDIATO,
    DA_MEDIARE,
    UNDEFINED_VALUE;

    public String value() {
        return name();
    }

    public static CriterioOrdinamento fromValue(String v) {
        return valueOf(v);
    }

}
