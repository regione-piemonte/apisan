/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.gpr;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TipoOperazioneSetCodiceVersamentoType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoOperazioneSetCodiceVersamentoType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="C"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoOperazioneSetCodiceVersamentoType")
@XmlEnum
public enum TipoOperazioneSetCodiceVersamentoType {

    A,
    C;

    public String value() {
        return name();
    }

    public static TipoOperazioneSetCodiceVersamentoType fromValue(String v) {
        return valueOf(v);
    }

}
