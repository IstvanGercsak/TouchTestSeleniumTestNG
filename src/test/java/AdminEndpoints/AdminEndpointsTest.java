package AdminEndpoints;

import BaseTestData.BaseData;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AdminEndpointsTest extends BaseData {

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
    public void adminEndpointsIsAvailable() {

        login(testUserName, testUserPassword);
        directionWithHamburgerMenu(adminEndpointsPage.hamburgerName());
        Assert.assertEquals(driver.getCurrentUrl(), adminEndpointsPage.url());

    }

    @Test
    public void adminEndpointsIsNotAvailableAsJurisdiction() {

        login(ukJurisdictionOperatorName, ukJurisdictionOperatorPassword);
        directionWithHamburgerMenu(adminEndpointsPage.hamburgerName());
        assertAccessDeniedText();

    }

    @Test
    public void adminEndpointsBreadcrumb() {

        login(testUserName, testUserPassword);
        directionWithHamburgerMenu(adminEndpointsPage.hamburgerName());
        clickOnHamburgermenu();
        hamburgerMenuElementsIsClickable();

    }

    @Test
    public void adminEndpointsMetLifeIconDirection() {

        login(adminUserName, adminUserPassword);
        directionWithHamburgerMenu(adminEndpointsPage.hamburgerName());
        clickOnTheMetlifeIcon();
        Assert.assertEquals(driver.getCurrentUrl(), touchCentral.url());

    }

    @Test
    public void adminEndpointsUserIconDirection() {

        login(adminUserName, adminUserPassword);
        directionWithHamburgerMenu(adminEndpointsPage.hamburgerName());
        clickOnProfileIcon();
        urlIsAssert(userProfilePage.url());

    }

    @Test
    public void adminEndpointsLogout() {

        login(adminUserName, adminUserPassword);
        directionWithHamburgerMenu(adminEndpointsPage.hamburgerName());
        hamburgerLogout();
        Assert.assertEquals(driver.getCurrentUrl(), loginPage.url());

    }

    @AfterMethod(description = "Close the browser after each test")
    public void closeBrowser() {

        driver.close();

    }
}
