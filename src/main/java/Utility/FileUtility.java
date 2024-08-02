package Utility;

import java.io.FileInputStream;
import java.util.Properties;

public class FileUtility {
    public String getDataFromPropertiesFile(String key) throws Exception {
        FileInputStream fs = new FileInputStream("C:\\Users\\ADMIN\\Downloads\\ADVSelFiles\\firststeps.properties");
        Properties props = new Properties();
        props.load(fs);
        String data = props.getProperty(key);

        return data;
    }
}
