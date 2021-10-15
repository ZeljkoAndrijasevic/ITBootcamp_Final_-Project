package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_Page extends Basic_Page{
	
	public Login_Page(WebDriver driver, JavascriptExecutor js, WebDriverWait wt, Actions action) {
		super(driver, js, wt, action);
		// TODO Auto-generated constructor stub
	}

	public WebElement getUserNameField() {
		return this.driver.findElement(By.name("username"));
	}
	
	public WebElement getPasswordField() {
		return this.driver.findElement(By.name("password"));
	}
	
	public WebElement getRememberMeButton() {
		return this.driver.findElement(By.name("remember_me"));
	}
	
	public WebElement getLoginButton() {
		return this.driver.findElement(By.name("btn_submit"));
	}
	
	public void loginUser(String email, String password) throws InterruptedException {
//		getUserNameField().clear();
//		Thread.sleep(1000);
//		getUserNameField().click();
//		Thread.sleep(1000);
//		getPasswordField().sendKeys("customer@dummyid.com");
		getPasswordField().clear();
		Thread.sleep(1000);
		getPasswordField().sendKeys(password);
		getLoginButton().click();
		Thread.sleep(1000);
	}

}
