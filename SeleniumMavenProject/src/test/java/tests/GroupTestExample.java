package tests;


import org.testng.annotations.Test;

public class GroupTestExample {

    @Test(groups = {"smoke"})
    public void loginTest() {
        System.out.println("Login Test");
    }

    @Test(groups = { "regression"})
    public void addToCartTest() {
        System.out.println("Add To Cart Test");
    }

    @Test(groups = {"smoke", "regression"})
    public void logoutTest() {
        System.out.println("Logout Test");
    }
}
