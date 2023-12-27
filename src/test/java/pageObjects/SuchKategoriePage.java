package pageObjects;

import driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SuchKategoriePage {
    public SuchKategoriePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//title[text()='Amazon.de: Günstige Preise für Elektronik & Foto, Filme, Musik, Bücher, Games, Spielzeug & mehr'")
    public WebElement homepageAmazon;
    @FindBy(xpath = "//input[@id='sp-cc-accept']")
    public WebElement cookiesAccept;
    @FindBy(xpath = "//a[@id='nav-hamburger-menu']")
    public WebElement menuAlle;
    @FindBy(xpath = "//div[@class='hmenu-item hmenu-title ' and text()='alle kategorien']")
    public WebElement titelAlleKategorien;
    @FindBy(xpath = "//div[text()='Bücher']")
    public WebElement menuBuecher;
    @FindBy(xpath = "//a[text()='Alle Bücher']")
    public WebElement menuAlleBuecher;
    @FindBy(xpath = "//h3")
    public List<WebElement> listTitlesAlleBuecher;
    @FindBy(xpath = "//span[@class='a-size-extra-large a-text-bold' and text()='Vorgestellte Kategorien']")
    public WebElement titleVorgestellteKategorien;
    @FindBy(xpath = "//li[@class='octopus-pc-category-card-v2-item'][1]")
    public WebElement ersteVorgestellteKategorien;
    @FindBy(xpath = "//span[@class='a-size-base a-color-base' and text()='Vegetarische & vegane Küche']")
    //@FindBy(xpath = "(//div[@class='a-section octopus-pc-category-card-v2-subcategory-title'])[1]")
    public WebElement listErsteVorgestellteKategorien;
    @FindBy(xpath = "//span[@class='a-size-base a-color-base a-text-bold' and text()='Sprache']")
    public WebElement titleSprache;
    @FindBy(xpath = "//input[@id='apb-browse-refinements-checkbox_0']")
    public WebElement checkboxDeutsch;
    @FindBy(xpath = "(//div[@class='a-section a-spacing-small a-spacing-top-small']/span)")
    public WebElement ergebnisBar;
    @FindBy(xpath = "//span[@class='a-size-medium-plus a-color-base a-text-bold' and text()='Ergebnisse']")
    public WebElement titleErgebnisse;
    @FindBy(xpath = "//span[@class='a-size-base a-color-base puis-bold-weight-text' and text()='Format']")
    public WebElement titleFormat;
    @FindBy(xpath = "//*[@aria-label='Hörbuch']/span/a/div/label/input")
    public WebElement checkboxHoerbuch;
    @FindBy(xpath = "//span[@class='a-size-base a-color-base puis-bold-weight-text' and text()='Kundenrezensionen']")
    public WebElement titleKundenrezensionen;
    @FindBy(xpath = "//section[@aria-label='4 Sterne und mehr']")
    public WebElement titleVierSterneUndMehr;

























}
