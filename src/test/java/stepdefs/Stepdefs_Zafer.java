package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.KeineSuchgenauigkeit;
import utils.PropertyReader;

public class Stepdefs_Zafer extends BaseSteps{

    HomePage homepage;
    KeineSuchgenauigkeit keineSuchgenauigkeit;
    @Given("ich gehe die Webseite Amazon-Homepage amazon.de")
    public void ichGeheDieWebseiteAmazonHomepageAmazonDe() {
        homepage=new HomePage();
        keineSuchgenauigkeit=new KeineSuchgenauigkeit();
        driver.navigate().to(PropertyReader.read("Config").get("url"));
    }

    @Then("ich sehe title Amazon.de")
    public void ichSeheTitleAmazonDe() {

    }

    @And("ich gehe das Dropdown-Menü Alle neben der Suchfeld")
    public void ichGeheDasDropdownMenüAlleNebenDerSuchfeld() {

    }

    @Then("ich klicke Alle Dropdown-Menü")
    public void ichKlickeAlleDropdownMenü() {

    }

    @When("ich sehe das Dropdown-Menü die Kategorien mit dem Titel Alle enthalten")
    public void ichSeheDasDropdownMenüDieKategorienMitDemTitelAlleEnthalten() {
    }

    @Then("ich klicke auf die Kategorie Baby im Dropdown-Menü")
    public void ichKlickeAufDieKategorieBabyImDropdownMenü() {
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

    @Given("Ich gehe die Webseite Amazon-Homepage amazon.de")
    public void ıchGeheDieWebseiteAmazonHomepageAmazonDe() {
    }

    @Then("Ich sehe title Amazon.de")
    public void ıchSeheTitleAmazonDe() {
    }

    @And("Ich gehe das Dropdown-Menü Alle neben der Suchfeld")
    public void ıchGeheDasDropdownMenüAlleNebenDerSuchfeld() {
    }

    @Then("Ich klicke Alle Dropdown-Menü")
    public void ıchKlickeAlleDropdownMenü() {
    }

    @When("Ich sehe das Dropdown-Menü die Kategorien mit dem Titel Alle enthalten")
    public void ıchSeheDasDropdownMenüDieKategorienMitDemTitelAlleEnthalten() {
    }

    @Then("Ich klicke auf die Kategorie Baby im Dropdown-Menü")
    public void ıchKlickeAufDieKategorieBabyImDropdownMenü() {
    }

    @And("Ich sehe das Dropdown-Menü zu")
    public void ıchSeheDasDropdownMenüZu() {
    }

    @Then("Ich sehe der Cursor im Suchfeld")
    public void ıchSeheDerCursorImSuchfeld() {
    }

    @And("Ich schreibe in das Suchfeld Schnuller")
    public void ıchSchreibeInDasSuchfeldSchnuller() {
    }

    @And("Ich sehe in das Suchfeld ein Dropdown-Menü mit Schnuller Optionen")
    public void ıchSeheInDasSuchfeldEinDropdownMenüMitSchnullerOptionen() {
    }

    @Then("Ich klicke auf ein gesuchtes Produkt im Dropdown-Menü")
    public void ıchKlickeAufEinGesuchtesProduktImDropdownMenü() {
    }

    @And("Ich sehe die Produkten unter der Ergebnisse Title auf der Seite")
    public void ıchSeheDieProduktenUnterDerErgebnisseTitleAufDerSeite() {
    }

    @And("Ich sehe oben links auf der Seite Seitenzahl der Seiten mehr als Ergebnissen oder Produktmenge Vorschlägen für gesuchtes Produkt")
    public void ıchSeheObenLinksAufDerSeiteSeitenzahlDerSeitenMehrAlsErgebnissenOderProduktmengeVorschlägenFürGesuchtesProdukt() {
    }

    @Then("Ich sehe unter der Ergebnisse Titel die Fotos, Verfügbarkeit, Beschreibungen und Kundenrezensionen")
    public void ıchSeheUnterDerErgebnisseTitelDieFotosVerfügbarkeitBeschreibungenUndKundenrezensionen() {
    }

    @When("Ich schreibe in das Suchfeld Schrauben")
    public void ıchSchreibeInDasSuchfeldSchrauben() {
    }

    @Then("Ich klicke auf die Suchschaltfläche")
    public void ıchKlickeAufDieSuchschaltfläche() {
    }

    @And("Ich sehe das Dropdown-Menü Alle neben der Suchfeld")
    public void ıchSeheDasDropdownMenüAlleNebenDerSuchfeld() {
    }
}
