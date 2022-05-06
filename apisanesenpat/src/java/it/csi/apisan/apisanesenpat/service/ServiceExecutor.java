/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesenpat.service;

import it.csi.apisan.apisanesenpat.util.LogUtil;
import it.csi.apisan.apisanesenpat.util.SpringApplicationContextProvider;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;

import javax.ws.rs.core.Response;
import java.util.Arrays;

public class ServiceExecutor {
    protected static LogUtil log = new LogUtil(ServiceExecutor.class);

    public static <T extends RESTBaseService> Response execute(Class<T> serviceClass, Object... args) {
        final String METHOD_NAME = "execute";

        log.info(METHOD_NAME, "Service: (%s) with args: %s", serviceClass.getSimpleName(), (LogUtil.ToLog) () -> Arrays.toString(args));

        ApplicationContext appContext = SpringApplicationContextProvider.getApplicationContext();

        T service;
        try {
            service = (T) appContext.getBean(serviceClass, args);
        } catch (ClassCastException cce) {
            String msg = "Errore tecnico: Il bean specificato non e' di tipo RESTBaseService: " + (serviceClass != null ? serviceClass.getName() : "null");
            log.error(METHOD_NAME, msg, cce);
            return Response.status(500).entity(msg).build();
        } catch (BeansException be) {
            String msg = "Errore tecnico: Errore nel reperimento del Bean di Spring: " + (serviceClass != null ? serviceClass.getName() : "null") + " " + be.getMessage();
            log.error(METHOD_NAME, msg, be);
            return Response.status(500).entity(msg).build();
        }

        return service.executeService();
    }

    public static <T extends RESTBaseService> T getApisanService(Class<T> serviceClass, Object... args) {
        final String METHOD_NAME = "execute";

        log.info(METHOD_NAME, "Service: (%s) with args: %s", serviceClass.getSimpleName(), (LogUtil.ToLog) () -> Arrays.toString(args));

        ApplicationContext appContext = SpringApplicationContextProvider.getApplicationContext();

        T service = null;

        try {
            service = (T) appContext.getBean(serviceClass, args);
        } catch (ClassCastException cce) {
            String msg = "Errore tecnico: Il bean specificato non e' di tipo RESTBaseService: " + (serviceClass != null ? serviceClass.getName() : "null");
            log.error(METHOD_NAME, msg, cce);
        } catch (BeansException be) {
            String msg = "Errore tecnico: Errore nel reperimento del Bean di Spring: " + (serviceClass != null ? serviceClass.getName() : "null") + " " + be.getMessage();
            log.error(METHOD_NAME, msg, be);
        }

        return service;
    }
}
