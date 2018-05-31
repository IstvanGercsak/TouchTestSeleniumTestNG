package LoginPageTest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginPageTest extends LoginPageTestDriver {

    private static final String TESTPAGE = "https://touch-test-central.azurewebsites.net/central/";
    private static final String TESTUSERNAME = "istvan.gercsak@metlife.com";
    private static final String TESTPASSWORD = "Igercsak8!#";



    @BeforeMethod(description = "open browser before each test")
    public void start() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(getBASESITE());

    }

    @Test(description = "First test")
    public void first() {

        driver.findElement(By.id("username")).sendKeys(TESTUSERNAME);
        driver.findElement(By.id("password")).sendKeys(TESTPASSWORD);
        driver.findElement(By.className("btn-primary")).click();
        Assert.assertEquals(driver.getCurrentUrl(), TESTPAGE);

    }

    @Test(description = "Second test")
    public void second() {

        driver.findElement(By.id("username")).sendKeys(TESTUSERNAME);
        driver.findElement(By.id("password")).sendKeys(TESTPASSWORD);
        driver.findElement(By.className("btn-primary")).click();
        Assert.assertEquals(driver.getCurrentUrl(), TESTPAGE);
    }

    @Test(description = "Second test")
    public void third() {

        driver.findElement(By.id("username")).sendKeys(TESTUSERNAME);
        driver.findElement(By.id("password")).sendKeys(TESTPASSWORD);
        driver.findElement(By.className("btn-primary")).click();
        Assert.assertEquals(driver.getCurrentUrl(), TESTPAGE);
    }

    @AfterMethod(description = "Close the browser after each test")
    public void closebrowser() {
        driver.close();
    }
}
