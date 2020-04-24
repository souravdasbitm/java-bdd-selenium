package pageObjectFactory;


import org.openqa.selenium.WebDriver;

public class Home extends TopPanel {

	WebDriver driver;

	public Home(WebDriver driver) {
		super(driver);
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
