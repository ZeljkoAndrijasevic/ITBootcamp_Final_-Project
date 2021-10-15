package tests;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Profile_Test extends Basic_Test{
	
	@Test(enabled = false)
	public void editProfile() throws InterruptedException{
		this.driver.get(baseUrl + "/guest-user/login-form");
		popup_Page.closeSelectLocation();
		login_Page.loginUser("customer@dummyid.com", "12345678a");
		Assert.assertTrue(notification_Sistem_Page.loginMessage().contains("Login Successfull"), "Login massage dont exists");
		Thread.sleep(1000);
		this.driver.get(baseUrl + "/member/profile");
		profile_Page.changeAllUserInfo("Ozren", "Soldatovic", "ozren@gmail.com", 
				"Topolska 18", "007007007", "12121", "United Kingdom", "Argyll", "Oban");
		Thread.sleep(1000);
		Assert.assertTrue(notification_Sistem_Page.setupMessage().contains("Setup Successful"), "Setup massage dont exists");
		auth_Page.logoutUser();
		Assert.assertTrue(notification_Sistem_Page.loginMessage().contains("Logout Successfull!"), "Setup massage dont exists");
	}
	
	@Test
	public void changeProfileImage() throws InterruptedException, IOException, AWTException {
		this.driver.get(baseUrl + "/guest-user/login-form");
		popup_Page.closeSelectLocation();
		login_Page.loginUser("customer@dummyid.com", "12345678a");
		Assert.assertTrue(notification_Sistem_Page.loginMessage().contains("Login Successfull"), "Login massage dont exists");
		Thread.sleep(1000);
		this.driver.get(baseUrl + "/member/profile");
		profile_Page.uploadProfilePicture();
		Assert.assertTrue(notification_Sistem_Page.loginMessage().contains("Profile Image Uploaded Successfully"), "Login massage dont exists");
	}
}
