package net.meritagehomes.uat;


import io.qameta.allure.*;
import net.meritagehomes.uat.pages.HomePage;
import org.testng.annotations.Test;
import utilities.BaseTest;

@Epic("Test Epic")
@Feature("Test Feature")
public class SearchTest extends BaseTest {
    @Test(priority = 0, description = "Test #1")
    @Story("Test Story #1")
    @Description("Test Description")
    @Severity(SeverityLevel.BLOCKER)
    public void getTitle_ValidValue1 () throws InterruptedException {

        page.getInstance(HomePage.class).goToHomePage();
        page.getInstance(HomePage.class).verifyTitle("Build a Home with Meritage Homes");
//        page.getInstance(HomePage.class).fetchText();
        page.getInstance(HomePage.class).
                goToAgents().verifyTitle("Agent Rocks Rewards Program | Meritage Homes");
    }

    @Test(priority = 1, description = "Test #2")
    @Story("Test Story #1")
    @Description("Test Description")
    @Severity(SeverityLevel.BLOCKER)
    public void getTitle_ValidValue2 () throws InterruptedException {

        page.getInstance(HomePage.class).goToHomePage();
        page.getInstance(HomePage.class).verifyTitle("Build a Home with Meritage Homes");
//        page.getInstance(HomePage.class).fetchText();
        page.getInstance(HomePage.class).
                goToAgents().verifyTitle("Agent Rocks Rewards Program | Meritage Homes");
    }
}
