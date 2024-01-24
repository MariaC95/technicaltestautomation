package org.example.pages.firefox.commonUses;

import com.google.inject.Inject;
import org.example.pages.common.commonUses.CommonWebpage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonWebpageFirefox extends CommonWebpage {
    @Inject
    public CommonWebpageFirefox(WebDriver driver) {
        super(driver);
        this.continueButtonLocator = By.linkText("Continue");
        this.deleteAccountButtonLocator = By.linkText("Delete Account");
        this.deleteAccountTextLocator = By.cssSelector(".title");
        this.viewCartModalButtonLocator = By.xpath("//u[contains(.,'View Cart')]");
    }
}
