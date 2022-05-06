/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanfse.integration.scaricostudi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per statoRichiesta.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="statoRichiesta">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ERRORE_WS"/>
 *     &lt;enumeration value="RICHIESTA_NON_PRESENTE"/>
 *     &lt;enumeration value="CANCELLAZIONE_PACCHETTO_SOSPESA"/>
 *     &lt;enumeration value="COMPOSIZIONE_PACCHETTO_SOSPESA"/>
 *     &lt;enumeration value="SCARICATO"/>
 *     &lt;enumeration value="DA_ELABORARE"/>
 *     &lt;enumeration value="ELAB_IN_CORSO"/>
 *     &lt;enumeration value="DISPONIBILE"/>
 *     &lt;enumeration value="INVIO_MAIL_IN_CORSO"/>
 *     &lt;enumeration value="NOTIFICATO"/>
 *     &lt;enumeration value="ERRORE_COMPONI_PACCHETTO"/>
 *     &lt;enumeration value="ERRORE_INVIO_MAIL"/>
 *     &lt;enumeration value="PACCHETTO_DA_CANCELLARE"/>
 *     &lt;enumeration value="PACCHETTO_IN_CANCELLAZIONE"/>
 *     &lt;enumeration value="PACCHETTO_CANCELLATO"/>
 *     &lt;enumeration value="ERRORE_IN_CANCELLAZIONE_PACCHETTO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "statoRichiesta", namespace = "http://dma.csi.it/")
@XmlEnum
public enum StatoRichiesta {

    ERRORE_WS,
    RICHIESTA_NON_PRESENTE,
    CANCELLAZIONE_PACCHETTO_SOSPESA,
    COMPOSIZIONE_PACCHETTO_SOSPESA,
    SCARICATO,
    DA_ELABORARE,
    ELAB_IN_CORSO,
    DISPONIBILE,
    INVIO_MAIL_IN_CORSO,
    NOTIFICATO,
    ERRORE_COMPONI_PACCHETTO,
    ERRORE_INVIO_MAIL,
    PACCHETTO_DA_CANCELLARE,
    PACCHETTO_IN_CANCELLAZIONE,
    PACCHETTO_CANCELLATO,
    ERRORE_IN_CANCELLAZIONE_PACCHETTO;

    public String value() {
        return name();
    }

    public static StatoRichiesta fromValue(String v) {
        return valueOf(v);
    }

}
