package webAutomationTest.stepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import webAutomationTest.pages.LoginPage;

public class LoginStepDef {
    LoginPage login;
    WebDriver driver;

    @Before
    public void beforeTest() {
        driver = WebDriverManager.chromedriver().create();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
    }

    @After
    public void afterTest() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        login = new LoginPage(driver);
        login.goToLoginPage();
    }

    @And("user inputs username {string}")
    public void userInputsUsername(String username) {
        login.inputUsername(username);
    }

    @And("user inputs password {string}")
    public void userInputsPassword(String password) {
        login.inputPassword(password);
    }

    @When("user clicks the login button")
    public void userClicksTheLoginButton() {
        login.clickLoginButton();
    }

    @Then("user is redirected to the homepage")
    public void userIsRedirectedToTheHomepage() {
        login.validateHomePage();
    }

    @Then("user is able to see error message {string}")
    public void userIsAbleToSeeErrorMessage(String errorMessage) {
        login.validateErrorAppears(errorMessage);
    }
}
