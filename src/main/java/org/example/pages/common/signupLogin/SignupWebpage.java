package org.example.pages.common.signupLogin;

import org.example.contracts.signupLogin.Signup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupWebpage implements Signup {
    protected WebDriver driver;
    protected By signupTextLocator;
    protected By nameSignupLocator;
    protected By emailSignupLocator;
    protected By signupButtonLocator;
    protected By accountCreatedTextLocator;
    public SignupWebpage(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public boolean isVisible() {
        return driver.findElement(signupTextLocator).isDisplayed();
    }

    @Override
    public void enterSignUpDetails(String name, String email) {
        driver.findElement(nameSignupLocator).sendKeys(name);
        driver.findElement(emailSignupLocator).sendKeys(email);
    }

    @Override
    public void clickSignupButton() {
        driver.findElement(signupButtonLocator).click();
    }

    @Override
    public boolean isAccountCreatedPageDisplayed() {
        return driver.findElement(accountCreatedTextLocator).isDisplayed();
    }

}
