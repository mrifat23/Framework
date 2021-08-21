package StepDefinition1;

import com.framework.PageAction.HomePageAction;
import com.framework.PageAction.LoginPageAction;
import com.framework.Util.TestBase;
import com.framework.Util.Util;

import cucumber.api.java.en.Then;

public class LoginPageStepDefinition extends TestBase {
	HomePageAction homePageAction =new HomePageAction();
	LoginPageAction loginPageAction= new LoginPageAction();
	

	@Then("^Click on SignInButton$")
	public void click_on_SignInButton() throws Throwable {
	 homePageAction.ClickonSigninbutton();
	}

	@Then("^Click on Sign In Link$")
	public void click_on_Sign_In_Link() throws Throwable {
	 homePageAction.ClicksigninLink();
	}

	@Then("^Type Username & Password$")
	public void type_Username_Password() throws Throwable {
	  loginPageAction.userCredentials(prop.getProperty("mrxuser"), prop.getProperty("mrxpass"));
	}

	@Then("^Verify User Can Login$")
	public void verify_User_Can_Login() throws Throwable {
		loginPageAction.Verifyusercanlogin();
		Util.takescreenshot(driver, "User Profile Page");
		

	}
}
