/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.services;

import org.apache.commons.lang3.StringUtils;

import java.util.List;

public class ValidationResult {

    Boolean      isValid = false;
    List<String> errorMessages;

    public ValidationResult(Boolean isValid, List<String> errorMessages) {
        this.isValid       = isValid;
        this.errorMessages = errorMessages;
    }

    public Boolean getValid() {
        return isValid;
    }

    public List<String> getErrorMessages() {
        return errorMessages;
    }

    @Override public String toString() {
        return StringUtils.join(errorMessages, ", ");
    }
}
