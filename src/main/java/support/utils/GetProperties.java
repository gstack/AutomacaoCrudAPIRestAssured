package support.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GetProperties {
    private static final String DATA_CONFIG = "src/main/resources/";
    private static Properties properties;
    public static String getProp(String value) {
        try {
            if (properties == null){

                GetProperties.properties = new Properties();
                GetProperties.properties.load(new FileInputStream(DATA_CONFIG + Enviromments.getEnvironments() + ".properties"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return GetProperties.properties.getProperty(value);
    }
}
