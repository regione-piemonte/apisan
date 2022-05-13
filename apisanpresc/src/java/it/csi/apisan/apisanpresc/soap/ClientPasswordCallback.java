/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.soap;

import org.apache.ws.security.WSPasswordCallback;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
import java.io.IOException;


public class ClientPasswordCallback implements CallbackHandler {

    String userDMA;
    String passwordDMA;

    public String getUserDMA() {
        return userDMA;
    }

    public void setUserDMA(String userDMA) {
        this.userDMA = userDMA;
    }

    public String getPasswordDMA() {
        return passwordDMA;
    }

    public void setPasswordDMA(String passwordDMA) {
        this.passwordDMA = passwordDMA;
    }

    public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {

        for (int i = 0; i < callbacks.length; i++) {
            WSPasswordCallback pc = (WSPasswordCallback) callbacks[i];

            if (pc.getIdentifier().equals(userDMA)) {
                pc.setPassword(passwordDMA);
            }
        }
    }


}