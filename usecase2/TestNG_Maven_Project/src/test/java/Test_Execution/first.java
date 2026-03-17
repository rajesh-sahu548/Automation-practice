//package Test_Execution;
//
//import org.testng.annotations.Test;
//
//import base.Baseclass_for_setup;
//import pages.AccountInfoPage;
//import pages.SignupPage;
//
//public class first extends Baseclass_for_setup {
//
//    @Test
//    public void openBrowser() {
//        System.out.println("Browser opened");
//    }
//
//    @Test(dependsOnMethods = "openBrowser")
//    public void login() {
//
//        SignupPage page1 = new SignupPage(driver);
//        page1.Signup("rajesh", "g123fgfgr4yhg89@gmail.com");
//
//        System.out.println("Login done");
//    }
//
//    @Test(dependsOnMethods = "login", groups="smoke")
//    public void AccountFill() throws InterruptedException {
//
//        AccountInfoPage page2 = new AccountInfoPage(driver);
//
//        page2.enterPassword("Raj123");
//        page2.selectDOB("7", "May", "2005");
//        page2.selectCheckboxes();
//        page2.fillAddressInfo("rajesh","sahu","hcl","Noida");
//        page2.clickCreateAccount();
//
//        System.out.println("Account created");
//    }
//
//    @Test(dependsOnMethods="AccountFill")
//    public void placeOrder() {
//        System.out.println("Order placed");
//    }
//}

