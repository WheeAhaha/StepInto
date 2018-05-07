package net.meritagehomes.uat.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.BasePage;

public class HomePage extends BasePage {

    //*********Constructor*********
    public HomePage (WebDriver driver) {
        super(driver);
    }

    //*********Page Variables*********
    private String baseURL = "https://uat.meritagehomes.com/";

    //*********Web Elements*********
    @FindBy(how = How.ID, using = "button--search" )
    private WebElement signInButtonClass;

    //*********Page Methods*********

    //Go to Homepage
    @Step
    public void goToHomePage (){
        driver.get(baseURL);
        //driver.navigate().to(baseURL)
    }

    //Verify Text Condition
    @Step
    public void verifyTitle (String expectedText) {

        Assert.assertEquals(driver.getTitle(), expectedText);
    }

    @Step
    public AgentsPage goToAgents(){
        driver.get("https://uat.meritagehomes.com/agents");
        return new PageFactory().initElements(driver,AgentsPage.class);
    }

    @Step
    public void fetchText(){
        WebElement wb = signInButtonClass;
        wb.click();
    }

}