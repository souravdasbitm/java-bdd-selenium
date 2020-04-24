package pageObjectFactory;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



public class Home {

	WebDriver driver;

	public Home(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// locators

	@FindBy(how = How.CSS, using = ".login")
	private WebElement login_btn;

	@FindBy(how = How.CSS, using = ".search_query")
	private WebElement search_input;

	@FindBy(how = How.CSS, using = ".button-search")
	private WebElement search_btn;

	// action method

	public void click_login() {
		login_btn.click();
	}

	public void input_search(String text) {
		search_input.sendKeys(text);
	}

	private void click_search_btn() {
		search_btn.click();
	}

//	public static void main(String[] args) {
//
//		System.setProperty("webdriver.chrome.driver",
//				FileReaderManager.getInstance().getConfigFileReader().getDriverPath());
//		System.setProperty("webdriver.chrome.silentOutput", "true");
//		WebDriver driver = new ChromeDriver();
//
//		Home home = new Home(driver);
//		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//		driver.get("http://automationpractice.com/");
//		home.input_search("Dress");
//		home.click_search_btn();
//		
//		
//
//		// home.click_login();
//
//	}

}
