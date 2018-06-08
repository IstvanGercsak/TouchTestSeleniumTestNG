package AboutTouchPage;

import BaseTestData.BaseData;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AboutTouchPageTest extends BaseData {

    @BeforeMethod(description = "Open browser before each test!")
    public void start() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(loginPage.url());

    }

    /*In this case it is not necessary to test with the two permission*/

    @Test
    public void pageIsAvailable() {

        login(testUserName, testUserPassword);
        directionWithHamburgerMenu(aboutTouchPage.hamburgerName());
        Assert.assertEquals(driver.getCurrentUrl(), aboutTouchPage.url());

    }

    @Test
    public void AboutTouchHamburgerMenuElementsAreAvailable() {

        login(testUserName, testUserPassword);
        directionWithHamburgerMenu(aboutTouchPage.hamburgerName());
        clickOnHamburgermenu();
        hamburgerMenuElementsIsClickable();

    }

    @Test
    public void AboutTouchMetlifeIcondirection() {

        login(testUserName, testUserPassword);
        directionWithHamburgerMenu(aboutTouchPage.hamburgerName());
        clickOnTheMetlifeIcon();
        Assert.assertEquals(driver.getCurrentUrl(), touchCentral.url());

    }

    @Test
    public void AboutTouchUserIcondirection() {

        login(testUserName, testUserPassword);
        directionWithHamburgerMenu(aboutTouchPage.hamburgerName());
        clickOnProfileIcon();
        urlIsAssert(userProfilePage.url());

    }

    @Test
    public void AboutTouchTestBreadctumbs() {

        login(testUserName, testUserPassword);
        directionWithHamburgerMenu(aboutTouchPage.hamburgerName());
        assertBreadcrumbs(aboutTouchPage.hamburgerName());

    }

    @AfterMethod(description = "Close the browser after each test")
    public void closebrowser() {
        driver.close();
    }
}
