package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import utils.ConfigReader;

public class BaseTest {

    public static WebDriver driver;
    public static ExtentReports extent;
    public static ExtentTest test;

    // ---------- START REPORT ----------
    @BeforeSuite
    public void startReport() {

        ExtentSparkReporter spark =
                new ExtentSparkReporter("reports/ExtentReport.html");

        extent = new ExtentReports();
        extent.attachReporter(spark);

        extent.setSystemInfo("Tester", "Rajesh Sahu");
        extent.setSystemInfo("Browser", ConfigReader.getProperty("browser"));
        extent.setSystemInfo("Project", "Automation Framework");
    }

    // ---------- SETUP BROWSER ----------
    @BeforeMethod
    public void setUp() {

        String browser = ConfigReader.getProperty("browser");

        if(browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        }

        else if(browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        }

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(
                Duration.ofSeconds(
                        Integer.parseInt(ConfigReader.getProperty("timeout"))
                )
        );

        driver.get(ConfigReader.getProperty("url"));

        test = extent.createTest("Myntra Test Execution");
        test.info("Browser launched and website opened");
    }

    // ---------- CLOSE BROWSER ----------
    @AfterMethod
    public void tearDown() {

        driver.quit();
        test.info("Browser closed");
    }

    // ---------- END REPORT ----------
    @AfterSuite
    public void endReport() {

        extent.flush();
    }
}