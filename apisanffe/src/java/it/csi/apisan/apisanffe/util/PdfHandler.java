/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanffe.util;

public class PdfHandler  {
	byte[] pdf;
	StringBuilder nomeAttachement;
	int numFile;
	public byte[] getPdf() {
		return pdf;
	}
	public void setPdf(byte[] pdf) {
		this.pdf = pdf;
	}
	public StringBuilder getNomeAttachement() {
		return nomeAttachement;
	}
	public void setNomeAttachement(StringBuilder nomeAttachement) {
		this.nomeAttachement = nomeAttachement;
	}
	public int getNumFile() {
		return numFile;
	}
	public void setNumFile(int numFile) {
		this.numFile = numFile;
	}
	
	
	
}
