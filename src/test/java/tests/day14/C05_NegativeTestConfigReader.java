package tests.day14;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import pages.ConcortPage;
import pages.QAConcortPage;
import utilities.ConfigReader;
import utilities.TestBase;

public class C05_NegativeTestConfigReader extends TestBase {
    @Test
    public void test(){
//        https://www.concorthotel.com/ adresine git
//        login butonuna bas
//        test data username: manager1 ,
//                test data password : manager1!
//                Degerleri girildiginde sayfaya girilemedigini test et
        driver.get(ConfigReader.getProperty("CHUrl"));
        QAConcortPage qaConcortPage=new QAConcortPage();
        qaConcortPage.ilkLoginLinki.click();
        qaConcortPage.usernameKutusu.sendKeys(ConfigReader.getProperty("CHValidUsername"));
        qaConcortPage.passwordKutusu.sendKeys(ConfigReader.getProperty("CHValidPasswordd")+ Keys.ENTER);
        qaConcortPage.loginButonu.click();

        Assert.assertTrue(qaConcortPage.loginFailedYazisi.isDisplayed());

    }
}
