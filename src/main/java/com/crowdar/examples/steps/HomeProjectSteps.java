package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.HomeProjectService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.crowdar.examples.services.LoginService;


/**
 * This class handles the steps in the features files and connects with the service in case of having business logic.
 * Otherwise, if it is a simple action, like clicking a button and it has nothing related to business logic, is correct to put here.
 */
public class HomeProjectSteps extends PageSteps {

    @io.cucumber.java.en.Given("The user logins successfully with (.*) and (.*)")
    public void theUserIsLoggedInSuccessfully(String email, String password) {
        LoginService.doLogin(email, password);
            HomeProjectService.isViewLoaded(); //after login


    }

    @When("The user taps on the hamburger menu")
    public void isProjectHomePageVisible()  {
        HomeProjectService.userTapsHamburger();
    }
    @And("The user taps on settings")
    public void theUserTapsOnSettings()     {
        HomeProjectService.userTapsSettings();
    }

    @And("The user taps on enable dark mode")
    public void theUserEnablesDarkMode()    {
        HomeProjectService.userEnablesDarkMode();
    }

    @Then("Clockify is set to dark mode")
    public void userVerifiesDarkModeOn()    {
        HomeProjectService.checkStatusChange();
    }

}
