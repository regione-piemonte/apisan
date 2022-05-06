package it.csi.apisan.apisanscerev.business.apisanscerev;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import java.util.Set;
import java.util.HashSet;

import it.csi.apisan.apisanscerev.business.apisanscerev.impl.AsrApiServiceImpl;
import it.csi.apisan.apisanscerev.business.apisanscerev.impl.CittadinoApiServiceImpl;
import it.csi.apisan.apisanscerev.business.apisanscerev.impl.ServizioAttivoApiServiceImpl;
import it.csi.apisan.apisanscerev.business.apisanscerev.impl.StatiConsensoApiServiceImpl;
import it.csi.apisan.apisanscerev.business.apisanscerev.impl.TipologieApiServiceImpl;
import it.csi.apisan.apisanscerev.business.apisanscerev.impl.TipologieValiditaApiServiceImpl;

@ApplicationPath("/")
public class RestApplication extends Application {


    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<Class<?>>();
        resources.add(AsrApiServiceImpl.class);
        resources.add(CittadinoApiServiceImpl.class);
        resources.add(ServizioAttivoApiServiceImpl.class);
        resources.add(StatiConsensoApiServiceImpl.class);
        resources.add(TipologieApiServiceImpl.class);
        resources.add(TipologieValiditaApiServiceImpl.class);

        return resources;
    }




}