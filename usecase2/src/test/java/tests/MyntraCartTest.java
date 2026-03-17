package tests;

import base.BaseTest;
import dev.failsafe.internal.util.Assert;
import pages.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class MyntraCartTest extends BaseTest {

    @Test
    public void verifyCartPricing() {

        HomePage home = new HomePage(driver);
        ProductPage product = new ProductPage(driver);

        // 1️⃣ Search Product
        home.searchProduct("Women's Sneakers");

        String parentWindow = driver.getWindowHandle();

        // 2️⃣ Open First Product
        home.openFirstProduct();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(d -> d.getWindowHandles().size() > 1);

        // 3️⃣ Switch Window
        for (String window : driver.getWindowHandles()) {
            if (!window.equals(parentWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }

        // 4️⃣ Capture Product Price
      product.getProductPagePrice();

        // 5️⃣ Add To Cart
        product.addToCart();

        // 6️⃣ Now Initialize CartPage
        CartPage cart = new CartPage(driver);

        // 7️⃣ Change Quantity
        cart.changeQuantityTo10();

        // 8️⃣ Verify Total
        cart.verifyTotal(10);

    }
	


	
}