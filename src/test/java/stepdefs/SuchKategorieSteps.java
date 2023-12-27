package stepdefs;

import driver.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pageObjects.HomePage;
import pageObjects.SuchKategoriePage;
import utils.PropertyReader;
import utils.Utilities;

public class SuchKategorieSteps extends BaseSteps {
    HomePage homepage = new HomePage();
    SuchKategoriePage suchKategoriePage = new SuchKategoriePage();

    @Given("ich gehe auf die Webseite Amazon-Homepage amazon.de")
    public void ichGeheAufDieWebseiteAmazonHomepageAmazonDe() {
        driver.get(PropertyReader.read("Config").get("url"));
    }

    @Then("Ich sehe den Titel auf Amazon.de.")
    public void ichSeheDenTitelAufAmazonDe() {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains("Amazon.de"));
    }

    @And("ich klicke auf Cookies akzeptieren")
    public void ichKlickeAufCookiesAkzeptieren() {
        click(suchKategoriePage.cookiesAccept);
    }

    @Then("ich sehe den Text Alle, oben links auf der Seite, unter amazon.de Logo")
    public void ichSeheDenTextAlleObenLinksAufDerSeiteUnterAmazonDeLogo() {
        waitForVisibility(suchKategoriePage.menuAlle);
        Assert.assertTrue(suchKategoriePage.menuAlle.getText().contains("Alle"));
    }

    @And("ich klicke auf den Text Alle")
    public void ichKlickeAufDenTextAlle() {
        click(suchKategoriePage.menuAlle);
        Utilities.sleep(3000);
    }

    @Then("ich sehe den Titel Alle Kategorien")
    public void ichSeheDenTitelAlleKategorien() {
        waitForVisibility(suchKategoriePage.titelAlleKategorien);
        Assert.assertTrue(suchKategoriePage.titelAlleKategorien.getText().toLowerCase().contains("alle kategorien"));
    }

    @And("ich sehe auf die Kategorie Bücher in der List")
    public void ichSeheAufDieKategorieBücherInDerList() {
        waitForVisibility(suchKategoriePage.menuBuecher);
        Assert.assertTrue(suchKategoriePage.menuBuecher.getText().contains("Bücher"));
        Utilities.sleep(3000);
    }

    @Then("ich klicke auf die Kategorie Bücher in der List")
    public void ichKlickeAufDieKategorieBücherInDerList() {
        click(suchKategoriePage.menuBuecher);
        Utilities.sleep(3000);
    }

    @And("ich sehe Alle Bücher Title")
    public void ichSeheAlleBücherTitle() {
        waitForVisibility(suchKategoriePage.menuAlleBuecher);
        Assert.assertTrue(suchKategoriePage.menuAlleBuecher.getText().contains("Alle Bücher"));
    }

    @Then("ich klicke auf Alle Bücher Text")
    public void ichKlickeAufAlleBücherText() {
        click(suchKategoriePage.menuAlleBuecher);
        Utilities.sleep(3000);
    }

    @And("ich sehe die Liste der Kategorien unter dem Titel Stöbern links auf der Seite")
    public void ichSeheDieListeDerKategorienUnterDemTitelStöbernLinksAufDerSeite() {
        long num = suchKategoriePage.listTitlesAlleBuecher.size();
        Assert.assertTrue(num > 0);
    }

    @And("ich sehe auf der Seite Vorgestellte Kategorien Titel")
    public void ichSeheAufDerSeiteVorgestellteKategorienTitel() {
        waitForVisibility(suchKategoriePage.titleVorgestellteKategorien);
        Assert.assertTrue(suchKategoriePage.titleVorgestellteKategorien.getText().contains("Vorgestellte Kategorien"));
    }

    @And("ich gehe erste Kategorie unter Vorgestellte Kategorien Titel")
    public void ichGeheErsteKategorieUnterVorgestellteKategorienTitel() {
        Actions actions = new Actions(driver);
        actions
                .moveToElement(waitForVisibility(suchKategoriePage.ersteVorgestellteKategorien))
                .perform();
    }

    @And("ich klicke in der sich öffnenden Kategorienliste auf die erste Kategorie")
    public void ichKlickeInDerSichÖffnendenKategorienlisteAufDieErsteKategorie() {
        new Actions(driver)
                .scrollToElement(waitForVisibility(suchKategoriePage.listErsteVorgestellteKategorien))
                .click(suchKategoriePage.listErsteVorgestellteKategorien)
                .perform();
        Utilities.sleep(3000);
    }

    @Then("ich sehe die Sprache Text in der Liste links auf der Seite")
    public void ichSeheDieSpracheTextInDerListeLinksAufDerSeite() {

        new Actions(driver)
                .sendKeys(Keys.PAGE_DOWN)
                .scrollToElement(waitForVisibility(suchKategoriePage.titleSprache))
                .perform();
        Assert.assertTrue(suchKategoriePage.titleSprache.getText().contains("Sprache"));
        Utilities.sleep(3000);
    }

    @And("ich klicke auf Deutsch Checkbox")
    public void ichKlickeAufDeutschCheckbox() {
        new Actions(driver)
                .scrollToElement(waitForVisibility(suchKategoriePage.checkboxDeutsch))
                .click(suchKategoriePage.checkboxDeutsch)
                .perform();

        Utilities.sleep(3000);
    }

    @And("ich sehe die Ergebnisse Title auf der Seite")
    public void ichSeheDieErgebnisseTitleAufDerSeite() {
        new Actions(driver)
                .scrollToElement(waitForVisibility(suchKategoriePage.titleErgebnisse))
                .perform();
        Assert.assertTrue(suchKategoriePage.titleErgebnisse.getText().contains("Ergebnisse"));
        Utilities.sleep(3000);
    }

    @Then("ich sehe unter Format Text in der Liste links auf der Seite")
    public void ichSeheUnterFormatTextInDerListeLinksAufDerSeite() {

        new Actions(driver)
                .scrollToElement(waitForVisibility(suchKategoriePage.titleFormat))
                .perform();
        Assert.assertTrue(suchKategoriePage.titleFormat.getText().contains("Format"));
        Utilities.sleep(3000);
    }

    @And("ich klicke Hörbuch Checkbox")
    public void ichKlickeHörbuchCheckbox() {
        click(suchKategoriePage.checkboxHoerbuch);
        Utilities.sleep(3000);
    }

    @Then("ich sehe oben links auf der Seite Seitenzahl der Seiten von mehr als Ergebnissen")
    public void ichSeheObenLinksAufDerSeiteSeitenzahlDerSeitenVonMehrAlsErgebnissen() {
        new Actions(driver)
                .sendKeys(Keys.HOME)
                .perform();
        waitForVisibility(suchKategoriePage.ergebnisBar);
        Assert.assertTrue(suchKategoriePage.ergebnisBar.getText().contains("Ergebnisse"));
        Utilities.sleep(3000);
    }

    @Then("ich sehe unter der Kundenrezensionen Text in der Liste links auf der Seite")
    public void ichSeheUnterDerKundenrezensionenTextInDerListeLinksAufDerSeite() {
        waitForVisibility(suchKategoriePage.titleKundenrezensionen);
        //System.out.println(suchKategoriePage.titleKundenrezensionen.getText());
        Assert.assertEquals(suchKategoriePage.titleKundenrezensionen.getText(),"Kundenrezensionen");
        Utilities.sleep(3000);
    }

    @And("ich klicke vier Sterne & mehr")
    public void ichKlickeVierSterneMehr() {

        click(suchKategoriePage.titleVierSterneUndMehr);
    }
}
