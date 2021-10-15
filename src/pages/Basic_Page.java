package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Basic_Page {
	
	protected WebDriver driver;
	protected JavascriptExecutor js;
	protected WebDriverWait wt;
	protected Actions action;
	
	public Basic_Page(WebDriver driver, JavascriptExecutor js, WebDriverWait wt, Actions action) {
		this.driver = driver; 
		this.js = js;
		this.wt = wt;
		this.action = action;
	}



}
