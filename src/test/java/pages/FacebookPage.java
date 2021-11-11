package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPage {
    WebDriver driver;
    public FacebookPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }
    @FindBy(id="email")
    public WebElement mailkutusu;

    @FindBy(id="pass")
    public WebElement passwordKutusu;

    @FindBy(name="login")
    public WebElement LoginTusu;

    @FindBy(className="_9ay7")
    public WebElement girilmedi;
//public void cookiesGec(){
//    driver.findElement(By.xpath(""));
}



