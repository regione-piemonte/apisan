package it.csi.apisan.apisantrovaun.business.apisantrovaun;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import java.util.Set;
import java.util.HashSet;

import it.csi.apisan.apisantrovaun.business.apisantrovaun.impl.FarmacieApiServiceImpl;
import it.csi.apisan.apisantrovaun.business.apisantrovaun.impl.OspedaliApiServiceImpl;
import it.csi.apisan.apisantrovaun.business.apisantrovaun.impl.StruttureSanitarieApiServiceImpl;
import it.csi.apisan.apisantrovaun.business.apisantrovaun.impl.TipologieAssistenzaApiServiceImpl;
import it.csi.apisan.apisantrovaun.business.apisantrovaun.impl.TipologieOspedaleApiServiceImpl;

@ApplicationPath("/")
public class RestApplication extends Application {


    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<Class<?>>();
        resources.add(FarmacieApiServiceImpl.class);
        resources.add(OspedaliApiServiceImpl.class);
        resources.add(StruttureSanitarieApiServiceImpl.class);
        resources.add(TipologieAssistenzaApiServiceImpl.class);
        resources.add(TipologieOspedaleApiServiceImpl.class);

        return resources;
    }




}