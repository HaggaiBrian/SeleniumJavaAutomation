package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@SuppressWarnings("ALL")
public class RequestsQuotePageObjects {

    static WebElement element;

    public static WebElement radiobutton_fencesgates(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/form/div[1]/div/ul/li[1]/label/div[1]"));
        return element;
    }

    public static WebElement radiobutton_drivewayspatios(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/form/div[1]/div/ul/li[2]/label/div[1]"));
        return element;
    }

    public static WebElement textbox_name(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"name\"]"));
        return element;
    }

    public static WebElement textbox_phonenumber(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"phone\"]"));
        return element;
    }

    public static WebElement textbox_email(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        return element;
    }

    public static WebElement button_addnote(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/form/div[6]/div[1]/a"));
        return element;
    }

    public static WebElement textbox_addnote(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"comment\"]"));
        return element;
    }

    public static WebElement button_design(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/form/div[6]/div[2]/a"));
        return element;
    }

    public static WebElement button_getquote(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/form/div[7]/button"));
        return element;
    }

    public static WebElement checkbox_emailme(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/form/div[7]/div/label/span"));
        return element;
    }

    public static WebElement button_addconfig(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[3]/div/div[3]/a"));
        return element;
    }

    public static WebElement text_thanks(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/h4"));
        return element;
    }

    public static WebElement text_thanks2(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/p"));
        return element;
    }
}
