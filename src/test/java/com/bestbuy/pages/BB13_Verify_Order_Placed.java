package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BB13_Verify_Order_Placed {


	// Find the confirmation message element
	@FindBy(xpath = "confirmationMessageXPath")
	public WebElement confirmationMessage;

	//  XPath for the order confirmation message
	String confirmationMessageXPath = "//div[contains(text(),'Your order has been successfully placed.')]";

	public void verify_confrimation_message() {
		// Verify the order confirmation message
		if (confirmationMessage.isDisplayed()) {
			System.out.println("Order was placed successfully. Confirmation message found.");
		} else {
			System.out.println("Order confirmation message not found. Order may not have been placed successfully.");
		}
	}
}
