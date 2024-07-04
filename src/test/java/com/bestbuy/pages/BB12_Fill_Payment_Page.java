package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.bestbuy.utils.Sewrappers;

public class BB12_Fill_Payment_Page extends Sewrappers{

	// Fill out the payment form with dummy information
	@FindBy(xpath = "nameXPath")
	public WebElement nameInput;

	@FindBy(xpath = "cardNumberXPath")
	public WebElement cardNumberInput;

	@FindBy(xpath = "expirationXPath")
	public WebElement expirationInput;

	@FindBy(xpath = "cvvXPath")
	public WebElement cvvInput;

	@FindBy(xpath = "submitButtonXPath")
	public WebElement submitButton;

	String nameXPath = "//input[@id='name']";
	String cardNumberXPath = "//input[@id='cardNumber']";
	String expirationXPath = "//input[@id='expiration']";
	String cvvXPath = "//input[@id='cvv']";
	String submitButtonXPath = "//button[@id='submit']";

	public void do_payment(String name,String cNum,String exp,String cvv) {
		
		// Replace with your dummy payment information
		waitForElement(nameInput, 20);
		typeText(nameInput, name);
		
		waitForElement(cardNumberInput, 20);
		typeText(cardNumberInput, cNum);
		
		waitForElement(expirationInput, 20);
		typeText(expirationInput, exp);
		
		waitForElement(cvvInput, 20);
		typeText(cvvInput, cvv);
		
		// Submit the form
		submitButton.click();
	}
}
