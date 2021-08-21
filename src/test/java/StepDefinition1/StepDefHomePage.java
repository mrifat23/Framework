package StepDefinition1;

import org.apache.log4j.Logger;

import com.framework.PageAction.HomePageAction;
import com.framework.Util.LogsHelper;
import com.framework.Util.TestBase;
import com.framework.Util.Util;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefHomePage extends TestBase {
	HomePageAction homePageAction = new HomePageAction();
	Logger log = LogsHelper.getLogs(LogsHelper.class);

@Given("^Open Application \"([^\"]*)\"$")
public void open_Application(String URL) throws Throwable {
 launchApplication(URL);
	Util.takescreenshot(driver, "Home Page");
	log.info("Opening URL");
  
}

@Then("^Enter XPS in Search Field$")
public void enter_XPS_in_Search_Field() throws Throwable {
  homePageAction.enter_XPS_InSearchField();
	log.info("Typing 'XPS' in search field");

}

@Then("^Click on Search Icon$")
public void click_on_Search_Icon() throws Throwable {
 homePageAction.clickOnSearchButton();
	log.info("Clicking on search button");

 
}

@Then("^Verify Search Results Are Displaying$")
public void verify_Search_Results_Are_Displaying() throws Throwable {
    homePageAction.verifySearchResultDisplay();
	Util.takescreenshot(driver, "Search Results Page");
	log.info("Verifying results page");

}



}
