package tests;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.DashboardPage;
import pages.main_page;

public class Login_test {

	//  @Test(groups = {"smoke"})
//    @Test
  //  @Test(dependsOnMethods = "logoutTest")

	
	
	

//	@BeforeTest
	
    @Test(expectedExceptions = NoSuchElementException.class)

    public void loginTest() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
//		  driver.findElement(By.cssSelector("body > form:nth-child(1) > div:nth-child(9) > main:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > a:nth-child(1)")).click();


        // demo login site
        driver.get("https://onlinefeestechnocrats.in");
       
        driver.findElement(By.id("wrongId"));

        
		  driver.findElement(By.cssSelector("body > form:nth-child(1) > div:nth-child(9) > main:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > a:nth-child(1)")).click();

//
		  
        main_page page = new main_page(driver);
        
        page.login("0567cs221125", "07052005");

        
//        return new DashboardPage(driver); 
        
        
        
//   
        
//        
        DashboardPage dashboard = new DashboardPage(driver);
//
//
//        // Dashboard action
       
        		dashboard.clickButtonAndGetText();
//
//        driver.quit();
//    
        

        		dashboard.clickMentorAndGetText();
       
        
//       
//            main_page home = new main_page(driver);
//
//
//            String resultText = home.clickButtonAndGetText();
//            System.out.println(resultText);
////        
        
//            
            
            
            
            
            
            
            
            
            
            
            
            
            
////            
//        main_page home = new main_page(driver);
//            home.clickButtonAndGetText1();
            
//            
//            
            
        
    }
    
    
    
    
    
    
    
    
    
    
}





