package AboutTouchPage;

import LoginPage.LoginPageTestDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AboutTouchPageTest extends LoginPageTestDriver {

    @BeforeMethod(description = "Open browser before each test!")
    public void start() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(LoginTestPageURL);

    }

    @Test
    public void pageIsAvailable() {
        login(adminUserName, adminUserPassword);
        Assert.assertEquals(driver.getCurrentUrl(),aboutTouchURL);
    }

    @Test
    public void AboutTouchHamburgerMenuElementsAreAvailable() {
        login(adminUserName, adminUserPassword);

    }

    @Test
    public void AboutTouchMetlifeIcondirection() {
        login(adminUserName, adminUserPassword);
    }

    @Test
    public void AboutTouchUserIcondirection() {
        login(adminUserName, adminUserPassword);
    }

    @Test
    public void AboutTouchBreadctumbs() {
        login(adminUserName, adminUserPassword);
    }

    @AfterMethod(description = "Close the browser after each test")
    public void closebrowser() {
        driver.close();
    }
}
