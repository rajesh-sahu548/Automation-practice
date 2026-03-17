package pages;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

public class ProductPage {

    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath="(//div[contains(@class,'size-buttons')]//button)[2]")
    WebElement firstAvailableSize;

    @FindBy(xpath="//div[contains(@class,'pdp-add-to-bag')]")
    WebElement addToBag;

    @FindBy(xpath="//span[contains(@class,'desktop-iconBag')]")
    WebElement goToBag;

    @FindBy(xpath="//span[contains(@class,'pdp-price')]")
    WebElement productPrice;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    
    
    public double getProductPagePrice() {
        wait.until(ExpectedConditions.visibilityOf(productPrice));
        String price = productPrice.getText()
                .replace("₹", "")
                .replace(",", "")
                .trim();
        return Double.parseDouble(price);
    }

    
    
    public void addToCart() {

        wait.until(ExpectedConditions.elementToBeClickable(firstAvailableSize));
        firstAvailableSize.click();

        wait.until(ExpectedConditions.elementToBeClickable(addToBag));
        addToBag.click();

        wait.until(ExpectedConditions.elementToBeClickable(goToBag));
        goToBag.click();
    }
}