package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.Sewrappers;

public class BB11_Navigate_CheckoutPage extends Sewrappers {

	@FindBy(xpath = "//a[.='Cart']")
	public WebElement cart_button;
	
	@FindBy(xpath = "//button[text()='Checkout']")
	public WebElement Checkout;
	
	//Goes to cart and checkout the items to payment page
	public void Do_checkout() {
		waitForElementToBeClickable(cart_button, 20);
		actionsClick(cart_button);
		
		waitForElementToBeClickable(Checkout, 20);
		actionsClick(Checkout);
		
	}
}
