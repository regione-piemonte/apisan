/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanvac.xml.datidocumentimodel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.csi.apisan.apisanvac.xml.datidocumentimodel package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DatiDocumentiModel_QNAME = new QName("", "DatiDocumentiModel");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.apisan.apisanvac.xml.datidocumentimodel
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DatiDocumentiModel }
     * 
     */
    public DatiDocumentiModel createDatiDocumentiModel() {
        return new DatiDocumentiModel();
    }

    /**
     * Create an instance of {@link DocumentoModel }
     * 
     */
    public DocumentoModel createDocumentoModel() {
        return new DocumentoModel();
    }

    /**
     * Create an instance of {@link ResultSetPost }
     * 
     */
    public ResultSetPost createResultSetPost() {
        return new ResultSetPost();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatiDocumentiModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DatiDocumentiModel")
    public JAXBElement<DatiDocumentiModel> createDatiDocumentiModel(DatiDocumentiModel value) {
        return new JAXBElement<DatiDocumentiModel>(_DatiDocumentiModel_QNAME, DatiDocumentiModel.class, null, value);
    }

}
