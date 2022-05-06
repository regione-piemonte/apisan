/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfarm.integration.client;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.ws.security.WSPasswordCallback;

public class ClientPasswordCallback implements CallbackHandler {
	String userFarmacieAbituali;
	String passFarmacieAbituali;
	String userFarmacieLcce;
	String passFarmacieLcce;
	

	public String getUserFarmacieAbituali() {
		return userFarmacieAbituali;
	}


	public void setUserFarmacieAbituali(String userFarmacieAbituali) {
		this.userFarmacieAbituali = userFarmacieAbituali;
	}


	
	public String getPassFarmacieAbituali() {
		return passFarmacieAbituali;
	}


	public void setPassFarmacieAbituali(String passFarmacieAbituali) {
		this.passFarmacieAbituali = passFarmacieAbituali;
	}


	
	
	public String getUserFarmacieLcce() {
		return userFarmacieLcce;
	}


	public void setUserFarmacieLcce(String userFarmacie) {
		this.userFarmacieLcce = userFarmacie;
	}


	public String getPassFarmacieLcce() {
		return passFarmacieLcce;
	}


	public void setPassFarmacieLcce(String passFarmacie) {
		this.passFarmacieLcce = passFarmacie;
	}


	@Override
	public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
		
		for (int i = 0; i < callbacks.length; i++)
		{
			WSPasswordCallback pc = (WSPasswordCallback)callbacks[i];

			if(pc.getIdentifier().equals(userFarmacieAbituali)) {
				pc.setPassword(passFarmacieAbituali);
			}else if(pc.getIdentifier().equals(userFarmacieLcce)) {
				pc.setPassword(passFarmacieLcce);
			}
		}
	}

}
