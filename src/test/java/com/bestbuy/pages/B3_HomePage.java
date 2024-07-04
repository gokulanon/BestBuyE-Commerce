package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.Sewrappers;

public class B3_HomePage extends Sewrappers {
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[1]/div[2]/a[2]/img")
	public WebElement country;
	
	//goes to the Homepage of url
	public void homepage() {
		
	waitForElement(country,5);
	clickElement(country);
	
	}
}
