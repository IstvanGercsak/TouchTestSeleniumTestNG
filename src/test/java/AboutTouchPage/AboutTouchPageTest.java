package AboutTouchPage;

import BaseTestData.BaseData;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AboutTouchPageTest extends BaseData {

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
    public void AboutTouchPageIsAvailable() {

        login(testUserName, testUserPassword);
        directionWithHamburgerMenu(aboutTouchPage.hamburgerName());
        Assert.assertEquals(driver.getCurrentUrl(), aboutTouchPage.url());

    }

    @Test
    public void AboutTouchHamburgerMenuElementsAreAvailableAsMixedUser() {

        login(testUserName, testUserPassword);
        directionWithHamburgerMenu(aboutTouchPage.hamburgerName());
        clickOnHamburgermenu();
        hamburgerMenuElementsIsClickable();

    }

    //TODO: Not clear
    @Test
    public void AboutTouchHamburgerMenuElementsAreAvailableAsAdmin() {

        login(adminUserName, adminUserPassword);
        directionWithHamburgerMenu(aboutTouchPage.hamburgerName());
        clickOnHamburgermenu();
        hamburgerMenuElementsIsClickable();

    }

    //TODO: Not clear
    @Test
    public void AboutTouchHamburgerMenuElementsAreAvailableAsJurisdiction() {

        login(ukJurisdictionOperatorName, ukJurisdictionOperatorPassword);
        directionWithHamburgerMenu(aboutTouchPage.hamburgerName());
        clickOnHamburgermenu();
        hamburgerMenuElementsIsClickable();

    }

    @Test
    public void AboutTouchMetLifeIconDirection() {

        login(testUserName, testUserPassword);
        directionWithHamburgerMenu(aboutTouchPage.hamburgerName());
        clickOnTheMetlifeIcon();
        Assert.assertEquals(driver.getCurrentUrl(), touchCentral.url());

    }

    @Test
    public void AboutTouchUserIconDirection() {

        login(testUserName, testUserPassword);
        directionWithHamburgerMenu(aboutTouchPage.hamburgerName());
        clickOnProfileIcon();
        urlIsAssert(userProfilePage.url());

    }

    @Test
    public void AboutTouchTestBreadcrumb() {

        login(testUserName, testUserPassword);
        directionWithHamburgerMenu(aboutTouchPage.hamburgerName());
        assertBreadcrumbs(aboutTouchPage.breadcrumb());

    }

    @Test
    public void AboutTouchHamburgerLogout() {

        login(testUserName, testUserPassword);
        directionWithHamburgerMenu(aboutTouchPage.hamburgerName());
        hamburgerLogout();
        Assert.assertEquals(driver.getCurrentUrl(), loginPage.url());

    }

    @AfterMethod(description = "Close the browser after each test")
    public void closeBrowser() {

        driver.close();

    }
}
