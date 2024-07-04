package com.bestbuy.pages;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.bestbuy.utils.Sewrappers;

public class B6_Navigation_of_All_Menu extends Sewrappers{

	@FindBy(xpath ="//button[@aria-label='Menu']") 
	public WebElement Menu;

	@FindBy(className ="hamburger-back-button-text") 
	public WebElement Back;

	//Validates the Title of each page in menu options
	public void ClickMenu_validate_Title() {
		waitForElementToBeClickable(Menu,20);
		actionsClick(Menu);
		List<WebElement> MenuOptions=driver.findElements(By.xpath("//ul[@class='hamburger-menu-flyout-list']//li/button"));
		WebElement options;
		for(int i=0;i<MenuOptions.size();i++) {
			options=MenuOptions.get(i);
			waitForElementToBeClickable(options,20);
			actionsClick(options);
			System.out.println(options.getText());
			List<WebElement> SubMenuOptions=driver.findElements(By.xpath("//ul[@class='hamburger-menu-flyout-list hamburger-menu-flyout-sidecar-list']//li/a"));

			for(WebElement SubMenuOption : SubMenuOptions) {
				try {
					waitForElement(SubMenuOption,20);
					actionsClick(SubMenuOption);
					// Validate the page title
					String expectedTitle = "Expected Page Title"; 
					String actualTitle = driver.getTitle();

					if (actualTitle.equals(expectedTitle)) {
						System.out.println("Title is as expected: " + expectedTitle);
					} else {
						System.out.println("Title is not as expected. Actual Title: " + actualTitle);
					}

					// Navigate back to the previous page to continue the loop
					driver.navigate().back();

				} catch (Exception e) {

				}
			}
		}
	}
}


