package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Notification_Sistem_Page extends Basic_Page{
	
	public Notification_Sistem_Page(WebDriver driver, JavascriptExecutor js, WebDriverWait wt, Actions action) {
		super(driver, js, wt, action);
		// TODO Auto-generated constructor stub
	}

	public WebElement getLoginMessageElement() {
		return this.driver.findElement(By.xpath("//*[contains(@class, 'system_message alert alert--success')]"));
	}
	
	public WebElement getSetupMessageElement() {
		return this.driver.findElement(By.xpath("//*[contains(@class,'system_message alert alert--positioned-top-full alert--success')]"));
	}
	
	public String loginMessage() {
		String message = getLoginMessageElement().getText();
		return message;
	}
	
	public String setupMessage() {
		String message = getSetupMessageElement().getText();
		return message;
	}
	
	public void waitUntilLoginMessageDisapears() {
		wt.until(ExpectedConditions.invisibilityOf(getLoginMessageElement()));
	}

}
