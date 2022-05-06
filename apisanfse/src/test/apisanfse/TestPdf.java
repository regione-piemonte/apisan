package apisanfse;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.type.TypeFactory;

import com.lowagie.text.Anchor;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.List;
import com.lowagie.text.ListItem;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.Section;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

import it.csi.apisan.apisanfse.dto.apisanfse.PayloadStampaAccessi;

public class TestPdf {
	
	//private static String FILE = "D:\\workspaces\\workspaceoxigen\\apisanfse\\myFile.pdf";
	 /*private static Font bigFont  = new Font(Font.FontFamil.TIMES_ROMAN, 18,  Font.BOLD);
	 private static Font redFont  = new Font(Font.FontFamily.TIMES_ROMAN, 12,  Font.NORMAL, BaseColor.RED);
	 private static Font subFont  = new Font(Font.FontFamily.TIMES_ROMAN, 16,  Font.BOLD);
	 private static Font smallBold  = new Font(Font.FontFamily.TIMES_ROMAN, 12,  Font.BOLD);
		*/	 
	public TestPdf() {
		// TODO Auto-generated constructor stub
	}

	public static java.util.List<PayloadStampaAccessi> generateBeanList() throws UnsupportedEncodingException, IOException {
		java.util.List<PayloadStampaAccessi> lisa = new ArrayList<PayloadStampaAccessi>();
		String filter =  new String(Files.readAllBytes(Paths.get("D:\\workspaces\\workspaceoxigen\\apisanfse\\accessi.json")), "UTF-8");
		/*lisa.add(new PayloadStampaAccessi("io", "23/09/2021 15:16", "E' stata restituita la lista degli accessi ai servizi del Fascicolo. Riferimenti tecnici", "servizio", "operazione"));
		lisa.add(new PayloadStampaAccessi("voi", "23/09/2021 15:16", "E' stata restituita la lista degli accessi ai servizi del Fascicolo. Riferimenti tecnici", "servizio", "operazione"));
		lisa.add(new PayloadStampaAccessi("noi", "23/09/2021 15:16", "E' stata restituita la lista degli accessi ai servizi del Fascicolo. Riferimenti tecnici", "servizio", "operazione"));
		lisa.add(new PayloadStampaAccessi("essi", "23/09/2021 15:16", "E' stata restituita la lista degli accessi ai servizi del Fascicolo. Riferimenti tecnici", "servizio", "operazione"));
		lisa.add(new PayloadStampaAccessi("loro", "23/09/2021 15:16", "E' stata restituita la lista degli accessi ai servizi del Fascicolo. Riferimenti tecnici", "servizio", "operazione"));
		lisa.add(new PayloadStampaAccessi("fascicolo", "23/09/2021 15:16", "E' stata restituita la lista degli accessi ai servizi del Fascicolo. Riferimenti tecnici", "servizio", "operazione"));
		lisa.add(new PayloadStampaAccessi("noi", "23/09/2021 15:16", "E' stata restituita la lista degli accessi ai servizi del Fascicolo. Riferimenti tecnici", "servizio", "operazione"));
		lisa.add(new PayloadStampaAccessi("tu", "23/09/2021 15:16", "E' stata restituita la lista degli accessi ai servizi del Fascicolo. Riferimenti tecnici", "servizio", "operazione"));
		lisa.add(new PayloadStampaAccessi("estu", "23/09/2021 15:16", "E' stata restituita la lista degli accessi ai servizi del Fascicolo. Riferimenti tecnici", "servizio", "operazione"));
		lisa.add(new PayloadStampaAccessi("esse", "23/09/2021 15:16", "E' stata restituita la lista degli accessi ai servizi del Fascicolo. Riferimenti tecnici", "servizio", "operazione"));
		lisa.add(new PayloadStampaAccessi("essi", "23/09/2021 15:16", "E' stata restituita la lista degli accessi ai servizi del Fascicolo. Riferimenti tecnici", "servizio", "operazione"));
		lisa.add(new PayloadStampaAccessi("tuar", "23/09/2021 15:16", "E' stata restituita la lista degli accessi ai servizi del Fascicolo. Riferimenti tecnici", "servizio", "operazione"));
		lisa.add(new PayloadStampaAccessi("yart", "23/09/2021 15:16", "E' stata restituita la lista degli accessi ai servizi del Fascicolo. Riferimenti tecnici", "servizio", "operazione"));
		lisa.add(new PayloadStampaAccessi("iort", "23/09/2021 15:16", "E' stata restituita la lista degli accessi ai servizi del Fascicolo. Riferimenti tecnici", "servizio", "operazione"));
		lisa.add(new PayloadStampaAccessi("hoo", "23/09/2021 15:16", "E' stata restituita la lista degli accessi ai servizi del Fascicolo. Riferimenti tecnici", "servizio", "operazione"));
		lisa.add(new PayloadStampaAccessi("hoiaa", "23/09/2021 15:16", "E' stata restituita la lista degli accessi ai servizi del Fascicolo. Riferimenti tecnici", "servizio", "operazione"));*/
		lisa = init(filter);
		return lisa;
	}
	
	public static java.util.List<PayloadStampaAccessi> init( String json) {
		
		ObjectMapper mapper = new ObjectMapper();
		java.util.List<PayloadStampaAccessi> list = new ArrayList();
		try {
			list = mapper.readValue(json, TypeFactory.defaultInstance().constructCollectionType(java.util.List.class, PayloadStampaAccessi.class));
			//f = mapper.reader(clazz).readValue(filter.getBytes());
		} catch (IOException e) {
			throw new IllegalArgumentException("Filtro errato per " + json + ". " + e.getMessage(), e);
		}
		return list;
	}
	
