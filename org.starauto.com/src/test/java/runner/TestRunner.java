package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/resources/features", glue = { "stepDefination" }, monochrome = true, plugin = {
		"pretty", "html:target/cucumber", "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm",
		"json:target_json/cucumber.json" }

)

public class TestRunner{

}
