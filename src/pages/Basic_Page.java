package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Basic_Page {
	
	protected WebDriver driver;
	protected JavascriptExecutor js;
	WebDriverWait wt;
	
	public Basic_Page(WebDriver driver) {
		this.driver = driver; 
		this.js = (JavascriptExecutor) this.driver;
		wt = new WebDriverWait(this.driver,10);
	}



}
