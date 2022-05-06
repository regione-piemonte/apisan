/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesen.business.apisanesen;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;


import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.PropertyNamingStrategy;


@Provider
@Produces(MediaType.APPLICATION_JSON)
public class JacksonConfig implements ContextResolver<ObjectMapper> {



    private ObjectMapper objectMapper;

    public JacksonConfig() throws Exception {
        this.objectMapper = new ObjectMapper();
        
        this.objectMapper.configure(org.codehaus.jackson.map.SerializationConfig.Feature.WRITE_DATES_AS_TIMESTAMPS, false);
        this.objectMapper.setPropertyNamingStrategy(PropertyNamingStrategy.CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES);
        
        // sample to convert any DateTime to readable timestamps
        //this.objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, true);
    }
    
    public ObjectMapper getContext(Class<?> objectType) {
        return objectMapper;
    }
}