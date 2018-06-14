package SeleniumTestNG.CentralPage;

import SeleniumTestNG.BaseData.BaseData;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CentralPageTest extends BaseData {

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
    public void centralPageLoginIsPossibleWithAdmin(){

        login(adminUserName, adminUserPassword);
        Assert.assertEquals(driver.getCurrentUrl(), touchCentral.url());

    }

    @Test
    public void centralPageLoginIsPossibleWithJurisdiction(){

        login(ukJurisdictionOperatorName, ukJurisdictionOperatorPassword);
        Assert.assertEquals(driver.getCurrentUrl(), touchCentral.url());

    }

    @Test
    public void centralPageHamburgerMenuElementsAreAvailableWithAdmin() {

        login(adminUserName, adminUserPassword);
        hamburgerMenuElementsIsClickable();

    }

    @Test
    public void centralPageHamburgerMenuElementsAreAvailableWithJurisdiction() {

        login(ukJurisdictionOperatorName, ukJurisdictionOperatorPassword);
        hamburgerMenuElementsIsClickable();

    }

    @Test
    public void centralPageMetLifeIconDirection() {

        login(adminUserName, adminUserPassword);
        clickOnTheMetlifeIcon();
        Assert.assertEquals(driver.getCurrentUrl(),touchCentral.url());

    }

    @Test
    public void centralPageUserIconDirection() {

        login(adminUserName, adminUserPassword);

    }

    @Test
    public void centralPageCentralPageBreadcrumb() {

        login(adminUserName, adminUserPassword);
        assertBreadcrumbs(touchCentral.breadcrumb());

    }

    @Test
    public void centralPageHamburgerLogout() {

        login(testUserName, testUserPassword);
        directionWithHamburgerMenu(touchCentral.hamburgerName());
        hamburgerLogout();
        Assert.assertEquals(driver.getCurrentUrl(), loginPage.url());

    }

    @AfterMethod(description = "Close the browser after each test")
    public void closeBrowser() {

        driver.close();

    }
}
