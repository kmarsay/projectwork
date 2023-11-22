package hu.masterfield.steps;

import hu.masterfield.pages.BasePage;
import hu.masterfield.pages.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.InterruptedIOException;
import java.time.Duration;

public class TescoSteps {

    BasePage basePage;
    HomePage homePage;

    @BeforeAll


    public static void setup() throws InterruptedIOException {


        // set chrome options
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-blink-features=AutomationControlled");

        // init driver
        ChromeDriver driver = new ChromeDriver(chromeOptions);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //window size
        driver.manage().window().setSize(new Dimension(900, 900));
    }


    @AfterAll
    //böngésző zárása
    public static void cleanup() {
        WebDriver driver;
        driver.quit();
    }

    @Given("main page is open")
    public void mainPageIsOpen() {
        WebDriver driver;
        driver.get("https://bevasarlas.tesco.hu/groceries/hu-HU");
        homePage = new HomePage(driver);
        homePage.isLoaded();
    }

    @And("accept cookies")
    public void acceptCookies() {
        homePage.acceptCookies();
    }

    @Given("language is set to Magyar")
    public void languageIsSetTo(String Magyar) {
    }

    // change lang. nem végleges, elakadtam
    @When("I change the language to {English}")
    public void iChangeTheLanguageTo(String language) {
        homePage.changeLang(language);
    }

    //lang validálással próbálkozok
    // @Then("it shows elements in English")
    // public void itShowsElementsIn(String language) {
    //     language.validation(language);
}







