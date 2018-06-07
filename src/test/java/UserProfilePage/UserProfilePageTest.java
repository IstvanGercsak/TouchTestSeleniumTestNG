package UserProfilePage;

import LoginPage.LoginPageTestDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserProfilePageTest extends LoginPageTestDriver {

    @BeforeMethod(description = "Open browser before each test!")
    public void start() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(LoginTestPageURL);

    }

    @Test
    public void pageIsAvailable() {
        login(adminUserName, adminUserPassword);
        Assert.assertEquals(driver.getCurrentUrl(),userProfileURL);
    }

    @Test
    public void UserProfileHamburgerMenuElementsAreAvailable() {
        login(adminUserName, adminUserPassword);
    }

    @Test
    public void UserProfileMetlifeIcondirection() {
        login(adminUserName, adminUserPassword);
    }

    @Test
    public void UserProfileUserIcondirection() {
        login(adminUserName, adminUserPassword);
    }

    @Test
    public void UserProfileTestBreadctumbs() {
        login(adminUserName, adminUserPassword);
    }

    @Test
    public void permissionsAreVisibleAsAdmin() {
        login(adminUserName, adminUserPassword);
    }

    @Test
    public void permissionIsVisibleAsAdmin() {
        login(adminUserName, adminUserPassword);
    }

    @Test
    public void permissionIsVisibleAsJurisdiction() {
        login(adminUserName, adminUserPassword);
    }

    @Test
    public void clickOnLogoutButton() {
        login(adminUserName, adminUserPassword);
    }

    @Test
    public void clickOnBackButtonAfterLogin() {
        login(adminUserName, adminUserPassword);
    }


    @Test
    public void clickOnBackButtonFromAnotherPage() {
        login(adminUserName, adminUserPassword);
    }

    @AfterMethod(description = "Close the browser after each test")
    public void closebrowser() {
        driver.close();
    }

}
