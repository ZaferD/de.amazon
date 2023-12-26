package pageObjects;

import driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuchKategorie {
    public SuchKategorie(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//title[text()='Amazon.de: Günstige Preise für Elektronik & Foto, Filme, Musik, Bücher, Games, Spielzeug & mehr'")
    public WebElement homepageAmazon;

    @FindBy(xpath = "//input[@id='sp-cc-accept']")
    public WebElement cookiesAccept;
}
