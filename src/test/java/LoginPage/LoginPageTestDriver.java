package LoginPage;

import BaseTestData.BaseData;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginPageTestDriver extends BaseData {


    public void login(String TESTUSERNAME, String TESTPASSWORD) {

        driver.findElement(By.id("username")).sendKeys(TESTUSERNAME);
        driver.findElement(By.id("password")).sendKeys(TESTPASSWORD);
        driver.findElement(By.className("btn-primary")).click();

    }

    public void findInvalidMessage() {
        driver.findElement(By.className("alert-danger"));
    }

    public void urlIsAssert(String checkPage) {

        Assert.assertEquals(driver.getCurrentUrl(), checkPage);

    }

}
