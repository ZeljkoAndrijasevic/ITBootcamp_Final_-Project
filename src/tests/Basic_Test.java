package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.Auth_Page;
import pages.Login_Page;
import pages.Notification_Sistem_Page;
import pages.Popup_Page;
import pages.Profile_Page;

public abstract class Basic_Test {
	
	protected WebDriver driver;
	protected String baseUrl = "http://demo.yo-meals.com";
	protected Auth_Page auth_Page;
	protected Login_Page login_Page;
	protected Notification_Sistem_Page notification_Sistem_Page;
	protected Profile_Page profile_Page;
	protected Popup_Page popup_Page;
	
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		auth_Page = new Auth_Page(driver);
		login_Page = new Login_Page(driver);
		notification_Sistem_Page = new Notification_Sistem_Page(driver);
		profile_Page = new Profile_Page(driver);
		popup_Page = new Popup_Page(driver);
	}
	
	
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();
	}

}
