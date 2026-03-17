package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AccountInfoPage {
	   WebDriver driver;

	    // ---------- ACCOUNT INFORMATION ----------
	    By titleMr = By.cssSelector("#id_gender1");
	    By titleMrs = By.xpath("//input[@id='id_gender2']");
	    By password = By.cssSelector("#password");

	    By days = By.id("days");
	    By months = By.id("months");
	    By years = By.id("years");

	    By newsletter = By.id("newsletter");
	    By offers = By.id("optin");

	    // ---------- ADDRESS INFORMATION ----------
	    By firstName = By.id("first_name");
	    By lastName = By.id("last_name");
	    By company = By.id("company");
	    By address1 = By.id("address1");
	    By address2 = By.id("address2");
	    By country = By.id("country");
	    By state = By.id("state");
	    By city = By.id("city");
	    By zipcode = By.id("zipcode");
	    By mobile = By.id("mobile_number");

	    By createAccountBtn = By.xpath("//button[text()='Create Account']");
	    
	    
	    public AccountInfoPage(WebDriver driver) {
	        this.driver = driver;
	    }
	    
	    
	    public void enterPassword(String pwd) {
		    driver.findElement(titleMr).click();

	        driver.findElement(password).sendKeys(pwd);
	    }

	    public void selectDOB(String day, String month, String year) { 
	    	
	    	new Select(driver.findElement(days)).selectByValue(day);
	    	new Select(driver.findElement(months)).selectByVisibleText(month); 
	    new Select(driver.findElement(years)).selectByValue(year);
	    }
	    
	    public void selectCheckboxes() {
	        driver.findElement(newsletter).click();
	        driver.findElement(offers).click();
	    }

	    // ===== ADDRESS INFO METHODS =====
	    public void fillAddressInfo(String name, String lastname, String compantN, String addressCIty,
	String add2, String State, String ciity, String Zipcode, String Mob    		) {
	        driver.findElement(firstName).sendKeys(name);
	        driver.findElement(lastName).sendKeys(lastname);
	        driver.findElement(company).sendKeys(compantN);
	        driver.findElement(address1).sendKeys(addressCIty);
	        driver.findElement(address2).sendKeys(add2);

	        new Select(driver.findElement(country)).selectByVisibleText("India");

	        driver.findElement(state).sendKeys(State);
	        driver.findElement(city).sendKeys(ciity);
	        driver.findElement(zipcode).sendKeys(Zipcode);
	        driver.findElement(mobile).sendKeys(Mob);
	    }

	    public void clickCreateAccount() {
	        driver.findElement(createAccountBtn).click();  }
	    
	    
}
