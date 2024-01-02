package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends Utility {

    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//td[@class='cart_quantity']/button")
    WebElement quantity;

    @CacheLookup
    @FindBy(xpath = "//li[@class='active']")
    WebElement shoppingCartText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Proceed To Checkout']")
    WebElement proceedToCheckoutButton;

    @CacheLookup
    @FindBy(xpath = "//u[normalize-space()='Register / Login']")
    WebElement registerLinkCheckoutPopup;

    @CacheLookup
    @FindBy(xpath = "//i[@class='fa fa-times']")
    WebElement removeProductButton;

    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Cart is empty!']")
    WebElement emptyCartText;

    @CacheLookup
    @FindBy (xpath = "//h4/a")
    WebElement productNameInCart;


    public String getQuantity() {
        log.info("Getting quantity from shopping cart page : " +quantity.toString());
        return getTextFromElement(quantity);
    }

    public String getShoppingCartText(){
        log.info("Getting shopiing cart text : " +shoppingCartText.toString());
        return getTextFromElement(shoppingCartText);
    }
    public void clickOnProceedToCheckoutButton(){
        clickOnElement(proceedToCheckoutButton);
        log.info("Clicking on procced to checkout button: "+proceedToCheckoutButton.toString());
    }
    public void clickOnRegisterLink(){
        clickOnElement(registerLinkCheckoutPopup);
        log.info("Clicking on register link in checkout popup: "+registerLinkCheckoutPopup.toString());
    }
    public void clickOnRemoveProductButton(){
        clickOnElement(removeProductButton);
        log.info("Clicking on X to remove product from cart: "+removeProductButton.toString());
    }
    public String getEmptyCartText(){
        log.info("Getting shopping cart is empty text : " +emptyCartText.toString());
        return getTextFromElement(emptyCartText);
    }
    public String getProductNameFromCart(){
        log.info("Getting product name from cart : " +productNameInCart);
        return getTextFromElement(productNameInCart);
    }
}
