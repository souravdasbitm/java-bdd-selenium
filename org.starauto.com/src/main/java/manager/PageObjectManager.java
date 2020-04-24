package manager;

import org.openqa.selenium.WebDriver;

import pageObjectFactory.TopPanel;
import pageObjectFactory.Home;
import pageObjectFactory.Login;
import pageObjectFactory.MyAccount;

public class PageObjectManager {

	private WebDriver driver;
	private TopPanel topPanel;
	private Home home;
	private Login login;
	private MyAccount myAccount;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public TopPanel getTopPanel() {
		return (topPanel == null) ? topPanel = new TopPanel(driver) : topPanel;
	}

	public Home getHome() {
		return (home == null) ? home = new Home(driver) : home;
	}

	public Login getLogin() {
		return (login == null) ? login = new Login(driver) : login;
	}

	public MyAccount getMyAccount() {
		return (myAccount == null) ? myAccount = new MyAccount(driver) : myAccount;
	}

}
