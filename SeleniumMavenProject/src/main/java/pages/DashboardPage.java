package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {

    WebDriver driver;

    By btn = By.xpath("//td[contains(text(),'RAJESH')]");

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public void  clickButtonAndGetText() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(btn)
        );

        String text = element.getText();
        System.out.println("Text is: " + text);

//        element.click();

      
        
        
        
        
    }
    
    
    
    
    By mentorBtn = By.name("ctl00$cPanel$btnMentorDetails");
    public void clickMentorAndGetText() {
    	

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(mentorBtn)
        );
        
        String text = element.getAttribute("value");

        System.out.println("Text is: " + text);
        
    	element.click();
      
       
       	

        
        
        
    }
    
    
    
    
    
}
