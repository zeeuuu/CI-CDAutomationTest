package webAutomationTest.stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webAutomationTest.pages.ApiPage;

public class ApiStepDef {
    ApiPage apiPage;

    public ApiStepDef() {
        this.apiPage = new ApiPage();
    }

    @Given("prepare url")
    public void prepareUrl() {
        apiPage.prepareUrlFor();
    }

    @When("hit api get list users")
    public void hitApiGetListUsers() {
        apiPage.hitApiGetListUsers();
    }

    @Then("validation status code is equals {int}")
    public void validationStatusCodeIsEquals(int statusCode) {
        apiPage.validationStatusCodeIsEquals(statusCode);
    }
}
