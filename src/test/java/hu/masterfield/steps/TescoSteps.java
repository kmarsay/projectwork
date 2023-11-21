package hu.masterfield.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TescoSteps {

    //@Before                Chrome nyit



    //BAckground-ként valami annotációval (main page open and accept cookies:GIVEN, AND) vagy maradjon így?

    @Given("main page is open")
    public void mainPageIsOpen() {
    }


    @And("I click on accept cookies")
    public void iClickOnAcceptCookies() {
    }

    //Background vége lenne

    @And("language is set to {Magyar}")
    public void languageIsSetTo(String Magyar) {
    }

    @When("I change the language to {English}")
    public void iChangeTheLanguageTo(String English) {
    }

    @Then("it shows elements in {English}")
    public void itShowsElementsIn(String English) {
    }

    /*
    @After
    public void cleanup() {
        WebDriverRunner.getWebDriver().quit();
        */
    }

}
