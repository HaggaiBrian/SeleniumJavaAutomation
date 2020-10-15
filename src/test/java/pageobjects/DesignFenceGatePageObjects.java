package pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DesignFenceGatePageObjects {
    WebDriver driver;

    @FindBy(how = How.XPATH, using = "//button[text() = 'Fence Type']")
            @CacheLookup
    WebElement button_fencetype;
    @FindBy(how = How.XPATH, using = "//button[text() = 'Height']")
    WebElement button_height;
    @FindBy(how = How.XPATH, using = "//button[text() = 'Picket Build']")
    WebElement button_picketbuild;
    @FindBy(how = How.XPATH, using = "//button[text() = 'Lattice Style']")
    WebElement button_latticestyle;
    @FindBy(how = How.XPATH, using = "//button[text() = 'Add to order']")
            @CacheLookup
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
