package com.framework.PageAction;

import org.testng.Assert;

import com.framework.PageLocater.HomePageLocator;
import com.framework.Util.TestBase;
import com.framework.Util.TestData;

public class HomePageAction extends TestBase {
	
	HomePageLocator homePageLocator = new HomePageLocator();
	
	
	public void enter_XPS_InSearchField() {
		homePageLocator.searchField.sendKeys(TestData.searchLaptop);
	}
	public void clickOnSearchButton() {
		homePageLocator.searchButton.click();
	}
	public void verifySearchResultDisplay() {
		boolean searchResult = homePageLocator.verifySearchResult.isDisplayed();
		Assert.assertTrue(searchResult);
		
	}
public void ClickonSigninbutton() {
		
		homePageLocator.signInButton.click();
		
	}
	public void ClicksigninLink() {
		homePageLocator.Signinlink.click();
		
	}
	
}
