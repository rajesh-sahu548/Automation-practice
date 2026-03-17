package utils;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties prop;

    static {
        try {
            // Path of config.properties file
            FileInputStream fis = new FileInputStream("src/test/resources/config.properties");

            prop = new Properties();

            // Load the properties file
            prop.load(fis);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to get value by key
    public static String getProperty(String key) {
        return prop.getProperty(key);
    }
}