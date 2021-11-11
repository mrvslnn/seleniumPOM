package utilities;

import com.beust.jcommander.StringKey;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    //1- properties objesi olusturalım
    //2-bu class ın amacı configuration.properties dosysını
    // okumak ve oradaki keyvalue degerlerine kullanarak
    // istedıgımız key e ait value yu okumak
    //3-test class larında config readre classına ulasıp yukarıdaki islemleri yapamamızı saglyacak bir
    //7method olusturmmızı saglar
    static Properties properties;

    static {
        String dsoyaYolu = "configuration.properties";
        try {
            FileInputStream fileInputStream = new FileInputStream(dsoyaYolu);
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // 3- test class'larindan configReader class'ina ulasip yukaridaki islemleri
    //    yapmamizi saglayacak bir method olusturacagiz
    public static String getProperty(String key){
        String value=properties.getProperty(key);
        return value;
    }}