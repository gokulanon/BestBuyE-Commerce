package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.Sewrappers;

public class B5_LoginPage extends Sewrappers {

	@FindBy(xpath="//button[@id='account-menu-account-button']")
	public WebElement account;
	
	@FindBy(xpath="//a[contains(text(),'Sign In')]")
	public WebElement signin;
	
	@FindBy(id="fld-e")
	public WebElement emailid;
	
	@FindBy(name="fld-p1")
	public WebElement password;
	
	
	@FindBy(xpath="//button[contains(@class,'c-button c-button-secondary')]")
	public WebElement sigin_button;
	

	@FindBy(id="confirmationMessage")
	public WebElement confirmationMessage;
	
	public void clickAccount() {
		waitForElement(account,20);
		clickElement(account);
	}
	public void clicksignin() {
		waitForElement(signin,20);
		clickElement(signin);
	}
	public void Typeusername(String emailId) {
	waitForElement(emailid, 20);
	typeText(emailid, emailId);
	}
	public void Typepassword(String pswd) {
		waitForElement(password,20);
		typeText(password, pswd);
	}
	public void clicklogin() {
		waitForElement(sigin_button,20);
		clickElement(sigin_button);
	}
	

	//validating the login functionality 
	public void validate_login_Functionality() {
		if (confirmationMessage.isDisplayed()) {
			System.out.println("Login successful! Confirmation message: " + confirmationMessage.getText());
		} 
		else {
			System.out.println("Login failed!");
		}
	}
	
}
