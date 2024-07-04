package com.bestbuy.utils;
import org.openqa.selenium.support.PageFactory;
import com.bestbuy.pages.*;

public class BestBuyWrappers extends Sewrappers {
	
	public void Launchchromebrowser(String url) {
		B1_Open_WebBrowser_Navigate_Url browser=PageFactory.initElements(driver, B1_Open_WebBrowser_Navigate_Url.class);
		browser.LaunchchromeBrowser(url);		
	}
	public void validate_url(String url) {
		B2_Validate_Url  validateurl=PageFactory.initElements(driver, B2_Validate_Url.class);
		B2_Validate_Url.isLinkBroken(url);
		validateurl.validating_url(url);
	}
	
public void Homepage(){
		
		B3_HomePage homepage=PageFactory.initElements(driver, B3_HomePage.class);
		homepage.homepage();
	}
	
	public void signup(String fname,String lname,String email,String pswd,String cpwsd,String mnum) {
		B4_SignupPage signuppage=PageFactory.initElements(driver, B4_SignupPage.class);
		signuppage.signup_method(fname, lname, email, pswd, cpwsd, mnum);
		signuppage.validate_signup_Functionality();
	}
	
	public void signin(String emailId,String pswd) {
		B5_LoginPage loginpage=PageFactory.initElements(driver, B5_LoginPage.class);
		loginpage.clickAccount();
		loginpage.clicksignin();
		loginpage.Typeusername(emailId);
		loginpage.Typepassword(pswd);
		loginpage.clicklogin();
		loginpage.validate_login_Functionality();
	}
	public void Menu_Title_Validate() {
		B6_Navigation_of_All_Menu menu=PageFactory.initElements(driver, B6_Navigation_of_All_Menu.class);
		menu.ClickMenu_validate_Title();
	}
	public void ValidatebottomLink_Homepage() {
		B7_Validate_Bottom_Link bottomlink=PageFactory.initElements(driver, B7_Validate_Bottom_Link.class);
		bottomlink.footer_Link();
	}
	public void search_item(String item) {
		B8_Add_Item_To_Cart cartpage=PageFactory.initElements(driver, B8_Add_Item_To_Cart.class);
		cartpage.search_item_method(item);
		cartpage.Add_to_cart_method();
	}
	public void menu_by_department(String MenuOption,String Shop_by_department_Option,String Products) {
		B9_Add_Item_Shop_By_Department dep=PageFactory.initElements(driver, B9_Add_Item_Shop_By_Department.class);
		dep.Menu_brands_add_item(MenuOption, Shop_by_department_Option, Products);
	}
	public void menu_by_Brands(String Brand,String BrandOption,String Products) {
		BB10_Add_Item_Menu_BY_Brands brnds=PageFactory.initElements(driver, BB10_Add_Item_Menu_BY_Brands.class);
		brnds.Menu_brands_add_item(Brand,BrandOption,Products);
	}
	public void navigate_checkoutPage() {
		BB11_Navigate_CheckoutPage checkout=PageFactory.initElements(driver, BB11_Navigate_CheckoutPage.class);
		checkout.Do_checkout();
	}
	public void Fill_Paymentpage(String name,String cNum,String exp,String cvv) {
		BB12_Fill_Payment_Page payment=PageFactory.initElements(driver, BB12_Fill_Payment_Page.class);
		payment.do_payment(name, cNum, exp, cvv);
	}
	public void verify_order() {
		BB13_Verify_Order_Placed order=PageFactory.initElements(driver, BB13_Verify_Order_Placed.class);
		order.verify_confrimation_message();
	}
	
}
