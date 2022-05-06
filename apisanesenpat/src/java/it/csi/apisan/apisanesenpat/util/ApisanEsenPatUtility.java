/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesenpat.util;

import it.csi.apisan.apisanesenpat.middleware.MiddlewareInvocation;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.web.util.UriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;

public class ApisanEsenPatUtility {


    //Return full URL from HttpServletRequest
    public static URI getFullURL(HttpServletRequest request, String stratoGialloEndpoint, String stratoGialloEndBasePath, String stratoGialloElencoServiziAttivi) throws URISyntaxException {
        final String requestUrl    = request.getRequestURL().toString();
        final String queryString   = request.getQueryString();
        final String newRequestURL = stratoGialloEndpoint + stratoGialloEndBasePath + requestUrl.split("/cittadini")[1];

        if (queryString == null) {
            return new URI(newRequestURL);
        } else {
            return UriComponentsBuilder.fromUriString(newRequestURL).query(queryString).build(true).toUri();
        }
    }

    public static String getBody(HttpServletRequest request) throws IOException {

        String         body           = null;
        StringBuilder  stringBuilder  = new StringBuilder();
        BufferedReader bufferedReader = null;

        try {
            InputStream inputStream = request.getInputStream();
            if (inputStream != null) {
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                char[] charBuffer = new char[128];
                int    bytesRead  = -1;
                while ((bytesRead = bufferedReader.read(charBuffer)) > 0) {
                    stringBuilder.append(charBuffer, 0, bytesRead);
                }
            } else {
                stringBuilder.append("");
            }
        } catch (IOException ex) {
            throw ex;
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException ex) {
                    throw ex;
                }
            }
        }

        body = stringBuilder.toString();
        return body;
    }

    public static byte[] getPayloadAsBytes(MiddlewareInvocation middlewareInvocation, ObjectMapper objectMapper) throws IOException {
        byte[] result = new byte[0];

        if (middlewareInvocation.getPayload() != null) {
            result = objectMapper.writeValueAsBytes(middlewareInvocation.getPayload());
        }

        if (middlewareInvocation.getPayload1() != null) {
            result = objectMapper.writeValueAsBytes(middlewareInvocation.getPayload1());
        }

        if (middlewareInvocation.getPayload2() != null) {
            result = objectMapper.writeValueAsBytes(middlewareInvocation.getPayload2());
        }

        if (middlewareInvocation.getPayload3() != null) {
            result = objectMapper.writeValueAsBytes(middlewareInvocation.getPayload3());
        }

        if (middlewareInvocation.getPayload4() != null) {
            result = objectMapper.writeValueAsBytes(middlewareInvocation.getPayload4());
        }

        return result;
    }

    public static String getPayloadAsString(MiddlewareInvocation middlewareInvocation, ObjectMapper objectMapper) throws IOException {
        String result = "";

        if (middlewareInvocation.getPayload() != null) {
            result = objectMapper.writeValueAsString(middlewareInvocation.getPayload());
        }

        if (middlewareInvocation.getPayload1() != null) {
            result = objectMapper.writeValueAsString(middlewareInvocation.getPayload1());
        }

        if (middlewareInvocation.getPayload2() != null) {
            result = objectMapper.writeValueAsString(middlewareInvocation.getPayload2());
        }

        if (middlewareInvocation.getPayload3() != null) {
            result = objectMapper.writeValueAsString(middlewareInvocation.getPayload3());
        }

        if (middlewareInvocation.getPayload4() != null) {
            result = objectMapper.writeValueAsString(middlewareInvocation.getPayload4());
        }

        return result;
    }

}
