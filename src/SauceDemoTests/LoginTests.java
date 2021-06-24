package SauceDemoTests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends BaseTests {

	@BeforeMethod
	public void preSvakogTesta() {
		driver.navigate().to("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}

	@Test(priority = 0)
	public void loginTest() throws InterruptedException {

		LoginFormFilling();
		mainNavigation.reactBurgerMenuButtonClick();
		Assert.assertTrue(mainNavigation.getLogoutSidebarLink().isDisplayed());

	}

	@AfterMethod
	public void posleSvakogTesta() throws InterruptedException {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}

}
