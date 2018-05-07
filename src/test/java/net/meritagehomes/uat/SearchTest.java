package net.meritagehomes.uat;


import io.qameta.allure.*;
import net.meritagehomes.uat.pages.AgentsPage;
import net.meritagehomes.uat.pages.HomePage;
import org.testng.annotations.Test;
import utilities.BaseTest;
@Epic("Test Epic")
@Feature("Test Feature")
public class SearchTest extends BaseTest {
    @Test(priority = 0, description = "Test description in @Test annotation")
    @Story("Test Story")
    @Description("Test Description")
    @Severity(SeverityLevel.BLOCKER)
    public void invalidLoginTest_InvalidUserNameInvalidPassword () throws InterruptedException {

        page.getInstance(HomePage.class).goToHomePage();
        page.getInstance(HomePage.class).verifyTitle("Build2 a Home with Meritage Homes");
        page.getInstance(HomePage.class).fetchText();
        page.getInstance(HomePage.class).
                goToAgents().verifyTitle("Agent Rocks Rewards Program | Meritage Homes");


    }



}
