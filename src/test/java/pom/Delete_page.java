package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base_class;

public class Delete_page extends Base_class{
	WebDriver driver;
	public Delete_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
}
	@FindBy (xpath = "//a[text()=' Delete Account']")
	private WebElement deleteaccount;
	
	public void deleteaccount() {
		jsclick(deleteaccount);
		}
	@FindBy (xpath = "//b[text()='Account Deleted!']")
	private WebElement accdeleted;
	
	public boolean accdeleted() {
    return textverify(accdeleted);
    }
	@FindBy (xpath = "//a[text()='Continue']")
	private WebElement contiune;
	
	public void contiune() {
		explicitwe(contiune);
		enterButton(contiune);
		

	}
	}
