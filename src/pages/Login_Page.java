package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Page extends Basic_Page{
	
	public Login_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public WebElement getUserNameField() {
		return this.driver.findElement(By.className("username"));
	}
	
	public WebElement getPasswordField() {
		return this.driver.findElement(By.className("password"));
	}
	
	public WebElement getRememberMeButton() {
		return this.driver.findElement(By.className("remember_me"));
	}
	
	public WebElement getLoginButton() {
		return this.driver.findElement(By.className("btn_submit"));
	}
	
	public void loginUser(String email, String password) {
		getUserNameField().clear();
		getUserNameField().click();
		getPasswordField().sendKeys(email);
		getPasswordField().clear();
		getPasswordField().click();
		getPasswordField().sendKeys(password);
		getLoginButton().click();
	}

}
