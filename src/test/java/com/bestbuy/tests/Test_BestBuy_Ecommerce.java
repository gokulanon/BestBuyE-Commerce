package com.bestbuy.tests;
import org.testng.annotations.Test;
import com.bestbuy.utils.*;


public class Test_BestBuy_Ecommerce extends Sewrappers{
	BestBuyWrappers bb=new BestBuyWrappers();
	Reports report = new Reports();

	@Test (priority = 1)
	public void launchbrowser_Navigate_to_url() {
		try {
			report.setTCDesc("TC01-Launching Chrome With Url-https://www.bestbuy.com/");
			bb.Launchchromebrowser("https://www.bestbuy.com/");
			bb.Homepage();
			Reports.reportstep("PASS", "Launched Chrome Browser With Url-https://www.bestbuy.com/ Successfully");
		} catch (Exception e) {
			Reports.reportstep("FAIL", "Launching Chrome Browser Failed ");
		}		
	}

	@Test(priority =2 )
	public void Validate_Url_TestCase() {
		try {
			report.setTCDesc("TC02-Validating Given Url is broken Or Not");
			bb.Homepage();
			bb.validate_url("https://www.bestbuy.com/");
			Reports.reportstep("PASS", "TestCase passed by validating Url");
		} catch (Exception e) {
			Reports.reportstep("FAIL", "TestCase Failed by validating Url");
		}
	}
	@Test(priority = 3)
	public void Homepage_functionality_TestCase() {
		try {
			report.setTCDesc("TC03-Homepage Functionality With- country");
			bb.Homepage();
			Reports.reportstep("PASS", "Homepage Functionality- opened Successfully");
		} catch (Exception e) {
			Reports.reportstep("FAIL", "Homepage Functionality Failed");
		}
	}

	@Test(priority = 4)
	public void signup_functionality_TestCase() {
		try {
			report.setTCDesc("TC04-Signup Functionality With- New Account");
			bb.signup("john","petter","johnpetter@gmail.com","johnjohn @123","johnjohn @123","9876543210");
			Reports.reportstep("PASS", "SignUp Functionality-New Account Created Successfully");
		} catch (Exception e) {
			Reports.reportstep("FAIL", "SignUp Functionality Failed");
		}
	}


	@Test(priority = 5)
	public void signin_functionality_TestCase() {
		try {
			report.setTCDesc("TC05-SignIn Functionality With- Correct UserName and Password");
			bb.signin("Johnpetter@gmail.com","johnjohn @123");
			Reports.reportstep("INFO", " Email Id Successfully");
			Reports.reportstep("INFO", " Password Successfully");
			Reports.reportstep("PASS", "Login Functionality Successfully");
		} catch (Exception e) {
			Reports.reportstep("FAIL", "LognIn Functionality Failed");
		}
	}

	@Test(priority = 6)
	public void Menu_Navigation_TestCase() {
		try {
			report.setTCDesc("TC06-Validating title in the each Webpage of the all Menu Option");
			bb.Menu_Title_Validate();
			Reports.reportstep("PASS", "Validation of Title in Each Webpage Successfully");
		} catch (Exception e) {
			Reports.reportstep("FAIL", "Validation of Title in Each Webpage Failed");
		}
	}

	@Test(priority = 7)
	public void Validate_BottomLink_TestCase() {
		try {
			report.setTCDesc("TC07-Validating Bottom Links of  Homepage in the Homepage");
			bb.ValidatebottomLink_Homepage();
			Reports.reportstep("PASS", "Validation of Bottom Links in Homepage Successfully");
		} catch (Exception e) {
			Reports.reportstep("FAIL", "Validation of Bottom Links in Homepage Failed");
		}
	}

	@Test(priority = 8)
	public void add_to_cart_TestCase() {
		try {
			report.setTCDesc("TC08-Search Item in the SearchBar and  Add to Cart ");
			bb.search_item("samsung tv 55 inch");
			Reports.reportstep("PASS", "Item  Successfully Added to cart");
		} catch (Exception e) {
			Reports.reportstep("FAIL", "Add to cart is Failed");
		}
	}

	@Test(priority = 9)
	public void add_item_shop_by_Department() {
		try {
			report.setTCDesc("TC09-Adding item to cart from Menu - shop by Department ");
			bb.menu_by_department("Appliances", "Major Kitchen Appliances", "DishWashers");
			Reports.reportstep("PASS", "Added item to cart from Menu - shop by Department is Successfull");
		} catch (Exception e) {
			Reports.reportstep("FAIL", "Adding item to cart from Menu - shop by Department is Failed");
		}
	}

	@Test(priority = 10)
	public void add_item_By_brands() {
		try {
			report.setTCDesc("TC10-Adding item to cart from Menu -By Brands ");
			bb.menu_by_Brands("Brands","samsung","Smartphones");
			Reports.reportstep("PASS", "item to cart from Menu -By Brands Added Succesfully");
		} catch (Exception e) {
			Reports.reportstep("FAIL", "Adding item to cart from Menu -By Brands is Failed");
		}
	}

	@Test(priority = 11)
	public void Navigate_CheckoutPage() {
		try {
			report.setTCDesc("TC11-Navigating to Checkout Page ");
			bb.navigate_checkoutPage();
			Reports.reportstep("PASS", "Nagivatoin for Checkout page is successfull");
		} catch (Exception e) {
			Reports.reportstep("FAIL", "Nagivatoin for Checkout page is Failed");
		}
	}

	@Test(priority = 12)
	public void Fill_payment_page() {
		try {
			report.setTCDesc("TC12-Filling payment details to proceed paymet ");
			bb.Fill_Paymentpage("John", "1234 5678 9012 3456", "12/23", "123");
			Reports.reportstep("PASS", "Payment Done Successfully");

		} catch (Exception e) {
			Reports.reportstep("FAIL", " Payment Failed");
		}
	}



	@Test(priority = 13)
	public void Verify_OrderPlaced_TestCase() {
		try {
			report.setTCDesc("TC13-Verifing Whether the Order is placed or not ");
			bb.verify_order();
			Reports.reportstep("PASS", "Order Placed Successfully");
		} catch (Exception e) {
			Reports.reportstep("FAIL", "Failed to proceed the Order");
		}
	}

	@Test(priority = 14)
	public void closebrowser() {
		closeAllBrowsers();
	}
}
