package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class RequestQuotePageObjects {
        WebDriver driver;

        @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/form/div[1]/div/ul/li[1]/label/div[1]")
        WebElement fence_gates;
        @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/form/div[1]/div/ul/li[2]/label/div[1]")
        WebElement driveways_patios;
        @FindBy(id =  "name")
        WebElement name;
        @FindBy(id = "phone")
        WebElement phone;
        @FindBy(id = "email")
        WebElement email;
        @FindBy(linkText = "Add a note")
        WebElement addanote;
        @FindBy(id = "comment")
        WebElement addnotecomment;
        @FindBy(linkText = "Design your Fence or Gate")
        WebElement designyoufence;
        @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/form/div[7]/button")
        WebElement getquote;
        @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[2]/div/div/h4")
        WebElement thanks;
        @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[2]/div/div/p")
        WebElement callyou;
        @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[2]/div/div[3]/div/div[3]/a")
        WebElement addconfig;

        public void clickFencesGates() {
            fence_gates.click();
        }

        public void selectedFencesGates() {
            fence_gates.isSelected();
        }

        public void clickDrivewaysPatios() {
            driveways_patios.click();
        }

        public void typeName(String Name) {
            name.sendKeys(Name);
        }

        public void clearName(){ name.clear(); }

        public void clearPhone() {
            phone.clear();
        }

        public void typePhone(String Phone) { phone.sendKeys(Phone); }

        public void clearEmail() { email.clear(); }

        public void typeEmail(String Email) {
            email.sendKeys(Email);
        }

        public void displayedAddNote() { addanote.isDisplayed(); }

        public void clickAddnote() { addanote.click(); }

        public void clearAddnoteComment() { addnotecomment.clear();}

        public void typeAddnoteComment(String AddnoteComment) { addnotecomment.sendKeys(AddnoteComment);}

        public void displayedDesignFencesGates() {
            designyoufence.isDisplayed();
        }

        public void clickDesignFenceGates() { designyoufence.click(); }

        public void clickGetQuote() {
                getquote.click();
        }

        public void thanks() {
                String thanksmessage = thanks.getText();
                Assert.assertEquals(thanksmessage, "Thanks!");
        }

        public void callyou() {
                String callyoumessage = callyou.getText();
                Assert.assertEquals(callyoumessage, "We will call you within 24 hours");
        }

        public void displayedconfig() {
                addconfig.isDisplayed();
        }

        public RequestQuotePageObjects(WebDriver driver){
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }
}
