package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class MyStepdefs {

    WebDriver driver = new ChromeDriver();
    By progressBar = By.xpath("//div[@role ='progressbar']");


    @Given("progress bar on the page")
    public void progressBarOnThePage() {
        driver.get("https://demoqa.com/progress-bar");
        driver.manage().window().maximize();
    }

    @When("user clicks of Start button")
    public void userClicksOfStartButton() {
        driver.findElement(By.id("startStopButton")).click();
    }

    @And("when bar shows {string}")
    public void whenBarShows(String arg0) {
        while (Integer.parseInt(driver.findElement(progressBar).getAttribute("aria-valuenow")) < 100) {
            if (Integer.parseInt(driver.findElement(progressBar).getAttribute("aria-valuenow")) == Integer.parseInt(arg0)) {
                driver.findElement(By.id("startStopButton")).click();
            }
        }
    }

    @Then("user closes the page")
    public void userClosesThePage() {
        Assert.assertEquals(Integer.parseInt(driver.findElement(progressBar).getAttribute("aria-valuenow")), 23);
        driver.quit();
    }
}
