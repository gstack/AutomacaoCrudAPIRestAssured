//package support.utils;
//
//import com.github.tomakehurst.wiremock.WireMockServer;
//import support.enums.bodyRequest;
//
//import static com.github.tomakehurst.wiremock.client.WireMock.*;
//
//public class Stub {
//    private WireMockServer wireMockServer;
//
//    public void startServer() {
//        wireMockServer = new WireMockServer();
//        wireMockServer.start();
//    }
//
//    public void stopServer() {
//        wireMockServer.stop();
//    }
//
//    public void createStub() {
//        stubFor(get(urlEqualTo("/filmesfictícios"))
//                .willReturn(aResponse()
//                        .withStatus(200)
//                        .withHeader("Content-Type", "application/json")
//                        .withBody(bodyRequest.BODY_WIREGET)));
//    }
//}
