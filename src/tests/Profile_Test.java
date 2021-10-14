package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Profile_Test extends Basic_Test{
	protected JavascriptExecutor js;
	
	
	@Test
	public void loginTest() throws InterruptedException{
		this.driver.get(baseUrl + "/guest-user/login-form");
		this.js = (JavascriptExecutor) this.driver;
		Thread.sleep(2000);
		WebElement x = driver.findElement(By.xpath("/*[@class='close-btn close-btn-white']"));
		js.executeScript("arguments[0].click()", x);
//		popup_Page.closeSelectLocation();
//		login_Page.loginUser("customer@dummyid.com", "12345678a");
	}
}
