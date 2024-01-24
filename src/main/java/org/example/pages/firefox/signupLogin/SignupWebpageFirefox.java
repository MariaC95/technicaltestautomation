package org.example.pages.firefox.signupLogin;

import com.google.inject.Inject;
import org.example.pages.common.signupLogin.SignupWebpage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupWebpageFirefox extends SignupWebpage {
    @Inject
    public SignupWebpageFirefox(WebDriver driver) {
        super(driver);
        this.signupTextLocator = By.xpath("//h2[contains(.,'New User Signup!')]");
        this.nameSignupLocator = By.name("name");
        this.emailSignupLocator = By.xpath("(//input[@name='email'])[2]");
        this.signupButtonLocator = By.xpath("(//button[@type='submit'])[2]");
        this.accountCreatedTextLocator = By.xpath("//p[contains(.,'Congratulations! Your new account has been successfully created!')]");
    }
}
