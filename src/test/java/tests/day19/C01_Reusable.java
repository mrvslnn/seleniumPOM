package tests.day19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Set;

public class C01_Reusable {
@Test
    public void test(){
    //https://the-internet.herokuapp.com/windows adresine gidelim
    //click here yazısına basalım
    //hatırlayalım lk once 1.handlesini alıp sonra2.yı alıp birinci degilse 2dır dıyorduk
    //hatta asagıda yaptık
    //yeni sayfada new window yazısnın gorundugunu test edelim
    Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
    String ilkSayfaHandle=Driver.getDriver().getWindowHandle();
    Driver.getDriver().findElement(By.linkText("Click Here")).click();
    Set<String> windowHandle= Driver.getDriver().getWindowHandles();
    String ikinciSayfaHandle="";
    for (String each: windowHandle) {
       if (!each.equals(ilkSayfaHandle)){
           ikinciSayfaHandle=each;
       }
    }

Driver.getDriver().switchTo().window(ikinciSayfaHandle);
    System.out.println(Driver.getDriver().getTitle());
    //yeni sayfada new window yazısının gorundugunu test edin
    WebElement  newWindowYazi=Driver.getDriver().findElement(By.tagName("h3"));
    Assert.assertTrue(newWindowYazi.isDisplayed());
Driver.closeDriver();

}
    @Test
    public void testReusableIle(){
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        Driver.getDriver().findElement(By.linkText("Click Here")).click();
        ReusableMethods.switchToWindow("New Window");
        WebElement newWindowYaziElementi=Driver.getDriver().findElement(By.tagName("h3"));
        Assert.assertTrue(newWindowYaziElementi.isDisplayed());
        ReusableMethods.waitFor(5);
        Driver.closeDriver();
    }
}

