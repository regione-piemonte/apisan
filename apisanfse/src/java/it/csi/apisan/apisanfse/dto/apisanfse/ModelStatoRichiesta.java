/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import org.codehaus.jackson.annotate.JsonValue;
import javax.validation.constraints.*;
public enum ModelStatoRichiesta {
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
}
