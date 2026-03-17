//package utils;
//
//import org.openqa.selenium.*;
//import org.openqa.selenium.support.ui.*;
//import java.time.Duration;
//
//public class WaitUtils {
//
//    private static final int TIMEOUT = 15;
//
//    public static WebElement waitForVisibility(WebDriver driver, WebElement element) {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
//        return wait.until(ExpectedConditions.visibilityOf(element));
//    }
//
//    public static WebElement waitForClickable(WebDriver driver, WebElement element) {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
//        return wait.until(ExpectedConditions.elementToBeClickable(element));
//    }
//
//    public static void waitForTextChange(WebDriver driver, WebElement element, String oldText) {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
//        wait.until(ExpectedConditions.not(
//                ExpectedConditions.textToBePresentInElement(element, oldText)
//        ));
//    }
//}