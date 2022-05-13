/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.dto.apisanpresc;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonValue;

import javax.validation.constraints.NotNull;
import java.util.Objects;

@ApiModel(description = "Il model che rappresenta lo stato di \"vita\" di una ricetta")

public class ModelStatoRicetta {
    // verra' utilizzata la seguente strategia serializzazione degli attributi: []


    /**
     * Il codice univoco dello stato della ricetta
     */
    public enum CodiceEnum {
        _3("3"),
        _5("5");
        private String value;

        CodiceEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }
    }

    private CodiceEnum codice      = null;
    private String     nome        = null;
    private String     descrizione = null;

    /**
     * Il codice univoco dello stato della ricetta
     **/

    @ApiModelProperty(required = true, value = "Il codice univoco dello stato della ricetta")
    @JsonProperty("codice")

    @NotNull
    public CodiceEnum getCodice() {
        return codice;
    }

    public void setCodice(CodiceEnum codice) {
        this.codice = codice;
    }

    /**
     * Un nome user-frendly da mostrare sulla UI
     **/

    @ApiModelProperty(required = true, value = "Un nome user-frendly da mostrare sulla UI")
    @JsonProperty("nome")

    @NotNull
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * La descrizione dello stato
     **/

    @ApiModelProperty(required = true, value = "La descrizione dello stato")
    @JsonProperty("descrizione")

    @NotNull
    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModelStatoRicetta modelStatoRicetta = (ModelStatoRicetta) o;
        return Objects.equals(codice, modelStatoRicetta.codice) &&
                Objects.equals(nome, modelStatoRicetta.nome) &&
                Objects.equals(descrizione, modelStatoRicetta.descrizione);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codice, nome, descrizione);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModelStatoRicetta {\n");

        sb.append("    codice: ").append(toIndentedString(codice)).append("\n");
        sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
        sb.append("    descrizione: ").append(toIndentedString(descrizione)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

