package org.example.pages.common.signupLogin;

import org.example.contracts.signupLogin.Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginWebpage implements Login {
    private WebDriver driver;
    protected By emailSigninLocator;
    protected By passwordSigninLocator;

    public LoginWebpage(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public void enterLoginDetails(String email, String password) {
        driver.findElement(emailSigninLocator).sendKeys(email);
        driver.findElement(passwordSigninLocator).sendKeys(password);
    }
}
