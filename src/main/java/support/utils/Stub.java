package support.utils;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;

public class Stub {
    private static WireMockServer wireMockServer;

    public static void startServer() {
        wireMockServer = new WireMockServer(options().port(8089));
        wireMockServer.start();
        configureStubs();
    }

    public static void stopServer() {
        if (wireMockServer != null) {
            wireMockServer.stop();
        }
    }

    private static void configureStubs() {
        // Ajuste para lidar com requisições PUT
        wireMockServer.stubFor(put(urlMatching("/catsficticios/\\d{7}"))
                .willReturn(createResponse()));
    }

    private static ResponseDefinitionBuilder createResponse() {
        String responseBody = "{\n" +
                "  \"id\": 1234567,\n" +
                "  \"user_id\": \"user123\",\n" +
                "  \"image_id\": \"img123\",\n" +
                "  \"sub_id\": \"sub123\",\n" +
                "  \"created_at\": \"2023-01-01T00:00:00Z\",\n" +
                "  \"value\": 1,\n" +
                "  \"country_code\": \"BR\",\n" +
                "  \"image\": {\n" +
                "    \"url\": \"http://example.com/image.jpg\",\n" +
                "    \"width\": 800,\n" +
                "    \"height\": 600\n" +
                "  }\n" +
                "}";

        return aResponse()
                .withStatus(200)
                .withHeader("Content-Type", "application/json")
                .withHeader("x-api-key", "live_4KymEb4IPbxX6a6IhzdRwbc5SciTRhnEG9HbHfOHv41vQPGhL4PTuFCvTuJocdU2")
                .withBody(responseBody);
    }
}