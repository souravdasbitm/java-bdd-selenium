package manager;

import org.openqa.selenium.WebDriver;

import pageObjectFactory.Home;
import pageObjectFactory.Login;

public class PageObjectManager {

	private WebDriver driver;
	private Home home;
	private Login login;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public Home getHome() {
		return (home == null) ? home = new Home(driver) : home;
	}

	public Login getLogin() {
		return (login == null) ? login = new Login(driver) : login;
	}

}
