package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Profile_Page extends Basic_Page{
	
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
		return this.driver.findElement(By.name("btn_submit"));
	}
	
	public WebElement getUploadImage() {
		return this.driver.findElement(By.className("upload uploadFile-Js"));
	}
	
	public WebElement getRemoveImage() {
		return this.driver.findElement(By.className("remove"));
	}
	
	public void uploadProfilePicture() {
		WebElement upload = getUploadImage();
		js.executeScript("arguments[0].click();", getUploadImage());
		upload.sendKeys("/ItBootcamp_Zavrsni_Projekat/img/Slika.jpg");
	}
	
	public void removeProfilePicture() {
		js.executeAsyncScript("arguments[0].click();", getRemoveImage());
	}
	
	public void changeAllUserInfo(String fName, String lName, String email, String address, String phone, String zCode, String country, String state, String city) {
		getFirstName().clear();
		getFirstName().click();
		getFirstName().sendKeys(fName);
		getLastName().clear();
		getLastName().click();
		getLastName().sendKeys(lName);
		getUserEmail().clear();
		getUserEmail().click();
		getUserEmail().sendKeys(email);
		getAdress().clear();
		getAdress().click();
		getAdress().sendKeys(address);
		getUserPhone().clear();
		getUserPhone().click();
		getUserPhone().sendKeys(phone);
		getZipCode().clear();
		getZipCode().click();
		getZipCode().sendKeys(zCode);
		Select cngCountry = new Select(getCountry());
		cngCountry.selectByVisibleText(country);
		Select cngState = new Select(getState());
		cngState.selectByVisibleText(state);
		Select cngCity = new Select(getCyti());
		cngCity.selectByVisibleText(city);
		getSaveButton().click();
	}

}
