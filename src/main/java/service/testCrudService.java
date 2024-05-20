//package service;
//
//import io.cucumber.messages.internal.com.google.gson.JsonObject;
//import io.cucumber.messages.internal.com.google.gson.JsonParser;
//import io.restassured.response.Response;
//import org.junit.Assert;
//import support.enums.ApiBaseUri;
//import support.enums.ApiPath;
//import support.enums.bodyRequest;
//import support.utils.RestContext;
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.HashMap;
//import java.util.Map;
//
//import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
//
//public class testCrudService {
//    static String response;
//    public static String get_All_Filmes() {
//        RestContext.initRequest();
//        RestContext.setPath(ApiBaseUri.API_LIVROS.getPath(), ApiPath.PATH_FILME.getPath());
//        Map<String, String> headers = new HashMap<>();
//        headers.put("Content-Type", "application/json");
//        RestContext.setHeader(headers);
//        RestContext.getRequest();
//        response = RestContext.getResponse().getBody().asString();
//        return response;
//    }
//
//    public static String get_Id_Filmes() {
//        RestContext.initRequest();
//        RestContext.setPath(ApiBaseUri.API_LIVROS.getPath(), ApiPath.PATH_FIRST_FILME.getPath());
//        Map<String, String> headers = new HashMap<>();
//        headers.put("Content-Type", "application/json");
//        RestContext.setHeader(headers);
//        RestContext.getRequest();
//        response = RestContext.getResponse().getBody().asString();
//        return response;
//    }
//
//    public static void ValidarRetornoListaFilmes() {
//        Response response = RestContext.getResponse();
//        response.then().statusCode(200);
//        response.print();
//    }
//
//    public static void ValidarRetornoFilmeEspecifico() throws IOException {
//        try {
//            // Read the JSON schema file
//            String schemaPath = "src/main/resources/payloads/FilmeBodyResponse.json";
//            String schemaContent = new String(Files.readAllBytes(Paths.get(schemaPath)));
//
//            // Get the response and perform JSON schema validation
//            Response response = RestContext.getResponse();
//            response.then().assertThat().body(matchesJsonSchema(schemaContent));
//            response.then().statusCode(200);
//
//            // Print the response
//            response.print();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public static String post_Filmes() {
//        RestContext.initRequest();
//        RestContext.setPath(ApiBaseUri.API_LIVROS.getPath(), ApiPath.PATH_POST_FILME.getPath());
//        Map<String, String> headers = new HashMap<>();
//        headers.put("Content-Type", "application/json");
//        RestContext.setHeader(headers);
//        RestContext.setBody("{\n" +
//                "    \"codigo\": 4,\n" +
//                "    \"nome\": \"Renato Barros\",\n" +
//                "    \"sinopse\": \"Create Teste Integrado end to end QA Post\",\n" +
//                "    \"faixaEtaria\": 16,\n" +
//                "    \"genero\": \"Drama\"\n" +
//                "}");
//        RestContext.postRequest();
//        response = RestContext.getResponse().getBody().asString();
//        return response;
//    }
//
//    public static void ValidarRetornoFilmecriado() {
//        try {
//            // Read the JSON schema file
//            String schemaPath = "src/main/resources/payloads/FilmeCriadoResponse.json";
//            String schemaContent = new String(Files.readAllBytes(Paths.get(schemaPath)));
//
//            // Get the response and perform JSON schema validation
//            Response response = RestContext.getResponse();
//            response.then().assertThat().body(matchesJsonSchema(schemaContent));
//            response.then().statusCode(201);
//
//            // Print the response
//            response.print();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public static String delete_filme() {
//        RestContext.initRequest();
//        RestContext.setPath(ApiBaseUri.API_LIVROS.getPath(), ApiPath.PATH_DELETE_FILME.getPath());
//        Map<String, String> headers = new HashMap<>();
//        headers.put("Content-Type", "application/json");
//        RestContext.setHeader(headers);
//        RestContext.deleteRequest();
//        response = RestContext.getResponse().getBody().asString();
//        return response;
//    }
//
//    public static void ValidarStatusCodeFilmeDeletado() {
//        Response response = RestContext.getResponse();
//        response.then().statusCode(200);
//        response.print();
//    }
//    public static String post_filme_aleatorio(){
//
//        RestContext.initRequest();
//        RestContext.setPath(ApiBaseUri.API_LIVROS.getPath(), ApiPath.PATH_POST_FILME.getPath());
//        Map<String, String> headers = new HashMap<>();
//        headers.put("Content-Type", "application/json");
//        RestContext.setHeader(headers);
//        RestContext.setBody(bodyRequest.BODY.getBody());
//        RestContext.postRequest();
//        response = RestContext.getResponse().getBody().asString();
//        JsonObject jsonObject = JsonParser.parseString(response).getAsJsonObject();
//        int codigoValue = jsonObject.get("codigo").getAsInt();
//        String postFilmeAleatorio = String.valueOf(codigoValue);
//        return postFilmeAleatorio;
//    }
//    public static String patch_Filme() {
//
//        String codigo = post_filme_aleatorio();
//        RestContext.initRequest();
//        RestContext.setPath(ApiBaseUri.API_LIVROS.getPath(), (ApiPath.PATH_PATCH_FILME.getPath() + codigo));
//        Map<String, String> headers2 = new HashMap<>();
//        headers2.put("Content-Type", "application/json");
//        RestContext.setHeader(headers2);
//        RestContext.setBody("{\n" +
//                "    \"sinopse\": \"PATCH Teste Integrado end to end QA\",\n" +
//                "    \"faixaEtaria\": 18\n" +
//                "}");
//        RestContext.patchRequest();
//        response = RestContext.getResponse().getBody().asString();
//        return response;
//    }
//
//    public static void ValidarRetornoFilmePAtch() {
//        JsonObject jsonObject = JsonParser.parseString(String.valueOf(response)).getAsJsonObject();
//        String sinopseValue = jsonObject.get("sinopse").getAsString();
//        int responseCode = response.hashCode();
//        Assert.assertEquals("PATCH Teste Integrado end to end QA", sinopseValue);
//    }
//
//    public static String put_filmes() {
//        String filmeCriadoParaPut = post_filme_aleatorio();
//        RestContext.initRequest();
//        RestContext.setPath(ApiBaseUri.API_LIVROS.getPath(), (ApiPath.PATH_PUT_FILME.getPath() + filmeCriadoParaPut));
//        Map<String, String> headers3 = new HashMap<>();
//        headers3.put("Content-Type", "application/json");
//        RestContext.setHeader(headers3);
//        RestContext.setBody("{\n" +
//                "    \"codigo\": " + filmeCriadoParaPut + ",\n" +
//                "    \"nome\": \"TesteFilmeDrama\",\n" +
//                "    \"sinopse\": \"Teste QA End to End via Put\",\n" +
//                "    \"faixaEtaria\": 16,\n" +
//                "    \"genero\": \"DRAMA2\"\n" +
//                "}");
//        RestContext.putRequest();
//        response = RestContext.getResponse().getBody().asString();
//        return response;
//    }
//
//    public static void ValidarFilmeAtualizadoPut() {
//        JsonObject jsonObject = JsonParser.parseString(String.valueOf(response)).getAsJsonObject();
//
//// Extract values of all fields
//        String nomeValue = jsonObject.get("nome").getAsString();
//        String sinopseValue = jsonObject.get("sinopse").getAsString();
//        String faixaEtariaValue = jsonObject.get("faixaEtaria").getAsString();
//        String generoValue = jsonObject.get("genero").getAsString();
//
//// Assert each field value
//        Assert.assertEquals("TesteFilmeDrama", nomeValue);
//        Assert.assertEquals("Teste QA End to End via Put", sinopseValue);
//        Assert.assertEquals("16", faixaEtariaValue);
//        Assert.assertEquals("DRAMA2", generoValue);
//
//    }
//}
