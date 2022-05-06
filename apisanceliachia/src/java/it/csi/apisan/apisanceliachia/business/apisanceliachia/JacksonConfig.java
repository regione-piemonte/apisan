/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanceliachia.business.apisanceliachia;

import java.util.TimeZone;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.PropertyNamingStrategy;
import org.codehaus.jackson.map.util.StdDateFormat;

@Provider
@Produces(MediaType.APPLICATION_JSON)
public class JacksonConfig implements ContextResolver<org.codehaus.jackson.map.ObjectMapper> {

    private ObjectMapper objectMapper;

    public JacksonConfig() throws Exception {
        this.objectMapper = new ObjectMapper();


        // sample to convert any DateTime to readable timestamps
        this.objectMapper.configure(org.codehaus.jackson.map.SerializationConfig.Feature.WRITE_DATES_AS_TIMESTAMPS, false);
        this.objectMapper.setPropertyNamingStrategy(PropertyNamingStrategy.CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES);

        TimeZone timeZone = TimeZone.getDefault();
        StdDateFormat.getBlueprintISO8601Format().setTimeZone(timeZone);
        StdDateFormat.getBlueprintRFC1123Format().setTimeZone(timeZone);
        
        //this.objectMapper.setDateFormat(new EuropeRomeDateFormat());
    }
    
    public ObjectMapper getContext(Class<?> objectType) {
        return objectMapper;
    }
    
    


}