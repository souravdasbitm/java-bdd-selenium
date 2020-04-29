package stepDefination;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import context.TestContext;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.qameta.allure.Allure;


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
			try {
				File sourcePath = ((TakesScreenshot) testContext.getWebDriverManager().getDriver()).getScreenshotAs(OutputType.FILE);
				ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(FileUtils.readFileToByteArray(sourcePath));
				Allure.addAttachment(scenario.getName(), byteArrayInputStream);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
           
		}
	}
	
	@After(order=0)
	public void afterSteps() {
		testContext.getWebDriverManager().quitDriver();
	}
	
}
