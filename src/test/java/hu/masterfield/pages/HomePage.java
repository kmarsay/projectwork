package hu.masterfield.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.locks.Condition;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    //Nem lesz külön LanguageChange page

    //cookies Button  - jobb xpath kellene még!
    //    //*[@id="sticky-bar-cookie-wrapper"]/span/div/div/div[2]/form[1]/button/span
    @FindBy(xpath = "//*[@id=\"sticky-bar-cookie-wrapper\"]/span/div/div/div[2]/form[1]/button")
    WebElement acceptCookiesButton;

    //language Button
    //xpath lehetne jobb megoldás, mint ez? //*[@id="utility-header-language-switch-link"]/span/text()
    @FindBy(xpath = "//*[@id=\"utility-header-language-switch-link\"]/span/text()")
    WebElement langButton;


    public void acceptCookies() {
        acceptCookiesButton.click();
    }

    public boolean isLoaded() {
        return isLoaded(acceptCookiesButton);

    }

    public void changeLang(String language) {
        if ((langButton.getText().equals("Magyar") &&
                language.equals("magyar")) ||
                (langButton.getText().equals("English") &&
                        language.equals("angol"))) {
            langButton.click();
        }

        }

    // public void validationLang(String language){}, át tudtam váltani angolra

    //Lang Button ist vorhanden:
    //esetleg kellett volna még egy Step, ami a lang buttont keresi?
   // public void checkLangButton(){
     //   langButton.shouldBe(Condition.visible).shouldBe(Condition.enabled);
   // }

    }

}
