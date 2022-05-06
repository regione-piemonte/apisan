/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import java.util.List;

import it.csi.apisan.apisanfse.dto.apisanfse.Referto;
import it.csi.apisan.apisanfse.integration.dma.Codifica;
import it.csi.apisan.apisanfse.integration.dma.MetadatiDocumentoSR;

public class RefertoMetadatiDocumentoSRMapper extends BaseMapper<Referto, MetadatiDocumentoSR> {
	
	private List<Codifica> codifiche;
	
	

	public RefertoMetadatiDocumentoSRMapper(List<Codifica> codifiche) {
		super();
		this.codifiche = codifiche;
	}

	@Override
	public MetadatiDocumentoSR to(Referto ref) {
		if(ref == null) {
			return null;
		}
		MetadatiDocumentoSR doc =  new MetadatiDocumentoSR();
		//presumo che posso considerare come idunivoco del referto il codicedocumentodipartimentale
		
		doc.setIdDocumentoCL(ref.getIdReferto());
		if(ref.getAccessionNumbers() != null) {
			doc.getAccessionNumbers().addAll(ref.getAccessionNumbers());
		}
		doc.setAccessionNumber(ref.getAccessionNumber());
		doc.setCodiceDocumentoDipartimentale(ref.getCodiceDocumentoDipartimentale());
		doc.setCodiceDocumentoScaricabile(ref.getCodiceDocumentoScaricabile());
		doc.setDataAggiornamento(new DateXMLGregorianCalendarMapper().to(ref.getDataAggiornamento()));
		doc.setDataAnnullamento(new DateXMLGregorianCalendarMapper().to(ref.getDataAnnullamento()));
		doc.setDataCancellazione(new DateXMLGregorianCalendarMapper().to(ref.getDataCancellazione()));
		doc.setDataEpisodio(new DateXMLGregorianCalendarMapper().to(ref.getDataEpisodio()));
		doc.setDataInserimento(new DateXMLGregorianCalendarMapper().to(ref.getDataInserimento()));
		//Modifica del24/09/2019 per richiesta del gruppo di ROL (non corretta per me dovrebbe aggiungere il campo data scadenza)
		doc.setDataScadenza(new DateXMLGregorianCalendarMapper().to(ref.getDataScaricabileFinoAl()));
		doc.setDataValidazione(new DateXMLGregorianCalendarMapper().to(ref.getDataValidazione()));
		doc.setFirmatoDigitalmente(new BooleanSiNoMapper().to(ref.isFirmatoDigitalmente()));
		doc.setLuogoProduzioneDocumento(new LuogoAsuLuogoASUMapper(null).to(ref.getLuogoProduzioneDocumento()));
		doc.setMedicoValidante(ref.getMedicoValidante());
		doc.setNumDiDownload(ref.getNumeroDiDownload());
		doc.setNumeroGiorniDownload(ref.getNumeroGiorniDownload());
		doc.setOscuraScaricoCittadino(ref.getOscuraScaricoCittadino());
		doc.setPagatoTicket(new PagatoTicketStatoEnumPagatoTicketStatoMapper().to(ref.getPagatoTicketStato()));
		doc.setPaziente(new PazienteMapper().to(ref.getPaziente()));
		doc.setPinBruciato(ref.isPinBruciato());
		doc.setRichiestoPinCode(ref.isRichiestoPinCode());
		doc.setScaricabileSeTicketNonPagato(ref.isScaricabileSeTicketNonPagato());
		doc.setSoggettoALeggiSpeciali(ref.isSoggettoALeggiSpeciali());
		//r.setStatoPagamento(statoPagamento); //??
		doc.setTipoDocumento(new TipoDocumentoMapper(null).to(ref.getTipoDocumento()));
		doc.setTipoFileDocumento(new TipoFileDocumentoMapper(null).to(ref.getTipoFileDocumento()));
		doc.setComponenteLocale(new ComponenteLocaleComponenteLocaleMapper(null).to(ref.getComponenteLocale()));
		doc.setMedicoRefertante(ref.getMedicoRefertante());
		doc.setTicketDaPagare(new BigDecimalFloatMapper().to(new ImportoMapper().to(ref.getTicketDaPagare())) );
		doc.setTicketPagato(new BigDecimalFloatMapper().to(new ImportoMapper().to(ref.getTicketPagato())) );
		doc.setTipoReferto(new TipoRefertoCodificaMapper().to( ref.getTipoReferto()));
		return doc;
	}

