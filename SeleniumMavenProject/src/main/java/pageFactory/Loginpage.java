package pageFactory;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pages.DashboardPage;

public class Loginpage  {

    WebDriver driver;

    // constructor
    public Loginpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    // Page Factory locator
    @FindBy(xpath = "//a[normalize-space()='Online Tuition Fee Payment & No Dues Request']")
    WebElement onlineFeeLink;
    
    // locators (Page Factory)
    @FindBy(id = "Login1_UserName")
    WebElement username;

    @FindBy(id = "Login1_Password")
    WebElement password;

    @FindBy(id = "Login1_LoginButton")
    WebElement loginBtn;
    public void openLoginForm() {
    	onlineFeeLink.click();
    }

    // actions
    public  void login(String user, String pass) {
        username.sendKeys(user);
        password.sendKeys(pass);
        loginBtn.click();

       
        
        
     //    return new DashboardPage(driver); // ⭐ important
        
        
        
    }
}
