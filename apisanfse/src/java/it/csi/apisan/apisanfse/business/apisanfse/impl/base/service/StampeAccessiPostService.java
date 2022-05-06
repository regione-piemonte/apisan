/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.apisanfse.impl.base.service;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

import it.csi.apisan.apisanfse.business.apisanfse.impl.base.FseRESTBaseService;
import it.csi.apisan.apisanfse.dto.apisanfse.PayloadStampaAccessi;
import it.csi.apisan.apisanfse.exception.ErroreBuilder;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class StampeAccessiPostService extends FseRESTBaseService {
	
	List<PayloadStampaAccessi> payloadStampaAccessi;
	
	public StampeAccessiPostService(List<PayloadStampaAccessi> payloadStampaAccessi, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.payloadStampaAccessi = payloadStampaAccessi;
	}

	@Override
	protected Response execute() {
		

		//InputStream jasperRptStream = this.getClass().getResourceAsStream("/template/Accessi.jasper");
		InputStream jasperRptStream = this.getClass().getResourceAsStream("/template/stampaaccessidata.jasper");
		Map<String, Object> mappa = new HashMap<String, Object>();
		/*mappa.put("email", mailTo);
			mappa.put("totalePrev", reportPrev.getTotalePreventivo());

			mappa.put("realPath", srvContext.getInitParameter("pelweb.resource.provider.sp")
					+ srvContext.getContextPath() + "/include/images/logo_csi.png");
			// mappa.put("realPath", url);
			String immagine = srvContext.getInitParameter("pelweb.resource.provider.sp") + srvContext.getContextPath()
					+ "/include/images/logo_csi.png";
		 */


		/*
		 *   public void report(HttpServletResponse response) throws Exception {
			    response.setContentType("text/html");
			    List data = userReportService.report();
			    JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(data);
			    Map parameters = new HashMap();
			    parameters.put("test", data.get(0));
			    parameters.put("DS1", dataSource);
			    InputStream inputStream = this.getClass().getResourceAsStream("/reports/users_report.jrxml");
			    JasperReport jasperReport = JasperCompileManager.compileReport(inputStream);
			    JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, new JREmptyDataSource());
			    HtmlExporter exporter = new HtmlExporter(DefaultJasperReportsContext.getInstance());
			    exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
			    exporter.setExporterOutput(new SimpleHtmlExporterOutput(response.getWriter()));
			    exporter.exportReport();
}
		 * 
		 * 
		 * */

		//JRDataSource datasource = new JRBeanCollectionDataSource(payloadStampaAccessi, true);
		/*		JRBeanCollectionDataSource datasource = new JRBeanCollectionDataSource(payloadStampaAccessi);
			JasperPrint print;
			byte[] bytes = null;

			try {
				print = JasperFillManager.fillReport(jasperRptStream, mappa, datasource);

			ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
			JasperExportManager.exportReportToPdfStream(print, outputStream);
			bytes = outputStream.toByteArray();
			} catch (JRException e) {
				log.error("StampeAccessiPostService", "Errore generazione pdf", e);
				throw  ErroreBuilder.from(502, "").title("Errore generazione pdf").exception() ; 
			}*/
		ByteArrayOutputStream bo = new ByteArrayOutputStream();
		try {

			Document document = new Document();
			PdfWriter.getInstance(document,  bo);
			document.open();
			//aggiungiMetaDati(document);
			//aggiungiPrefazione(document);
			aggiungiContenuto(document, payloadStampaAccessi);
			document.close();


		} catch (Exception e) {
			log.error("StampeAccessiPostService", "Errore generazione pdf", e);
			throw  ErroreBuilder.from(502, "").title("Errore generazione pdf").exception() ; 
		}

		return Response.ok().entity(bo.toByteArray()).header("Content-Disposition", "accessi.pdf").type("application/pdf").build();
	}
	
	
	
	private  void aggiungiContenuto(Document document, java.util.List<PayloadStampaAccessi> lista) throws DocumentException {
		// Aggiungiamo una tabella
		creaTabella(document, lista);
	}

	private void creaTabella(Document section, java.util.List<PayloadStampaAccessi> lista) throws DocumentException {
		PdfPTable tabella = new PdfPTable(5);


		PdfPCell c1 = new PdfPCell(new Phrase("Utente"));
		c1.setHorizontalAlignment(Element.ALIGN_CENTER);
		c1.setGrayFill(0.8f);
		tabella.addCell(c1);

		c1 = new PdfPCell(new Phrase("Data"));
		c1.setHorizontalAlignment(Element.ALIGN_CENTER);
		c1.setGrayFill(0.8f);
		tabella.addCell(c1);

		c1 = new PdfPCell(new Phrase("Descrizione"));
		c1.setHorizontalAlignment(Element.ALIGN_CENTER);
		c1.setGrayFill(0.8f);
		tabella.addCell(c1);
		tabella.setHeaderRows(1);

		c1 = new PdfPCell(new Phrase("Servizio"));
		c1.setHorizontalAlignment(Element.ALIGN_CENTER);
		c1.setGrayFill(0.8f);
		tabella.addCell(c1);
		tabella.setHeaderRows(1);

		c1 = new PdfPCell(new Phrase("Operazione"));
		c1.setHorizontalAlignment(Element.ALIGN_CENTER);
		c1.setGrayFill(0.8f);
		tabella.addCell(c1);
		tabella.setHeaderRows(1);

		for(PayloadStampaAccessi tmp: lista) {
			tabella.addCell(tmp.getUtente());
			tabella.addCell(tmp.getData());
			tabella.addCell(tmp.getDescrizione());
			tabella.addCell(tmp.getServizio());
			tabella.addCell(tmp.getOperazione());
		}

		section.add(tabella);

	}

}
