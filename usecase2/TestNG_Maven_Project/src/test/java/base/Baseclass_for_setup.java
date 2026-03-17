package base;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Baseclass_for_setup {
 public static WebDriver driver ;
 
 
 
 
 
 
 
@BeforeMethod
//@BeforeClass

public void setup() {
	
	driver = new EdgeDriver();
    driver.manage().window().maximize();

    
    driver.get("https://automationexercise.com/signup");

}
@AfterMethod
// @AfterClass
public void EndExecution() throws InterruptedException {
	 
//	 driver.get("https://automationexercise.com/signup");
//	 Thread.sleep(4000); // small buffer

//	driver.quit();
}

//runs AFTER ALL rows finished
//@AfterClass
//public void closeBrowser(){
//
// driver.quit();
//}

}
