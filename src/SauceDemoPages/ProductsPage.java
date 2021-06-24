package SauceDemoPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {

	
	// driver i konstruktor
		WebDriver driver;

		public ProductsPage(WebDriver driver) {
			super();
			this.driver = driver;
		}
	
	
	//Web elementi i getteri
		
		
		WebElement SauceLabsBackpackAddToCart;

		public WebElement getSauceLabsBackpackAddToCart() {
			return driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		}
		
		
	//Metoda za klik
		
		public void SauceLabsBackpackAddToCartClick () {
			
			this.getSauceLabsBackpackAddToCart().click();
		}
		
		
	
}
