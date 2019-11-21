package SeleniumTestNG.UserProfilePage;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class UserProfilePageJurisdictionUserTest extends UserProfilePageTestDriver {

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

    /*From these test we can create smoke test with different users*/

    @Test
    public void UserProfileJurisdictionUserPageIsAvailable() {

        login(ukJurisdictionOperatorName, ukJurisdictionOperatorPassword);
        directionWithHamburgerMenu(userProfilePage.hamburgerName());
        Assert.assertEquals(driver.getCurrentUrl(), userProfilePage.url());

    }

    @Test
    public void UserProfileJurisdictionUserHamburgerMenuElementsAreAvailable() {

        login(ukJurisdictionOperatorName, ukJurisdictionOperatorPassword);
        directionWithHamburgerMenu(userProfilePage.hamburgerName());
        clickOnHamburgermenu();
        hamburgerMenuElementsIsClickable();

    }

    @Test
    public void UserProfileJurisdictionUserTestIconDirection() {

        login(ukJurisdictionOperatorName, ukJurisdictionOperatorPassword);
        directionWithHamburgerMenu(userProfilePage.hamburgerName());
        clickOnTheTestIcon();
        Assert.assertEquals(driver.getCurrentUrl(), touchCentral.url());

    }

    @Test
    public void UserProfileJurisdictionUserUserIconDirection() {

        login(ukJurisdictionOperatorName, ukJurisdictionOperatorPassword);
        directionWithHamburgerMenu(userProfilePage.hamburgerName());
        clickOnProfileIcon();
        urlIsAssert(userProfilePage.url());

    }

    @Test
    public void UserProfileJurisdictionUserTestBreadcrumb() {

        login(ukJurisdictionOperatorName, ukJurisdictionOperatorPassword);
        directionWithHamburgerMenu(userProfilePage.hamburgerName());
        assertBreadcrumbs(userProfilePage.breadcrumb());

    }


    @Test
    public void UserProfileJurisdictionUserPermissionIsVisibleAsJurisdiction() {

        login(ukJurisdictionOperatorName, ukJurisdictionOperatorPassword);
        directionWithHamburgerMenu(userProfilePage.hamburgerName());
        assertTextOn("Central Admin", false);
        assertTextOn("UK Jurisdiction Operator", true);

    }

    @Test
    public void UserProfileJurisdictionUserClickOnLogoutButton() {

        login(ukJurisdictionOperatorName, ukJurisdictionOperatorPassword);
        directionWithHamburgerMenu(userProfilePage.hamburgerName());
        clickTheButton("Logout");
        urlIsAssert(loginPage.url());

    }

    @Test
    public void UserProfileJurisdictionUserClickOnBackButtonAfterLogin() {

        login(ukJurisdictionOperatorName, ukJurisdictionOperatorPassword);
        directionWithHamburgerMenu(userProfilePage.hamburgerName());
        clickTheButton("Back");
        urlIsAssert(touchCentral.url());

    }

    @Ignore
    @Test(description = "This test is not working")
    public void clickOnBackButtonFromAnotherPage() {

        login(testUserName, testUserPassword);

    }

    @Test
    public void userProfileHamburgerLogout() {

        login(ukJurisdictionOperatorName, ukJurisdictionOperatorPassword);
        directionWithHamburgerMenu(userProfilePage.hamburgerName());
        hamburgerLogout();
        Assert.assertEquals(driver.getCurrentUrl(), loginPage.url());

    }

    @AfterMethod(description = "Close the browser after each test")
    public void closeBrowser() {

        driver.close();

    }

}
