package SauceDemoPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	// driver i konstruktor
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	
	//Web elementi i getteri

	   WebElement usernameField;
	   WebElement passwordField;
	   WebElement logInButton;

	public WebElement getUsernameField() {
		return driver.findElement(By.id("user-name"));
	}
	public WebElement getPasswordField() {
		return driver.findElement(By.id("password"));
	}
	public WebElement getLogInButton() {
		return driver.findElement(By.id("login-button"));
	}
	
	//Metode za popunu polja
	
	public void insertUsername(String username) {
		
		this.getUsernameField().clear();
		this.getUsernameField().sendKeys(username);
	}
	
   public void insertPassword(String password) {
		
		this.getPasswordField().clear();
		this.getPasswordField().sendKeys(password);
	}
	   
	   
	//Metoda za klik
   
   public void logInButtonClick () {
	   
	   this.getLogInButton().click();
   }
   
   //LoginFormFilling metoda
   
//    public void LoginFormFilling () throws InterruptedException {
//    	
//    	insertUsername("standard_user");
//    	insertPassword("secret_sauce");
//    	logInButtonClick();
//    }
	
	
	
}
