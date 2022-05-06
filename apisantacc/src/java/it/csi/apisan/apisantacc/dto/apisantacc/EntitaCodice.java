/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.dto.apisantacc;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import org.codehaus.jackson.annotate.JsonValue;
import javax.validation.constraints.*;
public enum EntitaCodice {
  RILEVAZIONI,
  SINTOMI,
  DOLORI,
  EVENTI,
  FARMACI,
  DIETA,
  CONTATTI_STRUTTURA;
}
