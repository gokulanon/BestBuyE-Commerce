package com.bestbuy.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.Sewrappers;

public class BB10_Add_Item_Menu_BY_Brands extends Sewrappers {

	@FindBy(xpath ="//button[text()='Brands']") 
	public WebElement Brands;

	@FindBy(xpath ="//button[@aria-label='Menu']")
	public WebElement Menu;

	//Adds the Item from Menu by selecting brands
	public void Menu_brands_add_item(String MenuOption,String BrandOption,String Products) {
		waitForElementToBeClickable(Menu,20);
		actionsClick(Menu);

		List<WebElement> MenuOptions=driver.findElements(By.xpath("//ul[@class='hamburger-menu-flyout-list']//li/button"));
		BootStrap_dropdown(MenuOptions, MenuOption);

		List<WebElement> Brands=driver.findElements(By.xpath("//ul[@class='hamburger-menu-flyout-list hamburger-menu-flyout-sidecar-list']//li/a"));
		BootStrap_dropdown(Brands, BrandOption);

		waitForElementToBeClickable(Menu, 20);
		List<WebElement> Apple_products=driver.findElements(By.className("hamburger-menu-flyout-list"));
		BootStrap_dropdown(Apple_products, Products);

	}

}
