package Touchpoint;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TouchpointPageTest extends TouchpointPageTestDriver {
    private static final String TESTPAGE = "https://touch-test-central.azurewebsites.net/central/";
    private static final String TESTUSERNAME = "istvan.gercsak@metlife.com";
    private static final String TESTPASSWORD = "Igercsak8!#";
    private static final String TOUCHPOINTPAGEUK = "http://touch-test-zone.azurewebsites.net/uk/";


    @BeforeMethod(description = "open browser before each test")
    public void start() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(getBASESITE());

    }

    @Test(description = "UK is clickable")
    public void touchpointIsReachable() {

        driver.findElement(By.id("username")).sendKeys(TESTUSERNAME);
        driver.findElement(By.id("password")).sendKeys(TESTPASSWORD);
        driver.findElement(By.className("btn-primary")).click();
        driver.findElement(By.xpath("//*[@id=\"defaultFragment\"]/div[3]/div/div/div/div[2]/div/a[1]")).click();
        Assert.assertEquals(driver.getCurrentUrl(), TOUCHPOINTPAGEUK);

    }

    @Test(description = "Dropwodn list")
    public void second() {

        driver.findElement(By.id("username")).sendKeys(TESTUSERNAME);
        driver.findElement(By.id("password")).sendKeys(TESTPASSWORD);
        driver.findElement(By.className("btn-primary")).click();
        driver.findElement(By.xpath("//*[@id=\"defaultFragment\"]/div[3]/div/div/div/div[2]/div/a[1]")).click();
        driver.findElement(By.id("mode")).click();
    }

    @Test(description = "UKT1009")
    public void third() {

        driver.findElement(By.id("username")).sendKeys(TESTUSERNAME);
        driver.findElement(By.id("password")).sendKeys(TESTPASSWORD);
        driver.findElement(By.className("btn-primary")).click();
        driver.findElement(By.xpath("//*[@id=\"defaultFragment\"]/div[3]/div/div/div/div[2]/div/a[1]")).click();
        driver.findElement(By.name("reference")).sendKeys("UKT1009");


    }

    @AfterMethod(description = "Close the browser after each test")
    public void closebrowser() {
        driver.close();
    }
}
