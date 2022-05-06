/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesenpat.middleware.converters;

import org.codehaus.jackson.JsonEncoding;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.codehaus.jackson.type.JavaType;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.GenericHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.util.Assert;
import org.springframework.util.ClassUtils;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.concurrent.atomic.AtomicReference;

public abstract class AbstractCustomJackson2HttpMessageConverter extends AbstractHttpMessageConverter<Object> implements GenericHttpMessageConverter<Object> {

    public static final Charset      DEFAULT_CHARSET = Charset.forName("UTF-8");
    protected           ObjectMapper objectMapper;
    private             Boolean      prettyPrint = false;

    // Check for Jackson 2.3's overloaded canDeserialize/canSerialize variants with cause reference
    private static final boolean jackson23Available = ClassUtils.hasMethod(ObjectMapper.class,
            "canDeserialize", JavaType.class, AtomicReference.class);


    protected AbstractCustomJackson2HttpMessageConverter(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    protected AbstractCustomJackson2HttpMessageConverter(ObjectMapper objectMapper, MediaType supportedMediaType) {
        super(supportedMediaType);
        this.objectMapper = objectMapper;
    }

    protected AbstractCustomJackson2HttpMessageConverter(ObjectMapper objectMapper, MediaType... supportedMediaTypes) {
        super(supportedMediaTypes);
        this.objectMapper = objectMapper;
    }

    /********************/
    public void setObjectMapper(ObjectMapper objectMapper) {
        Assert.notNull(objectMapper, "ObjectMapper must not be null");
        this.objectMapper = objectMapper;
        configurePrettyPrint();
    }

    public ObjectMapper getObjectMapper() {
        return this.objectMapper;
    }

    public void setPrettyPrint(boolean prettyPrint) {
        this.prettyPrint = prettyPrint;
        configurePrettyPrint();
    }

    private void configurePrettyPrint() {
        if (this.prettyPrint != null && this.prettyPrint) {
            this.objectMapper.enable(SerializationConfig.Feature.INDENT_OUTPUT);
        }
    }

    @Override protected boolean supports(Class<?> clazz) {
        return true;
    }

    @Override protected Object readInternal(Class<?> clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        JavaType javaType = this.getJavaType(clazz, (Class)null);
        return this.readJavaType(javaType, inputMessage);
    }

    @Override protected void writeInternal(Object object, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
        JsonEncoding  encoding  = this.getJsonEncoding(outputMessage.getHeaders().getContentType());
        JsonGenerator generator = this.objectMapper.getJsonFactory().createJsonGenerator(outputMessage.getBody(), encoding);

        try {
            this.writePrefix(generator, object);
            Class<?> serializationView = null;
            Object   value             = object;
            if (object instanceof MappingJacksonValue) {
                MappingJacksonValue container = (MappingJacksonValue) object;
                value             = container.getValue();
                serializationView = container.getSerializationView();
            }

            if (serializationView != null) {
                this.objectMapper.writerWithView(serializationView).writeValue(generator, value);
            } else {
                this.objectMapper.writeValue(generator, value);
            }

            this.writeSuffix(generator, object);
            generator.flush();
        } catch (JsonProcessingException processingEx) {
            throw new HttpMessageNotWritableException("Could not write content: " + processingEx.getMessage(), processingEx);
        }
    }

    protected void writePrefix(JsonGenerator generator, Object object) throws IOException {
    }
    protected void writeSuffix(JsonGenerator generator, Object object) throws IOException {
    }

    @Override public boolean canRead(Type type, Class<?> contextClass, MediaType mediaType) {
        JavaType javaType = getJavaType(type, contextClass);
        if (!jackson23Available || !logger.isWarnEnabled()) {
            return (this.objectMapper.canDeserialize(javaType) && canRead(mediaType));
        }
        AtomicReference<Throwable> causeRef = new AtomicReference<Throwable>();
        if (this.objectMapper.canDeserialize(javaType) && canRead(mediaType)) {
            return true;
        }
        Throwable cause = causeRef.get();
        if (cause != null) {
            String msg = "Failed to evaluate deserialization for type " + javaType;
            if (logger.isDebugEnabled()) {
                logger.warn(msg, cause);
            } else {
                logger.warn(msg + ": " + cause);
            }
        }
        return false;
    }

    @Override public Object read(Type type, Class<?> contextClass, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        JavaType javaType = this.getJavaType(type, contextClass);
        return this.readJavaType(javaType, inputMessage);
    }

    private Object readJavaType(JavaType javaType, HttpInputMessage inputMessage) {
        try {
            return this.objectMapper.readValue(inputMessage.getBody(), javaType);
        } catch (IOException var4) {
            throw new HttpMessageNotReadableException("Could not read JSON: " + var4.getMessage(), var4);
        }
    }

    protected JavaType getJavaType(Type type, Class<?> contextClass) {
        return this.objectMapper.getTypeFactory().constructType(type, contextClass);
    }

    protected JsonEncoding getJsonEncoding(MediaType contentType) {
        if (contentType != null && contentType.getCharSet() != null) {
            Charset        charset = contentType.getCharSet();
            JsonEncoding[] var3    = JsonEncoding.values();
            int            var4    = var3.length;

            for (int var5 = 0; var5 < var4; ++var5) {
                JsonEncoding encoding = var3[var5];
                if (charset.name().equals(encoding.getJavaName())) {
                    return encoding;
                }
            }
        }

        return JsonEncoding.UTF8;
    }
}
