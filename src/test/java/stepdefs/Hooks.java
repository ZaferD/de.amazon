package stepdefs;

import driver.Driver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.Utilities;

import java.sql.SQLOutput;

public class Hooks {

    @AfterStep
    public void afterStep(@NotNull Scenario scenario) {
        if (scenario.isFailed()) {
            Utilities.takeScreenShot();
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
            System.out.println("after test metoduna GİRDİ");
        }
    }

    @After(order = 0)
    public void after() {

        Driver.quitDriver();
    }
}
