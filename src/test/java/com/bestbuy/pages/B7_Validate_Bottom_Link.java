package com.bestbuy.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.bestbuy.utils.Sewrappers;

public class B7_Validate_Bottom_Link extends Sewrappers{
	
	//validate the Bottom links the footer of the webpage
	public void footer_Link() {
		List<WebElement> bottomLinks=driver.findElements(By.xpath("//a[@class='body-copy-sm mr-200']"));
		for(WebElement bottomLink:bottomLinks) {
			System.out.println(bottomLink.getText());
			//Validate the bottom or footer link in HomePage
			String url = bottomLink.getAttribute("href");
			if (url != null && !url.isEmpty()) {
				System.out.println("Link URL: " + url + " Page Title: " + driver.getTitle());
			} else {
				System.out.println("Link URL is either not configured or empty");
			}
		}
	}
}
