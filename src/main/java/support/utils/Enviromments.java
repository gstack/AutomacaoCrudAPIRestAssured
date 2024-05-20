package support.utils;

public class Enviromments {
    public static String getEnvironments(){
        String environments = System.getProperty("environment");
        if (environments == null) {
            environments = "catApi";
        }
        return environments;
    }
}
