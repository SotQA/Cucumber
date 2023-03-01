package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasePage {

    protected WebDriver driver;
    protected String URL = "https://demoqa.com/progress-bar";
    protected final String AGE = "23";

//    public WebElement progressBar = driver.findElement(By.id("progressBar"));
//    public WebElement button = driver.findElement(By.id("startStopButton"));

    @FindBy(id = "progressBar")
    private WebElement progressBar;

    @FindBy(id = "startStopButton")
    public WebElement button;

    public WebElement getProgressBar() {
        return progressBar;
    }

//    public WebElement getButton() {
//        return button;
//    }

    public String getURL() {
        return URL;
    }
}
