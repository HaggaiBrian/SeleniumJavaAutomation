package helper;

import com.google.common.base.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ModelHelper {

    public static WebElement waitForElementToBeVisible(WebDriver driver, WebElement webelement, int seconds){
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        WebElement element = wait.until(ExpectedConditions.visibilityOf(webelement));
        return element;
    }
    public static WebElement waitForElementToBeClickable(WebDriver driver, WebElement webelement, int seconds){
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(webelement));
        return element;
    }
    public static WebElement waitForAllElementsToBeVisible(WebDriver driver, WebElement webelement, int seconds){
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        WebElement element = wait.until(ExpectedConditions.visibilityOf(webelement));
        return element;
    }
}
