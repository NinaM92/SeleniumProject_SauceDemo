package SauceDemoPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YourCartPage {

	
	
	// driver i konstruktor
		WebDriver driver;

		public YourCartPage(WebDriver driver) {
			super();
			this.driver = driver;
		}
	
	
    //Web elementi i getteri
		
		WebElement checkoutButton;

		public WebElement getCheckoutButton() {
			return driver.findElement(By.id("checkout"));
		}
			
		
	//Metoda za klik
		
		public void checkoutButtonClick () {
			this.getCheckoutButton().click();
		}
		
		
		
		
	
}
