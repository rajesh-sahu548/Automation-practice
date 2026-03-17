package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleDependencyTest {

    // 1️⃣ Login Test
    @Test
    public void loginTest() {
        System.out.println("Login Successful");
        Assert.assertTrue(true);   // try false to see skip
    }

    // 2️⃣ Dashboard depends on Login
    @Test(dependsOnMethods = "loginTest")
    public void dashboardTest() {
        System.out.println("Dashboard Loaded");
    }

    // 3️⃣ Logout depends on Dashboard
    @Test(dependsOnMethods = "dashboardTest")
    public void logoutTest() {
        System.out.println("Logout Successful");
    }
}
