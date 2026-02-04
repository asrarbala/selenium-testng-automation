package com.asrar.automation.config;

import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties = new Properties();

    static {
        try {
            InputStream input =
                    ConfigReader.class
                            .getClassLoader()
                            .getResourceAsStream("config/config.properties");

            if (input == null) {
                throw new RuntimeException("config.properties not found");
            }

            properties.load(input);

        } catch (Exception e) {
            throw new RuntimeException("Failed to load config.properties", e);
        }
    }

    public static String getBrowser() {
        return properties.getProperty("browser");
    }

    public static String getBaseUrl() {
        return properties.getProperty("baseUrl");
    }

    public static int getImplicitWait() {
        return Integer.parseInt(
                properties.getProperty("implicit.wait")
        );
    }

    public static int getExplicitWait() {
        return Integer.parseInt(
                properties.getProperty("explicit.wait")
        );
    }


    public static boolean isHeadless() {
        return Boolean.parseBoolean(properties.getProperty("headless"));
    }


}
