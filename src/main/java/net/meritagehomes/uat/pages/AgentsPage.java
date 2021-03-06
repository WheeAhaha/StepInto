package net.meritagehomes.uat.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.BasePage;

public class AgentsPage extends BasePage {
    //*********Constructor*********
    public AgentsPage (WebDriver driver) {
        super(driver);
    }
    @Step
    public void verifyTitle (String expectedText) {

        Assert.assertEquals(driver.getTitle(), expectedText);
    }
}
