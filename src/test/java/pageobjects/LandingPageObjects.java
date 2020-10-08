package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@SuppressWarnings("ALL")
public class LandingPageObjects {

    static WebElement element;

    public static WebElement textbox_address(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[1]/div/div[1]/div[1]/div/div/div/div/div/input"));
        return element;
    }
    public static WebElement button_getquote(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[1]/div/div[1]/div[1]/div/div/div/div/div/button"));
        return element;
    }
}
