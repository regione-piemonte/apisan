/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.documenti.dma;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per tipoCorrelazioneDocumento.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoCorrelazioneDocumento">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NRE"/>
 *     &lt;enumeration value="NUMERO_SDO"/>
 *     &lt;enumeration value="NUMERO_PASSAGGIO_PS"/>
 *     &lt;enumeration value="PADRE_FIGLIO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoCorrelazioneDocumento")
@XmlEnum
public enum TipoCorrelazioneDocumento {

    NRE,
    NUMERO_SDO,
    NUMERO_PASSAGGIO_PS,
    PADRE_FIGLIO;

    public String value() {
        return name();
    }

    public static TipoCorrelazioneDocumento fromValue(String v) {
        return valueOf(v);
    }

}
