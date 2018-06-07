package CentralPage;

import LoginPage.LoginPageTestDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CentralPageTest extends LoginPageTestDriver {
    @BeforeMethod(description = "Open browser before each test!")
    public void start() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(loginPage.url());

    }

    @Test
    public void pageIsAvailable() {

        login(adminUserName, adminUserPassword);
        Assert.assertEquals(driver.getCurrentUrl(), touchCentral.url());

    }

    @Test
    public void centralPageHamburgerMenuElementsAreAvailable() {

        login(adminUserName, adminUserPassword);

    }

    @Test
    public void centralPageMetlifeIcondirection() {

        login(adminUserName, adminUserPassword);
        clickOnTheMetlifeIcon();
        Assert.assertEquals(driver.getCurrentUrl(),touchCentral.url());

    }

    @Test
    public void centralPageUserIcondirection() {

        login(adminUserName, adminUserPassword);

    }

    @Test
    public void centralPageBreadctumbs() {

        login(adminUserName, adminUserPassword);

    }

    @Test
    public void permissionsAreVisibleAsAdmin() {

        login(adminUserName, adminUserPassword);

    }

    @AfterMethod(description = "Close the browser after each test")
    public void closebrowser() {
        driver.close();
    }
}
