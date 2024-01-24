package org.example.pages.chrome.signupLogin;

import com.google.inject.Inject;
import org.example.pages.common.signupLogin.SignupFormWebpage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupFormWebpageChrome extends SignupFormWebpage {

    @Inject
    public SignupFormWebpageChrome(WebDriver driver) {
        super(driver);
        this.signupFormTitleLocator = By.cssSelector(".title:nth-child(1) > b");
        this.titleMrsButtonLocator = By.id("id_gender2");
        this.passwordEntryLocator = By.id("password");
        this.dobDayPickerLocator = By.id("days");
        this.dobMonthPickerLocator = By.id("months");
        this.dobYearPickerLocator = By.id("years");
        this.newsletterButtonLocator = By.id("newsletter");
        this.specialOfferButtonLocator = By.id("optin");
        this.firstNameEntryLocator = By.id("first_name");
        this.lastNameEntryLocator = By.id("last_name");
        this.companyEntryLocator = By.id("company");
        this.addressLine1EntryLocator = By.id("address1");
        this.addressLine2EntryLocator = By.id("address2");
        this.stateEntryLocator = By.id("state");
        this.cityEntryLocator = By.id("city");
        this.zipcodeEntryLocator = By.id("zipcode");
        this.mobileNumberEntryLocator = By.id("mobile_number");
        this.createAccountButtonLocator = By.xpath("//button[@type='submit']");
    }
}
