package tests.day14;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ConcortPage;
import utilities.TestBase;

public class C02_ConcortHotelNegativeTest extends TestBase {

    @Test
    public void test() {
        /*
         * Bir test method olustur NegativeLoginTest()
         *  https://www.concorthotel.com/ adresine git
         *  login butonuna bas
         *  test data username: manager1 ,
         *  test data password : manager1!
         *  Degerleri girildiginde sayfaya girilemedigini test et
         */
driver.get("https://www.concorthotel.com/ ");
        ConcortPage concortPage=new ConcortPage(driver);
//	login butonuna bas
        concortPage.ilkLoginLinki.click();
        //	test data username: manager1 ,
        concortPage.usernameKutusu.sendKeys("manager1");
        //	test data password : manager1!
        concortPage.passwordKutusu.sendKeys("manager1!");
        concortPage.login.click();
        //	Degerleri girildiginde sayfaya girilemedigini test et
        Assert.assertTrue(concortPage.loginFailedYazisi.isDisplayed());

    }
}