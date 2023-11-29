package stepdefs;

import driver.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pageObjects.HomePage;
import pageObjects.KeineSuchgenauigkeit;
import utils.PropertyReader;
import utils.Utilities;

public class KeineSuchgenaukeit_Steps extends BaseSteps {
    HomePage homepage = new HomePage();
    KeineSuchgenauigkeit keineSuchgenauigkeit = new KeineSuchgenauigkeit();

    @Given("ich gehe die Webseite Amazon-Homepage amazon.de")
    public void ichGeheDieWebseiteAmazonHomepageAmazonDe() {
        homepage = new HomePage();
        keineSuchgenauigkeit = new KeineSuchgenauigkeit();
        driver.get(PropertyReader.read("Config").get("url"));
    }

    @Then("ich sehe title Amazon.de")
    public void ichSeheTitleAmazonDe() {
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains("Amazon.de"));
    }

    @And("ich gehe das Dropdown-Menü Alle neben der Suchfeld")
    public void ichGeheDasDropdownMenüAlleNebenDerSuchfeld() {
        waitForVisibility(keineSuchgenauigkeit.dropdownAlle);
        Assert.assertTrue(keineSuchgenauigkeit.dropdownAlle.getText().contains("Alle"));
    }

    @Then("ich klicke Alle Dropdown-Menü")
    public void ichKlickeAlleDropdownMenü() {
        click(keineSuchgenauigkeit.dropdownAlle);

    }

    @When("ich sehe das Dropdown-Menü die Kategorien mit dem Titel Alle enthalten")
    public void ichSeheDasDropdownMenüDieKategorienMitDemTitelAlleEnthalten() {

        Select select = new Select(keineSuchgenauigkeit.dropdownBox);

        select.selectByVisibleText("Baby");

        String actualChooseOption = select.getFirstSelectedOption().getText();
        String expectedChooseOption = "Baby";

        Assert.assertEquals(expectedChooseOption, actualChooseOption);

    }

    @Then("ich klicke auf die Kategorie Baby im Dropdown-Menü")
    public void ichKlickeAufDieKategorieBabyImDropdownMenü() {
        click(keineSuchgenauigkeit.dropdownBaby);
    }

    @And("ich sehe das Dropdown-Menü zu")
    public void ichSeheDasDropdownMenüZu() {
        waitForInvisibility(keineSuchgenauigkeit.dropdownAlle);

    }

    @Then("ich sehe das Suchfeld")
    public void ichSeheDasSuchfeld() {
        waitForVisibility(keineSuchgenauigkeit.searchboxAmazon);
    }

    @And("ich schreibe in das Suchfeld Schnuller")
    public void ichSchreibeInDasSuchfeldSchnuller() {
        sendKeys(keineSuchgenauigkeit.searchboxAmazon, "Schnuller");
        Utilities.sleep(3000);
    }

    @And("ich sehe in das Suchfeld ein Dropdown-Menü mit Schnuller Optionen")
    public void ichSeheInDasSuchfeldEinDropdownMenüMitSchnullerOptionen() {

        long num = keineSuchgenauigkeit.dropdownMenus.stream().filter(e -> !e.getText().toLowerCase().contains("schnuller")).count();
        Assert.assertEquals(num, 0);

    }

    @Then("ich klicke auf ein gesuchtes Produkt im Dropdown-Menü")
    public void ichKlickeAufEinGesuchtesProduktImDropdownMenü() {
        sendKeys(keineSuchgenauigkeit.searchboxAmazon, Keys.ENTER);


    }

    @And("ich sehe die Produkten unter der Ergebnisse Title auf der Seite")
    public void ichSeheDieProduktenUnterDerErgebnisseTitleAufDerSeite() {

    }

    @And("ich sehe oben links auf der Seite Seitenzahl der Seiten mehr als Ergebnissen oder Produktmenge Vorschlägen für gesuchtes Produkt")
    public void ichSeheObenLinksAufDerSeiteSeitenzahlDerSeitenMehrAlsErgebnissenOderProduktmengeVorschlägenFürGesuchtesProdukt() {
    }

    @Then("ich sehe unter der Ergebnisse Titel die Fotos, Verfügbarkeit, Beschreibungen und Kundenrezensionen")
    public void ichSeheUnterDerErgebnisseTitelDieFotosVerfügbarkeitBeschreibungenUndKundenrezensionen() {
    }

    @When("ich schreibe in das Suchfeld Schrauben")
    public void ichSchreibeInDasSuchfeldSchrauben() {
    }

    @Then("ich klicke auf die Suchschaltfläche")
    public void ichKlickeAufDieSuchschaltfläche() {
    }

    @And("ich sehe das Dropdown-Menü Alle neben der Suchfeld")
    public void ichSeheDasDropdownMenüAlleNebenDerSuchfeld() {
    }

    @And("ich klicke Cookies akzeptieren")
    public void ichKlickeCookiesAkzeptieren() {
        click(keineSuchgenauigkeit.cookiesAccept);
    }
}
