package SauceDemoTests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CartTests extends BaseTests {

	@BeforeMethod
	public void preSvakogTesta() {
		driver.navigate().to("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}

	@Test(priority = 0)
	public void orderingTest() throws InterruptedException {

		LoginFormFilling();

		productsPage.getSauceLabsBackpackAddToCart();
		wdwait.until(ExpectedConditions.elementToBeClickable(productsPage.getSauceLabsBackpackAddToCart()));
		productsPage.SauceLabsBackpackAddToCartClick();

		Thread.sleep(1000);
		mainNavigation.cartButtonClick();
		String actualText = mainNavigation.textFromCartButton();
		String expectedText = "1";
		assertEquals(actualText, expectedText);

		yourCartPage.checkoutButtonClick();
		checkoutPage.CheckoutFormFilling();
		checkoutPage.finishButtonClick();

		String actualText1 = checkoutPage.textFromthankYouForOrderNote();
		String expectedText1 = "THANK YOU FOR YOUR ORDER";
		assertEquals(actualText1, expectedText1);

	}

	@AfterMethod
	public void posleSvakogTesta() throws InterruptedException {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}
}
