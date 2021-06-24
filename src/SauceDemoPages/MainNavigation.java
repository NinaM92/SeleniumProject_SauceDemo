package SauceDemoPages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainNavigation {

	
	// driver i konstruktor
		WebDriver driver;

		public MainNavigation(WebDriver driver) {
			super();
			this.driver = driver;
		}
	
	//Web elementi  i getteri
		
		WebElement reactBurgerMenuButton;
		
		WebElement logoutSidebarLink;
		
		WebElement cartButton;

		
		public WebElement getCartButton() {
			return driver.findElement(By.className("shopping_cart_link"));
		}
			
		public WebElement getReactBurgerMenuButton() {
			return  driver.findElement(By.id("react-burger-menu-btn"));
		}
		public WebElement getLogoutSidebarLink() {
			return  driver.findElement(By.id("logout_sidebar_link"));
		}

		//Metode za klik
		public void reactBurgerMenuButtonClick() {
			this.getReactBurgerMenuButton().click();
		}
		
		public void cartButtonClick() {
			this.getCartButton().click();
		}
		
		//MetodaZa String
		
				public String textFromCartButton () {
					return this.getCartButton().getText();
				}
			
	
	
}
