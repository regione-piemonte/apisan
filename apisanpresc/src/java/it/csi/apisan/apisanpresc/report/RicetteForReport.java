/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.report;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;

public class RicetteForReport {
    private List<PrescrizioniForReport> prescrizioniForReportList = new ArrayList<PrescrizioniForReport>();
    private String                      dirittiEuro;
    private String                      dirittiValuta;
    private String                      dirittiPercepito;
    private String                      codPercezione;
    private String                      codNrPassaporto;
    private String                      descrizioneBreveArticolo;
    private String                      codArticolo;
    private String                      quantita;
    private String                      nrCopie;
    private String                      costoLibrEuro;
    private String                      costoLibrValuta;
    private String                      costoLibrPercepito;
    private String                      codRegistro;
    private String                      dtRegistrazione;
    private String                      idGruppoEsenzione;
    private String                      descrizioneGratuito;
    private String                      annotazioni;
    private String                      valoreBeneString;
    private String                      nrDocumento;
    private String                      descrModPagamento;
    private String                      tipologiaDocumento;
    private String                      nre;
    private String                      cfMedico1;
    private String                      codRegione;
    private String                      codSpecializzazione;
    private String                      testata1;
    private String                      tipoPrescrizione;
    private String                      nonEsente;
    private String                      dataCompilazione;
    private String                      tipoVista;
    private String                      classePriorita;
    private String                      statoEstero;
    private String                      istituzCompetente;
    private String                      numIdentPers;
    private String                      numIdentTess;
    private String                      dataNascitaEstero;
    private String                      dataScadTessera;
    private String                      statoProcesso;
    private String                      codASLAo;
    private String                      regione;
    private String                      nreRegProv;
    private String                      nreRagLotto;
    private String                      nreIdLotto;
    private String                      nreCodLottoProgressivo;
    private String                      cf;
    private String                      via;
    private String                      cap;
    private String                      citta;
    private String                      civico;
    private String                      esenzione;
    private String                      siglaProvincia;
    private String                      codiceASL;
    private String                      disposizioniRegionali;
    private String                      prioritaPresc;
    private String                      altro;
    private String                      quesitoDiagnostico;
    private String                      tipoRicetta;
    private String                      data;
    private String                      codiceParteDue;
    private String                      codiceParteUno;
    private String                      codiceParteTre;
    private ByteArrayInputStream codiceParteUnoS;
    private ByteArrayInputStream codiceParteDueS;
    private ByteArrayInputStream codiceParteTreS;
    private String oscuramDati;
    private String stringaDatiOscurati;
    private boolean isDatiOscurati;

    public String getOscuramDati() {
        return oscuramDati;
    }

    public void setOscuramDati(String oscuramDati) {
        this.oscuramDati = oscuramDati;
    }

    public String getStringaDatiOscurati() {
        return stringaDatiOscurati;
    }

    public void setStringaDatiOscurati(String stringaDatiOscurati) {
        this.stringaDatiOscurati = stringaDatiOscurati;
    }

    public String getDirittiEuro() {
        return dirittiEuro;
    }

    public void setDirittiEuro(String dirittiEuro) {
        this.dirittiEuro = dirittiEuro;
    }

    public String getDirittiValuta() {
        return dirittiValuta;
    }

    public void setDirittiValuta(String dirittiValuta) {
        this.dirittiValuta = dirittiValuta;
    }

    public String getDirittiPercepito() {
        return dirittiPercepito;
    }

    public void setDirittiPercepito(String dirittiPercepito) {
        this.dirittiPercepito = dirittiPercepito;
    }

    public String getCodPercezione() {
        return codPercezione;
    }

    public void setCodPercezione(String codPercezione) {
        this.codPercezione = codPercezione;
    }

    public String getCodNrPassaporto() {
        return codNrPassaporto;
    }

    public void setCodNrPassaporto(String codNrPassaporto) {
        this.codNrPassaporto = codNrPassaporto;
    }

    public String getDescrizioneBreveArticolo() {
        return descrizioneBreveArticolo;
    }

