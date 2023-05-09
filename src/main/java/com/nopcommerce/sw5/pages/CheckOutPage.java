package com.nopcommerce.sw5.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.sw5.customerlisteners.CustomListeners;
import com.nopcommerce.sw5.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CheckOutPage extends Utility {
    @CacheLookup
    @FindBy(id = "BillingNewAddress_FirstName")
    WebElement firstNameTextBox;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_LastName")
    WebElement lastNameTextBox;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_Email")
    WebElement emailTextBox;


    @CacheLookup
    @FindBy(id = "BillingNewAddress_CountryId")
    WebElement countryDropdown;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_City")
    WebElement cityTextBox;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_Address1")
    WebElement address1TextBox;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement postalcodeTextBox;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement phoneNumberTextBox;

    @CacheLookup
    @FindBy(xpath = "//button[@onclick='Billing.save()']")
    WebElement continueButton;

    @CacheLookup
    @FindBy(id = "shippingoption_1")
    WebElement nextDayAirRadioButton;

    @CacheLookup
    @FindBy(id = "paymentmethod_1")
    WebElement creditCard;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
    WebElement paymentContinue;

    @CacheLookup
    @FindBy(xpath = "//button[@onclick='ShippingMethod.save()']")
    WebElement continueButton1;

    @CacheLookup
    @FindBy(id = "CreditCardType")
    WebElement creditCardDropDown;

    @CacheLookup
    @FindBy(id = "CardholderName")
    WebElement cardHolderName;

    @CacheLookup
    @FindBy(id = "CardNumber")
    WebElement cardNumber;

    @CacheLookup
    @FindBy(id = "ExpireMonth")
    WebElement expireMonthDropdown;

    @CacheLookup
    @FindBy(id = "ExpireYear")
    WebElement expireYearDropdown;

    @CacheLookup
    @FindBy(id = "CardCode")
    WebElement cardCode;

    @CacheLookup
    @FindBy(xpath = "(//button[@class='button-1 payment-info-next-step-button'])[1]")
    WebElement continueButton2;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Credit Card')]")
    WebElement creditCardText;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Next Day Air')]")
    WebElement nextDayAirText;

    @CacheLookup
    @FindBy(xpath = "//span[@class='value-summary']//strong[contains(text(),'$2,950.00')]")
    WebElement totalAmountText;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Confirm')]")
    WebElement confirmButton;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Thank you')]")
    WebElement thankYouText;

    @CacheLookup
    @FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
    WebElement orderSuccessProcessText;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButton3;

    @CacheLookup
    @FindBy(id = "shippingoption_2")
    WebElement radioButton2ndDayAir;

    @CacheLookup
    @FindBy(xpath = "//span[contains(.,'2nd Day Air')]")
    WebElement secondDayAirText;

    @CacheLookup
    @FindBy(xpath = "//span[@class='value-summary']//strong[contains(text(),'$698.00')]")
    WebElement totalAmountNokiaText;


    public void inputFirstname(String firstname) {
        Reporter.log("Input FirstName");
        sendTextToElement(firstNameTextBox, firstname);
        CustomListeners.test.log(Status.PASS, "Input FirstName");
    }

    public void inputLastname(String lastname) {
        Reporter.log("Input Lastname");
        sendTextToElement(lastNameTextBox, lastname);
        CustomListeners.test.log(Status.PASS, "Input LastName");

    }

    public void inputEmail(String email) {
        Reporter.log("Input email");
        sendTextToElement(emailTextBox, email);
        CustomListeners.test.log(Status.PASS, "Input LastName");
    }

    public void selectCountry(String countryname) {
        Reporter.log("Select Country");
        selectByVisibleTextFromDropDown(countryDropdown, countryname);
        CustomListeners.test.log(Status.PASS, "Select Country");
    }

    public void inputCity(String cityname) {
        Reporter.log("Input City");
        sendTextToElement(cityTextBox, cityname);
        CustomListeners.test.log(Status.PASS, "Input City");

    }

    public void inputAddress1(String address) {
        Reporter.log("Input Address");
        sendTextToElement(address1TextBox, address);
        CustomListeners.test.log(Status.PASS, "Input Address");

    }

    public void inputPostalCode(String postcode) {
        Reporter.log("Input PostalCode");
        sendTextToElement(postalcodeTextBox, postcode);
        CustomListeners.test.log(Status.PASS, "Input PostalCode");

    }

    public void inputPhoneNumber(String phone) {
        Reporter.log("Input PhoneNumber");
        sendTextToElement(phoneNumberTextBox, phone);
        CustomListeners.test.log(Status.PASS, "Input PhoneNumber");

    }

    public void clickOnContinueButton() {
        Reporter.log("Click on Continue Button");
        clickOnElement(continueButton);
        CustomListeners.test.log(Status.PASS, "Click on Continue Button");

    }

    public void clickOnNextDayAirRadioButton() {
        Reporter.log("Click on Next Day Air Radio Button");
        clickOnElement(nextDayAirRadioButton);
        CustomListeners.test.log(Status.PASS, "Click on Next Day Air Radio Button");

    }

    public void clickOnContinueButton1() {
        Reporter.log("Click on Continue Button");
        clickOnElement(continueButton1);
        CustomListeners.test.log(Status.PASS, "Click on Continue Button");

    }

    public void clickOnCreditCard() {
        Reporter.log("Click on Credit Card");
        clickOnElement(creditCard);
        CustomListeners.test.log(Status.PASS, "Click on Credit Card");

    }

    public void clickOnPaymentContinueButton() {
        Reporter.log("Click on Payment button");
        clickOnElement(paymentContinue);
        CustomListeners.test.log(Status.PASS, "Click on Payment button");

    }

    public void selectCreditCard(String card) {
        Reporter.log("Select Credit Card");
        selectByVisibleTextFromDropDown(creditCardDropDown, card);
        CustomListeners.test.log(Status.PASS, "Select Credit Card");

    }

    public void inputCardHolderName(String holdername) {
        Reporter.log("Input Card Holder Name");
        sendTextToElement(cardHolderName, holdername);
        CustomListeners.test.log(Status.PASS, "Input Card Holder Name");

    }

    public void inputCardNumber(String card) {
        Reporter.log("Input Card Number");
        sendTextToElement(cardNumber, card);
        CustomListeners.test.log(Status.PASS, "Input Card Number");

    }

    public void selectExpireMonth(String expirymonth) {
        Reporter.log("Select Expire Month");
        selectByVisibleTextFromDropDown(expireMonthDropdown, expirymonth);
        CustomListeners.test.log(Status.PASS, "Select Expire Month");

    }

    public void selectExpireYear(String expiryyear) {
        Reporter.log("Select Expire Year");
        selectByVisibleTextFromDropDown(expireYearDropdown, expiryyear);
        CustomListeners.test.log(Status.PASS, "Select Expire Year");

    }

    public void inputCardCode(String cvc) {
        Reporter.log("Input Card Code");
        sendTextToElement(cardCode, cvc);
        CustomListeners.test.log(Status.PASS, "Input Card Code");

    }

    public void clickOnContinueButton2() {
        Reporter.log("Click on Continue Button");
        clickOnElement(continueButton2);
        CustomListeners.test.log(Status.PASS, "Click on Continue Button");

    }

    public String getCreditCardText() {
        Reporter.log("Get Credit Card Text");
        CustomListeners.test.log(Status.PASS, "Get Credit Card Text");
        return getTextFromElement(creditCardText);

    }

    public String getNextDayAirText() {
        Reporter.log("Get Next DayAir Text");
        CustomListeners.test.log(Status.PASS, "Get Next DayAir Text");
        return getTextFromElement(nextDayAirText);
    }

    public String getTotalAmountText() {
        Reporter.log("Get Total Amount Text");
        CustomListeners.test.log(Status.PASS, "Get Total Amount Text");
        return getTextFromElement(totalAmountText);
    }

    public void clickOnConfirmButton() {
        Reporter.log("Click on Confirm Button");
        clickOnElement(confirmButton);
        CustomListeners.test.log(Status.PASS, "Click on Confirm Button");

    }

    public String getThankYouText() {
        Reporter.log("Get Thank You Text");
        CustomListeners.test.log(Status.PASS, "Get Thank You Text");
        return getTextFromElement(thankYouText);
    }

    public String getOrderSuccessProcessText() {
        Reporter.log("Get Order Success Process Text");
        CustomListeners.test.log(Status.PASS, "Get Order Success Process Text");
        return getTextFromElement(orderSuccessProcessText);
    }

    public void clickOnContinueButton3() {
        Reporter.log("Click on Continue Button");
        clickOnElement(continueButton3);
        CustomListeners.test.log(Status.PASS, "Click on Continue Button");

    }

    public void clickOnRadioButton2ndDayAir() {
        Reporter.log("Click on DayAir Button");
        clickOnElement(radioButton2ndDayAir);
        CustomListeners.test.log(Status.PASS, "Click on DayAir Button");
    }

    public String get02ndDayText() {
        Reporter.log("Get 2nd Day Text");
        CustomListeners.test.log(Status.PASS, "Get 2nd Day Text");
        return getTextFromElement(secondDayAirText);
    }

    public String getTotalAmountNokiaText() {
        Reporter.log("Get Total Amount Nokia Text");
        CustomListeners.test.log(Status.PASS, "Get Total Amount Nokia Text");
        return getTextFromElement(totalAmountNokiaText);
    }
}
