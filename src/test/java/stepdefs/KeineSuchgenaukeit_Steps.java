package stepdefs;

import driver.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pageObjects.HomePage;
import pageObjects.KeineSuchgenauigkeit;
import utils.PropertyReader;

public class KeineSuchgenaukeit_Steps extends BaseSteps{
    HomePage homepage=new HomePage();
    KeineSuchgenauigkeit keineSuchgenauigkeit=new KeineSuchgenauigkeit();

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

        Select select = new Select(keineSuchgenauigkeit.dropdownAlle);

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
    }

    @Then("ich sehe der Cursor im Suchfeld")
    public void ichSeheDerCursorImSuchfeld() {
    }

    @And("ich schreibe in das Suchfeld Schnuller")
    public void ichSchreibeInDasSuchfeldSchnuller() {
    }

    @And("ich sehe in das Suchfeld ein Dropdown-Menü mit Schnuller Optionen")
    public void ichSeheInDasSuchfeldEinDropdownMenüMitSchnullerOptionen() {
    }

    @Then("ich klicke auf ein gesuchtes Produkt im Dropdown-Menü")
    public void ichKlickeAufEinGesuchtesProduktImDropdownMenü() {
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
}
