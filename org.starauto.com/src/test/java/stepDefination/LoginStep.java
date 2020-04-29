package stepDefination;

import context.TestContext;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


import pageObjectFactory.Login;

import org.junit.Assert;

public class LoginStep {
	TestContext testContext;
	Login login;

	public LoginStep(TestContext context) {
		testContext = context;
		login = testContext.getPageObjectManager().getLogin();
	}
	

	@When("^user clicks onto login option$")
	public void user_clicks_onto_login_option() throws Throwable {
		login.click_login();
	}

	@When("^enters the username \"(.*)\" and password \"(.*)\"$")
	public void enters_the_username_password(String user, String passwd) throws Throwable {
		login.login_email(user);
		login.login_passwd(passwd);
	}

	@And("^clicks onto the login$")
	public void clicks_onto_the_login() throws Throwable {
		login.submit_btn("login");
	}

	@Then("^user is able to login$")
	public void user_is_able_to_login() throws Throwable {		
		Assert.assertEquals("my account",login.heading_page().toLowerCase());
		
	}

}
