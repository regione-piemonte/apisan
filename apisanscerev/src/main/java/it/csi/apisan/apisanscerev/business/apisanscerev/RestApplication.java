package it.csi.apisan.apisanscerev.business.apisanscerev;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import java.util.Set;
import java.util.HashSet;

import it.csi.apisan.apisanscerev.business.apisanscerev.impl.AmbulatoriApiServiceImpl;
import it.csi.apisan.apisanscerev.business.apisanscerev.impl.CittadinanzeApiServiceImpl;
import it.csi.apisan.apisanscerev.business.apisanscerev.impl.CittadiniApiServiceImpl;
import it.csi.apisan.apisanscerev.business.apisanscerev.impl.DisponibilitaApiServiceImpl;
import it.csi.apisan.apisanscerev.business.apisanscerev.impl.IndirizziApiServiceImpl;
import it.csi.apisan.apisanscerev.business.apisanscerev.impl.MediciApiServiceImpl;
import it.csi.apisan.apisanscerev.business.apisanscerev.impl.MotivazioniDomicilioApiServiceImpl;
import it.csi.apisan.apisanscerev.business.apisanscerev.impl.MotivazioniSoggiornoApiServiceImpl;
import it.csi.apisan.apisanscerev.business.apisanscerev.impl.ServizioAttivoApiServiceImpl;
import it.csi.apisan.apisanscerev.business.apisanscerev.impl.TipologieMedicoApiServiceImpl;

@ApplicationPath("/")
public class RestApplication extends Application {


    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<Class<?>>();
        resources.add(AmbulatoriApiServiceImpl.class);
        resources.add(CittadinanzeApiServiceImpl.class);
        resources.add(CittadiniApiServiceImpl.class);
        resources.add(DisponibilitaApiServiceImpl.class);
        resources.add(IndirizziApiServiceImpl.class);
        resources.add(MediciApiServiceImpl.class);
        resources.add(MotivazioniDomicilioApiServiceImpl.class);
        resources.add(MotivazioniSoggiornoApiServiceImpl.class);
        resources.add(ServizioAttivoApiServiceImpl.class);
        resources.add(TipologieMedicoApiServiceImpl.class);

        return resources;
    }




}