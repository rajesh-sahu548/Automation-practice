package pages;


import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class HomePage {

    WebDriver driver;

    @FindBy(xpath="//input[@placeholder='Search for products, brands and more']")
    WebElement searchBox;

    @FindBy(xpath="(//li[contains(@class,'product-base')])[1]")
    WebElement firstProduct;
    
    
  
    

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void searchProduct(String product) {
        searchBox.sendKeys(product);
        searchBox.sendKeys(Keys.ENTER);
    }

    public void openFirstProduct() {
        firstProduct.click();
        
    }
    
    
    
    
}