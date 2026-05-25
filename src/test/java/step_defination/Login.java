package step_defination;

import org.junit.Assert;
import org.openqa.selenium.By;

import base.Base_class;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.Account_created;
import pom.Delete_page;
import pom.Home_page;
import pom.Login_details;
import pom.Login_page;

public class Login extends Base_class{
	Home_page hp;
	Login_page lp;
	Login_details mp;
	Account_created mn;
	Delete_page ss;
	

@When("Navigate to url {string}")
public void navigate_to_url(String string) {
	hp=new Home_page(driver);
	lp=new Login_page(driver);
	mp=new Login_details(driver);
	mn=new Account_created(driver);
	ss=new Delete_page(driver);
	
	openApplication(string);
}

@When("i should Verify that home page is visible successfully")
public void i_should_verify_that_home_page_is_visible_successfully() {
	String hometitle = driver.getTitle();
	Assert.assertEquals("Automation Exercise", hometitle);
}

@When("i click on Signup \\/ Login button")
public void i_click_on_signup_login_button() {
   hp.clicksignup();
}

@Then("Verify {string} is visible")
public void verify_is_visible(String string) {
//   boolean displayed = driver.findElement(By.xpath("//h2[text()='Login to your account']")).isDisplayed();
	 Assert.assertTrue(lp.loginverify());;
	
}

@Then("Enter correct email address and password")
public void enter_correct_email_address_and_password() {
	//driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("mohnishcom69mail.com");
	lp.loginemail("mohnish69@mail.com");
    //driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("12345");
	lp.password1();
}

@Then("Click login button")
public void click_login_button() {
	//driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
	lp.button1();
    
}

@Then("i should Verify that {string} is visible")
public void i_should_verify_that_is_visible(String string) {
	mn.accountedcreated();
}

@Then("i should Click Delete Account button")
public void i_should_click_delete_account_button() {
	ss.deleteaccount();
}


}
