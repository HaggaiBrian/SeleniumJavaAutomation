package pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DesignFenceGatePageObjects {
    WebDriver driver;

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div/div[1]/div/div[2]/div/div[2]/div[2]/div/div[2]/button[1]")
    WebElement button_fencetype;
    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div/div[1]/div/div[2]/div/div[2]/div[2]/div/div[2]/button[2]")
    WebElement button_height;
    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div/div[1]/div/div[2]/div/div[2]/div[2]/div/div[2]/button[3]")
    WebElement button_picketbuild;
    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div/div[1]/div/div[2]/div/div[2]/div[2]/div/div[2]/button[4]")
    WebElement button_latticestyle;
    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div/div[1]/div/div[2]/div/div[2]/div[2]/div/div[4]/div[2]/div[2]/button")
    WebElement button_addorder;

    public void clickFenceType() {
        button_fencetype.click();
    }

    public void clickHeight() {
        button_height.click();
    }

    public void clickPicketBuild() {
        button_picketbuild.click();
    }

    public void clickLatticeStyle() {
        button_latticestyle.click();
    }

    public void clickAddorder() {
        button_addorder.click();
    }

    public DesignFenceGatePageObjects(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
