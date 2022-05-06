/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import javax.xml.datatype.XMLGregorianCalendar;

import it.csi.apisan.apisanfse.integration.paziente.dma.Codifica;
import it.csi.apisan.apisanfse.integration.paziente.dma.RegimeDMA;
import it.csi.apisan.apisanfse.integration.paziente.dma.RuoloDMA;

public interface Accessible<T extends Codifica> {
	
	public String getCodiceFiscaleOperatore();
	public void setCodiceFiscaleOperatore(String codiceFiscale);
    public String getCognomeOperatore();
    public void setCognomeOperatore(String cognomeOperatore);
    public String getCollocazione();
    public void setCollocazione(String collocazione);
    
    public XMLGregorianCalendar getDataAccesso();
    public void setDataAccesso(XMLGregorianCalendar dataAccesso);
    
    public String getDescrizione();
    public void setDescrizione(String descrizione);
    
    public String getIdAccesso();
    public void setIdAccesso(String idaccesso);
    
    public String getNomeOperatore();
    public void setNomeOperatore(String nomeOperatore);
    
    public RegimeDMA getRegime();
    public void setRegime(RegimeDMA regime);
    
    public RuoloDMA getRuolo();
    public void setRuolo(RuoloDMA ruolo);
    
    public Codifica getTipoOperazione();
    public void setTipoOperazione(T tipoOpeazione);
    
    public void setApplicazioneVerticale(String applicazioneVerticale);
    public String getApplicazioneVerticale();
}
