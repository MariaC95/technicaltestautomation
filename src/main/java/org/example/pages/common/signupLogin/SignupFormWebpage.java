package org.example.pages.common.signupLogin;

import org.apache.commons.lang3.RandomStringUtils;
import org.example.contracts.signupLogin.SignupForm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.ThreadLocalRandom;

public class SignupFormWebpage implements SignupForm {
    private WebDriver driver;
    protected By signupFormTitleLocator;
    protected By titleMrsButtonLocator;
    protected By passwordEntryLocator;
    protected By dobDayPickerLocator;
    protected By dobMonthPickerLocator;
    protected By dobYearPickerLocator;
    protected By newsletterButtonLocator;
    protected By specialOfferButtonLocator;
    protected By firstNameEntryLocator;
    protected By lastNameEntryLocator;
    protected By companyEntryLocator;
    protected By addressLine1EntryLocator;
    protected By addressLine2EntryLocator;
    protected By stateEntryLocator;
    protected By cityEntryLocator;
    protected By zipcodeEntryLocator;
    protected By mobileNumberEntryLocator;
    protected By createAccountButtonLocator;

    public SignupFormWebpage(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public boolean isSignupFormDisplayed() {
        return driver.findElement(signupFormTitleLocator).isDisplayed();
    }

    @Override
    public void selectTitle() {
        driver.findElement(signupFormTitleLocator).click();
    }

    @Override
    public void enterPassword(String password) {
        driver.findElement(passwordEntryLocator).sendKeys(password);
    }

    @Override
    public void selectBirthday() {
        dropdownListSelect(dobDayPickerLocator);
        dropdownListSelect(dobMonthPickerLocator);
        dropdownListSelect(dobYearPickerLocator);
    }

    @Override
    public void selectNewsletter() {
        driver.findElement(newsletterButtonLocator).click();
    }

    @Override
    public void selectSpecialOffer() {
        driver.findElement(specialOfferButtonLocator).click();
    }

    @Override
    public void enterAddress(String name) {
        driver.findElement(firstNameEntryLocator).sendKeys(name);
        driver.findElement(lastNameEntryLocator).sendKeys(generateRandomString());
        driver.findElement(companyEntryLocator).sendKeys(generateRandomString());
        driver.findElement(addressLine1EntryLocator).sendKeys(generateRandomString());
        driver.findElement(addressLine2EntryLocator).sendKeys(generateRandomString());
        driver.findElement(stateEntryLocator).sendKeys(generateRandomString());
        driver.findElement(cityEntryLocator).sendKeys(generateRandomString());
        driver.findElement(zipcodeEntryLocator).sendKeys(generateRandomString());
        driver.findElement(mobileNumberEntryLocator).sendKeys(generateMobileNumber());
    }

    @Override
    public void clickCreateAccount() {
        driver.findElement(createAccountButtonLocator).click();
    }

    private void dropdownListSelect(By dropdownListId){
        Select dropdown = new Select(driver.findElement(dropdownListId));
        int listSize = dropdown.getOptions().size();
        // starting list from 1 because first value is list title
        int randomSelection = ThreadLocalRandom.current().nextInt(1, listSize);
        dropdown.selectByIndex(randomSelection);
    }

    private String generateRandomString(){
        return RandomStringUtils.randomAlphabetic(8);
    }

    private String generateMobileNumber(){
        return "0" + ThreadLocalRandom.current().nextInt(10000000, 99999999);
    }
}
