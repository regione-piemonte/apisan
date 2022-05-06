/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.dma.dmaclbluc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per requestCommon complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="requestCommon">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://dmaclbluc.dma.csi.it/}richiedente"/>
 *         &lt;element name="taccuino" type="{http://www.w3.org/2001/XMLSchema}long" form="qualified"/>
 *         &lt;element name="paziente" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestCommon", propOrder = {
    "richiedente",
    "taccuino",
    "paziente"
})
@XmlSeeAlso({
    CancellaDietaRequest.class,
    GetDescrittoriMisurazioneRequest.class,
    CancellaFarmacoRequest.class,
    CancellaSintomiRequest.class,
    SetRilevazioniRequest.class,
    CancellaContattiStruttureRequest.class,
    SetFarmacoRequest.class,
    SetImpostazioniTaccuinoRequest.class,
    SetDoloreRequest.class,
    SetNotaGeneraleRequest.class,
    GetDecodificaContattoTipoRequest.class,
    SetEventoRequest.class,
    CancellaDoloriRequest.class,
    GetDecodificaIntensitaDoloreRequest.class,
    CancellaEventoRequest.class,
    GetDecodificaModalitaRilevazioneRequest.class,
    CancellaRilevazioniRequest.class,
    SetContattoStrutturaRequest.class,
    SetOscuramentoTaccuinoRequest.class,
    GetDecodificaStrutturaTipoRequest.class,
    SetSintomoRequest.class,
    SetDietaRequest.class,
    RequestCommonGet.class
})
public class RequestCommon {

    @XmlElement(required = true)
    protected Richiedente richiedente;
    protected long taccuino;
    @XmlElement(required = true)
    protected String paziente;

    /**
     * Recupera il valore della proprietà richiedente.
     * 
     * @return
     *     possible object is
     *     {@link Richiedente }
     *     
     */
    public Richiedente getRichiedente() {
        return richiedente;
    }

    /**
     * Imposta il valore della proprietà richiedente.
     * 
     * @param value
     *     allowed object is
     *     {@link Richiedente }
     *     
     */
    public void setRichiedente(Richiedente value) {
        this.richiedente = value;
    }

    /**
     * Recupera il valore della proprietà taccuino.
     * 
     */
    public long getTaccuino() {
        return taccuino;
    }

    /**
     * Imposta il valore della proprietà taccuino.
     * 
     */
    public void setTaccuino(long value) {
        this.taccuino = value;
    }

    /**
     * Recupera il valore della proprietà paziente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaziente() {
        return paziente;
    }

    /**
     * Imposta il valore della proprietà paziente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaziente(String value) {
        this.paziente = value;
    }

}
