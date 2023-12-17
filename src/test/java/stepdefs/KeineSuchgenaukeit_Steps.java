package stepdefs;

import driver.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pageObjects.HomePage;
import pageObjects.KeineSuchgenauigkeitPage;
import utils.PropertyReader;
import utils.Utilities;

public class KeineSuchgenaukeit_Steps extends BaseSteps {
    HomePage homepage = new HomePage();
    KeineSuchgenauigkeitPage keineSuchgenauigkeit = new KeineSuchgenauigkeitPage();

    @Given("ich gehe die Webseite Amazon-Homepage amazon.de")
    public void ichGeheDieWebseiteAmazonHomepageAmazonDe() {
        homepage = new HomePage();
        keineSuchgenauigkeit = new KeineSuchgenauigkeitPage();
        driver.get(PropertyReader.read("Config").get("url"));
    }

    @Then("ich sehe title Amazon.de")
    public void ichSeheTitleAmazonDe() {
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains("Amazon.de"));
    }

    @And("ich klicke Cookies akzeptieren")
    public void ichKlickeCookiesAkzeptieren() {

        click(keineSuchgenauigkeit.cookiesAccept);
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

    }

    @And("ich sehe in das Suchfeld ein Dropdown-Menü mit Schnuller Optionen")
    public void ichSeheInDasSuchfeldEinDropdownMenüMitSchnullerOptionen() {
        Utilities.sleep(3000);
        long num = driver.findElements(By.xpath("//div[@class='s-suggestion-container']")).stream().filter(e -> !e.getText().toLowerCase().contains("schnuller")).count();
        Assert.assertEquals(num, 0);

    }

    @Then("ich klicke auf ein gesuchtes Produkt im Dropdown-Menü")
    public void ichKlickeAufEinGesuchtesProduktImDropdownMenü() {
        Utilities.sleep(4000);
        //
        //for (WebElement each : keineSuchgenauigkeit.dropdownMenus
        //) {
        //    System.out.println(each.getText());
        //}

        keineSuchgenauigkeit.dropdownMenus.get(0).click();
//        keineSuchgenauigkeit.searchboxAmazon.clear();
//        keineSuchgenauigkeit.searchboxAmazon.sendKeys(selectChooseOptionSecond, Keys.ENTER);

    }

    @And("ich sehe die Produkten unter der Ergebnisse Title auf der Seite")
    public void ichSeheDieProduktenUnterDerErgebnisseTitleAufDerSeite() {
        long num = keineSuchgenauigkeit.searchErgebnisse.size();
        Assert.assertTrue(num > 0);

    }

    @And("ich sehe oben links auf der Seite Seitenzahl der Seiten mehr als Ergebnissen oder Produktmenge Vorschlägen für gesuchtes Produkt")
    public void ichSeheObenLinksAufDerSeiteSeitenzahlDerSeitenMehrAlsErgebnissenOderProduktmengeVorschlägenFürGesuchtesProdukt() {

        String actualText = keineSuchgenauigkeit.searchboxAmazon.getAttribute("value");
        String expectedText = keineSuchgenauigkeit.searchErgebnisBar.getText();
        System.out.println("expectedText : " + expectedText + " " + " actualText : " + actualText);
        Assert.assertTrue(expectedText.contains(actualText));

    }


    @When("ich schreibe in das Suchfeld Schrauben")
    public void ichSchreibeInDasSuchfeldSchrauben() {
        keineSuchgenauigkeit.searchboxAmazon.clear();
        sendKeys(keineSuchgenauigkeit.searchboxAmazon, "Schrauben");
        Utilities.sleep(4000);
    }

    @Then("ich klicke auf die Suchschaltfläche")
    public void ichKlickeAufDieSuchschaltfläche() {
        click(keineSuchgenauigkeit.suchButton);
        Utilities.sleep(4000);
    }

    @And("ich sehe das Dropdown-Menü Alle neben der Suchfeld")
    public void ichSeheDasDropdownMenüAlleNebenDerSuchfeld() {
        waitForVisibility(keineSuchgenauigkeit.dropdownAlle);
        Assert.assertTrue(keineSuchgenauigkeit.dropdownAlle.getText().contains("Alle"));
    }

    @Then("ich sehe die Ergebnisse für Schnuller gesuchte Produkt unter dem Ergebnisse")
    public void ichSeheDieErgebnisseFürSchnullerGesuchteProduktUnterDemErgebnisse() {
        String actualText = keineSuchgenauigkeit.ergebnisseGesuchteProdukt.getText();
        String expectedText = "Schnuller";
        System.out.println("expectedText : " + expectedText + " " + " actualText : " + actualText);

        Assert.assertTrue(actualText.toLowerCase().contains(expectedText.toLowerCase()));
    }

    @Then("ich sehe die Ergebnisse für Schrauben gesuchte Produkt unter dem Ergebnisse")
    public void ichSeheDieErgebnisseFürSchraubenGesuchteProduktUnterDemErgebnisse() {
        String actualText = keineSuchgenauigkeit.ergebnisseGesuchteProdukt.getText();
        String expectedText = "Schrauben";
        System.out.println("expectedText : " + expectedText + " " + " actualText : " + actualText);

        Assert.assertTrue(actualText.toLowerCase().contains(expectedText.toLowerCase()));
    }
}
