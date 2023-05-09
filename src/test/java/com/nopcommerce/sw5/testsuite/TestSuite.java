package com.nopcommerce.sw5.testsuite;

import com.nopcommerce.sw5.pages.*;
import com.nopcommerce.sw5.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSuite extends BaseTest {
    BuildYourOwnComputer buildYourOwnComputer;
    CellPhonePage cellPhonePage;
    CheckOutPage checkOutPage;
    ComputerPage computerPage;
    DesktopPage desktopPage;
    ElectronicsPage electronicsPage;
    HomePage homePage;
    LoginPage loginPage;
    NokiaLumia1020Page nokiaLumia1020Page;
    RegisterPage registerPage;
    ShoppingCartPage shoppingCartPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {

        buildYourOwnComputer = new BuildYourOwnComputer();
        cellPhonePage = new CellPhonePage();
        checkOutPage = new CheckOutPage();
        computerPage = new ComputerPage();
        desktopPage = new DesktopPage();
        electronicsPage = new ElectronicsPage();
        homePage = new HomePage();
        loginPage = new LoginPage();
        nokiaLumia1020Page = new NokiaLumia1020Page();
        registerPage = new RegisterPage();
        shoppingCartPage = new ShoppingCartPage();
    }

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() {
        //1.1 Click on Computer Menu.
        homePage.selectMenu("Computers");
        //1.2 Click on Desktop Category
        computerPage.clickOnDesktopCategory();
        //1.3 Select Sort By position "Name: Z to A"
        desktopPage.clickOnSortByNameZToA();
        //1.4 Verify the Product will arrange in Descending order.
        desktopPage.verifyProductsArrangedInAlphabeticallyDescendingOrder();

    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {

        //2.1 Click on Computer Menu.
        homePage.selectMenu("Computers");
        //2.2 Click on Desktop
        computerPage.clickOnDesktopCategory();
        //2.3 Select Sort By position "Name: A to Z"
        desktopPage.clickOnSortByNameAToZ();
        //2.4 Click on "Add To Cart"
        Thread.sleep(3000);
        desktopPage.clickOnAddToCartButton();
        //2.5 Verify the Text "Build your own computer"
        String actualText = buildYourOwnComputer.getTextFromBuildYourComputer();
        String expectedText = "Build your own computer";
        Assert.assertEquals(actualText, expectedText, "Text not Displayed");
        //2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        buildYourOwnComputer.selectProcessor();
        //2.7.Select "8GB [+$60.00]" using Select class.
        buildYourOwnComputer.selectRAM();
        //2.8 Select HDD radio "400 GB [+$100.00]"
        buildYourOwnComputer.selectHDDRadio();
        //2.9 Select OS radio "Vista Premium [+$60.00]"
        buildYourOwnComputer.selectOSRadio();
        //2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
        //buildYourOwnComputer.selectSoftwareMS();
        buildYourOwnComputer.selectTotalCommander();
        Thread.sleep(5000);
        //2.11 Verify the price "$1,475.00"
        String actualPriceText = buildYourOwnComputer.getTextFromPrice();
        String expectedPriceText = "$1,475.00";
        Assert.assertEquals(actualPriceText, expectedPriceText, "Text not Displayed");
        //2.12 Click on "ADD TO CARD" Button.
        buildYourOwnComputer.clickOnAddToCartButton();
        //2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar After that close the bar clicking on the cross button.
        buildYourOwnComputer.verifyTheProductHasBeenAddedToYourShoppingCart();
        buildYourOwnComputer.closeTheBarByClickingOnTheCrossButton();
        //2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        buildYourOwnComputer.mouseHoverOnShoppingCartButton();
        buildYourOwnComputer.clickOnGoToCartButton();
        //2.15 Verify the message "Shopping cart"
        String actualShoppingCartMessage = shoppingCartPage.getShoppingCartText();
        Assert.assertEquals(actualShoppingCartMessage, "Shopping cart", "error");
        Thread.sleep(2000);
        //2.16 Change the Qty to "2" and Click on "Update shopping cart"
        shoppingCartPage.changeQuantity();
        shoppingCartPage.clickOnUpdateCartButton();
        //2.17 Verify the Total"$2,950.00
        String actualTotalMessage = shoppingCartPage.getTotalText();
        Assert.assertEquals(actualTotalMessage, "$2,950.00", "error");
        // 2.18 click on checkbox “I agree with the terms of service”
        shoppingCartPage.clickOnTermsOfServiceCheckBox();
        // 2.19 Click on “CHECKOUT”
        shoppingCartPage.clickOnCheckOutButton();
        // 2.20 Verify the Text “Welcome, Please Sign In!”
        String actualWelcomeSignInText = loginPage.getWelcomePageSignInText();
        Assert.assertEquals(actualWelcomeSignInText, "Welcome, Please Sign In!", "error");
        //2.21 Click on “CHECKOUT AS GUEST”Tab
        loginPage.clickOnCheckoutAsGuestButton();
        //2.22 Fill the all mandatory field
        checkOutPage.inputFirstname("Saachi");
        checkOutPage.inputLastname("Pancha");
        checkOutPage.inputEmail("saachipancha@gmail.com");
        checkOutPage.selectCountry("United Kingdom");
        checkOutPage.inputCity("London");
        checkOutPage.inputAddress1("3 The Close");
        checkOutPage.inputPostalCode("HA0 ");
        checkOutPage.inputPhoneNumber("1234567890");
        //2.23 Click on “CONTINUE”
        checkOutPage.clickOnContinueButton();
        //2.24 Click on Radio Button “Next Day Air($0.00)”
        checkOutPage.clickOnNextDayAirRadioButton();
        // 2.25 Click on “CONTINUE”
        checkOutPage.clickOnContinueButton1();
        // 2.26 Select Radio Button “Credit Card”
        checkOutPage.clickOnCreditCard();
        checkOutPage.clickOnPaymentContinueButton();
        //2.27 Select “Master card” From Select credit card dropdown
        checkOutPage.selectCreditCard("Visa");
        //2.28 Fill all the details
        checkOutPage.inputCardHolderName("S Pancha");
        checkOutPage.inputCardNumber("4345 1234 1234 5678");
        checkOutPage.selectExpireMonth("10");
        checkOutPage.selectExpireYear("2023");
        checkOutPage.inputCardCode("009");
        // 2.29 Click on “CONTINUE”
        checkOutPage.clickOnContinueButton2();
        //2.30 Verify “Payment Method” is “Credit Card”
        String actualCardMessage = checkOutPage.getCreditCardText();
        Assert.assertEquals(actualCardMessage, "Credit Card", "error");
        // 2.32 Verify “Shipping Method” is “Next Day Air”
        String actualShippingMessage = checkOutPage.getNextDayAirText();
        Assert.assertEquals(actualShippingMessage, "Next Day Air", "error");
        //2.33 Verify Total is “$2,950.00”
        String actualTotalAmountMessage = checkOutPage.getTotalAmountText();
        Assert.assertEquals(actualTotalMessage, "$2,950.00", "error");
        //2.34 Click on “CONFIRM”
        checkOutPage.clickOnConfirmButton();
        //2.35 Verify the Text “Thank You”
        String actualThankYouText = checkOutPage.getThankYouText();
        Assert.assertEquals(actualThankYouText, "Thank you", "error");
        // 2.36 Verify the message “Your order has been successfully processed!”
        String actualOrderSuccessText = checkOutPage.getOrderSuccessProcessText();
        Assert.assertEquals(actualOrderSuccessText, "Your order has been successfully processed!", "error");
        // 2.37 Click on “CONTINUE”
        checkOutPage.clickOnContinueButton3();
        // 2.38 Verify the text “Welcome to our store”
        String actualWelcomeStoreText = homePage.getWelcomeOurStoreText();
        Assert.assertEquals(actualWelcomeStoreText, "Welcome to our store", "error");
    }

}


