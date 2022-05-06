/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanesenpat.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import com.fasterxml.jackson.annotation.JsonAnyGetter;
//import com.fasterxml.jackson.annotation.JsonAnySetter;
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import com.fasterxml.jackson.annotation.JsonInclude;
//import com.fasterxml.jackson.annotation.JsonProperty;
//import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.codehaus.jackson.annotate.*;

//@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "codice",
    "descrizione",
    "giorni_validita",
    "prestazioni"
})
public class ModelEsenzioneMalattiaVAura {

    @JsonProperty("codice")
    private String codice;
    @JsonProperty("descrizione")
    private String descrizione;
    @JsonProperty("giorni_validita")
    private Integer giorni_validita;
    @JsonProperty("prestazioni")
    private List<Prestazioni> prestazioni = null;

    @JsonProperty("codice")
    public String getCodice() {
        return codice;
    }

    @JsonProperty("codice")
    public void setCodice(String codice) {
        this.codice = codice;
    }

    @JsonProperty("descrizione")
    public String getDescrizione() {
        return descrizione;
    }

    @JsonProperty("descrizione")
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    @JsonProperty("giorni_validita")
    public Integer getGiorni_validita() {
      return giorni_validita;
    }

    @JsonProperty("giorni_validita")
    public void setGiorni_validita(Integer giorni_validita) {
      this.giorni_validita = giorni_validita;
    }

    @JsonProperty("prestazioni")
    public List<Prestazioni> getPrestazioni() {
        return prestazioni;
    }

    @JsonProperty("prestazioni")
    public void setPrestazioni(List<Prestazioni> prestazioni) {
        this.prestazioni = prestazioni;
    }
}
