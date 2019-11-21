package SeleniumTestNG.AdminInfo;

import SeleniumTestNG.BaseData.BaseData;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AdminInfoTest extends BaseData {

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
    public void adminInfoIsAvailable() {

        login(testUserName, testUserPassword);
        directionWithHamburgerMenu(adminInfoPage.hamburgerName());
        Assert.assertEquals(driver.getCurrentUrl(), adminInfoPage.url());

    }

    @Test
    public void adminInfoIsNotAvailableAsJurisdiction() {

        login(ukJurisdictionOperatorName, ukJurisdictionOperatorPassword);
        directionWithHamburgerMenu(adminInfoPage.hamburgerName());
        assertAccessDeniedText();

    }

    @Test
    public void adminInfoBreadcrumb() {

        login(testUserName, testUserPassword);
        directionWithHamburgerMenu(adminInfoPage.hamburgerName());
        assertBreadcrumbs(adminInfoPage.breadcrumb());

    }

    @Test
    public void adminInfoTestIconDirection() {

        login(adminUserName, adminUserPassword);
        directionWithHamburgerMenu(adminInfoPage.hamburgerName());
        clickOnTheTestIcon();
        Assert.assertEquals(driver.getCurrentUrl(), touchCentral.url());

    }

    @Test
    public void adminInfoUserIconDirection() {

        login(adminUserName, adminUserPassword);
        directionWithHamburgerMenu(adminInfoPage.hamburgerName());
        clickOnProfileIcon();
        urlIsAssert(userProfilePage.url());

    }

    @Test
    public void adminInfoLogout() {

        login(adminUserName, adminUserPassword);
        directionWithHamburgerMenu(adminInfoPage.hamburgerName());
        hamburgerLogout();
        Assert.assertEquals(driver.getCurrentUrl(), loginPage.url());

    }

    @AfterMethod(description = "Close the browser after each test")
    public void closeBrowser() {

        driver.close();

    }
}
