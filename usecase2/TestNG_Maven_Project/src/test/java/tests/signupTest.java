package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import base.Baseclass_for_setup;
import io.qameta.allure.testng.AllureTestNg;
import pages.AccountInfoPage;
import pages.SignupPage;
import reports.ExcelReader;
import reports.ExtentManager;



//@Listeners({AllureTestNg.class})

public class signupTest extends Baseclass_for_setup{
	
//	@Test(priority = 1)
//	@Test(priority = 2)
	 //   @Test

//	  ExtentReports extent;
//	    ExtentTest test;

	    // ✅ Report sirf ek baar banao
	//    @BeforeSuite
//	    public void startReport() {
//	        extent = ExtentManager.createReport();
//	    }

//	    @Test
//	    public void signupTest() {
//
//	        test = extent.createTest("Signup Test");
//
//	        test.info("Signup test started");
//
//	        SignupPage page1 = new SignupPage(driver);
//	        test.info("Navigating to signup page");
//
//	        page1.Signup("rajesh", "sahu@gmail.com");
//	        test.pass("Entered name and email");
//
//	        AccountInfoPage page2 = new AccountInfoPage(driver);
//	        page2.enterPassword("Ronaj123");
//	        test.pass("Password entered");
//
//	        page2.selectDOB("7", "May", "2005");
//	        test.pass("DOB selected");
//
//	        page2.selectCheckboxes();
//	        page2.fillAddressInfo();
//	        test.pass("Address details filled");
//
//	        page2.clickCreateAccount();
//	        test.pass("Account created successfully");
//	    }

//	    @Test
//	    public void signTest() {
//
//	        test = extent.createTest("Sign Test");
//
//	        SignupPage page1 = new SignupPage(driver);
//	        test.info("Opening signup page");
//
//	        page1.Signup("rajesh", "rsjkdyjjjh@gmail.com");
//	        test.pass("Entered name and email");
//
//	        AccountInfoPage page2 = new AccountInfoPage(driver);
//	        page2.enterPassword("Raj123");
//	        test.pass("Password entered");
//
//	        page2.selectDOB("7", "May", "2005");
//	        test.pass("DOB selected");
//
//	        page2.selectCheckboxes();
//	        page2.fillAddressInfo();
//	        test.pass("Address filled");
//
//	        page2.clickCreateAccount();
//	        test.pass("Account created");
//	    }
//
//	    // ✅ Report close sirf ek baar
//	    @AfterSuite
//	    public void closeReport() {
//	        extent.flush();
//	    }
	    	
  	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	
	
	
//}
	
	//@Test(groups="smoke")
//	@Test
//	public void signTest(){
//
//	    SignupPage page1 = new SignupPage(driver);
//	    page1.Signup("rajesh", "rtnr9hj08j@gmail.com");
//	}

//	@Test(groups="regression")
//	public void accountInfoTest() {
//
//	    AccountInfoPage page2 = new AccountInfoPage(driver);
//	    page2.enterPassword("Raj123");
//	    page2.selectDOB("7", "May", "2005");
//	}
//
//	
//}
//	










	
//  @Test(dependsOnMethods = "signupTest")
//	@Test(priority = 2)
	
//	
	
	
	
	
	
	
	
	
	
	
	
	// @Test
	/// @Test(groups="smoke")
//@Test
//	public void AccountFill() {
//     	SignupPage page1 = new SignupPage(driver);
//
//    	page1.Signup("rajesh", "rajeasnnkaj@gmail.com");
//		AccountInfoPage page2 =  new AccountInfoPage(driver);
//
//		page2.enterPassword("Raj123");
//		page2.selectDOB("7", "May", "2005");
//		
//		page2.selectCheckboxes();
//		page2.fillAddressInfo("rajesh","sahu","HCLTECH","BHOpal");
//
//		// page2.fillAddressInfo();
//		page2.clickCreateAccount();
//	}
//}
//	
//	
	
//	
//	SignupPage page1;
//	 AccountInfoPage page2;
//
//	 @Test(priority=1)
//	 public void signupTest() {
//
//	  page1 = new SignupPage(driver);
//	  page1.Signup("rajesh","9rrajeshaj@gmail.com");
//
//	  page2 = new AccountInfoPage(driver);
//	 }
//
//	 @Test(priority=2, dependsOnMethods="signupTest")
//	 public void passwordTest() {
//
//	  page2.enterPassword("Raj123");
//	 }
//
//	 @Test(priority=3, dependsOnMethods="passwordTest")
//	 public void dobTest() {
//
//	  page2.selectDOB("7","May","2005");
//	 }
//
//	 @Test(priority=4, dependsOnMethods="dobTest")
//	 public void checkboxTest() {
//
//	  page2.selectCheckboxes();
//	 }
//
//	 @Test(priority=5, dependsOnMethods="checkboxTest")
//	 public void addressTest() {
//
//	  page2.fillAddressInfo("rajesh","sahu","HCLTECH","Bhopal","sagar","Mp","city","470113","3343343343");
//	 }
//
//	 @Test(priority=6, dependsOnMethods="addressTest")
//	 public void createAccountTest() {
//
//	  page2.clickCreateAccount();
//	  
//	 }
//}


////	
////	
	
	
//	
	ExtentReports extent;
	
	ExtentTest test;
	

@BeforeClass
public void setuup() {
    extent = ExtentManager.getExtent();
}

	
	
	
	  // 🔹 DataProvider (paste here)
    @DataProvider(name="excelData")
    public Object[][] getData() throws Exception {

        return ExcelReader.readExcel();
    }

    
	    @Test(dataProvider="excelData")
	    public void createAccount(String userId,
                String email,
                String password,
                String day,
                String month,
                String year,
                String name,
                String lname,
                String company,
                String address1,
                String address2,
                String state,
                String city,
                String zipcode,
                String mobile) {
//
	    	test = extent.createTest("Signup Test - " + userId);

SignupPage sp= new SignupPage(driver);
	    	sp.Signup(userId,email);
	    	test.info("Signup page filled");

	    	
	    	AccountInfoPage ap = new AccountInfoPage(driver);
	    	ap.enterPassword(password);
	    	ap.selectDOB(day,month,year);
	    	ap.selectCheckboxes();

	    	test.info("Account info filled");

	    	
	    	ap.fillAddressInfo(name,
	                   lname,
	                   company,
	                   address1,
	                   address2,
	                   state,
	                   city,
	                   zipcode,
	                   mobile);

	    	ap.clickCreateAccount();
	    	// driver.get("https://automationexercise.com/signup");  
	    	test.pass("Account created successfully");

	    }
	
//	
//	
//	
	 // 🔹 Close report
	    @AfterClass
	    public void endReport(){

	     extent.flush();
	    }
	
	
	
}

//	 
//
