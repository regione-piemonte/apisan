/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.invoker;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import java.util.Set;
import java.util.HashSet;

import it.csi.apisan.apisanvac.api.impl.CentriVaccinaliApiServiceImpl;
import it.csi.apisan.apisanvac.api.impl.CittadiniApiServiceImpl;
import it.csi.apisan.apisanvac.api.impl.ServizioAttivoApiServiceImpl;

@ApplicationPath("/")
public class RestApplication extends Application {


    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<Class<?>>();
        resources.add(CentriVaccinaliApiServiceImpl.class);
        resources.add(CittadiniApiServiceImpl.class);
        resources.add(ServizioAttivoApiServiceImpl.class);

        return resources;
    }




}