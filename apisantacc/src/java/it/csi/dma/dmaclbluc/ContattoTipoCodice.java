/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.dmaclbluc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per contattoTipoCodice.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="contattoTipoCodice">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VIS"/>
 *     &lt;enumeration value="RIC"/>
 *     &lt;enumeration value="DIA"/>
 *     &lt;enumeration value="TRATMED"/>
 *     &lt;enumeration value="PS"/>
 *     &lt;enumeration value="ALTRO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "contattoTipoCodice")
@XmlEnum
public enum ContattoTipoCodice {

    VIS,
    RIC,
    DIA,
    TRATMED,
    PS,
    ALTRO;

    public String value() {
        return name();
    }

    public static ContattoTipoCodice fromValue(String v) {
        return valueOf(v);
    }

}
