/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.impl.base.service.rest;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.ws.rs.FormParam;

import org.springframework.context.annotation.Configuration;

import okhttp3.ConnectionPool;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

//@Configuration
public class OkHttpClientImpl {

    public static final MediaType JSON
            = MediaType.parse("application/json; charset=utf-8");

    //private final Logger logger = LoggerFactory.getLogger(OkHttpClientImpl.class);

    private OkHttpClient client;

    public OkHttpClientImpl() {
        ConnectionPool connectionPool = new ConnectionPool(5, 5, TimeUnit.SECONDS);
        client = new OkHttpClient.Builder()
                .readTimeout(1000, TimeUnit.MILLISECONDS)
                .connectTimeout(1000, TimeUnit.MILLISECONDS)
                .connectionPool(connectionPool)
                .retryOnConnectionFailure(false)
                .build();
    }
/*
    @Override
    public String get(String url) throws HttpRequestException {
        Request request = createGetRequest(url);
        Response response = execute(request);
        try {
            return convertResponseBodyToString(response.body());
        }catch (IOException e) {
            logger.error("OkHttp getAsBytes error", e);
            throw new HttpRequestException("OkHttp getAsBytes error", e);
        }
    }

    @Override
    public byte[] getBytes(String url) throws HttpRequestException {

        Request request = createGetRequest(url);
        Response response = execute(request);

        try {
            return convertResponseBodyToBytes(response.body());
        } catch (IOException e) {
            logger.error("OkHttp getAsBytes error", e);
            throw new HttpRequestException("OkHttp getAsBytes error", e);
        }
    }

    @Override
    public String postWithForm(String url, List<FormParam> params) throws HttpRequestException {
        Request request = createPostForm(url, params);
        Response response = execute(request);
        try {
            return convertResponseBodyToString(response.body());
        }catch (IOException e) {
            logger.error("OkHttp postWithForm error", e);
            throw new HttpRequestException("OkHttp postWithForm error", e);
        }
    }

    @Override
    public byte[] postWithFormBytes(String url, List<FormParam> params) throws HttpRequestException {
        Request request = createPostForm(url, params);
        Response response = execute(request);
        try {
            return convertResponseBodyToBytes(response.body());
        }catch (IOException e) {
            logger.error("OkHttp postWithForm error", e);
            throw new HttpRequestException("OkHttp postWithForm error", e);
        }
    }

    @Override
    public String postWithBody(String url, String json) throws HttpRequestException {
        Request request = createPostBody(url, json);
        Response response = execute(request);
        try {
            return convertResponseBodyToString(response.body());
        }catch (IOException e) {
            logger.error("OkHttp getAsBytes error", e);
            throw new HttpRequestException("OkHttp getAsBytes error", e);
        }
    }

    @Override
    public byte[] postWithBodyBytes(String url, String json) throws HttpRequestException {
        Request request = createPostBody(url, json);
        Response response = execute(request);
        try {
            return convertResponseBodyToBytes(response.body());
        } catch (IOException e) {
            logger.error("OkHttp postAsBytes error", e);
            throw new HttpRequestException("OkHttp postAsBytes error", e);
        }
    }

    private Response execute(Request request) throws HttpRequestException {
        try{
            return client.newCall(request).execute();
        }catch (Exception e){
            logger.error("OkHttp post error", e);
            throw new HttpRequestException("OkHttp post error", e);
        }
    }
*/
    private String convertResponseBodyToString(ResponseBody responseBody) throws IOException {
        if(responseBody!=null){
            return responseBody.string();
        }
        return null;
    }

    private byte[] convertResponseBodyToBytes(ResponseBody responseBody) throws IOException {
        if(responseBody!=null){
            return responseBody.bytes();
        }
        return null;
    }

/*    private Request createPostForm(String url, List<FormParam> params){
        FormBody.Builder builder = new FormBody.Builder();
        for(FormParam param : params){
            builder.addEncoded(param.getName(), param.getValue());
        }
        Request request = new Request.Builder()
                .url(url)
                .post(builder.build())
                .build();

        return request;
    }
*/
    
    /*private Request createPostBody(String url, String json){
        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();

        return request;
    }

    private Request createGetRequest(String url){
        Request request = new Request.Builder()
                .url(url)
                .build();

        return request;
    }*/
}