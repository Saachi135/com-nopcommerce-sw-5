package com.nopcommerce.sw5.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.sw5.customerlisteners.CustomListeners;
import com.nopcommerce.sw5.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomePageSignInText;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Checkout as Guest')]")
    WebElement checkoutAsGuestButton;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Register')]")
    WebElement registerButton;


    public String getWelcomePageSignInText() {
        Reporter.log("Get message from webpage ");
        CustomListeners.test.log(Status.PASS, "Get message from webpage ");
        return getTextFromElement(welcomePageSignInText);
    }

    public void clickOnCheckoutAsGuestButton() {
        Reporter.log("Click on guest checkout ");
        clickOnElement(checkoutAsGuestButton);
        CustomListeners.test.log(Status.PASS, "Click on guest checkout");
    }

    public void clickOnRegisterButton() {
        Reporter.log("Click on registration button ");
        clickOnElement(registerButton);
        CustomListeners.test.log(Status.PASS, "Click on registration button ");
    }
}
