package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base_class;

public class Account_created extends Base_class{
	WebDriver driver;
	public Account_created(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	@FindBy (xpath = "//b[text()=\"Account Created!\"]")
	 private WebElement accountcreated;
	
	public boolean accountedcreated() {
			return textverify(accountcreated);
}
	@FindBy (xpath = "//a[text()='Continue']")
	private WebElement cont;
	
	 public void continues() {
		 enterButton(cont);
		

	}
	
}

