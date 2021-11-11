package tests.day13;

import com.github.javafaker.Faker;
import com.github.javafaker.Team;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.TestBase;

public class Homework extends TestBase {
    @Test
    public void test() {
//1 - https://www.facebook.com/ adresine gidin
        driver.get("https://www.facebook.com");
        FacebookPage facebookPage = new FacebookPage(driver);

//2- POM’a uygun olarak email, sifre kutularini
//    ve giris yap butonunu locate edin

        Faker faker = new Faker();
                facebookPage.passwordKutusu.sendKeys(faker.internet().emailAddress());
                facebookPage.mailkutusu.sendKeys(faker.internet().password());
                facebookPage.LoginTusu.click();

//4- Basarili giris yapilamadigini test edin
        Assert.assertTrue(facebookPage.girilmedi.isDisplayed());
    }
}