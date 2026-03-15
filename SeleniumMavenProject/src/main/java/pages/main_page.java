package pages;

import java.time.Duration;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class main_page {

	
	
    WebDriver driver;

    // constructor
    public main_page(WebDriver driver) {
        this.driver = driver;
    }


    // locators
    By username = By.xpath("//input[@id='Login1_UserName']");
    By password = By.xpath("//input[@id='Login1_Password']");
    By loginBtn = By.xpath("//input[@id='Login1_LoginButton']");

    // actions
    @Test
      //  @Parameters({"username", "password"})
    public void login(String user, String pass) {
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginBtn).click();
        
        
        
    }
 
    
    
    
 // locator
//    By btn = By.xpath("//td[contains(text(),'RAJESH')]");
//
//    // ✅ NEW METHOD (wait + click + getText)
//    public String clickButtonAndGetText() {
////
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//
//        WebElement element = wait.until(
//                ExpectedConditions.elementToBeClickable(btn)
//        );
//
//        String s=  element.getText();
//        System.out.println("Text is: " + s); // ✅ PRINT
//
//        return s;
////        
//   }  
////    
    
    
    
    
    
    
    
    
//    
//    By btn1 = By.xpath("//td[normalize-space()='0567CS221125']");
//
//    public void clickButtonAndGetText1() {
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//
//        WebElement name = wait.until(
//            ExpectedConditions.visibilityOfElementLocated(btn1)
//        );
//
//        System.out.println("Text is: " + name.getText());
//    }

 
   
    
    
    
    
    
    
    
}