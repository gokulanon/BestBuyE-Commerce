package com.bestbuy.pages;

import com.bestbuy.utils.Sewrappers;

public class B1_Open_WebBrowser_Navigate_Url extends Sewrappers {

	//Launch Chrome Browser & set Location Permission as allowed by default

	public void LaunchchromeBrowser(String url){
		launchChromeBrowser(url);
	}
}
//Extends from Sewrappers
/*ChromeOptions options=new ChromeOptions();
		HashMap<String, Integer> contentsettings=new HashMap<String, Integer>();
		HashMap<String, Object> profile=new HashMap<String, Object>();
		HashMap<String, Object> prefs=new HashMap<String, Object>();

		contentsettings.put("geolocation", 1);
		profile.put("managed_default_content_settings", contentsettings);
		prefs.put("profile", profile);
		options.setExperimentalOption("prefs", prefs);

		driver =new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
 */	

