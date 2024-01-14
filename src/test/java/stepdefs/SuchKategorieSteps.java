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
        //Assert.assertTrue(suchKategoriePage.menuAlle.getText().contains("Alle"));
    }

    @And("ich klicke auf den Text Alle")
    public void ichKlickeAufDenTextAlle() {
        click(suchKategoriePage.menuAlle);
        //Utilities.sleep(3000);
    }

    @Then("ich sehe den Titel Alle Kategorien")
    public void ichSeheDenTitelAlleKategorien() {
        waitForVisibility(suchKategoriePage.titelAlleKategorien);
        //Assert.assertTrue(suchKategoriePage.titelAlleKategorien.getText().toLowerCase().contains("alle kategorien"));
    }

    @And("ich sehe den Title Bücher unter dem Titel Alle Kategorien")
    public void ichSeheDenTitleBücherUnterDemTitelAlleKategorien() {
        waitForVisibility(suchKategoriePage.menuBuecher);
        //Assert.assertTrue(suchKategoriePage.menuBuecher.getText().contains("Bücher"));
        //Utilities.sleep(3000);
    }

    @Then("ich klicke auf den Title Bücher in der List")
    public void ichKlickeAufDenTitleBücherInDerList() {
        click(suchKategoriePage.menuBuecher);
        //Utilities.sleep(3000);
    }

    @And("ich sehe Alle Bücher Title")
    public void ichSeheAlleBücherTitle() {
        waitForVisibility(suchKategoriePage.menuAlleBuecher);
        //Assert.assertTrue(suchKategoriePage.menuAlleBuecher.getText().contains("Alle Bücher"));
    }

    @Then("ich klicke auf Alle Bücher Text")
    public void ichKlickeAufAlleBücherText() {
        click(suchKategoriePage.menuAlleBuecher);
        //Utilities.sleep(3000);
    }

    @And("ich sehe die Liste der Kategorien unter dem Titel Stöbern links auf der Seite")
    public void ichSeheDieListeDerKategorienUnterDemTitelStöbernLinksAufDerSeite() {
        long num = suchKategoriePage.listTitlesAlleBuecher.size();
        Assert.assertTrue(num > 0);
    }

    @And("ich sehe auf der Seite Vorgestellte Kategorien Titel")
    public void ichSeheAufDerSeiteVorgestellteKategorienTitel() {
        waitForVisibility(suchKategoriePage.titleVorgestellteKategorien);
        //Assert.assertTrue(suchKategoriePage.titleVorgestellteKategorien.getText().contains("Vorgestellte Kategorien"));
    }

    @And("ich gehe erste Kategorie unter Vorgestellte Kategorien Titel")
    public void ichGeheErsteKategorieUnterVorgestellteKategorienTitel() {
        hoverOverByAction(suchKategoriePage.ersteVorgestellteKategorien);
    }

    @And("ich klicke in der sich öffnenden Kategorienliste auf die erste Kategorie")
    public void ichKlickeInDerSichÖffnendenKategorienlisteAufDieErsteKategorie() {

        scrollToElement(suchKategoriePage.listErsteVorgestellteKategorien);
        click(suchKategoriePage.listErsteVorgestellteKategorien);
        //Utilities.sleep(3000);
    }

    @Then("ich sehe die Sprache Text in der Liste links auf der Seite")
    public void ichSeheDieSpracheTextInDerListeLinksAufDerSeite() {
        scrollToElement(suchKategoriePage.titleSprache);
        //Assert.assertTrue(suchKategoriePage.titleSprache.getText().contains("Sprache"));
        //Utilities.sleep(3000);
    }

    @And("ich klicke auf Deutsch Checkbox")
    public void ichKlickeAufDeutschCheckbox() {
        scrollToElement(suchKategoriePage.checkboxDeutsch);
        click(suchKategoriePage.checkboxDeutsch);
        //Utilities.sleep(3000);
    }

    @And("ich sehe die Ergebnisse Title auf der Seite")
    public void ichSeheDieErgebnisseTitleAufDerSeite() {
        sendKeys("Keys.HOME");
        //Utilities.sleep(3000);
        scrollToElement(suchKategoriePage.titleErgebnisse);


    }

    @Then("ich sehe unter Format Text in der Liste links auf der Seite")
    public void ichSeheUnterFormatTextInDerListeLinksAufDerSeite() {
        scrollToElement(suchKategoriePage.titleFormat);
        //Utilities.sleep(3000);
    }

    @And("ich klicke Taschenbuch Checkbox")
    public void ichKlickeTaschenbuchCheckbox() {
        click(suchKategoriePage.checkboxTaschenbuch);
        //Utilities.sleep(3000);
    }

    @Then("ich sehe oben links auf der Seite Seitenzahl der Seiten von mehr als Ergebnissen")
    public void ichSeheObenLinksAufDerSeiteSeitenzahlDerSeitenVonMehrAlsErgebnissen() {
        sendKeys("Keys.HOME");
        waitForVisibility(suchKategoriePage.ergebnisBar);
        //Assert.assertTrue(suchKategoriePage.ergebnisBar.getText().contains("Ergebnisse"));
        //Utilities.sleep(3000);
    }

    @Then("ich sehe unter der Kundenrezensionen Text in der Liste links auf der Seite")
    public void ichSeheUnterDerKundenrezensionenTextInDerListeLinksAufDerSeite() {
        waitForVisibility(suchKategoriePage.titleKundenrezensionen);
        //System.out.println(suchKategoriePage.titleKundenrezensionen.getText());
        //Assert.assertEquals(suchKategoriePage.titleKundenrezensionen.getText(), "Kundenrezensionen");
        //Utilities.sleep(3000);
    }

    @And("ich klicke vier Sterne & mehr")
    public void ichKlickeVierSterneMehr() {
        click(suchKategoriePage.titleVierSterneUndMehr);
    }
}
