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

    private static final String[] REFERENCETYPE = {"Policy Number", "BPA number","Reference"};
    private static final String TESTREFERENCEID = "Reference id;123456";
    private static final String PRODUCTCATEGORY = "Accident and health";
    private static final String[] PRODUCTNAME = {"Accident Protection", "Multi-Protect"};
    private static final String[] ORIGIN = {"Not specified","Online Form","Service Center Call","Postal","Email"};
    private static final String[] STATUS = {"Closed","In Progress","New"};
    private static final double TESTAMOUNT = 45.45;
    private static final String[] AMOUNTCURRENCY = {"AED","ARS","AUD","BGN","BHD","BRL"};
    private static final String AMOUNTCURRENCYtxt = "src/amountCurrency.txt";
    private static final String LOCATIONtxt = "src/Location.txt";



    @Test(description = "UK is clickable")
    public void touchpointIsReachable() {

        login(testUserName, testUserPassword);
        clickOnTextLink("UK");
        Assert.assertEquals(driver.getCurrentUrl(), uktouchPage.url());

    }

    @Test(description = "Dropwodn list")
    public void second() {

        login(testUserName, testUserPassword);
        clickOnTextLink("UK");
        driver.findElement(By.id("mode")).click();
    }

    @Test(description = "UKT1009")
    public void third() {

        login(testUserName, testUserPassword);
        clickOnTextLink("UK");
        driver.findElement(By.name("reference")).sendKeys("UKT1009");

    }

    @Ignore
    @Test
    public void Lists() {

//        login(testUserName, testUserPassword);
//        clickOnTextLink("UK");
//        driver.findElement(By.name("reference")).sendKeys("UKT1009");
//        driver.findElement(By.className("btn-default")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.linkText("Create New Touchpoint")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.id("search-contacts")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.linkText("Create New Contact")).click();

        assertTheFileWithList(AMOUNTCURRENCYtxt);

    }

//    @Ignore
//    @Test(description = "update")
//    public void Update() throws InterruptedException {
//        /*Log In*/
//        driver.findElement(By.id("username")).sendKeys(TESTUSERNAME);
//        driver.findElement(By.id("password")).sendKeys(TESTPASSWORD);
//        driver.findElement(By.className("btn-primary")).click();
//        driver.findElement(By.xpath("//*[@id=\"defaultFragment\"]/div[3]/div/div/div/div[2]/div/a[1]")).click();
//        driver.findElement(By.name("reference")).sendKeys("UKT1009");
//        driver.findElement(By.className("glyphicon-search")).click();
//        driver.findElement(By.xpath("//*[@id=\"defaultFragment\"]/div[3]/div/div/section/div[4]/div/div[1]/span[2]/a")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//button[contains(text(),'Add Update')]")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.name("updateComment")).sendKeys("AutoTest");
//        driver.findElement(By.id("saveUpdate")).click();
//        Thread.sleep(1000);
//
//    }

    @AfterMethod(description = "Close the browser after each test")
    public void closeBrowser() {

        driver.close();

    }
}
