package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Popup_Page extends Basic_Page{
	
	
	
	public WebElement getSelectLocation() {
		return this.driver.findElement(By.className("location-selector"));
	}
	
	public WebElement getCloseSelectLocation() {
		return this.driver.findElement(By.className("close-btn close-btn-white"));
	}
	
	public WebElement getKeyword() {
		return this.driver.findElement(By.id("locality_keyword"));
	}
	
	public WebElement getLocationItem(String locationName) {
		return this.driver.findElement(By.xpath("//li/a[contains(text(), '" + locationName + "')]/.."));
	}
	
	public WebElement getLocationInput() {
		return this.driver.findElement(By.id("location_id"));
	}
	
	public WebElement getSubmit() {
		return this.driver.findElement(By.xpath("//*[@name='btn_submit']"));
	}
	
	public void clickOnSelectLocation() {
		getSelectLocation().click();
	}
	
	public void enterLocation(String locationName) {
		getKeyword().click();
		String value = getLocationItem(locationName).getAttribute("data-value");
		js.executeScript("arguments[0].value=arguments[1]", getLocationInput(), value);
		js.executeScript("arguments[0].click();", getSubmit());
	}
	
	public void closeSelectLocation() {
		getCloseSelectLocation().click();
	}

}