	public static void main(String[] args) {
		try {
			  ByteArrayOutputStream bo = new ByteArrayOutputStream();
			   Document document = new Document();
			   PdfWriter.getInstance(document,  bo);
			   document.open();
			   //aggiungiMetaDati(document);
			   //aggiungiPrefazione(document);
			   aggiungiContenuto(document, generateBeanList());
			   document.close();
			   
			   FileOutputStream fos = new FileOutputStream(new File("D:\\workspaces\\workspaceoxigen\\apisanfse\\myFile.pdf")); 
			   bo.writeTo(fos);
			  } catch (Exception e) {
			   e.printStackTrace();
			  }
	}
	
	 /* iText permette di aggiungere metadati al pdf che possono essere 
	  * visualizzati in Adobe Reader da File -> Proprietà */
	 private static void aggiungiMetaDati(Document document) {
	  document.addTitle("Il mio primo PDF");
	  document.addSubject("Uso di iText");
	  document.addKeywords("Java, PDF, iText");
	  document.addAuthor("Mario Rossi");
	  document.addCreator("Luigi Bianchi");
	 }

	 private static void aggiungiPrefazione(Document document) throws DocumentException {
	 /* Paragraph prefazione = new Paragraph();
	  
	  // Aggiungiamo una linea vuota
	  aggiungiLineaVuota(prefazione, 1);
	  
	  // Aggiungiamo il titolo
	  prefazione.add(new Paragraph("Titolo del documento", bigFont));

	  aggiungiLineaVuota(prefazione, 1);
	  
	  // Questa linea scrive "Documento generato da: nome utente, data"
	  prefazione.add(new Paragraph("Documento generato da: " + System.getProperty("user.name") + ", " + new Date(), smallBold));
	  
	  aggiungiLineaVuota(prefazione, 3);
	  
	  prefazione.add(new Paragraph("Generato da iText", smallBold));

	  aggiungiLineaVuota(prefazione, 3);
	  
	  prefazione.add(new Paragraph("Generato da iText", redFont));

	  aggiungiLineaVuota(prefazione, 3);
	  
	  Anchor anchor = new Anchor("Questo è un link");
	  anchor.setName("LINK");
	  anchor.setReference("http://www.lowagie.com");
	  prefazione.add(anchor);

	  // Aggiunta al documento
	  document.add(prefazione);
	  
	  // Nuova pagina
	  document.newPage();*/
	 }

	 private static void aggiungiContenuto(Document document, java.util.List<PayloadStampaAccessi> lista) throws DocumentException {

	  // Il secondo parametro è il numero di capitolo
	  /*Chapter chapter = new Chapter(new Paragraph("Primo Capitolo", bigFont), 1);

	  Paragraph sectionParagraph = new Paragraph("Sezione 1", subFont);
	  Section section = chapter.addSection(sectionParagraph);
	  section.add(new Paragraph("Paragrafo 1"));

	  sectionParagraph = new Paragraph("Sezione 2", subFont);
	  section = chapter.addSection(sectionParagraph);
	  section.add(new Paragraph("Paragrafo 1"));
	  section.add(new Paragraph("Paragrafo 2"));
	  section.add(new Paragraph("Paragrafo 3"));

	  // Aggiungiamo una lista
	  
	  creaLista(section);*/
		 
		 
		 //Section section = new Section();
		 //aggiungiLineaVuota(paragraph, 2);
		 //section.add(paragraph);

		 // Aggiungiamo una tabella
				 
		 creaTabella(document, lista);

		 // Aggiunta al documento
		 //document.add(section);

		 // Prossimo capitolo

		 // Il secondo parametro è il numero di capitolo
/*		 chapter = new Chapter(new Paragraph("Secondo Capitolo", bigFont), 2);

		 sectionParagraph = new Paragraph("Sezione 1", subFont);
		 section = chapter.addSection(sectionParagraph);
		 section.add(new Paragraph("Paragrafo 1"));*/

		 // Aggiunta al documento
		 //document.add(chapter);
	 }

	 //private static void creaTabella(Section section, java.util.List<PayloadStampaAccessi> lista) throws BadElementException {
	 private static void creaTabella(Document section, java.util.List<PayloadStampaAccessi> lista) throws DocumentException {
	  PdfPTable tabella = new PdfPTable(5);
	  //tabella.setWidthPercentage(100);
	  // tabella.setBorderColor(BaseColor.GRAY);
	  // tabella.setPadding(4);
	  // tabella.setSpacing(4);
	  // tabella.setBorderWidth(1);

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
/*
	  tabella.addCell("1.0");
	  tabella.addCell("1.1");
	  tabella.addCell("1.2");
	  tabella.addCell("2.1");
	  tabella.addCell("2.2");
	  tabella.addCell("2.3");
*/
	  section.add(tabella);

	 }

	 private static void creaLista(Section section) {
	  List list = new List(true, false, 10);
	  list.add(new ListItem("Punto primo"));
	  list.add(new ListItem("Punto secondo"));
	  list.add(new ListItem("Punto terzo"));
	  section.add(list);
	 }

	 private static void aggiungiLineaVuota(Paragraph paragraph, int number) {
	  for (int i = 0; i < number; i++) {
	   paragraph.add(new Paragraph(" "));
	  }
	 }

}
