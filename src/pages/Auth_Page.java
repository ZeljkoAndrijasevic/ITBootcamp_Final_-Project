package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Auth_Page extends Basic_Page{
	
	public Auth_Page(WebDriver driver, JavascriptExecutor js, WebDriverWait wt, Actions action) {
		super(driver, js, wt, action);
		// TODO Auto-generated constructor stub
	}

	public WebElement getAccountDropDownMenu() {
		return this.driver.findElement(By.className("after-arrow user-trigger-js user-trigger-active"));
	}
	
	public WebElement getMyAccount() {
		return this.driver.findElement(By.xpath("//*[@class='my-account-dropdown']//li[1]/a"));
	}
	
	public WebElement getLogout() {
		return this.driver.findElement(By.xpath("//*[@class='my-account-dropdown']//li[2]/a"));
	}
	
	public void logoutUser() {
		getAccountDropDownMenu().click();
		getLogout().click();
	}

}
