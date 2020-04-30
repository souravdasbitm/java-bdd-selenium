package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features", glue = { "stepDefination" }, monochrome = true, plugin = {
		"pretty", "html:target/cucumber", "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm",
		"json:target_json/cucumber.json" }

)

public class TestRunner extends AbstractTestNGCucumberTests {
	

}
