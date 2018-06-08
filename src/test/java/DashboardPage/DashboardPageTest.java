package DashboardPage;

import BaseTestData.BaseData;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DashboardPageTest extends BaseData{

    @BeforeClass
    public static void setupClass() {
        ChromeDriverManager.getInstance().setup();
    }

    @BeforeMethod(description = "Open browser before each test!")
    public void start() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(loginPage.url());

    }

    @Test
    public void pageIsAvailableThroughHamburger() {

        login(testUserName, testUserPassword);
        directionWithHamburgerMenu(dashboardPage.hamburgerName());
        Assert.assertEquals(driver.getCurrentUrl(), aboutTouchPage.url());

    }

    //ToDo: Refactor
    @Test
    public void pageIsAvailableThroughLink() {

        login(testUserName, testUserPassword);
        driver.findElement(By.linkText(dashboardPage.hamburgerName())).click();
        Assert.assertEquals(driver.getCurrentUrl(), aboutTouchPage.url());

    }

    @Test
    public void DashboardHamburgerMenuElementsAreAvailableAsMixedUser() {

        login(testUserName, testUserPassword);
        directionWithHamburgerMenu(dashboardPage.hamburgerName());
        clickOnHamburgermenu();
        hamburgerMenuElementsIsClickable();

    }

    @Test
    public void DashboardMetLifeIconDirection() {

        login(testUserName, testUserPassword);
        directionWithHamburgerMenu(dashboardPage.hamburgerName());
        clickOnTheMetlifeIcon();
        Assert.assertEquals(driver.getCurrentUrl(), touchCentral.url());

    }

    @Test
    public void DashboardUserIconDirection() {

        login(testUserName, testUserPassword);
        directionWithHamburgerMenu(dashboardPage.hamburgerName());
        clickOnProfileIcon();
        urlIsAssert(userProfilePage.url());

    }

    @Test
    public void DashboardTestBreadcrumb() {

        login(testUserName, testUserPassword);
        directionWithHamburgerMenu(dashboardPage.hamburgerName());
        assertBreadcrumbs(aboutTouchPage.hamburgerName());

    }

    //TODO:
    @Test
    public void DropdownListElementsAreAvailable() {

        login(testUserName, testUserPassword);
        directionWithHamburgerMenu(dashboardPage.hamburgerName());
        //listelements();

    }

    @AfterMethod(description = "Close the browser after each test")
    public void closeBrowser() {

        driver.close();

    }
}
