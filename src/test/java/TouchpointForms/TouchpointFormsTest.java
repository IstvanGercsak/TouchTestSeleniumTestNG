package TouchpointForms;

import BaseTestData.BaseData;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TouchpointFormsTest extends BaseData {

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
    public void touchpointFormsIsAvailableAsAdmin() {

        login(adminUserName, adminUserPassword);
        directionWithHamburgerMenu(TouchpointFormsPage.hamburgerName());
        Assert.assertEquals(driver.getCurrentUrl(), TouchpointFormsPage.url());

    }

    @Test
    public void touchpointFormsIsNotAvailableAsJurisdiction() {

        login(ukJurisdictionOperatorName, ukJurisdictionOperatorPassword);
        directionWithHamburgerMenu(TouchpointFormsPage.hamburgerName());
        assertAccessDeniedText();

    }

    @Test
    public void touchpointFormsBreadcrumb() {

        login(adminUserName, adminUserPassword);
        directionWithHamburgerMenu(TouchpointFormsPage.hamburgerName());
        assertBreadcrumbs(TouchpointFormsPage.breadcrumb());

    }

    @Test
    public void touchpointFormsMetLifeIconDirection() {

        login(adminUserName, adminUserPassword);
        directionWithHamburgerMenu(TouchpointFormsPage.hamburgerName());
        clickOnTheMetlifeIcon();
        Assert.assertEquals(driver.getCurrentUrl(), touchCentral.url());

    }

    @Test
    public void touchpointFormsUserIconDirection() {

        login(adminUserName, adminUserPassword);
        directionWithHamburgerMenu(TouchpointFormsPage.hamburgerName());
        clickOnProfileIcon();
        urlIsAssert(userProfilePage.url());

    }

    @Test
    public void touchpointFormsLogout() {

        login(adminUserName, adminUserPassword);
        directionWithHamburgerMenu(TouchpointFormsPage.hamburgerName());
        hamburgerLogout();
        Assert.assertEquals(driver.getCurrentUrl(), loginPage.url());

    }

    @AfterMethod(description = "Close the browser after each test")
    public void closeBrowser() {

        driver.close();

    }
}
