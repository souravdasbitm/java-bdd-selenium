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
	
	@FindBy(how = How.CSS, using = "h1.page-heading")
	private WebElement heading_text;
	

	// action method

	public void register_email(String register_email) {
		email_create.clear();
		email_create.sendKeys(register_email);
	}

	public void login_email(String username) {
		email.clear();
		email.sendKeys(username);
	}

	public void login_passwd(String password) {
		passwd.clear();
		passwd.sendKeys(password);
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
	
	public String heading_page() {
		return heading_text.getText();
	}

//	public static void main(String[] args) {
////	 TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver",
//				FileReaderManager.getInstance().getConfigFileReader().getDriverPath());
//		System.setProperty("webdriver.chrome.silentOutput", "true");
//		WebDriver driver = new ChromeDriver();
//
//		Login login = new Login(driver);
//		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//		driver.get("http://automationpractice.com");
//
//		// driver.findElement(By.cssSelector("input#email_create")).sendKeys("abc.com");
//		login.click_login();
//		login.login_email("souravdasbitm@gmail.com");
//		login.login_passwd("Orga1234!");
//		login.submit_btn("login");
//		System.out.println(login.heading_page().toLowerCase());
//
//	}

}
