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

    static WebDriver driver;
    static WebDriverWait wait;

    BasePage basePage;
    HomePage homePage;

    @BeforeAll
    public static void setup() throws InterruptedIOException {

        // set chrome options
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-blink-features=AutomationControlled");

        // init driver
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //window size
        driver.manage().window().setSize(new Dimension(900, 900));
    }


    @AfterAll
    //böngésző zárása
    public static void cleanup() {
        driver.quit();
    }

    @Given("main page is open")
    public void mainPageIsOpen() {
        driver.get("https://bevasarlas.tesco.hu/groceries/hu-HU");
        homePage = new HomePage(driver);
        homePage.isLoaded();
    }

    @And("accept cookies")
    public void acceptCookies() {
        homePage.acceptCookies();
    }

    @When("I change the language")
    public void iChangeTheLanguageTo() {
        homePage.changeLang();
    }

    @Given("open {string} home page")
    public void openHomePage(String lang) {
        if (lang.equals("Magyar")) {
            driver.get("https://bevasarlas.tesco.hu/groceries/hu-HU");
        }
        if (lang.equals("English")) {
            driver.get("https://bevasarlas.tesco.hu/groceries/en-GB");
        }

        homePage = new HomePage(driver);
    }

    @Then("it shows elements in {string}")
    public void itShowsElementsIn(String lang) {
        homePage.checkLanguage(lang);
    }

    //promotions feature

    @When("I see the groceries page")
    public void iSeeTheGroceriesPage() {

    }

    //click promotions
    @Then("I want to check promotions")
    public void iWantToCheckPromotions() {
        homePage.checkPromotions();
    }

    @And("I can view offers by department")
    public void iCanViewOffersByDepartment() {
    }


}







