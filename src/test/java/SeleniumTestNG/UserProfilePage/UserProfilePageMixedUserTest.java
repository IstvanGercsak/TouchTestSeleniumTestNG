package SeleniumTestNG.UserProfilePage;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class UserProfilePageMixedUserTest extends UserProfilePageTestDriver {

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

    /*From thee test we can create smoke test with different users*/

    @Test
    public void UserProfileMixedUserPageIsAvailable() {

        login(testUserName, testUserPassword);
        directionWithHamburgerMenu(userProfilePage.hamburgerName());
        Assert.assertEquals(driver.getCurrentUrl(), userProfilePage.url());

    }

    @Test
    public void UserProfileMixedUserHamburgerMenuElementsAreAvailable() {

        login(testUserName, testUserPassword);
        directionWithHamburgerMenu(userProfilePage.hamburgerName());
        clickOnHamburgermenu();
        hamburgerMenuElementsIsClickable();

    }

    @Test
    public void UserProfileMixedUserMetLifeIconDirection() {

        login(testUserName, testUserPassword);
        directionWithHamburgerMenu(userProfilePage.hamburgerName());
        clickOnTheMetlifeIcon();
        Assert.assertEquals(driver.getCurrentUrl(), touchCentral.url());

    }

    @Test
    public void UserProfileMixedUserUserIconDirection() {

        login(testUserName, testUserPassword);
        directionWithHamburgerMenu(userProfilePage.hamburgerName());
        clickOnProfileIcon();
        urlIsAssert(userProfilePage.url());

    }

    @Test
    public void UserProfileMixedUserTestBreadcrumb() {

        login(testUserName, testUserPassword);
        directionWithHamburgerMenu(userProfilePage.hamburgerName());
        assertBreadcrumbs(userProfilePage.breadcrumb());

    }

    @Test
    public void UserProfileMixedUserPermissionsAreVisibleAsAdmin() {

        login(testUserName, testUserPassword);
        directionWithHamburgerMenu(userProfilePage.hamburgerName());
        assertTextOn("Central Admin", true);
        assertTextOn("UK Jurisdiction Operator", true);

    }

    @Test
    public void UserProfileMixedUserClickOnLogoutButton() {

        login(testUserName, testUserPassword);
        directionWithHamburgerMenu(userProfilePage.hamburgerName());
        clickTheButton("Logout");
        urlIsAssert(loginPage.url());

    }

    @Test
    public void UserProfileMixedUserClickOnBackButtonAfterLogin() {

        login(testUserName, testUserPassword);
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

        login(testUserName, testUserPassword);
        directionWithHamburgerMenu(userProfilePage.hamburgerName());
        hamburgerLogout();
        Assert.assertEquals(driver.getCurrentUrl(), loginPage.url());

    }

    @AfterMethod(description = "Close the browser after each test")
    public void closeBrowser() {

        driver.close();

    }

}
