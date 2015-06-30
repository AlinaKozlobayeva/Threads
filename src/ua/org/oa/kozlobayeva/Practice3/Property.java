package ua.org.oa.kozlobayeva.Practice3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Alinka on 01.04.2015.
 */
public class Property {
    private Properties prop;
    private final String propFileName = "config.properties";

    public String getProp(String key) {
        if(prop == null) {
            try {
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
            if (inputStream != null) {
                prop = new Properties();
                    prop.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return prop.getProperty(key);
    }

}
