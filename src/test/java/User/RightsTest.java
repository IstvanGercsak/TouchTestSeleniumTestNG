package User;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RightsTest extends RightsTestDriver {


    @BeforeMethod(description = "open browser before each test")
    public void start() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(TestLoginPageURL);

    }

    @Test(description = "Login with admin")
    public void loginWithAdmin() {
        login(AdminUserName, AdminUserPassword);
    }

    @Test(description = "Login with Touchpoint administrator")
    public void loginWithTouchpointUser() {
        login(UKJurisdictionOperatorName, UKJurisdictionOperatorPassword);
    }


    @Test(description = "I can reach every page with admin permission - (Regression and Smoke)")
    public void reachPagesWithAdmin() {

        login(AdminUserName, AdminUserPassword);
        clickOnTheHamburgeMenuDropdown();
        clickOnTheHamburgerMenuElement(HamburgerDashboardName);
//        clickOnTheHamburgeMenuDropdown();
//        clickOnTheHamburgerMenuElement(HamburgerTouchCentralActions);
//        clickOnTheHamburgeMenuDropdown();
//        clickOnTheHamburgerMenuElement(HamburgerUserProfile);
//        clickOnTheHamburgeMenuDropdown();
//        clickOnTheHamburgerMenuElement(HamburgerAboutTouch);
//        clickOnTheHamburgeMenuDropdown();
//        clickOnTheHamburgerMenuElement(HamburgerLogout);

    }

    @Test(description = "I can reach every page with admin permission")
    public void reachPagesWithTouchUser() {
        login(UKJurisdictionOperatorName, UKJurisdictionOperatorPassword);
    }

    @AfterMethod(description = "Close the browser after each test")
    public void closebrowser() {
        driver.close();
    }
}


