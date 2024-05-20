package support.enums;

public enum bodyRequest {

    BODY(generateCat()),
    BODY_WIREGET("{\n" +
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
            "}");

    private String body;

    bodyRequest(String s) {
        this.body = s;
    }

    public String getBody() {
        return generateCat();
    }

    private static String generateCat() {
        return "{\n" +
                "\"image_id\": \"asf2\",\n" +
                "\"sub_id\": \"my-user-1234\",\n" +
                "\"value\": 1\n" +
                "}";
    }
}
