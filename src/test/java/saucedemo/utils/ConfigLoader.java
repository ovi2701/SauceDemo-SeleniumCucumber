package saucedemo.utils;

import java.util.Properties;

public class ConfigLoader {
    private final Properties properties;
    private static ConfigLoader configLoader;

    private ConfigLoader(){
        String env = System.getProperty("env", "testing");
        switch (env){
            case "testing" -> {
                properties  = PropertyUtils.propertyLoader("src/test/resources/testconfig.properties");
                break;
            }

            case "stage" -> {
                properties  = PropertyUtils.propertyLoader("src/test/resources/stageconfig.properties");
                break;
            }

            default -> {
                throw new IllegalStateException("Invalid environment: " + env);
            }
        }
    }

    public static ConfigLoader getInstance(){
        if(configLoader == null){
            configLoader = new ConfigLoader();
        }
        return configLoader;
    }

    public String getBaseUrl(){
        String prop = properties.getProperty("baseUrl");
        if(prop != null) return prop;
        else throw new RuntimeException("property baseUrl is not specified in the stage_config.properties file");
    }
}
