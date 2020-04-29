package manager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.remote.RemoteWebDriver;

import enums.DriverType;
import enums.EnvironmentType;

public class WebDriverManager {

	private WebDriver driver;
	private static DriverType driverType;
	private static EnvironmentType environmentType;
	private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";

	public WebDriverManager() {
		driverType = FileReaderManager.getInstance().getConfigFileReader().getBrowser();
		environmentType = FileReaderManager.getInstance().getConfigFileReader().getEnvironment();

	}

	public WebDriver getDriver() {
		if (driver == null)
			driver = createDriver();
		return driver;

	}

	public WebDriver createDriver() {
		switch (environmentType) {
		case LOCAL:
			driver = createLocalDriver();
			break;
		case REMOTE:
			driver = createRemoteDiver();
			break;
		}
		return driver;

	}

	public WebDriver createRemoteDiver() {
		//String remoteHubURL = FileReaderManager.getInstance().getConfigFileReader().getRemoteHubURL();
		//driver = new RemoteWebDriver(capabilities)
		throw new RuntimeException("Yet to be implemented with Docker and Selenium Grid");
	}

	public WebDriver createLocalDriver() {
		switch (driverType) {
		case FIREFOX:
			driver = new FirefoxDriver();
			break;
		case INTERNETEXPLORER:
			driver = new InternetExplorerDriver();
			break;
		case CHROME:
			
			System.setProperty(CHROME_DRIVER_PROPERTY,
					FileReaderManager.getInstance().getConfigFileReader().getDriverPath());
			System.setProperty("webdriver.chrome.silentOutput", "true");
			driver = new ChromeDriver();
			break;

		}
		if (FileReaderManager.getInstance().getConfigFileReader().getBrowserWindowSize())
			driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(
				FileReaderManager.getInstance().getConfigFileReader().getImplicitlyWait(), TimeUnit.SECONDS);
		if (FileReaderManager.getInstance().getConfigFileReader().getBrowserDeleteCookies())
			driver.manage().deleteAllCookies();
		return driver;

	}
	
	public void quitDriver() {
		driver.quit();		
	}
	public void closeDriver() {
		driver.close();
	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
