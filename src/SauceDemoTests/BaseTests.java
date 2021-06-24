package SauceDemoTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import SauceDemoPages.CheckoutPage;
import SauceDemoPages.LoginPage;
import SauceDemoPages.MainNavigation;
import SauceDemoPages.ProductsPage;
import SauceDemoPages.YourCartPage;

public class BaseTests {

	WebDriver driver;
	WebDriverWait wdwait;
	LoginPage loginPage;
	MainNavigation mainNavigation;
	ProductsPage productsPage;
	YourCartPage yourCartPage;
	CheckoutPage checkoutPage;

	@BeforeClass
	public void preSvihTestova() {

		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wdwait = new WebDriverWait(driver, 10);
		loginPage = new LoginPage(driver);
		mainNavigation = new MainNavigation(driver);
		productsPage = new ProductsPage(driver);
		yourCartPage = new YourCartPage(driver);
		checkoutPage = new CheckoutPage(driver);

	}

	@AfterClass
	public void posleSihTestova() {

		driver.close();
	}

	// LoginFormFilling metoda

	public void LoginFormFilling() throws InterruptedException {

		loginPage.insertUsername("standard_user");
		loginPage.insertPassword("secret_sauce");
		loginPage.logInButtonClick();
	}

}
