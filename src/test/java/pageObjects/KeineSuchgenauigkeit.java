package pageObjects;

import driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class KeineSuchgenauigkeit {


    public KeineSuchgenauigkeit() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//title[text()='Amazon.de: Günstige Preise für Elektronik & Foto, Filme, Musik, Bücher, Games, Spielzeug & mehr'")
    WebElement homepageAmazon;

    @FindBy(xpath = "//div[@id='nav-search-dropdown-card'] //span[text()='Alle']")
    public WebElement dropdownAlle;

    @FindBy(xpath = "//span[@id='nav-search-label-id' and text()='Baby']")
    public WebElement dropdownBaby;

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    public WebElement searchboxAmazon;

}

