package step_defination;

import org.junit.Assert;
import base.Base_class;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.Account_created;
import pom.Delete_page;
import pom.Home_page;
import pom.Login_details;
import pom.Login_page;

public class register extends Base_class {
	Home_page hp;
	Login_page lp;
	Login_details mp;
	Account_created mn;
	Delete_page ss;
	
	@Given("i should launch browser")
	public void i_should_launch_browser() {
		launchbrowser();
		hp=new Home_page(driver);
		lp=new Login_page(driver);
		mp=new Login_details(driver);
		mn=new Account_created(driver);
		ss=new Delete_page(driver);
		
	}

	@When("i enter into home page navigate to {string}")
	public void i_enter_into_home_page_navigate_to(String string) {
		openApplication(string);
	}

	@Then("check whether it has been nagivated")
	public void check_whether_it_has_been_nagivated() {

		String hometitle = driver.getTitle();
		Assert.assertEquals("Automation Exercise", hometitle);
	}

	@When("i Click on Signup \\/ Login button")
	public void i_click_on_signup_login_button() {
		// driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click();
//		WebElement login = driver.findElement(By.xpath("//a[text()=' Signup / Login']"));
//		enterButton(login);
		hp.clicksignup();
	}

	@When("i enter the username as {string}")
	public void i_enter_the_username_as(String string) {
//		WebElement nameField = driver.findElement(By.xpath("//input[@placeholder='Name']"));
//		// nameField.sendKeys(string);
//		entervalue(nameField, string); 
		lp.userName(string);
	}

	@When("i enter the email as {string}")
	public void i_enter_the_email_as(String string) {
//		// driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys(string);
//		WebElement email = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
//		entervalue(email, string); 
		lp.email(string);
	}

	@When("i Click Signup button")
	public void i_click_signup_button() {
//		// driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
//		WebElement signupbutton = driver.findElement(By.xpath("//button[@data-qa='signup-button']"));
//		enterButton(signupbutton);
		lp.signup();
	}

	@Then("Verify that ENTER ACCOUNT INFORMATION is visible")
	public void verify_that_enter_account_information_is_visible() {
//		boolean textvisible = driver.findElement(By.xpath("//b[text()='Enter Account Information']")).isDisplayed();
	Assert.assertTrue(mp.verifytext());
		
	}

	@When("i click the check box as {string}")
	public void i_click_the_check_box_as(String string) {
//		WebElement mr = driver.findElement(By.cssSelector("#uniform-id_gender1"));
//		enterButton(mr);
		mp.clickradiobutton();
	}

	@When("i enter password as {string}")
	public void i_enter_password_as(String string) {
//		WebElement pass = driver.findElement(By.cssSelector("#password"));
//		entervalue(pass, string);
		mp.password(string);
	  
	}

	@When("i enter Date of birth as {string} Octomber {string}")
	public void i_enter_date_of_birth_as_octomber(String string, String string2) {
//		WebElement day = driver.findElement(By.cssSelector("#days"));
////		Select sl= new Select(day);
////		sl.selectByVisibleText(string);
//		visibletext(day, string);
		mp.dayys(string);
		//WebElement month = driver.findElement(By.cssSelector("#months"));
////		Select al= new Select(month);
////		al.selectByVisibleText("October");
//		visibletext(month, "October");
		mp.months();
		//WebElement year = driver.findElement(By.cssSelector("#years"));
////		Select ql= new Select(year);
////		ql.selectByVisibleText(string2);
//		visibletext(year, string2);
		mp.years(string2);
	   
	}

	@When("Select checkbox Sign up for our newsletter!")
	public void select_checkbox_sign_up_for_our_newsletter() {
//		 WebElement ch = driver.findElement(By.cssSelector("#newsletter"));
//		 JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("arguments[0].click();", ch);
		mp.newsletter();
	}
	@When("Select checkbox Receive special offers from our partners!")
	public void select_checkbox_receive_special_offers_from_our_partners() {
//	   WebElement ch1 = driver.findElement(By.cssSelector("#optin"));
//	   JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", ch1);
		mp.optin();
	}
		

