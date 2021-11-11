package tests.day14;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ConcortPage;
import utilities.TestBase;

public class C01_ConcortLoginHotelPositiveTest extends TestBase {
    /*
    * 1 ) Bir Class olustur : PositiveTest
2) Bir test method olustur positiveLoginTest()
 https://www.concorthotel.com/ adresine git
 login butonuna bas
 test data username: manager ,
 test data password : Manager1!
 Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
    * */
    @Test
    public void positiveLoginTest(){

            this.driver.get("https://www.concorthotel.com/");
            ConcortPage concortHotelPage = new ConcortPage(this.driver);
            concortHotelPage.ilkLoginLinki.click();
            concortHotelPage.usernameKutusu.sendKeys(new CharSequence[]{"manager"});
            concortHotelPage.passwordKutusu.sendKeys(new CharSequence[]{"Manager1!"});
            concortHotelPage.loginKutusu.click();
            Assert.assertTrue(concortHotelPage.basariliGirisYaziElementi.isDisplayed());
        }
}
