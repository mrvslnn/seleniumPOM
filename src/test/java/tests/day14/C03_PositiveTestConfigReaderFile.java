package tests.day14;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ConcortPage;
import utilities.ConfigReader;
import utilities.TestBase;

public class C03_PositiveTestConfigReaderFile extends TestBase {
@Test
    public  void posotoveTestConfig(){
    driver.get(ConfigReader.getProperty("CHUrl"));
    ConcortPage concortPage=new ConcortPage(driver);
    concortPage.ilkLoginLinki.click();
    concortPage.usernameKutusu.sendKeys(ConfigReader.getProperty("CHValidUsername"));
concortPage.passwordKutusu.sendKeys(ConfigReader.getProperty("CHValidPassword"));
concortPage.login.click();
    Assert.assertTrue(concortPage.basariliGirisYaziElementi.isDisplayed());
}
}
