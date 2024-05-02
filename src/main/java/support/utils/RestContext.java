package support.utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.Map;

public class RestContext {
    private static RequestSpecification request;
    private static Response response;

    public static void initRequest(){
        RestAssured.useRelaxedHTTPSValidation();
        request = RestAssured.given();
    }

    public static void setPath(String baseUri, String path){
        if (request == null) {
            initRequest();
        }
        RestAssured.useRelaxedHTTPSValidation();
        request.baseUri(baseUri);
        request.basePath(path);
    }

    public static void setHeader(Map<String, String> contentHeader){
        request.headers(contentHeader);
    }

    public static void setParams(Map<String, String> contentParams){
        request.params(contentParams);
    }

    public static void setContent(String value){
        if (request == null); {
            initRequest();
        }
        request.accept(value);
    }

    public static void setBody(String contentBody){
        request.body(contentBody);
    }

    public static void getRequest(){
        response = request.get();
    }

    public static void postRequest(){
        response = request.post();
    }

    public static void putRequest(){
        response = request.put();
    }

    public static void patchRequest(){
        response = request.patch();
    }

    public static void deleteRequest(){
        response = request.delete();
    }

    public static Response getResponse(){
        return response;
    }
}
