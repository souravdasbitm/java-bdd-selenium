package pageObjectFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login extends TopPanel {

	WebDriver driver;

	public Login(WebDriver driver) {

		super(driver);

	}

	// locators

	@FindBy(how = How.CSS, using = "input#email_create")
	private WebElement email_create;

	@FindBy(how = How.CSS, using = "input#email")
	private WebElement email;

	@FindBy(how = How.CSS, using = "input#passwd")
	private WebElement passwd;

	@FindBy(how = How.CSS, using = "button#SubmitCreate")
	private WebElement submit_create;

	@FindBy(how = How.CSS, using = "button#SubmitLogin")
	private WebElement submit_login;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Forgot your password?')]")
	private WebElement forgot_passwd;

	// action method

	public void register_email(String text) {
		email_create.clear();
		email_create.sendKeys(text);
	}

	public void login_email(String text) {
		email.clear();
		email.sendKeys(text);
	}

	public void login_passwd(String text) {
		email.clear();
		email.sendKeys(text);
	}

	public void forgot_passwd() {
		forgot_passwd.click();
	}

	public void submit_btn(String text) {
		switch (text) {
		case "login":
			submit_login.click();
			break;
		case "create":
			submit_create.click();
			break;

		}
	}

//	public static void main(String[] args) {
	// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver",
//				FileReaderManager.getInstance().getConfigFileReader().getDriverPath());
//		System.setProperty("webdriver.chrome.silentOutput", "true");
//		WebDriver driver = new ChromeDriver();
//
//		Login login = new Login(driver);
//		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
//
//		// driver.findElement(By.cssSelector("input#email_create")).sendKeys("abc.com");
//
//		login.register_email("abc.com");
//
//	}

}
