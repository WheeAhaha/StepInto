package utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    public WebDriver driver;
    public WebDriverWait wait;
    public PageGenerator page;

    @BeforeClass
    public void setup () {

        System.setProperty("webdriver.chrome.driver","D:\\Work\\Maritage Homes\\Automation\\StepInto\\src\\main\\resources\\chromedriver.exe");
        //Create a Chrome driver. All test and page classes use this driver.
        driver = new ChromeDriver();

        //Create a wait. All test and page classes use this wait.
        wait = new WebDriverWait(driver,15);

        //Maximize Window
        driver.manage().window().maximize();

//        //Instantiate the Page Class
//        page = new PageGenerator(driver);
    }
//    If you are doing single threaded test execution, you can increase your test execution time with below implementation.
//    This time, I only created one driver instance at Class level, not at Method level.
//    This implementation opens only one browser for each test class.
    @BeforeMethod
    public void methodLevelSetup () {
        //Instantiate the Page Class
        page = new PageGenerator(driver);
    }

    @AfterClass
    public void teardown () {
        driver.quit();
    }
}
