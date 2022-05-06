/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.integration.facade;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.ws.security.WSPasswordCallback;

public class ClientPasswordCallback implements CallbackHandler {
	String userOpessanAssociazioni;
	String passOpessanAssociazioni;
	String userOpessanOperatori;
	String passOpessanOperatori;
	
	
	
	
	public String getUserOpessanAssociazioni() {
		return userOpessanAssociazioni;
	}


	public void setUserOpessanAssociazioni(String userOpessanAssociazioni) {
		this.userOpessanAssociazioni = userOpessanAssociazioni;
	}


	public String getPassOpessanAssociazioni() {
		return passOpessanAssociazioni;
	}


	public void setPassOpessanAssociazioni(String passOpessanAssociazioni) {
		this.passOpessanAssociazioni = passOpessanAssociazioni;
	}


	public String getUserOpessanOperatori() {
		return userOpessanOperatori;
	}


	public void setUserOpessanOperatori(String userOpessanOperatori) {
		this.userOpessanOperatori = userOpessanOperatori;
	}


	public String getPassOpessanOperatori() {
		return passOpessanOperatori;
	}


	public void setPassOpessanOperatori(String passOpessanOperatori) {
		this.passOpessanOperatori = passOpessanOperatori;
	}



	@Override
	public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
		for (int i = 0; i < callbacks.length; i++)
		{
			WSPasswordCallback pc = (WSPasswordCallback)callbacks[i];

			if(pc.getIdentifier().equals(userOpessanAssociazioni)) {
				pc.setPassword(passOpessanAssociazioni);
			}else if(pc.getIdentifier().equals(userOpessanOperatori)) {
				pc.setPassword(passOpessanOperatori);
			}

		}

	}

}
