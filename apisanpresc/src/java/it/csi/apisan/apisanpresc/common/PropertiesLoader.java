/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.common;

import it.csi.apisan.apisanpresc.util.LogUtil;

import java.io.IOException;
import java.util.Properties;

public class PropertiesLoader {

    private static PropertiesLoader instance;
    private        LogUtil          _log        = new LogUtil(this.getClass());
    private        Properties       _properties = null;

    private PropertiesLoader() {
        _properties = new Properties();
        try {
            _properties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("it/csi/apisan/apisanpresc/apisanpresc.properties"));
        } catch (IOException e) {
            _log.error("PropertiesLoader()", e.getMessage(), e);
        }
    }

    private synchronized  static void createInstance() {
        if (instance == null) {
            instance = new PropertiesLoader();
        }
    }

    public static PropertiesLoader getInstance() {
        if (instance == null) {
            createInstance();
        }
        return instance;
    }

    public String getProperty(String key) {
        String result = null;
        if (key != null && !key.trim().isEmpty()) {
            result = this._properties.getProperty(key);
        }
        return result;
    }
}
