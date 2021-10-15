package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.glass.events.KeyEvent;

public class Profile_Page extends Basic_Page{
	
	public Profile_Page(WebDriver driver, JavascriptExecutor js, WebDriverWait wt, Actions action) {
		super(driver, js, wt, action);
		// TODO Auto-generated constructor stub
	}

	public WebElement getFirstName() {
		return this.driver.findElement(By.name("user_first_name"));
	}
	
	public WebElement getLastName() {
		return this.driver.findElement(By.name("user_last_name"));
	}
	
	public WebElement getUserEmail() {
		return this.driver.findElement(By.name("user_email"));
	}
	
	public WebElement getAdress() {
		return this.driver.findElement(By.name("user_address"));
	}
	
	public WebElement getUserPhone() {
		return this.driver.findElement(By.name("user_phone"));
	}
	
	public WebElement getZipCode() {
		return this.driver.findElement(By.name("user_zip"));
	}
	
	public WebElement getCountry() {
		return this.driver.findElement(By.name("user_country_id"));
	}
	
	public WebElement getState() {
		return this.driver.findElement(By.name("user_state_id"));
	}
	
	public WebElement getCyti() {
		return this.driver.findElement(By.name("user_city"));
	}
	
	public WebElement getSaveButton() {
		return this.driver.findElement(By.xpath("//*[contains(@class,'col-lg-12 col-md-12 col-sm-12 col-lg-12 align--right')]//*[@name='btn_submit']"));
	}
	
	public WebElement getUploadImage() {
		return this.driver.findElement(By.xpath("//*[@id=\"profileInfo\"]/div/div[1]/div/a[1]"));
	}
	
	public WebElement getRemoveImage() {
		return this.driver.findElement(By.className("remove"));
	}
	
	public WebElement getProfileImgArea() {
		return this.driver.findElement(By.xpath("//*[@id=\"profileInfo\"]/div/div[1]/img"));
	}
	
	public void uploadProfilePicture() throws InterruptedException, AWTException, IOException {
		WebElement upload = getUploadImage();
		action.moveToElement(getProfileImgArea()).build().perform();
		this.getUploadImage().click();
		Thread.sleep(1000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
		String imgPath = new File("img\\Ozren.jpg").getCanonicalPath();
		this.getUploadImage().sendKeys(imgPath);
	}
	
	public void removeProfilePicture() {
		js.executeAsyncScript("arguments[0].click();", getRemoveImage());
	}
	
	public void changeAllUserInfo(String fName, String lName, String email, String address, String phone, String zCode, String country, String state, String city) throws InterruptedException {
		getFirstName().clear();
		getFirstName().sendKeys(fName);
		Thread.sleep(500);
		getLastName().clear();
		getLastName().sendKeys(lName);
		Thread.sleep(500);
//		getUserEmail().clear();
//		getUserEmail().sendKeys(email);
//		Thread.sleep(500);
		getAdress().clear();
		getAdress().sendKeys(address);
		Thread.sleep(500);
		getUserPhone().clear();
		getUserPhone().sendKeys(phone);
		Thread.sleep(500);
		getZipCode().clear();
		getZipCode().sendKeys(zCode);
		Thread.sleep(500);
		Select cngCountry = new Select(getCountry());
		cngCountry.selectByVisibleText(country);
		Thread.sleep(500);
		Select cngState = new Select(getState());
		cngState.selectByVisibleText(state);
		Thread.sleep(500);
		Select cngCity = new Select(getCyti());
		cngCity.selectByVisibleText(city);
		Thread.sleep(500);
		getSaveButton().click();
	}

}
