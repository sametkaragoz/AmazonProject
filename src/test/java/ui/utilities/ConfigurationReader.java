package ui.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    static Properties properties;
    static {
        String filePath = "configuration.properties";

        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(filePath);
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public  static String getProperty(String key) {
        String value = properties.getProperty(key);
        return value;
    }
}
