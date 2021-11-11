package tests.day13;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import pages.FacebookPage;
import utilities.TestBase;

public class C02_pagesFacebook extends TestBase {
//1 - https://www.facebook.com/ adresine gidin
//2- POM’a uygun olarak email, sifre kutularini
//    ve giris yap butonunu locate edin
@Test
public void test() throws InterruptedException {
    driver.get("https://www.facebook.com");
    FacebookPage facebookPage=new FacebookPage(driver);
    //facebookPage.cookiesGec();
    //2- POM’a uygun olarak email, sifre kutularini
//    ve giris yap butonunu locate edin
//kullanıcı adı techproedu
    facebookPage.mailkutusu.sendKeys("techproed@gmail.com");
    //sifre 12345
    facebookPage.passwordKutusu.sendKeys("12345");
    //yazdıgınızda giris yapamadıgınızı test edın
    Thread.sleep(1000);
facebookPage.LoginTusu.click();
    Assert.assertTrue(facebookPage.girilmedi.isDisplayed());
    }
}


