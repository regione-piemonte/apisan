package it.csi.apisan.apisancons.business.apisancons;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import java.util.Set;
import java.util.HashSet;

import it.csi.apisan.apisancons.business.apisancons.impl.AsrApiServiceImpl;
import it.csi.apisan.apisancons.business.apisancons.impl.CittadinoApiServiceImpl;
import it.csi.apisan.apisancons.business.apisancons.impl.ServizioAttivoApiServiceImpl;
import it.csi.apisan.apisancons.business.apisancons.impl.StatiConsensoApiServiceImpl;
import it.csi.apisan.apisancons.business.apisancons.impl.TipologieApiServiceImpl;
import it.csi.apisan.apisancons.business.apisancons.impl.TipologieValiditaApiServiceImpl;

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