/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanceliachia.dto.apisanceliachia;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;
import javax.validation.constraints.*;

public class ModelCodiceQr   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String codice = null;

  /**
   * La tipologia di QR Code da generare. https://www.qrcode.com/en/codes/ 
   */
  public enum TipologiaEnum {
    QR("QR"),

        MICRO_QR("MICRO QR"),

        IQR("IQR"),

        SQRC("SQRC"),

        FRAME_QR("FRAME QR");
    private String value;

    TipologiaEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private TipologiaEnum tipologia = null;

  /**
   * Il codice del livello di correzione da usare per generare il QR Code. https://www.qrcode.com/en/about/error_correction.html 
   */
  public enum LivelloCorrezioneEnum {
    M("M"),

        L("L"),

        Q("Q"),

        H("H");
    private String value;

    LivelloCorrezioneEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private LivelloCorrezioneEnum livelloCorrezione = null;

  /**
   * Il codice che verrà usato per generare il QR Code
   **/
  

  @JsonProperty("codice") 
 
  public String getCodice() {
    return codice;
  }
  public void setCodice(String codice) {
    this.codice = codice;
  }

  /**
   * La tipologia di QR Code da generare. https://www.qrcode.com/en/codes/ 
   **/
  

  @JsonProperty("tipologia") 
 
  public TipologiaEnum getTipologia() {
    return tipologia;
  }
  public void setTipologia(TipologiaEnum tipologia) {
    this.tipologia = tipologia;
  }

  /**
   * Il codice del livello di correzione da usare per generare il QR Code. https://www.qrcode.com/en/about/error_correction.html 
   **/
  

  @JsonProperty("livello_correzione") 
 
  public LivelloCorrezioneEnum getLivelloCorrezione() {
    return livelloCorrezione;
  }
  public void setLivelloCorrezione(LivelloCorrezioneEnum livelloCorrezione) {
    this.livelloCorrezione = livelloCorrezione;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelCodiceQr modelCodiceQr = (ModelCodiceQr) o;
    return Objects.equals(codice, modelCodiceQr.codice) &&
        Objects.equals(tipologia, modelCodiceQr.tipologia) &&
        Objects.equals(livelloCorrezione, modelCodiceQr.livelloCorrezione);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codice, tipologia, livelloCorrezione);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelCodiceQr {\n");
    
    sb.append("    codice: ").append(toIndentedString(codice)).append("\n");
    sb.append("    tipologia: ").append(toIndentedString(tipologia)).append("\n");
    sb.append("    livelloCorrezione: ").append(toIndentedString(livelloCorrezione)).append("\n");
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

