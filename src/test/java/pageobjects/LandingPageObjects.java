package pageobjects;

import helper.ModelHelper;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LandingPageObjects{
    WebDriver driver;
    public LandingPageObjects(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(how = How.XPATH,using = "//input[contains(@name, 'textinput')]")
    WebElement address;
    @FindBy(how = How.XPATH, using = "//*[name()='svg']")
    WebElement maximizechat;

    public void typeAddress(String Address) {
        address.sendKeys(Address);
    }

    public void pressKeys(){
        address.sendKeys(Keys.ARROW_DOWN, Keys.RETURN);
    }

    public void clearAddress() {
        address.clear();
    }

    public void maximizechat() {
        ModelHelper.waitForElementToBeVisible(driver, maximizechat, 10);
    }

}