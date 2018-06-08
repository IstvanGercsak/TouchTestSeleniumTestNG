package UserProfilePage;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class UserProfilePageAdminUserTest extends UserProfilePageTestDriver {

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
    public void pageIsAvailable() {

        login(adminUserName, adminUserPassword);
        directionWithHamburgerMenu(userProfilePage.hamburgerName());
        Assert.assertEquals(driver.getCurrentUrl(), userProfilePage.url());

    }

    @Test
    public void UserProfileHamburgerMenuElementsAreAvailable() {

        login(adminUserName, adminUserPassword);
        directionWithHamburgerMenu(userProfilePage.hamburgerName());
        clickOnHamburgermenu();
        hamburgerMenuElementsIsClickable();

    }

    @Test
    public void UserProfileMetLifeIconDirection() {

        login(adminUserName, adminUserPassword);
        directionWithHamburgerMenu(userProfilePage.hamburgerName());
        clickOnTheMetlifeIcon();
        Assert.assertEquals(driver.getCurrentUrl(), touchCentral.url());

    }

    @Test
    public void UserProfileUserIconDirection() {

        login(adminUserName, adminUserPassword);
        directionWithHamburgerMenu(userProfilePage.hamburgerName());
        clickOnProfileIcon();
        urlIsAssert(userProfilePage.url());

    }

    @Test
    public void UserProfileTestBreadcrumb() {

        login(adminUserName, adminUserPassword);
        directionWithHamburgerMenu(userProfilePage.hamburgerName());
        assertBreadcrumbs(userProfilePage.hamburgerName());

    }

    @Test
    public void permissionIsVisibleAsAdmin() {

        login(adminUserName, adminUserPassword);
        directionWithHamburgerMenu(userProfilePage.hamburgerName());
        assertTextOn("Central Admin", true);
        assertTextOn("UK Jurisdiction Operator", false);

    }

    @Test
    public void clickOnLogoutButton() {

        login(adminUserName, adminUserPassword);
        directionWithHamburgerMenu(userProfilePage.hamburgerName());
        clickTheButton("Logout");
        urlIsAssert(loginPage.url());

    }

    @Test
    public void clickOnBackButtonAfterLogin() {

        login(adminUserName, adminUserPassword);
        directionWithHamburgerMenu(userProfilePage.hamburgerName());
        clickTheButton("Back");
        urlIsAssert(touchCentral.url());

    }

    @Ignore
    @Test(description = "This test is not working")
    public void clickOnBackButtonFromAnotherPage() {

        login(testUserName, testUserPassword);

    }

    @AfterMethod(description = "Close the browser after each test")
    public void closeBrowser() {

        driver.close();

    }

}