    public void setDescrizioneBreveArticolo(String descrizioneBreveArticolo) {
        this.descrizioneBreveArticolo = descrizioneBreveArticolo;
    }

    public String getCodArticolo() {
        return codArticolo;
    }

    public void setCodArticolo(String codArticolo) {
        this.codArticolo = codArticolo;
    }

    public String getQuantita() {
        return quantita;
    }

    public void setQuantita(String quantita) {
        this.quantita = quantita;
    }

    public String getNrCopie() {
        return nrCopie;
    }

    public void setNrCopie(String nrCopie) {
        this.nrCopie = nrCopie;
    }

    public String getCostoLibrEuro() {
        return costoLibrEuro;
    }

    public void setCostoLibrEuro(String costoLibrEuro) {
        this.costoLibrEuro = costoLibrEuro;
    }

    public String getCostoLibrValuta() {
        return costoLibrValuta;
    }

    public void setCostoLibrValuta(String costoLibrValuta) {
        this.costoLibrValuta = costoLibrValuta;
    }

    public String getCostoLibrPercepito() {
        return costoLibrPercepito;
    }

    public void setCostoLibrPercepito(String costoLibrPercepito) {
        this.costoLibrPercepito = costoLibrPercepito;
    }

    public String getCodRegistro() {
        return codRegistro;
    }

    public void setCodRegistro(String codRegistro) {
        this.codRegistro = codRegistro;
    }

    public String getDtRegistrazione() {
        return dtRegistrazione;
    }

    public void setDtRegistrazione(String dtRegistrazione) {
        this.dtRegistrazione = dtRegistrazione;
    }

    public String getIdGruppoEsenzione() {
        return idGruppoEsenzione;
    }

    public void setIdGruppoEsenzione(String idGruppoEsenzione) {
        this.idGruppoEsenzione = idGruppoEsenzione;
    }

    public String getDescrizioneGratuito() {
        return descrizioneGratuito;
    }

    public void setDescrizioneGratuito(String descrizioneGratuito) {
        this.descrizioneGratuito = descrizioneGratuito;
    }

    public String getAnnotazioni() {
        return annotazioni;
    }

    public void setAnnotazioni(String annotazioni) {
        this.annotazioni = annotazioni;
    }

    public String getValoreBeneString() {
        return valoreBeneString;
    }

    public void setValoreBeneString(String valoreBeneString) {
        this.valoreBeneString = valoreBeneString;
    }

    public String getNrDocumento() {
        return nrDocumento;
    }

    public void setNrDocumento(String nrDocumento) {
        this.nrDocumento = nrDocumento;
    }

    public String getDescrModPagamento() {
        return descrModPagamento;
    }

    public void setDescrModPagamento(String descrModPagamento) {
        this.descrModPagamento = descrModPagamento;
    }

    public String getTipologiaDocumento() {
        return tipologiaDocumento;
    }

    public void setTipologiaDocumento(String tipologiaDocumento) {
        this.tipologiaDocumento = tipologiaDocumento;
    }

    private String codAutenticazione;
    private String numPrestazioniConfezioni;
    private String cognomeNomeRichiedente;
    private String cognomeNomeMedico;
    private String cognomeMedico;
    private String nomeMedico;
    private String cognomeRichiedente;
    private String nomeRichiedente;

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    private String provincia;


    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public String getCivico() {
        return civico;
    }

    public void setCivico(String civico) {
        this.civico = civico;
    }

    public String getEsenzione() {
        return esenzione;
    }

    public void setEsenzione(String esenzione) {
        this.esenzione = esenzione;
    }

    public String getSiglaProvincia() {
        return siglaProvincia;
    }

    public void setSiglaProvincia(String siglaProvincia) {
        this.siglaProvincia = siglaProvincia;
    }

    public String getCodiceASL() {
        return codiceASL;
    }

    public void setCodiceASL(String codiceASL) {
        this.codiceASL = codiceASL;
    }

    public String getDisposizioniRegionali() {
        return disposizioniRegionali;
    }

    public void setDisposizioniRegionali(String disposizioniRegionali) {
        this.disposizioniRegionali = disposizioniRegionali;
    }

