package st.util;

import java.util.Map;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.typesafe.config.ConfigFactory;

public class BaseConfig{
    private static final ObjectMapper MAPPER = buildMapper();
    private static final Map<String, Object> unwrappedConfig = ConfigFactory.load().root().unwrapped();
    private static final BaseConfig CONFIG = buildConfSingleton(unwrappedConfig);

    private String baseUrl;

    /**
     * @return the baseUrl
     */
    public String getBaseUrl() {
        return baseUrl;
    }

    /**
     * @return the config
     */
    public static BaseConfig getConfig() {
        return CONFIG;
    }

    private static ObjectMapper buildMapper(){
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return mapper;
    }

    private static BaseConfig buildConfSingleton(Map<String, Object> unwrappedConfig){
        return MAPPER.convertValue(unwrappedConfig, BaseConfig.class);
    }
}