package pageObjectFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import manager.FileReaderManager;

public class TopPanel {
	WebDriver driver;

	public TopPanel(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.CSS, using = ".search_query")
	private WebElement search_input;

	@FindBy(how = How.CSS, using = ".button-search")
	private WebElement search_btn;

	// locators

	@FindBy(how = How.CSS, using = ".login")
	private WebElement login_btn;

	@FindBy(how = How.CSS, using = ".navigation_page")
	WebElement navigation_str;

	// action method

	public void navigateTo_HomePage() {
		driver.get(FileReaderManager.getInstance().getConfigFileReader().getApplicationUrl());
	}

	public void click_login() {
		login_btn.click();
	}

	public void input_search(String text) {
		search_input.sendKeys(text);
	}

	public void click_search_btn() {
		search_btn.click();
	}

	public String navigation_text(String text) {
		return navigation_str.getText();
	}
}
