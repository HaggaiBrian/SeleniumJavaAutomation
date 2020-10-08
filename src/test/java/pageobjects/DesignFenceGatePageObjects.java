package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@SuppressWarnings("ALL")
public class DesignFenceGatePageObjects {

    static WebElement element;

    public static WebElement button_fencetype(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div/div[1]/div/div[2]/div/div[2]/div[2]/div/div[2]/button[1]"));
        return element;
    }
    public static WebElement image_nailupfence(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div/div[1]/div/div[2]/div/div[2]/div[2]/div/div[3]/div/ul/div[2]/li/label/div[2]/div/div[1]/img"));
        return element;
    }

    public static WebElement button_height(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div/div[1]/div/div[2]/div/div[2]/div[2]/div/div[2]/button[2]"));
        return element;
    }

    public static WebElement radiobutton_sixinch(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div/div[1]/div/div[2]/div/div[2]/div[2]/div/div[3]/div/ul/div[1]/li/label/div[1]"));
        return element;
    }

    public static WebElement radiobutton_seveninch(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div/div[1]/div/div[2]/div/div[2]/div[2]/div/div[3]/div/ul/div[2]/li/label/div[1]"));
        return element;
    }

    public static WebElement radiobutton_eightinch(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div/div[1]/div/div[2]/div/div[2]/div[2]/div/div[3]/div/ul/div[3]/li/label/div[1]"));
        return element;
    }

    public static WebElement button_picketbuild(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div/div[1]/div/div[2]/div/div[2]/div[2]/div/div[2]/button[3]"));
        return element;
    }

    public static WebElement image_loveredpicket(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div/div[1]/div/div[2]/div/div[2]/div[2]/div/div[3]/div/ul/div[2]/li/label/div[2]/div/div[1]/img"));
        return element;
    }

    public static WebElement button_latticestyle(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div/div[1]/div/div[2]/div/div[2]/div[2]/div/div[2]/button[4]"));
        return element;
    }

    public static WebElement image_diagonallattice(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div/div[1]/div/div[2]/div/div[2]/div[2]/div/div[3]/div/ul/div[2]/li/label/div[2]/div/div[1]/img"));
        return element;
    }

    public static WebElement button_technicaldetails(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div/div[1]/div/div[2]/div/div[2]/div[1]/div[2]/div/div[1]/span"));
        return element;
    }

    public static WebElement button_frontside(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div/div[1]/div/div[2]/div/div[2]/div[1]/div[1]/div/div[2]/div[1]/div/span[2]"));
        return element;
    }

    public static WebElement button_backside(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div/div[1]/div/div[2]/div/div[2]/div[1]/div[1]/div/div[2]/div[1]/div/span[3]"));
        return element;
    }

    public static WebElement button_3dmodel(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div/div[1]/div/div[2]/div/div[2]/div[1]/div[1]/div/div[2]/div[1]/div/span[1]"));
        return element;
    }

    public static WebElement button_gateoptions(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div/div[1]/div/div[2]/div/div[2]/div[2]/div/div[1]/ul/li[2]"));
        return element;
    }

    public static WebElement button_fenceoptions(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div/div[1]/div/div[2]/div/div[2]/div[2]/div/div[1]/ul/li[1]"));
        return element;
    }

    public static WebElement button_addorder(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div/div[1]/div/div[2]/div/div[2]/div[2]/div/div[4]/div[2]/div[2]/button"));
        return element;
    }
}
