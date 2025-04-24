package webAutomationTest.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPage {
    WebDriver driver;

    By usernameInputText = By.cssSelector("input#user-name");
    By passwordInputText = By.xpath("//*[@id=\"password\"]");
    By loginButton = By.id("login-button");
    By productBackpack = By.xpath("//div[normalize-space()='Sauce Labs Backpack']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToLoginPage() {
        driver.get("https://www.saucedemo.com/");
    }

    public void inputUsername(String username) {
        driver.findElement(usernameInputText).sendKeys(username);
    }

    public void inputPassword(String password) {
        driver.findElement(passwordInputText).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void validateHomePage() {
        WebElement product = driver.findElement(productBackpack);
        Assert.assertTrue(product.isDisplayed());
        assertEquals("Sauce Labs Backpack", product.getText());
    }

    public void validateErrorAppears(String errorMessage) {
        assertTrue(driver.getPageSource().contains(errorMessage), "Error message not found: " + errorMessage);
    }
}

