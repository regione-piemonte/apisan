/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/

package it.csi.apisan.apisanpresc.soap.sar.brokerservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.csi.apisan.apisanpresc.soap.sar.brokerservice package. 
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

    private final static QName _ServiceInfoResponse_QNAME = new QName("http://relbl.csi.it/", "serviceInfoResponse");
    private final static QName _TestResponse_QNAME = new QName("http://relbl.csi.it/", "testResponse");
    private final static QName _DecryptAssRic_QNAME = new QName("http://relbl.csi.it/", "decryptAssRic");
    private final static QName _DecryptXMLResponse_QNAME = new QName("http://relbl.csi.it/", "decryptXMLResponse");
    private final static QName _EncryptCodAssOld_QNAME = new QName("http://relbl.csi.it/", "encryptCodAssOld");
    private final static QName _CacheResponse_QNAME = new QName("http://relbl.csi.it/", "cacheResponse");
    private final static QName _DecryptCodAss_QNAME = new QName("http://relbl.csi.it/", "decryptCodAss");
    private final static QName _DecryptCodAssResponse_QNAME = new QName("http://relbl.csi.it/", "decryptCodAssResponse");
    private final static QName _DecryptXML_QNAME = new QName("http://relbl.csi.it/", "decryptXML");
    private final static QName _EncryptCodAssResponse_QNAME = new QName("http://relbl.csi.it/", "encryptCodAssResponse");
    private final static QName _SaveRicXMLResponse_QNAME = new QName("http://relbl.csi.it/", "saveRicXMLResponse");
    private final static QName _EncryptCodAssSac_QNAME = new QName("http://relbl.csi.it/", "encryptCodAssSac");
    private final static QName _SaveRicXML_QNAME = new QName("http://relbl.csi.it/", "saveRicXML");
    private final static QName _Test_QNAME = new QName("http://relbl.csi.it/", "test");
    private final static QName _Cache_QNAME = new QName("http://relbl.csi.it/", "cache");
    private final static QName _EncryptCodAssSacResponse_QNAME = new QName("http://relbl.csi.it/", "encryptCodAssSacResponse");
    private final static QName _CacheDeleteResponse_QNAME = new QName("http://relbl.csi.it/", "cacheDeleteResponse");
    private final static QName _DbInfo_QNAME = new QName("http://relbl.csi.it/", "dbInfo");
    private final static QName _EncryptCodAssOldResponse_QNAME = new QName("http://relbl.csi.it/", "encryptCodAssOldResponse");
    private final static QName _CacheDelete_QNAME = new QName("http://relbl.csi.it/", "cacheDelete");
    private final static QName _EncryptAssRicResponse_QNAME = new QName("http://relbl.csi.it/", "encryptAssRicResponse");
    private final static QName _EncryptCodAss_QNAME = new QName("http://relbl.csi.it/", "encryptCodAss");
    private final static QName _DbInfoResponse_QNAME = new QName("http://relbl.csi.it/", "dbInfoResponse");
    private final static QName _ServiceInfo_QNAME = new QName("http://relbl.csi.it/", "serviceInfo");
    private final static QName _DecryptAssRicResponse_QNAME = new QName("http://relbl.csi.it/", "decryptAssRicResponse");
    private final static QName _EncryptAssRic_QNAME = new QName("http://relbl.csi.it/", "encryptAssRic");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.apisan.apisanpresc.soap.sar.brokerservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EncryptAssRic }
     * 
     */
    public EncryptAssRic createEncryptAssRic() {
        return new EncryptAssRic();
    }

    /**
     * Create an instance of {@link DecryptAssRicResponse }
     * 
     */
    public DecryptAssRicResponse createDecryptAssRicResponse() {
        return new DecryptAssRicResponse();
    }

    /**
     * Create an instance of {@link ServiceInfo }
     * 
     */
    public ServiceInfo createServiceInfo() {
        return new ServiceInfo();
    }

    /**
     * Create an instance of {@link EncryptCodAss }
     * 
     */
    public EncryptCodAss createEncryptCodAss() {
        return new EncryptCodAss();
    }

    /**
     * Create an instance of {@link DbInfoResponse }
     * 
     */
    public DbInfoResponse createDbInfoResponse() {
        return new DbInfoResponse();
    }

    /**
     * Create an instance of {@link EncryptAssRicResponse }
     * 
     */
    public EncryptAssRicResponse createEncryptAssRicResponse() {
        return new EncryptAssRicResponse();
    }

    /**
     * Create an instance of {@link CacheDelete }
     * 
     */
    public CacheDelete createCacheDelete() {
        return new CacheDelete();
    }

    /**
     * Create an instance of {@link EncryptCodAssOldResponse }
     * 
     */
    public EncryptCodAssOldResponse createEncryptCodAssOldResponse() {
        return new EncryptCodAssOldResponse();
    }

    /**
     * Create an instance of {@link CacheDeleteResponse }
     * 
     */
    public CacheDeleteResponse createCacheDeleteResponse() {
        return new CacheDeleteResponse();
    }

    /**
     * Create an instance of {@link DbInfo }
     * 
     */
    public DbInfo createDbInfo() {
        return new DbInfo();
    }

    /**
     * Create an instance of {@link Cache }
     * 
     */
    public Cache createCache() {
        return new Cache();
    }

    /**
     * Create an instance of {@link EncryptCodAssSacResponse }
     * 
     */
    public EncryptCodAssSacResponse createEncryptCodAssSacResponse() {
        return new EncryptCodAssSacResponse();
    }

    /**
     * Create an instance of {@link Test }
     * 
     */
    public Test createTest() {
        return new Test();
    }

    /**
     * Create an instance of {@link SaveRicXML }
     * 
     */
    public SaveRicXML createSaveRicXML() {
        return new SaveRicXML();
    }

    /**
     * Create an instance of {@link EncryptCodAssSac }
     * 
     */
    public EncryptCodAssSac createEncryptCodAssSac() {
        return new EncryptCodAssSac();
    }

    /**
     * Create an instance of {@link EncryptCodAssResponse }
     * 
     */
    public EncryptCodAssResponse createEncryptCodAssResponse() {
        return new EncryptCodAssResponse();
    }

    /**
     * Create an instance of {@link SaveRicXMLResponse }
     * 
     */
    public SaveRicXMLResponse createSaveRicXMLResponse() {
        return new SaveRicXMLResponse();
    }

    /**
     * Create an instance of {@link DecryptCodAss }
     * 
     */
    public DecryptCodAss createDecryptCodAss() {
        return new DecryptCodAss();
    }

    /**
     * Create an instance of {@link DecryptCodAssResponse }
     * 
     */
    public DecryptCodAssResponse createDecryptCodAssResponse() {
        return new DecryptCodAssResponse();
    }

    /**
     * Create an instance of {@link DecryptXML }
     * 
     */
    public DecryptXML createDecryptXML() {
        return new DecryptXML();
    }

    /**
     * Create an instance of {@link CacheResponse }
     * 
     */
    public CacheResponse createCacheResponse() {
        return new CacheResponse();
    }

    /**
     * Create an instance of {@link DecryptAssRic }
     * 
     */
    public DecryptAssRic createDecryptAssRic() {
        return new DecryptAssRic();
    }

    /**
     * Create an instance of {@link DecryptXMLResponse }
     * 
     */
    public DecryptXMLResponse createDecryptXMLResponse() {
        return new DecryptXMLResponse();
    }

    /**
     * Create an instance of {@link EncryptCodAssOld }
     * 
     */
    public EncryptCodAssOld createEncryptCodAssOld() {
        return new EncryptCodAssOld();
    }

    /**
     * Create an instance of {@link ServiceInfoResponse }
     * 
     */
    public ServiceInfoResponse createServiceInfoResponse() {
        return new ServiceInfoResponse();
    }

    /**
     * Create an instance of {@link TestResponse }
     * 
     */
    public TestResponse createTestResponse() {
        return new TestResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://relbl.csi.it/", name = "serviceInfoResponse")
    public JAXBElement<ServiceInfoResponse> createServiceInfoResponse(ServiceInfoResponse value) {
        return new JAXBElement<ServiceInfoResponse>(_ServiceInfoResponse_QNAME, ServiceInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://relbl.csi.it/", name = "testResponse")
    public JAXBElement<TestResponse> createTestResponse(TestResponse value) {
        return new JAXBElement<TestResponse>(_TestResponse_QNAME, TestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DecryptAssRic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://relbl.csi.it/", name = "decryptAssRic")
    public JAXBElement<DecryptAssRic> createDecryptAssRic(DecryptAssRic value) {
        return new JAXBElement<DecryptAssRic>(_DecryptAssRic_QNAME, DecryptAssRic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DecryptXMLResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://relbl.csi.it/", name = "decryptXMLResponse")
    public JAXBElement<DecryptXMLResponse> createDecryptXMLResponse(DecryptXMLResponse value) {
        return new JAXBElement<DecryptXMLResponse>(_DecryptXMLResponse_QNAME, DecryptXMLResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncryptCodAssOld }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://relbl.csi.it/", name = "encryptCodAssOld")
    public JAXBElement<EncryptCodAssOld> createEncryptCodAssOld(EncryptCodAssOld value) {
        return new JAXBElement<EncryptCodAssOld>(_EncryptCodAssOld_QNAME, EncryptCodAssOld.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CacheResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://relbl.csi.it/", name = "cacheResponse")
    public JAXBElement<CacheResponse> createCacheResponse(CacheResponse value) {
        return new JAXBElement<CacheResponse>(_CacheResponse_QNAME, CacheResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DecryptCodAss }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://relbl.csi.it/", name = "decryptCodAss")
    public JAXBElement<DecryptCodAss> createDecryptCodAss(DecryptCodAss value) {
        return new JAXBElement<DecryptCodAss>(_DecryptCodAss_QNAME, DecryptCodAss.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DecryptCodAssResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://relbl.csi.it/", name = "decryptCodAssResponse")
    public JAXBElement<DecryptCodAssResponse> createDecryptCodAssResponse(DecryptCodAssResponse value) {
        return new JAXBElement<DecryptCodAssResponse>(_DecryptCodAssResponse_QNAME, DecryptCodAssResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DecryptXML }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://relbl.csi.it/", name = "decryptXML")
    public JAXBElement<DecryptXML> createDecryptXML(DecryptXML value) {
        return new JAXBElement<DecryptXML>(_DecryptXML_QNAME, DecryptXML.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncryptCodAssResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://relbl.csi.it/", name = "encryptCodAssResponse")
    public JAXBElement<EncryptCodAssResponse> createEncryptCodAssResponse(EncryptCodAssResponse value) {
        return new JAXBElement<EncryptCodAssResponse>(_EncryptCodAssResponse_QNAME, EncryptCodAssResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveRicXMLResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://relbl.csi.it/", name = "saveRicXMLResponse")
    public JAXBElement<SaveRicXMLResponse> createSaveRicXMLResponse(SaveRicXMLResponse value) {
        return new JAXBElement<SaveRicXMLResponse>(_SaveRicXMLResponse_QNAME, SaveRicXMLResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncryptCodAssSac }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://relbl.csi.it/", name = "encryptCodAssSac")
    public JAXBElement<EncryptCodAssSac> createEncryptCodAssSac(EncryptCodAssSac value) {
        return new JAXBElement<EncryptCodAssSac>(_EncryptCodAssSac_QNAME, EncryptCodAssSac.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveRicXML }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://relbl.csi.it/", name = "saveRicXML")
    public JAXBElement<SaveRicXML> createSaveRicXML(SaveRicXML value) {
        return new JAXBElement<SaveRicXML>(_SaveRicXML_QNAME, SaveRicXML.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Test }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://relbl.csi.it/", name = "test")
    public JAXBElement<Test> createTest(Test value) {
        return new JAXBElement<Test>(_Test_QNAME, Test.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cache }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://relbl.csi.it/", name = "cache")
    public JAXBElement<Cache> createCache(Cache value) {
        return new JAXBElement<Cache>(_Cache_QNAME, Cache.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncryptCodAssSacResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://relbl.csi.it/", name = "encryptCodAssSacResponse")
    public JAXBElement<EncryptCodAssSacResponse> createEncryptCodAssSacResponse(EncryptCodAssSacResponse value) {
        return new JAXBElement<EncryptCodAssSacResponse>(_EncryptCodAssSacResponse_QNAME, EncryptCodAssSacResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CacheDeleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://relbl.csi.it/", name = "cacheDeleteResponse")
    public JAXBElement<CacheDeleteResponse> createCacheDeleteResponse(CacheDeleteResponse value) {
        return new JAXBElement<CacheDeleteResponse>(_CacheDeleteResponse_QNAME, CacheDeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DbInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://relbl.csi.it/", name = "dbInfo")
    public JAXBElement<DbInfo> createDbInfo(DbInfo value) {
        return new JAXBElement<DbInfo>(_DbInfo_QNAME, DbInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncryptCodAssOldResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://relbl.csi.it/", name = "encryptCodAssOldResponse")
    public JAXBElement<EncryptCodAssOldResponse> createEncryptCodAssOldResponse(EncryptCodAssOldResponse value) {
        return new JAXBElement<EncryptCodAssOldResponse>(_EncryptCodAssOldResponse_QNAME, EncryptCodAssOldResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CacheDelete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://relbl.csi.it/", name = "cacheDelete")
    public JAXBElement<CacheDelete> createCacheDelete(CacheDelete value) {
        return new JAXBElement<CacheDelete>(_CacheDelete_QNAME, CacheDelete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncryptAssRicResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://relbl.csi.it/", name = "encryptAssRicResponse")
    public JAXBElement<EncryptAssRicResponse> createEncryptAssRicResponse(EncryptAssRicResponse value) {
        return new JAXBElement<EncryptAssRicResponse>(_EncryptAssRicResponse_QNAME, EncryptAssRicResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncryptCodAss }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://relbl.csi.it/", name = "encryptCodAss")
    public JAXBElement<EncryptCodAss> createEncryptCodAss(EncryptCodAss value) {
        return new JAXBElement<EncryptCodAss>(_EncryptCodAss_QNAME, EncryptCodAss.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DbInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://relbl.csi.it/", name = "dbInfoResponse")
    public JAXBElement<DbInfoResponse> createDbInfoResponse(DbInfoResponse value) {
        return new JAXBElement<DbInfoResponse>(_DbInfoResponse_QNAME, DbInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://relbl.csi.it/", name = "serviceInfo")
    public JAXBElement<ServiceInfo> createServiceInfo(ServiceInfo value) {
        return new JAXBElement<ServiceInfo>(_ServiceInfo_QNAME, ServiceInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DecryptAssRicResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://relbl.csi.it/", name = "decryptAssRicResponse")
    public JAXBElement<DecryptAssRicResponse> createDecryptAssRicResponse(DecryptAssRicResponse value) {
        return new JAXBElement<DecryptAssRicResponse>(_DecryptAssRicResponse_QNAME, DecryptAssRicResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncryptAssRic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://relbl.csi.it/", name = "encryptAssRic")
    public JAXBElement<EncryptAssRic> createEncryptAssRic(EncryptAssRic value) {
        return new JAXBElement<EncryptAssRic>(_EncryptAssRic_QNAME, EncryptAssRic.class, null, value);
    }

}
