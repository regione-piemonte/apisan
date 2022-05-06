package it.csi.apisan.apisanprof.business.apisanprof;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import java.util.Set;
import java.util.HashSet;

import it.csi.apisan.apisanprof.business.apisanprof.impl.CittadiniApiServiceImpl;

@ApplicationPath("/")
public class RestApplication extends Application {


    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<Class<?>>();
        resources.add(CittadiniApiServiceImpl.class);

        return resources;
    }




}