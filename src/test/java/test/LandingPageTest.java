package test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pageobjects.DesignFenceGatePageObjects;
import pageobjects.LandingPageObjects;
import pageobjects.RequestQuotePageObjects;


public class LandingPageTest extends BaseTest{
    WebDriverWait wait;

    @Test(priority = 1)
    public void getquote() throws InterruptedException {
        LandingPageObjects landingPage = PageFactory.initElements(driver, LandingPageObjects.class);
        wait = new WebDriverWait(driver, 12);
        landingPage.clearAddress();
        landingPage.typeAddress("1 Apple Park Way, Cupertino, CA 95014, USA");
        wait = new WebDriverWait(driver, 2);
        landingPage.pressKeys();
        RequestQuotePageObjects requestPage = PageFactory.initElements(driver, RequestQuotePageObjects.class);
        wait = new WebDriverWait(driver, 2);
        requestPage.clearName();
        requestPage.typeName("Ergeon QA");
        requestPage.clearPhone();
        requestPage.typePhone("5555555555");
        requestPage.clearEmail();
        requestPage.typeEmail("ergeonqaautomation@gmail.com");
        requestPage.displayedAddNote();
        requestPage.clickAddnote();
        requestPage.clearAddnoteComment();
        requestPage.typeAddnoteComment("I love the work that is done by Ergeon, contactless construction");
        requestPage.displayedDesignFencesGates();
        requestPage.clickDesignFenceGates();
        DesignFenceGatePageObjects designPage = PageFactory.initElements(driver, DesignFenceGatePageObjects.class);
        designPage.clickFenceType();
        designPage.clickHeight();
        designPage.clickPicketBuild();
        designPage.clickLatticeStyle();
        designPage.clickAddorder();
        requestPage.clickGetQuote();
        requestPage.thanks();
        requestPage.callyou();

    }

    @Test(priority = 2)
    public void errorAddress() {

    }
}