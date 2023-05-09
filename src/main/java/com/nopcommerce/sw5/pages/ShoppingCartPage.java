package com.nopcommerce.sw5.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.sw5.customerlisteners.CustomListeners;
import com.nopcommerce.sw5.utility.Utility;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ShoppingCartPage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement shoppingCartText;

    @CacheLookup
    @FindBy(xpath = "//td[@class=\\\"quantity\\\"]/child::input")
    WebElement quantity;

    @CacheLookup
    @FindBy(id = "updatecart")
    WebElement updateShoppingCart;

    @CacheLookup
    @FindBy(xpath = "//span[@class='value-summary']//strong[contains(text(),'$2,950.00')]")
    WebElement total;

    @CacheLookup
    @FindBy(id = "termsofservice")
    WebElement termsOfServiceCheckBox;

    @CacheLookup
    @FindBy(id = "checkout")
    WebElement checkOutButton;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'(2)')]")
    WebElement verifyQuantity;

    @CacheLookup
    @FindBy(xpath = "//span[@class='value-summary']//strong[contains(text(),'$698.00')]")
    WebElement verifyTotal;


    public String getShoppingCartText() {
        Reporter.log("Get message from webpage ");
        CustomListeners.test.log(Status.PASS, "Get message from webpage");
        return getTextFromElement(shoppingCartText);
    }

    public void changeQuantity() {
        Reporter.log("Send text to quantity");
        sendTextToElement(quantity, Keys.BACK_SPACE + "2");
        CustomListeners.test.log(Status.PASS, "Send text to quantity");
    }

    public void clickOnUpdateCartButton() {
        Reporter.log("Update shopping cart ");
        clickOnElement(updateShoppingCart);
        CustomListeners.test.log(Status.PASS, "Update shopping cart ");
    }

    public String getTotalText() {
        Reporter.log("Get message from webpage ");
        CustomListeners.test.log(Status.PASS, "Get message from webpage ");
        return getTextFromElement(total);
    }


    public void clickOnTermsOfServiceCheckBox() {
        Reporter.log("Click on Checkbox ");
        clickOnElement(termsOfServiceCheckBox);
        CustomListeners.test.log(Status.PASS, "Click on Checkbox ");
    }

    public void clickOnCheckOutButton() {
        Reporter.log("Click on Checkout ");
        clickOnElement(checkOutButton);
        CustomListeners.test.log(Status.PASS, "Click on Checkbox ");
    }

    public String getVerifyQuantity() {
        Reporter.log("Get message from webpage ");
        CustomListeners.test.log(Status.PASS, "Get message from webpage ");
        return getTextFromElement(verifyQuantity);

    }

    public String getVerifyTotal() {
        Reporter.log("Get message from webpage ");
        CustomListeners.test.log(Status.PASS, "Get message from webpage ");
        return getTextFromElement(verifyTotal);

    }
}
