/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesenpat.middleware.converters;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJacksonValue;

import java.io.IOException;

public class CustomJsonConverter extends AbstractCustomJackson2HttpMessageConverter {

    private String jsonPrefix;


    public CustomJsonConverter(ObjectMapper objectMapper) {
        super(objectMapper, new MediaType[]{new MediaType("application", "json", DEFAULT_CHARSET), new MediaType("application", "*+json", DEFAULT_CHARSET)});
    }

    public void setJsonPrefix(String jsonPrefix) {
        this.jsonPrefix = jsonPrefix;
    }

    public void setPrefixJson(boolean prefixJson) {
        this.jsonPrefix = prefixJson ? "{} && " : null;
    }

    protected void writePrefix(JsonGenerator generator, Object object) throws IOException {
        if (this.jsonPrefix != null) {
            generator.writeRaw(this.jsonPrefix);
        }

        String jsonpFunction = object instanceof MappingJacksonValue ? ((MappingJacksonValue)object).getJsonpFunction() : null;
        if (jsonpFunction != null) {
            generator.writeRaw(jsonpFunction + "(");
        }

    }

    protected void writeSuffix(JsonGenerator generator, Object object) throws IOException {
        String jsonpFunction = object instanceof MappingJacksonValue ? ((MappingJacksonValue)object).getJsonpFunction() : null;
        if (jsonpFunction != null) {
            generator.writeRaw(");");
        }

    }


}
