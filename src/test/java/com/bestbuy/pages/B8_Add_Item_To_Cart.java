package com.bestbuy.pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.bestbuy.utils.Sewrappers;

public class B8_Add_Item_To_Cart extends Sewrappers {

	@FindBy(id="gh-search-input")
	public WebElement item_search_bar;

	@FindBy(css ="button[data-sku-id='6537366']")
	public WebElement ADD_TO_CART_BUTTON;

	@FindBy(css ="a.c-button.c-button-secondary")
	public WebElement Go_to_BUTTON;

	@FindBy(xpath ="//button[@aria-label='Menu']")
	public WebElement Menu;

	// Search Item form the search Bar
	public void search_item_method(String item) {
		waitForElementToBeClickable(item_search_bar,20);
		actionsMoveToElement(item_search_bar);
		typeText(item_search_bar,item);
		item_search_bar.sendKeys(Keys.ENTER);
	}

	//Adds the item to Cart
	public void Add_to_cart_method() {
		
		waitForElementToBeClickable(ADD_TO_CART_BUTTON,20);
		actionsClick(ADD_TO_CART_BUTTON);

		waitForElementToBeClickable(Go_to_BUTTON,20);
		actionsClick(Go_to_BUTTON); 
	}

}
