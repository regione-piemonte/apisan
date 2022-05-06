/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanassistenza.dto.apisanassistenza;

import java.util.Objects;

public class DocumentoAllegato {

	private String fileName = null;
	private String contentType = null;
	private byte [] fileContent = null;
	private String fileContentAsBase64 = null;
	

	public DocumentoAllegato(String fileName, String contentType, String fileContentAsBase64) {
		super();
		this.fileName = fileName;
		this.contentType = contentType;
		this.fileContentAsBase64 = fileContentAsBase64;
	}

	public DocumentoAllegato() {
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public byte[] getFileContent() {
		return fileContent;
	}

	public void setFileContent(byte[] fileContent) {
		this.fileContent = fileContent;
	}

	public String getFileContentAsBase64() {
		return fileContentAsBase64;
	}

	public void setFileContentAsBase64(String fileContentAsBase64) {
		this.fileContentAsBase64 = fileContentAsBase64;
	}

	@Override
	public int hashCode() {
		return Objects.hash(fileName, contentType, fileContent, fileContentAsBase64);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DocumentoAllegato {\n");

		sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
		sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

}
