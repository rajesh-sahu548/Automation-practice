package pageFactory;
//package test_pagefactory;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {

    WebDriver driver;
    WebDriverWait wait;

    // constructor
    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    // ===== Locators (Page Factory) =====

    @FindBy(xpath = "//td[contains(text(),'RAJESH')]")
    WebElement nameText;

    @FindBy(name = "ctl00$cPanel$btnMentorDetails")
    WebElement mentorBtn;

    // ===== Actions =====

    public void clickButtonAndGetText() {

        wait.until(ExpectedConditions.visibilityOf(nameText));

        String text = nameText.getText();
        System.out.println("Text is: " + text);
    }

    public void clickMentorAndGetText() {

        wait.until(ExpectedConditions.visibilityOf(mentorBtn));

        String text = mentorBtn.getAttribute("value");
        System.out.println("Text is: " + text);

        mentorBtn.click();
    }
}
