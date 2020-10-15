package pageobjects;

import helper.ModelHelper;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static java.lang.Thread.sleep;

public class LandingPageObjects{
    WebDriver driver;
    public LandingPageObjects(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(how = How.XPATH,using = "//input[contains(@name, 'textinput')]")
    WebElement address;

    public void typeAddress(String Address) throws InterruptedException {
        address.sendKeys(Address);
        sleep(5000);
    }

    public void pressKeys(){
        address.sendKeys(Keys.ARROW_DOWN, Keys.RETURN);
    }

    public void clearAddress() throws InterruptedException {
        address.clear();
        sleep(20000);
    }

}