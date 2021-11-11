package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConcortPage {
    public WebElement login;
    WebDriver driver;
    public ConcortPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }
    @FindBy(
            linkText = "Log in"
    )
    public WebElement ilkLoginLinki;
    @FindBy(
            id = "UserName"
    )
    public WebElement usernameKutusu;
    @FindBy(
            id = "Password"
    )
    public WebElement passwordKutusu;
    @FindBy(
            id = "btnSubmit"
    )
    public WebElement loginKutusu;
    @FindBy(
            xpath = "//span[text()='ListOfUsers']"
    )
    public WebElement basariliGirisYaziElementi;

    @FindBy(xpath = "//*[.='Try again please']"
    )
    public WebElement loginFailedYazisi;

}
