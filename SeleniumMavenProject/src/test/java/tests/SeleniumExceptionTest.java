package tests;

import java.util.NoSuchElementException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExceptionTest {

    @Test(expected = NoSuchElementException.class)
    public void elementNotFoundTest() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        // Ye element exist nahi karta → Exception aayegi
        driver.findElement(By.id("wrongId"));

        driver.quit();
    }
}

