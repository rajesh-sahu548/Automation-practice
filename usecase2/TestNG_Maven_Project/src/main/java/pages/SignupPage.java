  
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SignupPage {

	// Driver reference
	WebDriver driver;

	// Constructor
	public SignupPage(WebDriver driver) {
	    this.driver = driver;
	}
	
	
	
	By name = By.cssSelector("input[placeholder='Name']");
	By email = By.cssSelector("input[data-qa='signup-email']");
	By signB = By.cssSelector("button[data-qa='signup-button']");
	
	 
	public void Signup(String user, String EmailU) {
		driver.findElement(name).sendKeys(user);
		driver.findElement(email).sendKeys(EmailU);
		driver.findElement(signB).click();
		
		
	}
}
