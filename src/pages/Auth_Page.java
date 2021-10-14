package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Auth_Page extends Basic_Page{
	
	public Auth_Page(WebDriver driver) {
		super(driver);
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
