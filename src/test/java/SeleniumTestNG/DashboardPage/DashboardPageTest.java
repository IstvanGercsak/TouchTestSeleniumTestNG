package SeleniumTestNG.DashboardPage;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DashboardPageTest extends DashboardPageDriverTest {

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

    private static final String[] DROPDOWNLISTELEMENT = {"GLOBAL", "USA", "Mexico", "Brazil", "Poland"};

    @Test
    public void dashboardPageIsAvailableThroughHamburger() {

        login(testUserName, testUserPassword);
        directionWithHamburgerMenu(dashboardPage.hamburgerName());
        Assert.assertEquals(driver.getCurrentUrl(), dashboardPage.url());

    }

    @Test
    public void dashboardPageIsAvailableThroughLink() {

        login(testUserName, testUserPassword);
        clickOnTextLink(dashboardPage.hamburgerName());
        Assert.assertEquals(driver.getCurrentUrl(), dashboardPage.url());

    }

    @Test
    public void dashboardHamburgerMenuElementsAreAvailableAsMixedUser() {

        login(testUserName, testUserPassword);
        directionWithHamburgerMenu(dashboardPage.hamburgerName());
        clickOnHamburgermenu();
        hamburgerMenuElementsIsClickable();

    }

    @Test
    public void dashboardMetLifeIconDirection() {

        login(testUserName, testUserPassword);
        directionWithHamburgerMenu(dashboardPage.hamburgerName());
        clickOnTheMetlifeIcon();
        Assert.assertEquals(driver.getCurrentUrl(), touchCentral.url());

    }

    @Test
    public void dashboardUserIconDirection() {

        login(testUserName, testUserPassword);
        directionWithHamburgerMenu(dashboardPage.hamburgerName());
        clickOnProfileIcon();
        urlIsAssert(userProfilePage.url());

    }

    @Test
    public void dashboardBreadcrumb() {

        login(testUserName, testUserPassword);
        directionWithHamburgerMenu(dashboardPage.hamburgerName());
        assertBreadcrumbs(dashboardPage.breadcrumb());

    }

    @Test
    public void dashboardDropdownListElementsAreAvailable() {

        login(testUserName, testUserPassword);
        directionWithHamburgerMenu(dashboardPage.hamburgerName());
        listElementsAreClickable(DROPDOWNLISTELEMENT);

    }

    @Test
    public void dashboardHamburgerLogout() {

        login(testUserName, testUserPassword);
        directionWithHamburgerMenu(dashboardPage.hamburgerName());
        hamburgerLogout();
        Assert.assertEquals(driver.getCurrentUrl(), loginPage.url());

    }

    @AfterMethod(description = "Close the browser after each test")
    public void closeBrowser() {

        driver.close();

    }
}
