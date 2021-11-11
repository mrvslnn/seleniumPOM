package tests.day14;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.TestBase;

public class C04_AmazonConfigReader extends TestBase {
    @Test
    public void test(){
        //amazon sayafasına git
        //nutella icin arama yapın
        //sonuc sayısını yazdırın ve sonuc yazısın nutella
        //icerdigini test edin

    driver.get(ConfigReader.getProperty("amazonUrl"));
        AmazonPage amazonPage=new AmazonPage(driver);
        amazonPage.aramaKutusu.sendKeys(ConfigReader.getProperty("amazonaranankelime"));
        System.out.println(amazonPage.sonucYazisiElementi.getText());
        Assert.assertTrue(amazonPage.sonucYazisiElementi.getText().contains(ConfigReader.getProperty("amazonaranankelime")));



    }
    }

