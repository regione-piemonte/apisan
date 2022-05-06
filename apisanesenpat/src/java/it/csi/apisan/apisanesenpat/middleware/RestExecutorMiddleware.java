/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesenpat.middleware;

import it.csi.apisan.apisanesenpat.middleware.converters.CustomJsonConverter;
import it.csi.apisan.apisanesenpat.middleware.exceptions.MiddlewareException;
import it.csi.apisan.apisanesenpat.util.ApisanEsenPatUtility;
import it.csi.apisan.apisanesenpat.util.LogUtil;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.PropertyNamingStrategy;
import org.codehaus.jackson.map.util.StdDateFormat;
import org.springframework.http.*;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.util.Base64Utils;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.*;

import static it.csi.apisan.apisanesenpat.util.Chain.CHAIN_KO;
import static it.csi.apisan.apisanesenpat.util.Chain.CHAIN_OK;


public class RestExecutorMiddleware extends BaseMiddleware {
    protected static LogUtil log = new LogUtil(RestExecutorMiddleware.class);

    public RestExecutorMiddleware(MiddlewareInvocation middlewareInvocation) {
        super(middlewareInvocation);
    }

    @Override
    boolean executeMiddleware() throws MiddlewareException {

        boolean            result = CHAIN_KO;
        final List<String> whiteListedHeaders;

        // Recupero dati da invocation
        HttpServletRequest  servletRequest  = this.middlewareInvocation.getServletRequest();
        HttpServletResponse servletResponse = this.middlewareInvocation.getServletResponse();
        String              username        = this.middlewareInvocation.getUsername();
        String              password        = this.middlewareInvocation.getPassword();

        // Stuff
        ObjectMapper       objectMapper = getObjectMapperCustom();
        final RestTemplate restTemplate = new RestTemplate();

        //full URL = URL + queryParam
        String stratoGialloEndpoint            = middlewareInvocation.getStratoGialloEndpoint();
        String stratoGialloEndBasePath         = middlewareInvocation.getStratoGialloEndBasePath();
        String stratoGialloElencoServiziAttivi = middlewareInvocation.getStratoGialloElencoServiziAttivi();

        //GET POST PUT..
        HttpMethod method = HttpMethod.valueOf(servletRequest.getMethod());

        //Set Json body
        HttpHeaders            headers        = new HttpHeaders();
        ResponseEntity<String> response       = null;
        ResponseEntity<byte[]> responseAsByte = null;
        whiteListedHeaders = Arrays.asList("shib-identita-codicefiscale", "x-codice-servizio", "x-forwarded-for", "x-request-id");


        try {
            final URI uri = ApisanEsenPatUtility.getFullURL(servletRequest, stratoGialloEndpoint, stratoGialloEndBasePath, stratoGialloElencoServiziAttivi);

            /* Defaults */
            Collection<? extends MediaType> acceptMediaTypes = new HashSet<>();
            // restTemplate.getMessageConverters().clear();
            restTemplate.getMessageConverters().addAll(Arrays.asList(new CustomJsonConverter(objectMapper)));
            Set<MediaType> defaultAcceptMediaTypes = new HashSet<MediaType>(Collections.singletonList(MediaType.APPLICATION_JSON));
            defaultAcceptMediaTypes.addAll(acceptMediaTypes);


            // Add Headers Request
            Enumeration headerNamesReq = servletRequest.getHeaderNames();
            while (headerNamesReq.hasMoreElements()) {
                String headerName  = (String) headerNamesReq.nextElement();
                String headerValue = servletRequest.getHeader(headerName);
                if (whiteListedHeaders.contains(headerName.toLowerCase())) {
                    headers.add(headerName, headerValue);
                }
            }

            // Add basic auth header
            String auth        = username + ":" + password;
            byte[] encodedAuth = Base64Utils.encode(auth.getBytes(StandardCharsets.ISO_8859_1));
            String authHeader  = "Basic " + new String(encodedAuth);
            headers.add("Authorization", authHeader);

            // Force content type json and other headers
            headers.setContentType(MediaType.APPLICATION_JSON);
            // Force content type UTF8
            restTemplate.getMessageConverters()
            .add(0, new StringHttpMessageConverter(StandardCharsets.UTF_8));

            //Get body
            String payloadString = null;
            if ("POST".equalsIgnoreCase(method.toString()) || "PUT".equalsIgnoreCase(method.toString())) {
                payloadString = ApisanEsenPatUtility.getPayloadAsString(this.middlewareInvocation, objectMapper);
            }

            //Set entity
            HttpEntity<Object> entity = payloadString != null ? new HttpEntity<Object>(payloadString, headers) : new HttpEntity<Object>(headers);

            //Log headers
            headers.keySet().stream().forEach(hName -> {
                log.debug("RestExecutorMiddleware", "-------- BEFORE REQ-----------\t" + hName + String.valueOf(headers.get(hName)));
            });

            // Get response
            if (this.middlewareInvocation.getIsPdf()
            		|| this.middlewareInvocation.isZip()) {
                responseAsByte = restTemplate.exchange(uri, method, entity, byte[].class);
                middlewareInvocation.setResponseAsByte(responseAsByte);
                servletResponse.setStatus(responseAsByte.getStatusCode().value());
            } else {
                response = restTemplate.exchange(uri, method, entity, String.class);
                middlewareInvocation.setResponse(response);
                servletResponse.setStatus(response.getStatusCode().value());
            }

            result = CHAIN_OK;

        } catch (HttpClientErrorException e) {
            log.error("HttpClientErrorException", e.getMessage());
            middlewareInvocation.setStatusCodeResponse(e.getStatusCode().value());
            throw new MiddlewareException(e.getStatusCode().value(), e.getResponseBodyAsString(), e.getCause());
        } catch (IOException e) {
            log.error("IOException", e.getMessage());
            throw new MiddlewareException(e.getMessage(), e.getCause());
        } catch (URISyntaxException e) {
            log.error("URISyntaxException", e.getMessage());
            throw new MiddlewareException(e.getMessage(), e.getCause());
        }

        return result;
    }

    private ObjectMapper getObjectMapperCustom() {
        ObjectMapper objectMapper = new ObjectMapper();
        // sample to convert any DateTime to readable timestamps
        objectMapper.configure(org.codehaus.jackson.map.SerializationConfig.Feature.WRITE_DATES_AS_TIMESTAMPS, false);
        objectMapper.setPropertyNamingStrategy(PropertyNamingStrategy.CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES);
        objectMapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        TimeZone timeZone = TimeZone.getDefault();
        StdDateFormat.getBlueprintISO8601Format().setTimeZone(timeZone);
        StdDateFormat.getBlueprintRFC1123Format().setTimeZone(timeZone);

        return objectMapper;
    }


}
