package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Basic_Page {
	
	protected WebDriver driver;
	protected JavascriptExecutor js;
	WebDriverWait wt;
	
	public Basic_Page() {
		super();
		this.driver = new ChromeDriver(); 
		this.js = (JavascriptExecutor) driver;
		wt = new WebDriverWait(driver,10);
	}

}
