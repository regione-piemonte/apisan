/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.integration.mock;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.axis.utils.IOUtils;

import it.csi.apisan.apisanpag.integration.exception.ApisanWebException;
import it.csi.apisan.apisanpag.util.HttpCode;

public class PagamentoMock {
	
	private List<String> listaNumeroTransazioni = new ArrayList<String>();
	
	
	public void initTransazioni() {
		listaNumeroTransazioni.add("n1trans");
		listaNumeroTransazioni.add("n2trans");
		listaNumeroTransazioni.add("n3trans");
	}
	
	private boolean numeroTransazioneValido(String numeroFattura) {
		boolean valido = false;
		System.out.println("numeroTransazioneValido: " + numeroFattura);
		Iterator<String> fattura = listaNumeroTransazioni.iterator();
		while(fattura.hasNext()) {
			if(numeroFattura.equals(fattura.next()))
				return true;
		}
		
		return valido;
	}
	
	public byte[] getFileFromTransazione(String numeroTransazione) throws MockNoDataFoundException, IOException{
		
		if(!numeroTransazioneValido(numeroTransazione)) {
			throw new MockNoDataFoundException("No Data Found");
		}
		
		try (FileInputStream in = new FileInputStream(new File("/templatemock/ricevuta.pdf"))){
			
			InputStream is = this.getClass().getResourceAsStream("/numeroTransazione.pdf");
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();

			int nRead;
			byte[] data = new byte[16384];

			while ((nRead = is.read(data, 0, data.length)) != -1) {
			  buffer.write(data, 0, nRead);
			}

			buffer.flush();

			return buffer.toByteArray();

		}catch(IOException e) {
			e.printStackTrace();
			throw e;
		}
	}
}
