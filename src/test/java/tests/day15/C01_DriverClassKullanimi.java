package tests.day15;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_DriverClassKullanimi {
    @Test

    public static void test(){
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));
        Driver.getDriver().get(ConfigReader.getProperty("CHUrl"));


        //Driver driver=new Driver();
        //driver classında olusturdugumuz cınd prıvate yaptık buarda obje uretemeyız
        Driver.closeDriver();
    }
}
