/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class PayloadAssociaEtichette   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String codiceCl = null;
  private Integer idTagFisso = null;
  private String categoria = null;
  private List<Long> listaIdEtichette = new ArrayList<Long>();

  /**
   * Gets or Sets tipoOperazione
   */
  public enum TipoOperazioneEnum {
    ASSOCIAZIONE("ASSOCIAZIONE"),

        DISASSOCIAZIONE("DISASSOCIAZIONE");
    private String value;

    TipoOperazioneEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private TipoOperazioneEnum tipoOperazione = null;

  /**
   * codice della componente locale in cui si è ritirato il documento 
   **/
  
  @ApiModelProperty(value = "codice della componente locale in cui si è ritirato il documento ")
  @JsonProperty("codice_cl") 
 
  public String getCodiceCl() {
    return codiceCl;
  }
  public void setCodiceCl(String codiceCl) {
    this.codiceCl = codiceCl;
  }

  /**
   * id tag fisso dell&#39;etichetta da associare
   **/
  
  @ApiModelProperty(value = "id tag fisso dell'etichetta da associare")
  @JsonProperty("id_tag_fisso") 
 
  public Integer getIdTagFisso() {
    return idTagFisso;
  }
  public void setIdTagFisso(Integer idTagFisso) {
    this.idTagFisso = idTagFisso;
  }

  /**
   * codice della categoria del documento
   **/
  
  @ApiModelProperty(value = "codice della categoria del documento")
  @JsonProperty("categoria") 
 
  public String getCategoria() {
    return categoria;
  }
  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lista_id_etichette") 
 
  public List<Long> getListaIdEtichette() {
    return listaIdEtichette;
  }
  public void setListaIdEtichette(List<Long> listaIdEtichette) {
    this.listaIdEtichette = listaIdEtichette;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tipo_operazione") 
 
  public TipoOperazioneEnum getTipoOperazione() {
    return tipoOperazione;
  }
  public void setTipoOperazione(TipoOperazioneEnum tipoOperazione) {
    this.tipoOperazione = tipoOperazione;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayloadAssociaEtichette payloadAssociaEtichette = (PayloadAssociaEtichette) o;
    return Objects.equals(codiceCl, payloadAssociaEtichette.codiceCl) &&
        Objects.equals(idTagFisso, payloadAssociaEtichette.idTagFisso) &&
        Objects.equals(categoria, payloadAssociaEtichette.categoria) &&
        Objects.equals(listaIdEtichette, payloadAssociaEtichette.listaIdEtichette) &&
        Objects.equals(tipoOperazione, payloadAssociaEtichette.tipoOperazione);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codiceCl, idTagFisso, categoria, listaIdEtichette, tipoOperazione);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadAssociaEtichette {\n");
    
    sb.append("    codiceCl: ").append(toIndentedString(codiceCl)).append("\n");
    sb.append("    idTagFisso: ").append(toIndentedString(idTagFisso)).append("\n");
    sb.append("    categoria: ").append(toIndentedString(categoria)).append("\n");
    sb.append("    listaIdEtichette: ").append(toIndentedString(listaIdEtichette)).append("\n");
    sb.append("    tipoOperazione: ").append(toIndentedString(tipoOperazione)).append("\n");
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

