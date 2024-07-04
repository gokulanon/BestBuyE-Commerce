package com.bestbuy.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.Sewrappers;

public class B9_Add_Item_Shop_By_Department extends Sewrappers {

	@FindBy(xpath ="//button[@aria-label='Menu']")
	public WebElement Menu;

	//Adds the Item from Menu by selecting Shop by department
	
	public void Menu_brands_add_item(String MenuOption,String Shop_by_department_Option,String Products) {
		waitForElementToBeClickable(Menu,20);
		actionsClick(Menu);

		List<WebElement> MenuOptions=driver.findElements(By.xpath("//ul[@class='hamburger-menu-flyout-list']//li/button"));
		BootStrap_dropdown(MenuOptions, MenuOption);

		List<WebElement> Shop_by_department=driver.findElements(By.xpath("//ul[@class='hamburger-menu-flyout-list hamburger-menu-flyout-sidecar-list']//li/a"));
		BootStrap_dropdown(Shop_by_department,Shop_by_department_Option);

		waitForElementToBeClickable(Menu, 20);
		List<WebElement> SubMenuOptions=driver.findElements(By.className("hamburger-menu-flyout-list"));
		BootStrap_dropdown(SubMenuOptions, Products);

	}
}
