package org.def;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {
	WebDriver driver;
	
	@Given("user is on Adactin Hotel page")
	public void user_is_on_Adactin_Hotel_page() {
	WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		}
	@When("user enter {string} and {string}")
	public void user_enter_and(String string, String string2) {
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys(string);
		WebElement txtPass = driver.findElement(By.id("password"));
		txtPass.sendKeys(string2);	
	}
	@When("user should click login button")
	public void user_should_click_login_button() {
		WebElement btnClick = driver.findElement(By.name("login"));
		btnClick.click();
}
	@When("user is on search Hotel")
	public void user_is_on_search_Hotel() {
		WebElement dDnLocation = driver.findElement(By.id("location"));
		Select select = new Select(dDnLocation);
		select.selectByIndex(1);
		WebElement dDnHotel = driver.findElement(By.id("hotels"));
		Select select1 = new Select(dDnHotel);
		select1.selectByIndex(2);
		WebElement dDnRoomtype = driver.findElement(By.id("room_type"));
		Select select2 = new Select(dDnRoomtype);
		select2.selectByIndex(1);	
		WebElement dDnNoOfRooms = driver.findElement(By.id("room_nos"));
		Select select3 = new Select(dDnNoOfRooms);
		select3.selectByIndex(1);
		WebElement dDnAdultPerRoom = driver.findElement(By.id("adult_room"));
		Select select4 = new Select(dDnAdultPerRoom);
		select4.selectByIndex(2);
		WebElement dDnChildPerRoom = driver.findElement(By.id("child_room"));
		Select select5 = new Select(dDnChildPerRoom);
		select5.selectByIndex(1);
		WebElement btnSearch = driver.findElement(By.id("Submit"));
		btnSearch.click();
	}
	@When("user is on select Hotel and move to Book Hotel page")
	public void user_is_on_select_Hotel_and_move_to_Book_Hotel_page() {
		WebElement btnSelect = driver.findElement(By.id("radiobutton_0"));
		btnSelect.click();
		WebElement btnContinue = driver.findElement(By.id("continue"));
		btnContinue.click();
	}
	@When("user enter {string} and {string} and {string} and {string} and {string}")
	public void user_enter_and_and_and_and(String string, String string2, String string3, String string4, String string5) {
		WebElement txtFirstName = driver.findElement(By.id("first_name"));
		txtFirstName.sendKeys(string);
		WebElement txtLastName = driver.findElement(By.id("last_name"));
		txtLastName.sendKeys(string2);	
		WebElement txtAddress = driver.findElement(By.id("address"));
		txtAddress.sendKeys(string3);	
		WebElement txtCCNo = driver.findElement(By.id("cc_num"));
		txtCCNo.sendKeys(string4);
		WebElement dDnCcType = driver.findElement(By.id("cc_type"));
		Select select6 = new Select(dDnCcType);	
		select6.selectByIndex(2);
		WebElement dDnCcExpMon = driver.findElement(By.id("cc_exp_month"));
		Select select7 = new Select(dDnCcExpMon);	
		select7.selectByIndex(9);	
		WebElement dDnCcExpYr = driver.findElement(By.id("cc_exp_year"));
		Select select8 = new Select(dDnCcExpYr);	
		select8.selectByIndex(11);	
		WebElement txtCvvNo = driver.findElement(By.id("cc_cvv"));
		txtCvvNo.sendKeys(string5);
		WebElement btnBookNow = driver.findElement(By.id("book_now"));
		btnBookNow.click();		
	}
	@Then("user will be on confirm page and orderId will be generated")
	public void user_will_be_on_confirm_page_and_orderId_will_be_generated() throws Exception {
	Thread.sleep(8000);
	  WebElement txtOrderNo = driver.findElement(By.id("order_no"));
	    String orderNo = txtOrderNo.getAttribute("value");
	    System.out.println(orderNo);  
	}	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//@Given("user is on facebook page")
//public void user_is_on_facebook_page() {
//
	
//	@When("user enter username and password")
//	public void user_enter_username_and_password() {
//
//	@When("user enter {string} and {string}")
//	public void user_enter_and(String string, String string2) {
//	
//		}
//	@When("user should click login button")
//	public void user_should_click_login_button() {
//		WebElement btnClick = driver.findElement(By.name("login"));
//		btnClick.click();
//	}
	
//		@When("user enter {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string}")
//		public void user_enter_and_and_and_and_and_and_and_and_and(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10) {
//		
//	@When("user enter {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string}")
//	public void user_enter_and_and_and_and_and_and_and_and_and_and_and_and_and_and_and_and_and(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15, String string16, String string17, String string18) {
//	 
//		WebElement txtUserName = driver.findElement(By.id("username"));
//		txtUserName.sendKeys(string);
//		
//		WebElement txtPass = driver.findElement(By.id("password"));
//		txtPass.sendKeys(string2);
//		
//		WebElement btnClick = driver.findElement(By.name("login"));
//		btnClick.click();
//		
//		WebElement dDnLocation = driver.findElement(By.id("location"));
//		Select select = new Select(dDnLocation);
//		select.selectByVisibleText(string3);
//		
//		WebElement dDnHotel = driver.findElement(By.id("hotels"));
//		Select select1 = new Select(dDnHotel);
//		select1.selectByVisibleText(string4);
//		
//		WebElement dDnRoomtype = driver.findElement(By.id("room_type"));
//		Select select2 = new Select(dDnRoomtype);
//		select2.selectByVisibleText(string5);
//		
//		WebElement dDnNoOfRooms = driver.findElement(By.id("room_nos"));
//		Select select3 = new Select(dDnNoOfRooms);
//		select3.selectByVisibleText(string6);
//		
//		WebElement txtInDate = driver.findElement(By.id("datepick_in"));
//		txtInDate.clear();
//		txtInDate.sendKeys(string7);
//		
//		WebElement txtOutDate = driver.findElement(By.id("datepick_out"));
//	    txtOutDate.clear();
//	    txtOutDate.sendKeys(string8);
//	    
//		WebElement dDnAdultPerRoom = driver.findElement(By.id("adult_room"));
//		Select select4 = new Select(dDnAdultPerRoom);
//		select4.selectByVisibleText(string9);
//		
//		WebElement dDnChildPerRoom = driver.findElement(By.id("child_room"));
//		Select select5 = new Select(dDnChildPerRoom);
//		select5.selectByVisibleText(string10);
//		
//		WebElement btnSearch = driver.findElement(By.id("Submit"));
//		btnSearch.click();
//		
//		WebElement btnSelect = driver.findElement(By.id("radiobutton_0"));
//		btnSelect.click();
//		
//		WebElement btnContinue = driver.findElement(By.id("continue"));
//		btnContinue.click();
//		
//		WebElement txtFirstName = driver.findElement(By.id("first_name"));
//		txtFirstName.sendKeys(string11);
//		
//		WebElement txtLastName = driver.findElement(By.id("last_name"));
//		txtLastName.sendKeys(string12);
//		
//		WebElement txtAddress = driver.findElement(By.id("address"));
//		txtAddress.sendKeys(string13);
//		
//		WebElement txtCCNo = driver.findElement(By.id("cc_num"));
//		txtCCNo.sendKeys(string14);
//		
//		WebElement dDnCcType = driver.findElement(By.id("cc_type"));
//		Select select6 = new Select(dDnCcType);	
//		select6.selectByVisibleText(string15);
//		
//		WebElement dDnCcExpMon = driver.findElement(By.id("cc_exp_month"));
//		Select select7 = new Select(dDnCcExpMon);	
//		select7.selectByVisibleText(string16);
//		
//		WebElement dDnCcExpYr = driver.findElement(By.id("cc_exp_year"));
//		Select select8 = new Select(dDnCcExpYr);	
//		select8.selectByVisibleText(string17);
//		
//		WebElement txtCvvNo = driver.findElement(By.id("cc_cvv"));
//		txtCvvNo.sendKeys(string18);
//		
//		WebElement btnBookNow = driver.findElement(By.id("book_now"));
//		btnBookNow.click();
//		
//		
//		
//		
//		
//		
//		}
//
//
//	@Then("user need to verify home page is appeared or not")
//	public void user_need_to_verify_home_page_is_appeared_or_not() {
//		System.out.println("invalid browser");
//	}
//	

