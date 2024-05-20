package service;

import io.cucumber.messages.internal.com.google.gson.JsonObject;
import io.restassured.response.Response;
import support.enums.ApiBaseUri;
import support.enums.ApiPath;
import support.enums.bodyRequest;
import support.enums.bodyRequest;
import support.utils.RestContext;
import support.utils.Stub;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import static io.cucumber.messages.internal.com.google.gson.JsonParser.parseString;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

public class catApiService {
    private static String ResponseCat;

    public static String enviarPostCat() {
        RestContext.initRequest();
        RestContext.setPath(ApiBaseUri.API_CAT.getPath(), ApiPath.PATH_API_CAT.getPath());
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        headers.put("x-api-key", "live_4KymEb4IPbxX6a6IhzdRwbc5SciTRhnEG9HbHfOHv41vQPGhL4PTuFCvTuJocdU2");
        RestContext.setHeader(headers);
        RestContext.setBody("{\n" +
                "\"image_id\": \"asf2\",\n" +
                "\"sub_id\": \"my-user-1234\",\n" +
                "\"value\": 1\n" +
                "}");
        RestContext.postRequest();
        ResponseCat = RestContext.getResponse().getBody().asString();
        return ResponseCat;
    }

    public static int enviarPostCatAleatorio() {
        RestContext.initRequest();
        RestContext.setPath(ApiBaseUri.API_CAT.getPath(), ApiPath.PATH_API_CAT.getPath());
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        headers.put("x-api-key", "live_4KymEb4IPbxX6a6IhzdRwbc5SciTRhnEG9HbHfOHv41vQPGhL4PTuFCvTuJocdU2");
        RestContext.setHeader(headers);
        RestContext.setBody(bodyRequest.BODY.getBody());
        RestContext.postRequest();
        Response response = RestContext.getResponse();
        // Parse the response body to extract the value of the "id" field
        JsonObject responseBodyJson = parseString(response.getBody().asString()).getAsJsonObject();
        int id = responseBodyJson.get("id").getAsInt();
        return id;
    }




    public static void validarResponseCatApi() {
        try {
            // Read the JSON schema file
            String schemaPath = "src/main/resources/payloads/CatCreatedResponse.json";
            String schemaContent = new String(Files.readAllBytes(Paths.get(schemaPath)));

            // Get the response and perform JSON schema validation
            Response response = RestContext.getResponse();
            response.then().assertThat().body(matchesJsonSchema(schemaContent));
            response.then().statusCode(201);

            // Print the response
            response.print();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static String enviarGetAllCats() {
        RestContext.initRequest();
        RestContext.setPath(ApiBaseUri.API_CAT.getPath(), ApiPath.PATH_API_CAT.getPath());
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        headers.put("x-api-key", "live_4KymEb4IPbxX6a6IhzdRwbc5SciTRhnEG9HbHfOHv41vQPGhL4PTuFCvTuJocdU2");
        RestContext.setHeader(headers);
        RestContext.getRequest();
        ResponseCat = RestContext.getResponse().getBody().asString();
        return ResponseCat;
    }

    public static void validarResponseCatGetAllApi() {
        Response response = RestContext.getResponse();
        response.then().statusCode(200);
        response.print();
    }

    public static String enviarGetIdCats() {
        int id = enviarPostCatAleatorio();
        RestContext.initRequest();
        RestContext.setPath(ApiBaseUri.API_CAT.getPath(), (ApiPath.PATH_API_CAT_GETID.getPath() + id));
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        headers.put("x-api-key", "live_4KymEb4IPbxX6a6IhzdRwbc5SciTRhnEG9HbHfOHv41vQPGhL4PTuFCvTuJocdU2");
        RestContext.setHeader(headers);
        RestContext.getRequest();
        ResponseCat = RestContext.getResponse().getBody().asString();
        return ResponseCat;
    }

    public static void validarRetornoCatEspecifico() {
        try {
            // Read the JSON schema file
            String schemaPath = "src/main/resources/payloads/CatGetIdCatsResponse.json";
            Response response = RestContext.getResponse();
            String schemaContent = new String(Files.readAllBytes(Paths.get(schemaPath)));
            response.then().assertThat().body(matchesJsonSchema(schemaContent));
            response.then().statusCode(200);

            // Print the response
            response.print();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static String enviardelete() {
        int id = enviarPostCatAleatorio();
        RestContext.initRequest();
        RestContext.setPath(ApiBaseUri.API_CAT.getPath(), (ApiPath.PATH_API_CAT_GETID.getPath() + id));
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        headers.put("x-api-key", "live_4KymEb4IPbxX6a6IhzdRwbc5SciTRhnEG9HbHfOHv41vQPGhL4PTuFCvTuJocdU2");
        RestContext.setHeader(headers);
        RestContext.deleteRequest();
        ResponseCat = RestContext.getResponse().getBody().asString();
        return ResponseCat;
    }

    public static void validarDeleteCatApi() {
        Response response = RestContext.getResponse();
        response.then().statusCode(200);
        response.print();
    }


    public static String enviarPut() {
        new Stub().startServer();
        int id = enviarPostCatAleatorio();
        RestContext.initRequest();
        RestContext.setPath(ApiBaseUri.API_CAT_MOCK.getPath(), (ApiPath.PATH_CAT_STUB.getPath() + id));
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        headers.put("x-api-key", "live_4KymEb4IPbxX6a6IhzdRwbc5SciTRhnEG9HbHfOHv41vQPGhL4PTuFCvTuJocdU2");
        RestContext.setHeader(headers);
        RestContext.setBody(bodyRequest.BODY_WIREGET.getBody());
        RestContext.putRequest();
        ResponseCat = RestContext.getResponse().getBody().asString();
        return ResponseCat;
    }

    public static void validarResponseCatPutApi() {
        try {
            // Read the JSON schema file
            String schemaPath = "src/main/resources/payloads/CatPutCatsResponse.json";
            Response response = RestContext.getResponse();
            String schemaContent = new String(Files.readAllBytes(Paths.get(schemaPath)));
            response.then().assertThat().body(matchesJsonSchema(schemaContent));
            response.then().statusCode(200);

            // Print the response
            response.print();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String enviarGetIdInexistente() {
        int id = enviarPostCatAleatorio();
        int idFicticio = id + 1;
        RestContext.initRequest();
        RestContext.setPath(ApiBaseUri.API_CAT.getPath(), (ApiPath.PATH_API_CAT_GETID.getPath() + id + idFicticio));
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        headers.put("x-api-key", "live_4KymEb4IPbxX6a6IhzdRwbc5SciTRhnEG9HbHfOHv41vQPGhL4PTuFCvTuJocdU2");
        RestContext.setHeader(headers);
        RestContext.getRequest();
        ResponseCat = RestContext.getResponse().getBody().asString();
        return ResponseCat;
    }

    public static void ValidarGetIdInexistente() {
        Response response = RestContext.getResponse();
        response.then().statusCode(404);
        response.print();
    }
}
