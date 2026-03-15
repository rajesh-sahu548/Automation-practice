package test_pagefactory;

import org.openqa.selenium.By;

//package test_pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageFactory.Loginpage;
import pages.main_page;
import pages.DashboardPage;

public class loginpagetest {

    @Test
    public void loginTest() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://onlinefeestechnocrats.in");

        // Page object (Page Factory)
        Loginpage loginPage = new Loginpage(driver);
       
        
      

        loginPage.openLoginForm();
        loginPage.login("0567cs221125", "07052005");

        
        DashboardPage desboard = new DashboardPage(driver);
desboard.clickButtonAndGetText();
desboard.clickMentorAndGetText();
        
        
        
        
        
        
        
    }
}
