package SauceDemoPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {

	
	// driver i konstruktor
		WebDriver driver;

		public CheckoutPage(WebDriver driver) {
			super();
			this.driver = driver;
		}
	
		
	//WebElementi i getteri	
	WebElement inputFirstName;
	WebElement inputLastName;
	WebElement inputZipPostalCode;
	WebElement continueButton;
	WebElement finishButton;
	WebElement thankYouForOrderNote;
	
	

	
	public WebElement getThankYouForOrderNote() {
		return driver.findElement(By.className("complete-header"));
	}
	public WebElement getFinishButton() {
		return driver.findElement(By.id("finish"));
	}
	public WebElement getInputFirstName() {
		return driver.findElement(By.id("first-name"));
	}
	public WebElement getInputLastName() {
		return driver.findElement(By.id("last-name"));
	}
	public WebElement getInputZipPostalCode() {
		return driver.findElement(By.id("postal-code"));
	}
	public WebElement getContinueButton() {
		return driver.findElement(By.id("continue"));
	}

	
	//Metode za popunu polja
	
	public void insertFirstName (String firstName) {
		this.getInputFirstName().sendKeys(firstName);
	}
	public void insertLastName (String lastName) {
		this.getInputLastName().sendKeys(lastName);
	}
	public void insertZipPostalCode (String zipPostalCode) {
		this.getInputZipPostalCode().sendKeys(zipPostalCode);
	}
	
	//Metoda za klik
	public void continueButtonClick() {
		this.getContinueButton().click();
	}
	public void finishButtonClick() {
		this.getFinishButton().click();
	}
	
	
	//Metoda za CheckoutFormFilling
	
	public void CheckoutFormFilling() throws InterruptedException {
		insertFirstName("Tara");
		insertLastName("Marković");
		insertZipPostalCode("21000");
		continueButtonClick();
	
	}
	
	//Metoda za String
	
	public String textFromthankYouForOrderNote() {
		
		return this.getThankYouForOrderNote().getText();
	}
	
}
