/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.integration.facade;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.ws.security.WSPasswordCallback;


public class ClientPasswordCallback implements CallbackHandler {
	String userRol;
	String passRol;
	String userScaricoStudi;
	String passScaricoStudi;
	String userConsensoIni;
	String passConsensoIni;
	String userAura;
	String passAura;
	String userArruolamento;
	String passArruolamento;
	String userDma;
	String passDma;
	String userUtility;
	String passUtility;
	String userPaziente;
	String passPaziente;


	public String getUserConsensoIni() {
		return userConsensoIni;
	}



	public void setUserConsensoIni(String userConsensoIni) {
		this.userConsensoIni = userConsensoIni;
	}



	public String getPassConsensoIni() {
		return passConsensoIni;
	}



	public void setPassConsensoIni(String passConsensoIni) {
		this.passConsensoIni = passConsensoIni;
	}



	public String getUserRol() {
		return userRol;
	}



	public void setUserRol(String userRol) {
		this.userRol = userRol;
	}

	public String getPassRol() {
		return passRol;
	}

	public void setPassRol(String passRol) {
		this.passRol = passRol;
	}

	public String getUserScaricoStudi() {
		return userScaricoStudi;
	}


	public void setUserScaricoStudi(String userScaricoStudi) {
		this.userScaricoStudi = userScaricoStudi;
	}

	public String getPassScaricoStudi() {
		return passScaricoStudi;
	}

	public void setPassScaricoStudi(String passScaricoStudi) {
		this.passScaricoStudi = passScaricoStudi;
	}

	public String getUserAura() {
		return userAura;
	}

	public void setUserAura(String userAura) {
		this.userAura = userAura;
	}

	public String getPassAura() {
		return passAura;
	}

	public void setPassAura(String passAura) {
		this.passAura = passAura;
	}

	


	public String getUserArruolamento() {
		return userArruolamento;
	}



	public void setUserArruolamento(String userArruolamento) {
		this.userArruolamento = userArruolamento;
	}



	public String getPassArruolamento() {
		return passArruolamento;
	}



	public void setPassArruolamento(String passArruolamento) {
		this.passArruolamento = passArruolamento;
	}



	public String getUserDma() {
		return userDma;
	}



	public void setUserDma(String userDma) {
		this.userDma = userDma;
	}



	public String getPassDma() {
		return passDma;
	}



	public void setPassDma(String passDma) {
		this.passDma = passDma;
	}



	public String getUserUtility() {
		return userUtility;
	}



	public void setUserUtility(String userUtility) {
		this.userUtility = userUtility;
	}



	public String getPassUtility() {
		return passUtility;
	}



	public void setPassUtility(String passutility) {
		this.passUtility = passutility;
	}



	public String getUserPaziente() {
		return userPaziente;
	}



	public void setUserPaziente(String userPaziente) {
		this.userPaziente = userPaziente;
	}



	public String getPassPaziente() {
		return passPaziente;
	}



	public void setPassPaziente(String passPaziente) {
		this.passPaziente = passPaziente;
	}



	public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {

		for (int i = 0; i < callbacks.length; i++)
		{
			WSPasswordCallback pc = (WSPasswordCallback)callbacks[i];

			if(pc.getIdentifier().equals(userRol)) {
				pc.setPassword(passRol);
			}else if(pc.getIdentifier().equals(userScaricoStudi)) {
				pc.setPassword(passScaricoStudi);
			}else if(pc.getIdentifier().equals(userConsensoIni)) {
				pc.setPassword(passConsensoIni);
			}else if(pc.getIdentifier().equals(userAura)) {
				pc.setPassword(passAura);
			}else if(pc.getIdentifier().equals(userArruolamento)) {
				pc.setPassword(passArruolamento);
			}else if(pc.getIdentifier().equals(userDma)) {
				pc.setPassword(passDma);
			}else if(pc.getIdentifier().equals(userUtility)) {
				pc.setPassword(passUtility);
			}else if(pc.getIdentifier().equals(userPaziente)) {
				pc.setPassword(passPaziente);
			}

		}
	}


	
	
}