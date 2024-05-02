package support.enums;

import java.util.Random;

public enum bodyRequest {

    BODY(generateBody()),
    BODY_WIREGET("[\n" +
            "    {\n" +
            "        \"codigo\": 1001,\n" +
            "        \"nome\": \"Renato Barros\",\n" +
            "        \"sinopse\": \"Teste Integrado end to end QA\",\n" +
            "        \"faixaEtaria\": 16,\n" +
            "        \"genero\": \"Drama\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"codigo\": 2022,\n" +
            "        \"nome\": \"TesteFilmeTerror\",\n" +
            "        \"sinopse\": \"Teste Integrado end to end QA2\",\n" +
            "        \"faixaEtaria\": 12,\n" +
            "        \"genero\": \"TERROR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"codigo\": 3020,\n" +
            "        \"nome\": \"TesteFilmeDrama\",\n" +
            "        \"sinopse\": \"Teste Integrado end to end QA3\",\n" +
            "        \"faixaEtaria\": 16,\n" +
            "        \"genero\": \"DRAMA2\"\n" +
            "    }");

    private String body;

    bodyRequest(String s) {
        this.body = s;
    }

    public String getBody() {
        return generateBody();
    }

    private static String generateBody() {
        Random random = new Random();
        int codigo = random.nextInt(1000);
        return"{\n" +
                "    \"codigo\": " + codigo + ",\n" +
                "    \"nome\": \"Renato Barros\",\n" +
                "    \"sinopse\": \"Create Teste Integrado end to end QA Post\",\n" +
                "    \"faixaEtaria\": 16,\n" +
                "    \"genero\": \"Drama\"\n" +
                "}";
    }
}
