package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.LoginService;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.cucumber.java.en.And;


/**
 * This class handles the steps in the features files and connects with the service in case of having business logic.
 * Otherwise, if it is a simple action, like clicking a button and it has nothing related to business logic, is correct to put here.
 */
public class LoginSteps extends PageSteps {

    @Given("The app is loaded correctly")
    @When("The user goes to the login page")
    public void theUserGoesToTheLoginPage() {
        LoginService.isViewLoaded();
    }

    @And("The user enters with: (.*), (.*)")
    public void doLoginProcess(String email, String password) {
        LoginService.doLogin(email, password);
    }

    @io.cucumber.java.en.Then("Clockify Home page is displayed")
    public void clockifyHomePageIsDisplayed() {
        LoginService.isHomepageViewLoaded();
    }

}
