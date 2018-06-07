package Touchpoint;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TouchpointPageTest extends TouchpointPageTestDriver {

    @BeforeMethod(description = "open browser before each test")
    public void start() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(testLoginPageURL);

    }

    @Test(description = "UK is clickable")
    public void touchpointIsReachable() {

        driver.findElement(By.id("username")).sendKeys(ukJurisdictionOperatorName);
        driver.findElement(By.id("password")).sendKeys(ukJurisdictionOperatorPassword);
        driver.findElement(By.className("btn-primary")).click();
        driver.findElement(By.xpath("//*[@id=\"defaultFragment\"]/div[3]/div/div/div/div[2]/div/a[1]")).click();
        Assert.assertEquals(driver.getCurrentUrl(), ukPageURL);

    }

    @Test(description = "Dropwodn list")
    public void second() {

        driver.findElement(By.id("username")).sendKeys(ukJurisdictionOperatorName);
        driver.findElement(By.id("password")).sendKeys(ukJurisdictionOperatorPassword);
        driver.findElement(By.className("btn-primary")).click();
        driver.findElement(By.xpath("//*[@id=\"defaultFragment\"]/div[3]/div/div/div/div[2]/div/a[1]")).click();
        driver.findElement(By.id("mode")).click();
    }

    @Test(description = "UKT1009")
    public void third() {

        driver.findElement(By.id("username")).sendKeys(ukJurisdictionOperatorName);
        driver.findElement(By.id("password")).sendKeys(ukJurisdictionOperatorPassword);
        driver.findElement(By.className("btn-primary")).click();
        driver.findElement(By.xpath("//*[@id=\"defaultFragment\"]/div[3]/div/div/div/div[2]/div/a[1]")).click();
        driver.findElement(By.name("reference")).sendKeys("UKT1009");

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
    public void closebrowser() {
        driver.close();
    }
}
