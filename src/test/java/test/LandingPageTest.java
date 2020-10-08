package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.DesignFenceGatePageObjects;
import pageobjects.LandingPageObjects;
import pageobjects.RequestsQuotePageObjects;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

@SuppressWarnings("ALL")
public class LandingPageTest {
    static WebDriver driver;
        //Instantiate Objects
        String baseUrl = "https://dev.ergeon.com/";
        String chromePath = "/home/haggaibrian/Ergeon-Workspace/getquote-ergeon/src/test/java/drivers/chromedriver";
        String firefoxPath = "/home/haggaibrian/Ergeon-Workspace/getquote-ergeon/src/test/java/drivers/geckodriver";

        //****Landing Page Test Data****
        String expectedLandingPageTitle = "Fence and Driveway Contractors";
        String addressLandingPage = "1 Apple Park Way, Cupertino, CA 95014, USA";

        //****Request Quote Page Test Data****
        String expectedRequestQuotePageTitle = "Fence and Driveway Contractors";
        String expectedRequestQuotePageUrl = "https://dev.ergeon.com/request-quote";
        String yourName = "Ergeon QA";
        String phoneNumber = "5555555555";
        String email = "ergeonqa@gmail.com";
        String addNote = "This is an automated Note From the Selenium QA Framework";
        String thankYouMessage = "Thanks!";
        String thankYouMessage2 = "We will call you within 24 hours";

    @Before
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        /* Since I am using a Maven Project, I can instead use a webdriver manager to go ahead and locatea browser driver
        of choice just like the comment line below
        System.setProperty("webdriver.chromedriver.driver", chromePath);*/
        driver = new ChromeDriver();
        driver.navigate().to(baseUrl);
        /* I use .navigate().to(). but some people can also use the .get() method. The difference is with the latter, a
        a user is able to access browser page history and navigate through the different pages
        driver.get(baseUrl);*/
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Thread.sleep(7000);
        }

        @Test
        public void getQuote() throws InterruptedException {
            //Check and verify that url is correct
            String actualLandingPageUrl = driver.getCurrentUrl();
            Assert.assertEquals(actualLandingPageUrl, baseUrl);

            //Check and verify  that title is correct
            String actualLandingPageTitle = driver.getTitle();
            Assert.assertEquals(actualLandingPageTitle, expectedLandingPageTitle);

            //Find Address Text Box and Enter A valid Address
            LandingPageObjects.textbox_address(driver).clear();
            LandingPageObjects.textbox_address(driver).sendKeys(addressLandingPage);
            Thread.sleep(4000);
            LandingPageObjects.textbox_address(driver).sendKeys(Keys.ARROW_DOWN);
            LandingPageObjects.textbox_address(driver).sendKeys(Keys.RETURN);

        /*//Check and verify that url is correct
        String actualRequestQuotePageUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualRequestQuotePageUrl, expectedRequestQuotePageUrl);*/

            //Check and verify  that title is correct
            String actuaRequestQuotePageTitle = driver.getTitle();
            Assert.assertEquals(actuaRequestQuotePageTitle, expectedRequestQuotePageTitle);

            //Click Radio Button or fences
            RequestsQuotePageObjects.radiobutton_fencesgates(driver).click();
            RequestsQuotePageObjects.radiobutton_fencesgates(driver).isSelected();

            //Enter Text Box Name
            RequestsQuotePageObjects.textbox_name(driver).clear();
            RequestsQuotePageObjects.textbox_name(driver).sendKeys(yourName);

            //Enter Text Box Phone Number
            RequestsQuotePageObjects.textbox_phonenumber(driver).clear();
            RequestsQuotePageObjects.textbox_phonenumber(driver).sendKeys(phoneNumber);

            //Enter Text Box Email
            RequestsQuotePageObjects.textbox_email(driver).clear();
            RequestsQuotePageObjects.textbox_email(driver).sendKeys(email);

            //Scroll the page to the co-ordinates
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,300)");

            //Click the add note button to add note
            RequestsQuotePageObjects.button_addnote(driver).click();
            RequestsQuotePageObjects.textbox_addnote(driver).sendKeys(addNote);

            //Click the Design your fence or Gate
            RequestsQuotePageObjects.button_design(driver).click();
            sleep(4000);

            //Click through all the buttons to check functionality
            DesignFenceGatePageObjects.button_frontside(driver).click();
            DesignFenceGatePageObjects.button_backside(driver).click();
            DesignFenceGatePageObjects.button_gateoptions(driver).click();
            DesignFenceGatePageObjects.button_fenceoptions(driver).click();
            sleep(5000);
            DesignFenceGatePageObjects.button_3dmodel(driver).click();

            //Designing the Fence
            DesignFenceGatePageObjects.image_nailupfence(driver).click();
            DesignFenceGatePageObjects.button_height(driver).click();
            DesignFenceGatePageObjects.radiobutton_eightinch(driver).click();
            DesignFenceGatePageObjects.button_picketbuild(driver).click();
            DesignFenceGatePageObjects.image_loveredpicket(driver).click();
            DesignFenceGatePageObjects.button_latticestyle(driver).click();
            DesignFenceGatePageObjects.image_diagonallattice(driver).click();

            //Scroll page tp reveal the technical details button
            js.executeScript("window.scrollBy(0,300)");

            //Click technical details button to show technical details
            DesignFenceGatePageObjects.button_technicaldetails(driver).click();
            js.executeScript("window.scrollBy(0,300)");

            //Click the Add order button
            DesignFenceGatePageObjects.button_addorder(driver).click();

            //Check if the Add config button is displayed
            RequestsQuotePageObjects.button_addconfig(driver).isDisplayed();

            // Scroll up to reveal button get quote
            js.executeScript("window.scrollBy(0,-300)");

            //Click to get quote and Check Box
            RequestsQuotePageObjects.checkbox_emailme(driver).click();
            RequestsQuotePageObjects.checkbox_emailme(driver).isSelected();
            RequestsQuotePageObjects.button_getquote(driver).click();
            Thread.sleep(5000);

            //Check and Verify that the right text is shown in this screen after a successful quote send
            String thanks = RequestsQuotePageObjects.text_thanks(driver).getText();
            Assert.assertEquals(thanks, thankYouMessage);
            String thanks2 = RequestsQuotePageObjects.text_thanks2(driver).getText();
            Assert.assertEquals(thanks2, thankYouMessage2);
        }

    @After
    public void tearDown() throws Exception{
    //Closes the driver instance as well as all open browsers
            driver.close();
            driver.quit();
        }
    }
