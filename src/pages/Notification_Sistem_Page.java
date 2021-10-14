package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Notification_Sistem_Page extends Basic_Page{
	
	public Notification_Sistem_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public WebElement getMessageElement() {
		return this.driver.findElement(By.xpath("//*[contains(@class, 'alert--success')"));
	}
	
	public String loginMessage() {
		String message = getMessageElement().getText();
		return message;
	}
	
	public void waitUntilLoginMessageDisapears() {
		wt.until(ExpectedConditions.invisibilityOf(getMessageElement()));
	}

}
