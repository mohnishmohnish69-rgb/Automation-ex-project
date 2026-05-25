package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base_class;

public class Login_page extends Base_class {
    WebDriver driver;
	public Login_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//input[@placeholder='Name']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@data-qa='signup-email']")
	private WebElement email;
	
	@FindBy(xpath = "//button[@data-qa='signup-button']")
	private WebElement signbutton;
	
	@FindBy (xpath = "//h2[text()='Login to your account']")
	private WebElement logintext;
	
	@FindBy (xpath = "//input[@data-qa='login-email']")
	private WebElement loginemail;
	
	@FindBy (xpath = "//input[@data-qa='login-password']")
	private WebElement password1;
	
	@FindBy (xpath = "//button[@data-qa='login-button']")
	private WebElement button1;
	
	public void button1() {
		enterButton(button1);

	}
	
	public void password1() {
		entervalue(password1, "12345");
		}
	
	public void loginemail(String s) {
		entervalue(loginemail, s);
		}
	
	public boolean loginverify() {
		return textverify(logintext); 
		}

	public void userName(String s ) {
		entervalue(username, s);
		}
	public void email(String s) {
		entervalue(email, s);
		
	}
	public void signup() {
		enterButton(signbutton);
		}
}
