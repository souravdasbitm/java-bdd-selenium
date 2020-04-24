package stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;

public class LoginStep {
  @Given("^you are in Given annotation$")
  public void given() throws Throwable {
  }

  @When("^you are in When annotation$")
  public void when() throws Throwable {
  }

  @Then("^you are in Then annotation$")
  public void then() throws Throwable {
  }

  @And("^you are in And annotation$")
  public void and() throws Throwable {
  }

}
