package com.framework.PageLocater;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.framework.Util.TestBase;

public class HomePageLocator extends TestBase{
	
	

	public HomePageLocator() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(how=How.XPATH, using="//input[@class='mh-search-input']")
	public WebElement searchField;
	
	@FindBy(how=How.XPATH, using="//span[@class='mh-search-button-label']")
	public WebElement searchButton;
	
	@FindBy(how=How.XPATH, using="//h2[@class='direct-content__title']")
	public WebElement verifySearchResult;
	
	@FindBy(how=How.XPATH, using="//span[text()='Sign In']")
	public WebElement signInButton;
	@FindBy(how=How.LINK_TEXT, using="Sign In")
	public WebElement Signinlink;

	
	
	
}
