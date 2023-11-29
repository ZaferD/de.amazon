package pageObjects;

import driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class KeineSuchgenauigkeit {


    public KeineSuchgenauigkeit() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//title[text()='Amazon.de: Günstige Preise für Elektronik & Foto, Filme, Musik, Bücher, Games, Spielzeug & mehr'")
    public WebElement homepageAmazon;

    @FindBy(xpath = "//input[@id='sp-cc-accept']")
    public WebElement cookiesAccept;

    @FindBy(xpath = "//span[@id='nav-search-label-id' and text()='Alle']")
    public WebElement dropdownAlle;
    @FindBy(xpath = "//select[@id='searchDropdownBox']")
    public WebElement dropdownBox;

    @FindBy(xpath = "//div[@class='s-suggestion-container']")
    public List<WebElement> dropdownMenus;

    @FindBy(xpath = "//span[@id='nav-search-label-id' and text()='Baby']")
    public WebElement dropdownBaby;

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    public WebElement searchboxAmazon;

}

