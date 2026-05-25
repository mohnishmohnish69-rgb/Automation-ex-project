package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base_class;

public class Home_page extends Base_class{
	WebDriver driver;
	public Home_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//a[text()=' Signup / Login']") 
	private WebElement signupbutton;
	
	public void clicksignup() {
		enterButton(signupbutton);
}
	@FindBy (xpath = "//a[text()=' Logged in as ']")
	private WebElement loggeds;
	
	public boolean logged() {
		return textverify(loggeds);
	}
	
}


