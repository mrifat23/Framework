package com.framework.PageAction;

import org.testng.Assert;

import com.framework.PageLocater.LoginPageLocator;

public class LoginPageAction {

	
	LoginPageLocator loginPageLocator= new LoginPageLocator();
	
	public void userCredentials(String username, String password) {
		loginPageLocator.Email.sendKeys(username);
		loginPageLocator.Password.sendKeys(password);
		loginPageLocator.Login.click();
		
	}
	public void Verifyusercanlogin() {
		boolean loginVerification = loginPageLocator.Verifylogin.isDisplayed();
		Assert.assertTrue(loginVerification);
	}
	

}
