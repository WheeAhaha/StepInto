package net.meritagehomes.uat;


import net.meritagehomes.uat.pages.AgentsPage;
import net.meritagehomes.uat.pages.HomePage;
import org.testng.annotations.Test;
import utilities.BaseTest;

public class SearchTest extends BaseTest {
    @Test(priority = 0)
    public void invalidLoginTest_InvalidUserNameInvalidPassword () throws InterruptedException {

        page.getInstance(HomePage.class).goToHomePage();
        page.getInstance(HomePage.class).verifyTitle("Build a Home with Meritage Homes");
        page.getInstance(HomePage.class).fetchText();
        page.getInstance(HomePage.class).
                goToAgents().verifyTitle("Agent Rocks Rewards Program | Meritage Homes");


    }



}
