package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    static WebDriver driver = null;

    @BeforeSuite
    public void setup()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://dev.ergeon.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        String actualLandingPageUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualLandingPageUrl, "https://dev.ergeon.com/");
        String actualLandingPageTitle = driver.getTitle();
        Assert.assertEquals(actualLandingPageTitle, "Fence and Driveway Contractors");
    }

    @AfterSuite
    public void teardown()
    {
        driver.close();
        driver.quit();
    }
}
