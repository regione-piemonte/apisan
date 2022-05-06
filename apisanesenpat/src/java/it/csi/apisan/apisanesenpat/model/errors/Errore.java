/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesenpat.model.errors;

import io.swagger.annotations.ApiModelProperty;
import org.codehaus.jackson.annotate.JsonProperty;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Errore   {
    // verra' utilizzata la seguente strategia serializzazione degli attributi: []

    private Integer status = null;
    private String code = null;
    private String title = null;
    private List<ErroreDettaglio> detail = new ArrayList<ErroreDettaglio>();
    private List<String> links = new ArrayList<String>();

    /**
     * Questo campo contiene lo status HTTP che rappresenta lo stato della risposta. &lt;br/&gt;&lt;br/&gt; Es. &lt;ul&gt;   &lt;li&gt;200: Ok&lt;/li&gt;   &lt;li&gt;201: Created&lt;/li&gt;   &lt;li&gt;400: Bad request&lt;/li&gt;   &lt;li&gt;400: Bad request&lt;/li&gt;   &lt;li&gt;403: Forbidden&lt;/li&gt;   &lt;li&gt;404: Not found&lt;/li&gt;   &lt;li&gt;500: Internal server error&lt;/li&gt; &lt;/ul&gt;
     **/

    @ApiModelProperty(required = true, value = "Questo campo contiene lo status HTTP che rappresenta lo stato della risposta. <br/><br/> Es. <ul>   <li>200: Ok</li>   <li>201: Created</li>   <li>400: Bad request</li>   <li>400: Bad request</li>   <li>403: Forbidden</li>   <li>404: Not found</li>   <li>500: Internal server error</li> </ul>")
    @JsonProperty("status")

    @NotNull
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * Un codice univoco che permette di riconoscere e rintracciare l&#39;errore ad esempio nei logs
     **/

    @ApiModelProperty(required = true, value = "Un codice univoco che permette di riconoscere e rintracciare l'errore ad esempio nei logs")
    @JsonProperty("code")

    @NotNull
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Una descrizione user-friendly dell&#39;errore
     **/

    @ApiModelProperty(required = true, value = "Una descrizione user-friendly dell'errore")
    @JsonProperty("title")

    @NotNull
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * L&#39;elenco dei singoli errori
     **/

    @ApiModelProperty(required = true, value = "L'elenco dei singoli errori")
    @JsonProperty("detail")

    @NotNull
    public List<ErroreDettaglio> getDetail() {
        return detail;
    }
    public void setDetail(List<ErroreDettaglio> detail) {
        this.detail = detail;
    }

    /**
     * Eventuali link alla documentazione degli errori
     **/

    @ApiModelProperty(required = true, value = "Eventuali link alla documentazione degli errori")
    @JsonProperty("links")

    @NotNull
    public List<String> getLinks() {
        return links;
    }
    public void setLinks(List<String> links) {
        this.links = links;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Errore errore = (Errore) o;
        return Objects.equals(status, errore.status) &&
                Objects.equals(code, errore.code) &&
                Objects.equals(title, errore.title) &&
                Objects.equals(detail, errore.detail) &&
                Objects.equals(links, errore.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, code, title, detail, links);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Errore {\n");

        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
