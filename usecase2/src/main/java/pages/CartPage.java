package pages;

import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;

public class CartPage {

    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath="//div[contains(@class,'itemComponents-base-quantity')]")
    WebElement quantityBox;

    
    @FindBy(xpath="//span[text()='Total MRP']/following-sibling::span")
    WebElement subtotalPrice;

    
    @FindBy(xpath="//div[text()='DONE']")
    WebElement doneButton;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    public void changeQuantityTo10() {

        wait.until(ExpectedConditions.elementToBeClickable(quantityBox));
        quantityBox.click();

        WebElement qtyOption = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//div[contains(@class,'dialogs-base-display') and text()='10']")
                )
        );

        String oldSubtotal = subtotalPrice.getText();

        qtyOption.click();
        wait.until(ExpectedConditions.elementToBeClickable(doneButton));
        doneButton.click();

        wait.until(ExpectedConditions.not(
                ExpectedConditions.textToBePresentInElement(subtotalPrice, oldSubtotal)
        ));
    }

    public double getSubtotalPrice() {
        wait.until(ExpectedConditions.visibilityOf(subtotalPrice));
        String total = subtotalPrice.getText()
                .replace("₹","")
                .replace(",","")
                .trim();
        return Double.parseDouble(total);
    }

    public void verifyTotal(int quantity) {

        double subtotal = getSubtotalPrice();
        double unitPrice = subtotal / quantity;   // derive unit price dynamically
        double expected = unitPrice * quantity;

        System.out.println("Derived Unit Price: " + unitPrice);
        System.out.println("Expected Subtotal: " + expected);
        System.out.println("Actual Subtotal: " + subtotal);

        Assert.assertEquals(subtotal, expected,
                "Subtotal price calculation mismatch!");
        
        
    }

	public void changeQuantity(int i) {
		// TODO Auto-generated method stub
		
	}
}