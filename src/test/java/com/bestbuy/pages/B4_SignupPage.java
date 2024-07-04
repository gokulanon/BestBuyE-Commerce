package com.bestbuy.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.bestbuy.utils.Sewrappers;

public class B4_SignupPage extends Sewrappers{
	
	@FindBy(xpath="//button[@id='account-menu-account-button']")
	public WebElement account;
	
	@FindBy(xpath="//a[text()='Create Account']")
	public WebElement create_account;
	
	@FindBy(id="firstName")
	public WebElement Firstname;
	
	@FindBy(id="lastName")
	public WebElement Lastname;
	
	@FindBy(id="email")
	public WebElement emailaddress;
	
	@FindBy(id="fld-p1")
	public WebElement password;
	
	@FindBy(id="reenterPassword")
	public WebElement confirm_password;
	
	@FindBy(id="phone")
	public WebElement mobilenumber;
	
	@FindBy(xpath="//button[contains(@class,'c-button c-button-secondary')]")
	public WebElement createaccount_button;
	
	@FindBy(id="confirmationMessage")
	public WebElement confirmationMessage;

	
	public void signup_method(String fname,String lname,String email,String pswd,String cpwsd,String mnum) {
		waitForElement_Visibility(account,4);
		actionsClick(account);
		
		waitForElementToBeClickable(create_account,4);
		clickElement(create_account);
		
		waitForElement(Firstname,4);
		typeText(Firstname, fname);
		
		waitForElement(Lastname,4);
		typeText(Lastname,lname);
		
		waitForElement(emailaddress,4);
		typeText(emailaddress, email);
		
		waitForElement(password,4);
		typeText(password, pswd);
		
		waitForElement(confirm_password,4);
		typeText(confirm_password,cpwsd);
		
		waitForElement(mobilenumber,4);
		typeText(mobilenumber,mnum);
		
		waitForElementToBeClickable(createaccount_button,4);
		clickElement(createaccount_button);
	}
	//Validating signup functionality 
		public void validate_signup_Functionality() {

			if (confirmationMessage.isDisplayed()) {
				System.out.println("Sign-up successful! Confirmation message: " + confirmationMessage.getText());
			} 
			else {
				System.out.println("Sign-up failed!");
			}
		}

}
