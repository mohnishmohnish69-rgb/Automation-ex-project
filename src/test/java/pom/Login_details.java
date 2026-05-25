package pom;

import java.awt.Taskbar.State;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base.Base_class;

public class Login_details extends Base_class{
	WebDriver driver;
	public Login_details(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy( css = "#uniform-id_gender1")
	private WebElement mr;
	@FindBy (xpath = "//b[text()='Enter Account Information']")
	private WebElement text;
	public boolean verifytext() {
		return textverify(text);
}
	public void clickradiobutton() {
		enterButton(mr);
		}
	@FindBy (css = "#password")
	private WebElement pass;
	
	public void password(String s) {
		entervalue(pass, s);
	}
	@FindBy (css = "#days")
	private WebElement day;
	
	public void dayys(String s) {
		visibletext(day, s);
		}
	@FindBy (css = "#months")
	private WebElement month;
	
	public void months() {
		visibletext(month, "October");
		}
     @FindBy (css = "#years")
     private WebElement year;
     
     public void years(String s) {
    	 visibletext(year, s);
    	 }
     @FindBy (css = "#newsletter")
     private WebElement checkbox;
     public void newsletter() {
		jsclick(checkbox);
}
     @FindBy (css = "#optin")
     private WebElement optin;
     public void optin() {
		jsclick(optin);
}
     @FindBy (css = "#first_name")
     private WebElement firstname;
     
     public void first_name(String s) {
    	 entervalue(firstname, s);
		}
     @FindBy(css = "#last_name")
     private WebElement lastname;
     
     public void last_name(String s) {
    	 entervalue(lastname, s);
    	 }
     @FindBy (css = "#company")
     private WebElement company;
     
     public void company(String s) {
    	 entervalue(company, s);
		}
     @FindBy (css = "#address1")
     private WebElement address1;
     
     public void address1(String s) {
    	 entervalue(address1, s);
		}
     @FindBy (css = "#address2")
     private WebElement address2;
     
     public void address2(String s) {
		entervalue(address1, s);
}
     @FindBy (css = "#state")
     private WebElement state;
     
     public void state(String s) {
    	 entervalue(state, s);
    	 }
     @FindBy (css = "#city")
     private WebElement city;
     
     public void city( String string) {
    	 entervalue(city, "Chennai");
    	 }
    @FindBy (css = "#zipcode")
    private WebElement zipcode;
 
    public void zipcode(String s) {
	entervalue(zipcode, s);

}
    @FindBy (css = "#mobile_number")
    private WebElement mobilenum;
 
    public void mobile_number(String s) {
	entervalue(mobilenum, s);
	}
    @FindBy (xpath = "//button[@data-qa='create-account']")
    private WebElement button;
 
    public void button() {
	//enterButton(button);
    	jsclick(button);

}
 
 
     



}
