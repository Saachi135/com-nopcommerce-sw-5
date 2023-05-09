package com.nopcommerce.sw5.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.sw5.customerlisteners.CustomListeners;
import com.nopcommerce.sw5.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement registerText;

    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstNameTextBox;

    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastNameTextBox;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailTextBox;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement passwordTextBox;

    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordTextBox;

    @CacheLookup
    @FindBy(id = "register-button")
    WebElement registerButton;

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement registerSuccessText;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueButton;



    public String getRegisterText() {
        Reporter.log("Get message from webpage ");
        CustomListeners.test.log(Status.PASS, "Send text to quantity");
        return getTextFromElement(registerText);
    }

    public void inputFirstname(String firstname) {
        Reporter.log("Get message from webpage ");
        sendTextToElement(firstNameTextBox, firstname);
        CustomListeners.test.log(Status.PASS, "Send text to quantity");
    }

    public void inputLastname(String lastname) {
        Reporter.log("Get message from webpage ");
        sendTextToElement(lastNameTextBox, lastname);
        CustomListeners.test.log(Status.PASS, "Send text to quantity");
    }

    public void inputEmail(String email) {
        Reporter.log("Get message from webpage ");
        sendTextToElement(emailTextBox, email);
        CustomListeners.test.log(Status.PASS, "Send text to quantity");
    }

    public void inputPassword(String password) {
        Reporter.log("Get message from webpage ");
        sendTextToElement(passwordTextBox, password);
        CustomListeners.test.log(Status.PASS, "Send text to quantity");
    }

    public void inputConfirmPassword(String confirmpassword) {
        Reporter.log("Get message from webpage ");
        sendTextToElement(confirmPasswordTextBox, confirmpassword);
        CustomListeners.test.log(Status.PASS, "Send text to quantity");
    }

    public void clickOnRegisterButton() {
        Reporter.log("Get message from webpage ");
        clickOnElement(registerButton);
        CustomListeners.test.log(Status.PASS, "Send text to quantity");

    }

    public String getRegisterSuccessText() {
        Reporter.log("Get message from webpage ");
        CustomListeners.test.log(Status.PASS, "Send text to quantity");

        return getTextFromElement(registerSuccessText);
    }

    public void clickOnContinueButton() {
        Reporter.log("Get message from webpage ");
        clickOnElement(continueButton);
        CustomListeners.test.log(Status.PASS, "Send text to quantity");

    }
}
