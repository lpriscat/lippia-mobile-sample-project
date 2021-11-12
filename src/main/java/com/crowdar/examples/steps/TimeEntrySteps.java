package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.TimeEntryService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * This class handles the steps in the features files and connects with the service in case of having business logic.
 * Otherwise, if it is a simple action, like clicking a button and it has nothing related to business logic, is correct to put here.
 */
public class TimeEntrySteps extends PageSteps {

    @When("the user clicks on project")
    public void theUserClicksOnProject() {
        TimeEntryService.addTimeEntry();
    }
    @And("the user adds a <task> to a project")
    public void theUserAddsATaskToAProject() {
        TimeEntryService.scrollCarrousel();
            }
    @Then("the user verifies that the <task> has been loaded successfully")
    public void theUserVerifiesThatTheTaskHasBeenLoadedSuccessfully() {
        TimeEntryService.checkTimeEntriesPage();
    }
}