    public String getPrioritaPresc() {
        return prioritaPresc;
    }

    public void setPrioritaPresc(String prioritaPresc) {
        this.prioritaPresc = prioritaPresc;
    }

    public String getAltro() {
        return altro;
    }

    public void setAltro(String altro) {
        this.altro = altro;
    }

    public String getQuesitoDiagnostico() {
        return quesitoDiagnostico;
    }

    public void setQuesitoDiagnostico(String quesitoDiagnostico) {
        this.quesitoDiagnostico = quesitoDiagnostico;
    }

    public String getTipoRicetta() {
        return tipoRicetta;
    }

    public void setTipoRicetta(String tipoRicetta) {
        this.tipoRicetta = tipoRicetta;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


    public String getCodAutenticazione() {
        return codAutenticazione;
    }

    public void setCodAutenticazione(String codAutenticazione) {
        this.codAutenticazione = codAutenticazione;
    }

    public String getNumPrestazioniConfezioni() {
        return numPrestazioniConfezioni;
    }

    public void setNumPrestazioniConfezioni(String numPrestazioniConfezioni) {
        this.numPrestazioniConfezioni = numPrestazioniConfezioni;
    }

    public String getCognomeNomeRichiedente() {
        return cognomeNomeRichiedente;
    }

    public void setCognomeNomeRichiedente(String cognomeNomeRichiedente) {
        this.cognomeNomeRichiedente = cognomeNomeRichiedente;
    }

    public String getCognomeNomeMedico() {
        return cognomeNomeMedico;
    }

    public void setCognomeNomeMedico(String cognomeNomeMedico) {
        this.cognomeNomeMedico = cognomeNomeMedico;
    }

    public String getCognomeMedico() {
        return cognomeMedico;
    }

    public void setCognomeMedico(String cognomeMedico) {
        this.cognomeMedico = cognomeMedico;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public String getCognomeRichiedente() {
        return cognomeRichiedente;
    }

    public void setCognomeRichiedente(String cognomeRichiedente) {
        this.cognomeRichiedente = cognomeRichiedente;
    }

    public String getNomeRichiedente() {
        return nomeRichiedente;
    }

    public void setNomeRichiedente(String nomeRichiedente) {
        this.nomeRichiedente = nomeRichiedente;
    }

    public void setNre(String nre) {
        this.nre = nre;
    }

    public String getNre() {
        return nre;
    }

    public void setCfMedico1(String cfMedico1) {
        this.cfMedico1 = cfMedico1;
    }

    public String getCfMedico1() {
        return cfMedico1;
    }

    public void setCodRegione(String codRegione) {
        this.codRegione = codRegione;
    }

    public String getCodRegione() {
        return codRegione;
    }

    public void setCodASLAo(String codASLAo) {
        this.codASLAo = codASLAo;
    }

    public String getCodASLAo() {
        return codASLAo;
    }

    public void setCodSpecializzazione(String codSpecializzazione) {
        this.codSpecializzazione = codSpecializzazione;
    }

    public String getCodSpecializzazione() {
        return codSpecializzazione;
    }

    public void setTestata1(String testata1) {
        this.testata1 = testata1;
    }

    public String getTestata1() {
        return testata1;
    }


    public void setTipoPrescrizione(String tipoPrescrizione) {

        this.tipoPrescrizione = tipoPrescrizione;
    }

    public String getTipoPrescrizione() {
        return tipoPrescrizione;
    }

    public void setNonEsente(String nonEsente) {
        this.nonEsente = nonEsente;
    }

    public String getNonEsente() {
        return nonEsente;
    }

    public void setDataCompilazione(String dataCompilazione) {

        this.dataCompilazione = dataCompilazione;
    }

    public String getDataCompilazione() {
        return dataCompilazione;
    }

    public void setTipoVista(String tipoVista) {
        this.tipoVista = tipoVista;
    }

    public String getTipoVista() {
        return tipoVista;
    }


    public void setClassePriorita(String classePriorita) {
        this.classePriorita = classePriorita;
    }

    public String getClassePriorita() {
        return classePriorita;
    }

    public void setStatoEstero(String statoEstero) {
        this.statoEstero = statoEstero;
    }

    public String getStatoEstero() {
        return statoEstero;
    }

    public void setIstituzCompetente(String istituzCompetente) {
        this.istituzCompetente = istituzCompetente;
    }

    public String getIstituzCompetente() {
        return istituzCompetente;
    }

    public void setNumIdentPers(String numIdentPers) {
        this.numIdentPers = numIdentPers;
    }

    public String getNumIdentPers() {
        return numIdentPers;
    }

    public void setNumIdentTess(String numIdentTess) {
        this.numIdentTess = numIdentTess;
    }

    public String getNumIdentTess() {
        return numIdentTess;
    }

    public void setDataNascitaEstero(String dataNascitaEstero) {
        this.dataNascitaEstero = dataNascitaEstero;
    }

    public String getDataNascitaEstero() {
        return dataNascitaEstero;
    }

    public void setDataScadTessera(String dataScadTessera) {
        this.dataScadTessera = dataScadTessera;
    }

    public String getDataScadTessera() {
        return dataScadTessera;
    }

    public void setStatoProcesso(String statoProcesso) {
        this.statoProcesso = statoProcesso;
    }

    public String getStatoProcesso() {
        return statoProcesso;
    }


    public void setRegione(String regione) {
        this.regione = regione;
    }

    public String getRegione() {
        return regione;
    }

    public void setNreRegProv(String nreRegProv) {
        this.nreRegProv = nreRegProv;
    }

    public String getNreRegProv() {
        return nreRegProv;
    }

    public void setNreRagLotto(String nreRagLotto) {
        this.nreRagLotto = nreRagLotto;
    }

    public String getNreRagLotto() {
        return nreRagLotto;
    }

    public void setNreIdLotto(String nreIdLotto) {
        this.nreIdLotto = nreIdLotto;
    }

    public String getNreIdLotto() {
        return nreIdLotto;
    }

    public void setCf(String cf) {
        this.cf = cf;
    }

    public String getCf() {
        return cf;
    }

    public void setNreCodLottoProgressivo(String nreodLottoProgressivo) {
        this.nreCodLottoProgressivo = nreCodLottoProgressivo;
    }

    public String getNreCodLottoProgressivo() {
        return nreCodLottoProgressivo;
    }

    public String getVia() {
        return via;
    }

    public void setVia(String via) {
        this.via = via;
    }

    public List<PrescrizioniForReport> getPrescrizioniForReportList() {
        return prescrizioniForReportList;
    }

    public void setCodiceParteDue(String codiceParteDue) {
        this.codiceParteDue = codiceParteDue;
    }

    public String getCodiceParteDue() {
        return codiceParteDue;
    }

    public void setCodiceParteUno(String codiceParteUno) {
        this.codiceParteUno = codiceParteUno;
    }

    public String getCodiceParteUno() {
        return codiceParteUno;
    }

    public void setCodiceParteTre(String codiceParteTre) {
        this.codiceParteTre = codiceParteTre;
    }

    public String getCodiceParteTre() {
        return codiceParteTre;
    }

    public void setCodiceParteUnoS(ByteArrayInputStream codiceParteUnoS) {
        this.codiceParteUnoS = codiceParteUnoS;
    }

    public ByteArrayInputStream getCodiceParteUnoS() {
        return codiceParteUnoS;
    }

    public void setCodiceParteDueS(ByteArrayInputStream codiceParteDueS) {
        this.codiceParteDueS = codiceParteDueS;
    }

    public ByteArrayInputStream getCodiceParteDueS() {
        return codiceParteDueS;
    }

    public void setCodiceParteTreS(ByteArrayInputStream codiceParteTreS) {
        this.codiceParteTreS = codiceParteTreS;
    }

    public ByteArrayInputStream getCodiceParteTreS() {
        return codiceParteTreS;
    }

    public void setIsDatiOscurati(boolean isDatiOscurati) {
        this.isDatiOscurati = isDatiOscurati;
    }

    public boolean getIsDatiOscurati() {
        return isDatiOscurati;
    }
}
