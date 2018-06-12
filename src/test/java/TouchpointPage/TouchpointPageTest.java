package TouchpointPage;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TouchpointPageTest extends TouchPointPageDriverTest {

    @BeforeClass
    public static void setupClass() {
        ChromeDriverManager.getInstance().setup();
    }

    @BeforeMethod(description = "open browser before each test")
    public void start() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(loginPage.url());

    }

    private static final String[] SEARCHBYMODE = {"Reference", "Name", "Emil"};
    private static final String[] REFERENCETYPE = {"Policy Number", "BPA number", "Reference"};
    private static final String TESTREFERENCEID = "Reference id;123456";
    private static final String PRODUCTCATEGORY = "Accident and health";
    private static final String[] PRODUCTNAME = {"Accident Protection", "Multi-Protect"};
    private static final String[] ORIGIN = {"Not specified", "Online Form", "Service Center Call", "Postal", "Email"};
    private static final String[] STATUS = {"Closed", "In Progress", "New"};
    private static final double TESTAMOUNT = 45.45;
    private static final String AMOUNTCURRENCYtxt = "src/amountCurrency.txt";
    private static final String LOCATIONtxt = "src/Location.txt";


    @Test(description = "UK is clickable")
    public void touchpointPageIsReachable() {

        login(testUserName, testUserPassword);
        goToTouchpoint();
        Assert.assertEquals(driver.getCurrentUrl(), uktouchPage.url());

    }

    @Test
    public void touchpointPagePlaceholder() {

        login(testUserName, testUserPassword);
        goToTouchpoint();
        assertPlaceholder(PLACEHOLDERSEARCH);

    }

    @Test
    public void touchpointPageSearchByReference() {

        login(testUserName, testUserPassword);
        goToTouchpoint();
        searchByMode("Reference");
        searchText();
        assertResult();
        Assert.assertEquals("", "");

    }

    @Test
    public void touchpointPageSearchByName() {

        login(testUserName, testUserPassword);
        goToTouchpoint();
        searchByMode("Name");
        searchText();
        assertResult();

    }

    @Test
    public void touchpointPageSearchByEmil() {

        login(testUserName, testUserPassword);
        goToTouchpoint();
        searchByMode("Emil");
        searchText();
        assertResult();

    }

    @Test(description = "I can find UKT1009")
    public void touchpointPageTouchpointFind() {

        login(testUserName, testUserPassword);
        goToTouchpoint();
        driver.findElement(By.name("reference")).sendKeys("UKT1009");

    }

    @Test
    public void touchpointPageAmountCurrency() {

        login(testUserName, testUserPassword);
        goToTouchpoint();
        goToCreateToucpointPage();
//        assertTheFileWithList(AMOUNTCURRENCYtxt);

    }

    @Test
    public void touchpointPageMetLifeIconDirection() {

        login(testUserName, testUserPassword);
        goToTouchpoint();

    }

    @Test
    public void touchpointPageBreadcrumb() {

        login(testUserName, testUserPassword);
        goToTouchpoint();
        //uk:tlbl:zone:touchpoints-title

    }

    @Ignore
    @Test(description = "This test is not works")
    public void touchpointPageLogout() {

        login(testUserName, testUserPassword);
        goToTouchpoint();

    }

    @Test
    public void touchpointPageUserProfilePageNotAvailable() {

        login(testUserName, testUserPassword);
        goToTouchpoint();

    }

    @Ignore
    @Test(description = "This test should be expand")
    public void touchpointPageHamburgerMenuElements() {

        login(testUserName, testUserPassword);
        goToTouchpoint();

    }

    @Ignore
    @Test(description = "update")
    public void Update() {

        login(testUserName, testUserPassword);
        driver.findElement(By.className("btn-primary")).click();
        driver.findElement(By.xpath("//*[@id=\"defaultFragment\"]/div[3]/div/div/div/div[2]/div/a[1]")).click();
        driver.findElement(By.name("reference")).sendKeys("UKT1009");
        driver.findElement(By.className("glyphicon-search")).click();
        driver.findElement(By.xpath("//*[@id=\"defaultFragment\"]/div[3]/div/div/section/div[4]/div/div[1]/span[2]/a")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Add Update')]")).click();
        driver.findElement(By.name("updateComment")).sendKeys("AutoTest");
        driver.findElement(By.id("saveUpdate")).click();

    }

    @AfterMethod(description = "Close the browser after each test")
    public void closeBrowser() {

        driver.close();

    }
}
