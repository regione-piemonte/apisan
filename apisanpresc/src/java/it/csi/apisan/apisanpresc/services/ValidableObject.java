/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.services;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Classe astratta che implementa la validazione delle prop. La classe che estende ValidableObject deve annotaare con @NotNull le property che vuol rendere mandatorie e validabili
 *
 * @param <T>
 */
public abstract class ValidableObject<T> {

    public ValidationResult validate() {
        List<String>                                 errrorMessages      = new ArrayList<String>();
        ValidatorFactory                             factory             = Validation.buildDefaultValidatorFactory();
        Validator                                    validator           = factory.getValidator();
        Set<ConstraintViolation<ValidableObject<T>>> contraintViolations = validator.validate(this);

        if (contraintViolations.size() > 0) {
            for (ConstraintViolation<ValidableObject<T>> violation : contraintViolations) {
                errrorMessages.add(violation.getMessage());
            }
        }

        return new ValidationResult(contraintViolations.size() == 0, errrorMessages);

    }
}