	@When("i enter the first name as {string}")
	public void i_enter_the_first_name_as(String string) {
//		WebElement name = driver.findElement(By.cssSelector("#first_name"));
//		entervalue(name, string);
		mp.first_name(string);
		}

	@When("i enter the last name as {string}")
	public void i_enter_the_last_name_as(String string) {
//		WebElement last = driver.findElement(By.cssSelector("#last_name"));
//		entervalue(last, string);
		mp.last_name(string);
	   }

	@When("i enter the company name as {string}")
	public void i_enter_the_company_name_as(String string) {
//		WebElement com = driver.findElement(By.cssSelector("#company"));
//		entervalue(com, string);
		mp.company(string);
	   
	}

	@When("i enter the address as {string}")
	public void i_enter_the_address_as(String string) {
//		WebElement addr = driver.findElement(By.cssSelector("#address1"));
//		entervalue(addr, string);
		mp.address1(string);
	    
	}

	@When("i enter the address2 as {string}")
	public void i_enter_the_address2_as(String string) {
//		WebElement addr2 = driver.findElement(By.cssSelector("#address2"));
//		entervalue(addr2, string);
		mp.address2(string);
	   
	}

	@When("i enter the country as {string}")
	public void i_enter_the_country_as(String string) {
		//WebElement el = driver.findElement(By.cssSelector("#country"));
		
	    
	}

	@When("i enter the state as {string}")
	public void i_enter_the_state_as(String string) {
//		WebElement state = driver.findElement(By.cssSelector("#state"));
//	   entervalue(state, string); 
		mp.city("chennai");
	}
	@When("i enter the city as {string}")
	public void i_enter_the_city_as(String string) {
//		WebElement city = driver.findElement(By.cssSelector("#city"));
//		entervalue(city, string);
		mp.state(string);
	    
	}

	@When("i enter the Zipcode as {string}")
	public void i_enter_the_zipcode_as(String string) {
//	    WebElement zip = driver.findElement(By.cssSelector("#zipcode"));
//	entervalue(zip, string);
		mp.zipcode(string);
	}

	@When("i enter the Mobile Number as {string}")
	public void i_enter_the_mobile_number_as(String string) {
//	    WebElement mob = driver.findElement(By.cssSelector("#mobile_number"));
//	    entervalue(mob, string);
		mp.mobile_number(string);
	}

	@When("Click Create Account button")
	public void click_create_account_button() {
//		WebElement creat = driver.findElement(By.xpath("//button[@data-qa='create-account']"));
//		enterButton(creat);
		mp.button();
	    
	}

	@Then("Verify that ACCOUNT CREATED! is visible")
	public void verify_that_account_created_is_visible() {
//		boolean textvisible = driver.findElement(By.xpath("//b[text()=\"Account Created!\"]")).isDisplayed();
	Assert.assertTrue(mn.accountedcreated());
		

	}

	@Then("Click Continue button")
	public void click_continue_button() {
//		driver.findElement(By.xpath("//a[text()='Continue']")).click();
	mn.continues();

	}
	@Then("Verify that {string} is visible")
	public void verify_that_is_visible(String string) {
//		boolean created = driver.findElement(By.xpath(" Logged in as ")).isDisplayed();
		Assert.assertTrue(hp.logged());
		

	}
	@Then("Click Delete Account button")
	public void click_delete_account_button() {
//		WebElement jdk = driver.findElement(By.xpath("//a[text()=' Delete Account']"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", jdk);
		ss.deleteaccount();

	}

	@Then("Verify that ACCOUNT DELETED! is visible and click Continue button")
	public void verify_that_account_deleted_is_visible_and_click_continue_button() {
//		boolean check = driver.findElement(By.xpath("//b[text()='Account Deleted!']")).isDisplayed();
		Assert.assertTrue(ss.accdeleted());
		
//		WebElement continueBtn = driver.findElement(By.xpath("//a[text()='Continue']"));
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOf(continueBtn));
//		continueBtn.click();
		ss.contiune();

	}




}
