package stepDefination;

import context.TestContext;
import io.cucumber.java.en.Given;
import pageObjectFactory.Home;


public class HomeStep {
	
	TestContext testContext;
	Home home;
	
	
	public HomeStep(TestContext context) {
		testContext = context;
		home = testContext.getPageObjectManager().getHome();
		
	}
	
	
	@Given("^user is on the home page$")
	public void user_is_on_the_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		home.navigateTo_HomePage();
	    
	}
	

}
