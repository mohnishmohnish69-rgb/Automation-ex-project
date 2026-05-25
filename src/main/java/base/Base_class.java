package base;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_class {
	public static WebDriver driver;

	public static void launchbrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public static void openApplication(String url) {
		driver.get(url);
	}

	public static void enterButton(WebElement el) {
		el.click();
	}

	public static void entervalue(WebElement el, String input) {
		el.sendKeys(input);
 }
	public static void visibletext(WebElement el,String s) {
		Select sl= new Select(el);
		sl.selectByVisibleText(s);
		}
	public static boolean textverify(WebElement el) {
    boolean displayed = el.isDisplayed();
    return displayed;
	}
	public static void jsclick(WebElement el) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", el);

	}
	public static void explicitwe(WebElement el) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(el));
	}


}
