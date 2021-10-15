package tests;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.Auth_Page;
import pages.Login_Page;
import pages.Notification_Sistem_Page;
import pages.Popup_Page;
import pages.Profile_Page;

public abstract class Basic_Test {
	
	protected WebDriver driver;
	protected JavascriptExecutor js;
	protected WebDriverWait wt;
	protected Actions action;
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
		this.js = (JavascriptExecutor) this.driver;
		this.wt = new WebDriverWait(this.driver, 5);
		action = new Actions(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		auth_Page = new Auth_Page(driver, js, wt, action);
		login_Page = new Login_Page(driver, js, wt, action);
		notification_Sistem_Page = new Notification_Sistem_Page(driver, js, wt, action);
		profile_Page = new Profile_Page(driver, js, wt, action);
		popup_Page = new Popup_Page(driver, js, wt, action);
	}
	
	
	@AfterMethod
	public void afterMethod(ITestResult result) throws InterruptedException {
		if(ITestResult.FAILURE==result.getStatus()) {
			try {
				TakesScreenshot screenshot =  (TakesScreenshot)driver;
				File src=screenshot.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src, new File("screenshot\\"+ result.getName()+".png"));
				System.out.println("Successfully captured a screeenshot");
			}catch (Exception e) {
				System.out.println("Excecption while taking a screeenshot" + e.getMessage());
			}
		}
		Thread.sleep(1000);
		driver.quit();
	}

}
