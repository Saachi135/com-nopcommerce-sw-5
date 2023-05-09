package com.nopcommerce.sw5.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.sw5.customerlisteners.CustomListeners;
import com.nopcommerce.sw5.utility.Utility;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class NokiaLumia1020Page extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1")
    WebElement nokiaLumiaText;

    @CacheLookup
    @FindBy(id = "price-value-20")
    WebElement nokiaPriceText;

    @CacheLookup
    @FindBy(id = "product_enteredQuantity_20")
    WebElement cartQuantity;

    @CacheLookup
    @FindBy(id = "add-to-cart-button-20")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement productAddedToCartText;

    @CacheLookup
    @FindBy(xpath = "//span[@title='Close']")
    WebElement closeTheBarMsg;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement shoppingCartElement;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement goToCartElement;


    public String getNokiaLumiaText() {
        Reporter.log("Get message from webpage ");
        CustomListeners.test.log(Status.PASS, "Get message from webpage ");
        return getTextFromElement(nokiaLumiaText);
    }

    public String getNokiaPriceText() {
        Reporter.log("Get message from webpage ");
        CustomListeners.test.log(Status.PASS, "Get message from webpage ");
        return getTextFromElement(nokiaPriceText);
    }

    public void changeQuantity() {
        Reporter.log("Send quantity to cart ");
        sendTextToElement(cartQuantity, Keys.BACK_SPACE + "2");
        CustomListeners.test.log(Status.PASS, "Send quantity to cart ");
    }

    public void clickOnAddToCartButton() {
        Reporter.log("Click on cart button ");
        clickOnElement(addToCartButton);
        CustomListeners.test.log(Status.PASS, "Click on cart button");
    }

    public String getTextFromProductAddedToCart() {
        Reporter.log("Get message from webpage ");
        CustomListeners.test.log(Status.PASS, "Get message from webpage ");
        return getTextFromElement(productAddedToCartText);
    }

    public void closeTheBarByClickingOnTheCrossButton() {
        Reporter.log("Click on Cross button");
        clickOnElement(closeTheBarMsg);
        CustomListeners.test.log(Status.PASS, "Click on Cross button ");
    }

    public void mouseHoverOnShoppingCart() {
        Reporter.log("Mouse hover on shopping cart ");
        mouseHoverToElement(shoppingCartElement);
        CustomListeners.test.log(Status.PASS, "Mouse hover on shopping cart");
    }

    public void clickOnShoppingCart() {
        Reporter.log("Click on shopping cart ");
        clickOnElement(goToCartElement);
        CustomListeners.test.log(Status.PASS, "Click on shopping cart ");
    }
}
