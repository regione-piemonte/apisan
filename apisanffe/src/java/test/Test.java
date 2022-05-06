/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		/*String data = "2020-12-04";
		Date d = new DateStringMapper(DateStringMapper.DATEYYYMMDD).from(data);
		System.out.println("data: " + d);
		
		
		/*LocalDateTime ldt = source.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
		if(formato != null) {
			return ldt.format(formato);
		}else {
			return ldt.format(fullDTF);
		}*/
		
		try {
			String base64NonFunz = new String(Files.readAllBytes(Paths.get("D:\\lavorodoc\\sanita\\apirosse\\apisanffe\\xml\\base64caratteriacapo.txt")), "UTF-8");
			
			String base64CaratteriAcapoFunz = new String(Files.readAllBytes(Paths.get("D:\\lavorodoc\\sanita\\apirosse\\apisanffe\\xml\\base64senzacaratteriacapo.txt")), "UTF-8");
			
			//provo prima la funzionante
			byte[] funz = getFileCodificatoFromString(base64CaratteriAcapoFunz.replaceAll("\r\n", ""));
			System.out.println("***************DOPO FUNZIONANTE*************");
			
			byte[] nonFunz = getFileCodificatoFromString(base64NonFunz.replaceAll("\r\n", ""));
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	/*	LocalDateTime ldt = LocalDateTime.parse(data, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
		System.out.println("Data: " + Date.from(ldt.atZone(ZoneId.systemDefault()).toInstant()));
		*/
		//Stringhe in base64: file1: cHJvdmEx     file2: cHJvdmEy 
		
		//da String base64 a file: byte[] filePdfDecoder = Base64.getDecoder().decode(str);
		
		ZipOutputStream out = createFile();
		addFile( out, "prova1.txt", Base64.getDecoder().decode("cHJvdmEx"));
		addFile( out, "prova2.txt", Base64.getDecoder().decode("cHJvdmEy"));
		closeOutputStream(out);
		//ISO_DATE

	}
	static 	protected byte[] getFileCodificatoFromString(String strByte64) {
		byte[] fileCodificato = strByte64.getBytes();
		byte[] filePdfDecodficato = Base64.getDecoder().decode(fileCodificato);
		return filePdfDecodficato;
	}
	
	private static ZipOutputStream createFile() {
		try {
			File f = new File("d:\\test.zip");
			ZipOutputStream out = new ZipOutputStream(new FileOutputStream(f));
			return out;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	private static void addFile(ZipOutputStream out, String nomeFile, byte[] data) {

		try {
			
			ZipEntry e = new ZipEntry(nomeFile);
			out.putNextEntry(e);


			out.write(data, 0, data.length);
			out.closeEntry();

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void closeOutputStream(ZipOutputStream out) {
		try {
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
