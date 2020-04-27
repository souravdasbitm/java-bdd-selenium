package stepDefination;

//import cucumber.api.Scenario;
//import cucumber.api.java.After;
//import cucumber.api.java.Before;



import context.TestContext;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	TestContext testContext;

	public Hooks(TestContext context) {
		testContext = context;
	}
	
	@Before	
	public void beforeScenario() {
		System.out.println("Yet to be implemented");
	}
	
	@After(order = 1)	
	public void afterScenario(Scenario scenario) {
		if(scenario.isFailed()) {
			System.out.println("Scenario failed ->"+scenario.getName());
		}
	}
	
	@After(order=0)
	public void afterSteps() {
		testContext.getWebDriverManager().quitDriver();
	}
	
}
