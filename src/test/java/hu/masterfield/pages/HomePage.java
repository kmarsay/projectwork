package hu.masterfield.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    //cookies Button  - jobb xpath kellene még!
    //    //*[@id="sticky-bar-cookie-wrapper"]/span/div/div/div[2]/form[1]/button/span
    @FindBy(xpath = "//*[@id=\"sticky-bar-cookie-wrapper\"]/span/div/div/div[2]/form[1]/button")
    WebElement acceptCookiesButton;

    //language Button

    @FindBy(xpath = "//*[@id=\"utility-header-language-switch-link\"]")
    WebElement langButton;

    @FindBy(css = "#utility-header-registration-link > span")
    WebElement regButton;

    // promotions click
    @FindBy(xpath="//*[@id="promotions"]/a")
    WebElement checkPromotions;

    public void acceptCookies() {
        acceptCookiesButton.click();
    }

    public void isLoaded() {
        isLoaded(acceptCookiesButton);
    }

    public void changeLang() {
        langButton.click();
    }

    public void checkLanguage(String lang) {
        if (lang.equals("Magyar")) {
            assertEquals("Regisztráció", regButton.getText());
        }

        if (lang.equals("English")) {
            assertEquals("Register", regButton.getText());
        }
    }

    public void checkPromotions() {
        checkPromotions.click();
    }


}