	@Override
	public Referto from(MetadatiDocumentoSR doc) {
		if(doc == null) {
			return null;
		}
/*		if(codifiche != null) {
			codifiche.stream().forEach( c -> System.out.println("Codifica not null codice: " + c.getCodice()) );
		}else {
			System.out.println("RefertoMetadatiDocumentoSRMapper codifiche a null");
		}*/
		Referto r =  new Referto();
		r.setIdReferto(doc.getCodiceDocumentoDipartimentale());
		r.setIdDocumentoCl(doc.getIdDocumentoCL());
		if(doc.getAccessionNumbers() != null) {
			r.setAccessionNumbers(doc.getAccessionNumbers());
		}
		r.setAccessionNumber(doc.getAccessionNumber());
		r.setCodiceDocumentoDipartimentale(doc.getCodiceDocumentoDipartimentale());
		r.setCodiceDocumentoScaricabile(doc.getCodiceDocumentoScaricabile());
		r.setDataAggiornamento(new DateXMLGregorianCalendarMapper().from(doc.getDataAggiornamento()));
		r.setDataAnnullamento(new DateXMLGregorianCalendarMapper().from(doc.getDataAnnullamento()));
		r.setDataCancellazione(new DateXMLGregorianCalendarMapper().from(doc.getDataCancellazione()));
		r.setDataEpisodio(new DateXMLGregorianCalendarMapper().from(doc.getDataEpisodio()));
		r.setDataInserimento(new DateXMLGregorianCalendarMapper().from(doc.getDataInserimento()));
		//Modifica del24/09/2019 per richiesta del gruppo di ROL (non corretta per me dovrebbe aggiungere il campo data scadenza)
		r.setDataScaricabileFinoAl(new DateXMLGregorianCalendarMapper().from(doc.getDataScadenza()));
		r.setDataValidazione(new DateXMLGregorianCalendarMapper().from(doc.getDataValidazione()));
		r.setFirmatoDigitalmente(new BooleanSiNoMapper().from(doc.getFirmatoDigitalmente()));
		r.setLuogoProduzioneDocumento(new LuogoAsuLuogoASUMapper(codifiche).from(doc.getLuogoProduzioneDocumento()));
		r.setMedicoValidante(doc.getMedicoValidante());
		r.setNumeroDiDownload(doc.getNumDiDownload());
		r.setNumeroGiorniDownload(doc.getNumeroGiorniDownload());
		r.setOscuraScaricoCittadino(doc.getOscuraScaricoCittadino());
		r.setPagatoTicketStato(new PagatoTicketStatoEnumPagatoTicketStatoMapper().from(doc.getPagatoTicket()));
		r.setPaziente(new PazienteMapper().from(doc.getPaziente()));
		r.setPinBruciato(doc.isPinBruciato());
		r.setRichiestoPinCode(doc.isRichiestoPinCode());
		r.setScaricabileSeTicketNonPagato(doc.isScaricabileSeTicketNonPagato());
		r.setSoggettoALeggiSpeciali(doc.isSoggettoALeggiSpeciali());
		//r.setStatoPagamento(statoPagamento); //??
		r.setComponenteLocale(new ComponenteLocaleComponenteLocaleMapper(codifiche).from(doc.getComponenteLocale()));
		r.setTipoDocumento(new TipoDocumentoMapper(codifiche).from(doc.getTipoDocumento()));
		r.setTipoFileDocumento(new TipoFileDocumentoMapper(codifiche).from(doc.getTipoFileDocumento()));
		r.setDataDisponibilitaReferto(new DateXMLGregorianCalendarMapper().from(doc.getDataDisponibilitaReferto()));
		r.setMedicoRefertante(doc.getMedicoRefertante());
		r.setTicketDaPagare(new ImportoMapper().from(new BigDecimalFloatMapper().from(doc.getTicketDaPagare())));
		r.setTicketPagato(new ImportoMapper().from(new BigDecimalFloatMapper().from(doc.getTicketPagato())));
		r.setTipoReferto(new TipoRefertoCodificaMapper().from(doc.getTipoReferto()));
		r.setElencoPrestazioni(new PrestazionePrestazioneMapper(codifiche).fromList(doc.getElencoPrestazioni()));
		r.setElencoNre(doc.getElencoNre());
		return r;
	}

}
